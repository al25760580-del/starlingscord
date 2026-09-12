package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class t2 implements x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f6138a;

    public t2(a aVar, o1 o1Var) {
        this.f6138a = o1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final void a(Object obj) {
        f3 f3Var = ((d2) obj).zzc;
        if (f3Var.f6011e) {
            f3Var.f6011e = false;
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final int b(o1 o1Var) {
        f3 f3Var = ((d2) o1Var).zzc;
        int i7 = f3Var.f6010d;
        if (i7 != -1) {
            return i7;
        }
        int iE = 0;
        for (int i10 = 0; i10 < f3Var.f6007a; i10++) {
            int i11 = f3Var.f6008b[i10] >>> 3;
            t1 t1Var = (t1) f3Var.f6009c[i10];
            int iS = v1.S(8);
            int iS2 = v1.S(i11) + v1.S(16);
            int iS3 = v1.S(24);
            int iD = t1Var.d();
            iE += iS + iS + iS2 + com.discord.chat.presentation.list.a.e(iD, iD, iS3);
        }
        f3Var.f6010d = iE;
        return iE;
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final boolean c(d2 d2Var, d2 d2Var2) {
        return d2Var.zzc.equals(d2Var2.zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final boolean d(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final void e(Object obj, w1 w1Var) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final void f(Object obj, Object obj2) {
        y2.o(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final d2 g() {
        o1 o1Var = this.f6138a;
        return o1Var instanceof d2 ? ((d2) o1Var).n() : ((c2) ((d2) o1Var).j(5)).b();
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final int h(d2 d2Var) {
        return d2Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final void i(Object obj, byte[] bArr, int i7, int i10, r1 r1Var) {
        d2 d2Var = (d2) obj;
        if (d2Var.zzc == f3.f6006f) {
            d2Var.zzc = f3.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }
}
