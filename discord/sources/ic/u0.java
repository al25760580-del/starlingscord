package ic;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends z {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11651i;
    public int j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f11653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11655o;

    @Override // ic.z, ic.n
    public final ByteBuffer a() {
        int i7;
        if (super.f() && (i7 = this.f11654n) > 0) {
            k(i7).put(this.f11653m, 0, this.f11654n).flip();
            this.f11654n = 0;
        }
        return super.a();
    }

    @Override // ic.n
    public final void d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i7 = iLimit - iPosition;
        if (i7 == 0) {
            return;
        }
        int iMin = Math.min(i7, this.f11652l);
        this.f11655o += (long) (iMin / this.f11691b.f11565d);
        this.f11652l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f11652l > 0) {
            return;
        }
        int i10 = i7 - iMin;
        int length = (this.f11654n + i10) - this.f11653m.length;
        ByteBuffer byteBufferK = k(length);
        int i11 = je.e0.i(length, 0, this.f11654n);
        byteBufferK.put(this.f11653m, 0, i11);
        int i12 = je.e0.i(length - i11, 0, i10);
        byteBuffer.limit(byteBuffer.position() + i12);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i13 = i10 - i12;
        int i14 = this.f11654n - i11;
        this.f11654n = i14;
        byte[] bArr = this.f11653m;
        System.arraycopy(bArr, i11, bArr, 0, i14);
        byteBuffer.get(this.f11653m, this.f11654n, i13);
        this.f11654n += i13;
        byteBufferK.flip();
    }

    @Override // ic.z, ic.n
    public final boolean f() {
        return super.f() && this.f11654n == 0;
    }

    @Override // ic.z
    public final l g(l lVar) throws m {
        if (lVar.f11564c != 2) {
            throw new m(lVar);
        }
        this.k = true;
        return (this.f11651i == 0 && this.j == 0) ? l.f11561e : lVar;
    }

    @Override // ic.z
    public final void h() {
        if (this.k) {
            this.k = false;
            int i7 = this.j;
            int i10 = this.f11691b.f11565d;
            this.f11653m = new byte[i7 * i10];
            this.f11652l = this.f11651i * i10;
        }
        this.f11654n = 0;
    }

    @Override // ic.z
    public final void i() {
        if (this.k) {
            int i7 = this.f11654n;
            if (i7 > 0) {
                this.f11655o += (long) (i7 / this.f11691b.f11565d);
            }
            this.f11654n = 0;
        }
    }

    @Override // ic.z
    public final void j() {
        this.f11653m = je.e0.f13793f;
    }
}
