package h5;

import com.google.zxing.Result;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f10349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f10350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f10351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f10352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10354g;

    public l(byte[] bArr, q qVar, q qVar2, q qVar3, s sVar, int i7, boolean z5) {
        this.f10348a = bArr;
        this.f10349b = qVar;
        this.f10350c = qVar2;
        this.f10351d = qVar3;
        this.f10352e = sVar;
        this.f10353f = i7;
        this.f10354g = z5;
    }

    public final Result a(ij.g gVar) {
        int i7;
        q qVar = this.f10349b;
        int i10 = qVar.f10374a;
        int i11 = qVar.f10375b;
        int i12 = this.f10353f;
        byte[] bArr = this.f10348a;
        if (i12 != 0 && i12 != 360) {
            if (i12 % 90 != 0 || i12 < 0 || i12 > 270) {
                throw new IllegalArgumentException("Invalid rotation (valid: 0, 90, 180, 270)");
            }
            byte[] bArr2 = new byte[bArr.length];
            int i13 = i10 * i11;
            boolean z5 = i12 % 180 != 0;
            boolean z6 = i12 % 270 != 0;
            boolean z7 = i12 >= 180;
            for (int i14 = 0; i14 < i11; i14++) {
                for (int i15 = 0; i15 < i10; i15++) {
                    int i16 = (i14 * i10) + i15;
                    int i17 = ((i14 >> 1) * i10) + i13 + (i15 & (-2));
                    int i18 = i17 + 1;
                    int i19 = z5 ? i11 : i10;
                    int i20 = z5 ? i10 : i11;
                    int i21 = z5 ? i14 : i15;
                    int i22 = z5 ? i15 : i14;
                    if (z6) {
                        i21 = (i19 - i21) - 1;
                    }
                    if (z7) {
                        i22 = (i20 - i22) - 1;
                    }
                    int i23 = (i22 * i19) + i21;
                    int i24 = ((i22 >> 1) * i19) + i13 + (i21 & (-2));
                    bArr2[i23] = (byte) (bArr[i16] & 255);
                    bArr2[i24] = (byte) (bArr[i17] & 255);
                    bArr2[i24 + 1] = (byte) (bArr[i18] & 255);
                }
            }
            bArr = bArr2;
        }
        if (i12 == 90 || i12 == 270) {
            i7 = i10;
            i10 = i11;
        } else {
            i7 = i11;
        }
        s sVarL = android.support.v4.media.session.b.l(i10, i7, this.f10352e, this.f10350c, this.f10351d);
        int i25 = sVarL.f10379c;
        int i26 = sVarL.f10377a;
        int i27 = i25 - i26;
        int i28 = sVarL.f10380d;
        int i29 = sVarL.f10378b;
        int i30 = i28 - i29;
        if (i27 < 1 || i30 < 1) {
            return null;
        }
        ij.i iVar = new ij.i(bArr, i10, i7, i26, i29, i27, i30, this.f10354g);
        try {
            e4.r rVar = new e4.r(9, new mj.d(iVar));
            if (gVar.f11807b == null) {
                gVar.c(null);
            }
            return gVar.b(rVar);
        } catch (ij.h unused) {
            e4.r rVar2 = new e4.r(9, new mj.d(new ij.e(iVar)));
            if (gVar.f11807b == null) {
                gVar.c(null);
            }
            return gVar.b(rVar2);
        } finally {
            gVar.reset();
        }
    }
}
