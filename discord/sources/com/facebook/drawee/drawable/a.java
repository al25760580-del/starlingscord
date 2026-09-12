package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f4645e;

    public a(d dVar, int i7) {
        this.f4645e = dVar;
        this.f4644d = i7;
    }

    @Override // com.facebook.drawee.drawable.c
    public final Drawable getDrawable() {
        return this.f4645e.c(this.f4644d);
    }

    @Override // com.facebook.drawee.drawable.c
    public final Drawable setDrawable(Drawable drawable) {
        return this.f4645e.d(drawable, this.f4644d);
    }
}
