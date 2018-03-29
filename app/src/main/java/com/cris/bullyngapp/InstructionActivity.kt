package com.cris.bullyngapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class InstructionActivity : AppCompatActivity(), View.OnClickListener {

    private var btnStart : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instruction)

        btnStart= findViewById(R.id.buttonStart)
        btnStart!!.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        val intent = Intent(this, QuestionActivity::class.java)
        startActivity(intent)
    }

}
