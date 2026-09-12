package hj;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends ls.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i7) {
        super(8);
        this.f10821b = i7;
    }

    public static int V(long j, byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            ls.d dVar = e1.f10825a;
            if (i7 > -12) {
                return -1;
            }
            return i7;
        }
        if (i10 == 1) {
            return e1.b(i7, c1.g(bArr, j));
        }
        if (i10 == 2) {
            return e1.c(i7, c1.g(bArr, j), c1.g(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:2: B:23:0x0054->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012c A[SYNTHETIC] */
    @Override // ls.d
    public final String m(byte[] bArr, int i7, int i10) throws v {
        int i11;
        byte b10;
        int i12;
        byte b11;
        byte b12;
        byte b13;
        switch (this.f10821b) {
            case 0:
                if ((i7 | i10 | ((bArr.length - i7) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i10)));
                }
                int i13 = i7 + i10;
                char[] cArr = new char[i10];
                int i14 = 0;
                while (i7 < i13) {
                    byte b14 = bArr[i7];
                    if (b14 < 0) {
                        while (i7 < i13) {
                            i11 = i7 + 1;
                            b10 = bArr[i7];
                            if (b10 < 0) {
                                i12 = i14 + 1;
                                cArr[i14] = (char) b10;
                                while (i11 < i13) {
                                    b11 = bArr[i11];
                                    if (b11 >= 0) {
                                        i11++;
                                        cArr[i12] = (char) b11;
                                        i12++;
                                    } else {
                                        i14 = i12;
                                        i7 = i11;
                                    }
                                }
                                i14 = i12;
                                i7 = i11;
                            } else if (b10 < -32) {
                                if (i11 < i13) {
                                    throw v.a();
                                }
                                i7 += 2;
                                byte b15 = bArr[i11];
                                int i15 = i14 + 1;
                                if (b10 >= -62 || m3.m.G(b15)) {
                                    throw v.a();
                                }
                                cArr[i14] = (char) ((b15 & 63) | ((b10 & 31) << 6));
                                i14 = i15;
                            } else {
                                if (b10 >= -16) {
                                    if (i11 < i13 - 2) {
                                        throw v.a();
                                    }
                                    b13 = bArr[i11];
                                    int i16 = i7 + 3;
                                    byte b16 = bArr[i7 + 2];
                                    i7 += 4;
                                    byte b17 = bArr[i16];
                                    int i17 = i14 + 1;
                                    if (!m3.m.G(b13)) {
                                        if ((((b13 + 112) + (b10 << 28)) >> 30) != 0 && !m3.m.G(b16) && !m3.m.G(b17)) {
                                            int i18 = ((b13 & 63) << 12) | ((b10 & 7) << 18) | ((b16 & 63) << 6) | (b17 & 63);
                                            cArr[i14] = (char) ((i18 >>> 10) + 55232);
                                            cArr[i17] = (char) ((i18 & 1023) + 56320);
                                            i14 += 2;
                                        }
                                    }
                                    throw v.a();
                                }
                                if (i11 < i13 - 1) {
                                    throw v.a();
                                }
                                int i19 = i7 + 2;
                                b12 = bArr[i11];
                                i7 += 3;
                                byte b18 = bArr[i19];
                                int i20 = i14 + 1;
                                if (!m3.m.G(b12) || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || m3.m.G(b18)))) {
                                    throw v.a();
                                }
                                cArr[i14] = (char) (((b12 & 63) << 6) | ((b10 & 15) << 12) | (b18 & 63));
                                i14 = i20;
                            }
                        }
                        return new String(cArr, 0, i14);
                    }
                    i7++;
                    cArr[i14] = (char) b14;
                    i14++;
                }
                while (i7 < i13) {
                    i11 = i7 + 1;
                    b10 = bArr[i7];
                    if (b10 < 0) {
                        if (b10 < -32) {
                            if (i11 < i13) {
                                throw v.a();
                            }
                            i7 += 2;
                            byte b19 = bArr[i11];
                            int i110 = i14 + 1;
                            if (b10 >= -62) {
                            }
                            throw v.a();
                        }
                        if (b10 >= -16) {
                            if (i11 < i13 - 1) {
                                throw v.a();
                            }
                            int i111 = i7 + 2;
                            b12 = bArr[i11];
                            i7 += 3;
                            byte b110 = bArr[i111];
                            int i21 = i14 + 1;
                            if (m3.m.G(b12)) {
                            }
                            throw v.a();
                        }
                        if (i11 < i13 - 2) {
                            throw v.a();
                        }
                        b13 = bArr[i11];
                        int i112 = i7 + 3;
                        byte b111 = bArr[i7 + 2];
                        i7 += 4;
                        byte b112 = bArr[i112];
                        int i113 = i14 + 1;
                        if (!m3.m.G(b13)) {
                            if ((((b13 + 112) + (b10 << 28)) >> 30) != 0) {
                            }
                        }
                        throw v.a();
                    }
                    i12 = i14 + 1;
                    cArr[i14] = (char) b10;
                    while (i11 < i13) {
                        b11 = bArr[i11];
                        if (b11 >= 0) {
                            i11++;
                            cArr[i12] = (char) b11;
                            i12++;
                        } else {
                            i14 = i12;
                            i7 = i11;
                        }
                    }
                    i14 = i12;
                    i7 = i11;
                }
                return new String(cArr, 0, i14);
            default:
                Charset charset = t.f10906a;
                String str = new String(bArr, i7, i10, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i10 + i7))) {
                    throw v.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ed  */
    @Override // ls.d
    public final int v(byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        long j;
        long j5;
        byte bG;
        long j7;
        byte bG2;
        long j10;
        int i13 = i7;
        switch (this.f10821b) {
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
                    int i15 = 8 - (((int) j11) & 7);
                    long j13 = j11;
                    i11 = 0;
                    while (true) {
                        if (i11 < i15) {
                            long j14 = j13 + 1;
                            if (c1.g(bArr, j13) >= 0) {
                                i11++;
                                j13 = j14;
                            }
                        } else {
                            while (true) {
                                int i16 = i11 + 8;
                                if (i16 <= i14) {
                                    if ((c1.f10811c.h(c1.f10814f + j13, bArr) & (-9187201950435737472L)) == 0) {
                                        j13 += 8;
                                        i11 = i16;
                                    }
                                }
                            }
                            while (true) {
                                if (i11 < i14) {
                                    long j15 = j13 + 1;
                                    if (c1.g(bArr, j13) >= 0) {
                                        i11++;
                                        j13 = j15;
                                    }
                                } else {
                                    i11 = i14;
                                }
                            }
                        }
                    }
                }
                int i17 = i14 - i11;
                long j16 = j11 + ((long) i11);
                while (true) {
                    byte bG3 = 0;
                    while (i17 > 0) {
                        long j17 = j16 + j12;
                        bG3 = c1.g(bArr, j16);
                        if (bG3 >= 0) {
                            i17--;
                            j16 = j17;
                        } else {
                            j16 = j17;
                            if (i17 == 0) {
                                return 0;
                            }
                            i12 = i17 - 1;
                            if (bG3 < -32) {
                                if (i12 == 0) {
                                    return bG3;
                                }
                                i17 -= 2;
                                if (bG3 >= -62) {
                                    j10 = j16 + j12;
                                    if (c1.g(bArr, j16) > -65) {
                                        j = j12;
                                        j16 = j10;
                                        j12 = j;
                                    }
                                }
                            } else if (bG3 < -16) {
                                j = j12;
                                if (i12 < 3) {
                                    return V(j16, bArr, bG3, i12);
                                }
                                i17 -= 4;
                                j5 = j16 + j;
                                bG = c1.g(bArr, j16);
                                if (bG <= -65) {
                                    if ((((bG + 112) + (bG3 << 28)) >> 30) == 0) {
                                        j7 = 2 + j16;
                                        if (c1.g(bArr, j5) <= -65) {
                                            j16 += 3;
                                            if (c1.g(bArr, j7) > -65) {
                                                j12 = j;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (i12 < 2) {
                                    return V(j16, bArr, bG3, i12);
                                }
                                i17 -= 3;
                                j = j12;
                                long j18 = j16 + j;
                                bG2 = c1.g(bArr, j16);
                                if (bG2 > -65 && ((bG3 != -32 || bG2 >= -96) && (bG3 != -19 || bG2 < -96))) {
                                    j16 += 2;
                                    if (c1.g(bArr, j18) <= -65) {
                                        j12 = j;
                                    }
                                }
                            }
                        }
                    }
                    if (i17 == 0) {
                        return 0;
                    }
                    i12 = i17 - 1;
                    if (bG3 < -32) {
                        if (i12 == 0) {
                            return bG3;
                        }
                        i17 -= 2;
                        if (bG3 >= -62) {
                            j10 = j16 + j12;
                            if (c1.g(bArr, j16) > -65) {
                                j = j12;
                                j16 = j10;
                                j12 = j;
                            }
                        }
                    } else if (bG3 < -16) {
                        j = j12;
                        if (i12 < 3) {
                            return V(j16, bArr, bG3, i12);
                        }
                        i17 -= 4;
                        j5 = j16 + j;
                        bG = c1.g(bArr, j16);
                        if (bG <= -65) {
                            if ((((bG + 112) + (bG3 << 28)) >> 30) == 0) {
                                j7 = 2 + j16;
                                if (c1.g(bArr, j5) <= -65) {
                                    j16 += 3;
                                    if (c1.g(bArr, j7) > -65) {
                                        j12 = j;
                                    }
                                }
                            }
                        }
                    } else {
                        if (i12 < 2) {
                            return V(j16, bArr, bG3, i12);
                        }
                        i17 -= 3;
                        j = j12;
                        long j19 = j16 + j;
                        bG2 = c1.g(bArr, j16);
                        if (bG2 > -65) {
                        }
                    }
                }
                return -1;
        }
        while (i13 < i10 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 < i10) {
            while (i13 < i10) {
                int i18 = i13 + 1;
                byte b10 = bArr[i13];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i18 >= i10) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i13 += 2;
                            if (bArr[i18] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 < -16) {
                        if (i18 >= i10 - 1) {
                            return e1.a(bArr, i18, i10);
                        }
                        int i19 = i13 + 2;
                        byte b11 = bArr[i18];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i13 += 3;
                            if (bArr[i19] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i18 >= i10 - 2) {
                        return e1.a(bArr, i18, i10);
                    }
                    int i20 = i13 + 2;
                    byte b12 = bArr[i18];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i21 = i13 + 3;
                            if (bArr[i20] <= -65) {
                                i13 += 4;
                                if (bArr[i21] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i13 = i18;
            }
        }
        return 0;
    }
}
