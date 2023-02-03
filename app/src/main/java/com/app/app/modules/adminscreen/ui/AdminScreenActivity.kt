package com.app.app.modules.adminscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.app.app.R
import com.app.app.appcomponents.base.BaseActivity
import com.app.app.databinding.ActivityAdminScreenBinding
import com.app.app.modules.adminscreen.`data`.viewmodel.AdminScreenVM
import com.app.app.modules.callingscreen.ui.CallingScreenActivity
import com.app.app.modules.locationscreen.ui.LocationScreenActivity
import com.app.app.modules.loginpage.ui.LoginPageActivity
import com.app.app.modules.screen.ui.ScreenActivity
import kotlin.String
import kotlin.Unit

class AdminScreenActivity : BaseActivity<ActivityAdminScreenBinding>(R.layout.activity_admin_screen)
    {
  private val viewModel: AdminScreenVM by viewModels<AdminScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCallBlindPersonOne.setOnClickListener {
      val destIntent = CallingScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etBtnBack.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFindHimLocationOne.setOnClickListener {
      val destIntent = LocationScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtBtnExit.setOnClickListener {
      val destIntent = ScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADMIN_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
