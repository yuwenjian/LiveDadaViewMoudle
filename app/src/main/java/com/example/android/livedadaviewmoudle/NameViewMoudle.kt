package com.example.android.livedadaviewmoudle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * created by yuwenjian
 * create_time 2019-12-19
 * packageName com.example.android.livedadaviewmoudle
 */
class NameViewMoudle : ViewModel(){

    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}