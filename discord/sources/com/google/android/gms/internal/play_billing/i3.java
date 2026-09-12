package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class i3 extends j3 {
    @Override // com.google.android.gms.internal.play_billing.j3
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(this.f6027a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.j3
    public final float b(long j, Object obj) {
        return Float.intBitsToFloat(this.f6027a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.j3
    public final void c(Object obj, long j, boolean z5) {
        if (k3.f6037e) {
            k3.f(obj, j, z5);
        } else {
            k3.g(obj, j, z5);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.j3
    public final void d(Object obj, long j, double d6) {
        this.f6027a.putLong(obj, j, Double.doubleToLongBits(d6));
    }

    @Override // com.google.android.gms.internal.play_billing.j3
    public final void e(Object obj, long j, float f2) {
        this.f6027a.putInt(obj, j, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.play_billing.j3
    public final boolean f(long j, Object obj) {
        return k3.f6037e ? k3.k(j, obj) : k3.l(j, obj);
    }
}
