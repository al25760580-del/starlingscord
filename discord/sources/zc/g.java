package zc;

import com.google.android.exoplayer2.Format;
import gc.g0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f23727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f23728g;

    public g(List list) {
        this.f23722a = 0;
        this.f23727f = list;
        this.f23728g = new pc.x[list.size()];
        this.f23724c = -9223372036854775807L;
    }

    @Override // zc.h
    public final void a() {
        switch (this.f23722a) {
            case 0:
                this.f23723b = false;
                this.f23724c = -9223372036854775807L;
                break;
            default:
                this.f23723b = false;
                this.f23724c = -9223372036854775807L;
                break;
        }
    }

    @Override // zc.h
    public final void c(je.w wVar) {
        boolean z5;
        boolean z6;
        switch (this.f23722a) {
            case 0:
                if (this.f23723b) {
                    if (this.f23725d == 2) {
                        if (wVar.a() == 0) {
                            z6 = false;
                        } else {
                            if (wVar.u() != 32) {
                                this.f23723b = false;
                            }
                            this.f23725d--;
                            z6 = this.f23723b;
                        }
                        if (!z6) {
                        }
                    }
                    if (this.f23725d == 1) {
                        if (wVar.a() == 0) {
                            z5 = false;
                        } else {
                            if (wVar.u() != 0) {
                                this.f23723b = false;
                            }
                            this.f23725d--;
                            z5 = this.f23723b;
                        }
                        if (!z5) {
                        }
                    }
                    int i7 = wVar.f13861b;
                    int iA = wVar.a();
                    for (pc.x xVar : (pc.x[]) this.f23728g) {
                        wVar.F(i7);
                        xVar.d(iA, wVar);
                    }
                    this.f23726e += iA;
                }
                break;
            default:
                je.w wVar2 = (je.w) this.f23727f;
                je.b.l((pc.x) this.f23728g);
                if (this.f23723b) {
                    int iA2 = wVar.a();
                    int i10 = this.f23726e;
                    if (i10 < 10) {
                        int iMin = Math.min(iA2, 10 - i10);
                        System.arraycopy(wVar.f13860a, wVar.f13861b, wVar2.f13860a, this.f23726e, iMin);
                        if (this.f23726e + iMin == 10) {
                            wVar2.F(0);
                            if (73 == wVar2.u() && 68 == wVar2.u() && 51 == wVar2.u()) {
                                wVar2.G(3);
                                this.f23725d = wVar2.t() + 10;
                            } else {
                                je.b.N("Id3Reader", "Discarding invalid ID3 tag");
                                this.f23723b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f23725d - this.f23726e);
                    ((pc.x) this.f23728g).d(iMin2, wVar);
                    this.f23726e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // zc.h
    public final void d() {
        int i7;
        switch (this.f23722a) {
            case 0:
                if (this.f23723b) {
                    if (this.f23724c != -9223372036854775807L) {
                        for (pc.x xVar : (pc.x[]) this.f23728g) {
                            xVar.c(this.f23724c, 1, this.f23726e, 0, null);
                        }
                    }
                    this.f23723b = false;
                }
                break;
            default:
                je.b.l((pc.x) this.f23728g);
                if (this.f23723b && (i7 = this.f23725d) != 0 && this.f23726e == i7) {
                    long j = this.f23724c;
                    if (j != -9223372036854775807L) {
                        ((pc.x) this.f23728g).c(j, 1, i7, 0, null);
                    }
                    this.f23723b = false;
                    break;
                }
                break;
        }
    }

    @Override // zc.h
    public final void e(pc.m mVar, d0 d0Var) {
        switch (this.f23722a) {
            case 0:
                pc.x[] xVarArr = (pc.x[]) this.f23728g;
                for (int i7 = 0; i7 < xVarArr.length; i7++) {
                    c0 c0Var = (c0) ((List) this.f23727f).get(i7);
                    d0Var.a();
                    d0Var.b();
                    pc.x xVarX = mVar.x(d0Var.f23691d, 3);
                    g0 g0Var = new g0();
                    d0Var.b();
                    g0Var.f9635a = d0Var.f23692e;
                    g0Var.k = "application/dvbsubs";
                    g0Var.f9645m = Collections.singletonList(c0Var.f23678b);
                    g0Var.f9637c = c0Var.f23677a;
                    xVarX.e(new Format(g0Var));
                    xVarArr[i7] = xVarX;
                }
                break;
            default:
                d0Var.a();
                d0Var.b();
                pc.x xVarX2 = mVar.x(d0Var.f23691d, 5);
                this.f23728g = xVarX2;
                g0 g0Var2 = new g0();
                d0Var.b();
                g0Var2.f9635a = d0Var.f23692e;
                g0Var2.k = "application/id3";
                xVarX2.e(new Format(g0Var2));
                break;
        }
    }

    @Override // zc.h
    public final void f(int i7, long j) {
        switch (this.f23722a) {
            case 0:
                if ((i7 & 4) != 0) {
                    this.f23723b = true;
                    if (j != -9223372036854775807L) {
                        this.f23724c = j;
                    }
                    this.f23726e = 0;
                    this.f23725d = 2;
                    break;
                }
                break;
            default:
                if ((i7 & 4) != 0) {
                    this.f23723b = true;
                    if (j != -9223372036854775807L) {
                        this.f23724c = j;
                    }
                    this.f23725d = 0;
                    this.f23726e = 0;
                    break;
                }
                break;
        }
    }

    public g() {
        this.f23722a = 1;
        this.f23727f = new je.w(10);
        this.f23724c = -9223372036854775807L;
    }
}
