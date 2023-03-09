package com.cb.canarymanagment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cb.canarymanagment.fragments.homefragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, homefragment())
                .commit()
        }
    }
}