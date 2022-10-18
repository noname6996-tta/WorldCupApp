package com.task.ui.component.login

//import com.task.ui.component.frames.BeautyMagicActivity
//import com.task.ui.component.frames.DirectPickImageActivity
//import g3.module.libclickanim.clickutils.UtilsAnimation
import URIPathHelper
import android.Manifest
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.LiveData
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import com.permissionx.guolindev.PermissionX
import com.task.data.Resource
import com.task.data.dto.login.LoginResponse
import com.task.databinding.LoginActivityBinding
import com.task.ui.base.BaseActivity
import com.task.ui.component.BeautyActivity
import com.task.ui.component.recipes.RecipesListActivity
import com.task.utils.*
import dagger.hilt.android.AndroidEntryPoint
import g3.module.libframemagic.appinterface.OnListenerFrameView
import gun0912.tedimagepicker.builder.TedRxImagePicker
import kotlinx.android.synthetic.main.activity_beauty_magic.*

/**
 * Created by AhmedEltaher
 */
@AndroidEntryPoint
class LoginActivity : BaseActivity() {

    private val loginViewModel: LoginViewModel by viewModels()
    private lateinit var binding: LoginActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.login.setOnClickListener { doLogin() }
        action()
    }

    override fun initViewBinding() {
        binding = LoginActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun observeViewModel() {
        observe(loginViewModel.loginLiveData, ::handleLoginResult)
        observeSnackBarMessages(loginViewModel.showSnackBar)
        observeToast(loginViewModel.showToast)
    }

    private fun doLogin() {
//        pickImages(PickImageActivity.PICK_A_PHOTO)
//        loginViewModel.doLogin(
//            binding.username.text.trim().toString(),
//            binding.password.text.toString()
//        )
        Log.e("TAG", "doLogin: " )
checkPermission()
//        TedRxImagePicker.with(this)
//            .start()
//            .subscribe(this::showSingleImage, Throwable::printStackTrace)
    }
    private fun showSingleImage(uri: Uri) {
        Log.e("TAG", "showSingleImage: "+ uri )
        Glide.with(this).load(uri).into(binding.ivImage)
        URIPathHelper().getPath(this, uri)?.let { startBeautyActivity(it) }

    }
    private fun handleLoginResult(status: Resource<LoginResponse>) {
        when (status) {
            is Resource.Loading -> binding.loaderView.toVisible()
            is Resource.Success -> status.data?.let {
                binding.loaderView.toGone()
                navigateToMainScreen()
            }
            is Resource.DataError -> {
                binding.loaderView.toGone()
                status.errorCode?.let { loginViewModel.showToastMessage(it) }
            }
        }
    }

    private fun navigateToMainScreen() {
        val nextScreenIntent = Intent(this, RecipesListActivity::class.java)
        startActivity(nextScreenIntent)
        finish()
    }

    private fun observeSnackBarMessages(event: LiveData<SingleEvent<Any>>) {
        binding.root.setupSnackbar(this, event, Snackbar.LENGTH_LONG)
    }

    private fun observeToast(event: LiveData<SingleEvent<Any>>) {
        binding.root.showToast(this, event, Snackbar.LENGTH_LONG)
    }


    /**
     * test pick image
     */
    private fun pickImages(action: String) {
//        val mIntent = Intent(this, DirectPickImageActivity::class.java)
//        mIntent.putExtra(PickImageActivity.KEY_PICK_IMAGE, action)
//        startActivityForResult(mIntent, PickImageActivity.REQUEST_PICK_IMAGE)
    }

    /**
     *
     */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK) {
        }
    }

    private fun startBeautyActivity(path: String) {
        val intent = Intent(this, BeautyActivity::class.java)
        intent.putExtra("PATH_BEAUTY", path)
        startActivity(intent)
    }

    /**
     *
     */
    private var checkAction = true
    private fun action() {
        binding.tvAction.setOnClickListener {
//            if (checkAction) {
//                UtilsAnimation().collapse(binding.llAction)
//            } else {
//                UtilsAnimation().expand(binding.llAction)
//            }
            checkAction = !checkAction
        }
    }

    /**
     *
     */
    fun checkPermission(){
        PermissionX.init(this)
            .permissions(
                Manifest.permission.CAMERA,
                Manifest.permission.READ_EXTERNAL_STORAGE



            )
            .setDialogTintColor(Color.parseColor("#ff0000"), Color.parseColor("#008577"))
            .onExplainRequestReason { scope, deniedList, beforeRequest ->
                val message = "PermissionX needs following permissions to continue"
                scope.showRequestReasonDialog(deniedList, message, "Allow", "Deny")
//                    val message = "Please allow the following permissions in settings"
//                    val dialog = CustomDialogFragment(message, deniedList)
//                    scope.showRequestReasonDialog(dialog)
            }
            .onForwardToSettings { scope, deniedList ->
                val message = "Please allow following permissions in settings"
                scope.showForwardToSettingsDialog(deniedList, message, "Allow", "Deny")
            }
            .request { allGranted, grantedList, deniedList ->
                if (allGranted) {
                            TedRxImagePicker.with(this)
                                .start()
                                .subscribe(this::showSingleImage, Throwable::printStackTrace)
                    Toast.makeText(this, "All permissions are granted", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "The following permissions are denied：$deniedList", Toast.LENGTH_SHORT).show()
                }
            }
    }



}
