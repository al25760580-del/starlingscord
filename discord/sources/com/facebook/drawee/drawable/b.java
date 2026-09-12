package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4647e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4648i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4649v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Drawable drawable, int i7) {
        super(drawable);
        drawable.getClass();
        this.f4648i = 0.0f;
        this.f4649v = false;
        this.f4646d = i7;
        this.f4647e = true;
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i7 = bounds.right;
        int i10 = bounds.left;
        int i11 = i7 - i10;
        int i12 = bounds.bottom;
        int i13 = bounds.top;
        int i14 = i12 - i13;
        float f2 = this.f4648i;
        if (!this.f4647e) {
            f2 = 360.0f - f2;
        }
        canvas.rotate(f2, (i11 / 2) + i10, (i14 / 2) + i13);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        if (this.f4649v) {
            return;
        }
        this.f4649v = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4649v = false;
        this.f4648i += (int) ((20.0f / this.f4646d) * 360.0f);
        invalidateSelf();
    }
}
