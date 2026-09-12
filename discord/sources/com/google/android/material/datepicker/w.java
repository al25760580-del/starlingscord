package com.google.android.material.datepicker;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends m0 {
    @Override // androidx.recyclerview.widget.m0
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
