package com.cris.bullyngapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class AboutActivity : AppCompatActivity(), View.OnClickListener {

    private var imgAbout: ImageView? = null
    private var imgHistory: ImageView? = null
    private var imgQuestion: ImageView? = null
    private var imgMotivation: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        imgAbout = findViewById(R.id.imageViewAbout)
        imgHistory = findViewById(R.id.imageViewHistory)
        imgQuestion = findViewById(R.id.imageViewQuestion)
        imgMotivation = findViewById(R.id.imageViewMotivation)

        imgAbout!!.setOnClickListener(this)
        imgHistory!!.setOnClickListener(this)
        imgQuestion!!.setOnClickListener(this)
        imgMotivation!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        val intentAboutActivity = Intent(this, AboutActivity::class.java)
        val intentHistoryActivity = Intent(this, HistoryActivity::class.java)
        val intentInstructionActivity = Intent(this, InstructionActivity::class.java)
        // private val intentMotivationActivity = Intent(this,MotivationActivity::class.java)

        when(v!!.id){
            R.id.imageViewAbout ->
                startActivity(intentAboutActivity)
            R.id.imageViewHistory ->
                startActivity(intentHistoryActivity)
            R.id.imageViewQuestion ->
                startActivity(intentInstructionActivity)
        /*R.id.imageViewMotivation ->
            startActivity(intentMotivationActivity)*/
        }
    }
}
