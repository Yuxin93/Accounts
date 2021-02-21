package com.zhangyuxin.accounts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.zhangyuxin.accounts.databinding.ActivityMainBinding
import com.zhangyuxin.accounts.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {
    var mBinding: ActivityMainBinding? = null
    private val userViewModel by lazy { ViewModelProvider(this)[UserViewModel::class.java] }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


    }
}