package com.horcrux.svg;

import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.views.image.ReactImageView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2[] f6804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f6805b;

    static {
        d2 d2Var = d2.w100;
        d2 d2Var2 = d2.w200;
        d2 d2Var3 = d2.w300;
        d2 d2Var4 = d2.Normal;
        d2 d2Var5 = d2.w500;
        d2 d2Var6 = d2.w600;
        d2 d2Var7 = d2.Bold;
        d2 d2Var8 = d2.w800;
        d2 d2Var9 = d2.w900;
        f6804a = new d2[]{d2Var, d2Var, d2Var2, d2Var3, d2Var4, d2Var5, d2Var6, d2Var7, d2Var8, d2Var9, d2Var9};
        f6805b = new int[]{ReactFontManager.TypefaceStyle.NORMAL, ReactFontManager.TypefaceStyle.BOLD, 100, androidx.recyclerview.widget.h0.DEFAULT_DRAG_ANIMATION_DURATION, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS, ReactFontManager.TypefaceStyle.NORMAL, 500, 600, ReactFontManager.TypefaceStyle.BOLD, 800, 900};
    }
}
