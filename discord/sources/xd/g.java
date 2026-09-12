package xd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import je.e0;
import je.v;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f22897h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f22898i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f22900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f22901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final aa.a f22902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f22903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f22904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f22905g;

    public g(int i7, int i10) {
        Paint paint = new Paint();
        this.f22899a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f22900b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f22901c = new Canvas();
        this.f22902d = new aa.a(719, 575, 0, 719, 0, 575);
        this.f22903e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f22904f = new f(i7, i10);
    }

    public static byte[] a(int i7, int i10, v vVar) {
        byte[] bArr = new byte[i7];
        for (int i11 = 0; i11 < i7; i11++) {
            bArr[i11] = (byte) vVar.i(i10);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            if (i7 < 8) {
                iArr[i7] = d(255, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i7] = d(255, (i7 & 1) != 0 ? 127 : 0, (i7 & 2) != 0 ? 127 : 0, (i7 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        iArr[0] = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            if (i7 < 8) {
                iArr[i7] = d(63, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) == 0 ? 0 : 255);
            } else {
                int i10 = i7 & 136;
                if (i10 == 0) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i10 == 8) {
                    iArr[i7] = d(127, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i10 == 128) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 43 : 0) + 127 + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + 127 + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + 127 + ((i7 & 64) == 0 ? 0 : 85));
                } else if (i10 == 136) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 43 : 0) + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + ((i7 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i7, int i10, int i11, int i12) {
        return (i7 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    public static void e(byte[] bArr, int[] iArr, int i7, int i10, int i11, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c8;
        char c10;
        int i12;
        int i13;
        boolean z5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z6;
        int i19;
        v vVar = new v(bArr, bArr.length);
        int i20 = i10;
        int i21 = i11;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (vVar.b() != 0) {
            int i22 = 8;
            int i23 = vVar.i(8);
            if (i23 != 240) {
                int i24 = 3;
                int i25 = 2;
                int i26 = 4;
                switch (i23) {
                    case 16:
                        if (i7 == 3) {
                            bArr2 = bArrA == null ? f22898i : bArrA;
                        } else if (i7 == 2) {
                            bArr2 = bArrA3 == null ? f22897h : bArrA3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z7 = false;
                        while (true) {
                            int i27 = vVar.i(2);
                            if (i27 != 0) {
                                i12 = i27;
                                i13 = 1;
                            } else {
                                if (vVar.h()) {
                                    int i28 = vVar.i(3) + 3;
                                    i12 = vVar.i(2);
                                    i13 = i28;
                                } else {
                                    if (vVar.h()) {
                                        i13 = 1;
                                        c8 = '\b';
                                        c10 = 4;
                                    } else {
                                        int i29 = vVar.i(2);
                                        if (i29 == 0) {
                                            c8 = '\b';
                                            c10 = 4;
                                            z7 = true;
                                        } else if (i29 == 1) {
                                            c8 = '\b';
                                            c10 = 4;
                                            i13 = 2;
                                        } else if (i29 == 2) {
                                            c8 = '\b';
                                            c10 = 4;
                                            i13 = vVar.i(4) + 12;
                                            i12 = vVar.i(2);
                                            z7 = z7;
                                        } else if (i29 != 3) {
                                            z7 = z7;
                                            c8 = '\b';
                                            c10 = 4;
                                        } else {
                                            c8 = '\b';
                                            int i30 = vVar.i(8) + 29;
                                            i12 = vVar.i(2);
                                            z7 = z7;
                                            i13 = i30;
                                            c10 = 4;
                                        }
                                        i12 = 0;
                                        i13 = 0;
                                    }
                                    i12 = 0;
                                }
                                if (i13 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        i12 = bArr2[i12];
                                    }
                                    paint.setColor(iArr[i12]);
                                    canvas.drawRect(i20, i21, i20 + i13, i21 + 1, paint);
                                }
                                i20 += i13;
                                if (z7) {
                                    vVar.c();
                                } else {
                                    paint = paint;
                                    z7 = z7;
                                }
                            }
                            c8 = '\b';
                            c10 = 4;
                            if (i13 == 0) {
                            }
                            i20 += i13;
                            if (z7) {
                                vVar.c();
                            } else {
                                paint = paint;
                                z7 = z7;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i7 == 3 ? bArrA2 == null ? j : bArrA2 : null;
                        boolean z10 = false;
                        while (true) {
                            int i31 = vVar.i(i26);
                            if (i31 != 0) {
                                z5 = z10;
                                i16 = i31;
                                i14 = 1;
                            } else if (vVar.h()) {
                                if (vVar.h()) {
                                    int i32 = vVar.i(i25);
                                    if (i32 == 0) {
                                        z5 = z10;
                                        i14 = 1;
                                    } else if (i32 != 1) {
                                        if (i32 == i25) {
                                            i14 = vVar.i(i26) + 9;
                                            i15 = vVar.i(i26);
                                        } else if (i32 != i24) {
                                            z5 = z10;
                                            i14 = 0;
                                        } else {
                                            i14 = vVar.i(i22) + 25;
                                            i15 = vVar.i(i26);
                                        }
                                        i16 = i15;
                                    } else {
                                        z5 = z10;
                                        i14 = i25;
                                    }
                                    i16 = 0;
                                } else {
                                    i14 = vVar.i(i25) + 4;
                                    i16 = vVar.i(i26);
                                }
                                z5 = z10;
                            } else {
                                int i33 = vVar.i(i24);
                                if (i33 != 0) {
                                    i14 = i33 + 2;
                                    z5 = z10;
                                } else {
                                    z5 = true;
                                    i14 = 0;
                                }
                                i16 = 0;
                            }
                            if (i14 == 0 || paint == 0) {
                                i17 = i24;
                                i18 = i25;
                            } else {
                                if (bArr3 != 0) {
                                    i16 = bArr3[i16];
                                }
                                paint.setColor(iArr[i16]);
                                i17 = i24;
                                i18 = 2;
                                canvas.drawRect(i20, i21, i20 + i14, i21 + 1, paint);
                            }
                            i20 += i14;
                            if (z5) {
                                vVar.c();
                            } else {
                                z10 = z5;
                                i24 = i17;
                                i25 = i18;
                                i26 = 4;
                                i22 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z11 = false;
                        while (true) {
                            int i34 = vVar.i(8);
                            if (i34 != 0) {
                                z6 = z11;
                                i19 = 1;
                            } else if (vVar.h()) {
                                z6 = z11;
                                i19 = vVar.i(7);
                                i34 = vVar.i(8);
                            } else {
                                int i35 = vVar.i(7);
                                if (i35 != 0) {
                                    z6 = z11;
                                    i19 = i35;
                                    i34 = 0;
                                } else {
                                    z6 = true;
                                    i34 = 0;
                                    i19 = 0;
                                }
                            }
                            if (i19 != 0 && paint != 0) {
                                paint.setColor(iArr[i34]);
                                canvas.drawRect(i20, i21, i20 + i19, i21 + 1, paint);
                            }
                            i20 += i19;
                            if (!z6) {
                                z11 = z6;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i23) {
                            case 32:
                                bArrA3 = a(4, 4, vVar);
                                break;
                            case 33:
                                bArrA = a(4, 8, vVar);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, vVar);
                                break;
                        }
                        break;
                }
            } else {
                i21 += 2;
                i20 = i10;
            }
        }
    }

    public static a f(v vVar, int i7) {
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        int i16 = vVar.i(8);
        vVar.s(8);
        int i17 = 2;
        int i18 = i7 - 2;
        int i19 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i18 > 0) {
            int i20 = vVar.i(i15);
            int i21 = vVar.i(i15);
            if ((i21 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                iArr = iArr2;
            } else {
                iArr = (i21 & 64) != 0 ? iArrB : iArrC;
            }
            if ((i21 & 1) != 0) {
                i13 = vVar.i(i15);
                i14 = vVar.i(i15);
                i10 = vVar.i(i15);
                i12 = vVar.i(i15);
                i11 = i18 - 6;
            } else {
                int i22 = vVar.i(6) << i17;
                int i23 = vVar.i(4) << 4;
                i10 = vVar.i(4) << 4;
                i11 = i18 - 4;
                i12 = vVar.i(i17) << 6;
                i13 = i22;
                i14 = i23;
            }
            if (i13 == 0) {
                i14 = i19;
                i10 = i14;
                i12 = 255;
            }
            double d6 = i13;
            double d7 = i14 - 128;
            double d8 = i10 - 128;
            iArr[i20] = d((byte) (255 - (i12 & 255)), e0.i((int) ((1.402d * d7) + d6), 0, 255), e0.i((int) ((d6 - (0.34414d * d8)) - (d7 * 0.71414d)), 0, 255), e0.i((int) ((d8 * 1.772d) + d6), 0, 255));
            i18 = i11;
            i19 = 0;
            i16 = i16;
            iArrC = iArrC;
            i15 = 8;
            i17 = 2;
        }
        return new a(i16, iArr2, iArrB, iArrC);
    }

    public static b g(v vVar) {
        byte[] bArr;
        int i7 = vVar.i(16);
        vVar.s(4);
        int i10 = vVar.i(2);
        boolean zH = vVar.h();
        vVar.s(1);
        byte[] bArr2 = e0.f13793f;
        if (i10 != 1) {
            if (i10 == 0) {
                int i11 = vVar.i(16);
                int i12 = vVar.i(16);
                if (i11 > 0) {
                    bArr2 = new byte[i11];
                    vVar.k(bArr2, i11);
                }
                if (i12 > 0) {
                    bArr = new byte[i12];
                    vVar.k(bArr, i12);
                }
            }
            return new b(i7, zH, bArr2, bArr);
        }
        vVar.s(vVar.i(8) * 16);
        bArr = bArr2;
        return new b(i7, zH, bArr2, bArr);
    }
}
