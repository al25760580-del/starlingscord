package com.discord.image.color_quantizer;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Swatch {
    final int mBlue;
    final int mGreen;
    private float[] mHsl;
    final int mPopulation;
    final int mRed;
    final int mRgb;

    public Swatch(int i7, int i10) {
        this.mRed = Color.red(i7);
        this.mGreen = Color.green(i7);
        this.mBlue = Color.blue(i7);
        this.mRgb = i7;
        this.mPopulation = i10;
    }

    public float[] getHsl() {
        if (this.mHsl == null) {
            float[] fArr = new float[3];
            this.mHsl = fArr;
            ColorUtils.RGBtoHSL(this.mRed, this.mGreen, this.mBlue, fArr);
        }
        return this.mHsl;
    }

    public int getPopulation() {
        return this.mPopulation;
    }

    public int getRgb() {
        return this.mRgb;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Swatch [");
        sb2.append(Integer.toHexString(getRgb()));
        sb2.append("][HSL: ");
        sb2.append(Arrays.toString(getHsl()));
        sb2.append("][Population: ");
        return com.discord.chat.presentation.list.a.j(sb2, this.mPopulation, ']');
    }

    public Swatch(int i7, int i10, int i11, int i12) {
        this.mRed = i7;
        this.mGreen = i10;
        this.mBlue = i11;
        this.mRgb = Color.rgb(i7, i10, i11);
        this.mPopulation = i12;
    }
}
