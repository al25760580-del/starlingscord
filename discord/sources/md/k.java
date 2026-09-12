package md;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements DataSource {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DataSource f15640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15641e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f15642i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f15643v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15644w;

    public k(DataSource dataSource, int i7, d0 d0Var) {
        je.b.g(i7 > 0);
        this.f15640d = dataSource;
        this.f15641e = i7;
        this.f15642i = d0Var;
        this.f15643v = new byte[1];
        this.f15644w = i7;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void B(he.u0 u0Var) {
        u0Var.getClass();
        this.f15640d.B(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(he.p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) {
        int i11 = this.f15644w;
        DataSource dataSource = this.f15640d;
        if (i11 == 0) {
            byte[] bArr2 = this.f15643v;
            int i12 = 0;
            if (dataSource.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int i15 = dataSource.read(bArr3, i12, i14);
                        if (i15 != -1) {
                            i12 += i15;
                            i14 -= i15;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        je.w wVar = new je.w(bArr3, i13);
                        d0 d0Var = this.f15642i;
                        long jMax = !d0Var.I ? d0Var.F : Math.max(d0Var.J.h(true), d0Var.F);
                        int iA = wVar.a();
                        n0 n0Var = d0Var.H;
                        n0Var.getClass();
                        n0Var.d(iA, wVar);
                        n0Var.c(jMax, 1, iA, 0, null);
                        d0Var.I = true;
                    }
                }
                this.f15644w = this.f15641e;
            }
            return -1;
        }
        int i16 = dataSource.read(bArr, i7, Math.min(this.f15644w, i10));
        if (i16 != -1) {
            this.f15644w -= i16;
        }
        return i16;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map s() {
        return this.f15640d.s();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        return this.f15640d.y();
    }
}
