package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends u {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object f5996v;

    public d0(Object obj) {
        this.f5996v = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int a(Object[] objArr) {
        objArr[0] = this.f5996v;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5996v.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.u, com.google.android.gms.internal.play_billing.o
    public final s e() {
        Object[] objArr = {this.f5996v};
        for (int i7 = 0; i7 < 1; i7++) {
            p pVar = s.f6118e;
            if (objArr[i7] == null) {
                throw new NullPointerException(kk.b.h(i7, "at index "));
            }
        }
        return s.k(1, objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.u, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5996v.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new v(this.f5996v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return s0.g.e("[", this.f5996v.toString(), "]");
    }
}
