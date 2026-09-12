package pp;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends vp.k {
    public static final s0 Q;
    public static final a R = new a(17);
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public s0 J;
    public int K;
    public s0 L;
    public int M;
    public int N;
    public byte O;
    public int P;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp.d f18432e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18433i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f18434v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18435w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18436x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s0 f18437y;

    static {
        s0 s0Var = new s0();
        Q = s0Var;
        s0Var.p();
    }

    public s0(r0 r0Var) {
        super(r0Var);
        this.O = (byte) -1;
        this.P = -1;
        this.f18432e = r0Var.f21889d;
    }

    public static r0 q(s0 s0Var) {
        r0 r0VarH = r0.h();
        r0VarH.j(s0Var);
        return r0VarH;
    }

    @Override // vp.u
    public final vp.a a() {
        return Q;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.O;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f18434v.size(); i7++) {
            if (!((q0) this.f18434v.get(i7)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        if ((this.f18433i & 4) == 4 && !this.f18437y.b()) {
            this.O = (byte) 0;
            return false;
        }
        if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256 && !this.J.b()) {
            this.O = (byte) 0;
            return false;
        }
        if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024 && !this.L.b()) {
            this.O = (byte) 0;
            return false;
        }
        if (i()) {
            this.O = (byte) 1;
            return true;
        }
        this.O = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.P;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18433i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096 ? v1.d(1, this.N) : 0;
        for (int i10 = 0; i10 < this.f18434v.size(); i10++) {
            iD += v1.f(2, (vp.a) this.f18434v.get(i10));
        }
        if ((this.f18433i & 1) == 1) {
            iD += v1.j(3) + 1;
        }
        if ((this.f18433i & 2) == 2) {
            iD += v1.d(4, this.f18436x);
        }
        if ((this.f18433i & 4) == 4) {
            iD += v1.f(5, this.f18437y);
        }
        if ((this.f18433i & 16) == 16) {
            iD += v1.d(6, this.F);
        }
        if ((this.f18433i & 32) == 32) {
            iD += v1.d(7, this.G);
        }
        if ((this.f18433i & 8) == 8) {
            iD += v1.d(8, this.E);
        }
        if ((this.f18433i & 64) == 64) {
            iD += v1.d(9, this.H);
        }
        if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            iD += v1.f(10, this.J);
        }
        if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            iD += v1.d(11, this.K);
        }
        if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iD += v1.d(12, this.I);
        }
        if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            iD += v1.f(13, this.L);
        }
        if ((this.f18433i & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            iD += v1.d(14, this.M);
        }
        int size = this.f18432e.size() + j() + iD;
        this.P = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return r0.h();
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        e4.c cVar = new e4.c(this);
        if ((this.f18433i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            v1Var.r(1, this.N);
        }
        for (int i7 = 0; i7 < this.f18434v.size(); i7++) {
            v1Var.t(2, (vp.a) this.f18434v.get(i7));
        }
        if ((this.f18433i & 1) == 1) {
            boolean z5 = this.f18435w;
            v1Var.C(3, 0);
            v1Var.v(z5 ? 1 : 0);
        }
        if ((this.f18433i & 2) == 2) {
            v1Var.r(4, this.f18436x);
        }
        if ((this.f18433i & 4) == 4) {
            v1Var.t(5, this.f18437y);
        }
        if ((this.f18433i & 16) == 16) {
            v1Var.r(6, this.F);
        }
        if ((this.f18433i & 32) == 32) {
            v1Var.r(7, this.G);
        }
        if ((this.f18433i & 8) == 8) {
            v1Var.r(8, this.E);
        }
        if ((this.f18433i & 64) == 64) {
            v1Var.r(9, this.H);
        }
        if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            v1Var.t(10, this.J);
        }
        if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            v1Var.r(11, this.K);
        }
        if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            v1Var.r(12, this.I);
        }
        if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            v1Var.t(13, this.L);
        }
        if ((this.f18433i & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            v1Var.r(14, this.M);
        }
        cVar.W(androidx.recyclerview.widget.h0.DEFAULT_DRAG_ANIMATION_DURATION, v1Var);
        v1Var.w(this.f18432e);
    }

    public final void p() {
        this.f18434v = Collections.EMPTY_LIST;
        this.f18435w = false;
        this.f18436x = 0;
        s0 s0Var = Q;
        this.f18437y = s0Var;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = s0Var;
        this.K = 0;
        this.L = s0Var;
        this.M = 0;
        this.N = 0;
    }

    @Override // vp.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final r0 e() {
        return q(this);
    }

    public s0() {
        this.O = (byte) -1;
        this.P = -1;
        this.f18432e = vp.d.f21871d;
    }

    public s0(vp.e eVar, vp.g gVar) {
        this.O = (byte) -1;
        this.P = -1;
        p();
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        boolean z5 = false;
        boolean z6 = false;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    a aVar = R;
                    r0 r0VarQ = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f18433i |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                            this.N = eVar.k();
                            continue;
                        case 18:
                            if (!z6) {
                                this.f18434v = new ArrayList();
                                z6 = true;
                            }
                            this.f18434v.add(eVar.g(q0.F, gVar));
                            continue;
                        case 24:
                            this.f18433i |= 1;
                            this.f18435w = eVar.l() != 0;
                            continue;
                        case 32:
                            this.f18433i |= 2;
                            this.f18436x = eVar.k();
                            continue;
                        case 42:
                            if ((this.f18433i & 4) == 4) {
                                s0 s0Var = this.f18437y;
                                s0Var.getClass();
                                r0VarQ = q(s0Var);
                            }
                            s0 s0Var2 = (s0) eVar.g(aVar, gVar);
                            this.f18437y = s0Var2;
                            if (r0VarQ != null) {
                                r0VarQ.j(s0Var2);
                                this.f18437y = r0VarQ.g();
                            }
                            this.f18433i |= 4;
                            continue;
                        case 48:
                            this.f18433i |= 16;
                            this.F = eVar.k();
                            continue;
                        case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                            this.f18433i |= 32;
                            this.G = eVar.k();
                            continue;
                        case 64:
                            this.f18433i |= 8;
                            this.E = eVar.k();
                            continue;
                        case 72:
                            this.f18433i |= 64;
                            this.H = eVar.k();
                            continue;
                        case 82:
                            if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                                s0 s0Var3 = this.J;
                                s0Var3.getClass();
                                r0VarQ = q(s0Var3);
                            }
                            s0 s0Var4 = (s0) eVar.g(aVar, gVar);
                            this.J = s0Var4;
                            if (r0VarQ != null) {
                                r0VarQ.j(s0Var4);
                                this.J = r0VarQ.g();
                            }
                            this.f18433i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            continue;
                        case 88:
                            this.f18433i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            this.K = eVar.k();
                            continue;
                        case 96:
                            this.f18433i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                            this.I = eVar.k();
                            continue;
                        case 106:
                            if ((this.f18433i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                                s0 s0Var5 = this.L;
                                s0Var5.getClass();
                                r0VarQ = q(s0Var5);
                            }
                            s0 s0Var6 = (s0) eVar.g(aVar, gVar);
                            this.L = s0Var6;
                            if (r0VarQ != null) {
                                r0VarQ.j(s0Var6);
                                this.L = r0VarQ.g();
                            }
                            this.f18433i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                            continue;
                        case 112:
                            this.f18433i |= RecyclerView.ItemAnimator.FLAG_MOVED;
                            this.M = eVar.k();
                            continue;
                        default:
                            if (!n(eVar, v1VarM, gVar, iN)) {
                                break;
                            }
                            break;
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    if (z6) {
                        this.f18434v = Collections.unmodifiableList(this.f18434v);
                    }
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f18432e = cVar.g();
                    }
                    m();
                    throw th2;
                }
            } catch (vp.q e10) {
                e10.f21916d = this;
                throw e10;
            } catch (IOException e11) {
                vp.q qVar = new vp.q(e11.getMessage());
                qVar.f21916d = this;
                throw qVar;
            }
        }
        if (z6) {
            this.f18434v = Collections.unmodifiableList(this.f18434v);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18432e = cVar.g();
        }
        m();
    }
}
