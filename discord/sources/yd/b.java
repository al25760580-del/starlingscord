package yd;

import a4.i;
import android.graphics.Bitmap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import je.e0;
import je.w;
import vd.c;
import vd.e;
import vd.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w f23285m = new w();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w f23286n = new w();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f23287o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Inflater f23288p;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    @Override // vd.e
    public final f e(byte[] bArr, int i7, boolean z5) {
        char c8;
        int[] iArr;
        c cVar;
        int i10;
        int i11;
        int iU;
        int i12;
        int i13;
        int iW;
        w wVar = this.f23285m;
        wVar.D(bArr, i7);
        char c10 = 255;
        if (wVar.a() > 0 && (wVar.f13860a[wVar.f13861b] & 255) == 120) {
            if (this.f23288p == null) {
                this.f23288p = new Inflater();
            }
            Inflater inflater = this.f23288p;
            w wVar2 = this.f23286n;
            if (e0.E(wVar, wVar2, inflater)) {
                wVar.D(wVar2.f13860a, wVar2.f13862c);
            }
        }
        a aVar = this.f23287o;
        int i14 = 0;
        aVar.f23279d = 0;
        int[] iArr2 = aVar.f23277b;
        w wVar3 = aVar.f23276a;
        aVar.f23280e = 0;
        aVar.f23281f = 0;
        aVar.f23282g = 0;
        aVar.f23283h = 0;
        aVar.f23284i = 0;
        wVar3.C(0);
        aVar.f23278c = false;
        ArrayList arrayList = new ArrayList();
        while (wVar.a() >= 3) {
            int i15 = wVar.f13862c;
            int iU2 = wVar.u();
            int iZ = wVar.z();
            int i16 = wVar.f13861b + iZ;
            if (i16 > i15) {
                wVar.F(i15);
                c8 = c10;
                i10 = i14;
                iArr = iArr2;
                cVar = null;
            } else {
                char c11 = 128;
                if (iU2 != 128) {
                    switch (iU2) {
                        case 20:
                            if (iZ % 5 == 2) {
                                wVar.G(2);
                                Arrays.fill(iArr2, i14);
                                int i17 = iZ / 5;
                                int i18 = i14;
                                while (i18 < i17) {
                                    int iU3 = wVar.u();
                                    char c12 = c11;
                                    double dU = wVar.u();
                                    double dU2 = wVar.u() - 128;
                                    int[] iArr3 = iArr2;
                                    double dU3 = wVar.u() - 128;
                                    iArr3[iU3] = (e0.i((int) ((1.402d * dU2) + dU), 0, 255) << 16) | (wVar.u() << 24) | (e0.i((int) ((dU - (0.34414d * dU3)) - (dU2 * 0.71414d)), 0, 255) << 8) | e0.i((int) ((dU3 * 1.772d) + dU), 0, 255);
                                    i18++;
                                    c11 = c12;
                                    c10 = 255;
                                    iArr2 = iArr3;
                                }
                                c8 = c10;
                                iArr = iArr2;
                                aVar.f23278c = true;
                            } else {
                                c8 = c10;
                                iArr = iArr2;
                            }
                            break;
                        case 21:
                            if (iZ >= 4) {
                                wVar.G(3);
                                int i19 = iZ - 4;
                                if (((128 & wVar.u()) != 0 ? 1 : i14) == 0) {
                                    i12 = wVar3.f13861b;
                                    i13 = wVar3.f13862c;
                                    if (i12 < i13 && i19 > 0) {
                                        int iMin = Math.min(i19, i13 - i12);
                                        wVar.e(wVar3.f13860a, i12, iMin);
                                        wVar3.F(i12 + iMin);
                                    }
                                } else if (i19 >= 7 && (iW = wVar.w()) >= 4) {
                                    aVar.f23283h = wVar.z();
                                    aVar.f23284i = wVar.z();
                                    wVar3.C(iW - 4);
                                    i19 = iZ - 11;
                                    i12 = wVar3.f13861b;
                                    i13 = wVar3.f13862c;
                                    if (i12 < i13) {
                                        int iMin2 = Math.min(i19, i13 - i12);
                                        wVar.e(wVar3.f13860a, i12, iMin2);
                                        wVar3.F(i12 + iMin2);
                                    }
                                }
                            }
                            c8 = c10;
                            iArr = iArr2;
                            break;
                        case 22:
                            if (iZ >= 19) {
                                aVar.f23279d = wVar.z();
                                aVar.f23280e = wVar.z();
                                wVar.G(11);
                                aVar.f23281f = wVar.z();
                                aVar.f23282g = wVar.z();
                            }
                            c8 = c10;
                            iArr = iArr2;
                            break;
                        default:
                            c8 = c10;
                            iArr = iArr2;
                            break;
                    }
                    i10 = 0;
                    cVar = null;
                } else {
                    c8 = c10;
                    iArr = iArr2;
                    if (aVar.f23279d == 0 || aVar.f23280e == 0 || aVar.f23283h == 0 || aVar.f23284i == 0 || (i11 = wVar3.f13862c) == 0 || wVar3.f13861b != i11 || !aVar.f23278c) {
                        cVar = null;
                    } else {
                        wVar3.F(0);
                        int i20 = aVar.f23283h * aVar.f23284i;
                        int[] iArr4 = new int[i20];
                        int i21 = 0;
                        while (i21 < i20) {
                            int iU4 = wVar3.u();
                            if (iU4 != 0) {
                                iU = i21 + 1;
                                iArr4[i21] = iArr[iU4];
                            } else {
                                int iU5 = wVar3.u();
                                if (iU5 != 0) {
                                    iU = ((iU5 & 64) == 0 ? iU5 & 63 : ((iU5 & 63) << 8) | wVar3.u()) + i21;
                                    Arrays.fill(iArr4, i21, iU, (iU5 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0 ? 0 : iArr[wVar3.u()]);
                                }
                            }
                            i21 = iU;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, aVar.f23283h, aVar.f23284i, Bitmap.Config.ARGB_8888);
                        float f2 = aVar.f23281f;
                        float f7 = aVar.f23279d;
                        float f10 = f2 / f7;
                        float f11 = aVar.f23282g;
                        float f12 = aVar.f23280e;
                        cVar = new c(null, null, null, bitmapCreateBitmap, f11 / f12, 0, 0, f10, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.f23283h / f7, aVar.f23284i / f12, false, -16777216, Integer.MIN_VALUE, 0.0f);
                    }
                    i10 = 0;
                    aVar.f23279d = 0;
                    aVar.f23280e = 0;
                    aVar.f23281f = 0;
                    aVar.f23282g = 0;
                    aVar.f23283h = 0;
                    aVar.f23284i = 0;
                    wVar3.C(0);
                    aVar.f23278c = false;
                }
                wVar.F(i16);
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
            i14 = i10;
            c10 = c8;
            iArr2 = iArr;
        }
        return new i(Collections.unmodifiableList(arrayList));
    }
}
