package kr.co.tjoeun.lifecycle_20200817_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {


        otherActivityBtn.setOnClickListener {
            val myIntent = Intent(mContext, OtherActivity::class.java)
            startActivity(myIntent)
        }

    }
    override fun setValues() {
    }

}

