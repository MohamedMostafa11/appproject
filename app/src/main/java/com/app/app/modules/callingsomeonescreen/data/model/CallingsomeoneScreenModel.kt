package com.app.app.modules.callingsomeonescreen.`data`.model

import com.app.app.R
import com.app.app.appcomponents.di.MyApp
import kotlin.String

data class CallingsomeoneScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonPhoneNu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_person_phone_nu)
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
