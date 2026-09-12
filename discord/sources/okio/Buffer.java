package okio;

import a3.e;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import e2.k;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kk.b;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.x;
import rs.d;
import rs.m;
import rs.q;
import rs.r;
import rs.s;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f17412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17413e;

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink A(String str) {
        l0(str);
        return this;
    }

    public final byte[] B(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(b.i(j, "byteCount: ").toString());
        }
        if (this.f17413e < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    public final String E(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return O(this.f17413e, charset);
    }

    @Override // okio.Sink
    public final void H(Buffer source, long j) {
        q qVar;
        q qVarB;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        v.f(source.f17413e, 0L, j);
        while (j > 0) {
            q qVar2 = source.f17412d;
            Intrinsics.checkNotNull(qVar2);
            int i7 = qVar2.f19598c;
            q qVar3 = source.f17412d;
            Intrinsics.checkNotNull(qVar3);
            long j5 = i7 - qVar3.f19597b;
            int i10 = 0;
            if (j < j5) {
                q qVar4 = this.f17412d;
                if (qVar4 != null) {
                    Intrinsics.checkNotNull(qVar4);
                    qVar = qVar4.f19602g;
                } else {
                    qVar = null;
                }
                if (qVar != null && qVar.f19600e) {
                    if ((((long) qVar.f19598c) + j) - ((long) (qVar.f19599d ? 0 : qVar.f19597b)) <= 8192) {
                        q qVar5 = source.f17412d;
                        Intrinsics.checkNotNull(qVar5);
                        qVar5.d(qVar, (int) j);
                        source.f17413e -= j;
                        this.f17413e += j;
                        return;
                    }
                }
                q qVar6 = source.f17412d;
                Intrinsics.checkNotNull(qVar6);
                int i11 = (int) j;
                if (i11 <= 0) {
                    qVar6.getClass();
                } else if (i11 <= qVar6.f19598c - qVar6.f19597b) {
                    if (i11 >= 1024) {
                        qVarB = qVar6.c();
                    } else {
                        qVarB = r.b();
                        byte[] bArr = qVar6.f19596a;
                        byte[] bArr2 = qVarB.f19596a;
                        int i12 = qVar6.f19597b;
                        w.c(0, i12, i12 + i11, bArr, bArr2);
                    }
                    qVarB.f19598c = qVarB.f19597b + i11;
                    qVar6.f19597b += i11;
                    q qVar7 = qVar6.f19602g;
                    Intrinsics.checkNotNull(qVar7);
                    qVar7.b(qVarB);
                    source.f17412d = qVarB;
                }
                throw new IllegalArgumentException("byteCount out of range");
            }
            q qVar8 = source.f17412d;
            Intrinsics.checkNotNull(qVar8);
            long j7 = qVar8.f19598c - qVar8.f19597b;
            source.f17412d = qVar8.a();
            q qVar9 = this.f17412d;
            if (qVar9 == null) {
                this.f17412d = qVar8;
                qVar8.f19602g = qVar8;
                qVar8.f19601f = qVar8;
            } else {
                Intrinsics.checkNotNull(qVar9);
                q qVar10 = qVar9.f19602g;
                Intrinsics.checkNotNull(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f19602g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.checkNotNull(qVar11);
                if (qVar11.f19600e) {
                    int i13 = qVar8.f19598c - qVar8.f19597b;
                    q qVar12 = qVar8.f19602g;
                    Intrinsics.checkNotNull(qVar12);
                    int i14 = 8192 - qVar12.f19598c;
                    q qVar13 = qVar8.f19602g;
                    Intrinsics.checkNotNull(qVar13);
                    if (!qVar13.f19599d) {
                        q qVar14 = qVar8.f19602g;
                        Intrinsics.checkNotNull(qVar14);
                        i10 = qVar14.f19597b;
                    }
                    if (i13 <= i14 + i10) {
                        q qVar15 = qVar8.f19602g;
                        Intrinsics.checkNotNull(qVar15);
                        qVar8.d(qVar15, i13);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            source.f17413e -= j7;
            this.f17413e += j7;
            j -= j7;
        }
    }

    @Override // okio.BufferedSink
    public final long J(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j5 = source.read(this, 8192L);
            if (j5 == -1) {
                return j;
            }
            j += j5;
        }
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink K(long j) {
        a0(j);
        return this;
    }

    @Override // okio.BufferedSource
    public final ByteString L() {
        return m(this.f17413e);
    }

    @Override // okio.BufferedSource
    public final boolean N(long j) {
        return this.f17413e >= j;
    }

    public final String O(long j, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(b.i(j, "byteCount: ").toString());
        }
        if (this.f17413e < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        q qVar = this.f17412d;
        Intrinsics.checkNotNull(qVar);
        int i7 = qVar.f19597b;
        if (((long) i7) + j > qVar.f19598c) {
            return new String(B(j), charset);
        }
        int i10 = (int) j;
        String str = new String(qVar.f19596a, i7, i10, charset);
        int i11 = qVar.f19597b + i10;
        qVar.f19597b = i11;
        this.f17413e -= j;
        if (i11 == qVar.f19598c) {
            this.f17412d = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    public final ByteString P(int i7) {
        if (i7 == 0) {
            return ByteString.f17414v;
        }
        v.f(this.f17413e, 0L, i7);
        q qVar = this.f17412d;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i7) {
            Intrinsics.checkNotNull(qVar);
            int i13 = qVar.f19598c;
            int i14 = qVar.f19597b;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            qVar = qVar.f19601f;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        q qVar2 = this.f17412d;
        int i15 = 0;
        while (i10 < i7) {
            Intrinsics.checkNotNull(qVar2);
            bArr[i15] = qVar2.f19596a;
            i10 += qVar2.f19598c - qVar2.f19597b;
            iArr[i15] = Math.min(i10, i7);
            iArr[i15 + i12] = qVar2.f19597b;
            qVar2.f19599d = true;
            i15++;
            qVar2 = qVar2.f19601f;
        }
        return new s(bArr, iArr);
    }

    public final q Q(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f17412d;
        if (qVar == null) {
            q qVarB = r.b();
            this.f17412d = qVarB;
            qVarB.f19602g = qVarB;
            qVarB.f19601f = qVarB;
            return qVarB;
        }
        Intrinsics.checkNotNull(qVar);
        q qVar2 = qVar.f19602g;
        Intrinsics.checkNotNull(qVar2);
        if (qVar2.f19598c + i7 <= 8192 && qVar2.f19600e) {
            return qVar2;
        }
        q qVarB2 = r.b();
        qVar2.b(qVarB2);
        return qVarB2;
    }

    @Override // okio.BufferedSource
    public final String S() {
        return w(LongCompanionObject.MAX_VALUE);
    }

    public final void T(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.m(this, byteString.c());
    }

    public final void U(int i7) {
        q qVarQ = Q(1);
        byte[] bArr = qVarQ.f19596a;
        int i10 = qVarQ.f19598c;
        qVarQ.f19598c = i10 + 1;
        bArr[i10] = (byte) i7;
        this.f17413e++;
    }

    @Override // okio.BufferedSource
    public final String V() {
        return O(this.f17413e, Charsets.UTF_8);
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink X(ByteString byteString) {
        T(byteString);
        return this;
    }

    public final void Y(long j) {
        boolean z5;
        if (j == 0) {
            U(48);
            return;
        }
        int i7 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                l0("-9223372036854775808");
                return;
            }
            z5 = true;
        } else {
            z5 = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i7 = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i7 = 2;
                }
            } else if (j < 1000000) {
                i7 = j < 100000 ? 5 : 6;
            } else {
                i7 = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i7 = j < 1000000000 ? 9 : 10;
            } else {
                i7 = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i7 = 13;
            } else {
                i7 = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i7 = j < 10000000000000000L ? 16 : 17;
        } else {
            i7 = j < 1000000000000000000L ? 18 : 19;
        }
        if (z5) {
            i7++;
        }
        q qVarQ = Q(i7);
        byte[] bArr = qVarQ.f19596a;
        int i10 = qVarQ.f19598c + i7;
        while (j != 0) {
            long j5 = 10;
            i10--;
            bArr[i10] = ss.a.f20564a[(int) (j % j5)];
            j /= j5;
        }
        if (z5) {
            bArr[i10 - 1] = (byte) 45;
        }
        qVarQ.f19598c += i7;
        this.f17413e += (long) i7;
    }

    @Override // okio.BufferedSource
    public final long Z(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = this.f17413e;
        if (j > 0) {
            sink.H(this, j);
        }
        return j;
    }

    public final void a0(long j) {
        if (j == 0) {
            U(48);
            return;
        }
        long j5 = (j >>> 1) | j;
        long j7 = j5 | (j5 >>> 2);
        long j10 = j7 | (j7 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i7 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        q qVarQ = Q(i7);
        byte[] bArr = qVarQ.f19596a;
        int i10 = qVarQ.f19598c;
        for (int i11 = (i10 + i7) - 1; i11 >= i10; i11--) {
            bArr[i11] = ss.a.f20564a[(int) (15 & j)];
            j >>>= 4;
        }
        qVarQ.f19598c += i7;
        this.f17413e += (long) i7;
    }

    @Override // okio.BufferedSource
    public final int b0(m options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iC = ss.a.c(this, options, false);
        if (iC == -1) {
            return -1;
        }
        skip(options.f19582e[iC].c());
        return iC;
    }

    public final void c() throws EOFException {
        skip(this.f17413e);
    }

    public final void c0(int i7) {
        q qVarQ = Q(4);
        byte[] bArr = qVarQ.f19596a;
        int i10 = qVarQ.f19598c;
        bArr[i10] = (byte) ((i7 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i7 & 255);
        qVarQ.f19598c = i10 + 4;
        this.f17413e += 4;
    }

    public final Object clone() {
        Buffer buffer = new Buffer();
        if (this.f17413e == 0) {
            return buffer;
        }
        q qVar = this.f17412d;
        Intrinsics.checkNotNull(qVar);
        q qVarC = qVar.c();
        buffer.f17412d = qVarC;
        qVarC.f19602g = qVarC;
        qVarC.f19601f = qVarC;
        for (q qVar2 = qVar.f19601f; qVar2 != qVar; qVar2 = qVar2.f19601f) {
            q qVar3 = qVarC.f19602g;
            Intrinsics.checkNotNull(qVar3);
            Intrinsics.checkNotNull(qVar2);
            qVar3.b(qVar2.c());
        }
        buffer.f17413e = this.f17413e;
        return buffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, okio.Sink
    public final void close() {
    }

    @Override // okio.BufferedSource
    public final void d0(long j) throws EOFException {
        if (this.f17413e < j) {
            throw new EOFException();
        }
    }

    public final void e0(int i7) {
        q qVarQ = Q(2);
        byte[] bArr = qVarQ.f19596a;
        int i10 = qVarQ.f19598c;
        bArr[i10] = (byte) ((i7 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i7 & 255);
        qVarQ.f19598c = i10 + 2;
        this.f17413e += 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        long j = this.f17413e;
        Buffer buffer = (Buffer) obj;
        if (j != buffer.f17413e) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        q qVar = this.f17412d;
        Intrinsics.checkNotNull(qVar);
        q qVar2 = buffer.f17412d;
        Intrinsics.checkNotNull(qVar2);
        int i7 = qVar.f19597b;
        int i10 = qVar2.f19597b;
        long j5 = 0;
        while (j5 < this.f17413e) {
            long jMin = Math.min(qVar.f19598c - i7, qVar2.f19598c - i10);
            long j7 = 0;
            while (j7 < jMin) {
                int i11 = i7 + 1;
                int i12 = i10 + 1;
                if (qVar.f19596a[i7] != qVar2.f19596a[i10]) {
                    return false;
                }
                j7++;
                i7 = i11;
                i10 = i12;
            }
            if (i7 == qVar.f19598c) {
                qVar = qVar.f19601f;
                Intrinsics.checkNotNull(qVar);
                i7 = qVar.f19597b;
            }
            if (i10 == qVar2.f19598c) {
                qVar2 = qVar2.f19601f;
                Intrinsics.checkNotNull(qVar2);
                i10 = qVar2.f19597b;
            }
            j5 += jMin;
        }
        return true;
    }

    public final long f() {
        long j = this.f17413e;
        if (j == 0) {
            return 0L;
        }
        q qVar = this.f17412d;
        Intrinsics.checkNotNull(qVar);
        q qVar2 = qVar.f19602g;
        Intrinsics.checkNotNull(qVar2);
        int i7 = qVar2.f19598c;
        return (i7 >= 8192 || !qVar2.f19600e) ? j : j - ((long) (i7 - qVar2.f19597b));
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink f0(long j) {
        Y(j);
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
    }

    public final void g(Buffer out, long j, long j5) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j7 = j;
        v.f(this.f17413e, j7, j5);
        if (j5 == 0) {
            return;
        }
        out.f17413e += j5;
        q qVar = this.f17412d;
        while (true) {
            Intrinsics.checkNotNull(qVar);
            long j10 = qVar.f19598c - qVar.f19597b;
            if (j7 < j10) {
                break;
            }
            j7 -= j10;
            qVar = qVar.f19601f;
        }
        q qVar2 = qVar;
        long j11 = j5;
        while (j11 > 0) {
            Intrinsics.checkNotNull(qVar2);
            q qVarC = qVar2.c();
            int i7 = qVarC.f19597b + ((int) j7);
            qVarC.f19597b = i7;
            qVarC.f19598c = Math.min(i7 + ((int) j11), qVarC.f19598c);
            q qVar3 = out.f17412d;
            if (qVar3 == null) {
                qVarC.f19602g = qVarC;
                qVarC.f19601f = qVarC;
                out.f17412d = qVarC;
            } else {
                Intrinsics.checkNotNull(qVar3);
                q qVar4 = qVar3.f19602g;
                Intrinsics.checkNotNull(qVar4);
                qVar4.b(qVarC);
            }
            j11 -= (long) (qVarC.f19598c - qVarC.f19597b);
            qVar2 = qVar2.f19601f;
            j7 = 0;
        }
    }

    @Override // okio.BufferedSink
    public final OutputStream g0() {
        return new k(this, 1);
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public final Buffer h() {
        return this;
    }

    public final int hashCode() {
        q qVar = this.f17412d;
        if (qVar == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i10 = qVar.f19598c;
            for (int i11 = qVar.f19597b; i11 < i10; i11++) {
                i7 = (i7 * 31) + qVar.f19596a[i11];
            }
            qVar = qVar.f19601f;
            Intrinsics.checkNotNull(qVar);
        } while (qVar != this.f17412d);
        return i7;
    }

    @Override // okio.BufferedSource
    public final long i0() throws EOFException {
        int i7;
        if (this.f17413e == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z5 = false;
        long j = 0;
        do {
            q qVar = this.f17412d;
            Intrinsics.checkNotNull(qVar);
            byte[] bArr = qVar.f19596a;
            int i11 = qVar.f19597b;
            int i12 = qVar.f19598c;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                byte b11 = (byte) 48;
                if (b10 < b11 || b10 > ((byte) 57)) {
                    byte b12 = (byte) 97;
                    if ((b10 < b12 || b10 > ((byte) 102)) && (b10 < (b12 = (byte) 65) || b10 > ((byte) 70))) {
                        z5 = true;
                        if (i10 != 0) {
                            break;
                        }
                        char[] cArr = ss.b.f20565a;
                        char[] cArr2 = {cArr[(b10 >> 4) & 15], cArr[b10 & 15]};
                        Intrinsics.checkNotNullParameter(cArr2, "<this>");
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(cArr2)));
                    }
                    i7 = (b10 - b12) + 10;
                } else {
                    i7 = b10 - b11;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    Buffer buffer = new Buffer();
                    buffer.a0(j);
                    buffer.U(b10);
                    throw new NumberFormatException("Number too large: ".concat(buffer.V()));
                }
                j = (j << 4) | ((long) i7);
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.f17412d = qVar.a();
                r.a(qVar);
            } else {
                qVar.f19597b = i11;
            }
            if (z5) {
                break;
            }
        } while (this.f17412d != null);
        this.f17413e -= (long) i10;
        return j;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(int i7, int i10, String string) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i7 < 0) {
            throw new IllegalArgumentException(b.h(i7, "beginIndex < 0: ").toString());
        }
        if (i10 < i7) {
            throw new IllegalArgumentException(e.g(i10, i7, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i10 > string.length()) {
            StringBuilder sbS = e.s(i10, "endIndex > string.length: ", " > ");
            sbS.append(string.length());
            throw new IllegalArgumentException(sbS.toString().toString());
        }
        while (i7 < i10) {
            char cCharAt2 = string.charAt(i7);
            if (cCharAt2 < 128) {
                q qVarQ = Q(1);
                byte[] bArr = qVarQ.f19596a;
                int i11 = qVarQ.f19598c - i7;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i7 + 1;
                bArr[i7 + i11] = (byte) cCharAt2;
                while (true) {
                    i7 = i12;
                    if (i7 >= iMin || (cCharAt = string.charAt(i7)) >= 128) {
                        break;
                    }
                    i12 = i7 + 1;
                    bArr[i7 + i11] = (byte) cCharAt;
                }
                int i13 = qVarQ.f19598c;
                int i14 = (i11 + i7) - i13;
                qVarQ.f19598c = i13 + i14;
                this.f17413e += (long) i14;
            } else {
                if (cCharAt2 < 2048) {
                    q qVarQ2 = Q(2);
                    byte[] bArr2 = qVarQ2.f19596a;
                    int i15 = qVarQ2.f19598c;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | JfifUtil.MARKER_SOFn);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    qVarQ2.f19598c = i15 + 2;
                    this.f17413e += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    q qVarQ3 = Q(3);
                    byte[] bArr3 = qVarQ3.f19596a;
                    int i16 = qVarQ3.f19598c;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    qVarQ3.f19598c = i16 + 3;
                    this.f17413e += 3;
                } else {
                    int i17 = i7 + 1;
                    char cCharAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        U(63);
                        i7 = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        q qVarQ4 = Q(4);
                        byte[] bArr4 = qVarQ4.f19596a;
                        int i19 = qVarQ4.f19598c;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        qVarQ4.f19598c = i19 + 4;
                        this.f17413e += 4;
                        i7 += 2;
                    }
                }
                i7++;
            }
        }
    }

    @Override // okio.BufferedSource
    public final InputStream k0() {
        return new rs.e(this, 0);
    }

    public final boolean l() {
        return this.f17413e == 0;
    }

    public final void l0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        j0(0, string.length(), string);
    }

    @Override // okio.BufferedSource
    public final ByteString m(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(b.i(j, "byteCount: ").toString());
        }
        if (this.f17413e < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(B(j));
        }
        ByteString byteStringP = P((int) j);
        skip(j);
        return byteStringP;
    }

    public final void m0(int i7) {
        String strF;
        if (i7 < 128) {
            U(i7);
            return;
        }
        if (i7 < 2048) {
            q qVarQ = Q(2);
            byte[] bArr = qVarQ.f19596a;
            int i10 = qVarQ.f19598c;
            bArr[i10] = (byte) ((i7 >> 6) | JfifUtil.MARKER_SOFn);
            bArr[i10 + 1] = (byte) ((i7 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            qVarQ.f19598c = i10 + 2;
            this.f17413e += 2;
            return;
        }
        if (55296 <= i7 && i7 < 57344) {
            U(63);
            return;
        }
        if (i7 < 65536) {
            q qVarQ2 = Q(3);
            byte[] bArr2 = qVarQ2.f19596a;
            int i11 = qVarQ2.f19598c;
            bArr2[i11] = (byte) ((i7 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i7 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            bArr2[i11 + 2] = (byte) ((i7 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            qVarQ2.f19598c = i11 + 3;
            this.f17413e += 3;
            return;
        }
        if (i7 <= 1114111) {
            q qVarQ3 = Q(4);
            byte[] bArr3 = qVarQ3.f19596a;
            int i12 = qVarQ3.f19598c;
            bArr3[i12] = (byte) ((i7 >> 18) | 240);
            bArr3[i12 + 1] = (byte) (((i7 >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            bArr3[i12 + 2] = (byte) (((i7 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            bArr3[i12 + 3] = (byte) ((i7 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            qVarQ3.f19598c = i12 + 4;
            this.f17413e += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
        if (i7 != 0) {
            char[] cArr = ss.b.f20565a;
            char[] cArr2 = {cArr[(i7 >> 28) & 15], cArr[(i7 >> 24) & 15], cArr[(i7 >> 20) & 15], cArr[(i7 >> 16) & 15], cArr[(i7 >> 12) & 15], cArr[(i7 >> 8) & 15], cArr[(i7 >> 4) & 15], cArr[i7 & 15]};
            int i13 = 0;
            while (i13 < 8 && cArr2[i13] == '0') {
                i13++;
            }
            strF = x.f(cArr2, i13, 8);
        } else {
            strF = "0";
        }
        sb2.append(strF);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final byte n(long j) {
        v.f(this.f17413e, j, 1L);
        q qVar = this.f17412d;
        if (qVar == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        long j5 = this.f17413e;
        if (j5 - j < j) {
            while (j5 > j) {
                qVar = qVar.f19602g;
                Intrinsics.checkNotNull(qVar);
                j5 -= (long) (qVar.f19598c - qVar.f19597b);
            }
            Intrinsics.checkNotNull(qVar);
            return qVar.f19596a[(int) ((((long) qVar.f19597b) + j) - j5)];
        }
        long j7 = 0;
        while (true) {
            long j10 = ((long) (qVar.f19598c - qVar.f19597b)) + j7;
            if (j10 > j) {
                Intrinsics.checkNotNull(qVar);
                return qVar.f19596a[(int) ((((long) qVar.f19597b) + j) - j7)];
            }
            qVar = qVar.f19601f;
            Intrinsics.checkNotNull(qVar);
            j7 = j10;
        }
    }

    @Override // okio.BufferedSink
    public final BufferedSink p() {
        return this;
    }

    public final long q(byte b10, long j, long j5) {
        q qVar;
        long j7 = j;
        long j10 = j5;
        long j11 = 0;
        if (0 > j7 || j7 > j10) {
            throw new IllegalArgumentException(("size=" + this.f17413e + " fromIndex=" + j7 + " toIndex=" + j10).toString());
        }
        long j12 = this.f17413e;
        if (j10 > j12) {
            j10 = j12;
        }
        long j13 = -1;
        if (j7 == j10 || (qVar = this.f17412d) == null) {
            return -1L;
        }
        if (j12 - j7 < j7) {
            while (j12 > j7) {
                qVar = qVar.f19602g;
                Intrinsics.checkNotNull(qVar);
                j12 -= (long) (qVar.f19598c - qVar.f19597b);
            }
            while (j12 < j10) {
                byte[] bArr = qVar.f19596a;
                long j14 = j13;
                int iMin = (int) Math.min(qVar.f19598c, (((long) qVar.f19597b) + j10) - j12);
                for (int i7 = (int) ((((long) qVar.f19597b) + j7) - j12); i7 < iMin; i7++) {
                    if (bArr[i7] == b10) {
                        return ((long) (i7 - qVar.f19597b)) + j12;
                    }
                }
                j12 += (long) (qVar.f19598c - qVar.f19597b);
                qVar = qVar.f19601f;
                Intrinsics.checkNotNull(qVar);
                j13 = j14;
                j7 = j12;
            }
            return j13;
        }
        while (true) {
            long j15 = ((long) (qVar.f19598c - qVar.f19597b)) + j11;
            if (j15 > j7) {
                break;
            }
            qVar = qVar.f19601f;
            Intrinsics.checkNotNull(qVar);
            j11 = j15;
        }
        while (j11 < j10) {
            byte[] bArr2 = qVar.f19596a;
            int iMin2 = (int) Math.min(qVar.f19598c, (((long) qVar.f19597b) + j10) - j11);
            for (int i10 = (int) ((((long) qVar.f19597b) + j7) - j11); i10 < iMin2; i10++) {
                if (bArr2[i10] == b10) {
                    return ((long) (i10 - qVar.f19597b)) + j11;
                }
            }
            j11 += (long) (qVar.f19598c - qVar.f19597b);
            qVar = qVar.f19601f;
            Intrinsics.checkNotNull(qVar);
            j7 = j11;
        }
        return -1L;
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(b.i(j, "byteCount < 0: ").toString());
        }
        long j5 = this.f17413e;
        if (j5 == 0) {
            return -1L;
        }
        if (j > j5) {
            j = j5;
        }
        sink.H(this, j);
        return j;
    }

    @Override // okio.BufferedSource
    public final byte readByte() {
        if (this.f17413e == 0) {
            throw new EOFException();
        }
        q qVar = this.f17412d;
        Intrinsics.checkNotNull(qVar);
        int i7 = qVar.f19597b;
        int i10 = qVar.f19598c;
        int i11 = i7 + 1;
        byte b10 = qVar.f19596a[i7];
        this.f17413e--;
        if (i11 != i10) {
            qVar.f19597b = i11;
            return b10;
        }
        this.f17412d = qVar.a();
        r.a(qVar);
        return b10;
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i7 = 0;
        while (i7 < sink.length) {
            int i10 = read(sink, i7, sink.length - i7);
            if (i10 == -1) {
                throw new EOFException();
            }
            i7 += i10;
        }
    }

    @Override // okio.BufferedSource
    public final int readInt() throws EOFException {
        if (this.f17413e < 4) {
            throw new EOFException();
        }
        q qVar = this.f17412d;
        Intrinsics.checkNotNull(qVar);
        int i7 = qVar.f19597b;
        int i10 = qVar.f19598c;
        if (i10 - i7 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = qVar.f19596a;
        int i11 = i7 + 3;
        int i12 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 2] & 255) << 8);
        int i13 = i7 + 4;
        int i14 = (bArr[i11] & 255) | i12;
        this.f17413e -= 4;
        if (i13 != i10) {
            qVar.f19597b = i13;
            return i14;
        }
        this.f17412d = qVar.a();
        r.a(qVar);
        return i14;
    }

    @Override // okio.BufferedSource
    public final long readLong() throws EOFException {
        if (this.f17413e < 8) {
            throw new EOFException();
        }
        q qVar = this.f17412d;
        Intrinsics.checkNotNull(qVar);
        int i7 = qVar.f19597b;
        int i10 = qVar.f19598c;
        if (i10 - i7 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = qVar.f19596a;
        int i11 = i7 + 7;
        long j = ((((long) bArr[i7]) & 255) << 56) | ((((long) bArr[i7 + 1]) & 255) << 48) | ((((long) bArr[i7 + 2]) & 255) << 40) | ((((long) bArr[i7 + 3]) & 255) << 32) | ((((long) bArr[i7 + 4]) & 255) << 24) | ((((long) bArr[i7 + 5]) & 255) << 16) | ((((long) bArr[i7 + 6]) & 255) << 8);
        int i12 = i7 + 8;
        long j5 = j | (((long) bArr[i11]) & 255);
        this.f17413e -= 8;
        if (i12 != i10) {
            qVar.f19597b = i12;
            return j5;
        }
        this.f17412d = qVar.a();
        r.a(qVar);
        return j5;
    }

    @Override // okio.BufferedSource
    public final short readShort() throws EOFException {
        if (this.f17413e < 2) {
            throw new EOFException();
        }
        q qVar = this.f17412d;
        Intrinsics.checkNotNull(qVar);
        int i7 = qVar.f19597b;
        int i10 = qVar.f19598c;
        if (i10 - i7 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = qVar.f19596a;
        int i11 = i7 + 1;
        int i12 = (bArr[i7] & 255) << 8;
        int i13 = i7 + 2;
        int i14 = (bArr[i11] & 255) | i12;
        this.f17413e -= 2;
        if (i13 == i10) {
            this.f17412d = qVar.a();
            r.a(qVar);
        } else {
            qVar.f19597b = i13;
        }
        return (short) i14;
    }

    @Override // okio.BufferedSource
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            q qVar = this.f17412d;
            if (qVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, qVar.f19598c - qVar.f19597b);
            long j5 = iMin;
            this.f17413e -= j5;
            j -= j5;
            int i7 = qVar.f19597b + iMin;
            qVar.f19597b = i7;
            if (i7 == qVar.f19598c) {
                this.f17412d = qVar.a();
                r.a(qVar);
            }
        }
    }

    @Override // okio.BufferedSource
    public final byte[] t() {
        return B(this.f17413e);
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return Timeout.f17418d;
    }

    public final String toString() {
        long j = this.f17413e;
        if (j <= 2147483647L) {
            return P((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f17413e).toString());
    }

    public final long u(ByteString bytes, long j) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.c() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j5 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(b.i(j, "fromIndex < 0: ").toString());
        }
        q qVar = this.f17412d;
        if (qVar == null) {
            return -1L;
        }
        long j7 = this.f17413e;
        if (j7 - j < j) {
            while (j7 > j) {
                qVar = qVar.f19602g;
                Intrinsics.checkNotNull(qVar);
                j7 -= (long) (qVar.f19598c - qVar.f19597b);
            }
            byte[] bArrE = bytes.e();
            byte b10 = bArrE[0];
            int iC = bytes.c();
            long j10 = (this.f17413e - ((long) iC)) + 1;
            while (j7 < j10) {
                byte[] bArr = qVar.f19596a;
                int iMin = (int) Math.min(qVar.f19598c, (((long) qVar.f19597b) + j10) - j7);
                for (int i7 = (int) ((((long) qVar.f19597b) + j) - j7); i7 < iMin; i7++) {
                    if (bArr[i7] == b10 && ss.a.a(qVar, i7 + 1, bArrE, iC)) {
                        return ((long) (i7 - qVar.f19597b)) + j7;
                    }
                }
                j7 += (long) (qVar.f19598c - qVar.f19597b);
                qVar = qVar.f19601f;
                Intrinsics.checkNotNull(qVar);
                j = j7;
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (qVar.f19598c - qVar.f19597b)) + j5;
            if (j11 > j) {
                break;
            }
            qVar = qVar.f19601f;
            Intrinsics.checkNotNull(qVar);
            j5 = j11;
        }
        byte[] bArrE2 = bytes.e();
        byte b11 = bArrE2[0];
        int iC2 = bytes.c();
        long j12 = (this.f17413e - ((long) iC2)) + 1;
        while (j5 < j12) {
            byte[] bArr2 = qVar.f19596a;
            int iMin2 = (int) Math.min(qVar.f19598c, (((long) qVar.f19597b) + j12) - j5);
            for (int i10 = (int) ((((long) qVar.f19597b) + j) - j5); i10 < iMin2; i10++) {
                if (bArr2[i10] == b11 && ss.a.a(qVar, i10 + 1, bArrE2, iC2)) {
                    return ((long) (i10 - qVar.f19597b)) + j5;
                }
            }
            j5 += (long) (qVar.f19598c - qVar.f19597b);
            qVar = qVar.f19601f;
            Intrinsics.checkNotNull(qVar);
            j = j5;
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final void v(Buffer sink, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j5 = this.f17413e;
        if (j5 >= j) {
            sink.H(this, j);
        } else {
            sink.H(this, j5);
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public final String w(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(b.i(j, "limit < 0: ").toString());
        }
        long j5 = LongCompanionObject.MAX_VALUE;
        if (j != LongCompanionObject.MAX_VALUE) {
            j5 = j + 1;
        }
        long j7 = j5;
        byte b10 = (byte) 10;
        long jQ = q(b10, 0L, j7);
        if (jQ != -1) {
            return ss.a.b(this, jQ);
        }
        if (j7 < this.f17413e && n(j7 - 1) == ((byte) 13) && n(j7) == b10) {
            return ss.a.b(this, j7);
        }
        Buffer buffer = new Buffer();
        g(buffer, 0L, Math.min(32, this.f17413e));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f17413e, j) + " content=" + buffer.m(buffer.f17413e).d() + (char) 8230);
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr) {
        m1268write(bArr);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeByte(int i7) {
        U(i7);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeInt(int i7) {
        c0(i7);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeShort(int i7) {
        e0(i7);
        return this;
    }

    public final d z(d unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        byte[] bArr = ss.a.f20564a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (unsafeCursor == v.f19609a) {
            unsafeCursor = new d();
        }
        if (unsafeCursor.f19559d != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.f19559d = this;
        unsafeCursor.f19560e = true;
        return unsafeCursor;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr, int i7, int i10) {
        m1269write(bArr, i7, i10);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i7 = iRemaining;
        while (i7 > 0) {
            q qVarQ = Q(1);
            int iMin = Math.min(i7, 8192 - qVarQ.f19598c);
            source.get(qVarQ.f19596a, qVarQ.f19598c, iMin);
            i7 -= iMin;
            qVarQ.f19598c += iMin;
        }
        this.f17413e += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m1268write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        m1269write(source, 0, source.length);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        q qVar = this.f17412d;
        if (qVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), qVar.f19598c - qVar.f19597b);
        sink.put(qVar.f19596a, qVar.f19597b, iMin);
        int i7 = qVar.f19597b + iMin;
        qVar.f19597b = i7;
        this.f17413e -= (long) iMin;
        if (i7 == qVar.f19598c) {
            this.f17412d = qVar.a();
            r.a(qVar);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m1269write(byte[] source, int i7, int i10) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i10;
        v.f(source.length, i7, j);
        int i11 = i10 + i7;
        while (i7 < i11) {
            q qVarQ = Q(1);
            int iMin = Math.min(i11 - i7, 8192 - qVarQ.f19598c);
            int i12 = i7 + iMin;
            w.c(qVarQ.f19598c, i7, i12, source, qVarQ.f19596a);
            qVarQ.f19598c += iMin;
            i7 = i12;
        }
        this.f17413e += j;
    }

    public final int read(byte[] sink, int i7, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        v.f(sink.length, i7, i10);
        q qVar = this.f17412d;
        if (qVar == null) {
            return -1;
        }
        int iMin = Math.min(i10, qVar.f19598c - qVar.f19597b);
        byte[] bArr = qVar.f19596a;
        int i11 = qVar.f19597b;
        w.c(i7, i11, i11 + iMin, bArr, sink);
        int i12 = qVar.f19597b + iMin;
        qVar.f19597b = i12;
        this.f17413e -= (long) iMin;
        if (i12 == qVar.f19598c) {
            this.f17412d = qVar.a();
            r.a(qVar);
        }
        return iMin;
    }
}
