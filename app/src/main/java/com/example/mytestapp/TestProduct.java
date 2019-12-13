package com.example.mytestapp;

import androidx.annotation.Nullable;

public class TestProduct {

    public String Name;
    @Nullable
    public NutritionFacts NutritionFacts;

    @Override
    public String toString() {
        return Name;
    }

}
