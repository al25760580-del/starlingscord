package pc;

import androidx.recyclerview.widget.RecyclerView;
import gc.f0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final he.k f17893e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f17894i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f17895v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17898y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f17896w = new byte[65536];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f17892d = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];

    static {
        f0.a("goog.exo.extractor");
    }

    public h(he.k kVar, long j, long j5) {
        this.f17893e = kVar;
        this.f17895v = j;
        this.f17894i = j5;
    }

    @Override // pc.l
    public final void C(byte[] bArr, int i7, int i10) {
        g(bArr, i7, i10, false);
    }

    @Override // pc.l
    public final int D() throws EOFException, InterruptedIOException {
        h hVar;
        int iMin = Math.min(this.f17898y, 1);
        f(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f17892d;
            hVar = this;
            iMin = hVar.e(bArr, 0, Math.min(1, bArr.length), 0, true);
        } else {
            hVar = this;
        }
        if (iMin != -1) {
            hVar.f17895v += (long) iMin;
        }
        return iMin;
    }

    @Override // pc.l
    public final boolean a(byte[] bArr, int i7, int i10, boolean z5) throws EOFException, InterruptedIOException {
        int iMin;
        int i11 = this.f17898y;
        if (i11 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i11, i10);
            System.arraycopy(this.f17896w, 0, bArr, i7, iMin);
            f(iMin);
        }
        int iE = iMin;
        while (iE < i10 && iE != -1) {
            iE = e(bArr, i7, i10, iE, z5);
        }
        if (iE != -1) {
            this.f17895v += (long) iE;
        }
        return iE != -1;
    }

    public final boolean b(int i7, boolean z5) throws EOFException, InterruptedIOException {
        c(i7);
        int iE = this.f17898y - this.f17897x;
        while (iE < i7) {
            int i10 = i7;
            boolean z6 = z5;
            iE = e(this.f17896w, this.f17897x, i10, iE, z6);
            if (iE == -1) {
                return false;
            }
            this.f17898y = this.f17897x + iE;
            i7 = i10;
            z5 = z6;
        }
        this.f17897x += i7;
        return true;
    }

    public final void c(int i7) {
        int i10 = this.f17897x + i7;
        byte[] bArr = this.f17896w;
        if (i10 > bArr.length) {
            this.f17896w = Arrays.copyOf(this.f17896w, e0.i(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    public final int e(byte[] bArr, int i7, int i10, int i11, boolean z5) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i12 = this.f17893e.read(bArr, i7 + i11, i10 - i11);
        if (i12 != -1) {
            return i11 + i12;
        }
        if (i11 == 0 && z5) {
            return -1;
        }
        throw new EOFException();
    }

    public final void f(int i7) {
        int i10 = this.f17898y - i7;
        this.f17898y = i10;
        this.f17897x = 0;
        byte[] bArr = this.f17896w;
        byte[] bArr2 = i10 < bArr.length - 524288 ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i10);
        this.f17896w = bArr2;
    }

    @Override // pc.l
    public final boolean g(byte[] bArr, int i7, int i10, boolean z5) {
        if (!b(i10, z5)) {
            return false;
        }
        System.arraycopy(this.f17896w, this.f17897x - i10, bArr, i7, i10);
        return true;
    }

    @Override // pc.l
    public final long getLength() {
        return this.f17894i;
    }

    @Override // pc.l
    public final long getPosition() {
        return this.f17895v;
    }

    @Override // pc.l
    public final long m() {
        return this.f17895v + ((long) this.f17897x);
    }

    @Override // pc.l
    public final void n(int i7) throws EOFException, InterruptedIOException {
        b(i7, false);
    }

    @Override // pc.l
    public final int r(byte[] bArr, int i7, int i10) throws EOFException, InterruptedIOException {
        h hVar;
        int iMin;
        c(i10);
        int i11 = this.f17898y;
        int i12 = this.f17897x;
        int i13 = i11 - i12;
        if (i13 == 0) {
            hVar = this;
            iMin = hVar.e(this.f17896w, i12, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            hVar.f17898y += iMin;
        } else {
            hVar = this;
            iMin = Math.min(i10, i13);
        }
        System.arraycopy(hVar.f17896w, hVar.f17897x, bArr, i7, iMin);
        hVar.f17897x += iMin;
        return iMin;
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) throws EOFException, InterruptedIOException {
        h hVar;
        int i11 = this.f17898y;
        int iE = 0;
        if (i11 != 0) {
            int iMin = Math.min(i11, i10);
            System.arraycopy(this.f17896w, 0, bArr, i7, iMin);
            f(iMin);
            iE = iMin;
        }
        if (iE == 0) {
            hVar = this;
            iE = hVar.e(bArr, i7, i10, 0, true);
        } else {
            hVar = this;
        }
        if (iE != -1) {
            hVar.f17895v += (long) iE;
        }
        return iE;
    }

    @Override // pc.l
    public final void readFully(byte[] bArr, int i7, int i10) throws EOFException, InterruptedIOException {
        a(bArr, i7, i10, false);
    }

    @Override // pc.l
    public final void t() {
        this.f17897x = 0;
    }

    @Override // pc.l
    public final void u(int i7) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f17898y, i7);
        f(iMin);
        int iE = iMin;
        while (iE < i7 && iE != -1) {
            byte[] bArr = this.f17892d;
            iE = e(bArr, -iE, Math.min(i7, bArr.length + iE), iE, false);
        }
        if (iE != -1) {
            this.f17895v += (long) iE;
        }
    }
}
