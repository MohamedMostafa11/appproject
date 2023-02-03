package com.app.app.modules.screengo.`data`.model

import com.app.app.R
import com.app.app.appcomponents.di.MyApp
import kotlin.String

data class ScreenGoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSharedGo: String? = MyApp.getInstance().resources.getString(R.string.lbl_shared_go)

)
