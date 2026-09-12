package ss;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.Buffer;
import rs.m;
import rs.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f20564a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        f20564a = bytes;
    }

    public static final boolean a(q segment, int i7, byte[] bytes, int i10) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i11 = segment.f19598c;
        byte[] bArr = segment.f19596a;
        for (int i12 = 1; i12 < i10; i12++) {
            if (i7 == i11) {
                segment = segment.f19601f;
                Intrinsics.checkNotNull(segment);
                bArr = segment.f19596a;
                i7 = segment.f19597b;
                i11 = segment.f19598c;
            }
            if (bArr[i7] != bytes[i12]) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public static final String b(Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j > 0) {
            long j5 = j - 1;
            if (buffer.n(j5) == ((byte) 13)) {
                String strO = buffer.O(j5, Charsets.UTF_8);
                buffer.skip(2L);
                return strO;
            }
        }
        String strO2 = buffer.O(j, Charsets.UTF_8);
        buffer.skip(1L);
        return strO2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a8 A[LOOP:0: B:8:0x0023->B:49:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7 A[SYNTHETIC] */
    public static final int c(Buffer buffer, m options, boolean z5) {
        int i7;
        int i10;
        int i11;
        q qVar;
        int i12;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        q qVar2 = buffer.f17412d;
        if (qVar2 == null) {
            return z5 ? -2 : -1;
        }
        byte[] bArr = qVar2.f19596a;
        int i13 = qVar2.f19597b;
        int i14 = qVar2.f19598c;
        int[] iArr = options.f19583i;
        q qVar3 = qVar2;
        int i15 = -1;
        int i16 = 0;
        loop0: while (true) {
            int i17 = i16 + 1;
            int i18 = iArr[i16];
            int i19 = i16 + 2;
            int i20 = iArr[i17];
            if (i20 != -1) {
                i15 = i20;
            }
            if (qVar3 == null) {
                break;
            }
            if (i18 >= 0) {
                int i21 = i13 + 1;
                int i22 = bArr[i13] & 255;
                int i23 = i19 + i18;
                while (i19 != i23) {
                    if (i22 == iArr[i19]) {
                        i7 = iArr[i19 + i18];
                        if (i21 == i14) {
                            qVar3 = qVar3.f19601f;
                            Intrinsics.checkNotNull(qVar3);
                            int i24 = qVar3.f19597b;
                            byte[] bArr2 = qVar3.f19596a;
                            i10 = qVar3.f19598c;
                            if (qVar3 == qVar2) {
                                i11 = i24;
                                bArr = bArr2;
                                qVar3 = null;
                            } else {
                                i11 = i24;
                                bArr = bArr2;
                            }
                        } else {
                            i10 = i14;
                            i11 = i21;
                        }
                        if (i7 >= 0) {
                            return i7;
                        }
                        int i25 = i10;
                        i16 = -i7;
                        i13 = i11;
                        i14 = i25;
                    } else {
                        i19++;
                    }
                }
                return i15;
            }
            int i26 = (i18 * (-1)) + i19;
            while (true) {
                int i27 = i13 + 1;
                int i28 = i19 + 1;
                if ((bArr[i13] & 255) == iArr[i19]) {
                    boolean z6 = i28 == i26;
                    if (i27 == i14) {
                        Intrinsics.checkNotNull(qVar3);
                        q qVar4 = qVar3.f19601f;
                        Intrinsics.checkNotNull(qVar4);
                        i11 = qVar4.f19597b;
                        byte[] bArr3 = qVar4.f19596a;
                        i12 = qVar4.f19598c;
                        if (qVar4 != qVar2) {
                            qVar = qVar4;
                            bArr = bArr3;
                        } else {
                            if (!z6) {
                                break loop0;
                            }
                            bArr = bArr3;
                            qVar = null;
                        }
                    } else {
                        qVar = qVar3;
                        i12 = i14;
                        i11 = i27;
                    }
                    if (z6) {
                        i7 = iArr[i28];
                        int i29 = i12;
                        qVar3 = qVar;
                        i10 = i29;
                        break;
                    }
                    i13 = i11;
                    i14 = i12;
                    qVar3 = qVar;
                    i19 = i28;
                }
                return i15;
            }
            if (i7 >= 0) {
                return i7;
            }
            int i210 = i10;
            i16 = -i7;
            i13 = i11;
            i14 = i210;
        }
        if (z5) {
            return -2;
        }
        return i15;
    }
}
