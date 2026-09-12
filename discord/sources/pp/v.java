package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends vp.k {
    public static final a E = new a(8);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final v f18457y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp.d f18458e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18459i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18460v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f18461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18462x;

    static {
        v vVar = new v();
        f18457y = vVar;
        vVar.f18460v = 0;
    }

    public v(u uVar) {
        super(uVar);
        this.f18461w = (byte) -1;
        this.f18462x = -1;
        this.f18458e = uVar.f21889d;
    }

    @Override // vp.u
    public final vp.a a() {
        return f18457y;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.f18461w;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (i()) {
            this.f18461w = (byte) 1;
            return true;
        }
        this.f18461w = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f18462x;
        if (i7 != -1) {
            return i7;
        }
        int size = this.f18458e.size() + j() + ((this.f18459i & 1) == 1 ? v1.d(1, this.f18460v) : 0);
        this.f18462x = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return new u();
    }

    @Override // vp.a
    public final vp.i e() {
        u uVar = new u();
        uVar.g(this);
        return uVar;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        e4.c cVar = new e4.c(this);
        if ((this.f18459i & 1) == 1) {
            v1Var.r(1, this.f18460v);
        }
        cVar.W(androidx.recyclerview.widget.h0.DEFAULT_DRAG_ANIMATION_DURATION, v1Var);
        v1Var.w(this.f18458e);
    }

    public v() {
        this.f18461w = (byte) -1;
        this.f18462x = -1;
        this.f18458e = vp.d.f21871d;
    }

    public v(vp.e eVar, vp.g gVar) {
        this.f18461w = (byte) -1;
        this.f18462x = -1;
        boolean z5 = false;
        this.f18460v = 0;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN != 8) {
                            if (!n(eVar, v1VarM, gVar, iN)) {
                            }
                        } else {
                            this.f18459i |= 1;
                            this.f18460v = eVar.k();
                        }
                    }
                    z5 = true;
                } catch (vp.q e10) {
                    e10.f21916d = this;
                    throw e10;
                } catch (IOException e11) {
                    vp.q qVar = new vp.q(e11.getMessage());
                    qVar.f21916d = this;
                    throw qVar;
                }
            } catch (Throwable th2) {
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18458e = cVar.g();
                }
                m();
                throw th2;
            }
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18458e = cVar.g();
        }
        m();
    }
}
