package zj;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f24027a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f24028b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger[] f24029c;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f24029c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i7 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f24029c;
            if (i7 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i7] = bigIntegerArr2[i7 - 1].multiply(bigIntegerValueOf);
            i7++;
        }
    }

    public static String a(int i7, int[] iArr) throws ij.d {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i10 = 0; i10 < i7; i10++) {
            bigIntegerAdd = bigIntegerAdd.add(f24029c[(i7 - i10) - 1].multiply(BigInteger.valueOf(iArr[i10])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw ij.d.a();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0007 A[SYNTHETIC] */
    public static int b(int[] iArr, int i7, StringBuilder sb2) {
        int[] iArr2 = new int[15];
        boolean z5 = false;
        int i10 = 0;
        while (true) {
            int i11 = iArr[0];
            if (i7 < i11 && !z5) {
                int i12 = i7 + 1;
                int i13 = iArr[i7];
                if (i12 == i11) {
                    z5 = true;
                }
                if (i13 < 900) {
                    iArr2[i10] = i13;
                    i10++;
                } else {
                    if (i13 != 900 && i13 != 901 && i13 != 928) {
                        switch (i13) {
                            case 922:
                            case 923:
                            case 924:
                                z5 = true;
                                break;
                        }
                    } else {
                        z5 = true;
                    }
                    if (i10 % 15 != 0 || i13 == 902 || z5) {
                        if (i10 > 0) {
                            sb2.append(a(i10, iArr2));
                            i10 = 0;
                        }
                    }
                }
                i7 = i12;
                if (i10 % 15 != 0) {
                }
                if (i10 > 0) {
                    sb2.append(a(i10, iArr2));
                    i10 = 0;
                }
            }
        }
        return i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x00f0. Please report as an issue. */
    public static int c(int[] iArr, int i7, StringBuilder sb2) {
        char c8;
        char c10;
        int i10;
        int i11 = 1;
        int i12 = (iArr[0] - i7) << 1;
        int[] iArr2 = new int[i12];
        int[] iArr3 = new int[i12];
        int i13 = i7;
        boolean z5 = false;
        int i14 = 0;
        while (i13 < iArr[0] && !z5) {
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            if (i16 < 900) {
                iArr2[i14] = i16 / 30;
                iArr2[i14 + 1] = i16 % 30;
                i14 += 2;
            } else if (i16 != 913) {
                if (i16 != 928) {
                    switch (i16) {
                        case 900:
                            iArr2[i14] = 900;
                            i14++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i16) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z5 = true;
            } else {
                iArr2[i14] = 913;
                i13 += 2;
                iArr3[i14] = iArr[i15];
                i14++;
            }
            i13 = i15;
        }
        int i17 = 0;
        int i18 = 1;
        int i19 = 1;
        while (i17 < i14) {
            int i20 = iArr2[i17];
            int iB = f0.e.b(i18);
            char c11 = ' ';
            if (iB != 0) {
                if (iB == i11) {
                    if (i20 < 26) {
                        i10 = i20 + 97;
                        c10 = (char) i10;
                    } else {
                        if (i20 == 900) {
                            i18 = 1;
                        } else if (i20 != 913) {
                            switch (i20) {
                                case 26:
                                    c10 = c11;
                                    break;
                                case 27:
                                    i19 = i18;
                                    c10 = 0;
                                    i18 = 5;
                                    break;
                                case 28:
                                    i18 = 3;
                                    break;
                                case 29:
                                    i19 = i18;
                                    i18 = 6;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr3[i17]);
                        }
                        c8 = 913;
                        c10 = 0;
                    }
                    c8 = 913;
                } else if (iB != 2) {
                    char[] cArr = f24027a;
                    if (iB != 3) {
                        if (iB != 4) {
                            if (iB == 5) {
                                if (i20 < 29) {
                                    c11 = cArr[i20];
                                    i18 = i19;
                                    c10 = c11;
                                    c8 = 913;
                                } else if (i20 == 29 || i20 == 900) {
                                    c8 = 913;
                                    c10 = 0;
                                    i18 = 1;
                                } else {
                                    if (i20 == 913) {
                                        sb2.append((char) iArr3[i17]);
                                    }
                                    i18 = i19;
                                }
                            }
                            c8 = 913;
                            c10 = 0;
                        } else {
                            if (i20 < 26) {
                                c10 = (char) (i20 + 65);
                                i18 = i19;
                            } else {
                                if (i20 != 26) {
                                    if (i20 != 900) {
                                        i18 = i19;
                                    } else {
                                        i18 = 1;
                                    }
                                    c8 = 913;
                                    c10 = 0;
                                }
                                i18 = i19;
                                c10 = c11;
                            }
                            c8 = 913;
                        }
                    } else if (i20 < 29) {
                        c11 = cArr[i20];
                        c10 = c11;
                        c8 = 913;
                    } else if (i20 != 29) {
                        if (i20 == 900) {
                            i18 = 1;
                        } else if (i20 == 913) {
                            sb2.append((char) iArr3[i17]);
                        }
                        c8 = 913;
                        c10 = 0;
                    } else {
                        c8 = 913;
                        c10 = 0;
                        i18 = 1;
                    }
                } else {
                    if (i20 < 25) {
                        c11 = f24028b[i20];
                    } else {
                        if (i20 == 900) {
                            i18 = 1;
                        } else if (i20 != 913) {
                            switch (i20) {
                                case 25:
                                    i18 = 4;
                                    break;
                                case 27:
                                    i18 = 2;
                                    break;
                                case 28:
                                    c8 = 913;
                                    c10 = 0;
                                    i18 = 1;
                                    break;
                                case 29:
                                    i19 = i18;
                                    i18 = 6;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr3[i17]);
                        }
                        c8 = 913;
                        c10 = 0;
                    }
                    c10 = c11;
                    c8 = 913;
                }
            } else if (i20 < 26) {
                i10 = i20 + 65;
                c10 = (char) i10;
                c8 = 913;
            } else {
                if (i20 != 900) {
                    c8 = 913;
                    if (i20 != 913) {
                        switch (i20) {
                            case 26:
                                c10 = ' ';
                                break;
                            case 27:
                                i18 = 2;
                                break;
                            case 28:
                                i18 = 3;
                                break;
                            case 29:
                                i19 = i18;
                                i18 = 6;
                                break;
                        }
                    } else {
                        sb2.append((char) iArr3[i17]);
                    }
                } else {
                    c8 = 913;
                    i18 = 1;
                }
                c10 = 0;
            }
            if (c10 != 0) {
                sb2.append(c10);
            }
            i17++;
            i11 = 1;
        }
        return i13;
    }
}
