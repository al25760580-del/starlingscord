package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int f6093i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f6094v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f6095w;

    public q(s sVar, int i7, int i10) {
        this.f6095w = sVar;
        this.f6093i = i7;
        this.f6094v = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int b() {
        return this.f6095w.d() + this.f6093i + this.f6094v;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int d() {
        return this.f6095w.d() + this.f6093i;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        z1.h(i7, this.f6094v);
        return this.f6095w.get(i7 + this.f6093i);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] i() {
        return this.f6095w.i();
    }

    @Override // com.google.android.gms.internal.play_billing.s, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final s subList(int i7, int i10) {
        z1.u(i7, i10, this.f6094v);
        int i11 = this.f6093i;
        return this.f6095w.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6094v;
    }
}
