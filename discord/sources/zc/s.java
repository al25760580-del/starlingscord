package zc;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import gc.g0;
import gc.h1;
import ic.o0;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.w f23840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je.v f23841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pc.x f23842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Format f23844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23847i;
    public int j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f23853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f23855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23856t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f23857u;

    public s(String str) {
        this.f23839a = str;
        je.w wVar = new je.w(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        this.f23840b = wVar;
        byte[] bArr = wVar.f13860a;
        this.f23841c = new je.v(bArr, bArr.length);
        this.k = -9223372036854775807L;
    }

    @Override // zc.h
    public final void a() {
        this.f23845g = 0;
        this.k = -9223372036854775807L;
        this.f23848l = false;
    }

    @Override // zc.h
    public final void c(je.w wVar) throws h1 {
        int i7;
        boolean zH;
        je.b.l(this.f23842d);
        while (wVar.a() > 0) {
            int i10 = this.f23845g;
            if (i10 != 0) {
                if (i10 != 1) {
                    je.w wVar2 = this.f23840b;
                    je.v vVar = this.f23841c;
                    if (i10 == 2) {
                        int iU = ((this.j & (-225)) << 8) | wVar.u();
                        this.f23847i = iU;
                        if (iU > wVar2.f13860a.length) {
                            wVar2.C(iU);
                            byte[] bArr = wVar2.f13860a;
                            vVar.getClass();
                            vVar.o(bArr, bArr.length);
                        }
                        this.f23846h = 0;
                        this.f23845g = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(wVar.a(), this.f23847i - this.f23846h);
                        wVar.e(vVar.f13853b, this.f23846h, iMin);
                        int i11 = this.f23846h + iMin;
                        this.f23846h = i11;
                        if (i11 == this.f23847i) {
                            vVar.p(0);
                            if (vVar.h()) {
                                if (this.f23848l) {
                                }
                                this.f23845g = 0;
                            } else {
                                this.f23848l = true;
                                int i12 = vVar.i(1);
                                int i13 = i12 == 1 ? vVar.i(1) : 0;
                                this.f23849m = i13;
                                if (i13 != 0) {
                                    throw h1.a(null, null);
                                }
                                if (i12 == 1) {
                                    vVar.i((vVar.i(2) + 1) * 8);
                                }
                                if (!vVar.h()) {
                                    throw h1.a(null, null);
                                }
                                this.f23850n = vVar.i(6);
                                int i14 = vVar.i(4);
                                int i15 = vVar.i(3);
                                if (i14 != 0 || i15 != 0) {
                                    throw h1.a(null, null);
                                }
                                if (i12 == 0) {
                                    int iG = vVar.g();
                                    int iB = vVar.b();
                                    o0 o0VarI = ic.a.i(vVar, true);
                                    this.f23857u = (String) o0VarI.f11594c;
                                    this.f23854r = o0VarI.f11592a;
                                    this.f23856t = o0VarI.f11593b;
                                    int iB2 = iB - vVar.b();
                                    vVar.p(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    vVar.j(bArr2, iB2);
                                    g0 g0Var = new g0();
                                    g0Var.f9635a = this.f23843e;
                                    g0Var.k = "audio/mp4a-latm";
                                    g0Var.f9642h = this.f23857u;
                                    g0Var.f9656x = this.f23856t;
                                    g0Var.f9657y = this.f23854r;
                                    g0Var.f9645m = Collections.singletonList(bArr2);
                                    g0Var.f9637c = this.f23839a;
                                    Format format = new Format(g0Var);
                                    if (!format.equals(this.f23844f)) {
                                        this.f23844f = format;
                                        this.f23855s = 1024000000 / ((long) format.W);
                                        this.f23842d.e(format);
                                    }
                                } else {
                                    int i16 = vVar.i((vVar.i(2) + 1) * 8);
                                    int iB3 = vVar.b();
                                    o0 o0VarI2 = ic.a.i(vVar, true);
                                    this.f23857u = (String) o0VarI2.f11594c;
                                    this.f23854r = o0VarI2.f11592a;
                                    this.f23856t = o0VarI2.f11593b;
                                    vVar.s(i16 - (iB3 - vVar.b()));
                                }
                                int i17 = vVar.i(3);
                                this.f23851o = i17;
                                if (i17 == 0) {
                                    vVar.s(8);
                                } else if (i17 == 1) {
                                    vVar.s(9);
                                } else if (i17 == 3 || i17 == 4 || i17 == 5) {
                                    vVar.s(6);
                                } else {
                                    if (i17 != 6 && i17 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    vVar.s(1);
                                }
                                boolean zH2 = vVar.h();
                                this.f23852p = zH2;
                                this.f23853q = 0L;
                                if (zH2) {
                                    if (i12 == 1) {
                                        this.f23853q = vVar.i((vVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = vVar.h();
                                            this.f23853q = (this.f23853q << 8) + ((long) vVar.i(8));
                                        } while (zH);
                                    }
                                }
                                if (vVar.h()) {
                                    vVar.s(8);
                                }
                            }
                            if (this.f23849m != 0) {
                                throw h1.a(null, null);
                            }
                            if (this.f23850n != 0) {
                                throw h1.a(null, null);
                            }
                            if (this.f23851o != 0) {
                                throw h1.a(null, null);
                            }
                            int i18 = 0;
                            do {
                                i7 = vVar.i(8);
                                i18 += i7;
                            } while (i7 == 255);
                            int iG2 = vVar.g();
                            if ((iG2 & 7) == 0) {
                                wVar2.F(iG2 >> 3);
                            } else {
                                vVar.j(wVar2.f13860a, i18 * 8);
                                wVar2.F(0);
                            }
                            this.f23842d.d(i18, wVar2);
                            long j = this.k;
                            if (j != -9223372036854775807L) {
                                this.f23842d.c(j, 1, i18, 0, null);
                                this.k += this.f23855s;
                            }
                            if (this.f23852p) {
                                vVar.s((int) this.f23853q);
                            }
                            this.f23845g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = wVar.u();
                    if ((iU2 & 224) == 224) {
                        this.j = iU2;
                        this.f23845g = 2;
                    } else if (iU2 != 86) {
                        this.f23845g = 0;
                    }
                }
            } else if (wVar.u() == 86) {
                this.f23845g = 1;
            }
        }
    }

    @Override // zc.h
    public final void e(pc.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f23842d = mVar.x(d0Var.f23691d, 1);
        d0Var.b();
        this.f23843e = d0Var.f23692e;
    }

    @Override // zc.h
    public final void f(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // zc.h
    public final void d() {
    }
}
