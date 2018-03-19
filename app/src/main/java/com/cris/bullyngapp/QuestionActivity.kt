package com.cris.bullyngapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ScrollView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var scrlViewQuestion: ScrollView? = null
    private var txtViewQuestionTitle: TextView? = null
    private var txtViewQuestionText: TextView? = null
    private var btnMuchDisagree: Button? = null
    private var btnDisagree: Button? = null
    private var btnMoreOrLess: Button? = null
    private var btnAgree: Button? = null
    private var btnMuchAgree: Button? = null
    private var numberQuestion = 1
    private var pointQuestion = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        scrlViewQuestion = findViewById(R.id.scrollViewQuestion)
        txtViewQuestionTitle = findViewById(R.id.textViewQuestionTitle)
        txtViewQuestionText = findViewById(R.id.textViewQuestionText)
        btnMuchDisagree = findViewById(R.id.buttonMuchDisagree)
        btnDisagree = findViewById(R.id.buttonDisagree)
        btnMoreOrLess = findViewById(R.id.buttonMoreOrLess)
        btnAgree = findViewById(R.id.buttonAgree)
        btnMuchAgree = findViewById(R.id.buttonMuchAgree)

        readQuestion()
        btnMuchDisagree!!.setOnClickListener(this)
        btnDisagree!!.setOnClickListener(this)
        btnMoreOrLess!!.setOnClickListener(this)
        btnAgree!!.setOnClickListener(this)
        btnMuchAgree!!.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        for(n in numberQuestion..10){
            when(v!!.id) {
                R.id.buttonMuchDisagree -> {
                    pointQuestion += 1
                    numberQuestion++
                }
                R.id.buttonDisagree -> {
                    pointQuestion += 2
                    numberQuestion++
                }
                R.id.buttonMoreOrLess -> {
                    pointQuestion += 3
                    numberQuestion++
                }
                R.id.buttonAgree -> {
                    pointQuestion += 4
                    numberQuestion++
                }
                R.id.buttonMuchAgree -> {
                    pointQuestion += 5
                    numberQuestion++
                }
            }
            readQuestion()
            scrlViewQuestion?.scrollTo(0,0)
            break
        }
    }
    private fun readQuestion(){
        when(numberQuestion){
            1 ->{
                txtViewQuestionTitle?.text = getString(R.string.titleQuestion1)
                txtViewQuestionText?.text = getString(R.string.textQuestion1)

            }
            2 ->{
                txtViewQuestionTitle?.text = getString(R.string.titleQuestion2)
                txtViewQuestionText?.text = getString(R.string.textQuestion2)
            }
            3 ->{
                txtViewQuestionTitle?.text = getString(R.string.titleQuestion3)
                txtViewQuestionText?.text = getString(R.string.textQuestion3)
            }
            4 ->{
                txtViewQuestionTitle?.text = getString(R.string.titleQuestion4)
                txtViewQuestionText?.text = getString(R.string.textQuestion4)
            }
            5 ->{
                txtViewQuestionTitle?.text = getString(R.string.titleQuestion5)
                txtViewQuestionText?.text = getString(R.string.textQuestion5)
            }
            6 ->{
                txtViewQuestionTitle?.text = getString(R.string.titleQuestion6)
                txtViewQuestionText?.text = getString(R.string.textQuestion6)
            }
            7 ->{
                txtViewQuestionTitle?.text = getString(R.string.titleQuestion7)
                txtViewQuestionText?.text = getString(R.string.textQuestion7)
            }
            8 ->{
                txtViewQuestionTitle?.text = getString(R.string.titleQuestion8)
                txtViewQuestionText?.text = getString(R.string.textQuestion8)
            }
            9 ->{
                txtViewQuestionTitle?.text = getString(R.string.titleQuestion9)
                txtViewQuestionText?.text = getString(R.string.textQuestion9)
            }
            10 ->{
                txtViewQuestionTitle?.text = getString(R.string.titleQuestion10)
                txtViewQuestionText?.text = getString(R.string.textQuestion10)
            }
        }
    }
}
