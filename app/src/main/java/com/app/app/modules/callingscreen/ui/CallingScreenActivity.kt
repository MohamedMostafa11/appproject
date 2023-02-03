package com.app.app.modules.callingscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.app.app.R
import com.app.app.appcomponents.base.BaseActivity
import com.app.app.databinding.ActivityCallingScreenBinding
import com.app.app.modules.adminscreen.ui.AdminScreenActivity
import com.app.app.modules.callingscreen.`data`.viewmodel.CallingScreenVM
import kotlin.String
import kotlin.Unit

class CallingScreenActivity :
    BaseActivity<ActivityCallingScreenBinding>(R.layout.activity_calling_screen) {
  private val viewModel: CallingScreenVM by viewModels<CallingScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.callingScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etBtnBack.setOnClickListener {
      val destIntent = AdminScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CALLING_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CallingScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
