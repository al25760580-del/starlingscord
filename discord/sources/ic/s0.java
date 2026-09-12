package ic;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends z {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f11647i = Float.floatToIntBits(Float.NaN);

    @Override // ic.n
    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferK;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i7 = iLimit - iPosition;
        int i10 = this.f11691b.f11564c;
        int i11 = f11647i;
        if (i10 == 536870912) {
            byteBufferK = k((i7 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i11) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferK.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i10 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferK = k(i7);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i11) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferK.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // ic.z
    public final l g(l lVar) throws m {
        int i7 = lVar.f11564c;
        if (i7 == 536870912 || i7 == 805306368 || i7 == 4) {
            return i7 != 4 ? new l(lVar.f11562a, lVar.f11563b, 4) : l.f11561e;
        }
        throw new m(lVar);
    }
}
