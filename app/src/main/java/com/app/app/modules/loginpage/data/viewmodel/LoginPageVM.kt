package com.app.app.modules.loginpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.app.modules.loginpage.`data`.model.LoginPageModel
import org.koin.core.KoinComponent

class LoginPageVM : ViewModel(), KoinComponent {
  val loginPageModel: MutableLiveData<LoginPageModel> = MutableLiveData(LoginPageModel())

  var navArguments: Bundle? = null
}
