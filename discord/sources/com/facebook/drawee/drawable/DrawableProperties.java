package com.facebook.drawee.drawable;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawableProperties {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorFilter f4641c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4639a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4642d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4643e = -1;

    public final void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i7 = this.f4639a;
        if (i7 != -1) {
            drawable.setAlpha(i7);
        }
        if (this.f4640b) {
            drawable.setColorFilter(this.f4641c);
        }
        int i10 = this.f4642d;
        if (i10 != -1) {
            drawable.setDither(i10 != 0);
        }
        int i11 = this.f4643e;
        if (i11 != -1) {
            drawable.setFilterBitmap(i11 != 0);
        }
    }
}
