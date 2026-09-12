package zc;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import gc.g0;
import ic.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je.w f23858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f23859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pc.x f23861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23863f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23866i;
    public long j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f23867l;

    public t(String str) {
        je.w wVar = new je.w(4);
        this.f23858a = wVar;
        wVar.f13860a[0] = -1;
        this.f23859b = new n0();
        this.f23867l = -9223372036854775807L;
        this.f23860c = str;
    }

    @Override // zc.h
    public final void a() {
        this.f23863f = 0;
        this.f23864g = 0;
        this.f23866i = false;
        this.f23867l = -9223372036854775807L;
    }

    @Override // zc.h
    public final void c(je.w wVar) {
        je.b.l(this.f23861d);
        while (wVar.a() > 0) {
            int i7 = this.f23863f;
            je.w wVar2 = this.f23858a;
            if (i7 == 0) {
                byte[] bArr = wVar.f13860a;
                int i10 = wVar.f13861b;
                int i11 = wVar.f13862c;
                while (true) {
                    if (i10 >= i11) {
                        wVar.F(i11);
                        break;
                    }
                    byte b10 = bArr[i10];
                    boolean z5 = (b10 & 255) == 255;
                    boolean z6 = this.f23866i && (b10 & 224) == 224;
                    this.f23866i = z5;
                    if (z6) {
                        wVar.F(i10 + 1);
                        this.f23866i = false;
                        wVar2.f13860a[1] = bArr[i10];
                        this.f23864g = 2;
                        this.f23863f = 1;
                        break;
                    }
                    i10++;
                }
            } else if (i7 == 1) {
                int iMin = Math.min(wVar.a(), 4 - this.f23864g);
                wVar.e(wVar2.f13860a, this.f23864g, iMin);
                int i12 = this.f23864g + iMin;
                this.f23864g = i12;
                if (i12 >= 4) {
                    wVar2.F(0);
                    int iG = wVar2.g();
                    n0 n0Var = this.f23859b;
                    if (n0Var.d(iG)) {
                        this.k = n0Var.f11579b;
                        if (!this.f23865h) {
                            long j = ((long) n0Var.f11583f) * 1000000;
                            int i13 = n0Var.f11580c;
                            this.j = j / ((long) i13);
                            g0 g0Var = new g0();
                            g0Var.f9635a = this.f23862e;
                            g0Var.k = (String) n0Var.f11584g;
                            g0Var.f9644l = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                            g0Var.f9656x = n0Var.f11581d;
                            g0Var.f9657y = i13;
                            g0Var.f9637c = this.f23860c;
                            this.f23861d.e(new Format(g0Var));
                            this.f23865h = true;
                        }
                        wVar2.F(0);
                        this.f23861d.d(4, wVar2);
                        this.f23863f = 2;
                    } else {
                        this.f23864g = 0;
                        this.f23863f = 1;
                    }
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(wVar.a(), this.k - this.f23864g);
                this.f23861d.d(iMin2, wVar);
                int i14 = this.f23864g + iMin2;
                this.f23864g = i14;
                int i15 = this.k;
                if (i14 >= i15) {
                    long j5 = this.f23867l;
                    if (j5 != -9223372036854775807L) {
                        this.f23861d.c(j5, 1, i15, 0, null);
                        this.f23867l += this.j;
                    }
                    this.f23864g = 0;
                    this.f23863f = 0;
                }
            }
        }
    }

    @Override // zc.h
    public final void e(pc.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f23862e = d0Var.f23692e;
        d0Var.b();
        this.f23861d = mVar.x(d0Var.f23691d, 1);
    }

    @Override // zc.h
    public final void f(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f23867l = j;
        }
    }

    @Override // zc.h
    public final void d() {
    }
}
