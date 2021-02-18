package com.zhangyuxin.accounts.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

data class User(var name: String, var age: Int)

class UserViewModel : ViewModel() {
    private val userBean = User("张三", 19)
    private val _user = MutableLiveData<User>().apply {
        value = userBean
    }

    var userLiveData: LiveData<User> = _user

    fun updateUser() {
        _user.value = userBean.apply {
            name = "王五"
            age = Random.nextInt(0, 30)
        }
    }
}