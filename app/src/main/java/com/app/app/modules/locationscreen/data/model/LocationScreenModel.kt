package com.app.app.modules.locationscreen.`data`.model

import com.app.app.R
import com.app.app.appcomponents.di.MyApp
import kotlin.String

data class LocationScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBlindPersonLo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_blind_person_lo)

)
