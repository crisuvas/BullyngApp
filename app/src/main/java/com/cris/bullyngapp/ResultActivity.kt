package com.cris.bullyngapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity(), View.OnClickListener {

    private var txtViewPercentage: TextView? = null
    private var txtViewDescription: TextView? = null
    private var txtViewBullyingLevel: TextView? = null
    private var btnRestart: Button? = null
    private var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        txtViewPercentage = findViewById(R.id.textViewPercentage)
        txtViewDescription = findViewById(R.id.textViewDescription)
        txtViewBullyingLevel = findViewById(R.id.textViewBullyingLevel)
        btnRestart = findViewById(R.id.buttonRestart)
        givePoints(points)
        description(points)
        btnRestart!!.setOnClickListener(this)
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
    override fun onClick(v: View?) {
        val intent = Intent(this, MainActivity::class.java)
        when(v!!.id){
            R.id.buttonRestart ->
                    startActivity(intent)
        }
    }
}
