package ke;

import gc.h1;
import java.util.Collections;
import java.util.List;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f14350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14351g;

    public e(List list, int i7, int i10, int i11, int i12, float f2, String str) {
        this.f14345a = list;
        this.f14346b = i7;
        this.f14347c = i10;
        this.f14348d = i11;
        this.f14349e = i12;
        this.f14350f = f2;
        this.f14351g = str;
    }

    public static e a(w wVar) throws h1 {
        boolean z5;
        try {
            wVar.G(21);
            int iU = wVar.u() & 3;
            int iU2 = wVar.u();
            int i7 = wVar.f13861b;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                z5 = true;
                if (i11 >= iU2) {
                    break;
                }
                wVar.G(1);
                int iZ = wVar.z();
                for (int i13 = 0; i13 < iZ; i13++) {
                    int iZ2 = wVar.z();
                    i12 += iZ2 + 4;
                    wVar.G(iZ2);
                }
                i11++;
            }
            wVar.F(i7);
            byte[] bArr = new byte[i12];
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f2 = 1.0f;
            String strE = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iU2) {
                int iU3 = wVar.u() & 63;
                int iZ3 = wVar.z();
                int i19 = i10;
                while (i19 < iZ3) {
                    int iZ4 = wVar.z();
                    boolean z6 = z5;
                    int i20 = iU;
                    System.arraycopy(je.b.f13761d, i10, bArr, i18, 4);
                    int i21 = i18 + 4;
                    System.arraycopy(wVar.f13860a, wVar.f13861b, bArr, i21, iZ4);
                    if (iU3 == 33 && i19 == 0) {
                        je.p pVarE = je.b.E(bArr, i21, i21 + iZ4);
                        i14 = pVarE.j;
                        i15 = pVarE.k;
                        i16 = pVarE.f13827l;
                        float f7 = pVarE.f13826i;
                        strE = je.b.e(pVarE.f13818a, pVarE.f13819b, pVarE.f13820c, pVarE.f13821d, pVarE.f13822e, pVarE.f13823f);
                        f2 = f7;
                    }
                    i18 = i21 + iZ4;
                    wVar.G(iZ4);
                    i19++;
                    z5 = z6;
                    iU = i20;
                    iU2 = iU2;
                    i10 = 0;
                }
                i17++;
                i10 = 0;
            }
            return new e(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iU + 1, i14, i15, i16, f2, strE);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw h1.a("Error parsing HEVC config", e10);
        }
    }
}
