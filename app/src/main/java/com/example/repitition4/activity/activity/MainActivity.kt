package com.example.repitition4.activity.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.repitition4.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }
    private fun initViews(){
        val openButton = findViewById<Button>(R.id.btn_opener)
        openButton.setOnClickListener{openViewPAgerActivity()}
    }
    fun openViewPAgerActivity(){
        startActivity(Intent(this, ViewPagerActivity::class.java))
    }
}