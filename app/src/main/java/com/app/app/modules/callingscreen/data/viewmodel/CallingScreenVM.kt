package com.app.app.modules.callingscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.app.modules.callingscreen.`data`.model.CallingScreenModel
import org.koin.core.KoinComponent

class CallingScreenVM : ViewModel(), KoinComponent {
  val callingScreenModel: MutableLiveData<CallingScreenModel> =
      MutableLiveData(CallingScreenModel())

  var navArguments: Bundle? = null
}
