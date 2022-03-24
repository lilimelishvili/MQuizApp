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

        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion =  findViewById(R.id.tv_quastion)
        ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptiontwo = findViewById(R.id.tv_option_two)
        tvOptionthree = findViewById(R.id.tv_option_three)
        tvOptionfour = findViewById(R.id.tv_option_four)


        val questionList = Constants.getQuestions()
        Log.i("Questionslist size is", "${questionList.size}")

        for (i in questionList){
            Log.e("Questions", i.question)
        }


        val currentPosition = 1
        val question : Question = questionList [currentPosition - 1]
        ivImage?.setImageResource(question.image)
        progressBar?.progress = currentPosition
        tvProgress?.text = "$currentPosition/${progressBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.opotionOne
        tvOptiontwo?.text = question.opotiontwo
        tvOptionthree?.text = question.opotionthree
        tvOptionfour?.text = question.opotionfour



    }
}

//106 18:30
