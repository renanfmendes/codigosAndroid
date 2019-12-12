package br.com.heider.pingpong.extensions

import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_player.view.*

fun EditText.value() = this.text.toString()

