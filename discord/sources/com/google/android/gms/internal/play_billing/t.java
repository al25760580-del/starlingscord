package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6133c;

    public t(Object obj, Object obj2, Object obj3) {
        this.f6131a = obj;
        this.f6132b = obj2;
        this.f6133c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f6131a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f6132b);
        return new IllegalArgumentException(a3.e.o(a3.e.u("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f6133c)));
    }
}
