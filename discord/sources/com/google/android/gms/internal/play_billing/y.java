package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends u {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient b0 f6186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient Object[] f6187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient int f6188x;

    public y(b0 b0Var, Object[] objArr, int i7) {
        this.f6186v = b0Var;
        this.f6187w = objArr;
        this.f6188x = i7;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int a(Object[] objArr) {
        return e().a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f6186v.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.u
    public final s k() {
        return new x(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6188x;
    }
}
