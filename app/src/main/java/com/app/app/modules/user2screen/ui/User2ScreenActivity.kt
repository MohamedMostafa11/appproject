package com.app.app.modules.user2screen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.app.app.R
import com.app.app.appcomponents.base.BaseActivity
import com.app.app.databinding.ActivityUser2ScreenBinding
import com.app.app.modules.callingsomeonescreen.ui.CallingsomeoneScreenActivity
import com.app.app.modules.user2screen.`data`.viewmodel.User2ScreenVM
import kotlin.String
import kotlin.Unit

class User2ScreenActivity : BaseActivity<ActivityUser2ScreenBinding>(R.layout.activity_user2_screen)
    {
  private val viewModel: User2ScreenVM by viewModels<User2ScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.user2ScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCallSomeone.setOnClickListener {
      val destIntent = CallingsomeoneScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "USER2SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, User2ScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
