package com.example.pr17

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : Activity(), View.OnClickListener {
    var tvOut: TextView? = null
    var btnOk: Button? = null
    var btnCancel: Button? = null

    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // найдем View-элементы
        Log.d(TAG, "найдем View-элементы")
        tvOut = findViewById<View>(R.id.tvOut) as TextView
        btnOk = findViewById<View>(R.id.btnOk) as Button
        btnCancel = findViewById<View>(R.id.btnCancel) as Button

        // присваиваем обработчик кнопкам
        Log.d(TAG, "присваиваем обработчик кнопкам")
        btnOk!!.setOnClickListener(this)
        btnCancel!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        // по id определяем кнопку, вызвавшую этот обработчик
        Log.d(TAG, "по id определяем кнопку, вызвавшую этот обработчик")
        when (v.id) {
            R.id.btnOk -> {
                // кнопка ОК
                Log.d(TAG, "кнопка ОК")
                tvOut!!.text = "Нажата кнопка ОК"
                Toast.makeText(this, "Нажата кнопка ОК", Toast.LENGTH_LONG).show()
            }
            R.id.btnCancel -> {
                // кнопка Cancel
                Log.d(TAG, "кнопка Cancel")
                tvOut!!.text = "Нажата кнопка Cancel"
                Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_LONG).show()
            }
        }
    }
    companion object {
        private const val TAG = "myLogs"
    }
}