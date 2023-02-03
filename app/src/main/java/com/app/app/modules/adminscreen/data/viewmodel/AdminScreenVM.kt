package com.app.app.modules.adminscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.app.modules.adminscreen.`data`.model.AdminScreenModel
import org.koin.core.KoinComponent

class AdminScreenVM : ViewModel(), KoinComponent {
  val adminScreenModel: MutableLiveData<AdminScreenModel> = MutableLiveData(AdminScreenModel())

  var navArguments: Bundle? = null
}
