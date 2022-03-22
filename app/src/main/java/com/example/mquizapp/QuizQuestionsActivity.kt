package com.example.mquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.ImageView


class QuizQuestionsActivity : AppCompatActivity() {

    private var progressBar: ProgressBar? = null
    private var tvProgress  : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivImage :  ImageView? = null


    private var tvOptionOne: TextView? = null
    private var tvOptiontwo  : TextView? = null
    private var tvOptionthree: TextView? = null
    private var tvOptionfour:  TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)



        val questionList = Constants.getQuestions()
        Log.i("Questionslist size is, ${questionList.size}")
    }
}