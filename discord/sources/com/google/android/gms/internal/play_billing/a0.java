package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Object[] f5965i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f5966v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient int f5967w;

    public a0(Object[] objArr, int i7, int i10) {
        this.f5965i = objArr;
        this.f5966v = i7;
        this.f5967w = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        z1.h(i7, this.f5967w);
        Object obj = this.f5965i[i7 + i7 + this.f5966v];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5967w;
    }
}
