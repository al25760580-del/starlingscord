package uj;

import com.google.zxing.Result;
import ij.l;
import ij.m;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f21161c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f21162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f21163b;

    public i(int i7) {
        switch (i7) {
            case 1:
                this.f21162a = new int[4];
                this.f21163b = new StringBuilder();
                break;
            default:
                this.f21162a = new int[4];
                this.f21163b = new StringBuilder();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    public Result a(int i7, mj.a aVar, int[] iArr) throws ij.h {
        String str;
        String str2;
        EnumMap enumMap;
        StringBuilder sb2 = this.f21163b;
        sb2.setLength(0);
        int[] iArr2 = this.f21162a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        byte b10 = 2;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i10 = aVar.f15838e;
        int iC = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 5 && iC < i10; i12++) {
            int iH = k.h(aVar, iArr2, iC, k.f21170g);
            sb2.append((char) ((iH % 10) + 48));
            for (int i13 : iArr2) {
                iC += i13;
            }
            if (iH >= 10) {
                i11 |= 1 << (4 - i12);
            }
            if (i12 != 4) {
                iC = aVar.c(aVar.b(iC));
            }
        }
        if (sb2.length() != 5) {
            throw ij.h.f11808i;
        }
        for (int i14 = 0; i14 < 10; i14++) {
            if (i11 == f21161c[i14]) {
                String string = sb2.toString();
                int length = string.length();
                int iCharAt = 0;
                for (int i15 = length - 2; i15 >= 0; i15 -= 2) {
                    iCharAt += string.charAt(i15) - '0';
                }
                int iCharAt2 = iCharAt * 3;
                for (int i16 = length - 1; i16 >= 0; i16 -= 2) {
                    iCharAt2 += string.charAt(i16) - '0';
                }
                if ((iCharAt2 * 3) % 10 != i14) {
                    throw ij.h.f11808i;
                }
                String string2 = sb2.toString();
                if (string2.length() == 5) {
                    char cCharAt = string2.charAt(0);
                    if (cCharAt == '0') {
                        str = "£";
                    } else if (cCharAt != '5') {
                        str = "";
                        if (cCharAt == '9') {
                            switch (string2.hashCode()) {
                                case 54118329:
                                    b10 = string2.equals("90000") ? (byte) 0 : (byte) -1;
                                    break;
                                case 54395376:
                                    b10 = string2.equals("99990") ? (byte) 1 : (byte) -1;
                                    break;
                                case 54395377:
                                    if (!string2.equals("99991")) {
                                        b10 = -1;
                                    }
                                    break;
                                default:
                                    b10 = -1;
                                    break;
                            }
                            switch (b10) {
                                case 0:
                                    str2 = null;
                                    break;
                                case 1:
                                    str2 = "Used";
                                    break;
                                case 2:
                                    str2 = "0.00";
                                    break;
                            }
                        }
                        if (str2 == null) {
                            enumMap = null;
                        } else {
                            enumMap = new EnumMap(l.class);
                            enumMap.put(l.f11820w, str2);
                        }
                    } else {
                        str = "$";
                    }
                    int i17 = Integer.parseInt(string2.substring(1));
                    String strValueOf = String.valueOf(i17 / 100);
                    int i18 = i17 % 100;
                    str2 = str + strValueOf + '.' + (i18 < 10 ? "0".concat(String.valueOf(i18)) : String.valueOf(i18));
                    if (str2 == null) {
                        enumMap = null;
                    } else {
                        enumMap = new EnumMap(l.class);
                        enumMap.put(l.f11820w, str2);
                    }
                } else {
                    enumMap = null;
                }
                float f2 = i7;
                Result result = new Result(string2, null, new m[]{new m((iArr[0] + iArr[1]) / 2.0f, f2), new m(iC, f2)}, ij.a.N);
                if (enumMap != null) {
                    result.a(enumMap);
                }
                return result;
            }
        }
        throw ij.h.f11808i;
    }
}
