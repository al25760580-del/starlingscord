package com.facebook.soloader;

import android.os.Build;
import android.util.Log;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static a0 a(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        a0 a0Var;
        if (unsatisfiedLinkError.getMessage() == null || !unsatisfiedLinkError.getMessage().contains("ELF")) {
            Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
            if (matcher.find()) {
                Log.w("SoLoader", "Library name is corrupted, contains non-ASCII characters " + matcher.group());
                b("Corrupted lib name detected");
                a0Var = new y(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
            } else {
                a0Var = new a0(str, unsatisfiedLinkError.toString());
            }
        } else {
            b("Corrupted lib file detected");
            a0Var = new y(str, unsatisfiedLinkError.toString());
        }
        a0Var.initCause(unsatisfiedLinkError);
        return a0Var;
    }

    public static void b(String str) {
        if (f("SoLoader", 3)) {
            Log.d("SoLoader", str);
        }
    }

    public static String[] c(g gVar) throws ClosedByInterruptException {
        if (!(gVar instanceof h)) {
            return d(gVar);
        }
        h hVar = (h) gVar;
        int i7 = 0;
        while (true) {
            try {
                return d(hVar);
            } catch (ClosedByInterruptException e10) {
                i7++;
                if (i7 > 4) {
                    throw e10;
                }
                Thread.interrupted();
                Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e10);
                FileInputStream fileInputStream = new FileInputStream(hVar.f5397d);
                hVar.f5398e = fileInputStream;
                hVar.f5399i = fileInputStream.getChannel();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01be  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01de  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fd A[LOOP:4: B:112:0x01ee->B:114:0x01fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x020f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0218  */
    /* JADX WARN: Code duplicated, block: B:122:0x021e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0221  */
    /* JADX WARN: Code duplicated, block: B:127:0x022b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:128:0x022c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0232  */
    /* JADX WARN: Code duplicated, block: B:132:0x023a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0242 A[LOOP:1: B:50:0x00f4->B:134:0x0242, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0204 A[EDGE_INSN: B:148:0x0204->B:115:0x0204 BREAK  A[LOOP:4: B:112:0x01ee->B:114:0x01fd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:77:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0152  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Code duplicated, block: B:82:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:84:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x0173  */
    /* JADX WARN: Code duplicated, block: B:87:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0194  */
    /* JADX WARN: Code duplicated, block: B:94:0x019b  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ac  */
    public static String[] d(g gVar) {
        long jE;
        int i7;
        long jE2;
        long jE3;
        long jE4;
        long j;
        long j5;
        int i10;
        int i11;
        long j7;
        int i12;
        String[] strArr;
        int i13;
        long jE5;
        long j10;
        long jE6;
        long j11;
        StringBuilder sb2;
        long j12;
        short s2;
        long jE7;
        long jE8;
        long jE9;
        long jE10;
        long jE11;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jE12 = e(gVar, byteBufferAllocate, 0L);
        if (jE12 != 1179403647) {
            throw new s("file is not ELF: magic is 0x" + Long.toHexString(jE12) + ", it should be " + Long.toHexString(1179403647L));
        }
        g(gVar, byteBufferAllocate, 1, 4L);
        boolean z5 = ((short) (byteBufferAllocate.get() & 255)) == 1;
        g(gVar, byteBufferAllocate, 1, 5L);
        if (((short) (byteBufferAllocate.get() & 255)) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        if (z5) {
            jE = e(gVar, byteBufferAllocate, 28L);
        } else {
            g(gVar, byteBufferAllocate, 8, 32L);
            jE = byteBufferAllocate.getLong();
        }
        if (z5) {
            g(gVar, byteBufferAllocate, 2, 44L);
            i7 = byteBufferAllocate.getShort() & 65535;
        } else {
            g(gVar, byteBufferAllocate, 2, 56L);
            i7 = byteBufferAllocate.getShort() & 65535;
        }
        long jE13 = i7;
        g(gVar, byteBufferAllocate, 2, z5 ? 42L : 54L);
        int i14 = byteBufferAllocate.getShort() & 65535;
        long j13 = 40;
        if (jE13 == 65535) {
            if (z5) {
                jE11 = e(gVar, byteBufferAllocate, 32L);
            } else {
                g(gVar, byteBufferAllocate, 8, 40L);
                jE11 = byteBufferAllocate.getLong();
            }
            jE13 = z5 ? e(gVar, byteBufferAllocate, jE11 + 28) : e(gVar, byteBufferAllocate, jE11 + 44);
        }
        long j14 = 0;
        long j15 = jE;
        while (true) {
            if (j14 >= jE13) {
                jE2 = 0;
                break;
            }
            if ((z5 ? e(gVar, byteBufferAllocate, j15) : e(gVar, byteBufferAllocate, j15)) == 2) {
                if (!z5) {
                    g(gVar, byteBufferAllocate, 8, j15 + 8);
                    jE2 = byteBufferAllocate.getLong();
                    break;
                }
                jE2 = e(gVar, byteBufferAllocate, j15 + 4);
                break;
            }
            j15 += (long) i14;
            j14++;
            z5 = z5;
        }
        boolean z6 = z5;
        if (jE2 == 0) {
            throw new s("ELF file does not contain dynamic linking information");
        }
        long j16 = jE2;
        long j17 = 0;
        int i15 = 0;
        while (true) {
            if (z6) {
                jE3 = e(gVar, byteBufferAllocate, j16);
            } else {
                g(gVar, byteBufferAllocate, 8, j16);
                jE3 = byteBufferAllocate.getLong();
            }
            long j18 = j13;
            if (jE3 != 1) {
                if (jE3 == 5) {
                    if (z6) {
                        jE4 = e(gVar, byteBufferAllocate, j16 + 4);
                    } else {
                        g(gVar, byteBufferAllocate, 8, j16 + 8);
                        jE4 = byteBufferAllocate.getLong();
                    }
                    j17 = jE4;
                }
                if (z6) {
                    j = 8;
                } else {
                    j = 16;
                }
                j16 += j;
                if (jE3 == 0) {
                    if (j17 != 0) {
                        throw new s("Dynamic section string-table not found");
                    }
                    j5 = jE;
                    i10 = 0;
                    while (true) {
                        i11 = i14;
                        if (i10 < jE13) {
                            i15 = i15;
                            j7 = 0;
                            break;
                        }
                        if (z6) {
                            jE7 = e(gVar, byteBufferAllocate, j5);
                        } else {
                            jE7 = e(gVar, byteBufferAllocate, j5);
                        }
                        if (jE7 == 1) {
                            if (z6) {
                                jE8 = e(gVar, byteBufferAllocate, j5 + 8);
                            } else {
                                g(gVar, byteBufferAllocate, 8, j5 + 16);
                                jE8 = byteBufferAllocate.getLong();
                            }
                            if (z6) {
                                jE9 = e(gVar, byteBufferAllocate, j5 + 20);
                            } else {
                                g(gVar, byteBufferAllocate, 8, j5 + j18);
                                jE9 = byteBufferAllocate.getLong();
                            }
                            if (jE8 <= j17 && j17 < jE9 + jE8) {
                                if (z6) {
                                    jE10 = e(gVar, byteBufferAllocate, j5 + 4);
                                } else {
                                    g(gVar, byteBufferAllocate, 8, j5 + 8);
                                    jE10 = byteBufferAllocate.getLong();
                                }
                                j7 = (j17 - jE8) + jE10;
                                break;
                            }
                        } else {
                            i15 = i15;
                        }
                        i14 = i11;
                        j5 += (long) i14;
                        i10++;
                        i15 = i15;
                    }
                    if (j7 != 0) {
                        throw new s("did not find file offset of DT_STRTAB table");
                    }
                    i12 = i15;
                    strArr = new String[i12];
                    i13 = 0;
                    do {
                        if (z6) {
                            jE5 = e(gVar, byteBufferAllocate, jE2);
                        } else {
                            g(gVar, byteBufferAllocate, 8, jE2);
                            jE5 = byteBufferAllocate.getLong();
                        }
                        if (jE5 != 1) {
                            if (z6) {
                                jE6 = e(gVar, byteBufferAllocate, jE2 + 4);
                            } else {
                                g(gVar, byteBufferAllocate, 8, jE2 + 8);
                                jE6 = byteBufferAllocate.getLong();
                            }
                            j11 = j7 + jE6;
                            sb2 = new StringBuilder();
                            while (true) {
                                j12 = j11 + 1;
                                g(gVar, byteBufferAllocate, 1, j11);
                                s2 = (short) (byteBufferAllocate.get() & 255);
                                if (s2 != 0) {
                                    break;
                                }
                                sb2.append((char) s2);
                                j11 = j12;
                            }
                            strArr[i13] = sb2.toString();
                            if (i13 != Integer.MAX_VALUE) {
                                throw new s("malformed DT_NEEDED section");
                            }
                            i13++;
                        }
                        if (z6) {
                            j10 = 8;
                        } else {
                            j10 = 16;
                        }
                        jE2 += j10;
                    } while (jE5 != 0);
                    if (i13 == i12) {
                        return strArr;
                    }
                    throw new s(r13);
                }
                j13 = j18;
            } else {
                if (i15 == Integer.MAX_VALUE) {
                    throw new s("malformed DT_NEEDED section");
                }
                i15++;
            }
            if (z6) {
                j = 8;
            } else {
                j = 16;
            }
            j16 += j;
            if (jE3 == 0) {
                if (j17 != 0) {
                    throw new s("Dynamic section string-table not found");
                }
                j5 = jE;
                i10 = 0;
                while (true) {
                    i11 = i14;
                    if (i10 < jE13) {
                        i15 = i15;
                        j7 = 0;
                        break;
                    }
                    if (z6) {
                        jE7 = e(gVar, byteBufferAllocate, j5);
                    } else {
                        jE7 = e(gVar, byteBufferAllocate, j5);
                    }
                    if (jE7 == 1) {
                        if (z6) {
                            jE8 = e(gVar, byteBufferAllocate, j5 + 8);
                        } else {
                            g(gVar, byteBufferAllocate, 8, j5 + 16);
                            jE8 = byteBufferAllocate.getLong();
                        }
                        if (z6) {
                            jE9 = e(gVar, byteBufferAllocate, j5 + 20);
                        } else {
                            g(gVar, byteBufferAllocate, 8, j5 + j18);
                            jE9 = byteBufferAllocate.getLong();
                        }
                        if (jE8 <= j17) {
                            if (z6) {
                                jE10 = e(gVar, byteBufferAllocate, j5 + 4);
                            } else {
                                g(gVar, byteBufferAllocate, 8, j5 + 8);
                                jE10 = byteBufferAllocate.getLong();
                            }
                            j7 = (j17 - jE8) + jE10;
                            break;
                        }
                    } else {
                        i15 = i15;
                    }
                    i14 = i11;
                    j5 += (long) i14;
                    i10++;
                    i15 = i15;
                }
                if (j7 != 0) {
                    throw new s("did not find file offset of DT_STRTAB table");
                }
                i12 = i15;
                strArr = new String[i12];
                i13 = 0;
                do {
                    if (z6) {
                        jE5 = e(gVar, byteBufferAllocate, jE2);
                    } else {
                        g(gVar, byteBufferAllocate, 8, jE2);
                        jE5 = byteBufferAllocate.getLong();
                    }
                    if (jE5 != 1) {
                        if (z6) {
                            jE6 = e(gVar, byteBufferAllocate, jE2 + 4);
                        } else {
                            g(gVar, byteBufferAllocate, 8, jE2 + 8);
                            jE6 = byteBufferAllocate.getLong();
                        }
                        j11 = j7 + jE6;
                        sb2 = new StringBuilder();
                        while (true) {
                            j12 = j11 + 1;
                            g(gVar, byteBufferAllocate, 1, j11);
                            s2 = (short) (byteBufferAllocate.get() & 255);
                            if (s2 != 0) {
                                break;
                                break;
                            }
                            sb2.append((char) s2);
                            j11 = j12;
                        }
                        strArr[i13] = sb2.toString();
                        if (i13 != Integer.MAX_VALUE) {
                            throw new s("malformed DT_NEEDED section");
                        }
                        i13++;
                    }
                    if (z6) {
                        j10 = 8;
                    } else {
                        j10 = 16;
                    }
                    jE2 += j10;
                } while (jE5 != 0);
                if (i13 == i12) {
                    return strArr;
                }
                throw new s(r13);
            }
            j13 = j18;
        }
    }

    public static long e(g gVar, ByteBuffer byteBuffer, long j) {
        g(gVar, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static boolean f(String str, int i7) {
        return (Build.VERSION.SDK_INT > 25 || str.length() <= 23) ? Log.isLoggable(str, i7) : Log.isLoggable(str.substring(0, 23), i7);
    }

    public static void g(g gVar, ByteBuffer byteBuffer, int i7, long j) {
        int iK;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        while (byteBuffer.remaining() > 0 && (iK = gVar.k(j, byteBuffer)) != -1) {
            j += (long) iK;
        }
        if (byteBuffer.remaining() > 0) {
            throw new s("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    public static void h(String str, String str2) {
        if (f(str, 2)) {
            Log.v(str, str2);
        }
    }
}
