package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u1 f6136e = new u1(i2.f6021a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6137d = 0;

    static {
        int i7 = q1.f6096a;
    }

    public static int k(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(s0.g.d(i7, "Beginning index: ", " < 0"));
        }
        if (i10 < i7) {
            throw new IndexOutOfBoundsException(a3.e.g(i7, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a3.e.g(i10, i11, "End index: ", " >= "));
    }

    public static u1 m(byte[] bArr, int i7, int i10) {
        try {
            k(i7, i7 + i10, bArr.length);
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i7, bArr2, 0, i10);
            return new u1(bArr2);
        } catch (m2 e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public static /* bridge */ /* synthetic */ boolean o(int i7, int i10, int i11, byte[] bArr, byte[] bArr2) {
        int i12 = i7 + i11;
        k(i7, i12, bArr.length);
        k(i10, i11 + i10, bArr2.length);
        while (i7 < i12) {
            if (bArr[i7] != bArr2[i10]) {
                return false;
            }
            i7++;
            i10++;
        }
        return true;
    }

    public abstract byte a(int i7);

    public abstract int b(int i7, int i10);

    public abstract int d();

    public abstract t1 e(int i7, int i10);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        int iD = d();
        if (iD != t1Var.d()) {
            return false;
        }
        if (iD == 0) {
            return true;
        }
        int i7 = this.f6137d;
        int i10 = t1Var.f6137d;
        if (i7 == 0 || i10 == 0 || i7 == i10) {
            return j(t1Var);
        }
        return false;
    }

    public abstract void h(byte[] bArr, int i7);

    public final int hashCode() {
        int iB = this.f6137d;
        if (iB == 0) {
            int iD = d();
            iB = b(iD, iD);
            if (iB == 0) {
                iB = 1;
            }
            this.f6137d = iB;
        }
        return iB;
    }

    public abstract void i(v1 v1Var);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ag.w0(this);
    }

    public abstract boolean j(t1 t1Var);

    public final String toString() {
        byte[] bArr;
        String strConcat;
        byte[] bArr2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iD = d();
        if (d() <= 50) {
            int iD2 = d();
            if (iD2 == 0) {
                bArr2 = i2.f6021a;
            } else {
                byte[] bArr3 = new byte[iD2];
                h(bArr3, iD2);
                bArr2 = bArr3;
            }
            strConcat = z1.g(bArr2);
        } else {
            t1 t1VarE = e(0, 47);
            int iD3 = t1VarE.d();
            if (iD3 == 0) {
                bArr = i2.f6021a;
            } else {
                byte[] bArr4 = new byte[iD3];
                t1VarE.h(bArr4, iD3);
                bArr = bArr4;
            }
            strConcat = z1.g(bArr).concat("...");
        }
        return com.discord.chat.presentation.list.a.k(a3.e.t("<ByteString@", hexString, " size=", iD, " contents=\""), strConcat, "\">");
    }
}
