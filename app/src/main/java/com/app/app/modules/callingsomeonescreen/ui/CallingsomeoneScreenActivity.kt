package com.app.app.modules.callingsomeonescreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.app.app.R
import com.app.app.appcomponents.base.BaseActivity
import com.app.app.databinding.ActivityCallingsomeoneScreenBinding
import com.app.app.modules.callingsomeonescreen.`data`.viewmodel.CallingsomeoneScreenVM
import com.app.app.modules.user2screen.ui.User2ScreenActivity
import kotlin.String
import kotlin.Unit

class CallingsomeoneScreenActivity :
    BaseActivity<ActivityCallingsomeoneScreenBinding>(R.layout.activity_callingsomeone_screen) {
  private val viewModel: CallingsomeoneScreenVM by viewModels<CallingsomeoneScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.callingsomeoneScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etBtnBack.setOnClickListener {
      val destIntent = User2ScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CALLINGSOMEONE_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CallingsomeoneScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
