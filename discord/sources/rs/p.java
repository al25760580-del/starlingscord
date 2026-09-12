package rs;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.CharsKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class p implements BufferedSource {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Source f19593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Buffer f19594e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19595i;

    public p(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f19593d = source;
        this.f19594e = new Buffer();
    }

    @Override // okio.BufferedSource
    public final String E(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        Source source = this.f19593d;
        Buffer buffer = this.f19594e;
        buffer.J(source);
        return buffer.E(charset);
    }

    @Override // okio.BufferedSource
    public final ByteString L() {
        Source source = this.f19593d;
        Buffer buffer = this.f19594e;
        buffer.J(source);
        return buffer.m(buffer.f17413e);
    }

    @Override // okio.BufferedSource
    public final boolean N(long j) {
        Buffer buffer;
        if (j < 0) {
            throw new IllegalArgumentException(kk.b.i(j, "byteCount < 0: ").toString());
        }
        if (this.f19595i) {
            throw new IllegalStateException("closed");
        }
        do {
            buffer = this.f19594e;
            if (buffer.f17413e >= j) {
                return true;
            }
        } while (this.f19593d.read(buffer, 8192L) != -1);
        return false;
    }

    @Override // okio.BufferedSource
    public final String S() {
        return w(LongCompanionObject.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final String V() {
        Source source = this.f19593d;
        Buffer buffer = this.f19594e;
        buffer.J(source);
        return buffer.V();
    }

    @Override // okio.BufferedSource
    public final long Z(Sink sink) {
        Buffer buffer;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (true) {
            Source source = this.f19593d;
            buffer = this.f19594e;
            if (source.read(buffer, 8192L) == -1) {
                break;
            }
            long jF = buffer.f();
            if (jF > 0) {
                j += jF;
                sink.H(buffer, jF);
            }
        }
        long j5 = buffer.f17413e;
        if (j5 <= 0) {
            return j;
        }
        long j7 = j + j5;
        sink.H(buffer, j5);
        return j7;
    }

    @Override // okio.BufferedSource
    public final int b0(m options) throws EOFException {
        Buffer buffer;
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f19595i) {
            throw new IllegalStateException("closed");
        }
        do {
            buffer = this.f19594e;
            int iC = ss.a.c(buffer, options, true);
            if (iC != -2) {
                if (iC == -1) {
                    break;
                }
                buffer.skip(options.f19582e[iC].c());
                return iC;
            }
        } while (this.f19593d.read(buffer, 8192L) != -1);
        return -1;
    }

    public final boolean c() {
        if (this.f19595i) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.f19594e;
        return buffer.l() && this.f19593d.read(buffer, 8192L) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f19595i) {
            return;
        }
        this.f19595i = true;
        this.f19593d.close();
        this.f19594e.c();
    }

    @Override // okio.BufferedSource
    public final void d0(long j) throws EOFException {
        if (!N(j)) {
            throw new EOFException();
        }
    }

    public final long f(byte b10, long j, long j5) {
        if (this.f19595i) {
            throw new IllegalStateException("closed");
        }
        if (0 > j5) {
            throw new IllegalArgumentException(kk.b.i(j5, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j5) {
            Buffer buffer = this.f19594e;
            byte b11 = b10;
            long j7 = j5;
            long jQ = buffer.q(b11, jMax, j7);
            if (jQ != -1) {
                return jQ;
            }
            long j10 = buffer.f17413e;
            if (j10 >= j7 || this.f19593d.read(buffer, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j10);
            b10 = b11;
            j5 = j7;
        }
        return -1L;
    }

    public final long g(ByteString targetBytes) {
        int i7;
        int i10;
        long j;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.f19595i) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            Buffer buffer = this.f19594e;
            buffer.getClass();
            Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
            long j5 = 0;
            if (jMax < 0) {
                throw new IllegalArgumentException(kk.b.i(jMax, "fromIndex < 0: ").toString());
            }
            q qVar = buffer.f17412d;
            if (qVar == null) {
                j = -1;
            } else {
                long j7 = buffer.f17413e;
                int i13 = 0;
                if (j7 - jMax < jMax) {
                    while (j7 > jMax) {
                        qVar = qVar.f19602g;
                        Intrinsics.checkNotNull(qVar);
                        j7 -= (long) (qVar.f19598c - qVar.f19597b);
                    }
                    if (targetBytes.c() == 2) {
                        byte bF = targetBytes.f(0);
                        byte bF2 = targetBytes.f(1);
                        long j10 = jMax;
                        while (true) {
                            if (j7 < buffer.f17413e) {
                                byte[] bArr = qVar.f19596a;
                                i11 = (int) ((((long) qVar.f19597b) + j10) - j7);
                                int i14 = qVar.f19598c;
                                while (true) {
                                    if (i11 >= i14) {
                                        j10 = j7 + ((long) (qVar.f19598c - qVar.f19597b));
                                        qVar = qVar.f19601f;
                                        Intrinsics.checkNotNull(qVar);
                                        j7 = j10;
                                    } else {
                                        byte b10 = bArr[i11];
                                        if (b10 == bF || b10 == bF2) {
                                            i12 = qVar.f19597b;
                                            j = ((long) (i11 - i12)) + j7;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            } else {
                                j = -1;
                            }
                        }
                    } else {
                        byte[] bArrE = targetBytes.e();
                        long j11 = jMax;
                        while (true) {
                            if (j7 < buffer.f17413e) {
                                byte[] bArr2 = qVar.f19596a;
                                i11 = (int) ((((long) qVar.f19597b) + j11) - j7);
                                int i15 = qVar.f19598c;
                                while (true) {
                                    if (i11 < i15) {
                                        byte b11 = bArr2[i11];
                                        int length = bArrE.length;
                                        int i16 = i13;
                                        while (true) {
                                            if (i16 >= length) {
                                                i11++;
                                                i13 = 0;
                                            } else if (b11 == bArrE[i16]) {
                                                i12 = qVar.f19597b;
                                                j = ((long) (i11 - i12)) + j7;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    } else {
                                        j11 = ((long) (qVar.f19598c - qVar.f19597b)) + j7;
                                        qVar = qVar.f19601f;
                                        Intrinsics.checkNotNull(qVar);
                                        j7 = j11;
                                        i13 = 0;
                                    }
                                }
                            } else {
                                j = -1;
                            }
                        }
                    }
                } else {
                    while (true) {
                        long j12 = ((long) (qVar.f19598c - qVar.f19597b)) + j5;
                        if (j12 > jMax) {
                            break;
                        }
                        qVar = qVar.f19601f;
                        Intrinsics.checkNotNull(qVar);
                        j5 = j12;
                    }
                    if (targetBytes.c() == 2) {
                        byte bF3 = targetBytes.f(0);
                        byte bF4 = targetBytes.f(1);
                        long j13 = jMax;
                        while (true) {
                            if (j5 < buffer.f17413e) {
                                byte[] bArr3 = qVar.f19596a;
                                i7 = (int) ((((long) qVar.f19597b) + j13) - j5);
                                int i17 = qVar.f19598c;
                                while (true) {
                                    if (i7 >= i17) {
                                        j13 = ((long) (qVar.f19598c - qVar.f19597b)) + j5;
                                        qVar = qVar.f19601f;
                                        Intrinsics.checkNotNull(qVar);
                                        j5 = j13;
                                    } else {
                                        byte b12 = bArr3[i7];
                                        if (b12 == bF3 || b12 == bF4) {
                                            i10 = qVar.f19597b;
                                            j = ((long) (i7 - i10)) + j5;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            } else {
                                j = -1;
                            }
                        }
                    } else {
                        int i18 = 0;
                        byte[] bArrE2 = targetBytes.e();
                        long j14 = jMax;
                        while (true) {
                            if (j5 < buffer.f17413e) {
                                byte[] bArr4 = qVar.f19596a;
                                i7 = (int) ((((long) qVar.f19597b) + j14) - j5);
                                int i19 = qVar.f19598c;
                                while (true) {
                                    if (i7 < i19) {
                                        byte b13 = bArr4[i7];
                                        int length2 = bArrE2.length;
                                        int i20 = i18;
                                        while (true) {
                                            if (i20 >= length2) {
                                                i7++;
                                                i18 = 0;
                                            } else if (b13 == bArrE2[i20]) {
                                                i10 = qVar.f19597b;
                                                j = ((long) (i7 - i10)) + j5;
                                            } else {
                                                i20++;
                                            }
                                        }
                                    } else {
                                        j14 = ((long) (qVar.f19598c - qVar.f19597b)) + j5;
                                        qVar = qVar.f19601f;
                                        Intrinsics.checkNotNull(qVar);
                                        j5 = j14;
                                        i18 = 0;
                                    }
                                }
                            } else {
                                j = -1;
                            }
                        }
                    }
                }
            }
            if (j != -1) {
                return j;
            }
            long j15 = buffer.f17413e;
            if (this.f19593d.read(buffer, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j15);
        }
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public final Buffer h() {
        return this.f19594e;
    }

    public final long i() {
        int i7;
        int i10;
        Buffer buffer;
        byte b10;
        d0(1L);
        long j = 0;
        long j5 = 0;
        while (true) {
            long j7 = j5 + 1;
            boolean zN = N(j7);
            i7 = 57;
            i10 = 48;
            buffer = this.f19594e;
            if (!zN) {
                break;
            }
            byte bN = buffer.n(j5);
            if ((bN < ((byte) 48) || bN > ((byte) 57)) && !(j5 == 0 && bN == ((byte) 45))) {
                if (j5 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bN, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j5 = j7;
        }
        if (buffer.f17413e == 0) {
            throw new EOFException();
        }
        long j10 = -7;
        long j11 = 0;
        int i11 = 0;
        boolean z5 = false;
        boolean z6 = false;
        loop1: while (true) {
            q qVar = buffer.f17412d;
            Intrinsics.checkNotNull(qVar);
            byte[] bArr = qVar.f19596a;
            int i12 = qVar.f19597b;
            long j12 = j;
            int i13 = qVar.f19598c;
            while (i12 < i13) {
                b10 = bArr[i12];
                byte b11 = (byte) i10;
                if (b10 >= b11 && b10 <= ((byte) i7)) {
                    int i14 = b11 - b10;
                    if (j11 < -922337203685477580L || (j11 == -922337203685477580L && i14 < j10)) {
                        break loop1;
                    }
                    j11 = (j11 * 10) + ((long) i14);
                } else {
                    if (b10 != ((byte) 45) || i11 != 0) {
                        z6 = true;
                        break;
                    }
                    j10--;
                    z5 = true;
                }
                i12++;
                i11++;
                i7 = 57;
                i10 = 48;
            }
            if (i12 == i13) {
                buffer.f17412d = qVar.a();
                r.a(qVar);
            } else {
                qVar.f19597b = i12;
            }
            if (z6 || buffer.f17412d == null) {
                long j13 = buffer.f17413e - ((long) i11);
                buffer.f17413e = j13;
                if (i11 >= (z5 ? 2 : 1)) {
                    return z5 ? j11 : -j11;
                }
                if (j13 == j12) {
                    throw new EOFException();
                }
                StringBuilder sbO = kk.b.o(z5 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                byte bN2 = buffer.n(j12);
                char[] cArr = ss.b.f20565a;
                char[] cArr2 = {cArr[(bN2 >> 4) & 15], cArr[bN2 & 15]};
                Intrinsics.checkNotNullParameter(cArr2, "<this>");
                sbO.append(new String(cArr2));
                throw new NumberFormatException(sbO.toString());
            }
            j = j12;
            i7 = 57;
            i10 = 48;
        }
        Buffer buffer2 = new Buffer();
        buffer2.Y(j11);
        buffer2.U(b10);
        if (!z5) {
            buffer2.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(buffer2.V()));
    }

    @Override // okio.BufferedSource
    public final long i0() throws EOFException {
        Buffer buffer;
        d0(1L);
        int i7 = 0;
        while (true) {
            int i10 = i7 + 1;
            boolean zN = N(i10);
            buffer = this.f19594e;
            if (!zN) {
                break;
            }
            byte bN = buffer.n(i7);
            if ((bN < ((byte) 48) || bN > ((byte) 57)) && ((bN < ((byte) 97) || bN > ((byte) 102)) && (bN < ((byte) 65) || bN > ((byte) 70)))) {
                if (i7 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bN, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i7 = i10;
        }
        return buffer.i0();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f19595i;
    }

    @Override // okio.BufferedSource
    public final InputStream k0() {
        return new e(this, 1);
    }

    public final int l() throws EOFException {
        d0(4L);
        int i7 = this.f19594e.readInt();
        return ((i7 & 255) << 24) | (((-16777216) & i7) >>> 24) | ((16711680 & i7) >>> 8) | ((65280 & i7) << 8);
    }

    @Override // okio.BufferedSource
    public final ByteString m(long j) throws EOFException {
        d0(j);
        return this.f19594e.m(j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Buffer buffer = this.f19594e;
        if (buffer.f17413e == 0 && this.f19593d.read(buffer, 8192L) == -1) {
            return -1;
        }
        return buffer.read(sink);
    }

    @Override // okio.BufferedSource
    public final byte readByte() throws EOFException {
        d0(1L);
        return this.f19594e.readByte();
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] sink) throws EOFException {
        Buffer buffer = this.f19594e;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            d0(sink.length);
            buffer.readFully(sink);
        } catch (EOFException e10) {
            int i7 = 0;
            while (true) {
                long j = buffer.f17413e;
                if (j <= 0) {
                    throw e10;
                }
                int i10 = buffer.read(sink, i7, (int) j);
                if (i10 == -1) {
                    throw new AssertionError();
                }
                i7 += i10;
            }
        }
    }

    @Override // okio.BufferedSource
    public final int readInt() throws EOFException {
        d0(4L);
        return this.f19594e.readInt();
    }

    @Override // okio.BufferedSource
    public final long readLong() throws EOFException {
        d0(8L);
        return this.f19594e.readLong();
    }

    @Override // okio.BufferedSource
    public final short readShort() throws EOFException {
        d0(2L);
        return this.f19594e.readShort();
    }

    @Override // okio.BufferedSource
    public final void skip(long j) throws EOFException {
        if (this.f19595i) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            Buffer buffer = this.f19594e;
            if (buffer.f17413e == 0 && this.f19593d.read(buffer, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, buffer.f17413e);
            buffer.skip(jMin);
            j -= jMin;
        }
    }

    @Override // okio.BufferedSource
    public final byte[] t() {
        Source source = this.f19593d;
        Buffer buffer = this.f19594e;
        buffer.J(source);
        return buffer.B(buffer.f17413e);
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.f19593d.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f19593d + ')';
    }

    @Override // okio.BufferedSource
    public final void v(Buffer sink, long j) throws EOFException {
        Buffer buffer = this.f19594e;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            d0(j);
            buffer.v(sink, j);
        } catch (EOFException e10) {
            sink.J(buffer);
            throw e10;
        }
    }

    @Override // okio.BufferedSource
    public final String w(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(kk.b.i(j, "limit < 0: ").toString());
        }
        long j5 = j == LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b10 = (byte) 10;
        long jF = f(b10, 0L, j5);
        Buffer buffer = this.f19594e;
        if (jF != -1) {
            return ss.a.b(buffer, jF);
        }
        if (j5 < LongCompanionObject.MAX_VALUE && N(j5) && buffer.n(j5 - 1) == ((byte) 13) && N(j5 + 1) && buffer.n(j5) == b10) {
            return ss.a.b(buffer, j5);
        }
        Buffer buffer2 = new Buffer();
        buffer.g(buffer2, 0L, Math.min(32, buffer.f17413e));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.f17413e, j) + " content=" + buffer2.m(buffer2.f17413e).d() + (char) 8230);
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j >= 0) {
            if (!this.f19595i) {
                Buffer buffer = this.f19594e;
                if (buffer.f17413e == 0 && this.f19593d.read(buffer, 8192L) == -1) {
                    return -1L;
                }
                return buffer.read(sink, Math.min(j, buffer.f17413e));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(kk.b.i(j, "byteCount < 0: ").toString());
    }
}
