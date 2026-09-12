package ag;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f519d;

    public d1(y0 y0Var) {
        this.f519d = y0Var;
    }

    @Override // ag.j1
    public final int a() {
        return j1.d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j1 j1Var = (j1) obj;
        int iA = j1Var.a();
        int iD = j1.d((byte) 64);
        if (iD != iA) {
            return iD - j1Var.a();
        }
        y0 y0Var = ((d1) j1Var).f519d;
        y0 y0Var2 = this.f519d;
        byte[] bArr = y0Var2.f602e;
        int length = bArr.length;
        byte[] bArr2 = y0Var.f602e;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return u0.f583a.compare(y0Var2.m(), y0Var.m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            return this.f519d.equals(((d1) obj).f519d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(j1.d((byte) 64)), this.f519d});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        o0 o0Var;
        int i7;
        boolean z5;
        p0 p0Var = r0.f570d;
        r0 p0Var2 = p0Var.f573c;
        if (p0Var2 == null) {
            o0 o0Var2 = p0Var.f571a;
            char[] cArr = o0Var2.f554b;
            int i10 = 0;
            while (true) {
                if (i10 >= cArr.length) {
                    o0Var = o0Var2;
                    break;
                }
                char c8 = cArr[i10];
                if (c8 >= 'a' && c8 <= 'z') {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= cArr.length) {
                            z5 = false;
                            break;
                        }
                        char c10 = cArr[i11];
                        if (c10 >= 'A' && c10 <= 'Z') {
                            z5 = true;
                            break;
                        }
                        i11++;
                    }
                    if (!z5) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i12 = 0; i12 < cArr.length; i12++) {
                            char c11 = cArr[i12];
                            if (c11 >= 97 && c11 <= 122) {
                                c11 ^= 32;
                            }
                            cArr2[i12] = (char) c11;
                        }
                        o0Var = new o0(o0Var2.f553a.concat(".upperCase()"), cArr2);
                        byte[] bArr = o0Var.f559g;
                        if (!o0Var2.f560h || o0Var.f560h) {
                            break;
                            break;
                        }
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i7 = 65; i7 <= 90; i7++) {
                            int i13 = i7 | 32;
                            byte b10 = bArr[i7];
                            byte b11 = bArr[i13];
                            if (b10 == -1) {
                                bArrCopyOf[i7] = b11;
                            } else {
                                char c12 = (char) i7;
                                char c13 = (char) i13;
                                if (b11 != -1) {
                                    throw new IllegalStateException(c.d("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                                }
                                bArrCopyOf[i13] = b10;
                            }
                        }
                        o0Var = new o0(o0Var.f553a.concat(".ignoreCase()"), o0Var.f554b, bArrCopyOf, true);
                        break;
                    }
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                i10++;
            }
            p0Var2 = o0Var == o0Var2 ? p0Var : new p0(o0Var);
            p0Var.f573c = p0Var2;
        }
        byte[] bArrM = this.f519d.m();
        return s0.g.e("h'", p0Var2.c(bArrM, bArrM.length), "'");
    }
}
