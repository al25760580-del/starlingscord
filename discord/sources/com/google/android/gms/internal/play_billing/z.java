package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends u {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient b0 f6194v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient a0 f6195w;

    public z(b0 b0Var, a0 a0Var) {
        this.f6194v = b0Var;
        this.f6195w = a0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int a(Object[] objArr) {
        return this.f6195w.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f6194v.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.u, com.google.android.gms.internal.play_billing.o
    public final s e() {
        return this.f6195w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f6195w.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6194v.f5979x;
    }
}
