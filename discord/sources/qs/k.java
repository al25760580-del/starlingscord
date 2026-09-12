package qs;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import rs.q;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Closeable {
    public boolean E;
    public a F;
    public final byte[] G;
    public final rs.d H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedSink f19116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f19117e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19118i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f19119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f19120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Buffer f19121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Buffer f19122y;

    public k(BufferedSink sink, Random random, boolean z5, boolean z6, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f19116d = sink;
        this.f19117e = random;
        this.f19118i = z5;
        this.f19119v = z6;
        this.f19120w = j;
        this.f19121x = new Buffer();
        this.f19122y = sink.h();
        this.G = new byte[4];
        this.H = new rs.d();
    }

    public final void c(ByteString byteString, int i7) throws IOException {
        if (this.E) {
            throw new IOException("closed");
        }
        int iC = byteString.c();
        if (iC > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        int i10 = i7 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Buffer buffer = this.f19122y;
        buffer.U(i10);
        buffer.U(iC | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        byte[] bArr = this.G;
        Intrinsics.checkNotNull(bArr);
        this.f19117e.nextBytes(bArr);
        buffer.m1268write(bArr);
        if (iC > 0) {
            long j = buffer.f17413e;
            buffer.T(byteString);
            rs.d dVar = this.H;
            Intrinsics.checkNotNull(dVar);
            buffer.z(dVar);
            dVar.f(j);
            com.facebook.imagepipeline.nativecode.b.B(dVar, bArr);
            dVar.close();
        }
        this.f19116d.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        a aVar = this.F;
        if (aVar == null) {
            return;
        }
        aVar.close();
    }

    public final void f(ByteString data, int i7) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.E) {
            throw new IOException("closed");
        }
        Buffer buffer = this.f19121x;
        buffer.T(data);
        int i10 = i7 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (this.f19118i && data.c() >= this.f19120w) {
            a aVar = this.F;
            if (aVar == null) {
                aVar = new a(this.f19119v, 0);
                this.F = aVar;
            }
            is.e eVar = (is.e) aVar.f19072w;
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Buffer buffer2 = aVar.f19070i;
            if (buffer2.f17413e != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (aVar.f19069e) {
                ((Deflater) aVar.f19071v).reset();
            }
            eVar.H(buffer, buffer.f17413e);
            eVar.flush();
            ByteString bytes = b.f19073a;
            long j = buffer2.f17413e;
            byte[] bArr = bytes.f17415d;
            byte[] bArr2 = bytes.f17415d;
            long length = j - ((long) bArr.length);
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            int length2 = bArr2.length;
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            if (length < 0 || length2 < 0 || buffer2.f17413e - length < length2 || bArr2.length < length2) {
                buffer2.U(0);
                break;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    long j5 = buffer2.f17413e - ((long) 4);
                    rs.d dVarZ = buffer2.z(v.f19609a);
                    try {
                        dVarZ.c(j5);
                        dVarZ.close();
                        break;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ls.d.k(dVarZ, th2);
                            throw th3;
                        }
                    }
                }
                if (buffer2.n(((long) i11) + length) != bArr2[i11]) {
                    buffer2.U(0);
                    break;
                }
                i11++;
            }
            buffer.H(buffer2, buffer2.f17413e);
            i10 = i7 | JfifUtil.MARKER_SOFn;
        }
        long j7 = buffer.f17413e;
        Buffer buffer3 = this.f19122y;
        buffer3.U(i10);
        if (j7 <= 125) {
            buffer3.U(((int) j7) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        } else if (j7 <= 65535) {
            buffer3.U(254);
            buffer3.e0((int) j7);
        } else {
            buffer3.U(255);
            q qVarQ = buffer3.Q(8);
            byte[] bArr3 = qVarQ.f19596a;
            int i12 = qVarQ.f19598c;
            bArr3[i12] = (byte) ((j7 >>> 56) & 255);
            bArr3[i12 + 1] = (byte) ((j7 >>> 48) & 255);
            bArr3[i12 + 2] = (byte) ((j7 >>> 40) & 255);
            bArr3[i12 + 3] = (byte) ((j7 >>> 32) & 255);
            bArr3[i12 + 4] = (byte) ((j7 >>> 24) & 255);
            bArr3[i12 + 5] = (byte) ((j7 >>> 16) & 255);
            bArr3[i12 + 6] = (byte) ((j7 >>> 8) & 255);
            bArr3[i12 + 7] = (byte) (j7 & 255);
            qVarQ.f19598c = i12 + 8;
            buffer3.f17413e += 8;
        }
        byte[] bArr4 = this.G;
        Intrinsics.checkNotNull(bArr4);
        this.f19117e.nextBytes(bArr4);
        buffer3.m1268write(bArr4);
        if (j7 > 0) {
            rs.d dVar = this.H;
            Intrinsics.checkNotNull(dVar);
            buffer.z(dVar);
            dVar.f(0L);
            com.facebook.imagepipeline.nativecode.b.B(dVar, bArr4);
            dVar.close();
        }
        buffer3.H(buffer, j7);
        this.f19116d.p();
    }
}
