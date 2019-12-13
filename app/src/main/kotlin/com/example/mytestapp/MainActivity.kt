package com.example.mytestapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.moshi.Moshi
import kotlinx.android.synthetic.main.activity_main.*
import okio.Okio

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var counter = 0
        val testProduct = Moshi.Builder().build().adapter(TestProduct::class.java)
            .fromJson(Okio.buffer(Okio.source(resources.openRawResource(R.raw.product))))
            ?: throw AssertionError()
        val nutritionFacts = testProduct.NutritionFacts ?: throw  IllegalArgumentException()

        click.setOnClickListener {
            result.text =
                if (nutritionFacts.KCalPer100 != null && nutritionFacts.KJPer100 != null) {
                    nutritionFacts.getValue(resources, 0, true)
                } else {
                    "Result. Attempt: ${counter++}"
                }
        }
    }

}
