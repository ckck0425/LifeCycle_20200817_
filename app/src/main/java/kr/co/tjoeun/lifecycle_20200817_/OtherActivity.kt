package kr.co.tjoeun.lifecycle_20200817_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }

}