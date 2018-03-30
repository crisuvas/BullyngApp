package com.cris.bullyngapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ScrollView
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity(), View.OnClickListener, SeekBar.OnSeekBarChangeListener {


    private var scrlViewQuestion: ScrollView? = null
    private var txtViewQuestionTitle: TextView? = null
    private var txtViewQuestionText: TextView? = null
    private var seekBarview: SeekBar? = null
    private var btnNext: Button? = null
    private var numberQuestion = 1
    private var pointQuestion = 0
    private var points = 0
    private var min = 0
    private var max = 100
    private var step = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        scrlViewQuestion = findViewById(R.id.scrollViewQuestion)
        txtViewQuestionTitle = findViewById(R.id.textViewQuestionTitle)
        txtViewQuestionText = findViewById(R.id.textViewQuestionText)
        btnNext = findViewById(R.id.buttonNext)
        seekBarview = findViewById(R.id.seekBar)

        seekBarview!!.max = (max - min)/step
        seekBarview!!.setOnSeekBarChangeListener(this)

        readQuestion()
        btnNext!!.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        for(n in numberQuestion..10){
            pointQuestion += points
            numberQuestion++

            if (numberQuestion != 11){
                readQuestion()
                scrlViewQuestion?.scrollTo(0,0)
            }else{
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("totalPoint", pointQuestion)
                startActivity(intent)
            }
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
    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        points = min + ( progress * step )
    }
    override fun onStartTrackingTouch(seekBar: SeekBar) {
    }
    override fun onStopTrackingTouch(seekBar: SeekBar) {
    }
}
