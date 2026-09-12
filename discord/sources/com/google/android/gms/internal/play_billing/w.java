package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final w f6169w = new w(0, new Object[0]);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Object[] f6170i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f6171v;

    public w(int i7, Object[] objArr) {
        this.f6170i = objArr;
        this.f6171v = i7;
    }

    @Override // com.google.android.gms.internal.play_billing.s, com.google.android.gms.internal.play_billing.o
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f6170i;
        int i7 = this.f6171v;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int b() {
        return this.f6171v;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        z1.h(i7, this.f6171v);
        Object obj = this.f6170i[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] i() {
        return this.f6170i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6171v;
    }
}
