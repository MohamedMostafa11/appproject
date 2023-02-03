package com.app.app.modules.callingsomeonescreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.app.modules.callingsomeonescreen.`data`.model.CallingsomeoneScreenModel
import org.koin.core.KoinComponent

class CallingsomeoneScreenVM : ViewModel(), KoinComponent {
  val callingsomeoneScreenModel: MutableLiveData<CallingsomeoneScreenModel> =
      MutableLiveData(CallingsomeoneScreenModel())

  var navArguments: Bundle? = null
}
