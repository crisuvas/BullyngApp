package com.cris.bullyngapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private var tatViewPercentage: TextView? = null
    private var txtViewDescription: TextView? = null

    private var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        tatViewPercentage = findViewById(R.id.textViewPercentage)
        txtViewDescription = findViewById(R.id.textViewDescription)
        givePoints()
        description()
    }
    fun givePoints(){
        points = intent.getIntExtra("totalPoint",0)
        tatViewPercentage?.text = "${points}/20 %"
    }
    fun description(){
    }
}
