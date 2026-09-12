package pp;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends vp.k {
    public static final u0 M;
    public static final a N = new a(19);
    public int E;
    public s0 F;
    public int G;
    public List H;
    public List I;
    public List J;
    public byte K;
    public int L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp.d f18451e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18452i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18453v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18454w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f18455x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s0 f18456y;

    static {
        u0 u0Var = new u0();
        M = u0Var;
        u0Var.f18453v = 6;
        u0Var.f18454w = 0;
        List list = Collections.EMPTY_LIST;
        u0Var.f18455x = list;
        s0 s0Var = s0.Q;
        u0Var.f18456y = s0Var;
        u0Var.E = 0;
        u0Var.F = s0Var;
        u0Var.G = 0;
        u0Var.H = list;
        u0Var.I = list;
        u0Var.J = list;
    }

    public u0(t0 t0Var) {
        super(t0Var);
        this.K = (byte) -1;
        this.L = -1;
        this.f18451e = t0Var.f21889d;
    }

    @Override // vp.u
    public final vp.a a() {
        return M;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.K;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f18452i & 2) != 2) {
            this.K = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f18455x.size(); i7++) {
            if (!((x0) this.f18455x.get(i7)).b()) {
                this.K = (byte) 0;
                return false;
            }
        }
        if ((this.f18452i & 4) == 4 && !this.f18456y.b()) {
            this.K = (byte) 0;
            return false;
        }
        if ((this.f18452i & 16) == 16 && !this.F.b()) {
            this.K = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.H.size(); i10++) {
            if (!((h) this.H.get(i10)).b()) {
                this.K = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.J.size(); i11++) {
            if (!((l) this.J.get(i11)).b()) {
                this.K = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.K = (byte) 1;
            return true;
        }
        this.K = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.L;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18452i & 1) == 1 ? v1.d(1, this.f18453v) : 0;
        if ((this.f18452i & 2) == 2) {
            iD += v1.d(2, this.f18454w);
        }
        for (int i10 = 0; i10 < this.f18455x.size(); i10++) {
            iD += v1.f(3, (vp.a) this.f18455x.get(i10));
        }
        if ((this.f18452i & 4) == 4) {
            iD += v1.f(4, this.f18456y);
        }
        if ((this.f18452i & 8) == 8) {
            iD += v1.d(5, this.E);
        }
        if ((this.f18452i & 16) == 16) {
            iD += v1.f(6, this.F);
        }
        if ((this.f18452i & 32) == 32) {
            iD += v1.d(7, this.G);
        }
        for (int i11 = 0; i11 < this.H.size(); i11++) {
            iD += v1.f(8, (vp.a) this.H.get(i11));
        }
        int iE = 0;
        for (int i12 = 0; i12 < this.I.size(); i12++) {
            iE += v1.e(((Integer) this.I.get(i12)).intValue());
        }
        int size = (this.I.size() * 2) + iD + iE;
        for (int i13 = 0; i13 < this.J.size(); i13++) {
            size += v1.f(32, (vp.a) this.J.get(i13));
        }
        int size2 = this.f18451e.size() + j() + size;
        this.L = size2;
        return size2;
    }

    @Override // vp.a
    public final vp.i d() {
        return t0.h();
    }

    @Override // vp.a
    public final vp.i e() {
        t0 t0VarH = t0.h();
        t0VarH.j(this);
        return t0VarH;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        e4.c cVar = new e4.c(this);
        if ((this.f18452i & 1) == 1) {
            v1Var.r(1, this.f18453v);
        }
        if ((this.f18452i & 2) == 2) {
            v1Var.r(2, this.f18454w);
        }
        for (int i7 = 0; i7 < this.f18455x.size(); i7++) {
            v1Var.t(3, (vp.a) this.f18455x.get(i7));
        }
        if ((this.f18452i & 4) == 4) {
            v1Var.t(4, this.f18456y);
        }
        if ((this.f18452i & 8) == 8) {
            v1Var.r(5, this.E);
        }
        if ((this.f18452i & 16) == 16) {
            v1Var.t(6, this.F);
        }
        if ((this.f18452i & 32) == 32) {
            v1Var.r(7, this.G);
        }
        for (int i10 = 0; i10 < this.H.size(); i10++) {
            v1Var.t(8, (vp.a) this.H.get(i10));
        }
        for (int i11 = 0; i11 < this.I.size(); i11++) {
            v1Var.r(31, ((Integer) this.I.get(i11)).intValue());
        }
        for (int i12 = 0; i12 < this.J.size(); i12++) {
            v1Var.t(32, (vp.a) this.J.get(i12));
        }
        cVar.W(androidx.recyclerview.widget.h0.DEFAULT_DRAG_ANIMATION_DURATION, v1Var);
        v1Var.w(this.f18451e);
    }

    public u0() {
        this.K = (byte) -1;
        this.L = -1;
        this.f18451e = vp.d.f21871d;
    }

    public u0(vp.e eVar, vp.g gVar) {
        this.K = (byte) -1;
        this.L = -1;
        this.f18453v = 6;
        boolean z5 = false;
        this.f18454w = 0;
        List list = Collections.EMPTY_LIST;
        this.f18455x = list;
        s0 s0Var = s0.Q;
        this.f18456y = s0Var;
        this.E = 0;
        this.F = s0Var;
        this.G = 0;
        this.H = list;
        this.I = list;
        this.J = list;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        int i7 = 0;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    r0 r0VarQ = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f18452i |= 1;
                            this.f18453v = eVar.k();
                            continue;
                        case 16:
                            this.f18452i |= 2;
                            this.f18454w = eVar.k();
                            continue;
                        case 26:
                            if ((i7 & 4) != 4) {
                                this.f18455x = new ArrayList();
                                i7 |= 4;
                            }
                            this.f18455x.add(eVar.g(x0.K, gVar));
                            continue;
                        case 34:
                            if ((this.f18452i & 4) == 4) {
                                s0 s0Var2 = this.f18456y;
                                s0Var2.getClass();
                                r0VarQ = s0.q(s0Var2);
                            }
                            s0 s0Var3 = (s0) eVar.g(s0.R, gVar);
                            this.f18456y = s0Var3;
                            if (r0VarQ != null) {
                                r0VarQ.j(s0Var3);
                                this.f18456y = r0VarQ.g();
                            }
                            this.f18452i |= 4;
                            continue;
                        case 40:
                            this.f18452i |= 8;
                            this.E = eVar.k();
                            continue;
                        case 50:
                            if ((this.f18452i & 16) == 16) {
                                s0 s0Var4 = this.F;
                                s0Var4.getClass();
                                r0VarQ = s0.q(s0Var4);
                            }
                            s0 s0Var5 = (s0) eVar.g(s0.R, gVar);
                            this.F = s0Var5;
                            if (r0VarQ != null) {
                                r0VarQ.j(s0Var5);
                                this.F = r0VarQ.g();
                            }
                            this.f18452i |= 16;
                            continue;
                        case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                            this.f18452i |= 32;
                            this.G = eVar.k();
                            continue;
                        case 66:
                            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128) {
                                this.H = new ArrayList();
                                i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                            }
                            this.H.add(eVar.g(h.E, gVar));
                            continue;
                        case 248:
                            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                                this.I = new ArrayList();
                                i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            }
                            this.I.add(Integer.valueOf(eVar.k()));
                            continue;
                        case androidx.recyclerview.widget.h0.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                            int iD = eVar.d(eVar.k());
                            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256 && eVar.b() > 0) {
                                this.I = new ArrayList();
                                i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            }
                            while (eVar.b() > 0) {
                                this.I.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                            continue;
                        case 258:
                            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                                this.J = new ArrayList();
                                i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            }
                            this.J.add(eVar.g(l.E, gVar));
                            continue;
                        default:
                            if (!n(eVar, v1VarM, gVar, iN)) {
                                break;
                            }
                            break;
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
                if ((i7 & 4) == 4) {
                    this.f18455x = Collections.unmodifiableList(this.f18455x);
                }
                if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                    this.H = Collections.unmodifiableList(this.H);
                }
                if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.J = Collections.unmodifiableList(this.J);
                }
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18451e = cVar.g();
                }
                m();
                throw th2;
            }
        }
        if ((i7 & 4) == 4) {
            this.f18455x = Collections.unmodifiableList(this.f18455x);
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            this.H = Collections.unmodifiableList(this.H);
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            this.I = Collections.unmodifiableList(this.I);
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            this.J = Collections.unmodifiableList(this.J);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18451e = cVar.g();
        }
        m();
    }
}
