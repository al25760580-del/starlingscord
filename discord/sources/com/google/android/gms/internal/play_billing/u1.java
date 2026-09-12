package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends t1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f6144i;

    public u1(byte[] bArr) {
        this.f6144i = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final byte a(int i7) {
        return this.f6144i[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final int b(int i7, int i10) {
        return i2.a(i7, 0, i10, this.f6144i);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final int d() {
        return this.f6144i.length;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final t1 e(int i7, int i10) {
        byte[] bArr = this.f6144i;
        int iK = t1.k(0, i10, bArr.length);
        return iK == 0 ? t1.f6136e : new s1(bArr, 0, iK);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final void h(byte[] bArr, int i7) {
        System.arraycopy(this.f6144i, 0, bArr, 0, i7);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final void i(v1 v1Var) throws ag.a1 {
        byte[] bArr = this.f6144i;
        v1Var.F(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final boolean j(t1 t1Var) {
        boolean z5 = t1Var instanceof u1;
        byte[] bArr = this.f6144i;
        if (z5) {
            return Arrays.equals(bArr, ((u1) t1Var).f6144i);
        }
        boolean z6 = t1Var instanceof s1;
        if (!z6) {
            return t1Var.j(this);
        }
        s1 s1Var = (s1) t1Var;
        int i7 = s1Var.f6121w;
        int length = bArr.length;
        if (length > i7) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > i7) {
            throw new IllegalArgumentException(a3.e.g(length, i7, "Ran off end of other: 0, ", ", "));
        }
        if (z5) {
            return t1.o(0, 0, length, bArr, ((u1) t1Var).f6144i);
        }
        if (!z6) {
            return t1Var.e(0, length).equals(e(0, length));
        }
        return t1.o(0, s1Var.f6120v, length, bArr, s1Var.f6119i);
    }
}
