package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends t1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f6119i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6120v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6121w;

    public s1(byte[] bArr, int i7, int i10) {
        t1.k(i7, i7 + i10, bArr.length);
        this.f6119i = bArr;
        this.f6120v = i7;
        this.f6121w = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final byte a(int i7) {
        return this.f6119i[this.f6120v + i7];
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final int b(int i7, int i10) {
        return i2.a(i7, this.f6120v, i10, this.f6119i);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final int d() {
        return this.f6121w;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final t1 e(int i7, int i10) {
        int iK = t1.k(i7, i10, this.f6121w);
        if (iK == 0) {
            return t1.f6136e;
        }
        return new s1(this.f6119i, this.f6120v + i7, iK);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final void h(byte[] bArr, int i7) {
        System.arraycopy(this.f6119i, this.f6120v, bArr, 0, i7);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final void i(v1 v1Var) throws ag.a1 {
        v1Var.F(this.f6119i, this.f6120v, this.f6121w);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final boolean j(t1 t1Var) {
        boolean z5 = t1Var instanceof u1;
        if (!z5 && !(t1Var instanceof s1)) {
            return t1Var.j(this);
        }
        int iD = t1Var.d();
        int i7 = this.f6121w;
        if (i7 > iD) {
            throw new IllegalArgumentException("Length too large: " + i7 + i7);
        }
        if (i7 > t1Var.d()) {
            throw new IllegalArgumentException(a3.e.g(i7, t1Var.d(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.f6119i;
        int i10 = this.f6120v;
        if (z5) {
            return t1.o(i10, 0, i7, bArr, ((u1) t1Var).f6144i);
        }
        if (!(t1Var instanceof s1)) {
            return t1Var.e(0, i7).equals(e(i10, i7 + i10));
        }
        s1 s1Var = (s1) t1Var;
        return t1.o(i10, s1Var.f6120v, i7, bArr, s1Var.f6119i);
    }
}
