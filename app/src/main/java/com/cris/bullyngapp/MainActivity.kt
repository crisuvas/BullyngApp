package com.cris.bullyngapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private var btnHistory: Button? = null
    private var btnQuestion: Button? = null
    private var btnStories: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHistory = findViewById(R.id.buttonHistory)
        btnQuestion = findViewById(R.id.buttonQuestion)
        btnStories = findViewById(R.id.buttonStories)

        btnHistory!!.setOnClickListener(this)
        btnQuestion!!.setOnClickListener(this)
        btnStories!!.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        val intentHistoryActivity = Intent(this, HistoryActivity::class.java) //declaración a HistoryActivity
        val intentInstructionActivity = Intent(this, InstructionActivity::class.java) //declaración a QuestionActivity
        val intentStoryActivity = Intent(this, StoryActivity::class.java) //declaración a StoryActivity
        when(v!!.id){
            R.id.buttonHistory ->
                startActivity(intentHistoryActivity)
            R.id.buttonQuestion ->
                startActivity(intentInstructionActivity)
            R.id.buttonStories ->
                startActivity(intentStoryActivity)
        }
    }
}
