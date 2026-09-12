package io.sentry.cache.tape;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Closeable, Iterable {
    public static final byte[] H = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
    public final int F;
    public boolean G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RandomAccessFile f12557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f12558e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12559i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12560v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f12561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f f12562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final byte[] f12563y = new byte[32];
    public int E = 0;

    public h(File file, RandomAccessFile randomAccessFile, int i7) throws IOException {
        this.f12558e = file;
        this.f12557d = randomAccessFile;
        this.F = i7;
        Y();
    }

    public static int a0(byte[] bArr, int i7) {
        return ((bArr[i7] & 255) << 24) + ((bArr[i7 + 1] & 255) << 16) + ((bArr[i7 + 2] & 255) << 8) + (bArr[i7 + 3] & 255);
    }

    public static long c0(byte[] bArr, int i7) {
        return ((((long) bArr[i7]) & 255) << 56) + ((((long) bArr[i7 + 1]) & 255) << 48) + ((((long) bArr[i7 + 2]) & 255) << 40) + ((((long) bArr[i7 + 3]) & 255) << 32) + ((((long) bArr[i7 + 4]) & 255) << 24) + ((((long) bArr[i7 + 5]) & 255) << 16) + ((((long) bArr[i7 + 6]) & 255) << 8) + (((long) bArr[i7 + 7]) & 255);
    }

    public static RandomAccessFile i(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        return new RandomAccessFile(file, "rwd");
    }

    public static void p0(byte[] bArr, int i7, int i10) {
        bArr[i7] = (byte) (i10 >> 24);
        bArr[i7 + 1] = (byte) (i10 >> 16);
        bArr[i7 + 2] = (byte) (i10 >> 8);
        bArr[i7 + 3] = (byte) i10;
    }

    public static void q0(long j, byte[] bArr, int i7) {
        bArr[i7] = (byte) (j >> 56);
        bArr[i7 + 1] = (byte) (j >> 48);
        bArr[i7 + 2] = (byte) (j >> 40);
        bArr[i7 + 3] = (byte) (j >> 32);
        bArr[i7 + 4] = (byte) (j >> 24);
        bArr[i7 + 5] = (byte) (j >> 16);
        bArr[i7 + 6] = (byte) (j >> 8);
        bArr[i7 + 7] = (byte) j;
    }

    public final void Y() throws IOException {
        this.f12557d.seek(0L);
        RandomAccessFile randomAccessFile = this.f12557d;
        byte[] bArr = this.f12563y;
        randomAccessFile.readFully(bArr);
        this.f12559i = c0(bArr, 4);
        this.f12560v = a0(bArr, 12);
        long jC0 = c0(bArr, 16);
        long jC1 = c0(bArr, 24);
        if (this.f12559i <= this.f12557d.length()) {
            if (this.f12559i <= 32) {
                throw new IOException(a3.e.n(new StringBuilder("File is corrupt; length stored in header ("), this.f12559i, ") is invalid."));
            }
            this.f12561w = y(jC0);
            this.f12562x = y(jC1);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f12559i + ", Actual length: " + this.f12557d.length());
    }

    public final void clear() throws IOException {
        if (this.G) {
            throw new IllegalStateException("closed");
        }
        o0(4096L, 0, 0L, 0L);
        this.f12557d.seek(32L);
        this.f12557d.write(H, 0, 4064);
        this.f12560v = 0;
        f fVar = f.f12550c;
        this.f12561w = fVar;
        this.f12562x = fVar;
        if (this.f12559i > 4096) {
            this.f12557d.setLength(4096L);
            this.f12557d.getChannel().force(true);
        }
        this.f12559i = 4096L;
        this.E++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.G = true;
        this.f12557d.close();
    }

    public final void e0(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(s0.g.d(i7, "Cannot remove negative (", ") number of elements."));
        }
        if (i7 == 0) {
            return;
        }
        int i10 = this.f12560v;
        if (i7 == i10) {
            clear();
            return;
        }
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(kk.b.l(a3.e.s(i7, "Cannot remove more elements (", ") than present in queue ("), this.f12560v, ")."));
        }
        f fVar = this.f12561w;
        long j = fVar.f12551a;
        int iA0 = fVar.f12552b;
        long jN0 = j;
        long j5 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            j5 += (long) (iA0 + 4);
            jN0 = n0(jN0 + 4 + ((long) iA0));
            byte[] bArr = this.f12563y;
            if (!l0(jN0, bArr, 4)) {
                return;
            }
            iA0 = a0(bArr, 0);
        }
        o0(this.f12559i, this.f12560v - i7, jN0, this.f12562x.f12551a);
        this.f12560v -= i7;
        this.E++;
        this.f12561w = new f(jN0, iA0);
        while (j5 > 0) {
            int iMin = (int) Math.min(j5, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            m0(j, H, iMin);
            long j7 = iMin;
            j5 -= j7;
            j += j7;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g(this);
    }

    public final void j0() {
        this.f12557d.close();
        File file = this.f12558e;
        file.delete();
        this.f12557d = i(file);
        Y();
    }

    public final boolean l0(long j, byte[] bArr, int i7) throws IOException {
        try {
            long jN0 = n0(j);
            long j5 = ((long) i7) + jN0;
            long j7 = this.f12559i;
            if (j5 <= j7) {
                this.f12557d.seek(jN0);
                this.f12557d.readFully(bArr, 0, i7);
                return true;
            }
            int i10 = (int) (j7 - jN0);
            this.f12557d.seek(jN0);
            this.f12557d.readFully(bArr, 0, i10);
            this.f12557d.seek(32L);
            this.f12557d.readFully(bArr, i10, i7 - i10);
            return true;
        } catch (EOFException unused) {
            j0();
            return false;
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable unused2) {
            j0();
            return false;
        }
    }

    public final void m0(long j, byte[] bArr, int i7) throws IOException {
        long jN0 = n0(j);
        long j5 = ((long) i7) + jN0;
        long j7 = this.f12559i;
        if (j5 <= j7) {
            this.f12557d.seek(jN0);
            this.f12557d.write(bArr, 0, i7);
            return;
        }
        int i10 = (int) (j7 - jN0);
        this.f12557d.seek(jN0);
        this.f12557d.write(bArr, 0, i10);
        this.f12557d.seek(32L);
        this.f12557d.write(bArr, i10, i7 - i10);
    }

    public final long n0(long j) {
        long j5 = this.f12559i;
        return j < j5 ? j : (j + 32) - j5;
    }

    public final void o0(long j, int i7, long j5, long j7) throws IOException {
        this.f12557d.seek(0L);
        byte[] bArr = this.f12563y;
        p0(bArr, 0, -2147483647);
        q0(j, bArr, 4);
        p0(bArr, 12, i7);
        q0(j5, bArr, 16);
        q0(j7, bArr, 24);
        this.f12557d.write(bArr, 0, 32);
    }

    public final String toString() {
        return "QueueFile{file=" + this.f12558e + ", zero=true, length=" + this.f12559i + ", size=" + this.f12560v + ", first=" + this.f12561w + ", last=" + this.f12562x + '}';
    }

    public final f y(long j) {
        if (j != 0) {
            byte[] bArr = this.f12563y;
            if (l0(j, bArr, 4)) {
                return new f(j, a0(bArr, 0));
            }
        }
        return f.f12550c;
    }
}
