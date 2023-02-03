package com.app.app.modules.screengo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.app.modules.screengo.`data`.model.ScreenGoModel
import org.koin.core.KoinComponent

class ScreenGoVM : ViewModel(), KoinComponent {
  val screenGoModel: MutableLiveData<ScreenGoModel> = MutableLiveData(ScreenGoModel())

  var navArguments: Bundle? = null
}
