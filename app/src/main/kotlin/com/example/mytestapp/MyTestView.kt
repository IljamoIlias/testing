package com.example.mytestapp;

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.view_test_my.view.*

@SuppressLint("ViewConstructor")
class MyTestView(context: Context, testProduct: TestProduct) : LinearLayout(context) {

    init {
        LayoutInflater.from(context).inflate(R.layout.view_test_my, this, true)
        orientation = VERTICAL

        val model = testProduct.NutritionFacts ?: throw  IllegalArgumentException()

        if (model.KCalPer100 != null && model.KJPer100 != null) {
            number0.text = model.getValue(resources, 0, true)
        }

    }

}
