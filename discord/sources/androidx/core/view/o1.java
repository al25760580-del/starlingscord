package androidx.core.view;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f1711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1712d;

    public o1(int i7, Interpolator interpolator, long j) {
        this.f1709a = i7;
        this.f1711c = interpolator;
        this.f1712d = j;
    }

    public long a() {
        return this.f1712d;
    }

    public float b() {
        Interpolator interpolator = this.f1711c;
        return interpolator != null ? interpolator.getInterpolation(this.f1710b) : this.f1710b;
    }

    public int c() {
        return this.f1709a;
    }

    public void d(float f2) {
        this.f1710b = f2;
    }
}
