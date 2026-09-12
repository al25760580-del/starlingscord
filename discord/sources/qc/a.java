package qc;

import com.google.android.exoplayer2.Format;
import di.d;
import gc.g0;
import gc.h1;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import je.b;
import je.e0;
import pc.h;
import pc.k;
import pc.l;
import pc.m;
import pc.n;
import pc.o;
import pc.u;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f18689n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f18690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f18691p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f18692q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f18693r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18699f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18702i;
    public m j;
    public x k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f18703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18704m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18694a = new byte[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18700g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f18690o = iArr;
        int i7 = e0.f13788a;
        Charset charset = d.f7631c;
        f18691p = "#!AMR\n".getBytes(charset);
        f18692q = "#!AMR-WB\n".getBytes(charset);
        f18693r = iArr[8];
    }

    public final int a(l lVar) throws h1 {
        boolean z5;
        lVar.t();
        byte[] bArr = this.f18694a;
        lVar.C(bArr, 0, 1);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw h1.a("Invalid padding bits for frame header " + ((int) b10), null);
        }
        int i7 = (b10 >> 3) & 15;
        if (i7 >= 0 && i7 <= 15 && (((z5 = this.f18695b) && (i7 < 10 || i7 > 13)) || (!z5 && (i7 < 12 || i7 > 14)))) {
            return z5 ? f18690o[i7] : f18689n[i7];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f18695b ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i7);
        throw h1.a(sb2.toString(), null);
    }

    public final boolean b(l lVar) {
        lVar.t();
        byte[] bArr = f18691p;
        byte[] bArr2 = new byte[bArr.length];
        lVar.C(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f18695b = false;
            lVar.u(bArr.length);
            return true;
        }
        lVar.t();
        byte[] bArr3 = f18692q;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.C(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f18695b = true;
        lVar.u(bArr3.length);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    @Override // pc.k
    public final int d(l lVar, n nVar) throws h1 {
        int iA;
        int i7;
        b.l(this.k);
        int i10 = e0.f13788a;
        if (((h) lVar).f17895v == 0 && !b(lVar)) {
            throw h1.a("Could not find AMR header.", null);
        }
        if (!this.f18704m) {
            this.f18704m = true;
            boolean z5 = this.f18695b;
            String str = z5 ? "audio/amr-wb" : "audio/3gpp";
            int i11 = z5 ? 16000 : 8000;
            x xVar = this.k;
            g0 g0Var = new g0();
            g0Var.k = str;
            g0Var.f9644l = f18693r;
            g0Var.f9656x = 1;
            g0Var.f9657y = i11;
            xVar.e(new Format(g0Var));
        }
        int i12 = -1;
        if (this.f18698e == 0) {
            try {
                int iA2 = a(lVar);
                this.f18697d = iA2;
                this.f18698e = iA2;
                if (this.f18700g == -1) {
                    long j = ((h) lVar).f17895v;
                    this.f18700g = iA2;
                }
                if (this.f18700g == iA2) {
                    this.f18701h++;
                }
                iA = this.k.a(lVar, this.f18698e, true);
                if (iA != -1) {
                    i7 = this.f18698e - iA;
                    this.f18698e = i7;
                    i12 = 0;
                    if (i7 <= 0) {
                        this.k.c(this.f18696c + this.f18702i, 1, this.f18697d, 0, null);
                        this.f18696c += 20000;
                    }
                }
            } catch (EOFException unused) {
            }
        } else {
            iA = this.k.a(lVar, this.f18698e, true);
            if (iA != -1) {
                i7 = this.f18698e - iA;
                this.f18698e = i7;
                i12 = 0;
                if (i7 <= 0) {
                    this.k.c(this.f18696c + this.f18702i, 1, this.f18697d, 0, null);
                    this.f18696c += 20000;
                }
            }
        }
        if (!this.f18699f) {
            o oVar = new o(-9223372036854775807L);
            this.f18703l = oVar;
            this.j.c(oVar);
            this.f18699f = true;
        }
        return i12;
    }

    @Override // pc.k
    public final void e(m mVar) {
        this.j = mVar;
        this.k = mVar.x(0, 1);
        mVar.q();
    }

    @Override // pc.k
    public final boolean f(l lVar) {
        return b(lVar);
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        this.f18696c = 0L;
        this.f18697d = 0;
        this.f18698e = 0;
        if (j != 0) {
            u uVar = this.f18703l;
            if (uVar instanceof wc.a) {
                wc.a aVar = (wc.a) uVar;
                this.f18702i = (Math.max(0L, j - aVar.f22087b) * 8000000) / ((long) aVar.f22090e);
                return;
            }
        }
        this.f18702i = 0L;
    }

    @Override // pc.k
    public final void release() {
    }
}
