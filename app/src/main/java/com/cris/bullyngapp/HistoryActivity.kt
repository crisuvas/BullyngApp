package com.cris.bullyngapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class HistoryActivity : AppCompatActivity(), View.OnClickListener {

    private var imgAbout: ImageView? = null
    private var imgHistory: ImageView? = null
    private var imgQuestion: ImageView? = null
    private var imgMotivation: ImageView? = null

    private var btnHistory1: Button? = null
    private var btnHistory2: Button? = null
    private var btnHistory3: Button? = null
    private var btnHistory4: Button? = null
    private var btnHistory5: Button? = null
    private var btnHistory6: Button? = null
    private var btnHistory7: Button? = null
    private var btnHistory8: Button? = null
    private var btnHistory9: Button? = null
    private var btnHistory10: Button? = null
    private var btnHistory11: Button? = null
    private var btnHistory12: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        imgAbout = findViewById(R.id.imageViewAbout)
        imgHistory = findViewById(R.id.imageViewHistory)
        imgQuestion = findViewById(R.id.imageViewQuestion)
        imgMotivation = findViewById(R.id.imageViewMotivation)

        imgAbout!!.setOnClickListener(this)
        imgHistory!!.setOnClickListener(this)
        imgQuestion!!.setOnClickListener(this)
        imgMotivation!!.setOnClickListener(this)

        btnHistory1 = findViewById(R.id.buttonHistory1)
        btnHistory2 = findViewById(R.id.buttonHistory2)
        btnHistory3 = findViewById(R.id.buttonHistory3)
        btnHistory4 = findViewById(R.id.buttonHistory4)
        btnHistory5 = findViewById(R.id.buttonHistory5)
        btnHistory6 = findViewById(R.id.buttonHistory6)
        btnHistory7 = findViewById(R.id.buttonHistory7)
        btnHistory8 = findViewById(R.id.buttonHistory8)
        btnHistory9 = findViewById(R.id.buttonHistory8)
        btnHistory10 = findViewById(R.id.buttonHistory10)
        btnHistory11 = findViewById(R.id.buttonHistory11)
        btnHistory12 = findViewById(R.id.buttonHistory12)

        btnHistory1!!.setOnClickListener(this)
        btnHistory2!!.setOnClickListener(this)
        btnHistory3!!.setOnClickListener(this)
        btnHistory4!!.setOnClickListener(this)
        btnHistory5!!.setOnClickListener(this)
        btnHistory6!!.setOnClickListener(this)
        btnHistory7!!.setOnClickListener(this)
        btnHistory8!!.setOnClickListener(this)
        btnHistory9!!.setOnClickListener(this)
        btnHistory10!!.setOnClickListener(this)
        btnHistory11!!.setOnClickListener(this)
        btnHistory12!!.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        val intent = Intent(this, HistoryReaderActivity::class.java)
        val intentAboutActivity = Intent(this, AboutActivity::class.java)
        val intentHistoryActivity = Intent(this, HistoryActivity::class.java)
        val intentInstructionActivity = Intent(this, InstructionActivity::class.java)

        when(v!!.id){
            R.id.buttonHistory1 ->{
                intent.putExtra("historyNumber", 1)
                startActivity(intent)
            }
            R.id.buttonHistory2 ->{
                intent.putExtra("historyNumber", 2)
                startActivity(intent)
            }
            R.id.buttonHistory3 ->{
                intent.putExtra("historyNumber", 3)
                startActivity(intent)
            }
            R.id.buttonHistory4 ->{
                intent.putExtra("historyNumber", 4)
                startActivity(intent)
            }
            R.id.buttonHistory5 ->{
                intent.putExtra("historyNumber", 5)
                startActivity(intent)
            }
            R.id.buttonHistory6 ->{
                intent.putExtra("historyNumber", 6)
                startActivity(intent)
            }
            R.id.buttonHistory7 ->{
                intent.putExtra("historyNumber", 7)
                startActivity(intent)
            }
            R.id.buttonHistory8 ->{
                intent.putExtra("historyNumber", 8)
                startActivity(intent)
            }
            R.id.buttonHistory9 ->{
                intent.putExtra("historyNumber", 9)
                startActivity(intent)
            }
            R.id.buttonHistory10 ->{
                intent.putExtra("historyNumber", 10)
                startActivity(intent)
            }
            R.id.buttonHistory11 ->{
                intent.putExtra("historyNumber", 11)
                startActivity(intent)
            }
            R.id.buttonHistory12 ->{
                intent.putExtra("historyNumber", 12)
                startActivity(intent)
            }
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
