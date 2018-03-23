package com.cris.bullyngapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    private var txtViewPoints: TextView? = null
    private var txtViewDescription: TextView? = null
    private var points: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        txtViewPoints = findViewById(R.id.textViewPoints)
        txtViewDescription = findViewById(R.id.textViewDescription)
        givePoints()
        description()
    }
    fun givePoints(){
        points = intent.getIntExtra("totalPoint",0)
        txtViewPoints?.text = "${points} Puntos"
    }
    fun description(){
        if (points <= 10){
            txtViewDescription?.text ="Está bien tu hijo, no te preocupes"
        }else if(points <= 20){
            txtViewDescription?.text = "Tu hijo necesita alguien con quien charlar"
        }else if(points <=30){
            txtViewDescription?.text = "Es bueno considerar que vayas a un instituto especializado para tratarlo"
        }else if(points <=40){
            txtViewDescription?.text = "Ve con un especialista a que revisen el estado psicológico de tu hijo"
        }else{
            txtViewDescription?.text = "Debes ir urgentemente con un especialista. Tú hijo puede suicidarse de un momento para otro. lo mejor es que vayas con un especialista"
        }
    }
}
