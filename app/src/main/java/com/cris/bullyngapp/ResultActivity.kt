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
        givePoints(points)
        description(points)
    }
    fun givePoints(points: Int): Int {
        this.points = intent.getIntExtra("totalPoint",0)
        this.points /= 20
        txtViewPercentage?.text = "${this.points} %"
        when(this.points){
            0 ->
                txtViewDescription?.text = "Nada de Bullying"
            in 1..25 ->
                txtViewDescription?.text = "Bullying Leve"
            in 26..50 ->
                txtViewDescription?.text = "Bullying Moderado"
            in 51..75 ->
                txtViewDescription?.text = "Bullying Alto"
            in 75..100 ->
                txtViewDescription?.text = "Bullying Grave"
        }
        return points
    }
    fun description(points: Int) {
        //MODIFICAR ESTO CON LAS RECOMENDACIONES ADECUADAS
        when(points){
            0 ->
                txtViewBullyingLevel?.text = "Nada de Bullying"
            in 1..25 ->
                txtViewBullyingLevel?.text = "Bullying Leve"
            in 26..50 ->
                txtViewBullyingLevel?.text = "Bullying Moderado"
            in 51..75 ->
                txtViewBullyingLevel?.text = "Bullying Alto"
            in 75..100 ->
                txtViewBullyingLevel?.text = "Bullying Grave"
        }
    }
}
