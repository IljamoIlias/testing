package com.example.mytestapp

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.squareup.moshi.Moshi
import okio.Okio

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nutritionFacts = Moshi.Builder().build().adapter(NutritionFacts::class.java)
            .fromJson(Okio.buffer(Okio.source(resources.openRawResource(R.raw.nutrition_facts))))
            ?: throw AssertionError()

        if (nutritionFacts.KCalPer100 != null && nutritionFacts.KJPer100 != null) {
            Log.e("Tag", nutritionFacts.getValue(resources, 0, true))
        }
    }
}
