package com.dinesh.castiron

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val _contentResolved: MutableStateFlow<Boolean> = MutableStateFlow(false)

    val contentResolved: StateFlow<Boolean> = _contentResolved.asStateFlow()

    init {
        viewModelScope.launch {
            delay(3000)

            _contentResolved.value = true
        }
    }
}