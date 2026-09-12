package com.margelo.nitro.rive;

import android.util.Log;
import app.rive.runtime.kotlin.fonts.FontFallbackStrategy;
import app.rive.runtime.kotlin.fonts.FontHelper;
import app.rive.runtime.kotlin.fonts.Fonts;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements FontFallbackStrategy {
    @Override // app.rive.runtime.kotlin.fonts.FontFallbackStrategy
    public final List getFont(Fonts.Weight weight) {
        Iterable<HybridFallbackFontSpec> iterable;
        Fonts.Weight weight2;
        byte[] fontBytes;
        Intrinsics.checkNotNullParameter(weight, "weight");
        int weight3 = weight.getWeight();
        synchronized (HybridRiveFontConfig.fontsByWeight) {
            iterable = (List) HybridRiveFontConfig.fontsByWeight.get(Integer.valueOf(weight3));
            if (iterable == null && (iterable = (List) HybridRiveFontConfig.fontsByWeight.get(0)) == null) {
                iterable = kotlin.collections.n0.f14659d;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (HybridFallbackFontSpec hybridFallbackFontSpec : iterable) {
            if (hybridFallbackFontSpec instanceof HybridDefaultFallbackFont) {
                weight2 = weight;
                fontBytes = FontHelper.INSTANCE.getFallbackFontBytes(new Fonts.FontOpts(null, null, weight2, null, 11, null));
            } else {
                weight2 = weight;
                if (hybridFallbackFontSpec instanceof HybridFallbackFont) {
                    fontBytes = ((HybridFallbackFont) hybridFallbackFontSpec).getFontBytes();
                } else {
                    Log.e("RiveFonts", "Unknown fallback font spec type: " + Reflection.getOrCreateKotlinClass(hybridFallbackFontSpec.getClass()).getSimpleName());
                    fontBytes = null;
                }
            }
            if (fontBytes != null) {
                arrayList.add(fontBytes);
            }
            weight = weight2;
        }
        return arrayList;
    }
}
