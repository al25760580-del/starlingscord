package pp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends vp.k {
    public static final k h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final a f18333i0 = new a(3);
    public List E;
    public List F;
    public int G;
    public List H;
    public int I;
    public List J;
    public List K;
    public int L;
    public List M;
    public List N;
    public List O;
    public List P;
    public List Q;
    public List R;
    public int S;
    public int T;
    public s0 U;
    public int V;
    public List W;
    public int X;
    public List Y;
    public List Z;
    public int a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public y0 f18334b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public List f18335c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public f1 f18336d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp.d f18337e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public List f18338e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public byte f18339f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f18340g0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18341i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18344x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f18345y;

    static {
        k kVar = new k();
        h0 = kVar;
        kVar.p();
    }

    public k(i iVar) {
        super(iVar);
        this.G = -1;
        this.I = -1;
        this.L = -1;
        this.S = -1;
        this.X = -1;
        this.a0 = -1;
        this.f18339f0 = (byte) -1;
        this.f18340g0 = -1;
        this.f18337e = iVar.f21889d;
    }

    @Override // vp.u
    public final vp.a a() {
        return h0;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.f18339f0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f18341i & 2) != 2) {
            this.f18339f0 = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f18345y.size(); i7++) {
            if (!((x0) this.f18345y.get(i7)).b()) {
                this.f18339f0 = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            if (!((s0) this.E.get(i10)).b()) {
                this.f18339f0 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.J.size(); i11++) {
            if (!((s0) this.J.get(i11)).b()) {
                this.f18339f0 = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.M.size(); i12++) {
            if (!((n) this.M.get(i12)).b()) {
                this.f18339f0 = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.N.size(); i13++) {
            if (!((a0) this.N.get(i13)).b()) {
                this.f18339f0 = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.O.size(); i14++) {
            if (!((i0) this.O.get(i14)).b()) {
                this.f18339f0 = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.P.size(); i15++) {
            if (!((u0) this.P.get(i15)).b()) {
                this.f18339f0 = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.Q.size(); i16++) {
            if (!((v) this.Q.get(i16)).b()) {
                this.f18339f0 = (byte) 0;
                return false;
            }
        }
        if ((this.f18341i & 16) == 16 && !this.U.b()) {
            this.f18339f0 = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.Y.size(); i17++) {
            if (!((s0) this.Y.get(i17)).b()) {
                this.f18339f0 = (byte) 0;
                return false;
            }
        }
        if ((this.f18341i & 64) == 64 && !this.f18334b0.b()) {
            this.f18339f0 = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f18338e0.size(); i18++) {
            if (!((l) this.f18338e0.get(i18)).b()) {
                this.f18339f0 = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f18339f0 = (byte) 1;
            return true;
        }
        this.f18339f0 = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f18340g0;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18341i & 1) == 1 ? v1.d(1, this.f18342v) : 0;
        int iE = 0;
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            iE += v1.e(((Integer) this.F.get(i10)).intValue());
        }
        int iF = iD + iE;
        if (!this.F.isEmpty()) {
            iF = iF + 1 + v1.e(iE);
        }
        this.G = iE;
        if ((this.f18341i & 2) == 2) {
            iF += v1.d(3, this.f18343w);
        }
        if ((this.f18341i & 4) == 4) {
            iF += v1.d(4, this.f18344x);
        }
        for (int i11 = 0; i11 < this.f18345y.size(); i11++) {
            iF += v1.f(5, (vp.a) this.f18345y.get(i11));
        }
        for (int i12 = 0; i12 < this.E.size(); i12++) {
            iF += v1.f(6, (vp.a) this.E.get(i12));
        }
        int iE2 = 0;
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            iE2 += v1.e(((Integer) this.H.get(i13)).intValue());
        }
        int iF2 = iF + iE2;
        if (!this.H.isEmpty()) {
            iF2 = iF2 + 1 + v1.e(iE2);
        }
        this.I = iE2;
        for (int i14 = 0; i14 < this.M.size(); i14++) {
            iF2 += v1.f(8, (vp.a) this.M.get(i14));
        }
        for (int i15 = 0; i15 < this.N.size(); i15++) {
            iF2 += v1.f(9, (vp.a) this.N.get(i15));
        }
        for (int i16 = 0; i16 < this.O.size(); i16++) {
            iF2 += v1.f(10, (vp.a) this.O.get(i16));
        }
        for (int i17 = 0; i17 < this.P.size(); i17++) {
            iF2 += v1.f(11, (vp.a) this.P.get(i17));
        }
        for (int i18 = 0; i18 < this.Q.size(); i18++) {
            iF2 += v1.f(13, (vp.a) this.Q.get(i18));
        }
        int iE3 = 0;
        for (int i19 = 0; i19 < this.R.size(); i19++) {
            iE3 += v1.e(((Integer) this.R.get(i19)).intValue());
        }
        int iF3 = iF2 + iE3;
        if (!this.R.isEmpty()) {
            iF3 = iF3 + 2 + v1.e(iE3);
        }
        this.S = iE3;
        if ((this.f18341i & 8) == 8) {
            iF3 += v1.d(17, this.T);
        }
        if ((this.f18341i & 16) == 16) {
            iF3 += v1.f(18, this.U);
        }
        if ((this.f18341i & 32) == 32) {
            iF3 += v1.d(19, this.V);
        }
        for (int i20 = 0; i20 < this.J.size(); i20++) {
            iF3 += v1.f(20, (vp.a) this.J.get(i20));
        }
        int iE4 = 0;
        for (int i21 = 0; i21 < this.K.size(); i21++) {
            iE4 += v1.e(((Integer) this.K.get(i21)).intValue());
        }
        int iE5 = iF3 + iE4;
        if (!this.K.isEmpty()) {
            iE5 = iE5 + 2 + v1.e(iE4);
        }
        this.L = iE4;
        int iE6 = 0;
        for (int i22 = 0; i22 < this.W.size(); i22++) {
            iE6 += v1.e(((Integer) this.W.get(i22)).intValue());
        }
        int iF4 = iE5 + iE6;
        if (!this.W.isEmpty()) {
            iF4 = iF4 + 2 + v1.e(iE6);
        }
        this.X = iE6;
        for (int i23 = 0; i23 < this.Y.size(); i23++) {
            iF4 += v1.f(23, (vp.a) this.Y.get(i23));
        }
        int iE7 = 0;
        for (int i24 = 0; i24 < this.Z.size(); i24++) {
            iE7 += v1.e(((Integer) this.Z.get(i24)).intValue());
        }
        int iF5 = iF4 + iE7;
        if (!this.Z.isEmpty()) {
            iF5 = iF5 + 2 + v1.e(iE7);
        }
        this.a0 = iE7;
        if ((this.f18341i & 64) == 64) {
            iF5 += v1.f(30, this.f18334b0);
        }
        int iE8 = 0;
        for (int i25 = 0; i25 < this.f18335c0.size(); i25++) {
            iE8 += v1.e(((Integer) this.f18335c0.get(i25)).intValue());
        }
        int size = (this.f18335c0.size() * 2) + iF5 + iE8;
        if ((this.f18341i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            size += v1.f(32, this.f18336d0);
        }
        for (int i26 = 0; i26 < this.f18338e0.size(); i26++) {
            size += v1.f(33, (vp.a) this.f18338e0.get(i26));
        }
        int size2 = this.f18337e.size() + j() + size;
        this.f18340g0 = size2;
        return size2;
    }

    @Override // vp.a
    public final vp.i d() {
        return i.h();
    }

    @Override // vp.a
    public final vp.i e() {
        i iVarH = i.h();
        iVarH.j(this);
        return iVarH;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        e4.c cVar = new e4.c(this);
        if ((this.f18341i & 1) == 1) {
            v1Var.r(1, this.f18342v);
        }
        if (this.F.size() > 0) {
            v1Var.A(18);
            v1Var.A(this.G);
        }
        for (int i7 = 0; i7 < this.F.size(); i7++) {
            v1Var.s(((Integer) this.F.get(i7)).intValue());
        }
        if ((this.f18341i & 2) == 2) {
            v1Var.r(3, this.f18343w);
        }
        if ((this.f18341i & 4) == 4) {
            v1Var.r(4, this.f18344x);
        }
        for (int i10 = 0; i10 < this.f18345y.size(); i10++) {
            v1Var.t(5, (vp.a) this.f18345y.get(i10));
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            v1Var.t(6, (vp.a) this.E.get(i11));
        }
        if (this.H.size() > 0) {
            v1Var.A(58);
            v1Var.A(this.I);
        }
        for (int i12 = 0; i12 < this.H.size(); i12++) {
            v1Var.s(((Integer) this.H.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.M.size(); i13++) {
            v1Var.t(8, (vp.a) this.M.get(i13));
        }
        for (int i14 = 0; i14 < this.N.size(); i14++) {
            v1Var.t(9, (vp.a) this.N.get(i14));
        }
        for (int i15 = 0; i15 < this.O.size(); i15++) {
            v1Var.t(10, (vp.a) this.O.get(i15));
        }
        for (int i16 = 0; i16 < this.P.size(); i16++) {
            v1Var.t(11, (vp.a) this.P.get(i16));
        }
        for (int i17 = 0; i17 < this.Q.size(); i17++) {
            v1Var.t(13, (vp.a) this.Q.get(i17));
        }
        if (this.R.size() > 0) {
            v1Var.A(130);
            v1Var.A(this.S);
        }
        for (int i18 = 0; i18 < this.R.size(); i18++) {
            v1Var.s(((Integer) this.R.get(i18)).intValue());
        }
        if ((this.f18341i & 8) == 8) {
            v1Var.r(17, this.T);
        }
        if ((this.f18341i & 16) == 16) {
            v1Var.t(18, this.U);
        }
        if ((this.f18341i & 32) == 32) {
            v1Var.r(19, this.V);
        }
        for (int i19 = 0; i19 < this.J.size(); i19++) {
            v1Var.t(20, (vp.a) this.J.get(i19));
        }
        if (this.K.size() > 0) {
            v1Var.A(170);
            v1Var.A(this.L);
        }
        for (int i20 = 0; i20 < this.K.size(); i20++) {
            v1Var.s(((Integer) this.K.get(i20)).intValue());
        }
        if (this.W.size() > 0) {
            v1Var.A(178);
            v1Var.A(this.X);
        }
        for (int i21 = 0; i21 < this.W.size(); i21++) {
            v1Var.s(((Integer) this.W.get(i21)).intValue());
        }
        for (int i22 = 0; i22 < this.Y.size(); i22++) {
            v1Var.t(23, (vp.a) this.Y.get(i22));
        }
        if (this.Z.size() > 0) {
            v1Var.A(194);
            v1Var.A(this.a0);
        }
        for (int i23 = 0; i23 < this.Z.size(); i23++) {
            v1Var.s(((Integer) this.Z.get(i23)).intValue());
        }
        if ((this.f18341i & 64) == 64) {
            v1Var.t(30, this.f18334b0);
        }
        for (int i24 = 0; i24 < this.f18335c0.size(); i24++) {
            v1Var.r(31, ((Integer) this.f18335c0.get(i24)).intValue());
        }
        if ((this.f18341i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            v1Var.t(32, this.f18336d0);
        }
        for (int i25 = 0; i25 < this.f18338e0.size(); i25++) {
            v1Var.t(33, (vp.a) this.f18338e0.get(i25));
        }
        cVar.W(19000, v1Var);
        v1Var.w(this.f18337e);
    }

    public final void p() {
        this.f18342v = 6;
        this.f18343w = 0;
        this.f18344x = 0;
        List list = Collections.EMPTY_LIST;
        this.f18345y = list;
        this.E = list;
        this.F = list;
        this.H = list;
        this.J = list;
        this.K = list;
        this.M = list;
        this.N = list;
        this.O = list;
        this.P = list;
        this.Q = list;
        this.R = list;
        this.T = 0;
        this.U = s0.Q;
        this.V = 0;
        this.W = list;
        this.Y = list;
        this.Z = list;
        this.f18334b0 = y0.f18496y;
        this.f18335c0 = list;
        this.f18336d0 = f1.f18283w;
        this.f18338e0 = list;
    }

    public k() {
        this.G = -1;
        this.I = -1;
        this.L = -1;
        this.S = -1;
        this.X = -1;
        this.a0 = -1;
        this.f18339f0 = (byte) -1;
        this.f18340g0 = -1;
        this.f18337e = vp.d.f21871d;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public k(vp.e r23, vp.g r24) {
        /*
            Method dump skipped, instruction units count: 1854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.k.<init>(vp.e, vp.g):void");
    }
}
