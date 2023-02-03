package com.app.app.modules.callingscreen.`data`.model

import com.app.app.R
import com.app.app.appcomponents.di.MyApp
import kotlin.String

data class CallingScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBlindPersonPh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_blind_person_ph)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalling: String? = MyApp.getInstance().resources.getString(R.string.lbl_calling)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etBtnBackValue: String? = null
)
