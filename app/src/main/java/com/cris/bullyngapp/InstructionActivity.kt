package com.cris.bullyngapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import kotlinx.android.synthetic.main.activity_instruction.*


class InstructionActivity : AppCompatActivity(), View.OnClickListener, OnSeekBarChangeListener {

    private var seekbarView: SeekBar? = null
    private var btnStart : Button? = null

    var MIN = 1
    var MAX = 100
    var STEP = 1
    var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instruction)

        btnStart= findViewById(R.id.buttonStart)
        seekbarView = this.seekbar

        seekbarView!!.max = (MAX - MIN) / STEP
        seekbarView!!.setOnSeekBarChangeListener(this)
        btnStart!!.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        val intent = Intent(this, QuestionActivity::class.java)
        startActivity(intent)
    }
    override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
        points = MIN + ( progress * STEP )
    }
    override fun onStartTrackingTouch(seekBar: SeekBar) {
    }

    override fun onStopTrackingTouch(seekBar: SeekBar) {
    }


}
