package rs;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Source {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f19570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f19571e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Inflater f19572i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f19573v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CRC32 f19574w;

    public i(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        p pVar = new p(source);
        this.f19571e = pVar;
        Inflater inflater = new Inflater(true);
        this.f19572i = inflater;
        this.f19573v = new k(pVar, inflater);
        this.f19574w = new CRC32();
    }

    public static void c(int i7, int i10, String str) throws IOException {
        if (i10 == i7) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i7)}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19573v.close();
    }

    public final void f(Buffer buffer, long j, long j5) {
        q qVar = buffer.f17412d;
        Intrinsics.checkNotNull(qVar);
        while (true) {
            int i7 = qVar.f19598c;
            int i10 = qVar.f19597b;
            if (j < i7 - i10) {
                break;
            }
            j -= (long) (i7 - i10);
            qVar = qVar.f19601f;
            Intrinsics.checkNotNull(qVar);
        }
        while (j5 > 0) {
            int i11 = (int) (((long) qVar.f19597b) + j);
            int iMin = (int) Math.min(qVar.f19598c - i11, j5);
            this.f19574w.update(qVar.f19596a, i11, iMin);
            j5 -= (long) iMin;
            qVar = qVar.f19601f;
            Intrinsics.checkNotNull(qVar);
            j = 0;
        }
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) throws IOException {
        long j5;
        i iVar = this;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(kk.b.i(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b10 = iVar.f19570d;
        CRC32 crc32 = iVar.f19574w;
        p pVar = iVar.f19571e;
        if (b10 == 0) {
            pVar.d0(10L);
            Buffer buffer = pVar.f19594e;
            byte bN = buffer.n(3L);
            boolean z5 = ((bN >> 1) & 1) == 1;
            if (z5) {
                iVar.f(buffer, 0L, 10L);
            }
            c(8075, pVar.readShort(), "ID1ID2");
            pVar.skip(8L);
            if (((bN >> 2) & 1) == 1) {
                pVar.d0(2L);
                if (z5) {
                    f(buffer, 0L, 2L);
                }
                short s2 = buffer.readShort();
                long j7 = (short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8));
                pVar.d0(j7);
                if (z5) {
                    f(buffer, 0L, j7);
                }
                pVar.skip(j7);
            }
            if (((bN >> 3) & 1) == 1) {
                long jF = pVar.f((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (jF == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    j5 = 2;
                    f(buffer, 0L, jF + 1);
                } else {
                    j5 = 2;
                }
                pVar.skip(jF + 1);
            } else {
                j5 = 2;
            }
            if (((bN >> 4) & 1) == 1) {
                j5 = j5;
                long jF2 = pVar.f((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (jF2 == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    iVar = this;
                    iVar.f(buffer, 0L, jF2 + 1);
                } else {
                    iVar = this;
                }
                pVar.skip(jF2 + 1);
            } else {
                iVar = this;
            }
            if (z5) {
                pVar.d0(j5);
                short s5 = buffer.readShort();
                c((short) (((s5 & 255) << 8) | ((s5 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            iVar.f19570d = (byte) 1;
        }
        if (iVar.f19570d == 1) {
            long j10 = sink.f17413e;
            long j11 = iVar.f19573v.read(sink, j);
            if (j11 != -1) {
                iVar.f(sink, j10, j11);
                return j11;
            }
            iVar.f19570d = (byte) 2;
        }
        if (iVar.f19570d == 2) {
            c(pVar.l(), (int) crc32.getValue(), "CRC");
            c(pVar.l(), (int) iVar.f19572i.getBytesWritten(), "ISIZE");
            iVar.f19570d = (byte) 3;
            if (!pVar.c()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.f19571e.f19593d.timeout();
    }
}
