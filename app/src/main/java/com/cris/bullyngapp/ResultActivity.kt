package com.cris.bullyngapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private var txtViewVerbal: TextView? = null
    private var txtViewPsicology: TextView? = null
    private var txtViewPhysic: TextView? = null
    private var txtViewSocial: TextView? = null
    private var txtViewDescription: TextView? = null
    private var points = IntArray(4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        txtViewVerbal = findViewById(R.id.textViewVerbal)
        txtViewPsicology = findViewById(R.id.textViewPsicology)
        txtViewPhysic = findViewById(R.id.textViewPhysic)
        txtViewSocial = findViewById(R.id.textViewSocial)
        txtViewDescription = findViewById(R.id.textViewDescription)
        givePoints()
        description()
    }
    fun givePoints(){
        points = intent.getIntArrayExtra("totalPoint")
        txtViewVerbal?.text = "${points[0]} %"
        txtViewPsicology?.text = "${points[1]} %"
        txtViewPhysic?.text = "${points[2]} %"
        txtViewSocial?.text = "${points[3]} %"
    }
    fun description(){
    }
}
