package com.app.app.modules.user2screen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.app.modules.user2screen.`data`.model.User2ScreenModel
import org.koin.core.KoinComponent

class User2ScreenVM : ViewModel(), KoinComponent {
  val user2ScreenModel: MutableLiveData<User2ScreenModel> = MutableLiveData(User2ScreenModel())

  var navArguments: Bundle? = null
}
