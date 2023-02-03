package com.app.app.modules.adminscreen.`data`.model

import com.app.app.R
import com.app.app.appcomponents.di.MyApp
import kotlin.String

data class AdminScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBtnExit: String? = MyApp.getInstance().resources.getString(R.string.lbl_exit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etBtnBackValue: String? = null
)
