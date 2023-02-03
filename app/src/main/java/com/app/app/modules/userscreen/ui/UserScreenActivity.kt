package com.app.app.modules.userscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.app.app.R
import com.app.app.appcomponents.base.BaseActivity
import com.app.app.databinding.ActivityUserScreenBinding
import com.app.app.modules.user2screen.ui.User2ScreenActivity
import com.app.app.modules.userscreen.`data`.viewmodel.UserScreenVM
import kotlin.String
import kotlin.Unit

class UserScreenActivity : BaseActivity<ActivityUserScreenBinding>(R.layout.activity_user_screen) {
  private val viewModel: UserScreenVM by viewModels<UserScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSayUserNameToStart.setOnClickListener {
      val destIntent = User2ScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "USER_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
