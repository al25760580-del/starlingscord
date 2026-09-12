package ic;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends z {
    @Override // ic.n
    public final void d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i7 = iLimit - iPosition;
        int i10 = this.f11691b.f11564c;
        if (i10 == 3) {
            i7 *= 2;
        } else if (i10 == 4) {
            i7 /= 2;
        } else if (i10 != 268435456) {
            if (i10 != 536870912) {
                if (i10 != 805306368) {
                    throw new IllegalStateException();
                }
                i7 /= 2;
            } else {
                i7 /= 3;
                i7 *= 2;
            }
        }
        ByteBuffer byteBufferK = k(i7);
        int i11 = this.f11691b.f11564c;
        if (i11 == 3) {
            while (iPosition < iLimit) {
                byteBufferK.put((byte) 0);
                byteBufferK.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i11 == 4) {
            while (iPosition < iLimit) {
                short sH = (short) (je.e0.h(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferK.put((byte) (sH & 255));
                byteBufferK.put((byte) ((sH >> 8) & 255));
                iPosition += 4;
            }
        } else if (i11 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i11 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                byteBufferK.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // ic.z
    public final l g(l lVar) throws m {
        int i7 = lVar.f11564c;
        if (i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 536870912 || i7 == 805306368 || i7 == 4) {
            return i7 != 2 ? new l(lVar.f11562a, lVar.f11563b, 2) : l.f11561e;
        }
        throw new m(lVar);
    }
}
