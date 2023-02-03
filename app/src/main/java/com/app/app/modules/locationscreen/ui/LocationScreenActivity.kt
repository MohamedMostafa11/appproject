package com.app.app.modules.locationscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.app.app.R
import com.app.app.appcomponents.base.BaseActivity
import com.app.app.databinding.ActivityLocationScreenBinding
import com.app.app.modules.locationscreen.`data`.viewmodel.LocationScreenVM
import kotlin.String
import kotlin.Unit

class LocationScreenActivity :
    BaseActivity<ActivityLocationScreenBinding>(R.layout.activity_location_screen) {
  private val viewModel: LocationScreenVM by viewModels<LocationScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.locationScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOCATION_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LocationScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
