package q8;

import com.facebook.common.references.CloseableReference;
import java.io.InputStream;
import n8.i;
import pa.q;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f18637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18638e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18639i;

    public f(q qVar) {
        boolean z5;
        synchronized (qVar) {
            z5 = CloseableReference.z(qVar.f17825e);
        }
        if (!z5) {
            throw new IllegalArgumentException();
        }
        this.f18637d = qVar;
        this.f18638e = 0;
        this.f18639i = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f18637d.n() - this.f18638e;
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        this.f18639i = this.f18638e;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        int i7 = this.f18638e;
        this.f18638e = i7 + 1;
        return this.f18637d.i(i7) & 255;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f18638e = this.f18639i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        i.a(Boolean.valueOf(j >= 0));
        int iMin = Math.min((int) j, available());
        this.f18638e += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        if (i7 >= 0 && i10 >= 0 && i7 + i10 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i10 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i10);
            this.f18637d.l(this.f18638e, i7, iMin, bArr);
            this.f18638e += iMin;
            return iMin;
        }
        StringBuilder sb2 = new StringBuilder("length=");
        a3.e.z(sb2, bArr.length, "; regionStart=", i7, "; regionLength=");
        sb2.append(i10);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
}
