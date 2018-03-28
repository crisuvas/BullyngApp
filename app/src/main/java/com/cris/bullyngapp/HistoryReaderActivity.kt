package com.cris.bullyngapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HistoryReaderActivity : AppCompatActivity() {
    private var txtViewHistoryTitle : TextView? = null
    private var txtViewHistoryText : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_reader)
        txtViewHistoryTitle = findViewById(R.id.textViewHistoryTitle)
        txtViewHistoryText = findViewById(R.id.textViewHistoryText)

        createText()

    }
    private fun createText(){
        val historyNumber = intent.getIntExtra("historyNumber",0)
        when(historyNumber){
            1 ->{
                txtViewHistoryTitle?.text = getString(R.string.history1)
                txtViewHistoryText?.text = getString(R.string.textHistory1)
            }
            2 ->{
                txtViewHistoryTitle?.text = getString(R.string.history2)
                txtViewHistoryText?.text = getString(R.string.textHistory2)
            }
            3 ->{
                txtViewHistoryTitle?.text = getString(R.string.history3)
                txtViewHistoryText?.text = getString(R.string.textHistory3)
            }
            4 ->{
                txtViewHistoryTitle?.text = getString(R.string.history4)
                txtViewHistoryText?.text = getString(R.string.textHistory4)
            }



        }
    }
}
