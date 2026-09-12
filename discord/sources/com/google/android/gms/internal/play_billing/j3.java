package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f6027a;

    public j3(Unsafe unsafe) {
        this.f6027a = unsafe;
    }

    public abstract double a(long j, Object obj);

    public abstract float b(long j, Object obj);

    public abstract void c(Object obj, long j, boolean z5);

    public abstract void d(Object obj, long j, double d6);

    public abstract void e(Object obj, long j, float f2);

    public abstract boolean f(long j, Object obj);
}
