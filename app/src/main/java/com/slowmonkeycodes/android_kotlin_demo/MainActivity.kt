package com.slowmonkeycodes.android_kotlin_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    internal lateinit var tapMeButton: Button
    internal lateinit var gameScoreTextView: TextView
    internal lateinit var timeLeftTextView: TextView
    internal var gameScore = 0
    internal var gameStarted = false
    internal lateinit var countDownTimer: CountDownTimer
    internal val initialCountDown: Long = 10000
    internal val countDownInterval: Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tapMeButton = findViewById(R.id.tap_me_button)
        gameScoreTextView = findViewById(R.id.game_score_text_view)
        timeLeftTextView = findViewById(R.id.time_left_text_view)
        resetGame()

        tapMeButton.setOnClickListener {
            view ->
            startGame()
            incrementScore()
        }
    }

    private fun resetGame() {
        gameScore = 0
        gameScoreTextView.text = getString(R.string.your_score, gameScore.toString())
        val initialTimeLeft = initialCountDown / 1000
        timeLeftTextView.text = getString(R.string.time_left, initialTimeLeft.toString())

        countDownTimer = object: CountDownTimer(initialCountDown, countDownInterval) {
            override fun onTick(millisUntilFinished: Long) {
                val timeLeft = millisUntilFinished / 1000
                timeLeftTextView.text = getString(R.string.time_left, timeLeft.toString())
            }

            override fun onFinish() {
                endGame()
            }
        }

        gameStarted = false
    }

    private fun startGame() {
        if (!gameStarted) {
            gameStarted = true
            countDownTimer.start()
        }
    }

    private fun incrementScore() {
        gameScore++
        val newGameScore = getString(R.string.your_score, gameScore.toString())
        gameScoreTextView.text = newGameScore
    }

    private fun endGame() {
        Toast.makeText(this, getString(R.string.game_over_message, gameScore.toString()), Toast.LENGTH_SHORT).show()
        resetGame()
    }
}
