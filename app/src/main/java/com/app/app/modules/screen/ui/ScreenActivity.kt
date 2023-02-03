package com.app.app.modules.screen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.app.app.R
import com.app.app.appcomponents.base.BaseActivity
import com.app.app.databinding.ActivityScreenBinding
import com.app.app.modules.loginpage.ui.LoginPageActivity
import com.app.app.modules.screen.`data`.viewmodel.ScreenVM
import com.app.app.modules.userscreen.ui.UserScreenActivity
import kotlin.String
import kotlin.Unit

class ScreenActivity : BaseActivity<ActivityScreenBinding>(R.layout.activity_screen) {
  private val viewModel: ScreenVM by viewModels<ScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUser.setOnClickListener {
      val destIntent = UserScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAdmin.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
