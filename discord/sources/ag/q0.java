package ag;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends r0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public q0(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new o0(str, charArray), (Character) '=');
        if (charArray.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // ag.r0
    public final void a(StringBuilder sb2, byte[] bArr, int i7) {
        int i10 = 0;
        c.m(0, i7, bArr.length);
        for (int i11 = i7; i11 >= 3; i11 -= 3) {
            int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (bArr[i10 + 2] & 255);
            o0 o0Var = this.f571a;
            char[] cArr = o0Var.f554b;
            char[] cArr2 = o0Var.f554b;
            sb2.append(cArr[i12 >>> 18]);
            sb2.append(cArr2[(i12 >>> 12) & 63]);
            sb2.append(cArr2[(i12 >>> 6) & 63]);
            sb2.append(cArr2[i12 & 63]);
            i10 += 3;
        }
        if (i10 < i7) {
            b(sb2, bArr, i10, i7 - i10);
        }
    }
}
