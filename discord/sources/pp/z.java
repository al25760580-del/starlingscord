package pp;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends vp.j {
    public s0 E;
    public int F;
    public List G;
    public s0 H;
    public int I;
    public List J;
    public List K;
    public List L;
    public y0 M;
    public List N;
    public p O;
    public List P;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18503v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18506y;

    public static z h() {
        z zVar = new z();
        zVar.f18504w = 6;
        zVar.f18505x = 6;
        s0 s0Var = s0.Q;
        zVar.E = s0Var;
        List list = Collections.EMPTY_LIST;
        zVar.G = list;
        zVar.H = s0Var;
        zVar.J = list;
        zVar.K = list;
        zVar.L = list;
        zVar.M = y0.f18496y;
        zVar.N = list;
        zVar.O = p.f18394w;
        zVar.P = list;
        return zVar;
    }

    @Override // vp.i
    public final vp.a c() {
        a0 a0VarG = g();
        if (a0VarG.b()) {
            return a0VarG;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        z zVarH = h();
        zVarH.j(g());
        return zVarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        a0 a0Var = null;
        try {
            try {
                a0.T.getClass();
                j(new a0(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                a0 a0Var2 = (a0) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    a0Var = a0Var2;
                    if (a0Var != null) {
                        j(a0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (a0Var != null) {
                j(a0Var);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        j((a0) nVar);
        return this;
    }

    public final a0 g() {
        a0 a0Var = new a0(this);
        int i7 = this.f18503v;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        a0Var.f18201v = this.f18504w;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        a0Var.f18202w = this.f18505x;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        a0Var.f18203x = this.f18506y;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        a0Var.f18204y = this.E;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        a0Var.E = this.F;
        if ((i7 & 32) == 32) {
            this.G = Collections.unmodifiableList(this.G);
            this.f18503v &= -33;
        }
        a0Var.F = this.G;
        if ((i7 & 64) == 64) {
            i10 |= 32;
        }
        a0Var.G = this.H;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i10 |= 64;
        }
        a0Var.H = this.I;
        if ((this.f18503v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            this.J = Collections.unmodifiableList(this.J);
            this.f18503v &= -257;
        }
        a0Var.I = this.J;
        if ((this.f18503v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            this.K = Collections.unmodifiableList(this.K);
            this.f18503v &= -513;
        }
        a0Var.J = this.K;
        if ((this.f18503v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            this.L = Collections.unmodifiableList(this.L);
            this.f18503v &= -1025;
        }
        a0Var.L = this.L;
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        a0Var.M = this.M;
        if ((this.f18503v & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            this.N = Collections.unmodifiableList(this.N);
            this.f18503v &= -4097;
        }
        a0Var.N = this.N;
        if ((i7 & 8192) == 8192) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        a0Var.O = this.O;
        if ((this.f18503v & 16384) == 16384) {
            this.P = Collections.unmodifiableList(this.P);
            this.f18503v &= -16385;
        }
        a0Var.P = this.P;
        a0Var.f18200i = i10;
        return a0Var;
    }

    public final void j(a0 a0Var) {
        p pVar;
        y0 y0Var;
        s0 s0Var;
        s0 s0Var2;
        if (a0Var == a0.S) {
            return;
        }
        int i7 = a0Var.f18200i;
        if ((i7 & 1) == 1) {
            int i10 = a0Var.f18201v;
            this.f18503v = 1 | this.f18503v;
            this.f18504w = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = a0Var.f18202w;
            this.f18503v = 2 | this.f18503v;
            this.f18505x = i11;
        }
        if ((i7 & 4) == 4) {
            int i12 = a0Var.f18203x;
            this.f18503v = 4 | this.f18503v;
            this.f18506y = i12;
        }
        if ((i7 & 8) == 8) {
            s0 s0Var3 = a0Var.f18204y;
            if ((this.f18503v & 8) != 8 || (s0Var2 = this.E) == s0.Q) {
                this.E = s0Var3;
            } else {
                r0 r0VarQ = s0.q(s0Var2);
                r0VarQ.j(s0Var3);
                this.E = r0VarQ.g();
            }
            this.f18503v |= 8;
        }
        if ((a0Var.f18200i & 16) == 16) {
            int i13 = a0Var.E;
            this.f18503v = 16 | this.f18503v;
            this.F = i13;
        }
        if (!a0Var.F.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = a0Var.F;
                this.f18503v &= -33;
            } else {
                if ((this.f18503v & 32) != 32) {
                    this.G = new ArrayList(this.G);
                    this.f18503v |= 32;
                }
                this.G.addAll(a0Var.F);
            }
        }
        if ((a0Var.f18200i & 32) == 32) {
            s0 s0Var4 = a0Var.G;
            if ((this.f18503v & 64) != 64 || (s0Var = this.H) == s0.Q) {
                this.H = s0Var4;
            } else {
                r0 r0VarQ2 = s0.q(s0Var);
                r0VarQ2.j(s0Var4);
                this.H = r0VarQ2.g();
            }
            this.f18503v |= 64;
        }
        if ((a0Var.f18200i & 64) == 64) {
            int i14 = a0Var.H;
            this.f18503v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            this.I = i14;
        }
        if (!a0Var.I.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = a0Var.I;
                this.f18503v &= -257;
            } else {
                if ((this.f18503v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                    this.J = new ArrayList(this.J);
                    this.f18503v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                }
                this.J.addAll(a0Var.I);
            }
        }
        if (!a0Var.J.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = a0Var.J;
                this.f18503v &= -513;
            } else {
                if ((this.f18503v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                    this.K = new ArrayList(this.K);
                    this.f18503v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                }
                this.K.addAll(a0Var.J);
            }
        }
        if (!a0Var.L.isEmpty()) {
            if (this.L.isEmpty()) {
                this.L = a0Var.L;
                this.f18503v &= -1025;
            } else {
                if ((this.f18503v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024) {
                    this.L = new ArrayList(this.L);
                    this.f18503v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                }
                this.L.addAll(a0Var.L);
            }
        }
        if ((a0Var.f18200i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            y0 y0Var2 = a0Var.M;
            if ((this.f18503v & RecyclerView.ItemAnimator.FLAG_MOVED) != 2048 || (y0Var = this.M) == y0.f18496y) {
                this.M = y0Var2;
            } else {
                g gVarI = y0.i(y0Var);
                gVarI.k(y0Var2);
                this.M = gVarI.g();
            }
            this.f18503v |= RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if (!a0Var.N.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = a0Var.N;
                this.f18503v &= -4097;
            } else {
                if ((this.f18503v & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                    this.N = new ArrayList(this.N);
                    this.f18503v |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
                this.N.addAll(a0Var.N);
            }
        }
        if ((a0Var.f18200i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            p pVar2 = a0Var.O;
            if ((this.f18503v & 8192) != 8192 || (pVar = this.O) == p.f18394w) {
                this.O = pVar2;
            } else {
                o oVar = new o(0);
                oVar.f18389v = Collections.EMPTY_LIST;
                oVar.k(pVar);
                oVar.k(pVar2);
                this.O = oVar.f();
            }
            this.f18503v |= 8192;
        }
        if (!a0Var.P.isEmpty()) {
            if (this.P.isEmpty()) {
                this.P = a0Var.P;
                this.f18503v &= -16385;
            } else {
                if ((this.f18503v & 16384) != 16384) {
                    this.P = new ArrayList(this.P);
                    this.f18503v |= 16384;
                }
                this.P.addAll(a0Var.P);
            }
        }
        f(a0Var);
        this.f21889d = this.f21889d.b(a0Var.f18199e);
    }
}
