package fe;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import ei.e0;
import ei.p0;
import ei.x;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends m {
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final int L;
    public final boolean M;
    public final boolean N;
    public final int O;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f9109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.a f9110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f9111y;

    /* JADX WARN: Code duplicated, block: B:115:0x013b  */
    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    /* JADX WARN: Code duplicated, block: B:51:0x007b  */
    public n(int i7, x0 x0Var, int i10, com.google.android.exoplayer2.trackselection.a aVar, int i11, int i12, boolean z5) {
        boolean z6;
        boolean z7;
        int i13;
        int i14;
        Format format;
        int i15;
        int i16;
        int i17;
        Format format2;
        int i18;
        int i19;
        int i20;
        super(i7, x0Var, i10);
        this.f9110x = aVar;
        boolean z10 = aVar.Z;
        e0 e0Var = aVar.I;
        int i21 = z10 ? 24 : 16;
        int i22 = 0;
        this.K = aVar.Y && (i12 & i21) != 0;
        if (!z5 || (((i18 = (format2 = this.f9108v).N) != -1 && i18 > aVar.f5740d) || ((i19 = format2.O) != -1 && i19 > aVar.f5741e))) {
            z6 = false;
        } else {
            float f2 = format2.P;
            if ((f2 == -1.0f || f2 <= aVar.f5742i) && ((i20 = format2.E) == -1 || i20 <= aVar.f5743v)) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        this.f9109w = z6;
        if (!z5 || (((i15 = (format = this.f9108v).N) != -1 && i15 < aVar.f5744w) || ((i16 = format.O) != -1 && i16 < aVar.f5745x))) {
            z7 = false;
        } else {
            float f7 = format.P;
            if ((f7 == -1.0f || f7 >= aVar.f5746y) && ((i17 = format.E) == -1 || i17 >= aVar.E)) {
                z7 = true;
            } else {
                z7 = false;
            }
        }
        this.f9111y = z7;
        this.E = DefaultTrackSelector.d(i11, false);
        Format format3 = this.f9108v;
        this.F = format3.E;
        int i23 = format3.N;
        this.G = (i23 == -1 || (i14 = format3.O) == -1) ? -1 : i23 * i14;
        int i24 = format3.f5530w;
        int i25 = aVar.J;
        int i26 = Integer.MAX_VALUE;
        this.I = (i24 == 0 || i24 != i25) ? Integer.bitCount(i24 & i25) : Integer.MAX_VALUE;
        int i27 = this.f9108v.f5530w;
        this.J = i27 == 0 || (i27 & 1) != 0;
        for (int i28 = 0; i28 < e0Var.size(); i28++) {
            String str = this.f9108v.I;
            if (str != null && str.equals(e0Var.get(i28))) {
                i26 = i28;
                break;
            }
        }
        this.H = i26;
        this.M = (i11 & 384) == 128;
        this.N = (i11 & 64) == 64;
        Format format4 = this.f9108v;
        String str2 = format4.I;
        if (str2 != null) {
            i13 = 4;
            switch (str2) {
                case "video/dolby-vision":
                    i13 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i13 = 3;
                    break;
                case "video/avc":
                    i13 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i13 = 2;
                    break;
                default:
                    i13 = 0;
                    break;
            }
        } else {
            i13 = 0;
        }
        this.O = i13;
        boolean z11 = this.f9109w;
        com.google.android.exoplayer2.trackselection.a aVar2 = this.f9110x;
        if ((format4.f5530w & 16384) == 0 && DefaultTrackSelector.d(i11, aVar2.h0) && (z11 || aVar2.X)) {
            i22 = (!DefaultTrackSelector.d(i11, false) || !this.f9111y || !z11 || format4.E == -1 || aVar2.U || aVar2.T || (i21 & i11) == 0) ? 1 : 2;
        }
        this.L = i22;
    }

    public static int c(n nVar, n nVar2) {
        x xVarB = x.f8383a.c(nVar.E, nVar2.E).a(nVar.I, nVar2.I).c(nVar.J, nVar2.J).c(nVar.f9109w, nVar2.f9109w).c(nVar.f9111y, nVar2.f9111y).b(Integer.valueOf(nVar.H), Integer.valueOf(nVar2.H), p0.f8342i);
        boolean z5 = nVar.M;
        x xVarC = xVarB.c(z5, nVar2.M);
        boolean z6 = nVar.N;
        x xVarC2 = xVarC.c(z6, nVar2.N);
        if (z5 && z6) {
            xVarC2 = xVarC2.a(nVar.O, nVar2.O);
        }
        return xVarC2.e();
    }

    @Override // fe.m
    public final int a() {
        return this.L;
    }

    @Override // fe.m
    public final boolean b(m mVar) {
        n nVar = (n) mVar;
        if (!this.K && !je.e0.a(this.f9108v.I, nVar.f9108v.I)) {
            return false;
        }
        if (this.f9110x.a0) {
            return true;
        }
        return this.M == nVar.M && this.N == nVar.N;
    }
}
