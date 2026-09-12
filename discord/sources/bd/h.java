package bd;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends lc.f {
    public long F;
    public int G;
    public int H;

    @Override // lc.f
    public final void e() {
        super.e();
        this.G = 0;
    }

    public final boolean k(lc.f fVar) {
        ByteBuffer byteBuffer;
        je.b.g(!fVar.c(1073741824));
        je.b.g(!fVar.c(268435456));
        je.b.g(!fVar.c(4));
        int i7 = this.G;
        if (i7 > 0) {
            if (i7 >= this.H || fVar.c(Integer.MIN_VALUE) != c(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = fVar.f15010v;
            if (byteBuffer2 != null && (byteBuffer = this.f15010v) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.G;
        this.G = i10 + 1;
        if (i10 == 0) {
            this.f15012x = fVar.f15012x;
            if (fVar.c(1)) {
                this.f14999e = 1;
            }
        }
        if (fVar.c(Integer.MIN_VALUE)) {
            this.f14999e = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = fVar.f15010v;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.f15010v.put(byteBuffer3);
        }
        this.F = fVar.f15012x;
        return true;
    }
}
