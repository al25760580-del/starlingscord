package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f6184i;

    public x(y yVar) {
        this.f6184i = yVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        y yVar = this.f6184i;
        z1.h(i7, yVar.f6188x);
        Object[] objArr = yVar.f6187w;
        int i10 = i7 + i7;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6184i.f6188x;
    }
}
