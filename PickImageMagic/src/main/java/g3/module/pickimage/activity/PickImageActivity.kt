package g3.module.pickimage.activity

import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.github.florent37.viewanimator.ViewAnimator
import com.orhanobut.hawk.Hawk
import g3.module.medialoader.MediaLoader
import g3.module.medialoader.bean.PhotoItem
import g3.module.medialoader.bean.PhotoResult
import g3.module.medialoader.callback.OnPhotoLoaderCallBack
import g3.module.permissionutils.utils.*
import g3.module.pickimage.R
import g3.module.pickimage.adapter.FolderAdapter
import g3.module.pickimage.adapter.ImageAdapter
import g3.module.pickimage.adapter.ImageSaveAdapter
import g3.module.pickimage.appinterface.OnCustomClickListener
import g3.module.pickimage.appinterface.PickImageClickInterface
import g3.module.pickimage.entities.CacheImageFolder
import g3.module.pickimage.entities.MyImageModel
import g3.module.pickimage.entities.MyPhotoFolderModel
import g3.module.pickimage.utils.ImageConstants
import g3.module.pickimage.utils.ImageUtil
import g3.module.pickimage.utils.UtilsLibAnimKotlin
import kotlinx.android.synthetic.main.layout_list_folder.*
import kotlinx.android.synthetic.main.layout_pickimage_activity_main.*

open class PickImageActivity : AppCompatActivity() {
    private var mImageAdapter: ImageAdapter? = null
    private var mFolderAdapter: FolderAdapter? = null
    private var mSaveImageAdapter: ImageSaveAdapter? = null
    private var mListImage = ArrayList<MyImageModel>()
    private var mListAllFolder = ArrayList<MyPhotoFolderModel>()
    private val mListSaveImage = ArrayList<MyImageModel>()
    private var mListImageOfFolder = ArrayList<MyImageModel>()
    private var mListCache = ArrayList<CacheImageFolder>()


    private var mPickImageClickInterface: PickImageClickInterface? = null
    private var mPosFolder = -1
    private var mImageUri: Uri? = null

    private var mIsStartAnimation = false

    private var CODE_PERMISSION = PermissionConstants.REQUEST_CODE_PERMISSION_STORAGE
    private var LIST_PERMISSION = PermissionConstants.listPermissionsStorage
    private var mIntentFromSelectImage: String? = null
    private var mNameFolderSelect = ""
    private var mListPathImage = ArrayList<String>()
    private var mNumberMaxImages = 9
    private var mustPickAllImage = false

    companion object {
        const val REQUEST_TAKE_PICTURE_MANAGER = 234
        const val REQUEST_PICK_IMAGE = 110
        const val REQUEST_PICK_IMAGE_BODY = 111
        const val KEY_GET_IMAGE = "KEY_GET_IMAGE"
        const val KEY_PICK_IMAGE = "KEY_PICK_IMAGE"
        const val KEY_NUMBER_IMAGE = "KEY_NUMBER_IMAGE" // Key max number image selected
        const val PICK_A_PHOTO = "PICK_A_PHOTO"
        const val MUST_PICK_ALL_IMAGE =
            "MUST_PICK_ALL_IMAGE" // Key này phải chọn đủ ảnh bằng số maxNumber thì mới được start.
        const val PICK_MULTIPLE_PHOTO = "PICK_MULTIPLE_PHOTO"

        fun clearCache(){
            Hawk.put(ImageConstants.LIST_IMAGE,ArrayList<CacheImageFolder>())
        }

    }

    fun hideAds() {
        mgLayoutAds.visibility = View.GONE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        mNumberMaxImages = 9
        setContentView(R.layout.layout_pickimage_activity_main)
        mgLayoutLoading.visibility = View.VISIBLE
        Hawk.init(this).build()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestMultiplePermissionWithListener(CODE_PERMISSION, LIST_PERMISSION)
        }
        onClick()
    }

    private fun onClick() {
        UtilsLibAnimKotlin.setOnCustomTouchViewScaleNotOther(
            mgImageLayoutAllFolder,
            object : OnCustomClickListener {
                override fun onCustomClick(v: View?, event: MotionEvent?) {
                    if (!mIsStartAnimation) {
                        visibleListFolderVertical()
                        mgImageIvArrow.rotation = 180f
                    }
                }
            })

        UtilsLibAnimKotlin.setOnCustomTouchViewScaleNotOther(
            mgImageImgCamera,
            object : OnCustomClickListener {
                @RequiresApi(Build.VERSION_CODES.M)
                override fun onCustomClick(v: View?, event: MotionEvent?) {
                    CODE_PERMISSION = PermissionConstants.REQUEST_CODE_PERMISSION_CAMERA
                    LIST_PERMISSION = PermissionConstants.listPermissionsCamera
                    requestMultiplePermissionWithListener(CODE_PERMISSION, LIST_PERMISSION)
                }
            })

        UtilsLibAnimKotlin.setOnCustomTouchViewScaleNotOther(
            mgImageImgBack,
            object : OnCustomClickListener {
                override fun onCustomClick(v: View?, event: MotionEvent?) {
                    finish()
                }
            })


        UtilsLibAnimKotlin.setOnCustomTouchViewScaleNotOther(
            mgTvClearAll,
            object : OnCustomClickListener {
                override fun onCustomClick(v: View?, event: MotionEvent?) {
                    mListSaveImage.clear()
                    mSaveImageAdapter?.notifyDataSetChanged()
                    showListSave()
                }
            })


        UtilsLibAnimKotlin.setOnCustomTouchViewScaleNotOther(
            mgLayoutStart,
            object : OnCustomClickListener {
                override fun onCustomClick(v: View?, event: MotionEvent?) {
                    if (mustPickAllImage
                        && mListSaveImage.size < mNumberMaxImages) {
                        showToastMessage(
                            String.format(
                                getString(R.string.txt_should_pick_max_image),
                                mNumberMaxImages
                            )
                        )
                    } else {
                        donePickImage()
                    }

                }
            })

        mgImageViewBlurred.setOnClickListener {
            if (!mIsStartAnimation) {
                goneListFolderVertical()
            }

        }
        mgLayoutSelectCollage.setOnClickListener {
            ViewAnimator.animate(mgLayoutSelectCollage).scale(0.8f,1f).duration(100).start()
            mPickImageClickInterface?.onClickSelectCollage()
        }

    }

    private fun donePickImage() {
        //mPickImageClickInterface?.onClickSelectMultiple(mListSaveImage)
        for (listImage in mListSaveImage) {
            mListPathImage.add(listImage.pathImage!!)
        }
        doneCollage(mListPathImage)
    }

    private fun showToastMessage(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }

    private fun initView() {
        loadDataFolder()
        if (intent.hasExtra(KEY_PICK_IMAGE)) {
            mIntentFromSelectImage = intent.getStringExtra(KEY_PICK_IMAGE)
        }

        if (intent.hasExtra(KEY_NUMBER_IMAGE)) {
            mNumberMaxImages = intent.getIntExtra(KEY_NUMBER_IMAGE, 1)
        }

        if (intent.hasExtra(MUST_PICK_ALL_IMAGE)) {
            mustPickAllImage = intent.getBooleanExtra(MUST_PICK_ALL_IMAGE, false)
        }

        mListCache = Hawk.get(ImageConstants.LIST_IMAGE, ArrayList())

        if (!mListCache.isNullOrEmpty()) {
            mListImage.clear()
            mgImageTvName.text = mListCache[mListCache.size - 1].mNameFolder
            mListImage.addAll(mListCache[mListCache.size - 1].mListImageCache)
            mgLayoutLoading.visibility = View.GONE
        } else {
            loadDataImage()
        }
        initViewImageAdapter()
        initViewListFolder()
        initSaveAdapter()
        loadDataSaveImage()
        if (mIntentFromSelectImage == PICK_A_PHOTO) {
            hideLayoutMaxImage()
        } else {
            showLayoutMaxImage()
        }
    }

    private fun initViewListFolder() {
        mFolderAdapter = FolderAdapter(mListAllFolder) { position ->
            goneListFolderVertical()
            if (mPosFolder != position) {
                mPosFolder = position
                mListImage.clear()
                mListImageOfFolder.clear()
                mgImageRcvImage.smoothScrollToPosition(0)
                if (mListAllFolder[position].name != null) {
                    mgImageTvName.text = mListAllFolder[position].name.toString()
                    mNameFolderSelect = mListAllFolder[position].name.toString()
                } else {
                    mgImageTvName.text = ""
                }

                for (j in 0 until mListAllFolder[position].items.size) {
                    val itemPhoto = MyImageModel(
                        position, ("" + position + "_" + mListAllFolder[position].name),
                        mListAllFolder[position].items[j].path
                    )
                    mListImage.add(itemPhoto)
                }
                mListCache.add(
                    CacheImageFolder(
                        mListAllFolder[position].name,
                        position,
                        mListImage
                    )
                )
                Hawk.put(ImageConstants.LIST_IMAGE, mListCache)
//                showTextNoImage()
                mImageAdapter?.notifyDataSetChanged()
                mFolderAdapter?.notifyDataSetChanged()
            }
        }
        mgImageRcvListFolder.adapter = mFolderAdapter
    }


    private fun initViewImageAdapter() {
        mImageAdapter = ImageAdapter(mListImage) { path, postion ->
            when (mIntentFromSelectImage) {
                PICK_A_PHOTO -> {
                    mListPathImage.add(path.pathImage!!)
                    doneCollage(mListPathImage)
                }
                PICK_MULTIPLE_PHOTO -> {
                    if (mListSaveImage.size >= mNumberMaxImages) {
                        Toast.makeText(
                            this,
                            String.format(
                                resources.getString(R.string.string_warning),
                                mNumberMaxImages.toString()
                            ),
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        mListSaveImage.add(path)
                        mgImageRcvSave.smoothScrollToPosition(mListSaveImage.size)
                        showListSave()
                        mgTvSelectSize.text = (mListSaveImage.size).toString()
                        mSaveImageAdapter?.notifyDataSetChanged()
                    }
                }

            }

        }

        mgImageRcvImage.adapter = mImageAdapter
        mImageAdapter?.notifyDataSetChanged()
    }

    private fun loadDataImage() {
        MediaLoader.getLoader().loadPhotos(this, object : OnPhotoLoaderCallBack() {
            override fun onResult(result: PhotoResult?) {
                mListImage.clear()
                result?.let {
                    // image
                    for (i in 0 until mListAllFolder.size) {
                        for (j in 0 until mListAllFolder[i].items.size) {
                            mListImage.add(
                                MyImageModel(
                                    i,
                                    ("" + i + "_" + mListAllFolder[i].name),
                                    mListAllFolder[i].items[j].path
                                )
                            )
                        }
                    }
                    if (mListImage.size > 0) {
                        showTextNoImage()
                        mgLayoutLoading.visibility = View.GONE
                    }
                    mImageAdapter?.notifyDataSetChanged()
                    // image folder
                }

            }
        })
    }

    /**
     * load data folder
     */
    fun loadDataFolder() {
        MediaLoader.getLoader().loadPhotos(this, object : OnPhotoLoaderCallBack() {
            override fun onResult(result: PhotoResult?) {
                mListAllFolder.clear()
                result?.let {
                    //folder
                    for (item in result.folders) {
                        val myResult = MyPhotoFolderModel()
                        val arrayPhotoGet = item.items
                        val arrayPhotoResult = ArrayList<PhotoItem>()
                        for (photo in arrayPhotoGet) {
                            if (!photo.path.contains(".gif")) {
                                arrayPhotoResult.add(photo)
                            }
                        }
                        if (arrayPhotoResult.size > 0) {
                            for (i in 0 until arrayPhotoResult.size) {
                                myResult.items.add(arrayPhotoResult[i])
                            }
                            myResult.cover = item.cover
                            myResult.name = item.name
                            mListAllFolder.add(myResult)
                        }
                    }
                    val modelAll = MyPhotoFolderModel()
                    modelAll.name = getString(R.string.allimage)
                    for (i in mListAllFolder) {
                        modelAll.items.addAll(i.items)
                    }
                    mListAllFolder.add(0, modelAll)
                    mFolderAdapter?.notifyDataSetChanged()
                }
            }
        })
    }

    private fun initSaveAdapter() {
        mSaveImageAdapter = ImageSaveAdapter(mListSaveImage) { position, item ->
            mListSaveImage.removeAt(position)
            mSaveImageAdapter?.notifyDataSetChanged()
            mgTvSelectSize.text = mListSaveImage.size.toString()
            showListSave()


        }
        mgImageRcvSave.adapter = mSaveImageAdapter
    }

    private fun loadDataSaveImage() {
        mSaveImageAdapter?.notifyItemChanged(mListSaveImage.size - 1)
    }

    private fun showTextNoImage() {
        if (mListImage.size == 0) {
            mgImageTvNoImage.visibility = View.VISIBLE
        } else
            mgImageTvNoImage.visibility = View.GONE
        mgLayoutLoading.visibility = View.GONE
    }

    private fun visibleListFolderVertical() {
        mIsStartAnimation = true
        mgImageLayoutListFolderImageVertical.visibility = View.VISIBLE
        ViewAnimator.animate(mgImageLayoutContainRcv)
            .translationY(1500f, 0f)
            .duration(500)
            .onStop { mIsStartAnimation = false }
            .start()
        mgImageViewBlurred.visibility = View.VISIBLE
        mgLayoutSelectCollage.visibility = View.GONE
        ViewAnimator.animate(mgImageViewBlurred).alpha(0f, 0.5f).duration(300).start()
    }

    private fun goneListFolderVertical() {
        mIsStartAnimation = true

        mgImageIvArrow.rotation = 0f
        ViewAnimator.animate(mgImageLayoutContainRcv)
            .translationY(0f, 1500f)
            .duration(300).start()
            .onStop { mIsStartAnimation = false }
//        mgLayoutSelectCollage.visibility = View.VISIBLE
        ViewAnimator.animate(mgImageViewBlurred).alpha(0.5f, 0f).duration(300).start()
        Handler(Looper.getMainLooper()).postDelayed({
            mgImageLayoutListFolderImageVertical.visibility = View.GONE
        }, 300)

    }

    fun openCamera() {
        val values = ContentValues()
        values.put(MediaStore.Images.Media.TITLE, "MyPicture")
        values.put(
            MediaStore.Images.Media.DESCRIPTION,
            "Photo taken on " + System.currentTimeMillis()
        )
        mImageUri =
            this.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, mImageUri)
        startActivityForResult(cameraIntent, REQUEST_TAKE_PICTURE_MANAGER)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun requestMultiplePermissionWithListener(
        requestCode: Int,
        permissions: Array<String>
    ) {
        requestPermissionsActivity(
            permissions,
            requestCode,
            object : RequestPermissionListener {
                override fun onPermissionRationaleShouldBeShown(requestPermission: () -> Unit) {
                    PermissionAppUtils.showDialogAllow(this@PickImageActivity, {
                        requestPermission.invoke()
                    }, {
                    })
                }

                override fun onPermissionPermanentlyDenied(openAppSetting: () -> Unit) {
                    PermissionAppUtils.showDialogDenied(this@PickImageActivity, {
                        openAppSetting.invoke()
                    }, {
                    })
                }

                override fun onPermissionGranted() {
                    if (CODE_PERMISSION == PermissionConstants.REQUEST_CODE_PERMISSION_STORAGE) {
                        initView()
                    } else {
                        openCamera()
                    }
                }
            })
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        // multiple permission
        handleOnRequestPermissionResult(
            CODE_PERMISSION,
            requestCode,
            permissions,
            grantResults,
            object : PermissionResultListener {
                override fun onPermissionRationaleShouldBeShown() {
                }

                override fun onPermissionPermanentlyDenied() {
                }

                override fun onPermissionGranted() {
                    if (CODE_PERMISSION == PermissionConstants.REQUEST_CODE_PERMISSION_STORAGE) {
                        initView()
                    } else {
                        openCamera()
                    }
                }
            }
        )
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == REQUEST_TAKE_PICTURE_MANAGER) {
                try {
                    val recordedImagePath: String = ImageUtil().getPath(this, mImageUri!!)!!
                    val myImageModel =
                        MyImageModel(0, System.currentTimeMillis().toString(), recordedImagePath)
                    mListPathImage.add(myImageModel.pathImage!!)
                    doneCollage(mListPathImage)
                    mPickImageClickInterface?.onClickSelect(myImageModel)
                } catch (e: java.lang.Exception) {
                    Log.e("TAG", " Crash  REQUEST_TAKE_PICTURE_MANAGER $e")
                }
            }

            if (requestCode == PermissionConstants.REQUEST_CODE_SETTING) {
                requestMultiplePermissionWithListener(CODE_PERMISSION, LIST_PERMISSION)
            }
        }
    }


    private fun showListSave() {
        if (mListSaveImage.size > 0) {
            mgLayoutViewSave.visibility = View.VISIBLE
            hideLayoutMaxImage()
        } else {
            showLayoutMaxImage()
            mgLayoutViewSave.visibility = View.GONE
        }
    }

    private fun hideLayoutMaxImage() {
        mgLayoutWaringSelectPhoto.visibility = View.GONE
    }

    private fun showLayoutMaxImage() {
        mgLayoutWaringSelectPhoto.visibility = View.VISIBLE
        txtPickImageMaxImage.text = String.format(
            resources.getString(R.string.string_please_choose_from_1_to_9_photos),
            mNumberMaxImages
        )
    }

    override fun onBackPressed() {
        if (mgImageLayoutListFolderImageVertical.visibility == View.VISIBLE) {
            goneListFolderVertical()
        } else {
            finish()
        }
    }

    private fun doneCollage(listString: ArrayList<String>) {
        val mIntent = Intent()
        setResult(RESULT_OK, mIntent)
        mIntent.putStringArrayListExtra(KEY_GET_IMAGE, listString)
        finish()
    }
}