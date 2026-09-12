package tc;

import androidx.recyclerview.widget.h0;
import com.google.android.exoplayer2.Format;
import gc.g0;
import gc.h1;
import ic.o0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import je.v;
import je.w;
import md.z0;
import pc.h;
import pc.j;
import pc.k;
import pc.l;
import pc.m;
import pc.n;
import pc.o;
import pc.s;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f20688a = new w(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f20689b = new w(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f20690c = new w(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f20691d = new w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f20692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f20693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20696i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f20698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20699n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f20700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f20701p;

    public b() {
        c cVar = new c(7, new j());
        cVar.f20702i = -9223372036854775807L;
        cVar.f20703v = new long[0];
        cVar.f20704w = new long[0];
        this.f20692e = cVar;
        this.f20694g = 1;
    }

    public final w a(l lVar) {
        int i7 = this.f20697l;
        w wVar = this.f20691d;
        byte[] bArr = wVar.f13860a;
        if (i7 > bArr.length) {
            wVar.D(new byte[Math.max(bArr.length * 2, i7)], 0);
        } else {
            wVar.F(0);
        }
        wVar.E(this.f20697l);
        lVar.readFully(wVar.f13860a, 0, this.f20697l);
        return wVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0298  */
    /* JADX WARN: Code duplicated, block: B:144:0x0390  */
    /* JADX WARN: Code duplicated, block: B:145:0x0394  */
    /* JADX WARN: Code duplicated, block: B:183:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0166  */
    /* JADX WARN: Code duplicated, block: B:99:0x0290  */
    @Override // pc.k
    public final int d(l lVar, n nVar) throws h1, EOFException, InterruptedIOException {
        long j;
        long j5;
        int i7;
        long j7;
        int i10;
        boolean z5;
        int i11;
        long j10;
        je.b.l(this.f20693f);
        while (true) {
            int i12 = this.f20694g;
            if (i12 == 1) {
                w wVar = this.f20689b;
                if (!((h) lVar).a(wVar.f13860a, 0, 9, true)) {
                    return -1;
                }
                wVar.F(0);
                wVar.G(4);
                int iU = wVar.u();
                boolean z6 = (iU & 4) != 0;
                boolean z7 = (iU & 1) != 0;
                if (z6 && this.f20700o == null) {
                    this.f20700o = new a(7, this.f20693f.x(8, 1));
                }
                if (z7 && this.f20701p == null) {
                    this.f20701p = new d(this.f20693f.x(9, 2));
                }
                this.f20693f.q();
                this.j = wVar.g() - 5;
                this.f20694g = 2;
            } else if (i12 == 2) {
                ((h) lVar).u(this.j);
                this.j = 0;
                this.f20694g = 3;
            } else if (i12 == 3) {
                w wVar2 = this.f20690c;
                if (!((h) lVar).a(wVar2.f13860a, 0, 11, true)) {
                    return -1;
                }
                wVar2.F(0);
                this.k = wVar2.u();
                this.f20697l = wVar2.w();
                this.f20698m = wVar2.w();
                this.f20698m = (((long) (wVar2.u() << 24)) | this.f20698m) * 1000;
                wVar2.G(3);
                this.f20694g = 4;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                boolean z10 = this.f20695h;
                c cVar = this.f20692e;
                if (z10) {
                    j = this.f20696i + this.f20698m;
                } else {
                    if (cVar.f20702i == -9223372036854775807L) {
                        j5 = 0;
                    } else {
                        j = this.f20698m;
                    }
                    i7 = this.k;
                    if (i7 == 8 || this.f20700o == null) {
                        if (i7 == 9 || this.f20701p == null) {
                            j7 = -9223372036854775807L;
                            i10 = 0;
                            if (i7 == 18 || this.f20699n) {
                                ((h) lVar).u(this.f20697l);
                                z5 = false;
                                i11 = 0;
                            } else {
                                w wVarA = a(lVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (wVarA.u() == 2 && "onMetaData".equals(c.B0(wVarA)) && wVarA.a() != 0 && wVarA.u() == 8) {
                                    HashMap mapA0 = c.A0(wVarA);
                                    Object obj = mapA0.get("duration");
                                    double d6 = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            cVar.f20702i = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapA0.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            cVar.f20703v = new long[size];
                                            cVar.f20704w = new long[size];
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj5 = list.get(i13);
                                                Object obj6 = list2.get(i13);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    cVar.f20703v = new long[0];
                                                    cVar.f20704w = new long[0];
                                                    break;
                                                }
                                                double d7 = d6;
                                                cVar.f20703v[i13] = (long) (((Double) obj6).doubleValue() * d7);
                                                cVar.f20704w[i13] = ((Double) obj5).longValue();
                                                i13++;
                                                d6 = d7;
                                            }
                                        }
                                    }
                                }
                                long j11 = cVar.f20702i;
                                if (j11 != -9223372036854775807L) {
                                    this.f20693f.c(new s(j11, cVar.f20704w, cVar.f20703v));
                                    this.f20699n = true;
                                }
                            }
                        } else {
                            if (!this.f20699n) {
                                this.f20693f.c(new o(-9223372036854775807L));
                                this.f20699n = true;
                            }
                            d dVar = this.f20701p;
                            w wVarA2 = a(lVar);
                            dVar.getClass();
                            int iU2 = wVarA2.u();
                            int i14 = (iU2 >> 4) & 15;
                            int i15 = iU2 & 15;
                            if (i15 != 7) {
                                throw new z0(kk.b.h(i15, "Video format not supported: "), 1);
                            }
                            dVar.E = i14;
                            if (i14 != 5) {
                                w wVar3 = dVar.f20705i;
                                x xVar = (x) dVar.f9357e;
                                w wVar4 = dVar.f20706v;
                                int iU3 = wVarA2.u();
                                byte[] bArr = wVarA2.f13860a;
                                j7 = -9223372036854775807L;
                                int i16 = wVarA2.f13861b;
                                int i17 = i16 + 1;
                                wVarA2.f13861b = i17;
                                int i18 = ((bArr[i16] & 255) << 24) >> 8;
                                i10 = 0;
                                int i19 = i16 + 2;
                                wVarA2.f13861b = i19;
                                int i20 = ((bArr[i17] & 255) << 8) | i18;
                                wVarA2.f13861b = i16 + 3;
                                long j12 = (((long) ((bArr[i19] & 255) | i20)) * 1000) + j5;
                                boolean z11 = false;
                                if (iU3 == 0 && !dVar.f20708x) {
                                    byte[] bArr2 = new byte[wVarA2.a()];
                                    w wVar5 = new w(bArr2);
                                    wVarA2.e(bArr2, 0, wVarA2.a());
                                    ke.a aVarA = ke.a.a(wVar5);
                                    dVar.f20707w = aVarA.f14317b;
                                    g0 g0Var = new g0();
                                    g0Var.k = "video/avc";
                                    g0Var.f9642h = aVarA.f14324i;
                                    g0Var.f9648p = aVarA.f14318c;
                                    g0Var.f9649q = aVarA.f14319d;
                                    g0Var.f9652t = aVarA.f14323h;
                                    g0Var.f9645m = aVarA.f14316a;
                                    xVar.e(new Format(g0Var));
                                    dVar.f20708x = true;
                                } else if (iU3 == 1 && dVar.f20708x) {
                                    int i21 = dVar.E == 1 ? 1 : 0;
                                    if (dVar.f20709y || i21 != 0) {
                                        byte[] bArr3 = wVar4.f13860a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i22 = 4 - dVar.f20707w;
                                        int i23 = 0;
                                        while (wVarA2.a() > 0) {
                                            wVarA2.e(wVar4.f13860a, i22, dVar.f20707w);
                                            wVar4.F(0);
                                            int iX = wVar4.x();
                                            wVar3.F(0);
                                            xVar.d(4, wVar3);
                                            xVar.d(iX, wVarA2);
                                            i23 = i23 + 4 + iX;
                                        }
                                        ((x) dVar.f9357e).c(j12, i21, i23, 0, null);
                                        dVar.f20709y = true;
                                        z11 = true;
                                    }
                                }
                                if (z11) {
                                    i11 = 1;
                                }
                                z5 = true;
                            } else {
                                j7 = -9223372036854775807L;
                                i10 = 0;
                            }
                        }
                        i11 = i10;
                        z5 = true;
                    } else {
                        if (!this.f20699n) {
                            this.f20693f.c(new o(-9223372036854775807L));
                            this.f20699n = true;
                        }
                        a aVar = this.f20700o;
                        w wVarA3 = a(lVar);
                        x xVar2 = (x) aVar.f9357e;
                        if (aVar.f20685i) {
                            wVarA3.G(1);
                        } else {
                            int iU4 = wVarA3.u();
                            int i24 = (iU4 >> 4) & 15;
                            aVar.f20687w = i24;
                            if (i24 == 2) {
                                int i25 = a.f20684x[(iU4 >> 2) & 3];
                                g0 g0Var2 = new g0();
                                g0Var2.k = "audio/mpeg";
                                g0Var2.f9656x = 1;
                                g0Var2.f9657y = i25;
                                xVar2.e(new Format(g0Var2));
                                aVar.f20686v = true;
                            } else if (i24 == 7 || i24 == 8) {
                                String str = i24 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                g0 g0Var3 = new g0();
                                g0Var3.k = str;
                                g0Var3.f9656x = 1;
                                g0Var3.f9657y = 8000;
                                xVar2.e(new Format(g0Var3));
                                aVar.f20686v = true;
                            } else if (i24 != 10) {
                                throw new z0("Audio format not supported: " + aVar.f20687w, 1);
                            }
                            aVar.f20685i = true;
                        }
                        x xVar3 = (x) aVar.f9357e;
                        i11 = 1;
                        if (aVar.f20687w == 2) {
                            int iA = wVarA3.a();
                            xVar3.d(iA, wVarA3);
                            ((x) aVar.f9357e).c(j5, 1, iA, 0, null);
                        } else {
                            int iU5 = wVarA3.u();
                            if (iU5 == 0 && !aVar.f20686v) {
                                int iA2 = wVarA3.a();
                                byte[] bArr4 = new byte[iA2];
                                wVarA3.e(bArr4, 0, iA2);
                                o0 o0VarI = ic.a.i(new v(bArr4, iA2), false);
                                g0 g0Var4 = new g0();
                                g0Var4.k = "audio/mp4a-latm";
                                g0Var4.f9642h = (String) o0VarI.f11594c;
                                g0Var4.f9656x = o0VarI.f11593b;
                                g0Var4.f9657y = o0VarI.f11592a;
                                g0Var4.f9645m = Collections.singletonList(bArr4);
                                xVar3.e(new Format(g0Var4));
                                aVar.f20686v = true;
                            } else if (aVar.f20687w != 10 || iU5 == 1) {
                                int iA3 = wVarA3.a();
                                xVar3.d(iA3, wVarA3);
                                ((x) aVar.f9357e).c(j5, 1, iA3, 0, null);
                            }
                            i11 = 0;
                        }
                        z5 = true;
                        j7 = -9223372036854775807L;
                        i10 = 0;
                    }
                    if (!this.f20695h && i11 != 0) {
                        this.f20695h = true;
                        if (cVar.f20702i == j7) {
                            j10 = -this.f20698m;
                        } else {
                            j10 = 0;
                        }
                        this.f20696i = j10;
                    }
                    this.j = 4;
                    this.f20694g = 2;
                    if (z5) {
                        return i10;
                    }
                }
                j5 = j;
                i7 = this.k;
                if (i7 == 8) {
                    if (i7 == 9) {
                        j7 = -9223372036854775807L;
                        i10 = 0;
                        if (i7 == 18) {
                        }
                        ((h) lVar).u(this.f20697l);
                        z5 = false;
                        i11 = 0;
                    } else {
                        j7 = -9223372036854775807L;
                        i10 = 0;
                        if (i7 == 18) {
                        }
                        ((h) lVar).u(this.f20697l);
                        z5 = false;
                        i11 = 0;
                    }
                } else if (i7 == 9) {
                    j7 = -9223372036854775807L;
                    i10 = 0;
                    if (i7 == 18) {
                    }
                    ((h) lVar).u(this.f20697l);
                    z5 = false;
                    i11 = 0;
                } else {
                    j7 = -9223372036854775807L;
                    i10 = 0;
                    if (i7 == 18) {
                    }
                    ((h) lVar).u(this.f20697l);
                    z5 = false;
                    i11 = 0;
                }
                if (!this.f20695h) {
                    this.f20695h = true;
                    if (cVar.f20702i == j7) {
                        j10 = -this.f20698m;
                    } else {
                        j10 = 0;
                    }
                    this.f20696i = j10;
                }
                this.j = 4;
                this.f20694g = 2;
                if (z5) {
                    return i10;
                }
            }
        }
    }

    @Override // pc.k
    public final void e(m mVar) {
        this.f20693f = mVar;
    }

    @Override // pc.k
    public final boolean f(l lVar) throws EOFException, InterruptedIOException {
        w wVar = this.f20688a;
        h hVar = (h) lVar;
        hVar.g(wVar.f13860a, 0, 3, false);
        wVar.F(0);
        if (wVar.w() == 4607062) {
            hVar.g(wVar.f13860a, 0, 2, false);
            wVar.F(0);
            if ((wVar.z() & h0.DEFAULT_SWIPE_ANIMATION_DURATION) == 0) {
                hVar.g(wVar.f13860a, 0, 4, false);
                wVar.F(0);
                int iG = wVar.g();
                hVar.f17897x = 0;
                hVar.b(iG, false);
                hVar.g(wVar.f13860a, 0, 4, false);
                wVar.F(0);
                if (wVar.g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        if (j == 0) {
            this.f20694g = 1;
            this.f20695h = false;
        } else {
            this.f20694g = 3;
        }
        this.j = 0;
    }

    @Override // pc.k
    public final void release() {
    }
}
