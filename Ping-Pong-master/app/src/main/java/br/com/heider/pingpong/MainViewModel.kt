package br.com.heider.pingpong

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainViewModel : ViewModel(){

    var homeScore = MutableLiveData<Int>()
    var awayScore = MutableLiveData<Int>()

    init {
        resetGame()
    }

    fun goalHome() {
        homeScore.value = homeScore.value?.plus(1)
    }

    fun goalAway() {
        awayScore.value = awayScore.value?.plus(1)
    }

    fun resetGame(){
        homeScore.value = 0
        awayScore.value = 0
    }
}