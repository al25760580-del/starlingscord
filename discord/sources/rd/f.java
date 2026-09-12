package rd;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends od.e {
    public byte[] G;
    public volatile boolean H;
    public byte[] I;

    @Override // he.h0
    public final void l() {
        try {
            this.F.d(this.f17222e);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.H) {
                byte[] bArr = this.G;
                if (bArr.length < i10 + 16384) {
                    this.G = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.F.read(this.G, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.H) {
                this.I = Arrays.copyOf(this.G, i10);
            }
        } finally {
            c9.a.f(this.F);
        }
    }

    @Override // he.h0
    public final void t() {
        this.H = true;
    }
}
