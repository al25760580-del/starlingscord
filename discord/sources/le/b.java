package le;

import com.google.android.exoplayer2.Format;
import e4.r;
import java.nio.ByteBuffer;
import je.e0;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gc.e {
    public final lc.f L;
    public final w M;
    public long N;
    public a O;
    public long P;

    public b() {
        super(6);
        this.L = new lc.f(1);
        this.M = new w();
    }

    @Override // gc.e, gc.k1
    public final void c(int i7, Object obj) {
        if (i7 == 8) {
            this.O = (a) obj;
        }
    }

    @Override // gc.e
    public final String h() {
        return "CameraMotionRenderer";
    }

    @Override // gc.e
    public final boolean j() {
        return i();
    }

    @Override // gc.e
    public final boolean k() {
        return true;
    }

    @Override // gc.e
    public final void l() {
        a aVar = this.O;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // gc.e
    public final void n(long j, boolean z5) {
        this.P = Long.MIN_VALUE;
        a aVar = this.O;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // gc.e
    public final void s(Format[] formatArr, long j, long j5) {
        this.N = j5;
    }

    @Override // gc.e
    public final void u(long j, long j5) {
        float[] fArr;
        while (!i() && this.P < 100000 + j) {
            lc.f fVar = this.L;
            fVar.e();
            r rVar = this.f9603i;
            rVar.y();
            if (t(rVar, fVar, 0) != -4 || fVar.c(4)) {
                return;
            }
            this.P = fVar.f15012x;
            if (this.O != null && !fVar.c(Integer.MIN_VALUE)) {
                fVar.j();
                ByteBuffer byteBuffer = fVar.f15010v;
                int i7 = e0.f13788a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    w wVar = this.M;
                    wVar.D(bArrArray, iLimit);
                    wVar.F(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(wVar.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.O.a(this.P - this.N, fArr);
                }
            }
        }
    }

    @Override // gc.e
    public final int y(Format format) {
        return "application/x-camera-motion".equals(format.I) ? gc.e.e(4, 0, 0) : gc.e.e(0, 0, 0);
    }
}
