package com.github.nashcft.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.nashcft.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.buttonComponentActivity.setOnClickListener {
            startActivity(Intent(this@MainActivity, MyComponentActivity::class.java))
        }
        b.buttonFragmentActivity.setOnClickListener {
            startActivity(Intent(this@MainActivity, MyFragmentActivity::class.java))
        }
    }
}
