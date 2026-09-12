package pp;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends vp.k {
    public static final i0 S;
    public static final a T = new a(13);
    public int E;
    public List F;
    public s0 G;
    public int H;
    public List I;
    public List J;
    public int K;
    public a1 L;
    public int M;
    public int N;
    public List O;
    public List P;
    public byte Q;
    public int R;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp.d f18316e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18317i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18318v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18320x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s0 f18321y;

    static {
        i0 i0Var = new i0();
        S = i0Var;
        i0Var.p();
    }

    public i0(h0 h0Var) {
        super(h0Var);
        this.K = -1;
        this.Q = (byte) -1;
        this.R = -1;
        this.f18316e = h0Var.f21889d;
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
        int i7 = this.f18317i;
        if ((i7 & 4) != 4) {
            this.Q = (byte) 0;
            return false;
        }
        if ((i7 & 8) == 8 && !this.f18321y.b()) {
            this.Q = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            if (!((x0) this.F.get(i10)).b()) {
                this.Q = (byte) 0;
                return false;
            }
        }
        if ((this.f18317i & 32) == 32 && !this.G.b()) {
            this.Q = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.I.size(); i11++) {
            if (!((s0) this.I.get(i11)).b()) {
                this.Q = (byte) 0;
                return false;
            }
        }
        if ((this.f18317i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128 && !this.L.b()) {
            this.Q = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.P.size(); i12++) {
            if (!((l) this.P.get(i12)).b()) {
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
        int iD = (this.f18317i & 2) == 2 ? v1.d(1, this.f18319w) : 0;
        if ((this.f18317i & 4) == 4) {
            iD += v1.d(2, this.f18320x);
        }
        if ((this.f18317i & 8) == 8) {
            iD += v1.f(3, this.f18321y);
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            iD += v1.f(4, (vp.a) this.F.get(i10));
        }
        if ((this.f18317i & 32) == 32) {
            iD += v1.f(5, this.G);
        }
        if ((this.f18317i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iD += v1.f(6, this.L);
        }
        if ((this.f18317i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            iD += v1.d(7, this.M);
        }
        if ((this.f18317i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            iD += v1.d(8, this.N);
        }
        if ((this.f18317i & 16) == 16) {
            iD += v1.d(9, this.E);
        }
        if ((this.f18317i & 64) == 64) {
            iD += v1.d(10, this.H);
        }
        if ((this.f18317i & 1) == 1) {
            iD += v1.d(11, this.f18318v);
        }
        for (int i11 = 0; i11 < this.I.size(); i11++) {
            iD += v1.f(12, (vp.a) this.I.get(i11));
        }
        int iE = 0;
        for (int i12 = 0; i12 < this.J.size(); i12++) {
            iE += v1.e(((Integer) this.J.get(i12)).intValue());
        }
        int iE2 = iD + iE;
        if (!this.J.isEmpty()) {
            iE2 = iE2 + 1 + v1.e(iE);
        }
        this.K = iE;
        int iE3 = 0;
        for (int i13 = 0; i13 < this.O.size(); i13++) {
            iE3 += v1.e(((Integer) this.O.get(i13)).intValue());
        }
        int size = (this.O.size() * 2) + iE2 + iE3;
        for (int i14 = 0; i14 < this.P.size(); i14++) {
            size += v1.f(32, (vp.a) this.P.get(i14));
        }
        int size2 = this.f18316e.size() + j() + size;
        this.R = size2;
        return size2;
    }

    @Override // vp.a
    public final vp.i d() {
        return h0.h();
    }

    @Override // vp.a
    public final vp.i e() {
        h0 h0VarH = h0.h();
        h0VarH.j(this);
        return h0VarH;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        e4.c cVar = new e4.c(this);
        if ((this.f18317i & 2) == 2) {
            v1Var.r(1, this.f18319w);
        }
        if ((this.f18317i & 4) == 4) {
            v1Var.r(2, this.f18320x);
        }
        if ((this.f18317i & 8) == 8) {
            v1Var.t(3, this.f18321y);
        }
        for (int i7 = 0; i7 < this.F.size(); i7++) {
            v1Var.t(4, (vp.a) this.F.get(i7));
        }
        if ((this.f18317i & 32) == 32) {
            v1Var.t(5, this.G);
        }
        if ((this.f18317i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            v1Var.t(6, this.L);
        }
        if ((this.f18317i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            v1Var.r(7, this.M);
        }
        if ((this.f18317i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            v1Var.r(8, this.N);
        }
        if ((this.f18317i & 16) == 16) {
            v1Var.r(9, this.E);
        }
        if ((this.f18317i & 64) == 64) {
            v1Var.r(10, this.H);
        }
        if ((this.f18317i & 1) == 1) {
            v1Var.r(11, this.f18318v);
        }
        for (int i10 = 0; i10 < this.I.size(); i10++) {
            v1Var.t(12, (vp.a) this.I.get(i10));
        }
        if (this.J.size() > 0) {
            v1Var.A(106);
            v1Var.A(this.K);
        }
        for (int i11 = 0; i11 < this.J.size(); i11++) {
            v1Var.s(((Integer) this.J.get(i11)).intValue());
        }
        for (int i12 = 0; i12 < this.O.size(); i12++) {
            v1Var.r(31, ((Integer) this.O.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.P.size(); i13++) {
            v1Var.t(32, (vp.a) this.P.get(i13));
        }
        cVar.W(19000, v1Var);
        v1Var.w(this.f18316e);
    }

    public final void p() {
        this.f18318v = 518;
        this.f18319w = 2054;
        this.f18320x = 0;
        s0 s0Var = s0.Q;
        this.f18321y = s0Var;
        this.E = 0;
        List list = Collections.EMPTY_LIST;
        this.F = list;
        this.G = s0Var;
        this.H = 0;
        this.I = list;
        this.J = list;
        this.L = a1.I;
        this.M = 0;
        this.N = 0;
        this.O = list;
        this.P = list;
    }

    public i0() {
        this.K = -1;
        this.Q = (byte) -1;
        this.R = -1;
        this.f18316e = vp.d.f21871d;
    }

    public i0(vp.e eVar, vp.g gVar) {
        this.K = -1;
        this.Q = (byte) -1;
        this.R = -1;
        p();
        vp.c cVar = new vp.c();
        int i7 = 1;
        v1 v1VarM = v1.m(cVar, 1);
        int i10 = 0;
        int i11 = 0;
        while (i10 == 0) {
            try {
                try {
                    int iN = eVar.n();
                    r0 r0VarQ = null;
                    z0 z0Var = null;
                    r0 r0VarQ2 = null;
                    switch (iN) {
                        case 0:
                            i10 = 1;
                            break;
                        case 8:
                            this.f18317i |= 2;
                            this.f18319w = eVar.k();
                            break;
                        case 16:
                            this.f18317i |= 4;
                            this.f18320x = eVar.k();
                            break;
                        case 26:
                            if ((this.f18317i & 8) == 8) {
                                s0 s0Var = this.f18321y;
                                s0Var.getClass();
                                r0VarQ = s0.q(s0Var);
                            }
                            s0 s0Var2 = (s0) eVar.g(s0.R, gVar);
                            this.f18321y = s0Var2;
                            if (r0VarQ != null) {
                                r0VarQ.j(s0Var2);
                                this.f18321y = r0VarQ.g();
                            }
                            this.f18317i |= 8;
                            break;
                        case 34:
                            int i12 = (i11 == true ? 1 : 0) & 32;
                            i11 = i11;
                            if (i12 != 32) {
                                this.F = new ArrayList();
                                i11 = (i11 == true ? 1 : 0) | 32;
                            }
                            this.F.add(eVar.g(x0.K, gVar));
                            break;
                        case 42:
                            if ((this.f18317i & 32) == 32) {
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
                            this.f18317i |= 32;
                            break;
                        case 50:
                            if ((this.f18317i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                                a1 a1Var = this.L;
                                a1Var.getClass();
                                z0Var = new z0();
                                s0 s0Var5 = s0.Q;
                                z0Var.f18510y = s0Var5;
                                z0Var.F = s0Var5;
                                z0Var.h(a1Var);
                            }
                            a1 a1Var2 = (a1) eVar.g(a1.J, gVar);
                            this.L = a1Var2;
                            if (z0Var != null) {
                                z0Var.h(a1Var2);
                                this.L = z0Var.g();
                            }
                            this.f18317i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                            break;
                        case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                            this.f18317i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            this.M = eVar.k();
                            break;
                        case 64:
                            this.f18317i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            this.N = eVar.k();
                            break;
                        case 72:
                            this.f18317i |= 16;
                            this.E = eVar.k();
                            break;
                        case 80:
                            this.f18317i |= 64;
                            this.H = eVar.k();
                            break;
                        case 88:
                            this.f18317i |= i7;
                            this.f18318v = eVar.k();
                            break;
                        case 98:
                            int i13 = (i11 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            i11 = i11;
                            if (i13 != 256) {
                                this.I = new ArrayList();
                                i11 = (i11 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            }
                            this.I.add(eVar.g(s0.R, gVar));
                            break;
                        case 104:
                            int i14 = (i11 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            i11 = i11;
                            if (i14 != 512) {
                                this.J = new ArrayList();
                                i11 = (i11 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            }
                            this.J.add(Integer.valueOf(eVar.k()));
                            break;
                        case 106:
                            int iD = eVar.d(eVar.k());
                            int i15 = (i11 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            i11 = i11;
                            if (i15 != 512 && eVar.b() > 0) {
                                i11 = i11;
                                this.J = new ArrayList();
                                i11 = (i11 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            }
                            i11 = i11;
                            while (eVar.b() > 0) {
                                this.J.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                            break;
                        case 248:
                            int i16 = (i11 == true ? 1 : 0) & 8192;
                            i11 = i11;
                            if (i16 != 8192) {
                                this.O = new ArrayList();
                                i11 = (i11 == true ? 1 : 0) | 8192;
                            }
                            this.O.add(Integer.valueOf(eVar.k()));
                            break;
                        case androidx.recyclerview.widget.h0.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                            int iD2 = eVar.d(eVar.k());
                            int i17 = (i11 == true ? 1 : 0) & 8192;
                            i11 = i11;
                            if (i17 != 8192 && eVar.b() > 0) {
                                i11 = i11;
                                this.O = new ArrayList();
                                i11 = (i11 == true ? 1 : 0) | 8192;
                            }
                            i11 = i11;
                            while (eVar.b() > 0) {
                                this.O.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD2);
                            break;
                        case 258:
                            int i18 = (i11 == true ? 1 : 0) & 16384;
                            i11 = i11;
                            if (i18 != 16384) {
                                this.P = new ArrayList();
                                i11 = (i11 == true ? 1 : 0) | 16384;
                            }
                            this.P.add(eVar.g(l.E, gVar));
                            break;
                        default:
                            if (!n(eVar, v1VarM, gVar, iN)) {
                                i10 = i7;
                            }
                            break;
                    }
                    i7 = 1;
                    i11 = i11;
                } catch (Throwable th2) {
                    if (((i11 == true ? 1 : 0) & 32) == 32) {
                        this.F = Collections.unmodifiableList(this.F);
                    }
                    if (((i11 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                        this.I = Collections.unmodifiableList(this.I);
                    }
                    if (((i11 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                        this.J = Collections.unmodifiableList(this.J);
                    }
                    if (((i11 == true ? 1 : 0) & 8192) == 8192) {
                        this.O = Collections.unmodifiableList(this.O);
                    }
                    if (((i11 == true ? 1 : 0) & 16384) == 16384) {
                        this.P = Collections.unmodifiableList(this.P);
                    }
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f18316e = cVar.g();
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
        if (((i11 == true ? 1 : 0) & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
        }
        if (((i11 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            this.I = Collections.unmodifiableList(this.I);
        }
        if (((i11 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            this.J = Collections.unmodifiableList(this.J);
        }
        if (((i11 == true ? 1 : 0) & 8192) == 8192) {
            this.O = Collections.unmodifiableList(this.O);
        }
        if (((i11 == true ? 1 : 0) & 16384) == 16384) {
            this.P = Collections.unmodifiableList(this.P);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18316e = cVar.g();
        }
        m();
    }
}
