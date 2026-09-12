package ic;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends z {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f11488i;
    public int[] j;

    @Override // ic.n
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f11691b.f11565d) * this.f11692c.f11565d);
        while (iPosition < iLimit) {
            for (int i7 : iArr) {
                byteBufferK.putShort(byteBuffer.getShort((i7 * 2) + iPosition));
            }
            iPosition += this.f11691b.f11565d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // ic.z
    public final l g(l lVar) throws m {
        int[] iArr = this.f11488i;
        if (iArr == null) {
            return l.f11561e;
        }
        int i7 = lVar.f11564c;
        int i10 = lVar.f11563b;
        if (i7 != 2) {
            throw new m(lVar);
        }
        boolean z5 = i10 != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= i10) {
                throw new m(lVar);
            }
            z5 |= i12 != i11;
            i11++;
        }
        return z5 ? new l(lVar.f11562a, iArr.length, 2) : l.f11561e;
    }

    @Override // ic.z
    public final void h() {
        this.j = this.f11488i;
    }

    @Override // ic.z
    public final void j() {
        this.j = null;
        this.f11488i = null;
    }
}
