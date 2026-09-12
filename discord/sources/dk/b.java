package dk;

import com.facebook.imageutils.JfifUtil;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f7652a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public static void a(a5.g gVar, StringBuilder sb2, int i7, boolean z5) {
        while (i7 > 1) {
            if (gVar.d() < 11) {
                throw ij.d.a();
            }
            int iG = gVar.g(11);
            sb2.append(f(iG / 45));
            sb2.append(f(iG % 45));
            i7 -= 2;
        }
        if (i7 == 1) {
            if (gVar.d() < 6) {
                throw ij.d.a();
            }
            sb2.append(f(gVar.g(6)));
        }
        if (z5) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i10 = length + 1;
                        if (sb2.charAt(i10) == '%') {
                            sb2.deleteCharAt(i10);
                        } else {
                            sb2.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb2.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:115:0x0141  */
    /* JADX WARN: Code duplicated, block: B:116:0x0143  */
    /* JADX WARN: Code duplicated, block: B:118:0x0147  */
    /* JADX WARN: Code duplicated, block: B:123:0x0150  */
    /* JADX WARN: Code duplicated, block: B:124:0x0152  */
    /* JADX WARN: Code duplicated, block: B:126:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0162  */
    /* JADX WARN: Code duplicated, block: B:134:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:140:0x016d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081 A[PHI: r10
      0x0081: PHI (r10v2 int) = (r10v1 int), (r10v7 int) binds: [B:31:0x0077, B:35:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc A[PHI: r17
      0x00cc: PHI (r17v2 int) = (r17v1 int), (r17v1 int), (r17v4 int), (r17v1 int) binds: [B:54:0x00b2, B:59:0x00bc, B:66:0x00ca, B:65:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2 A[PHI: r27
      0x00e2: PHI (r27v6 boolean) = (r27v5 boolean), (r27v5 boolean), (r27v5 boolean), (r27v7 boolean), (r27v7 boolean), (r27v7 boolean) binds: [B:79:0x00e8, B:81:0x00ec, B:83:0x00f0, B:71:0x00d6, B:72:0x00d8, B:74:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    public static void b(a5.g gVar, StringBuilder sb2, int i7, mj.c cVar, ArrayList arrayList, Map map) {
        String strName;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        boolean z12;
        byte b10;
        boolean z13;
        int i17;
        boolean z14;
        boolean z15;
        boolean z16;
        int i18;
        if ((i7 << 3) > gVar.d()) {
            throw ij.d.a();
        }
        byte[] bArr = new byte[i7];
        int i19 = 0;
        for (int i20 = 0; i20 < i7; i20++) {
            bArr[i20] = (byte) gVar.g(8);
        }
        if (cVar == null) {
            String str = mj.f.f15862a;
            if (map != null) {
                ij.c cVar2 = ij.c.f11797v;
                if (map.containsKey(cVar2)) {
                    strName = map.get(cVar2).toString();
                } else {
                    z5 = true;
                    if (i7 <= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = true;
                    z10 = true;
                    int i21 = 0;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                    int i22 = 0;
                    i16 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    while (i10 < i7 && (z5 || z7 || z10)) {
                        b10 = bArr[i10];
                        z13 = z5;
                        i17 = b10 & 255;
                        if (z10) {
                            if (i11 > 0) {
                                z14 = z6;
                                if ((b10 & ByteCompanionObject.MIN_VALUE) != 0) {
                                    if ((b10 & 64) != 0) {
                                        i18 = i11 + 1;
                                        if ((b10 & 32) == 0) {
                                            i13++;
                                        } else {
                                            i18 = i11 + 2;
                                            if ((b10 & 16) == 0) {
                                                i14++;
                                            } else {
                                                i11 += 3;
                                                if ((b10 & 8) == 0) {
                                                    i15++;
                                                }
                                            }
                                        }
                                        i11 = i18;
                                    }
                                }
                            } else if ((b10 & ByteCompanionObject.MIN_VALUE) != 0) {
                                i11--;
                                z14 = z6;
                            } else {
                                z14 = z6;
                            }
                            z10 = false;
                        } else {
                            z14 = z6;
                        }
                        if (!z13) {
                            z15 = z13;
                        } else if (i17 > 127 || i17 >= 160) {
                            if (i17 > 159 && (i17 < 192 || i17 == 215 || i17 == 247)) {
                                i16++;
                            }
                            z15 = z13;
                        } else {
                            z15 = false;
                        }
                        if (z7) {
                            z16 = z15;
                        } else if (i12 > 0) {
                            z16 = z15;
                            if (i17 >= 64 || i17 == 127 || i17 > 252) {
                                z7 = false;
                            } else {
                                i12--;
                            }
                        } else {
                            z16 = z15;
                            if (i17 != 128 || i17 == 160 || i17 > 239) {
                                z7 = false;
                            } else if (i17 <= 160 || i17 >= 224) {
                                if (i17 > 127) {
                                    i12++;
                                    int i25 = i23 + 1;
                                    if (i25 > i19) {
                                        i19 = i25;
                                        i23 = i19;
                                    } else {
                                        i23 = i25;
                                    }
                                } else {
                                    i23 = 0;
                                }
                                i24 = 0;
                            } else {
                                i21++;
                                int i26 = i24 + 1;
                                if (i26 > i22) {
                                    i22 = i26;
                                    i24 = i22;
                                } else {
                                    i24 = i26;
                                }
                                i23 = 0;
                            }
                        }
                        i10++;
                        z5 = z16;
                        z6 = z14;
                    }
                    z11 = z5;
                    boolean z17 = z6;
                    if (z10 && i11 > 0) {
                        z10 = false;
                    }
                    if (z7 || i12 <= 0) {
                        z12 = z7;
                    } else {
                        z12 = false;
                    }
                    if (!z10 && (z17 || i13 + i14 + i15 > 0)) {
                        strName = "UTF8";
                    } else if (!z12 && (mj.f.f15863b || i22 >= 3 || i19 >= 3)) {
                        strName = "SJIS";
                    } else if (z11 || !z12) {
                        if (z11) {
                            strName = "ISO8859_1";
                        } else if (z12) {
                            strName = "SJIS";
                        } else if (z10) {
                            strName = "UTF8";
                        } else {
                            strName = mj.f.f15862a;
                        }
                    } else if (!(i22 == 2 && i21 == 2) && i16 * 10 < i7) {
                        strName = "ISO8859_1";
                    } else {
                        strName = "SJIS";
                    }
                }
            } else {
                z5 = true;
                if (i7 <= 3) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                z7 = true;
                z10 = true;
                int i27 = 0;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
                i15 = 0;
                int i28 = 0;
                i16 = 0;
                int i29 = 0;
                int i210 = 0;
                while (i10 < i7) {
                    b10 = bArr[i10];
                    z13 = z5;
                    i17 = b10 & 255;
                    if (z10) {
                        z14 = z6;
                    } else {
                        if (i11 > 0) {
                            z14 = z6;
                            if ((b10 & ByteCompanionObject.MIN_VALUE) != 0) {
                                if ((b10 & 64) != 0) {
                                    i18 = i11 + 1;
                                    if ((b10 & 32) == 0) {
                                        i13++;
                                    } else {
                                        i18 = i11 + 2;
                                        if ((b10 & 16) == 0) {
                                            i14++;
                                        } else {
                                            i11 += 3;
                                            if ((b10 & 8) == 0) {
                                                i15++;
                                            }
                                        }
                                    }
                                    i11 = i18;
                                }
                            }
                        } else if ((b10 & ByteCompanionObject.MIN_VALUE) != 0) {
                            i11--;
                            z14 = z6;
                        } else {
                            z14 = z6;
                        }
                        z10 = false;
                    }
                    if (!z13) {
                        z15 = z13;
                    } else {
                        if (i17 > 127) {
                        }
                        if (i17 > 159) {
                            i16++;
                        }
                        z15 = z13;
                    }
                    if (z7) {
                        z16 = z15;
                    } else if (i12 > 0) {
                        z16 = z15;
                        if (i17 >= 64) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                    } else {
                        z16 = z15;
                        if (i17 != 128) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                    }
                    i10++;
                    z5 = z16;
                    z6 = z14;
                }
                z11 = z5;
                boolean z18 = z6;
                if (z10) {
                    z10 = false;
                }
                if (z7) {
                    z12 = z7;
                } else {
                    z12 = z7;
                }
                if (!z10) {
                    if (!z12) {
                        if (z11) {
                            if (z11) {
                                strName = "ISO8859_1";
                            } else if (z12) {
                                strName = "SJIS";
                            } else if (z10) {
                                strName = "UTF8";
                            } else {
                                strName = mj.f.f15862a;
                            }
                        } else if (z11) {
                            strName = "ISO8859_1";
                        } else if (z12) {
                            strName = "SJIS";
                        } else if (z10) {
                            strName = "UTF8";
                        } else {
                            strName = mj.f.f15862a;
                        }
                    } else if (z11) {
                        if (z11) {
                            strName = "ISO8859_1";
                        } else if (z12) {
                            strName = "SJIS";
                        } else if (z10) {
                            strName = "UTF8";
                        } else {
                            strName = mj.f.f15862a;
                        }
                    } else if (z11) {
                        strName = "ISO8859_1";
                    } else if (z12) {
                        strName = "SJIS";
                    } else if (z10) {
                        strName = "UTF8";
                    } else {
                        strName = mj.f.f15862a;
                    }
                } else if (!z12) {
                    if (z11) {
                        if (z11) {
                            strName = "ISO8859_1";
                        } else if (z12) {
                            strName = "SJIS";
                        } else if (z10) {
                            strName = "UTF8";
                        } else {
                            strName = mj.f.f15862a;
                        }
                    } else if (z11) {
                        strName = "ISO8859_1";
                    } else if (z12) {
                        strName = "SJIS";
                    } else if (z10) {
                        strName = "UTF8";
                    } else {
                        strName = mj.f.f15862a;
                    }
                } else if (z11) {
                    if (z11) {
                        strName = "ISO8859_1";
                    } else if (z12) {
                        strName = "SJIS";
                    } else if (z10) {
                        strName = "UTF8";
                    } else {
                        strName = mj.f.f15862a;
                    }
                } else if (z11) {
                    strName = "ISO8859_1";
                } else if (z12) {
                    strName = "SJIS";
                } else if (z10) {
                    strName = "UTF8";
                } else {
                    strName = mj.f.f15862a;
                }
            }
        } else {
            strName = cVar.name();
        }
        try {
            sb2.append(new String(bArr, strName));
            arrayList.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw ij.d.a();
        }
    }

    public static void c(a5.g gVar, StringBuilder sb2, int i7) {
        if (i7 * 13 > gVar.d()) {
            throw ij.d.a();
        }
        byte[] bArr = new byte[i7 * 2];
        int i10 = 0;
        while (i7 > 0) {
            int iG = gVar.g(13);
            int i11 = (iG % 96) | ((iG / 96) << 8);
            int i12 = i11 + (i11 < 959 ? 41377 : 42657);
            bArr[i10] = (byte) (i12 >> 8);
            bArr[i10 + 1] = (byte) i12;
            i10 += 2;
            i7--;
        }
        try {
            sb2.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw ij.d.a();
        }
    }

    public static void d(a5.g gVar, StringBuilder sb2, int i7) {
        if (i7 * 13 > gVar.d()) {
            throw ij.d.a();
        }
        byte[] bArr = new byte[i7 * 2];
        int i10 = 0;
        while (i7 > 0) {
            int iG = gVar.g(13);
            int i11 = (iG % JfifUtil.MARKER_SOFn) | ((iG / JfifUtil.MARKER_SOFn) << 8);
            int i12 = i11 + (i11 < 7936 ? 33088 : 49472);
            bArr[i10] = (byte) (i12 >> 8);
            bArr[i10 + 1] = (byte) i12;
            i10 += 2;
            i7--;
        }
        try {
            sb2.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw ij.d.a();
        }
    }

    public static void e(a5.g gVar, StringBuilder sb2, int i7) {
        while (i7 >= 3) {
            if (gVar.d() < 10) {
                throw ij.d.a();
            }
            int iG = gVar.g(10);
            if (iG >= 1000) {
                throw ij.d.a();
            }
            sb2.append(f(iG / 100));
            sb2.append(f((iG / 10) % 10));
            sb2.append(f(iG % 10));
            i7 -= 3;
        }
        if (i7 == 2) {
            if (gVar.d() < 7) {
                throw ij.d.a();
            }
            int iG2 = gVar.g(7);
            if (iG2 >= 100) {
                throw ij.d.a();
            }
            sb2.append(f(iG2 / 10));
            sb2.append(f(iG2 % 10));
            return;
        }
        if (i7 == 1) {
            if (gVar.d() < 4) {
                throw ij.d.a();
            }
            int iG3 = gVar.g(4);
            if (iG3 >= 10) {
                throw ij.d.a();
            }
            sb2.append(f(iG3));
        }
    }

    public static char f(int i7) throws ij.d {
        char[] cArr = f7652a;
        if (i7 < cArr.length) {
            return cArr[i7];
        }
        throw ij.d.a();
    }
}
