package qr;

import a5.i0;
import kotlin.jvm.internal.Intrinsics;
import rn.e0;
import rn.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends i0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f19022v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a5.b0 writer, boolean z5) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f19022v = z5;
    }

    @Override // a5.i0
    public final void q(byte b10) {
        if (this.f19022v) {
            rn.x xVar = rn.y.f19500e;
            w(String.valueOf(b10 & 255));
        } else {
            rn.x xVar2 = rn.y.f19500e;
            u(String.valueOf(b10 & 255));
        }
    }

    @Override // a5.i0
    public final void s(int i7) {
        if (this.f19022v) {
            rn.a0 a0Var = rn.b0.f19461e;
            w(Long.toString(((long) i7) & 4294967295L, 10));
        } else {
            rn.a0 a0Var2 = rn.b0.f19461e;
            u(Long.toString(((long) i7) & 4294967295L, 10));
        }
    }

    @Override // a5.i0
    public final void t(long j) {
        int i7 = 63;
        String str = "0";
        if (this.f19022v) {
            rn.d0 d0Var = e0.f19470e;
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j5 = (j >>> 1) / ((long) 5);
                    long j7 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j5 * j7)), 10);
                    while (j5 > 0) {
                        i7--;
                        cArr[i7] = Character.forDigit((int) (j5 % j7), 10);
                        j5 /= j7;
                    }
                    str = new String(cArr, i7, 64 - i7);
                }
            }
            w(str);
            return;
        }
        rn.d0 d0Var2 = e0.f19470e;
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j10 = (j >>> 1) / ((long) 5);
                long j11 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j10 * j11)), 10);
                while (j10 > 0) {
                    i7--;
                    cArr2[i7] = Character.forDigit((int) (j10 % j11), 10);
                    j10 /= j11;
                }
                str = new String(cArr2, i7, 64 - i7);
            }
        }
        u(str);
    }

    @Override // a5.i0
    public final void v(short s2) {
        if (this.f19022v) {
            h0 h0Var = rn.i0.f19474e;
            w(String.valueOf(s2 & 65535));
        } else {
            h0 h0Var2 = rn.i0.f19474e;
            u(String.valueOf(s2 & 65535));
        }
    }
}
