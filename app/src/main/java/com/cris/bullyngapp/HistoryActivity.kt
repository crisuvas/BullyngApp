package com.cris.bullyngapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HistoryActivity : AppCompatActivity(), View.OnClickListener {

    private var btnHistory1: Button? = null
    private var btnHistory2: Button? = null
    private var btnHistory3: Button? = null
    private var btnHistory4: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        btnHistory1 = findViewById(R.id.buttonHistory1)
        btnHistory2 = findViewById(R.id.buttonHistory2)
        btnHistory3 = findViewById(R.id.buttonHistory3)
        btnHistory4 = findViewById(R.id.buttonHistory4)

        btnHistory1!!.setOnClickListener(this)
        btnHistory2!!.setOnClickListener(this)
        btnHistory3!!.setOnClickListener(this)
        btnHistory4!!.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        val intent = Intent(this, HistoryReaderActivity::class.java)
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
        }

    }
}
