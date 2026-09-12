package pp;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends vp.j {
    public s0 E;
    public int F;
    public List G;
    public s0 H;
    public int I;
    public List J;
    public List K;
    public a1 L;
    public int M;
    public int N;
    public List O;
    public List P;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18308v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18309w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18310x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18311y;

    public static h0 h() {
        h0 h0Var = new h0();
        h0Var.f18309w = 518;
        h0Var.f18310x = 2054;
        s0 s0Var = s0.Q;
        h0Var.E = s0Var;
        List list = Collections.EMPTY_LIST;
        h0Var.G = list;
        h0Var.H = s0Var;
        h0Var.J = list;
        h0Var.K = list;
        h0Var.L = a1.I;
        h0Var.O = list;
        h0Var.P = list;
        return h0Var;
    }

    @Override // vp.i
    public final vp.a c() {
        i0 i0VarG = g();
        if (i0VarG.b()) {
            return i0VarG;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        h0 h0VarH = h();
        h0VarH.j(g());
        return h0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        i0 i0Var = null;
        try {
            try {
                i0.T.getClass();
                j(new i0(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                i0 i0Var2 = (i0) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    i0Var = i0Var2;
                    if (i0Var != null) {
                        j(i0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (i0Var != null) {
                j(i0Var);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        j((i0) nVar);
        return this;
    }

    public final i0 g() {
        i0 i0Var = new i0(this);
        int i7 = this.f18308v;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        i0Var.f18318v = this.f18309w;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        i0Var.f18319w = this.f18310x;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        i0Var.f18320x = this.f18311y;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        i0Var.f18321y = this.E;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        i0Var.E = this.F;
        if ((i7 & 32) == 32) {
            this.G = Collections.unmodifiableList(this.G);
            this.f18308v &= -33;
        }
        i0Var.F = this.G;
        if ((i7 & 64) == 64) {
            i10 |= 32;
        }
        i0Var.G = this.H;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i10 |= 64;
        }
        i0Var.H = this.I;
        if ((this.f18308v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            this.J = Collections.unmodifiableList(this.J);
            this.f18308v &= -257;
        }
        i0Var.I = this.J;
        if ((this.f18308v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            this.K = Collections.unmodifiableList(this.K);
            this.f18308v &= -513;
        }
        i0Var.J = this.K;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        i0Var.L = this.L;
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        i0Var.M = this.M;
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
        i0Var.N = this.N;
        if ((this.f18308v & 8192) == 8192) {
            this.O = Collections.unmodifiableList(this.O);
            this.f18308v &= -8193;
        }
        i0Var.O = this.O;
        if ((this.f18308v & 16384) == 16384) {
            this.P = Collections.unmodifiableList(this.P);
            this.f18308v &= -16385;
        }
        i0Var.P = this.P;
        i0Var.f18317i = i10;
        return i0Var;
    }

    public final void j(i0 i0Var) {
        a1 a1Var;
        s0 s0Var;
        s0 s0Var2;
        if (i0Var == i0.S) {
            return;
        }
        int i7 = i0Var.f18317i;
        if ((i7 & 1) == 1) {
            int i10 = i0Var.f18318v;
            this.f18308v = 1 | this.f18308v;
            this.f18309w = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = i0Var.f18319w;
            this.f18308v = 2 | this.f18308v;
            this.f18310x = i11;
        }
        if ((i7 & 4) == 4) {
            int i12 = i0Var.f18320x;
            this.f18308v = 4 | this.f18308v;
            this.f18311y = i12;
        }
        if ((i7 & 8) == 8) {
            s0 s0Var3 = i0Var.f18321y;
            if ((this.f18308v & 8) != 8 || (s0Var2 = this.E) == s0.Q) {
                this.E = s0Var3;
            } else {
                r0 r0VarQ = s0.q(s0Var2);
                r0VarQ.j(s0Var3);
                this.E = r0VarQ.g();
            }
            this.f18308v |= 8;
        }
        if ((i0Var.f18317i & 16) == 16) {
            int i13 = i0Var.E;
            this.f18308v = 16 | this.f18308v;
            this.F = i13;
        }
        if (!i0Var.F.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = i0Var.F;
                this.f18308v &= -33;
            } else {
                if ((this.f18308v & 32) != 32) {
                    this.G = new ArrayList(this.G);
                    this.f18308v |= 32;
                }
                this.G.addAll(i0Var.F);
            }
        }
        if ((i0Var.f18317i & 32) == 32) {
            s0 s0Var4 = i0Var.G;
            if ((this.f18308v & 64) != 64 || (s0Var = this.H) == s0.Q) {
                this.H = s0Var4;
            } else {
                r0 r0VarQ2 = s0.q(s0Var);
                r0VarQ2.j(s0Var4);
                this.H = r0VarQ2.g();
            }
            this.f18308v |= 64;
        }
        if ((i0Var.f18317i & 64) == 64) {
            int i14 = i0Var.H;
            this.f18308v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            this.I = i14;
        }
        if (!i0Var.I.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = i0Var.I;
                this.f18308v &= -257;
            } else {
                if ((this.f18308v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                    this.J = new ArrayList(this.J);
                    this.f18308v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                }
                this.J.addAll(i0Var.I);
            }
        }
        if (!i0Var.J.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = i0Var.J;
                this.f18308v &= -513;
            } else {
                if ((this.f18308v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                    this.K = new ArrayList(this.K);
                    this.f18308v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                }
                this.K.addAll(i0Var.J);
            }
        }
        if ((i0Var.f18317i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            a1 a1Var2 = i0Var.L;
            if ((this.f18308v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024 || (a1Var = this.L) == a1.I) {
                this.L = a1Var2;
            } else {
                z0 z0Var = new z0();
                s0 s0Var5 = s0.Q;
                z0Var.f18510y = s0Var5;
                z0Var.F = s0Var5;
                z0Var.h(a1Var);
                z0Var.h(a1Var2);
                this.L = z0Var.g();
            }
            this.f18308v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i15 = i0Var.f18317i;
        if ((i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            int i16 = i0Var.M;
            this.f18308v |= RecyclerView.ItemAnimator.FLAG_MOVED;
            this.M = i16;
        }
        if ((i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            int i17 = i0Var.N;
            this.f18308v |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.N = i17;
        }
        if (!i0Var.O.isEmpty()) {
            if (this.O.isEmpty()) {
                this.O = i0Var.O;
                this.f18308v &= -8193;
            } else {
                if ((this.f18308v & 8192) != 8192) {
                    this.O = new ArrayList(this.O);
                    this.f18308v |= 8192;
                }
                this.O.addAll(i0Var.O);
            }
        }
        if (!i0Var.P.isEmpty()) {
            if (this.P.isEmpty()) {
                this.P = i0Var.P;
                this.f18308v &= -16385;
            } else {
                if ((this.f18308v & 16384) != 16384) {
                    this.P = new ArrayList(this.P);
                    this.f18308v |= 16384;
                }
                this.P.addAll(i0Var.P);
            }
        }
        f(i0Var);
        this.f21889d = this.f21889d.b(i0Var.f18316e);
    }
}
