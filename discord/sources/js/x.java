package js;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Closeable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Logger f14197x = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedSink f14198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Buffer f14199e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14200i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14201v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f14202w;

    public x(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f14198d = sink;
        Buffer buffer = new Buffer();
        this.f14199e = buffer;
        this.f14200i = 16384;
        this.f14202w = new e(buffer);
    }

    public final synchronized void c(a0 peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f14201v) {
                throw new IOException("closed");
            }
            int i7 = this.f14200i;
            int i10 = peerSettings.f14088a;
            if ((i10 & 32) != 0) {
                i7 = peerSettings.f14089b[5];
            }
            this.f14200i = i7;
            if (((i10 & 2) != 0 ? peerSettings.f14089b[1] : -1) != -1) {
                e eVar = this.f14202w;
                int i11 = (i10 & 2) != 0 ? peerSettings.f14089b[1] : -1;
                eVar.getClass();
                int iMin = Math.min(i11, 16384);
                int i12 = eVar.f14117d;
                if (i12 != iMin) {
                    if (iMin < i12) {
                        eVar.f14115b = Math.min(eVar.f14115b, iMin);
                    }
                    eVar.f14116c = true;
                    eVar.f14117d = iMin;
                    int i13 = eVar.f14121h;
                    if (iMin < i13) {
                        if (iMin == 0) {
                            c[] cVarArr = eVar.f14118e;
                            kotlin.collections.w.k(cVarArr, null, 0, cVarArr.length);
                            eVar.f14119f = eVar.f14118e.length - 1;
                            eVar.f14120g = 0;
                            eVar.f14121h = 0;
                        } else {
                            eVar.a(i13 - iMin);
                        }
                    }
                }
            }
            g(0, 0, 4, 1);
            this.f14198d.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f14201v = true;
        this.f14198d.close();
    }

    public final synchronized void f(boolean z5, int i7, Buffer buffer, int i10) {
        if (this.f14201v) {
            throw new IOException("closed");
        }
        g(i7, i10, 0, z5 ? 1 : 0);
        if (i10 > 0) {
            BufferedSink bufferedSink = this.f14198d;
            Intrinsics.checkNotNull(buffer);
            bufferedSink.H(buffer, i10);
        }
    }

    public final synchronized void flush() {
        if (this.f14201v) {
            throw new IOException("closed");
        }
        this.f14198d.flush();
    }

    public final void g(int i7, int i10, int i11, int i12) {
        Level level = Level.FINE;
        Logger logger = f14197x;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(i7, i10, i11, i12, false));
        }
        if (i10 > this.f14200i) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f14200i + ": " + i10).toString());
        }
        if ((Integer.MIN_VALUE & i7) != 0) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("reserved bit set: ", Integer.valueOf(i7)).toString());
        }
        byte[] bArr = ds.b.f7815a;
        BufferedSink bufferedSink = this.f14198d;
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        bufferedSink.writeByte((i10 >>> 16) & 255);
        bufferedSink.writeByte((i10 >>> 8) & 255);
        bufferedSink.writeByte(i10 & 255);
        bufferedSink.writeByte(i11 & 255);
        bufferedSink.writeByte(i12 & 255);
        bufferedSink.writeInt(i7 & Integer.MAX_VALUE);
    }

    public final synchronized void i(int i7, b errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f14201v) {
            throw new IOException("closed");
        }
        if (errorCode.f14096d == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        g(0, debugData.length + 8, 7, 0);
        this.f14198d.writeInt(i7);
        this.f14198d.writeInt(errorCode.f14096d);
        if (debugData.length != 0) {
            this.f14198d.write(debugData);
        }
        this.f14198d.flush();
    }

    public final synchronized void l(boolean z5, int i7, ArrayList headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f14201v) {
            throw new IOException("closed");
        }
        this.f14202w.d(headerBlock);
        long j = this.f14199e.f17413e;
        long jMin = Math.min(this.f14200i, j);
        int i10 = j == jMin ? 4 : 0;
        if (z5) {
            i10 |= 1;
        }
        g(i7, (int) jMin, 1, i10);
        this.f14198d.H(this.f14199e, jMin);
        if (j > jMin) {
            long j5 = j - jMin;
            while (j5 > 0) {
                long jMin2 = Math.min(this.f14200i, j5);
                j5 -= jMin2;
                g(i7, (int) jMin2, 9, j5 == 0 ? 4 : 0);
                this.f14198d.H(this.f14199e, jMin2);
            }
        }
    }

    public final synchronized void n(int i7, int i10, boolean z5) {
        if (this.f14201v) {
            throw new IOException("closed");
        }
        g(0, 8, 6, z5 ? 1 : 0);
        this.f14198d.writeInt(i7);
        this.f14198d.writeInt(i10);
        this.f14198d.flush();
    }

    public final synchronized void q(int i7, b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f14201v) {
            throw new IOException("closed");
        }
        if (errorCode.f14096d == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        g(i7, 4, 3, 0);
        this.f14198d.writeInt(errorCode.f14096d);
        this.f14198d.flush();
    }

    public final synchronized void u(int i7, long j) {
        if (this.f14201v) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j)).toString());
        }
        g(i7, 4, 8, 0);
        this.f14198d.writeInt((int) j);
        this.f14198d.flush();
    }
}
