package pp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends vp.j {
    public s0 E;
    public int F;
    public s0 G;
    public int H;
    public List I;
    public List J;
    public List K;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f18448y;

    public static t0 h() {
        t0 t0Var = new t0();
        t0Var.f18446w = 6;
        List list = Collections.EMPTY_LIST;
        t0Var.f18448y = list;
        s0 s0Var = s0.Q;
        t0Var.E = s0Var;
        t0Var.G = s0Var;
        t0Var.I = list;
        t0Var.J = list;
        t0Var.K = list;
        return t0Var;
    }

    @Override // vp.i
    public final vp.a c() {
        u0 u0VarG = g();
        if (u0VarG.b()) {
            return u0VarG;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        t0 t0VarH = h();
        t0VarH.j(g());
        return t0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        u0 u0Var = null;
        try {
            try {
                u0.N.getClass();
                j(new u0(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                u0 u0Var2 = (u0) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    u0Var = u0Var2;
                    if (u0Var != null) {
                        j(u0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (u0Var != null) {
                j(u0Var);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        j((u0) nVar);
        return this;
    }

    public final u0 g() {
        u0 u0Var = new u0(this);
        int i7 = this.f18445v;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        u0Var.f18453v = this.f18446w;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        u0Var.f18454w = this.f18447x;
        if ((i7 & 4) == 4) {
            this.f18448y = Collections.unmodifiableList(this.f18448y);
            this.f18445v &= -5;
        }
        u0Var.f18455x = this.f18448y;
        if ((i7 & 8) == 8) {
            i10 |= 4;
        }
        u0Var.f18456y = this.E;
        if ((i7 & 16) == 16) {
            i10 |= 8;
        }
        u0Var.E = this.F;
        if ((i7 & 32) == 32) {
            i10 |= 16;
        }
        u0Var.F = this.G;
        if ((i7 & 64) == 64) {
            i10 |= 32;
        }
        u0Var.G = this.H;
        if ((this.f18445v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            this.I = Collections.unmodifiableList(this.I);
            this.f18445v &= -129;
        }
        u0Var.H = this.I;
        if ((this.f18445v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            this.J = Collections.unmodifiableList(this.J);
            this.f18445v &= -257;
        }
        u0Var.I = this.J;
        if ((this.f18445v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            this.K = Collections.unmodifiableList(this.K);
            this.f18445v &= -513;
        }
        u0Var.J = this.K;
        u0Var.f18452i = i10;
        return u0Var;
    }

    public final void j(u0 u0Var) {
        s0 s0Var;
        s0 s0Var2;
        if (u0Var == u0.M) {
            return;
        }
        int i7 = u0Var.f18452i;
        if ((i7 & 1) == 1) {
            int i10 = u0Var.f18453v;
            this.f18445v = 1 | this.f18445v;
            this.f18446w = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = u0Var.f18454w;
            this.f18445v = 2 | this.f18445v;
            this.f18447x = i11;
        }
        if (!u0Var.f18455x.isEmpty()) {
            if (this.f18448y.isEmpty()) {
                this.f18448y = u0Var.f18455x;
                this.f18445v &= -5;
            } else {
                if ((this.f18445v & 4) != 4) {
                    this.f18448y = new ArrayList(this.f18448y);
                    this.f18445v |= 4;
                }
                this.f18448y.addAll(u0Var.f18455x);
            }
        }
        if ((u0Var.f18452i & 4) == 4) {
            s0 s0Var3 = u0Var.f18456y;
            if ((this.f18445v & 8) != 8 || (s0Var2 = this.E) == s0.Q) {
                this.E = s0Var3;
            } else {
                r0 r0VarQ = s0.q(s0Var2);
                r0VarQ.j(s0Var3);
                this.E = r0VarQ.g();
            }
            this.f18445v |= 8;
        }
        int i12 = u0Var.f18452i;
        if ((i12 & 8) == 8) {
            int i13 = u0Var.E;
            this.f18445v |= 16;
            this.F = i13;
        }
        if ((i12 & 16) == 16) {
            s0 s0Var4 = u0Var.F;
            if ((this.f18445v & 32) != 32 || (s0Var = this.G) == s0.Q) {
                this.G = s0Var4;
            } else {
                r0 r0VarQ2 = s0.q(s0Var);
                r0VarQ2.j(s0Var4);
                this.G = r0VarQ2.g();
            }
            this.f18445v |= 32;
        }
        if ((u0Var.f18452i & 32) == 32) {
            int i14 = u0Var.G;
            this.f18445v |= 64;
            this.H = i14;
        }
        if (!u0Var.H.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = u0Var.H;
                this.f18445v &= -129;
            } else {
                if ((this.f18445v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128) {
                    this.I = new ArrayList(this.I);
                    this.f18445v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                }
                this.I.addAll(u0Var.H);
            }
        }
        if (!u0Var.I.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = u0Var.I;
                this.f18445v &= -257;
            } else {
                if ((this.f18445v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                    this.J = new ArrayList(this.J);
                    this.f18445v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                }
                this.J.addAll(u0Var.I);
            }
        }
        if (!u0Var.J.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = u0Var.J;
                this.f18445v &= -513;
            } else {
                if ((this.f18445v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                    this.K = new ArrayList(this.K);
                    this.f18445v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                }
                this.K.addAll(u0Var.J);
            }
        }
        f(u0Var);
        this.f21889d = this.f21889d.b(u0Var.f18451e);
    }
}
