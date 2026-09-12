package com.linecorp.apng;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.linecorp.apng.decoder.Apng;
import fh.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import nk.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ApngDrawable extends Drawable implements Animatable {
    public static final /* synthetic */ int L = 0;
    public final ArrayList E;
    public final int[] F;
    public final int G;
    public final int H;
    public boolean I;
    public long J;
    public Long K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f6868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6869e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6870i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f6871v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f6873x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f6874y;

    public ApngDrawable(a apngState) {
        Intrinsics.checkNotNullParameter(apngState, "apngState");
        this.f6868d = apngState;
        this.f6869e = apngState.f16954a.getDuration();
        int frameCount = this.f6868d.f16954a.getFrameCount();
        this.f6870i = frameCount;
        this.f6871v = y.G(this.f6868d.f16954a.getFrameDurations());
        this.f6868d.f16954a.getByteCount();
        this.f6868d.f16954a.getAllFrameByteCount();
        this.f6872w = this.f6868d.f16954a.getLoopCount();
        this.f6868d.f16954a.isRecycled();
        this.f6873x = new Paint(6);
        this.f6874y = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[frameCount];
        a aVar = this.f6868d;
        this.G = aVar.f16955b;
        this.H = aVar.f16956c;
        for (int i7 = 1; i7 < frameCount; i7++) {
            int[] iArr = this.F;
            int i10 = i7 - 1;
            iArr[i7] = iArr[i10] + this.f6868d.f16954a.getFrameDurations()[i10];
        }
        Rect bounds = getBounds();
        a aVar2 = this.f6868d;
        bounds.set(0, 0, aVar2.f16955b, aVar2.f16956c);
    }

    public final int a() {
        int i7;
        int i10 = this.f6869e;
        long j = i10 == 0 ? 0L : this.J % ((long) i10);
        int i11 = 0;
        int i12 = this.f6872w;
        if (i12 == 0 || b() <= i12 - 1) {
            i10 = 0;
        }
        long j5 = j + ((long) i10);
        int i13 = this.f6870i - 1;
        while (true) {
            i7 = (i11 + i13) / 2;
            int[] iArr = this.F;
            int i14 = i7 + 1;
            if (iArr.length > i14 && j5 >= iArr[i14]) {
                i11 = i14;
            } else {
                if (i11 == i13 || j5 >= iArr[i7]) {
                    break;
                }
                i13 = i7;
            }
        }
        return i7;
    }

    public final int b() {
        int i7 = this.f6869e;
        if (i7 == 0) {
            return 0;
        }
        return (int) (this.J / ((long) i7));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.I) {
            int iA = a();
            long jLongValue = ((Number) this.f6868d.f16958e.invoke()).longValue();
            Long l6 = this.K;
            this.J = l6 == null ? this.J : (this.J + jLongValue) - l6.longValue();
            this.K = Long.valueOf(jLongValue);
            boolean z5 = a() != iA;
            boolean z6 = this.I;
            int i7 = this.f6872w;
            ArrayList arrayList = this.f6874y;
            if (z6) {
                if (a() == 0 && b() == 0 && l6 == null) {
                    Iterator it = CollectionsKt.i0(arrayList).iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).b(this);
                    }
                } else if (a() == this.f6870i - 1 && ((i7 == 0 || b() < i7 - 1) && z5)) {
                    Iterator it2 = CollectionsKt.i0(this.E).iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new ClassCastException();
                        }
                        b();
                        throw null;
                    }
                }
            }
            if (i7 != 0 && b() > i7 - 1) {
                this.I = false;
                Iterator it3 = CollectionsKt.i0(arrayList).iterator();
                while (it3.hasNext()) {
                    ((c) it3.next()).a(this);
                }
            }
        }
        Apng apng = this.f6868d.f16954a;
        int iA2 = a();
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        apng.drawWithIndex(iA2, canvas, null, bounds, this.f6873x);
        if (this.I) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6868d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.H;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.I;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f6868d = new a(this.f6868d);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f6873x.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6873x.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.I = true;
        this.K = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.I = false;
        invalidateSelf();
    }
}
