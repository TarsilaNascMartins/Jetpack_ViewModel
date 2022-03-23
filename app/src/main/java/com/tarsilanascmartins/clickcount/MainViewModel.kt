package com.tarsilanascmartins.clickcount

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val textResultado = MutableLiveData(0)

    fun adicionar (){
        textResultado.value = textResultado.value?.plus(1)
    }

}