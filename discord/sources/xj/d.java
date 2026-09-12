package xj;

import fh.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends s {
    public final void q(StringBuilder sb2, int i7) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        r(i7, length, sb2);
    }

    public final void r(int i7, int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < 4; i11++) {
            int iQ = n8.f.Q((i11 * 10) + i7, 10, (mj.a) ((n8.f) this.f9257b).f16510e);
            if (iQ / 100 == 0) {
                sb2.append('0');
            }
            if (iQ / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(iQ);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 13; i13++) {
            int iCharAt = sb2.charAt(i13 + i10) - '0';
            if ((i13 & 1) == 0) {
                iCharAt *= 3;
            }
            i12 += iCharAt;
        }
        int i14 = 10 - (i12 % 10);
        sb2.append(i14 != 10 ? i14 : 0);
    }
}
