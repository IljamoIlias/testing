package com.example.mytestapp;

import android.content.res.Resources;

import androidx.annotation.NonNull;
import androidx.annotation.RawRes;

import com.squareup.moshi.JsonAdapter;

import java.io.IOException;

import okio.Okio;

public final class mockParser {

    private mockParser() {
        /* Utility classes must not have a public constructor */
    }

    public static <T> T parseRawFile(@NonNull Resources resources, @RawRes int resId, JsonAdapter<T> adapter) {
        try {
            return adapter.fromJson(Okio.buffer(Okio.source(resources.openRawResource(resId))));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

}
