package com.example.mytestapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.plusAssign
import com.squareup.moshi.Moshi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val testProduct = mockParser.parseRawFile(
            resources,
            R.raw.product,
            Moshi.Builder().build().adapter(TestProduct::class.java)
        )

        name.text = testProduct.Name
        name.setOnClickListener {
            layout += MyTestView(this, testProduct)
        }
    }

}
