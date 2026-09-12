package ic;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends z {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11598i = 150000;
    public final long j = 20000;
    public final short k = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f11601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f11602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11606s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f11607t;

    public p0() {
        byte[] bArr = je.e0.f13793f;
        this.f11601n = bArr;
        this.f11602o = bArr;
    }

    @Override // ic.z, ic.n
    public final boolean c() {
        return this.f11600m;
    }

    @Override // ic.n
    public final void d(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f11696g.hasRemaining()) {
            int i7 = this.f11603p;
            if (i7 == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f11601n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.k) {
                            int i10 = this.f11599l;
                            iPosition = ((iLimit2 / i10) * i10) + i10;
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f11603p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    k(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f11606s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i7 == 1) {
                int iLimit3 = byteBuffer.limit();
                int iL = l(byteBuffer);
                int iPosition2 = iL - byteBuffer.position();
                byte[] bArr = this.f11601n;
                int length = bArr.length;
                int i11 = this.f11604q;
                int i12 = length - i11;
                if (iL >= iLimit3 || iPosition2 >= i12) {
                    int iMin = Math.min(iPosition2, i12);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f11601n, this.f11604q, iMin);
                    int i13 = this.f11604q + iMin;
                    this.f11604q = i13;
                    byte[] bArr2 = this.f11601n;
                    if (i13 == bArr2.length) {
                        if (this.f11606s) {
                            m(bArr2, this.f11605r);
                            this.f11607t += (long) ((this.f11604q - (this.f11605r * 2)) / this.f11599l);
                        } else {
                            this.f11607t += (long) ((i13 - this.f11605r) / this.f11599l);
                        }
                        n(byteBuffer, this.f11601n, this.f11604q);
                        this.f11604q = 0;
                        this.f11603p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    m(bArr, i11);
                    this.f11604q = 0;
                    this.f11603p = 0;
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iL2 = l(byteBuffer);
                byteBuffer.limit(iL2);
                this.f11607t += (long) (byteBuffer.remaining() / this.f11599l);
                n(byteBuffer, this.f11602o, this.f11605r);
                if (iL2 < iLimit4) {
                    m(this.f11602o, this.f11605r);
                    this.f11603p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // ic.z
    public final l g(l lVar) throws m {
        if (lVar.f11564c == 2) {
            return this.f11600m ? lVar : l.f11561e;
        }
        throw new m(lVar);
    }

    @Override // ic.z
    public final void h() {
        if (this.f11600m) {
            l lVar = this.f11691b;
            int i7 = lVar.f11565d;
            this.f11599l = i7;
            int i10 = lVar.f11562a;
            int i11 = ((int) ((this.f11598i * ((long) i10)) / 1000000)) * i7;
            if (this.f11601n.length != i11) {
                this.f11601n = new byte[i11];
            }
            int i12 = ((int) ((this.j * ((long) i10)) / 1000000)) * i7;
            this.f11605r = i12;
            if (this.f11602o.length != i12) {
                this.f11602o = new byte[i12];
            }
        }
        this.f11603p = 0;
        this.f11607t = 0L;
        this.f11604q = 0;
        this.f11606s = false;
    }

    @Override // ic.z
    public final void i() {
        int i7 = this.f11604q;
        if (i7 > 0) {
            m(this.f11601n, i7);
        }
        if (this.f11606s) {
            return;
        }
        this.f11607t += (long) (this.f11605r / this.f11599l);
    }

    @Override // ic.z
    public final void j() {
        this.f11600m = false;
        this.f11605r = 0;
        byte[] bArr = je.e0.f13793f;
        this.f11601n = bArr;
        this.f11602o = bArr;
    }

    public final int l(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.k) {
                int i7 = this.f11599l;
                return (iPosition / i7) * i7;
            }
        }
        return byteBuffer.limit();
    }

    public final void m(byte[] bArr, int i7) {
        k(i7).put(bArr, 0, i7).flip();
        if (i7 > 0) {
            this.f11606s = true;
        }
    }

    public final void n(ByteBuffer byteBuffer, byte[] bArr, int i7) {
        int iMin = Math.min(byteBuffer.remaining(), this.f11605r);
        int i10 = this.f11605r - iMin;
        System.arraycopy(bArr, i7 - i10, this.f11602o, 0, i10);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f11602o, i10, iMin);
    }
}
