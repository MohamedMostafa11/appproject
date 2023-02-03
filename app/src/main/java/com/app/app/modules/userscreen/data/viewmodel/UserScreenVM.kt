package com.app.app.modules.userscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.app.modules.userscreen.`data`.model.UserScreenModel
import org.koin.core.KoinComponent

class UserScreenVM : ViewModel(), KoinComponent {
  val userScreenModel: MutableLiveData<UserScreenModel> = MutableLiveData(UserScreenModel())

  var navArguments: Bundle? = null
}
