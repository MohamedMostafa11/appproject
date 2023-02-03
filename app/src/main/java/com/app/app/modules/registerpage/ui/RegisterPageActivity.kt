package com.app.app.modules.registerpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.app.app.R
import com.app.app.appcomponents.base.BaseActivity
import com.app.app.databinding.ActivityRegisterPageBinding
import com.app.app.modules.loginpage.ui.LoginPageActivity
import com.app.app.modules.registerpage.`data`.viewmodel.RegisterPageVM
import kotlin.String
import kotlin.Unit

class RegisterPageActivity :
    BaseActivity<ActivityRegisterPageBinding>(R.layout.activity_register_page) {
  private val viewModel: RegisterPageVM by viewModels<RegisterPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnRegister.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSignin.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTER_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
