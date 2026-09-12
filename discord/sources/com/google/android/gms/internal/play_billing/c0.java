package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends u {
    public static final Object[] F;
    public static final c0 G;
    public final transient int E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object[] f5986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient int f5987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient Object[] f5988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient int f5989y;

    static {
        Object[] objArr = new Object[0];
        F = objArr;
        G = new c0(0, 0, 0, objArr, objArr);
    }

    public c0(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f5986v = objArr;
        this.f5987w = i7;
        this.f5988x = objArr2;
        this.f5989y = i10;
        this.E = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f5986v;
        int i7 = this.E;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int b() {
        return this.E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f5988x;
            if (objArr.length != 0) {
                int iA = z1.a(obj.hashCode());
                while (true) {
                    int i7 = iA & this.f5989y;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iA = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.u, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5987w;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] i() {
        return this.f5986v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.u
    public final s k() {
        return s.k(this.E, this.f5986v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.E;
    }
}
