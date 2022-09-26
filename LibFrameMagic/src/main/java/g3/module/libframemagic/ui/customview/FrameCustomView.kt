package g3.module.libframemagic.ui.customview

import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import g3.module.libcheckinternet.network.AppExecutors
import g3.module.libcheckinternet.network.NetworkConnectivity
import g3.module.libclickanim.clickutils.LibClickAnimUtils
import g3.module.libclickanim.clickutils.OnCustomClickListener
import g3.module.libframemagic.R
import g3.module.libframemagic.adapter.FolderFrameAdapter
import g3.module.libframemagic.adapter.ItemFrameAdapter
import g3.module.libframemagic.appinterface.OnListenerFrameView
import g3.module.libframemagic.apputils.FrameAppUtils
import g3.module.libframemagic.entities.FolderFrameModel
import g3.module.libframemagic.entities.ItemFrameModel
import g3.module.libframemagic.retrofit.remote.DataFactory
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.mg_frame_layout_main.view.*
import kotlinx.android.synthetic.main.mg_frame_layout_rcv.view.*
import kotlinx.android.synthetic.main.mg_frame_layout_toolbar.view.*
import kotlinx.android.synthetic.main.mp_frame_item_none_effect.view.*

class FrameCustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr) {
    private var mWidthScreen = 0
    private var mHeightScreen = 0
    private var mBaseUrl = ""
    private var mUrlFrame = ""
    private var mListFolderFrame = ArrayList<FolderFrameModel>()
    private var mListFrameItem = ArrayList<ItemFrameModel>()
    private var mOnListenerFrameView: OnListenerFrameView? = null
    private var mFolderFrameAdapter: FolderFrameAdapter? = null
    private var mItemFrameAdapter: ItemFrameAdapter? = null
    private var mPositionFolder = -1
    private var mBitmapBg: Bitmap? = null
    private var mPosition = -1

    init {
        LayoutInflater.from(context).inflate(R.layout.mg_frame_layout_main, this, true)
        onClickApply()
        initViewRcv()
        onClickNone()
    }


    /**
     *
     */
    private fun onClickApply() {
        LibClickAnimUtils.setOnCustomTouchViewScale(mgMagicIvCancel, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
                mOnListenerFrameView!!.onClickCancel()

            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScale(mgMagicIvTick, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
                if (mPosition == -1) {
                    mOnListenerFrameView!!.onClickCancel()
                } else {
                    var bitmap = mgTouchView.genBitmapBg()
                    var bitmapFrame = mgFrameViewDraw.genBitmapFrame(bitmap)
                    resetView()
                    mOnListenerFrameView!!.onClickApply(bitmapFrame)
                }

            }
        })
    }

    /**
     *
     */
    fun setBitmapOrigin(bitmap: Bitmap, width: Int, height: Int) {
        resetViewFrame()
        this.mBitmapBg = bitmap
        this.mWidthScreen = width
        this.mHeightScreen = height
        mgFrameViewDraw.setWidthHeightScreen(mWidthScreen, mHeightScreen)
        FrameAppUtils().resizeViewByPixel(mgTouchView, mWidthScreen, mHeightScreen)
        mgTouchView.setSizeView(mWidthScreen.toFloat(), mHeightScreen.toFloat())
        mgTouchView.setBitmap(mBitmapBg!!)
        mgTouchView.setCheckShowBitmap(true)
    }

    /**
     *
     */
    fun setListener(listener: OnListenerFrameView) {
        this.mOnListenerFrameView = listener
    }


    /**
     *
     */
    private fun initViewRcv() {
        mFolderFrameAdapter = FolderFrameAdapter(mListFolderFrame)
        mFolderFrameAdapter!!.setOnFolderClick(object : FolderFrameAdapter.FolderFrameAdapterListener {
            override fun onClickFolder(position: Int, item: String) {
                scrollRcvFolder(position)
                mFolderFrameAdapter!!.setPositionSellected(position)
                mFolderFrameAdapter!!.notifyDataSetChanged()
            }
        })
        mgFrameRcvFolderFrame.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        mgFrameRcvFolderFrame.adapter = mFolderFrameAdapter

        mItemFrameAdapter = ItemFrameAdapter(mListFrameItem)
        mItemFrameAdapter!!.setOnItemClick(object : ItemFrameAdapter.ItemFrameAdapterListener {
            override fun onClickItem(position: Int, url: String) {
                mFolderFrameAdapter!!.setPositionSellected(position)
                mPositionFolder = position
                mPosition = position
                setBitmapFrame(url)
                deSelectBtnNone()
            }

            override fun scrollRcv(position: Int) {
                if (mPositionFolder != position) {
                    mFolderFrameAdapter!!.setPositionSellected(position)
                    mgFrameRcvFolderFrame.scrollToPosition(position)
                    mPositionFolder = position
                }
            }

        })
        mpFrameRcvItemFrame.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        mpFrameRcvItemFrame.adapter = mItemFrameAdapter

    }


    /**
     *
     */
    fun setUrlFrame(baseUrl: String, urlFrame: String) {
        this.mBaseUrl = baseUrl
        this.mUrlFrame = urlFrame
        getDataFrame()
    }

    /**
     *
     */
    private fun getDataFrame() {
        val networkConnectivity = NetworkConnectivity(AppExecutors(), (context as Activity))
        networkConnectivity.checkInternetConnection { isConnected: Boolean ->
            (context as Activity).runOnUiThread {
                if (isConnected) {
                    val compositeDisposable = CompositeDisposable()
                    DataFactory().getDataApiSkyResponse(
                        compositeDisposable,
                        mBaseUrl,
                        mUrlFrame,
                        { ListFolder, ListFrameItem ->
                            mListFolderFrame.addAll(ListFolder)
                            mListFrameItem.addAll(ListFrameItem)
                            mFolderFrameAdapter!!.notifyDataSetChanged()
                            (context as Activity).runOnUiThread {
                                FrameAppUtils().fadeOutView(mgFrameProgressBarLoading)
                            }
                        }, {
                            Toast.makeText(context, context.resources.getString(R.string.general_util_no_internet), Toast.LENGTH_SHORT).show()
                            //error
                        }
                    )
                } else {
                    (context as Activity).runOnUiThread {
                        FrameAppUtils().fadeOutView(mgFrameProgressBarLoading)
                    }
                    Toast.makeText(context, context.resources.getString(R.string.general_util_no_internet), Toast.LENGTH_SHORT).show()
                }
            }
        }

    }


    /**
     *
     */
    private fun setBitmapFrame(urlFrame: String) {

        Glide.with(this)
            .asBitmap()
            .load(urlFrame)
            .into(object : CustomTarget<Bitmap>() {
                override fun onResourceReady(
                    resource: Bitmap,
                    transition: Transition<in Bitmap>?
                ) {
                    mgFrameViewDraw.setEnableDraw(true)
                    mgFrameViewDraw.setBitmapFrame(resource)
                    { bitmapSuccess, width, height ->
                        Log.e("TAG", "onResourceReady: $width + $height")
                        FrameAppUtils().resizeViewByPixel(mgTouchView, width, height)
                        mgTouchView.setSizeView(width.toFloat(), height.toFloat())
                    }
                }

                override fun onLoadCleared(placeholder: Drawable?) {
                }
            })
    }

    /**
     * resetView
     */

    private fun resetView() {
        selectBtnNone()
        mPosition = -1
        mgFrameViewDraw.setEnableDraw(false)
        if (mBitmapBg != null) {
            mgFrameViewDraw.setWidthHeightScreen(mWidthScreen, mHeightScreen)
            FrameAppUtils().resizeViewByPixel(mgTouchView, mWidthScreen, mHeightScreen)
            mgTouchView.setSizeView(mWidthScreen.toFloat(), mHeightScreen.toFloat())
            mgTouchView.setBitmap(mBitmapBg!!)
            mFolderFrameAdapter!!.setPositionSellected(-1)
            mItemFrameAdapter!!.resetView()
            mgFrameRcvFolderFrame.scrollToPosition(0)
            mpFrameRcvItemFrame.scrollToPosition(0)
        }

    }

    /**
     *
     */
    private fun onClickNone() {
        LibClickAnimUtils.setOnCustomTouchViewScale(mpFrameItemLayoutActionNone, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
                resetView()
                selectBtnNone()
            }
        })
    }

    private fun selectBtnNone() {
        mpFrameItemLayoutActionNone?.isSelected = true
    }

    private fun deSelectBtnNone() {
        mpFrameItemLayoutActionNone?.isSelected = false
    }

    /**
     *
     */
    private fun scrollRcvFolder(pos: Int) {
        mgFrameRcvFolderFrame.scrollToPosition(pos)
        for (i in 0 until mListFrameItem.size) {
            if (mListFrameItem[i].posParent == pos) {
                mpFrameRcvItemFrame.scrollToPosition(i + 7)
                break
            }
        }
    }

    /**
     *
     */
    private fun resetViewFrame() {
        mgTouchView.resetView()
        mgTouchView.setCheckShowBitmap(false)
        resetView()
    }


}