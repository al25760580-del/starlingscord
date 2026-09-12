package androidx.datastore.preferences.protobuf;

import com.discord.media.utils.DiscordVideoMediaSource;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1921c;

    public static int m(long j, byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            l0 l0Var = q1.f1929a;
            if (i7 > -12) {
                return -1;
            }
            return i7;
        }
        if (i10 == 1) {
            return q1.c(i7, n1.f(bArr, j));
        }
        if (i10 == 2) {
            return q1.d(i7, n1.f(bArr, j), n1.f(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f A[LOOP:2: B:16:0x0036->B:19:0x003f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104 A[LOOP:5: B:55:0x00fe->B:58:0x0104, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0116  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0146  */
    /* JADX WARN: Code duplicated, block: B:85:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0068 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.l0
    public final String e(byte[] bArr, int i7, int i10) throws w {
        int i11;
        int i12;
        byte b10;
        int i13;
        int i14;
        byte b11;
        int i15;
        int i16;
        byte bF;
        int i17;
        byte bF2;
        switch (this.f1921c) {
            case 0:
                if ((i7 | i10 | ((bArr.length - i7) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i10)));
                }
                int i18 = i7 + i10;
                char[] cArr = new char[i10];
                int i19 = 0;
                while (i7 < i18) {
                    byte b12 = bArr[i7];
                    if (b12 < 0) {
                        i11 = i19;
                        while (i7 < i18) {
                            i12 = i7 + 1;
                            b10 = bArr[i7];
                            if (b10 >= 0) {
                                i13 = i11 + 1;
                                cArr[i11] = (char) b10;
                                i14 = i12;
                                while (i14 < i18) {
                                    b11 = bArr[i14];
                                    if (b11 >= 0) {
                                        i14++;
                                        cArr[i13] = (char) b11;
                                        i13++;
                                    } else {
                                        i11 = i13;
                                        i7 = i14;
                                    }
                                }
                                i11 = i13;
                                i7 = i14;
                            } else if (b10 < -32) {
                                if (i12 < i18) {
                                    throw w.a();
                                }
                                i7 += 2;
                                l0.b(b10, bArr[i12], cArr, i11);
                                i11++;
                            } else if (b10 < -16) {
                                if (i12 < i18 - 1) {
                                    throw w.a();
                                }
                                int i20 = i7 + 2;
                                i7 += 3;
                                l0.c(b10, bArr[i12], bArr[i20], cArr, i11);
                                i11++;
                            } else {
                                if (i12 < i18 - 2) {
                                    throw w.a();
                                }
                                byte b13 = bArr[i12];
                                int i21 = i7 + 3;
                                byte b14 = bArr[i7 + 2];
                                i7 += 4;
                                l0.a(b10, b13, b14, bArr[i21], cArr, i11);
                                i11 += 2;
                            }
                        }
                        return new String(cArr, 0, i11);
                    }
                    i7++;
                    cArr[i19] = (char) b12;
                    i19++;
                }
                i11 = i19;
                while (i7 < i18) {
                    i12 = i7 + 1;
                    b10 = bArr[i7];
                    if (b10 >= 0) {
                        i13 = i11 + 1;
                        cArr[i11] = (char) b10;
                        i14 = i12;
                        while (i14 < i18) {
                            b11 = bArr[i14];
                            if (b11 >= 0) {
                                i14++;
                                cArr[i13] = (char) b11;
                                i13++;
                            } else {
                                i11 = i13;
                                i7 = i14;
                            }
                        }
                        i11 = i13;
                        i7 = i14;
                    } else if (b10 < -32) {
                        if (i12 < i18) {
                            throw w.a();
                        }
                        i7 += 2;
                        l0.b(b10, bArr[i12], cArr, i11);
                        i11++;
                    } else if (b10 < -16) {
                        if (i12 < i18 - 1) {
                            throw w.a();
                        }
                        int i22 = i7 + 2;
                        i7 += 3;
                        l0.c(b10, bArr[i12], bArr[i22], cArr, i11);
                        i11++;
                    } else {
                        if (i12 < i18 - 2) {
                            throw w.a();
                        }
                        byte b15 = bArr[i12];
                        int i23 = i7 + 3;
                        byte b16 = bArr[i7 + 2];
                        i7 += 4;
                        l0.a(b10, b15, b16, bArr[i23], cArr, i11);
                        i11 += 2;
                    }
                }
                return new String(cArr, 0, i11);
            default:
                if ((i7 | i10 | ((bArr.length - i7) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i10)));
                }
                int i24 = i7 + i10;
                char[] cArr2 = new char[i10];
                int i25 = 0;
                while (i7 < i24) {
                    byte bF3 = n1.f(bArr, i7);
                    if (bF3 < 0) {
                        i15 = i25;
                        while (i7 < i24) {
                            i16 = i7 + 1;
                            bF = n1.f(bArr, i7);
                            if (bF >= 0) {
                                i17 = i15 + 1;
                                cArr2[i15] = (char) bF;
                                while (i16 < i24) {
                                    bF2 = n1.f(bArr, i16);
                                    if (bF2 >= 0) {
                                        i16++;
                                        cArr2[i17] = (char) bF2;
                                        i17++;
                                    } else {
                                        i15 = i17;
                                        i7 = i16;
                                    }
                                }
                                i15 = i17;
                                i7 = i16;
                            } else if (bF < -32) {
                                if (i16 < i24) {
                                    throw w.a();
                                }
                                i7 += 2;
                                l0.b(bF, n1.f(bArr, i16), cArr2, i15);
                                i15++;
                            } else if (bF < -16) {
                                if (i16 < i24 - 1) {
                                    throw w.a();
                                }
                                int i26 = i7 + 2;
                                i7 += 3;
                                l0.c(bF, n1.f(bArr, i16), n1.f(bArr, i26), cArr2, i15);
                                i15++;
                            } else {
                                if (i16 < i24 - 2) {
                                    throw w.a();
                                }
                                byte bF4 = n1.f(bArr, i16);
                                int i27 = i7 + 3;
                                byte bF5 = n1.f(bArr, i7 + 2);
                                i7 += 4;
                                l0.a(bF, bF4, bF5, n1.f(bArr, i27), cArr2, i15);
                                i15 += 2;
                            }
                        }
                        return new String(cArr2, 0, i15);
                    }
                    i7++;
                    cArr2[i25] = (char) bF3;
                    i25++;
                }
                i15 = i25;
                while (i7 < i24) {
                    i16 = i7 + 1;
                    bF = n1.f(bArr, i7);
                    if (bF >= 0) {
                        i17 = i15 + 1;
                        cArr2[i15] = (char) bF;
                        while (i16 < i24) {
                            bF2 = n1.f(bArr, i16);
                            if (bF2 >= 0) {
                                i16++;
                                cArr2[i17] = (char) bF2;
                                i17++;
                            } else {
                                i15 = i17;
                                i7 = i16;
                            }
                        }
                        i15 = i17;
                        i7 = i16;
                    } else if (bF < -32) {
                        if (i16 < i24) {
                            throw w.a();
                        }
                        i7 += 2;
                        l0.b(bF, n1.f(bArr, i16), cArr2, i15);
                        i15++;
                    } else if (bF < -16) {
                        if (i16 < i24 - 1) {
                            throw w.a();
                        }
                        int i28 = i7 + 2;
                        i7 += 3;
                        l0.c(bF, n1.f(bArr, i16), n1.f(bArr, i28), cArr2, i15);
                        i15++;
                    } else {
                        if (i16 < i24 - 2) {
                            throw w.a();
                        }
                        byte bF6 = n1.f(bArr, i16);
                        int i29 = i7 + 3;
                        byte bF7 = n1.f(bArr, i7 + 2);
                        i7 += 4;
                        l0.a(bF, bF6, bF7, n1.f(bArr, i29), cArr2, i15);
                        i15 += 2;
                    }
                }
                return new String(cArr2, 0, i15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final int f(String str, byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        char cCharAt;
        long j;
        char c8;
        long j5;
        long j7;
        char c10;
        int i13;
        char cCharAt2;
        switch (this.f1921c) {
            case 0:
                int length = str.length();
                int i14 = i10 + i7;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i7) < i14 && (cCharAt = str.charAt(i15)) < 128) {
                    bArr[i12] = (byte) cCharAt;
                    i15++;
                }
                if (i15 == length) {
                    return i7 + length;
                }
                int i16 = i7 + i15;
                while (i15 < length) {
                    char cCharAt3 = str.charAt(i15);
                    if (cCharAt3 < 128 && i16 < i14) {
                        bArr[i16] = (byte) cCharAt3;
                        i16++;
                    } else if (cCharAt3 < 2048 && i16 <= i14 - 2) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) ((cCharAt3 >>> 6) | 960);
                        i16 += 2;
                        bArr[i17] = (byte) ((cCharAt3 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i16 > i14 - 3) {
                            if (i16 > i14 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i11 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i11)))) {
                                    throw new p1(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i16);
                            }
                            int i18 = i15 + 1;
                            if (i18 != str.length()) {
                                char cCharAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                                    int i19 = i16 + 3;
                                    bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                                    i16 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                }
                            }
                            throw new p1(i15 - 1, length);
                        }
                        bArr[i16] = (byte) ((cCharAt3 >>> '\f') | DiscordVideoMediaSource.DEFAULT_HEIGHT);
                        int i20 = i16 + 2;
                        bArr[i16 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        i16 += 3;
                        bArr[i20] = (byte) ((cCharAt3 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    }
                    i15++;
                }
                return i16;
            default:
                long j10 = i7;
                long j11 = ((long) i10) + j10;
                int length2 = str.length();
                if (length2 > i10 || bArr.length - i10 < i7) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i7 + i10));
                }
                int i21 = 0;
                while (true) {
                    j = 1;
                    c8 = 128;
                    if (i21 < length2 && (cCharAt2 = str.charAt(i21)) < 128) {
                        n1.j(bArr, (byte) cCharAt2, j10);
                        i21++;
                        j10 = 1 + j10;
                    }
                }
                if (i21 == length2) {
                    return (int) j10;
                }
                while (i21 < length2) {
                    char cCharAt5 = str.charAt(i21);
                    if (cCharAt5 < c8 && j10 < j11) {
                        n1.j(bArr, (byte) cCharAt5, j10);
                        c10 = c8;
                        j5 = j;
                        j7 = j10 + j;
                    } else if (cCharAt5 >= 2048 || j10 > j11 - 2) {
                        j5 = j;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j10 > j11 - 3) {
                            long j12 = j10;
                            if (j12 > j11 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i13)))) {
                                    throw new p1(i21, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j12);
                            }
                            int i22 = i21 + 1;
                            if (i22 != length2) {
                                char cCharAt6 = str.charAt(i22);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    n1.j(bArr, (byte) ((codePoint2 >>> 18) | 240), j12);
                                    c10 = 128;
                                    n1.j(bArr, (byte) (((codePoint2 >>> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT), j12 + j5);
                                    n1.j(bArr, (byte) (((codePoint2 >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT), j12 + 2);
                                    n1.j(bArr, (byte) ((codePoint2 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT), j12 + 3);
                                    j7 = j12 + 4;
                                    i21 = i22;
                                } else {
                                    i21 = i22;
                                }
                            }
                            throw new p1(i21 - 1, length2);
                        }
                        n1.j(bArr, (byte) ((cCharAt5 >>> '\f') | DiscordVideoMediaSource.DEFAULT_HEIGHT), j10);
                        long j13 = j10;
                        n1.j(bArr, (byte) (((cCharAt5 >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT), j10 + j5);
                        j7 = j13 + 3;
                        n1.j(bArr, (byte) ((cCharAt5 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT), j13 + 2);
                        c10 = 128;
                    } else {
                        j5 = j;
                        n1.j(bArr, (byte) ((cCharAt5 >>> 6) | 960), j10);
                        n1.j(bArr, (byte) ((cCharAt5 & '?') | c8), j10 + j5);
                        j7 = j10 + 2;
                        c10 = c8;
                    }
                    i21++;
                    c8 = c10;
                    j10 = j7;
                    j = j5;
                }
                return (int) j10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    @Override // androidx.datastore.preferences.protobuf.l0
    public final int i(byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        long j;
        long j5;
        byte bF;
        long j7;
        byte bF2;
        long j10;
        int i13 = i7;
        switch (this.f1921c) {
            case 0:
                break;
            default:
                if ((i13 | i10 | (bArr.length - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i10)));
                }
                long j11 = i13;
                int i14 = (int) (((long) i10) - j11);
                long j12 = 1;
                if (i14 < 16) {
                    i11 = 0;
                } else {
                    long j13 = j11;
                    i11 = 0;
                    while (true) {
                        if (i11 < i14) {
                            long j14 = j13 + 1;
                            if (n1.f(bArr, j13) >= 0) {
                                i11++;
                                j13 = j14;
                            }
                        } else {
                            i11 = i14;
                        }
                    }
                }
                int i15 = i14 - i11;
                long j15 = j11 + ((long) i11);
                while (true) {
                    byte bF3 = 0;
                    while (i15 > 0) {
                        long j16 = j15 + j12;
                        bF3 = n1.f(bArr, j15);
                        if (bF3 < 0) {
                            j15 = j16;
                            if (i15 == 0) {
                                return 0;
                            }
                            i12 = i15 - 1;
                            if (bF3 < -32) {
                                if (i12 == 0) {
                                    return bF3;
                                }
                                i15 -= 2;
                                if (bF3 >= -62) {
                                    j10 = j15 + j12;
                                    if (n1.f(bArr, j15) > -65) {
                                        j = j12;
                                        j15 = j10;
                                        j12 = j;
                                    }
                                }
                                return -1;
                            }
                            if (bF3 < -16) {
                                if (i12 < 2) {
                                    return m(j15, bArr, bF3, i12);
                                }
                                i15 -= 3;
                                j = j12;
                                long j17 = j15 + j;
                                bF2 = n1.f(bArr, j15);
                                if (bF2 > -65 && ((bF3 != -32 || bF2 >= -96) && (bF3 != -19 || bF2 < -96))) {
                                    j15 += 2;
                                    if (n1.f(bArr, j17) <= -65) {
                                        j12 = j;
                                    }
                                }
                                return -1;
                            }
                            j = j12;
                            if (i12 < 3) {
                                return m(j15, bArr, bF3, i12);
                            }
                            i15 -= 4;
                            j5 = j15 + j;
                            bF = n1.f(bArr, j15);
                            if (bF <= -65) {
                                if ((((bF + 112) + (bF3 << 28)) >> 30) == 0) {
                                    j7 = 2 + j15;
                                    if (n1.f(bArr, j5) <= -65) {
                                        j15 += 3;
                                        if (n1.f(bArr, j7) > -65) {
                                            j12 = j;
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i15--;
                        j15 = j16;
                    }
                    if (i15 == 0) {
                        return 0;
                    }
                    i12 = i15 - 1;
                    if (bF3 < -32) {
                        if (i12 == 0) {
                            return bF3;
                        }
                        i15 -= 2;
                        if (bF3 >= -62) {
                            j10 = j15 + j12;
                            if (n1.f(bArr, j15) > -65) {
                                j = j12;
                                j15 = j10;
                                j12 = j;
                            }
                        }
                        return -1;
                    }
                    if (bF3 < -16) {
                        if (i12 < 2) {
                            return m(j15, bArr, bF3, i12);
                        }
                        i15 -= 3;
                        j = j12;
                        long j18 = j15 + j;
                        bF2 = n1.f(bArr, j15);
                        if (bF2 > -65) {
                        }
                        return -1;
                    }
                    j = j12;
                    if (i12 < 3) {
                        return m(j15, bArr, bF3, i12);
                    }
                    i15 -= 4;
                    j5 = j15 + j;
                    bF = n1.f(bArr, j15);
                    if (bF <= -65) {
                        if ((((bF + 112) + (bF3 << 28)) >> 30) == 0) {
                            j7 = 2 + j15;
                            if (n1.f(bArr, j5) <= -65) {
                                j15 += 3;
                                if (n1.f(bArr, j7) > -65) {
                                    j12 = j;
                                }
                            }
                        }
                    }
                    return -1;
                }
        }
        while (i13 < i10 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 < i10) {
            while (i13 < i10) {
                int i16 = i13 + 1;
                byte b10 = bArr[i13];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i16 >= i10) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i13 += 2;
                            if (bArr[i16] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 < -16) {
                        if (i16 >= i10 - 1) {
                            return q1.a(bArr, i16, i10);
                        }
                        int i17 = i13 + 2;
                        byte b11 = bArr[i16];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i13 += 3;
                            if (bArr[i17] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i16 >= i10 - 2) {
                        return q1.a(bArr, i16, i10);
                    }
                    int i18 = i13 + 2;
                    byte b12 = bArr[i16];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i19 = i13 + 3;
                            if (bArr[i18] <= -65) {
                                i13 += 4;
                                if (bArr[i19] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i13 = i16;
            }
        }
        return 0;
    }
}
