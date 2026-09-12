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
public final class a0 extends vp.k {
    public static final a0 S;
    public static final a T = new a(10);
    public int E;
    public List F;
    public s0 G;
    public int H;
    public List I;
    public List J;
    public int K;
    public List L;
    public y0 M;
    public List N;
    public p O;
    public List P;
    public byte Q;
    public int R;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp.d f18199e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18200i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18201v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18203x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s0 f18204y;

    static {
        a0 a0Var = new a0();
        S = a0Var;
        a0Var.p();
    }

    public a0(z zVar) {
        super(zVar);
        this.K = -1;
        this.Q = (byte) -1;
        this.R = -1;
        this.f18199e = zVar.f21889d;
    }

    @Override // vp.u
    public final vp.a a() {
        return S;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.Q;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i7 = this.f18200i;
        if ((i7 & 4) != 4) {
            this.Q = (byte) 0;
            return false;
        }
        if ((i7 & 8) == 8 && !this.f18204y.b()) {
            this.Q = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            if (!((x0) this.F.get(i10)).b()) {
                this.Q = (byte) 0;
                return false;
            }
        }
        if ((this.f18200i & 32) == 32 && !this.G.b()) {
            this.Q = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.I.size(); i11++) {
            if (!((s0) this.I.get(i11)).b()) {
                this.Q = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.L.size(); i12++) {
            if (!((a1) this.L.get(i12)).b()) {
                this.Q = (byte) 0;
                return false;
            }
        }
        if ((this.f18200i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128 && !this.M.b()) {
            this.Q = (byte) 0;
            return false;
        }
        if ((this.f18200i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256 && !this.O.b()) {
            this.Q = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.P.size(); i13++) {
            if (!((l) this.P.get(i13)).b()) {
                this.Q = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.Q = (byte) 1;
            return true;
        }
        this.Q = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.R;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18200i & 2) == 2 ? v1.d(1, this.f18202w) : 0;
        if ((this.f18200i & 4) == 4) {
            iD += v1.d(2, this.f18203x);
        }
        if ((this.f18200i & 8) == 8) {
            iD += v1.f(3, this.f18204y);
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            iD += v1.f(4, (vp.a) this.F.get(i10));
        }
        if ((this.f18200i & 32) == 32) {
            iD += v1.f(5, this.G);
        }
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            iD += v1.f(6, (vp.a) this.L.get(i11));
        }
        if ((this.f18200i & 16) == 16) {
            iD += v1.d(7, this.E);
        }
        if ((this.f18200i & 64) == 64) {
            iD += v1.d(8, this.H);
        }
        if ((this.f18200i & 1) == 1) {
            iD += v1.d(9, this.f18201v);
        }
        for (int i12 = 0; i12 < this.I.size(); i12++) {
            iD += v1.f(10, (vp.a) this.I.get(i12));
        }
        int iE = 0;
        for (int i13 = 0; i13 < this.J.size(); i13++) {
            iE += v1.e(((Integer) this.J.get(i13)).intValue());
        }
        int iF = iD + iE;
        if (!this.J.isEmpty()) {
            iF = iF + 1 + v1.e(iE);
        }
        this.K = iE;
        if ((this.f18200i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iF += v1.f(30, this.M);
        }
        int iE2 = 0;
        for (int i14 = 0; i14 < this.N.size(); i14++) {
            iE2 += v1.e(((Integer) this.N.get(i14)).intValue());
        }
        int size = (this.N.size() * 2) + iF + iE2;
        if ((this.f18200i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            size += v1.f(32, this.O);
        }
        for (int i15 = 0; i15 < this.P.size(); i15++) {
            size += v1.f(33, (vp.a) this.P.get(i15));
        }
        int size2 = this.f18199e.size() + j() + size;
        this.R = size2;
        return size2;
    }

    @Override // vp.a
    public final vp.i d() {
        return z.h();
    }

    @Override // vp.a
    public final vp.i e() {
        z zVarH = z.h();
        zVarH.j(this);
        return zVarH;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        e4.c cVar = new e4.c(this);
        if ((this.f18200i & 2) == 2) {
            v1Var.r(1, this.f18202w);
        }
        if ((this.f18200i & 4) == 4) {
            v1Var.r(2, this.f18203x);
        }
        if ((this.f18200i & 8) == 8) {
            v1Var.t(3, this.f18204y);
        }
        for (int i7 = 0; i7 < this.F.size(); i7++) {
            v1Var.t(4, (vp.a) this.F.get(i7));
        }
        if ((this.f18200i & 32) == 32) {
            v1Var.t(5, this.G);
        }
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            v1Var.t(6, (vp.a) this.L.get(i10));
        }
        if ((this.f18200i & 16) == 16) {
            v1Var.r(7, this.E);
        }
        if ((this.f18200i & 64) == 64) {
            v1Var.r(8, this.H);
        }
        if ((this.f18200i & 1) == 1) {
            v1Var.r(9, this.f18201v);
        }
        for (int i11 = 0; i11 < this.I.size(); i11++) {
            v1Var.t(10, (vp.a) this.I.get(i11));
        }
        if (this.J.size() > 0) {
            v1Var.A(90);
            v1Var.A(this.K);
        }
        for (int i12 = 0; i12 < this.J.size(); i12++) {
            v1Var.s(((Integer) this.J.get(i12)).intValue());
        }
        if ((this.f18200i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            v1Var.t(30, this.M);
        }
        for (int i13 = 0; i13 < this.N.size(); i13++) {
            v1Var.r(31, ((Integer) this.N.get(i13)).intValue());
        }
        if ((this.f18200i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            v1Var.t(32, this.O);
        }
        for (int i14 = 0; i14 < this.P.size(); i14++) {
            v1Var.t(33, (vp.a) this.P.get(i14));
        }
        cVar.W(19000, v1Var);
        v1Var.w(this.f18199e);
    }

    public final void p() {
        this.f18201v = 6;
        this.f18202w = 6;
        this.f18203x = 0;
        s0 s0Var = s0.Q;
        this.f18204y = s0Var;
        this.E = 0;
        List list = Collections.EMPTY_LIST;
        this.F = list;
        this.G = s0Var;
        this.H = 0;
        this.I = list;
        this.J = list;
        this.L = list;
        this.M = y0.f18496y;
        this.N = list;
        this.O = p.f18394w;
        this.P = list;
    }

    public a0() {
        this.K = -1;
        this.Q = (byte) -1;
        this.R = -1;
        this.f18199e = vp.d.f21871d;
    }

    public a0(vp.e eVar, vp.g gVar) {
        this.K = -1;
        this.Q = (byte) -1;
        this.R = -1;
        p();
        vp.c cVar = new vp.c();
        boolean z5 = true;
        v1 v1VarM = v1.m(cVar, 1);
        boolean z6 = false;
        int i7 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        r0 r0VarQ = null;
                        o oVar = null;
                        g gVarI = null;
                        r0 r0VarQ2 = null;
                        switch (iN) {
                            case 0:
                                z5 = z5;
                                z6 = z5;
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 8:
                                z5 = z5;
                                this.f18200i |= 2;
                                this.f18202w = eVar.k();
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 16:
                                z5 = z5;
                                this.f18200i |= 4;
                                this.f18203x = eVar.k();
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 26:
                                z5 = z5;
                                if ((this.f18200i & 8) == 8) {
                                    s0 s0Var = this.f18204y;
                                    s0Var.getClass();
                                    r0VarQ = s0.q(s0Var);
                                }
                                s0 s0Var2 = (s0) eVar.g(s0.R, gVar);
                                this.f18204y = s0Var2;
                                if (r0VarQ != null) {
                                    r0VarQ.j(s0Var2);
                                    this.f18204y = r0VarQ.g();
                                }
                                this.f18200i |= 8;
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 34:
                                z5 = z5;
                                int i10 = (i7 == true ? 1 : 0) & 32;
                                i7 = i7;
                                if (i10 != 32) {
                                    this.F = new ArrayList();
                                    i7 = (i7 == true ? 1 : 0) | 32;
                                }
                                this.F.add(eVar.g(x0.K, gVar));
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 42:
                                z5 = z5;
                                if ((this.f18200i & 32) == 32) {
                                    s0 s0Var3 = this.G;
                                    s0Var3.getClass();
                                    r0VarQ2 = s0.q(s0Var3);
                                }
                                s0 s0Var4 = (s0) eVar.g(s0.R, gVar);
                                this.G = s0Var4;
                                if (r0VarQ2 != null) {
                                    r0VarQ2.j(s0Var4);
                                    this.G = r0VarQ2.g();
                                }
                                this.f18200i |= 32;
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 50:
                                z5 = z5;
                                int i11 = (i7 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                i7 = i7;
                                if (i11 != 1024) {
                                    this.L = new ArrayList();
                                    i7 = (i7 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                }
                                this.L.add(eVar.g(a1.J, gVar));
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                                z5 = z5;
                                this.f18200i |= 16;
                                this.E = eVar.k();
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 64:
                                z5 = z5;
                                this.f18200i |= 64;
                                this.H = eVar.k();
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 72:
                                z5 = z5;
                                this.f18200i |= 1;
                                this.f18201v = eVar.k();
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 82:
                                z5 = z5;
                                int i12 = (i7 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                i7 = i7;
                                if (i12 != 256) {
                                    this.I = new ArrayList();
                                    i7 = (i7 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                }
                                this.I.add(eVar.g(s0.R, gVar));
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 88:
                                z5 = z5;
                                int i13 = (i7 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                i7 = i7;
                                if (i13 != 512) {
                                    this.J = new ArrayList();
                                    i7 = (i7 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                }
                                this.J.add(Integer.valueOf(eVar.k()));
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 90:
                                z5 = z5;
                                int iD = eVar.d(eVar.k());
                                int i14 = (i7 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                i7 = i7;
                                if (i14 != 512 && eVar.b() > 0) {
                                    i7 = i7;
                                    this.J = new ArrayList();
                                    i7 = (i7 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                }
                                i7 = i7;
                                while (eVar.b() > 0) {
                                    this.J.add(Integer.valueOf(eVar.k()));
                                }
                                eVar.c(iD);
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 242:
                                z5 = z5;
                                if ((this.f18200i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                                    y0 y0Var = this.M;
                                    y0Var.getClass();
                                    gVarI = y0.i(y0Var);
                                }
                                y0 y0Var2 = (y0) eVar.g(y0.E, gVar);
                                this.M = y0Var2;
                                if (gVarI != null) {
                                    gVarI.k(y0Var2);
                                    this.M = gVarI.g();
                                }
                                this.f18200i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 248:
                                z5 = z5;
                                int i15 = (i7 == true ? 1 : 0) & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                                i7 = i7;
                                if (i15 != 4096) {
                                    this.N = new ArrayList();
                                    i7 = (i7 == true ? 1 : 0) | RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                                }
                                this.N.add(Integer.valueOf(eVar.k()));
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case androidx.recyclerview.widget.h0.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                z5 = z5;
                                int iD2 = eVar.d(eVar.k());
                                int i16 = (i7 == true ? 1 : 0) & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                                i7 = i7;
                                if (i16 != 4096 && eVar.b() > 0) {
                                    i7 = i7;
                                    this.N = new ArrayList();
                                    i7 = (i7 == true ? 1 : 0) | RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                                }
                                i7 = i7;
                                while (eVar.b() > 0) {
                                    this.N.add(Integer.valueOf(eVar.k()));
                                }
                                eVar.c(iD2);
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 258:
                                if ((this.f18200i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                                    p pVar = this.O;
                                    pVar.getClass();
                                    oVar = new o(0);
                                    oVar.f18389v = Collections.EMPTY_LIST;
                                    oVar.k(pVar);
                                }
                                p pVar2 = (p) eVar.g(p.f18395x, gVar);
                                this.O = pVar2;
                                if (oVar != null) {
                                    oVar.k(pVar2);
                                    this.O = oVar.f();
                                }
                                this.f18200i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                continue;
                                z5 = z5;
                                i7 = i7;
                                break;
                            case 266:
                                int i17 = (i7 == true ? 1 : 0) & 16384;
                                int i18 = i7;
                                if (i17 != 16384) {
                                    this.P = new ArrayList();
                                    i18 = (i7 == true ? 1 : 0) | 16384;
                                }
                                this.P.add(eVar.g(l.E, gVar));
                                i7 = i18;
                                break;
                            default:
                                i7 = i7;
                                if (!n(eVar, v1VarM, gVar, iN)) {
                                    z6 = z5;
                                    z5 = z6;
                                }
                                z5 = z5;
                                i7 = i7;
                                break;
                        }
                        z5 = z5;
                        z5 = z5;
                        i7 = i7;
                    } catch (IOException e10) {
                        vp.q qVar = new vp.q(e10.getMessage());
                        qVar.f21916d = this;
                        throw qVar;
                    }
                } catch (vp.q e11) {
                    e11.f21916d = this;
                    throw e11;
                }
            } catch (Throwable th2) {
                if (((i7 == true ? 1 : 0) & 32) == 32) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                if (((i7 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                    this.L = Collections.unmodifiableList(this.L);
                }
                if (((i7 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                if (((i7 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.J = Collections.unmodifiableList(this.J);
                }
                if (((i7 == true ? 1 : 0) & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    this.N = Collections.unmodifiableList(this.N);
                }
                if (((i7 == true ? 1 : 0) & 16384) == 16384) {
                    this.P = Collections.unmodifiableList(this.P);
                }
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18199e = cVar.g();
                }
                m();
                throw th2;
            }
        }
        if (((i7 == true ? 1 : 0) & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
        }
        if (((i7 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            this.L = Collections.unmodifiableList(this.L);
        }
        if (((i7 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            this.I = Collections.unmodifiableList(this.I);
        }
        if (((i7 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            this.J = Collections.unmodifiableList(this.J);
        }
        if (((i7 == true ? 1 : 0) & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            this.N = Collections.unmodifiableList(this.N);
        }
        if (((i7 == true ? 1 : 0) & 16384) == 16384) {
            this.P = Collections.unmodifiableList(this.P);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18199e = cVar.g();
        }
        m();
    }
}
