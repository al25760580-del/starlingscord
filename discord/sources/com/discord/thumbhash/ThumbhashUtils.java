package com.discord.thumbhash;

import android.graphics.Bitmap;
import android.graphics.Color;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
final class ThumbhashUtils {

    public static final class Channel {

        /* JADX INFO: renamed from: ac, reason: collision with root package name */
        float[] f4594ac;

        /* JADX INFO: renamed from: dc, reason: collision with root package name */
        float f4595dc;
        int nx;
        int ny;
        float scale;

        public Channel(int i7, int i10) {
            this.nx = i7;
            this.ny = i10;
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                for (int i13 = i11 > 0 ? 0 : 1; i13 * i10 < (i10 - i11) * i7; i13++) {
                    i12++;
                }
                i11++;
            }
            this.f4594ac = new float[i12];
        }

        public int decode(byte[] bArr, int i7, int i10, float f2) {
            int i11 = 0;
            while (true) {
                float[] fArr = this.f4594ac;
                if (i11 >= fArr.length) {
                    return i10;
                }
                fArr[i11] = ((((bArr[(i10 >> 1) + i7] >> ((i10 & 1) << 2)) & 15) / 7.5f) - 1.0f) * f2;
                i10++;
                i11++;
            }
        }
    }

    public static float thumbHashToApproximateAspectRatio(byte[] bArr) {
        int i7;
        byte b10 = bArr[3];
        boolean z5 = (bArr[2] & ByteCompanionObject.MIN_VALUE) != 0;
        boolean z6 = (bArr[4] & ByteCompanionObject.MIN_VALUE) != 0;
        int i10 = 5;
        if (z6) {
            i7 = z5 ? 5 : 7;
        } else {
            i7 = b10 & 7;
        }
        if (z6) {
            i10 = b10 & 7;
        } else if (!z5) {
            i10 = 7;
        }
        return i7 / i10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fd A[LOOP:9: B:102:0x01f7->B:104:0x01fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d A[LOOP:2: B:57:0x0124->B:59:0x012d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0152 A[LOOP:3: B:61:0x0150->B:62:0x0152, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x017a  */
    /* JADX WARN: Code duplicated, block: B:68:0x017f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    /* JADX WARN: Code duplicated, block: B:77:0x019d  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01be  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c6 A[LOOP:7: B:88:0x01c2->B:90:0x01c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f0  */
    public static Bitmap thumbHashToRGBA(byte[] bArr, int i7, float f2) {
        int i10;
        int iMax;
        float f7;
        float f10;
        float f11;
        float f12;
        int i11;
        boolean z5;
        int iDecode;
        Channel channel;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float fThumbHashToApproximateAspectRatio;
        float f13;
        int iRound;
        int iRound2;
        int[] iArr;
        int i12;
        int iMax2;
        int i13;
        int iMax3;
        float[] fArr4;
        float[] fArr5;
        int i14;
        float[] fArr6;
        int i15;
        float[] fArr7;
        int i16;
        int i17;
        int i18;
        float f14;
        int i19;
        int i20;
        float f15;
        float f16;
        int i21;
        int i22;
        float f17;
        int i23;
        int i24;
        float f18;
        int i25;
        int i26;
        int i27;
        float f19;
        int i28;
        int i29;
        int i30;
        int i31;
        float f20;
        int i32 = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        int i33 = (bArr[3] & 255) | ((bArr[4] & 255) << 8);
        float f21 = (i32 & 63) / 63.0f;
        float f22 = (((i32 >> 6) & 63) / 31.5f) - 1.0f;
        float f23 = (((i32 >> 12) & 63) / 31.5f) - 1.0f;
        float f24 = ((i32 >> 18) & 31) / 31.0f;
        boolean z6 = (i32 >> 23) != 0;
        float f25 = ((i33 >> 3) & 63) / 63.0f;
        float f26 = ((i33 >> 9) & 63) / 63.0f;
        boolean z7 = (i33 >> 15) != 0;
        int i34 = 7;
        int iMax4 = Math.max(3, z7 ? z6 ? 5 : 7 : i33 & 7);
        if (!z7) {
            if (z6) {
                i10 = 5;
            }
            iMax = Math.max(3, i10);
            if (z6) {
                f7 = 15.0f;
                f10 = (bArr[5] & 15) / 15.0f;
            } else {
                f7 = 15.0f;
                f10 = 1.0f;
            }
            f11 = 1.0f;
            f12 = ((bArr[5] >> 4) & 15) / f7;
            i11 = z6 ? 6 : 5;
            Channel channel2 = new Channel(iMax4, iMax);
            z5 = z6;
            Channel channel3 = new Channel(3, 3);
            Channel channel4 = new Channel(3, 3);
            iDecode = channel4.decode(bArr, i11, channel3.decode(bArr, i11, channel2.decode(bArr, i11, 0, f24), f25 * f2), f26 * f2);
            if (z5) {
                channel = new Channel(5, 5);
                channel.decode(bArr, i11, iDecode, f12);
            } else {
                channel = null;
            }
            float[] fArr8 = channel2.f4594ac;
            fArr = channel3.f4594ac;
            fArr2 = channel4.f4594ac;
            fArr3 = z5 ? channel.f4594ac : null;
            fThumbHashToApproximateAspectRatio = thumbHashToApproximateAspectRatio(bArr);
            if (fThumbHashToApproximateAspectRatio > 1.0f) {
                f13 = 32.0f;
            } else {
                f13 = fThumbHashToApproximateAspectRatio * 32.0f;
            }
            iRound = Math.round(f13);
            iRound2 = Math.round(fThumbHashToApproximateAspectRatio > 1.0f ? 32.0f / fThumbHashToApproximateAspectRatio : 32.0f);
            iArr = new int[iRound * iRound2];
            if (z5) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            iMax2 = Math.max(iMax4, i12);
            if (z5) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            iMax3 = Math.max(iMax, i13);
            fArr4 = new float[iMax2];
            fArr5 = new float[iMax3];
            i14 = 0;
            while (i14 < iRound2) {
                fArr6 = fArr;
                i15 = 0;
                while (i15 < iRound) {
                    fArr7 = fArr2;
                    i16 = 0;
                    while (i16 < iMax2) {
                        fArr4[i16] = (float) Math.cos((3.141592653589793d / ((double) iRound)) * ((double) (i15 + 0.5f)) * ((double) i16));
                        i16++;
                        iMax4 = iMax4;
                        iMax2 = iMax2;
                    }
                    i17 = iMax4;
                    int i35 = iMax2;
                    i18 = 0;
                    while (i18 < iMax3) {
                        fArr5[i18] = (float) Math.cos((3.141592653589793d / ((double) iRound2)) * ((double) (i14 + 0.5f)) * ((double) i18));
                        i18++;
                        i15 = i15;
                        i14 = i14;
                    }
                    int i36 = i14;
                    int i37 = i15;
                    f14 = f21;
                    i19 = 0;
                    i20 = 0;
                    while (i19 < iMax) {
                        float f27 = fArr5[i19] * 2.0f;
                        if (i19 > 0) {
                            i30 = 0;
                        } else {
                            i30 = 1;
                        }
                        i31 = i20;
                        while (true) {
                            f20 = f14;
                            if (i30 * iMax < (iMax - i19) * i17) {
                                if (i30 <= i7 || i19 > i7) {
                                    f14 = f20;
                                } else {
                                    f14 = (fArr8[i31] * fArr4[i30] * f27) + f20;
                                }
                                i30++;
                                i31++;
                            }
                        }
                        i19++;
                        i20 = i31;
                        f14 = f20;
                    }
                    f15 = f22;
                    f16 = f23;
                    i22 = 0;
                    for (i21 = 0; i21 < 3; i21++) {
                        f19 = fArr5[i21] * 2.0f;
                        if (i21 > 0) {
                            i28 = 0;
                        } else {
                            i28 = 1;
                        }
                        i29 = i28;
                        while (i29 < 3 - i21) {
                            float f28 = fArr4[i29] * f19;
                            f15 = (fArr6[i22] * f28) + f15;
                            f16 = (fArr7[i22] * f28) + f16;
                            i29++;
                            i22++;
                        }
                    }
                    f17 = f10;
                    if (z5) {
                        i23 = 0;
                        i24 = 0;
                        while (i23 < 5) {
                            f18 = fArr5[i23] * 2.0f;
                            if (i23 > 0) {
                                i25 = 0;
                            } else {
                                i25 = 1;
                            }
                            i26 = i25;
                            while (true) {
                                i27 = i23;
                                if (i26 < 5 - i27) {
                                    f17 += fArr3[i24] * fArr4[i26] * f18;
                                    i26++;
                                    i24++;
                                    i23 = i27;
                                }
                            }
                            i23 = i27 + 1;
                        }
                    }
                    float f29 = f14 - (f15 * 0.6666667f);
                    float f30 = (((f14 * 3.0f) - f29) + f16) / 2.0f;
                    float f31 = f11;
                    iArr[(iRound * i36) + i37] = Color.argb(Math.max(0, Math.round(Math.min(f31, f17) * 255.0f)), Math.max(0, Math.round(Math.min(f31, f30) * 255.0f)), Math.max(0, Math.round(Math.min(f31, f30 - f16) * 255.0f)), Math.max(0, Math.round(Math.min(f31, f29) * 255.0f)));
                    i15 = i37 + 1;
                    i7 = i7;
                    iMax = iMax;
                    fArr2 = fArr7;
                    iMax4 = i17;
                    i14 = i36;
                    f11 = f31;
                    iMax2 = i35;
                }
                i14++;
                iMax = iMax;
                fArr = fArr6;
                f11 = f11;
                iMax2 = iMax2;
            }
            return Bitmap.createBitmap(iArr, iRound, iRound2, Bitmap.Config.ARGB_8888);
        }
        i34 = i33 & 7;
        i10 = i34;
        iMax = Math.max(3, i10);
        if (z6) {
            f7 = 15.0f;
            f10 = (bArr[5] & 15) / 15.0f;
        } else {
            f7 = 15.0f;
            f10 = 1.0f;
        }
        f11 = 1.0f;
        f12 = ((bArr[5] >> 4) & 15) / f7;
        if (z6) {
        }
        Channel channel5 = new Channel(iMax4, iMax);
        z5 = z6;
        Channel channel6 = new Channel(3, 3);
        Channel channel7 = new Channel(3, 3);
        iDecode = channel7.decode(bArr, i11, channel6.decode(bArr, i11, channel5.decode(bArr, i11, 0, f24), f25 * f2), f26 * f2);
        if (z5) {
            channel = new Channel(5, 5);
            channel.decode(bArr, i11, iDecode, f12);
        } else {
            channel = null;
        }
        float[] fArr9 = channel5.f4594ac;
        fArr = channel6.f4594ac;
        fArr2 = channel7.f4594ac;
        if (z5) {
        }
        fThumbHashToApproximateAspectRatio = thumbHashToApproximateAspectRatio(bArr);
        if (fThumbHashToApproximateAspectRatio > 1.0f) {
            f13 = 32.0f;
        } else {
            f13 = fThumbHashToApproximateAspectRatio * 32.0f;
        }
        iRound = Math.round(f13);
        iRound2 = Math.round(fThumbHashToApproximateAspectRatio > 1.0f ? 32.0f / fThumbHashToApproximateAspectRatio : 32.0f);
        iArr = new int[iRound * iRound2];
        if (z5) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        iMax2 = Math.max(iMax4, i12);
        if (z5) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        iMax3 = Math.max(iMax, i13);
        fArr4 = new float[iMax2];
        fArr5 = new float[iMax3];
        i14 = 0;
        while (i14 < iRound2) {
            fArr6 = fArr;
            i15 = 0;
            while (i15 < iRound) {
                fArr7 = fArr2;
                i16 = 0;
                while (i16 < iMax2) {
                    fArr4[i16] = (float) Math.cos((3.141592653589793d / ((double) iRound)) * ((double) (i15 + 0.5f)) * ((double) i16));
                    i16++;
                    iMax4 = iMax4;
                    iMax2 = iMax2;
                }
                i17 = iMax4;
                int i38 = iMax2;
                i18 = 0;
                while (i18 < iMax3) {
                    fArr5[i18] = (float) Math.cos((3.141592653589793d / ((double) iRound2)) * ((double) (i14 + 0.5f)) * ((double) i18));
                    i18++;
                    i15 = i15;
                    i14 = i14;
                }
                int i39 = i14;
                int i310 = i15;
                f14 = f21;
                i19 = 0;
                i20 = 0;
                while (i19 < iMax) {
                    float f210 = fArr5[i19] * 2.0f;
                    if (i19 > 0) {
                        i30 = 0;
                    } else {
                        i30 = 1;
                    }
                    i31 = i20;
                    while (true) {
                        f20 = f14;
                        if (i30 * iMax < (iMax - i19) * i17) {
                            if (i30 <= i7) {
                                f14 = f20;
                            } else {
                                f14 = f20;
                            }
                            i30++;
                            i31++;
                        }
                    }
                    i19++;
                    i20 = i31;
                    f14 = f20;
                }
                f15 = f22;
                f16 = f23;
                i22 = 0;
                while (i21 < 3) {
                    f19 = fArr5[i21] * 2.0f;
                    if (i21 > 0) {
                        i28 = 0;
                    } else {
                        i28 = 1;
                    }
                    i29 = i28;
                    while (i29 < 3 - i21) {
                        float f211 = fArr4[i29] * f19;
                        f15 = (fArr6[i22] * f211) + f15;
                        f16 = (fArr7[i22] * f211) + f16;
                        i29++;
                        i22++;
                    }
                }
                f17 = f10;
                if (z5) {
                    i23 = 0;
                    i24 = 0;
                    while (i23 < 5) {
                        f18 = fArr5[i23] * 2.0f;
                        if (i23 > 0) {
                            i25 = 0;
                        } else {
                            i25 = 1;
                        }
                        i26 = i25;
                        while (true) {
                            i27 = i23;
                            if (i26 < 5 - i27) {
                                f17 += fArr3[i24] * fArr4[i26] * f18;
                                i26++;
                                i24++;
                                i23 = i27;
                            }
                        }
                        i23 = i27 + 1;
                    }
                }
                float f212 = f14 - (f15 * 0.6666667f);
                float f32 = (((f14 * 3.0f) - f212) + f16) / 2.0f;
                float f33 = f11;
                iArr[(iRound * i39) + i310] = Color.argb(Math.max(0, Math.round(Math.min(f33, f17) * 255.0f)), Math.max(0, Math.round(Math.min(f33, f32) * 255.0f)), Math.max(0, Math.round(Math.min(f33, f32 - f16) * 255.0f)), Math.max(0, Math.round(Math.min(f33, f212) * 255.0f)));
                i15 = i310 + 1;
                i7 = i7;
                iMax = iMax;
                fArr2 = fArr7;
                iMax4 = i17;
                i14 = i39;
                f11 = f33;
                iMax2 = i38;
            }
            i14++;
            iMax = iMax;
            fArr = fArr6;
            f11 = f11;
            iMax2 = iMax2;
        }
        return Bitmap.createBitmap(iArr, iRound, iRound2, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap thumbHashToRGBA(byte[] bArr) {
        return thumbHashToRGBA(bArr, 1, 1.1f);
    }
}
