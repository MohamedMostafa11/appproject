package com.app.app.modules.screengo.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.app.app.R
import com.app.app.appcomponents.base.BaseActivity
import com.app.app.databinding.ActivityScreenGoBinding
import com.app.app.modules.screen.ui.ScreenActivity
import com.app.app.modules.screengo.`data`.viewmodel.ScreenGoVM
import kotlin.String
import kotlin.Unit

class ScreenGoActivity : BaseActivity<ActivityScreenGoBinding>(R.layout.activity_screen_go) {
  private val viewModel: ScreenGoVM by viewModels<ScreenGoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenGoVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = ScreenActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.frameStackarrowright.setOnClickListener {
        val destIntent = ScreenActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SCREEN_GO_ACTIVITY"

    }
  }
