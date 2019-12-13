package com.example.mytestapp

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.squareup.moshi.Moshi
import okio.Okio

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val testProduct = Moshi.Builder().build().adapter(TestProduct::class.java)
            .fromJson(Okio.buffer(Okio.source(resources.openRawResource(R.raw.product))))
            ?: throw AssertionError()
        val nutritionFacts = testProduct.NutritionFacts ?: throw  IllegalArgumentException()

        if (nutritionFacts.KCalPer100 != null && nutritionFacts.KJPer100 != null) {
            Log.e("Tag", nutritionFacts.getValue(resources, 0, true))
        }
    }
}
