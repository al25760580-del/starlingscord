package pp;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends vp.j {
    public List E;
    public List F;
    public List G;
    public List H;
    public List I;
    public List J;
    public List K;
    public List L;
    public List M;
    public List N;
    public List O;
    public List P;
    public int Q;
    public s0 R;
    public int S;
    public List T;
    public List U;
    public List V;
    public y0 W;
    public List X;
    public f1 Y;
    public List Z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18312v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18313w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18314x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18315y;

    public static i h() {
        i iVar = new i();
        iVar.f18313w = 6;
        List list = Collections.EMPTY_LIST;
        iVar.E = list;
        iVar.F = list;
        iVar.G = list;
        iVar.H = list;
        iVar.I = list;
        iVar.J = list;
        iVar.K = list;
        iVar.L = list;
        iVar.M = list;
        iVar.N = list;
        iVar.O = list;
        iVar.P = list;
        iVar.R = s0.Q;
        iVar.T = list;
        iVar.U = list;
        iVar.V = list;
        iVar.W = y0.f18496y;
        iVar.X = list;
        iVar.Y = f1.f18283w;
        iVar.Z = list;
        return iVar;
    }

    @Override // vp.i
    public final vp.a c() {
        k kVarG = g();
        if (kVarG.b()) {
            return kVarG;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        i iVarH = h();
        iVarH.j(g());
        return iVarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        k kVar = null;
        try {
            try {
                k.f18333i0.getClass();
                j(new k(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                k kVar2 = (k) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    kVar = kVar2;
                    if (kVar != null) {
                        j(kVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (kVar != null) {
                j(kVar);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        j((k) nVar);
        return this;
    }

    public final k g() {
        k kVar = new k(this);
        int i7 = this.f18312v;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        kVar.f18342v = this.f18313w;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        kVar.f18343w = this.f18314x;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        kVar.f18344x = this.f18315y;
        if ((i7 & 8) == 8) {
            this.E = Collections.unmodifiableList(this.E);
            this.f18312v &= -9;
        }
        kVar.f18345y = this.E;
        if ((this.f18312v & 16) == 16) {
            this.F = Collections.unmodifiableList(this.F);
            this.f18312v &= -17;
        }
        kVar.E = this.F;
        if ((this.f18312v & 32) == 32) {
            this.G = Collections.unmodifiableList(this.G);
            this.f18312v &= -33;
        }
        kVar.F = this.G;
        if ((this.f18312v & 64) == 64) {
            this.H = Collections.unmodifiableList(this.H);
            this.f18312v &= -65;
        }
        kVar.H = this.H;
        if ((this.f18312v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            this.I = Collections.unmodifiableList(this.I);
            this.f18312v &= -129;
        }
        kVar.J = this.I;
        if ((this.f18312v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            this.J = Collections.unmodifiableList(this.J);
            this.f18312v &= -257;
        }
        kVar.K = this.J;
        if ((this.f18312v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            this.K = Collections.unmodifiableList(this.K);
            this.f18312v &= -513;
        }
        kVar.M = this.K;
        if ((this.f18312v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            this.L = Collections.unmodifiableList(this.L);
            this.f18312v &= -1025;
        }
        kVar.N = this.L;
        if ((this.f18312v & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            this.M = Collections.unmodifiableList(this.M);
            this.f18312v &= -2049;
        }
        kVar.O = this.M;
        if ((this.f18312v & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            this.N = Collections.unmodifiableList(this.N);
            this.f18312v &= -4097;
        }
        kVar.P = this.N;
        if ((this.f18312v & 8192) == 8192) {
            this.O = Collections.unmodifiableList(this.O);
            this.f18312v &= -8193;
        }
        kVar.Q = this.O;
        if ((this.f18312v & 16384) == 16384) {
            this.P = Collections.unmodifiableList(this.P);
            this.f18312v &= -16385;
        }
        kVar.R = this.P;
        if ((i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) == 32768) {
            i10 |= 8;
        }
        kVar.T = this.Q;
        if ((i7 & 65536) == 65536) {
            i10 |= 16;
        }
        kVar.U = this.R;
        if ((i7 & 131072) == 131072) {
            i10 |= 32;
        }
        kVar.V = this.S;
        if ((this.f18312v & 262144) == 262144) {
            this.T = Collections.unmodifiableList(this.T);
            this.f18312v &= -262145;
        }
        kVar.W = this.T;
        if ((this.f18312v & 524288) == 524288) {
            this.U = Collections.unmodifiableList(this.U);
            this.f18312v &= -524289;
        }
        kVar.Y = this.U;
        if ((this.f18312v & 1048576) == 1048576) {
            this.V = Collections.unmodifiableList(this.V);
            this.f18312v &= -1048577;
        }
        kVar.Z = this.V;
        if ((i7 & 2097152) == 2097152) {
            i10 |= 64;
        }
        kVar.f18334b0 = this.W;
        if ((this.f18312v & 4194304) == 4194304) {
            this.X = Collections.unmodifiableList(this.X);
            this.f18312v &= -4194305;
        }
        kVar.f18335c0 = this.X;
        if ((i7 & 8388608) == 8388608) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        kVar.f18336d0 = this.Y;
        if ((this.f18312v & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) == 16777216) {
            this.Z = Collections.unmodifiableList(this.Z);
            this.f18312v &= -16777217;
        }
        kVar.f18338e0 = this.Z;
        kVar.f18341i = i10;
        return kVar;
    }

    public final void j(k kVar) {
        f1 f1Var;
        y0 y0Var;
        s0 s0Var;
        if (kVar == k.h0) {
            return;
        }
        int i7 = kVar.f18341i;
        if ((i7 & 1) == 1) {
            int i10 = kVar.f18342v;
            this.f18312v = 1 | this.f18312v;
            this.f18313w = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = kVar.f18343w;
            this.f18312v = 2 | this.f18312v;
            this.f18314x = i11;
        }
        if ((i7 & 4) == 4) {
            int i12 = kVar.f18344x;
            this.f18312v = 4 | this.f18312v;
            this.f18315y = i12;
        }
        if (!kVar.f18345y.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = kVar.f18345y;
                this.f18312v &= -9;
            } else {
                if ((this.f18312v & 8) != 8) {
                    this.E = new ArrayList(this.E);
                    this.f18312v |= 8;
                }
                this.E.addAll(kVar.f18345y);
            }
        }
        if (!kVar.E.isEmpty()) {
            if (this.F.isEmpty()) {
                this.F = kVar.E;
                this.f18312v &= -17;
            } else {
                if ((this.f18312v & 16) != 16) {
                    this.F = new ArrayList(this.F);
                    this.f18312v |= 16;
                }
                this.F.addAll(kVar.E);
            }
        }
        if (!kVar.F.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = kVar.F;
                this.f18312v &= -33;
            } else {
                if ((this.f18312v & 32) != 32) {
                    this.G = new ArrayList(this.G);
                    this.f18312v |= 32;
                }
                this.G.addAll(kVar.F);
            }
        }
        if (!kVar.H.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = kVar.H;
                this.f18312v &= -65;
            } else {
                if ((this.f18312v & 64) != 64) {
                    this.H = new ArrayList(this.H);
                    this.f18312v |= 64;
                }
                this.H.addAll(kVar.H);
            }
        }
        if (!kVar.J.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = kVar.J;
                this.f18312v &= -129;
            } else {
                if ((this.f18312v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128) {
                    this.I = new ArrayList(this.I);
                    this.f18312v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                }
                this.I.addAll(kVar.J);
            }
        }
        if (!kVar.K.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = kVar.K;
                this.f18312v &= -257;
            } else {
                if ((this.f18312v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                    this.J = new ArrayList(this.J);
                    this.f18312v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                }
                this.J.addAll(kVar.K);
            }
        }
        if (!kVar.M.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = kVar.M;
                this.f18312v &= -513;
            } else {
                if ((this.f18312v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                    this.K = new ArrayList(this.K);
                    this.f18312v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                }
                this.K.addAll(kVar.M);
            }
        }
        if (!kVar.N.isEmpty()) {
            if (this.L.isEmpty()) {
                this.L = kVar.N;
                this.f18312v &= -1025;
            } else {
                if ((this.f18312v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024) {
                    this.L = new ArrayList(this.L);
                    this.f18312v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                }
                this.L.addAll(kVar.N);
            }
        }
        if (!kVar.O.isEmpty()) {
            if (this.M.isEmpty()) {
                this.M = kVar.O;
                this.f18312v &= -2049;
            } else {
                if ((this.f18312v & RecyclerView.ItemAnimator.FLAG_MOVED) != 2048) {
                    this.M = new ArrayList(this.M);
                    this.f18312v |= RecyclerView.ItemAnimator.FLAG_MOVED;
                }
                this.M.addAll(kVar.O);
            }
        }
        if (!kVar.P.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = kVar.P;
                this.f18312v &= -4097;
            } else {
                if ((this.f18312v & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                    this.N = new ArrayList(this.N);
                    this.f18312v |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
                this.N.addAll(kVar.P);
            }
        }
        if (!kVar.Q.isEmpty()) {
            if (this.O.isEmpty()) {
                this.O = kVar.Q;
                this.f18312v &= -8193;
            } else {
                if ((this.f18312v & 8192) != 8192) {
                    this.O = new ArrayList(this.O);
                    this.f18312v |= 8192;
                }
                this.O.addAll(kVar.Q);
            }
        }
        if (!kVar.R.isEmpty()) {
            if (this.P.isEmpty()) {
                this.P = kVar.R;
                this.f18312v &= -16385;
            } else {
                if ((this.f18312v & 16384) != 16384) {
                    this.P = new ArrayList(this.P);
                    this.f18312v |= 16384;
                }
                this.P.addAll(kVar.R);
            }
        }
        int i13 = kVar.f18341i;
        if ((i13 & 8) == 8) {
            int i14 = kVar.T;
            this.f18312v |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
            this.Q = i14;
        }
        if ((i13 & 16) == 16) {
            s0 s0Var2 = kVar.U;
            if ((this.f18312v & 65536) != 65536 || (s0Var = this.R) == s0.Q) {
                this.R = s0Var2;
            } else {
                r0 r0VarQ = s0.q(s0Var);
                r0VarQ.j(s0Var2);
                this.R = r0VarQ.g();
            }
            this.f18312v |= 65536;
        }
        if ((kVar.f18341i & 32) == 32) {
            int i15 = kVar.V;
            this.f18312v |= 131072;
            this.S = i15;
        }
        if (!kVar.W.isEmpty()) {
            if (this.T.isEmpty()) {
                this.T = kVar.W;
                this.f18312v &= -262145;
            } else {
                if ((this.f18312v & 262144) != 262144) {
                    this.T = new ArrayList(this.T);
                    this.f18312v |= 262144;
                }
                this.T.addAll(kVar.W);
            }
        }
        if (!kVar.Y.isEmpty()) {
            if (this.U.isEmpty()) {
                this.U = kVar.Y;
                this.f18312v &= -524289;
            } else {
                if ((this.f18312v & 524288) != 524288) {
                    this.U = new ArrayList(this.U);
                    this.f18312v |= 524288;
                }
                this.U.addAll(kVar.Y);
            }
        }
        if (!kVar.Z.isEmpty()) {
            if (this.V.isEmpty()) {
                this.V = kVar.Z;
                this.f18312v &= -1048577;
            } else {
                if ((this.f18312v & 1048576) != 1048576) {
                    this.V = new ArrayList(this.V);
                    this.f18312v |= 1048576;
                }
                this.V.addAll(kVar.Z);
            }
        }
        if ((kVar.f18341i & 64) == 64) {
            y0 y0Var2 = kVar.f18334b0;
            if ((this.f18312v & 2097152) != 2097152 || (y0Var = this.W) == y0.f18496y) {
                this.W = y0Var2;
            } else {
                g gVarI = y0.i(y0Var);
                gVarI.k(y0Var2);
                this.W = gVarI.g();
            }
            this.f18312v |= 2097152;
        }
        if (!kVar.f18335c0.isEmpty()) {
            if (this.X.isEmpty()) {
                this.X = kVar.f18335c0;
                this.f18312v &= -4194305;
            } else {
                if ((this.f18312v & 4194304) != 4194304) {
                    this.X = new ArrayList(this.X);
                    this.f18312v |= 4194304;
                }
                this.X.addAll(kVar.f18335c0);
            }
        }
        if ((kVar.f18341i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            f1 f1Var2 = kVar.f18336d0;
            if ((this.f18312v & 8388608) != 8388608 || (f1Var = this.Y) == f1.f18283w) {
                this.Y = f1Var2;
            } else {
                o oVar = new o(2);
                oVar.f18389v = Collections.EMPTY_LIST;
                oVar.n(f1Var);
                oVar.n(f1Var2);
                this.Y = oVar.j();
            }
            this.f18312v |= 8388608;
        }
        if (!kVar.f18338e0.isEmpty()) {
            if (this.Z.isEmpty()) {
                this.Z = kVar.f18338e0;
                this.f18312v &= -16777217;
            } else {
                if ((this.f18312v & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 16777216) {
                    this.Z = new ArrayList(this.Z);
                    this.f18312v |= PointerEventHelper.X_FLAG_SUPPORTS_HOVER;
                }
                this.Z.addAll(kVar.f18338e0);
            }
        }
        f(kVar);
        this.f21889d = this.f21889d.b(kVar.f18337e);
    }
}
