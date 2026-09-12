package zc;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f23641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.w f23642b = new je.w(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23646f;

    public a0(z zVar) {
        this.f23641a = zVar;
    }

    @Override // zc.e0
    public final void a() {
        this.f23646f = true;
    }

    @Override // zc.e0
    public final void b(je.b0 b0Var, pc.m mVar, d0 d0Var) {
        this.f23641a.b(b0Var, mVar, d0Var);
        this.f23646f = true;
    }

    @Override // zc.e0
    public final void c(int i7, je.w wVar) {
        int iU;
        boolean z5 = (i7 & 1) != 0;
        if (z5) {
            iU = wVar.f13861b + wVar.u();
        } else {
            iU = -1;
        }
        if (this.f23646f) {
            if (!z5) {
                return;
            }
            this.f23646f = false;
            wVar.F(iU);
            this.f23644d = 0;
        }
        while (wVar.a() > 0) {
            int i10 = this.f23644d;
            je.w wVar2 = this.f23642b;
            if (i10 < 3) {
                if (i10 == 0) {
                    int iU2 = wVar.u();
                    wVar.F(wVar.f13861b - 1);
                    if (iU2 == 255) {
                        this.f23646f = true;
                        return;
                    }
                }
                int iMin = Math.min(wVar.a(), 3 - this.f23644d);
                wVar.e(wVar2.f13860a, this.f23644d, iMin);
                int i11 = this.f23644d + iMin;
                this.f23644d = i11;
                if (i11 == 3) {
                    wVar2.F(0);
                    wVar2.E(3);
                    wVar2.G(1);
                    int iU3 = wVar2.u();
                    int iU4 = wVar2.u();
                    this.f23645e = (iU3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
                    int i12 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.f23643c = i12;
                    byte[] bArr = wVar2.f13860a;
                    if (bArr.length < i12) {
                        wVar2.b(Math.min(4098, Math.max(i12, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(wVar.a(), this.f23643c - this.f23644d);
                wVar.e(wVar2.f13860a, this.f23644d, iMin2);
                int i13 = this.f23644d + iMin2;
                this.f23644d = i13;
                int i14 = this.f23643c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.f23645e) {
                        wVar2.E(i14);
                    } else {
                        if (je.e0.l(0, i14, -1, wVar2.f13860a) != 0) {
                            this.f23646f = true;
                            return;
                        }
                        wVar2.E(this.f23643c - 4);
                    }
                    wVar2.F(0);
                    this.f23641a.c(wVar2);
                    this.f23644d = 0;
                }
            }
        }
    }
}
