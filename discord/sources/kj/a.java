package kj;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import f0.e;
import gc.s0;
import ij.d;
import ij.k;
import java.util.Arrays;
import mj.b;
import ue.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f14550b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f14551c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f14552d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f14553e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f14554f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jj.a f14555a;

    public static int b(boolean[] zArr, int i7, int i10) {
        int i11 = 0;
        for (int i12 = i7; i12 < i7 + i10; i12++) {
            i11 <<= 1;
            if (zArr[i12]) {
                i11 |= 1;
            }
        }
        return i11;
    }

    public final s0 a(jj.a aVar) throws d {
        int i7;
        oj.a aVar2;
        String str;
        this.f14555a = aVar;
        b bVar = (b) aVar.f13914d;
        boolean z5 = aVar.f13913c;
        int i10 = aVar.f13912b;
        int i11 = (z5 ? 11 : 14) + (i10 << 2);
        int[] iArr = new int[i11];
        int i12 = ((z5 ? 88 : 112) + (i10 << 4)) * i10;
        boolean[] zArr = new boolean[i12];
        int i13 = 2;
        int i14 = 1;
        if (z5) {
            for (int i15 = 0; i15 < i11; i15++) {
                iArr[i15] = i15;
            }
        } else {
            int i16 = i11 / 2;
            int i17 = ((((i16 - 1) / 15) * 2) + (i11 + 1)) / 2;
            for (int i18 = 0; i18 < i16; i18++) {
                int i19 = (i18 / 15) + i18;
                iArr[(i16 - i18) - 1] = (i17 - i19) - 1;
                iArr[i16 + i18] = i19 + i17 + 1;
            }
        }
        int i20 = 0;
        int i21 = 0;
        while (true) {
            i7 = 12;
            if (i20 >= i10) {
                break;
            }
            int i22 = ((i10 - i20) << i13) + (z5 ? 9 : 12);
            int i23 = i20 << 1;
            int i24 = (i11 - 1) - i23;
            int i25 = 0;
            while (i25 < i22) {
                int i26 = i25 << 1;
                int i27 = 0;
                while (i27 < i13) {
                    int i28 = i23 + i27;
                    int i29 = i14;
                    int i30 = i23 + i25;
                    zArr[i21 + i26 + i27] = bVar.b(iArr[i28], iArr[i30]);
                    int i31 = i24 - i27;
                    zArr[(i22 * 2) + i21 + i26 + i27] = bVar.b(iArr[i30], iArr[i31]);
                    int i32 = i24 - i25;
                    zArr[(i22 * 4) + i21 + i26 + i27] = bVar.b(iArr[i31], iArr[i32]);
                    zArr[(i22 * 6) + i21 + i26 + i27] = bVar.b(iArr[i32], iArr[i28]);
                    i27++;
                    i14 = i29;
                    i10 = i10;
                    i13 = 2;
                }
                i25++;
                i13 = 2;
            }
            i21 += i22 << 3;
            i20++;
            i10 = i10;
            i13 = 2;
        }
        int i33 = i14;
        jj.a aVar3 = this.f14555a;
        int i34 = aVar3.f13912b;
        int i35 = 8;
        if (i34 <= 2) {
            aVar2 = oj.a.j;
            i7 = 6;
        } else if (i34 <= 8) {
            aVar2 = oj.a.f17265n;
            i7 = 8;
        } else if (i34 <= 22) {
            aVar2 = oj.a.f17262i;
            i7 = 10;
        } else {
            aVar2 = oj.a.f17261h;
        }
        int i36 = aVar3.f13911a;
        int i37 = i12 / i7;
        if (i37 < i36) {
            throw d.a();
        }
        int i38 = i12 % i7;
        int[] iArr2 = new int[i37];
        int i39 = 0;
        while (i39 < i37) {
            iArr2[i39] = b(zArr, i38, i7);
            i39++;
            i38 += i7;
        }
        try {
            new i(aVar2).h(i37 - i36, iArr2);
            int i40 = i33 << i7;
            int i41 = i40 - 1;
            int i42 = 0;
            int i43 = 0;
            while (i42 < i36) {
                int i44 = iArr2[i42];
                if (i44 == 0 || i44 == i41) {
                    throw d.a();
                }
                if (i44 == i33 || i44 == i40 - 2) {
                    i43++;
                }
                i42++;
                i33 = 1;
            }
            int i45 = (i36 * i7) - i43;
            boolean[] zArr2 = new boolean[i45];
            int i46 = 0;
            for (int i47 = 0; i47 < i36; i47++) {
                int i48 = iArr2[i47];
                int i49 = 1;
                if (i48 == 1 || i48 == i40 - 2) {
                    Arrays.fill(zArr2, i46, (i46 + i7) - 1, i48 > 1);
                    i46 = (i7 - 1) + i46;
                } else {
                    int i50 = i7 - 1;
                    while (i50 >= 0) {
                        int i51 = i46 + 1;
                        zArr2[i46] = (i48 & (i49 << i50)) != 0;
                        i50--;
                        i46 = i51;
                        i49 = 1;
                    }
                }
            }
            int i52 = (i45 + 7) / 8;
            byte[] bArr = new byte[i52];
            for (int i53 = 0; i53 < i52; i53++) {
                int i54 = i53 << 3;
                int i55 = i45 - i54;
                bArr[i53] = (byte) (i55 >= 8 ? b(zArr2, i54, 8) : b(zArr2, i54, i55) << (8 - i55));
            }
            StringBuilder sb2 = new StringBuilder(20);
            int i56 = 1;
            int i57 = 0;
            int i58 = 1;
            while (i57 < i45) {
                if (i58 != 6) {
                    int i59 = i58 == 4 ? 4 : 5;
                    if (i45 - i57 < i59) {
                        break;
                    }
                    int iB = b(zArr2, i57, i59);
                    i57 += i59;
                    int iB2 = e.b(i58);
                    if (iB2 == 0) {
                        str = f14550b[iB];
                    } else if (iB2 == 1) {
                        str = f14551c[iB];
                    } else if (iB2 == 2) {
                        str = f14552d[iB];
                    } else if (iB2 == 3) {
                        str = f14554f[iB];
                    } else {
                        if (iB2 != 4) {
                            throw new IllegalStateException("Bad table");
                        }
                        str = f14553e[iB];
                    }
                    if (str.startsWith("CTRL_")) {
                        char cCharAt = str.charAt(5);
                        if (cCharAt == 'B') {
                            i56 = 6;
                        } else if (cCharAt == 'D') {
                            i56 = 4;
                        } else if (cCharAt == 'P') {
                            i56 = 5;
                        } else if (cCharAt != 'L') {
                            i56 = cCharAt != 'M' ? 1 : 3;
                        } else {
                            i56 = 2;
                        }
                        if (str.charAt(6) != 'L') {
                            int i60 = i58;
                            i58 = i56;
                            i56 = i60;
                        }
                        i35 = 8;
                    } else {
                        sb2.append(str);
                    }
                    i58 = i56;
                    i35 = 8;
                } else {
                    if (i45 - i57 < 5) {
                        break;
                    }
                    int iB3 = b(zArr2, i57, 5);
                    int i61 = i57 + 5;
                    if (iB3 == 0) {
                        if (i45 - i61 < 11) {
                            break;
                        }
                        iB3 = b(zArr2, i61, 11) + 31;
                        i61 = i57 + 16;
                    }
                    int i62 = 0;
                    while (true) {
                        if (i62 >= iB3) {
                            i57 = i61;
                            break;
                        }
                        if (i45 - i61 < i35) {
                            i57 = i45;
                            break;
                        }
                        sb2.append((char) b(zArr2, i61, i35));
                        i61 += 8;
                        i62++;
                    }
                    i58 = i56;
                }
            }
            return new s0(bArr, sb2.toString(), null, null);
        } catch (oj.b e10) {
            d dVar = d.f11801i;
            if (k.f11814d) {
                throw new d(e10);
            }
            throw d.f11801i;
        }
    }
}
