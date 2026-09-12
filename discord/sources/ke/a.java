package ke;

import gc.h1;
import java.util.ArrayList;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f14323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14324i;

    public a(ArrayList arrayList, int i7, int i10, int i11, int i12, int i13, int i14, float f2, String str) {
        this.f14316a = arrayList;
        this.f14317b = i7;
        this.f14318c = i10;
        this.f14319d = i11;
        this.f14320e = i12;
        this.f14321f = i13;
        this.f14322g = i14;
        this.f14323h = f2;
        this.f14324i = str;
    }

    public static a a(w wVar) throws h1 {
        String str;
        int i7;
        int i10;
        int i11;
        int i12;
        float f2;
        int i13;
        byte[] bArr = je.b.f13758a;
        try {
            wVar.G(4);
            int iU = (wVar.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = wVar.u() & 31;
            for (int i14 = 0; i14 < iU2; i14++) {
                int iZ = wVar.z();
                int i15 = wVar.f13861b;
                wVar.G(iZ);
                byte[] bArr2 = wVar.f13860a;
                byte[] bArr3 = new byte[iZ + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i15, bArr3, 4, iZ);
                arrayList.add(bArr3);
            }
            int iU3 = wVar.u();
            for (int i16 = 0; i16 < iU3; i16++) {
                int iZ2 = wVar.z();
                int i17 = wVar.f13861b;
                wVar.G(iZ2);
                byte[] bArr4 = wVar.f13860a;
                byte[] bArr5 = new byte[iZ2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i17, bArr5, 4, iZ2);
                arrayList.add(bArr5);
            }
            if (iU2 > 0) {
                je.r rVarF = je.b.F((byte[]) arrayList.get(0), iU, ((byte[]) arrayList.get(0)).length);
                int i18 = rVarF.f13834e;
                int i19 = rVarF.f13835f;
                int i20 = rVarF.f13841n;
                int i21 = rVarF.f13842o;
                int i22 = rVarF.f13843p;
                float f7 = rVarF.f13836g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(rVarF.f13830a), Integer.valueOf(rVarF.f13831b), Integer.valueOf(rVarF.f13832c));
                i7 = i19;
                i10 = i20;
                i11 = i21;
                i12 = i22;
                f2 = f7;
                i13 = i18;
            } else {
                str = null;
                i7 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                f2 = 1.0f;
                i13 = -1;
            }
            return new a(arrayList, iU, i13, i7, i10, i11, i12, f2, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw h1.a("Error parsing AVC config", e10);
        }
    }
}
