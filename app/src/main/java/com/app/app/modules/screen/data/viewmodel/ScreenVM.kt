package com.app.app.modules.screen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.app.modules.screen.`data`.model.ScreenModel
import org.koin.core.KoinComponent

class ScreenVM : ViewModel(), KoinComponent {
  val screenModel: MutableLiveData<ScreenModel> = MutableLiveData(ScreenModel())

  var navArguments: Bundle? = null
}
