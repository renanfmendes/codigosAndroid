package br.com.heider.pingpong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

    /*FORMA NOVA PARA SALVAR OS DADOS DA TELA*/
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*FORMA NOVA PARA SALVAR OS DADOS DA TELA*/
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        setUpView()

        /*FORMA NOVA PARA SALVAR OS DADOS DA TELA*/
        mainViewModel.homeScore.observe(this, Observer {goalHome ->
            tvHomeScore.text = goalHome.toString()
        })

        mainViewModel.awayScore.observe(this, Observer { goalAway ->
            tvAwayScore.text = goalAway.toString()
        })

        /*FORMA VELHA DE SALVAR OS DADOS DA TELA
        if(savedInstanceState != null) {
            homeScore = savedInstanceState.getInt("HOME_SCORE")
            awayScore = savedInstanceState.getInt("AWAY_SCORE")

            tvHomeScore.text = homeScore.toString()
            tvAwayScore.text = awayScore.toString()
        }*/
    }

    private fun setUpView() {
        tvHomeName.text = intent.getStringExtra("HOME_NAME")
        tvAwayName.text = intent.getStringExtra("AWAY_NAME")
        setUpListener()
    }

    private fun setUpListener() {
        btHomeScore.setOnClickListener {
            mainViewModel.goalHome()
        }

        btAwayScore.setOnClickListener {
            mainViewModel.goalAway()
        }

        btReset.setOnClickListener {
            mainViewModel.resetGame()
        }
    }

    /*FORMA VELHA DE SALVAR OS DADOS DA TELA
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("HOME_SCORE", homeScore)
        outState.putInt("AWAY_SCORE", awayScore)
    }*/
}
