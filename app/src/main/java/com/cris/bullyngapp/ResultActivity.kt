package com.cris.bullyngapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private var txtViewPercentage: TextView? = null
    private var txtViewDescription: TextView? = null
    private var txtViewBullyingLevel: TextView? = null

    private var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        txtViewPercentage = findViewById(R.id.textViewPercentage)
        txtViewDescription = findViewById(R.id.textViewDescription)
        txtViewBullyingLevel = findViewById(R.id.textViewBullyingLevel)
        givePoints()
        description()
    }
    fun givePoints(){
        points = intent.getIntExtra("totalPoint",0)
        points /= 20
        txtViewPercentage?.text = "${points} %"
        if (points == 0){
            txtViewBullyingLevel?.text = "Nada de Bullying"
        }else if(points <= 25){
            txtViewBullyingLevel?.text = "Bullying Leve"
        }else if(points <= 50){
            txtViewBullyingLevel?.text = "Bullying Moderado"
        }else if(points <=75){
            txtViewBullyingLevel?.text = "Bullying Alto"
        }else if(points <=100){
            txtViewBullyingLevel?.text = "Bullying Grave"
        }
    }
    fun description(){
    }
}
