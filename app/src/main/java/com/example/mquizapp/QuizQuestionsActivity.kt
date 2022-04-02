package com.example.mquizapp

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.ImageView
import androidx.core.content.ContextCompat


class QuizQuestionsActivity : AppCompatActivity(),  View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0


    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var tvQuestion: TextView? = null
    private var ivImage: ImageView? = null


    private var tvOptionOne: TextView? = null
    private var tvOptiontwo: TextView? = null
    private var tvOptionthree: TextView? = null
    private var tvOptionfour: TextView? = null
    private var btnSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_quastion)
        ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptiontwo = findViewById(R.id.tv_option_two)
        tvOptionthree = findViewById(R.id.tv_option_three)
        tvOptionfour = findViewById(R.id.tv_option_four)
        btnSubmit = findViewById(R.id.btn_submit)


        tvOptionOne?.setOnClickListener(this)
        tvOptiontwo?.setOnClickListener(this)
        tvOptionthree?.setOnClickListener(this)
        tvOptionfour?.setOnClickListener(this)


        mQuestionList = Constants.getQuestions()

        setQuestion()
        defaultOptionsView()


    }

    private fun setQuestion() {


        val currentPosition = 1
        val question: Question = mQuestionList!![mCurrentPosition - 1]
        ivImage?.setImageResource(question.image)
        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition/${progressBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.opotionOne
        tvOptiontwo?.text = question.opotiontwo
        tvOptionthree?.text = question.opotionthree
        tvOptionfour?.text = question.opotionfour

        if (mCurrentPosition == mQuestionList!!.size) {
            btnSubmit?.text = "FINISH"
        } else {
            btnSubmit?.text = "SUBMIT"
        }

    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0, it)
        }
        tvOptiontwo?.let {
            options.add(1, it)
        }
        tvOptionthree?.let {
            options.add(2, it)
        }
        tvOptionfour?.let {
            options.add(3, it)
        }
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }


    private fun selectedOptionView(
        tv: TextView, selectedOptionNum: Int
    ) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tv_option_one -> {
                tvOptionOne?.let {
                    selectedOptionView(it, 1)
                }
            }
            R.id.tv_option_two -> {
                tvOptiontwo?.let {
                    selectedOptionView(it, 2)
                }
            }
            R.id.tv_option_three -> {
                tvOptionthree?.let {
                    selectedOptionView(it, 3)
                }
            }
            R.id.tv_option_four -> {
                tvOptionfour?.let {
                    selectedOptionView(it, 4)
                }
            }

            R.id.btn_submit ->{
                // TODO "omplement btn submit"
            }
        }
    }
}


