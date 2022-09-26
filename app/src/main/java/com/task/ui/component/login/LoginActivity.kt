package com.task.ui.component.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.LiveData
import com.google.android.material.snackbar.Snackbar
import com.task.data.Resource
import com.task.data.dto.login.LoginResponse
import com.task.databinding.LoginActivityBinding
import com.task.ui.base.BaseActivity
//import com.task.ui.component.frames.BeautyMagicActivity
//import com.task.ui.component.frames.DirectPickImageActivity
import com.task.ui.component.recipes.RecipesListActivity
import com.task.utils.*
import dagger.hilt.android.AndroidEntryPoint
//import g3.module.libclickanim.clickutils.UtilsAnimation
import g3.module.pickimage.activity.PickImageActivity
import java.util.*

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
        pickImages(PickImageActivity.PICK_A_PHOTO)
//        loginViewModel.doLogin(
//            binding.username.text.trim().toString(),
//            binding.password.text.toString()
//        )
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

    private var action = PickImageActivity.PICK_A_PHOTO

    /**
     * test pick image
     */
    private fun pickImages(action: String) {
        this.action = action
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
            if (requestCode == PickImageActivity.REQUEST_PICK_IMAGE) {
                if (action == PickImageActivity.PICK_A_PHOTO) {
                    val mListImage = Objects.requireNonNull(data?.getExtras())
                        ?.getStringArrayList(PickImageActivity.KEY_GET_IMAGE)

                    Log.e("TAG", "path = ${mListImage!![0]!!}")
                    startBeautyActivity(mListImage!![0]!!)
                }
            }
        }
    }

    private fun startBeautyActivity(path: String) {
//        val intent = Intent(this, BeautyMagicActivity::class.java)
//        intent.putExtra(ConstantMagic.PATH_BEAUTY, path)
//        startActivity(intent)
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

}
