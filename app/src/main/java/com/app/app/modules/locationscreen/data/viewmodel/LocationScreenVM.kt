package com.app.app.modules.locationscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.app.modules.locationscreen.`data`.model.LocationScreenModel
import org.koin.core.KoinComponent

class LocationScreenVM : ViewModel(), KoinComponent {
  val locationScreenModel: MutableLiveData<LocationScreenModel> =
      MutableLiveData(LocationScreenModel())

  var navArguments: Bundle? = null
}
