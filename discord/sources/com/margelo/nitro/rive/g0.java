package com.margelo.nitro.rive;

import android.util.Log;
import app.rive.runtime.kotlin.fonts.FontFallbackStrategy;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {
    public static final void a(g0 g0Var) {
        g0Var.getClass();
        try {
            FontFallbackStrategy.INSTANCE.cppResetFontCache();
        } catch (Exception e10) {
            Log.e("RiveFonts", "Failed to reset font cache: " + e10.getMessage());
        }
    }
}
