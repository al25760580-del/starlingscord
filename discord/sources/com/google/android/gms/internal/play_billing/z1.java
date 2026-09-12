package com.google.android.gms.internal.play_billing;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6196a = new a();

    public static int C(byte[] bArr, int i7, h2 h2Var, r1 r1Var) throws m2 {
        e2 e2Var = (e2) h2Var;
        int I = I(bArr, i7, r1Var);
        int i10 = r1Var.f6106a;
        if (i10 < 0) {
            throw new m2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - I) {
            throw new m2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i11 = i10 + I;
        while (I < i11) {
            I = I(bArr, I, r1Var);
            e2Var.e(r1Var.f6106a);
        }
        if (I == i11) {
            return I;
        }
        throw new m2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static String D(int i7, int i10, String str) {
        if (i7 < 0) {
            return p("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return p("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(kk.b.h(i10, "negative size: "));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[PHI: r5
      0x00a3: PHI (r5v6 byte) = (r5v5 byte), (r5v9 byte) binds: [B:45:0x009e, B:47:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00bb A[SYNTHETIC] */
    public static int F(byte[] bArr, int i7, r1 r1Var) throws m2 {
        int I = I(bArr, i7, r1Var);
        int i10 = r1Var.f6106a;
        if (i10 < 0) {
            throw new m2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            r1Var.f6108c = "";
            return I;
        }
        int i11 = n3.f6076a;
        int length = bArr.length;
        if ((((length - I) - i10) | I | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(I), Integer.valueOf(i10)));
        }
        int i12 = I + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (I < i12) {
            byte b10 = bArr[I];
            if (b10 < 0) {
                break;
            }
            I++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (I < i12) {
            int i14 = I + 1;
            byte b11 = bArr[I];
            if (b11 >= 0) {
                cArr[i13] = (char) b11;
                i13++;
                I = i14;
                while (I < i12) {
                    byte b12 = bArr[I];
                    if (b12 < 0) {
                        break;
                    }
                    I++;
                    cArr[i13] = (char) b12;
                    i13++;
                }
            } else {
                if (b11 >= -32) {
                    if (b11 >= -16) {
                        if (i14 >= i12 - 2) {
                            throw new m2("Protocol message had invalid UTF-8.");
                        }
                        byte b13 = bArr[i14];
                        int i15 = I + 3;
                        byte b14 = bArr[I + 2];
                        I += 4;
                        byte b15 = bArr[i15];
                        if (!z(b13)) {
                            if ((((b13 + 112) + (b11 << 28)) >> 30) == 0 && !z(b14) && !z(b15)) {
                                int i16 = ((b13 & 63) << 12) | ((b11 & 7) << 18) | ((b14 & 63) << 6) | (b15 & 63);
                                cArr[i13] = (char) ((i16 >>> 10) + 55232);
                                cArr[i13 + 1] = (char) ((i16 & 1023) + 56320);
                                i13 += 2;
                            }
                        }
                        throw new m2("Protocol message had invalid UTF-8.");
                    }
                    if (i14 >= i12 - 1) {
                        throw new m2("Protocol message had invalid UTF-8.");
                    }
                    int i17 = i13 + 1;
                    int i18 = I + 2;
                    byte b16 = bArr[i14];
                    I += 3;
                    byte b17 = bArr[i18];
                    if (!z(b16)) {
                        if (b11 != -32) {
                            if (b11 != -19) {
                                if (!z(b17)) {
                                    cArr[i13] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i13 = i17;
                                }
                            } else if (b16 < -96) {
                                b11 = -19;
                                if (!z(b17)) {
                                    cArr[i13] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i13 = i17;
                                }
                            }
                        } else if (b16 >= -96) {
                            b11 = -32;
                            if (b11 != -19) {
                                if (!z(b17)) {
                                    cArr[i13] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i13 = i17;
                                }
                            } else if (b16 < -96) {
                                b11 = -19;
                                if (!z(b17)) {
                                    cArr[i13] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i13 = i17;
                                }
                            }
                        }
                    }
                    throw new m2("Protocol message had invalid UTF-8.");
                }
                if (i14 >= i12) {
                    throw new m2("Protocol message had invalid UTF-8.");
                }
                int i19 = i13 + 1;
                I += 2;
                byte b18 = bArr[i14];
                if (b11 < -62 || z(b18)) {
                    throw new m2("Protocol message had invalid UTF-8.");
                }
                cArr[i13] = (char) ((b18 & 63) | ((b11 & 31) << 6));
                i13 = i19;
            }
        }
        r1Var.f6108c = new String(cArr, 0, i13);
        return i12;
    }

    public static int H(int i7, byte[] bArr, int i10, int i11, f3 f3Var, r1 r1Var) throws m2 {
        if ((i7 >>> 3) == 0) {
            throw new m2("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            int iL = L(bArr, i10, r1Var);
            f3Var.c(i7, Long.valueOf(r1Var.f6107b));
            return iL;
        }
        if (i12 == 1) {
            f3Var.c(i7, Long.valueOf(P(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int I = I(bArr, i10, r1Var);
            int i13 = r1Var.f6106a;
            if (i13 < 0) {
                throw new m2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - I) {
                throw new m2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                f3Var.c(i7, t1.f6136e);
            } else {
                f3Var.c(i7, t1.m(bArr, I, i13));
            }
            return I + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new m2("Protocol message contained an invalid tag (zero).");
            }
            f3Var.c(i7, Integer.valueOf(n(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i7 & (-8)) | 4;
        f3 f3VarB = f3.b();
        int i15 = r1Var.f6109d + 1;
        r1Var.f6109d = i15;
        Q(i15);
        int i16 = 0;
        while (i10 < i11) {
            int I2 = I(bArr, i10, r1Var);
            int i17 = r1Var.f6106a;
            if (i17 == i14) {
                i16 = i17;
                i10 = I2;
                break;
            }
            i10 = H(i17, bArr, I2, i11, f3VarB, r1Var);
            i16 = i17;
        }
        r1Var.f6109d--;
        if (i10 > i11 || i16 != i14) {
            throw new m2("Failed to parse the message.");
        }
        f3Var.c(i7, f3VarB);
        return i10;
    }

    public static int I(byte[] bArr, int i7, r1 r1Var) {
        int i10 = i7 + 1;
        byte b10 = bArr[i7];
        if (b10 < 0) {
            return J(b10, bArr, i10, r1Var);
        }
        r1Var.f6106a = b10;
        return i10;
    }

    public static int J(int i7, byte[] bArr, int i10, r1 r1Var) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i7 & 127;
        if (b10 >= 0) {
            r1Var.f6106a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            r1Var.f6106a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & ByteCompanionObject.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            r1Var.f6106a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & ByteCompanionObject.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            r1Var.f6106a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                r1Var.f6106a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int K(int i7, byte[] bArr, int i10, int i11, h2 h2Var, r1 r1Var) {
        e2 e2Var = (e2) h2Var;
        int I = I(bArr, i10, r1Var);
        e2Var.e(r1Var.f6106a);
        while (I < i11) {
            int I2 = I(bArr, I, r1Var);
            if (i7 != r1Var.f6106a) {
                break;
            }
            I = I(bArr, I2, r1Var);
            e2Var.e(r1Var.f6106a);
        }
        return I;
    }

    public static int L(byte[] bArr, int i7, r1 r1Var) {
        long j = bArr[i7];
        int i10 = i7 + 1;
        if (j >= 0) {
            r1Var.f6107b = j;
            return i10;
        }
        int i11 = i7 + 2;
        byte b10 = bArr[i10];
        long j5 = (j & 127) | (((long) (b10 & ByteCompanionObject.MAX_VALUE)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j5 |= ((long) (b11 & ByteCompanionObject.MAX_VALUE)) << i12;
            b10 = b11;
            i11 = i13;
        }
        r1Var.f6107b = j5;
        return i11;
    }

    public static int M(Object obj, x2 x2Var, byte[] bArr, int i7, int i10, int i11, r1 r1Var) throws m2 {
        int i12 = r1Var.f6109d + 1;
        r1Var.f6109d = i12;
        Q(i12);
        int iU = ((s2) x2Var).u(obj, bArr, i7, i10, i11, r1Var);
        r1Var.f6109d--;
        r1Var.f6108c = obj;
        return iU;
    }

    public static int N(Object obj, x2 x2Var, byte[] bArr, int i7, int i10, r1 r1Var) throws m2 {
        int iJ = i7 + 1;
        int i11 = bArr[i7];
        if (i11 < 0) {
            iJ = J(i11, bArr, iJ, r1Var);
            i11 = r1Var.f6106a;
        }
        int i12 = iJ;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new m2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = r1Var.f6109d + 1;
        r1Var.f6109d = i13;
        Q(i13);
        int i14 = i12 + i11;
        x2Var.i(obj, bArr, i12, i14, r1Var);
        r1Var.f6109d--;
        r1Var.f6108c = obj;
        return i14;
    }

    public static int O(int i7, byte[] bArr, int i10, int i11, r1 r1Var) throws m2 {
        if ((i7 >>> 3) == 0) {
            throw new m2("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            return L(bArr, i10, r1Var);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return I(bArr, i10, r1Var) + r1Var.f6106a;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new m2("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i7 & (-8)) | 4;
        int i14 = r1Var.f6109d + 1;
        r1Var.f6109d = i14;
        Q(i14);
        int i15 = 0;
        while (i10 < i11) {
            i10 = I(bArr, i10, r1Var);
            i15 = r1Var.f6106a;
            if (i15 == i13) {
                break;
            }
            i10 = O(i15, bArr, i10, i11, r1Var);
        }
        r1Var.f6109d--;
        if (i10 > i11 || i15 != i13) {
            throw new m2("Failed to parse the message.");
        }
        return i10;
    }

    public static long P(byte[] bArr, int i7) {
        return (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }

    public static void Q(int i7) throws m2 {
        if (i7 >= 100) {
            throw new m2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public static int a(int i7) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i7) * (-862048943)), 15)) * 461845907);
    }

    public static int b(int i7, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i10 <= i7) {
            return i7;
        }
        int i11 = i7 + (i7 >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    public static int c(byte[] bArr, int i7, r1 r1Var) throws m2 {
        int I = I(bArr, i7, r1Var);
        int i10 = r1Var.f6106a;
        if (i10 < 0) {
            throw new m2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - I) {
            throw new m2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            r1Var.f6108c = t1.f6136e;
            return I;
        }
        r1Var.f6108c = t1.m(bArr, I, i10);
        return I + i10;
    }

    public static final q2 f(Object obj, Object obj2) {
        q2 q2VarA = (q2) obj;
        q2 q2Var = (q2) obj2;
        if (!q2Var.isEmpty()) {
            if (!q2VarA.f6098d) {
                q2VarA = q2VarA.a();
            }
            q2VarA.c();
            if (!q2Var.isEmpty()) {
                q2VarA.putAll(q2Var);
            }
        }
        return q2VarA;
    }

    public static String g(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length);
        for (byte b10 : bArr) {
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                        } else {
                            sb2.append((char) b10);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void h(int i7, int i10) {
        String strP;
        if (i7 < 0 || i7 >= i10) {
            if (i7 < 0) {
                strP = p("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(kk.b.h(i10, "negative size: "));
                }
                strP = p("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strP);
        }
    }

    public static /* synthetic */ boolean j(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, p0 p0Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(p0Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(p0Var) != obj && atomicReferenceFieldUpdater.get(p0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean k(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v4 v4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(v4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(v4Var) != obj && atomicReferenceFieldUpdater.get(v4Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static int l(int i7) {
        return (i7 >>> 1) ^ (-(i7 & 1));
    }

    public static int m(String str) {
        int length = str.length();
        int i7 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 2048) {
                try {
                    int i12 = n3.f6076a;
                    int length2 = str.length();
                    while (i10 < length2) {
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 < 2048) {
                            i7 += (127 - cCharAt2) >>> 31;
                        } else {
                            i7 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i10) < 65536) {
                                    throw new m3("Unpaired surrogate at index " + i10 + " of " + length2);
                                }
                                i10++;
                            }
                        }
                        i10++;
                    }
                    i11 += i7;
                    break;
                } catch (m3 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i11 += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i11) + 4294967296L));
    }

    public static int n(byte[] bArr, int i7) {
        int i10 = bArr[i7] & 255;
        int i11 = bArr[i7 + 1] & 255;
        int i12 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static String p(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i7 >= length || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, iIndexOf);
            sb2.append(y(objArr[i7]));
            i10 = iIndexOf + 2;
            i7++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i7 < length) {
            String str2 = " [";
            while (i7 < objArr.length) {
                sb2.append(str2);
                sb2.append(y(objArr[i7]));
                i7++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void q(int i7, int i10) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(D(i7, i10, "index"));
        }
    }

    public static void u(int i7, int i10, int i11) {
        String strD;
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            if (i7 < 0 || i7 > i11) {
                strD = D(i7, i11, "start index");
            } else {
                strD = (i10 < 0 || i10 > i11) ? D(i10, i11, "end index") : p("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static int x(x2 x2Var, int i7, byte[] bArr, int i10, int i11, h2 h2Var, r1 r1Var) throws m2 {
        d2 d2VarG = x2Var.g();
        x2 x2Var2 = x2Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        r1 r1Var2 = r1Var;
        int iN = N(d2VarG, x2Var2, bArr2, i10, i12, r1Var2);
        x2Var2.a(d2VarG);
        r1Var2.f6108c = d2VarG;
        h2Var.add(d2VarG);
        while (iN < i12) {
            r1 r1Var3 = r1Var2;
            int i13 = i12;
            int I = I(bArr2, iN, r1Var3);
            if (i7 != r1Var3.f6106a) {
                break;
            }
            byte[] bArr3 = bArr2;
            x2 x2Var3 = x2Var2;
            d2 d2VarG2 = x2Var3.g();
            iN = N(d2VarG2, x2Var3, bArr3, I, i13, r1Var3);
            x2Var2 = x2Var3;
            bArr2 = bArr3;
            i12 = i13;
            r1Var2 = r1Var3;
            x2Var2.a(d2VarG2);
            r1Var2.f6108c = d2VarG2;
            h2Var.add(d2VarG2);
        }
        return iN;
    }

    public static String y(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String strK = kk.b.k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strK), (Throwable) e10);
            return s0.g.f("<", strK, " threw ", e10.getClass().getName(), ">");
        }
    }

    public static boolean z(byte b10) {
        return b10 > -65;
    }

    public abstract boolean A(a1 a1Var, j0 j0Var, j0 j0Var2);

    public abstract boolean B(v4 v4Var, u4 u4Var, u4 u4Var2);

    public abstract boolean E(p0 p0Var, Object obj, Object obj2);

    public abstract boolean G(p0 p0Var, o0 o0Var, o0 o0Var2);

    public abstract long d();

    public abstract j0 e(a1 a1Var);

    public abstract void i(u4 u4Var, u4 u4Var2);

    public abstract o0 o(a1 a1Var);

    public abstract void r(u4 u4Var, Thread thread);

    public abstract void s(o0 o0Var, o0 o0Var2);

    public abstract boolean t(v4 v4Var, k2 k2Var, k2 k2Var2);

    public abstract void v(o0 o0Var, Thread thread);

    public abstract boolean w(v4 v4Var, Object obj, Object obj2);
}
