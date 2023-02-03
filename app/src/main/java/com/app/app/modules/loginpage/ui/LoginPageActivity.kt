package com.app.app.modules.loginpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.app.app.R
import com.app.app.appcomponents.base.BaseActivity
import com.app.app.databinding.ActivityLoginPageBinding
import com.app.app.modules.adminscreen.ui.AdminScreenActivity
import com.app.app.modules.loginpage.`data`.viewmodel.LoginPageVM
import com.app.app.modules.registerpage.ui.RegisterPageActivity
import kotlin.String
import kotlin.Unit

class LoginPageActivity : BaseActivity<ActivityLoginPageBinding>(R.layout.activity_login_page) {
  private val viewModel: LoginPageVM by viewModels<LoginPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLoginOne.setOnClickListener {
      val destIntent = AdminScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSignup.setOnClickListener {
      val destIntent = RegisterPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
