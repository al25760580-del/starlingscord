package gc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements Handler.Callback, md.p {
    public final je.a0 E;
    public final HandlerThread F;
    public final Looper G;
    public final v1 H;
    public final u1 I;
    public final long J;
    public final k K;
    public final ArrayList L;
    public final je.y M;
    public final r N;
    public final x0 O;
    public final g1 P;
    public final i Q;
    public final long R;
    public q1 S;
    public j1 T;
    public b0 U;
    public boolean V;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f9608b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f9609c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e[] f9610d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f9611d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f9612e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f9613e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f9614f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public d0 f9615g0;
    public long h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e[] f9616i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f9617i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f9618j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public com.google.android.exoplayer2.b f9619k0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final fe.r f9621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final fe.u f9622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j f9623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final he.g f9624y;
    public boolean W = false;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f9620l0 = -9223372036854775807L;

    public e0(e[] eVarArr, fe.r rVar, fe.u uVar, j jVar, he.g gVar, int i7, boolean z5, hc.a aVar, q1 q1Var, i iVar, long j, Looper looper, je.y yVar, r rVar2, hc.c0 c0Var) {
        this.N = rVar2;
        this.f9610d = eVarArr;
        this.f9621v = rVar;
        this.f9622w = uVar;
        this.f9623x = jVar;
        this.f9624y = gVar;
        this.a0 = i7;
        this.f9608b0 = z5;
        this.S = q1Var;
        this.Q = iVar;
        this.R = j;
        this.M = yVar;
        this.J = jVar.f9706h;
        jVar.getClass();
        j1 j1VarI = j1.i(uVar);
        this.T = j1VarI;
        this.U = new b0(j1VarI);
        this.f9616i = new e[eVarArr.length];
        DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) rVar;
        defaultTrackSelector.getClass();
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            e eVar = eVarArr[i10];
            eVar.f9605w = i10;
            eVar.f9606x = c0Var;
            this.f9616i[i10] = eVar;
            synchronized (eVar.f9601d) {
                eVar.K = defaultTrackSelector;
            }
        }
        this.K = new k(this, yVar);
        this.L = new ArrayList();
        this.f9612e = Collections.newSetFromMap(new IdentityHashMap());
        this.H = new v1();
        this.I = new u1();
        rVar.f9114a = this;
        rVar.f9115b = gVar;
        this.f9618j0 = true;
        je.a0 a0VarA = yVar.a(looper, null);
        this.O = new x0(aVar, a0VarA);
        this.P = new g1(this, aVar, a0VarA, c0Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.F = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.G = looper2;
        this.E = yVar.a(looper2, this);
    }

    public static Pair E(Timeline timeline, d0 d0Var, boolean z5, int i7, boolean z6, v1 v1Var, u1 u1Var) {
        Object objF;
        Timeline timeline2 = d0Var.f9591a;
        if (timeline.p()) {
            return null;
        }
        Timeline timeline3 = timeline2.p() ? timeline : timeline2;
        try {
            Pair pairI = timeline3.i(v1Var, u1Var, d0Var.f9592b, d0Var.f9593c);
            if (!timeline.equals(timeline3)) {
                if (timeline.b(pairI.first) == -1) {
                    if (!z5 || (objF = F(v1Var, u1Var, i7, z6, pairI.first, timeline3, timeline)) == null) {
                        return null;
                    }
                    return timeline.i(v1Var, u1Var, timeline.g(objF, u1Var).f9888i, -9223372036854775807L);
                }
                if (timeline3.g(pairI.first, u1Var).f9891x && timeline3.m(u1Var.f9888i, v1Var, 0L).L == timeline3.b(pairI.first)) {
                    return timeline.i(v1Var, u1Var, timeline.g(pairI.first, u1Var).f9888i, d0Var.f9593c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object F(v1 v1Var, u1 u1Var, int i7, boolean z5, Object obj, Timeline timeline, Timeline timeline2) {
        int iB = timeline.b(obj);
        int iH = timeline.h();
        int i10 = 0;
        int iD = iB;
        int iB2 = -1;
        while (i10 < iH && iB2 == -1) {
            v1 v1Var2 = v1Var;
            u1 u1Var2 = u1Var;
            int i11 = i7;
            boolean z6 = z5;
            Timeline timeline3 = timeline;
            iD = timeline3.d(iD, u1Var2, v1Var2, i11, z6);
            if (iD == -1) {
                break;
            }
            iB2 = timeline2.b(timeline3.l(iD));
            i10++;
            timeline = timeline3;
            u1Var = u1Var2;
            v1Var = v1Var2;
            i7 = i11;
            z5 = z6;
        }
        if (iB2 == -1) {
            return null;
        }
        return timeline2.l(iB2);
    }

    public static void L(e eVar, long j) {
        eVar.I = true;
        if (eVar instanceof vd.k) {
            vd.k kVar = (vd.k) eVar;
            je.b.k(kVar.I);
            kVar.Z = j;
        }
    }

    public static boolean q(e eVar) {
        return eVar.f9607y != 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[PHI: r4 r5 r7
      0x00c3: PHI (r4v4 md.s) = (r4v3 md.s), (r4v11 md.s) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r5v2 long) = (r5v1 long), (r5v17 long) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r7v3 long) = (r7v2 long), (r7v14 long) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    public final void A(boolean z5, boolean z6, boolean z7, boolean z10) {
        long j;
        boolean z11;
        md.s sVar;
        Timeline timeline;
        List list;
        this.E.f13757a.removeMessages(2);
        this.f9619k0 = null;
        this.Y = false;
        k kVar = this.K;
        kVar.f9732e = false;
        io.sentry.android.core.r rVar = (io.sentry.android.core.r) kVar.f9733i;
        if (rVar.f12391d) {
            rVar.c(rVar.a());
            rVar.f12391d = false;
        }
        this.h0 = 1000000000000L;
        for (e eVar : this.f9610d) {
            try {
                b(eVar);
            } catch (com.google.android.exoplayer2.b | RuntimeException e10) {
                je.b.s("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z5) {
            for (e eVar2 : this.f9610d) {
                if (this.f9612e.remove(eVar2)) {
                    try {
                        eVar2.w();
                    } catch (RuntimeException e11) {
                        je.b.s("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.f9614f0 = 0;
        j1 j1Var = this.T;
        md.s sVar2 = j1Var.f9715b;
        long jLongValue = j1Var.f9729r;
        if (this.T.f9715b.a()) {
            j = this.T.f9716c;
        } else {
            j1 j1Var2 = this.T;
            u1 u1Var = this.I;
            md.s sVar3 = j1Var2.f9715b;
            Timeline timeline2 = j1Var2.f9714a;
            if (timeline2.p() || timeline2.g(sVar3.f15689a, u1Var).f9891x) {
                j = this.T.f9716c;
            } else {
                j = this.T.f9729r;
            }
        }
        if (z6) {
            this.f9615g0 = null;
            Pair pairH = h(this.T.f9714a);
            sVar2 = (md.s) pairH.first;
            jLongValue = ((Long) pairH.second).longValue();
            j = -9223372036854775807L;
            if (sVar2.equals(this.T.f9715b)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        long j5 = jLongValue;
        long j7 = j;
        this.O.b();
        this.Z = false;
        Timeline timeline3 = this.T.f9714a;
        if (z7 && (timeline3 instanceof n1)) {
            n1 n1Var = (n1) timeline3;
            md.r0 r0Var = (md.r0) this.P.k;
            Timeline[] timelineArr = n1Var.E;
            Timeline[] timelineArr2 = new Timeline[timelineArr.length];
            for (int i7 = 0; i7 < timelineArr.length; i7++) {
                timelineArr2[i7] = new m1(timelineArr[i7]);
            }
            n1 n1Var2 = new n1(timelineArr2, n1Var.F, r0Var);
            if (sVar2.f15690b != -1) {
                n1Var2.g(sVar2.f15689a, this.I);
                int i10 = this.I.f9888i;
                v1 v1Var = this.H;
                n1Var2.m(i10, v1Var, 0L);
                if (v1Var.a()) {
                    timeline = n1Var2;
                    sVar = new md.s(sVar2.f15692d, sVar2.f15689a);
                } else {
                    timeline = n1Var2;
                    sVar = sVar2;
                }
            } else {
                timeline = n1Var2;
                sVar = sVar2;
            }
        } else {
            sVar = sVar2;
            timeline = timeline3;
        }
        j1 j1Var3 = this.T;
        int i11 = j1Var3.f9718e;
        com.google.android.exoplayer2.b bVar = z10 ? null : j1Var3.f9719f;
        md.y0 y0Var = z11 ? md.y0.f15735v : j1Var3.f9721h;
        fe.u uVar = z11 ? this.f9622w : j1Var3.f9722i;
        if (z11) {
            ei.c0 c0Var = ei.e0.f8303e;
            list = ei.r0.f8352w;
        } else {
            list = j1Var3.j;
        }
        this.T = new j1(timeline, sVar, j7, j5, i11, bVar, false, y0Var, uVar, list, sVar, j1Var3.f9723l, j1Var3.f9724m, j1Var3.f9725n, j5, 0L, j5, 0L, false);
        if (z7) {
            g1 g1Var = this.P;
            HashMap map = (HashMap) g1Var.f9664f;
            for (e1 e1Var : map.values()) {
                try {
                    e1Var.f9625a.r(e1Var.f9626b);
                } catch (RuntimeException e12) {
                    je.b.s("MediaSourceList", "Failed to release child source.", e12);
                }
                md.a aVar = e1Var.f9625a;
                e4.c cVar = e1Var.f9627c;
                aVar.u(cVar);
                e1Var.f9625a.t(cVar);
            }
            map.clear();
            ((HashSet) g1Var.f9666h).clear();
            g1Var.f9659a = false;
        }
    }

    public final void B() {
        v0 v0Var = this.O.f9944h;
        this.X = v0Var != null && v0Var.f9898f.f9924h && this.W;
    }

    public final void C(long j) {
        v0 v0Var = this.O.f9944h;
        long j5 = j + (v0Var == null ? 1000000000000L : v0Var.f9905o);
        this.h0 = j5;
        ((io.sentry.android.core.r) this.K.f9733i).c(j5);
        for (e eVar : this.f9610d) {
            if (q(eVar)) {
                long j7 = this.h0;
                eVar.I = false;
                eVar.H = j7;
                eVar.n(j7, false);
            }
        }
        for (v0 v0Var2 = r0.f9944h; v0Var2 != null; v0Var2 = v0Var2.f9902l) {
            for (fe.p pVar : v0Var2.f9904n.f9147c) {
                if (pVar != null) {
                    pVar.q();
                }
            }
        }
    }

    public final void D(Timeline timeline, Timeline timeline2) {
        if (timeline.p() && timeline2.p()) {
            return;
        }
        ArrayList arrayList = this.L;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a3.e.x(arrayList.get(size));
            throw null;
        }
    }

    public final void G(boolean z5) throws com.google.android.exoplayer2.b {
        md.s sVar = this.O.f9944h.f9898f.f9917a;
        long jI = I(sVar, this.T.f9729r, true, false);
        if (jI != this.T.f9729r) {
            j1 j1Var = this.T;
            this.T = o(sVar, jI, j1Var.f9716c, j1Var.f9717d, z5, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00ce, B:44:0x00d6), top: B:98:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00ce, B:44:0x00d6), top: B:98:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00ce, B:44:0x00d6), top: B:98:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00ce, B:44:0x00d6), top: B:98:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0125  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:0x0135  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, md.q] */
    public final void H(d0 d0Var) throws Throwable {
        long jLongValue;
        md.s sVarN;
        long j;
        boolean z5;
        long j5;
        long j7;
        v0 v0Var;
        long jA;
        j1 j1Var;
        int i7;
        long j10;
        md.s sVar;
        int i10;
        long j11;
        boolean z6;
        x0 x0Var;
        boolean z7;
        long jI;
        boolean z10;
        md.s sVar2;
        long j12;
        e0 e0Var = this;
        e0Var.U.a(1);
        Pair pairE = E(e0Var.T.f9714a, d0Var, true, e0Var.a0, e0Var.f9608b0, e0Var.H, e0Var.I);
        try {
            if (pairE != null) {
                Object obj = pairE.first;
                jLongValue = ((Long) pairE.second).longValue();
                long j13 = d0Var.f9593c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                sVarN = e0Var.O.n(e0Var.T.f9714a, obj, jLongValue);
                if (sVarN.a()) {
                    e0Var.T.f9714a.g(sVarN.f15689a, e0Var.I);
                    jLongValue = e0Var.I.f(sVarN.f15690b) == sVarN.f15691c ? e0Var.I.f9892y.f16558e : 0L;
                    z5 = true;
                    j5 = j13;
                } else {
                    j = 0;
                    z5 = d0Var.f9593c == -9223372036854775807L;
                    j5 = j13;
                }
                if (e0Var.T.f9714a.p()) {
                    if (pairE == null) {
                        if (e0Var.T.f9718e != 1) {
                            e0Var.V(4);
                        }
                        e0Var.A(false, true, false, true);
                    } else {
                        if (sVarN.equals(e0Var.T.f9715b)) {
                            try {
                                v0Var = e0Var.O.f9944h;
                                if (v0Var == null && v0Var.f9896d && jLongValue != j) {
                                    jA = v0Var.f9893a.a(jLongValue, e0Var.S);
                                } else {
                                    jA = jLongValue;
                                }
                                if (je.e0.U(jA) != je.e0.U(e0Var.T.f9729r) && ((i7 = (j1Var = e0Var.T).f9718e) == 2 || i7 == 3)) {
                                    j10 = j1Var.f9729r;
                                    z5 = z5;
                                    sVar = sVarN;
                                    i10 = 2;
                                    j11 = j10;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sVarN = sVarN;
                                j7 = jLongValue;
                                e0Var.T = e0Var.o(sVarN, j7, j5, j7, z5, 2);
                                throw th;
                            }
                        } else {
                            jA = jLongValue;
                        }
                        try {
                            if (e0Var.T.f9718e == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            x0Var = e0Var.O;
                            if (x0Var.f9944h != x0Var.f9945i) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            jI = e0Var.I(sVarN, jA, z7, z6);
                            if (jLongValue != jI) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z5 |= z10;
                            try {
                                j1 j1Var2 = e0Var.T;
                                sVar2 = sVarN;
                                try {
                                    Timeline timeline = j1Var2.f9714a;
                                    j12 = j5;
                                    try {
                                        e0Var.e0(timeline, sVar2, timeline, j1Var2.f9715b, j12, true);
                                        sVar = sVar2;
                                        j5 = j12;
                                        j10 = jI;
                                        i10 = 2;
                                        j11 = j10;
                                        e0Var = this;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sVarN = sVar2;
                                        j5 = j12;
                                        j7 = jI;
                                        e0Var.T = e0Var.o(sVarN, j7, j5, j7, z5, 2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    sVarN = sVar2;
                                    j5 = j5;
                                    j7 = jI;
                                    e0Var.T = e0Var.o(sVarN, j7, j5, j7, z5, 2);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            j5 = j5;
                            j7 = jLongValue;
                            e0Var.T = e0Var.o(sVarN, j7, j5, j7, z5, 2);
                            throw th;
                        }
                    }
                    e0Var.T = e0Var.o(sVar, j10, j5, j11, z5, i10);
                    return;
                }
                e0Var.f9615g0 = d0Var;
                z5 = z5;
                sVar = sVarN;
                j10 = jLongValue;
                i10 = 2;
                j11 = j10;
                e0Var = this;
                e0Var.T = e0Var.o(sVar, j10, j5, j11, z5, i10);
                return;
            }
            Pair pairH = e0Var.h(e0Var.T.f9714a);
            sVarN = (md.s) pairH.first;
            jLongValue = ((Long) pairH.second).longValue();
            z5 = !e0Var.T.f9714a.p();
            j5 = -9223372036854775807L;
            if (e0Var.T.f9714a.p()) {
                if (pairE == null) {
                    if (e0Var.T.f9718e != 1) {
                        e0Var.V(4);
                    }
                    e0Var.A(false, true, false, true);
                } else {
                    if (sVarN.equals(e0Var.T.f9715b)) {
                        v0Var = e0Var.O.f9944h;
                        if (v0Var == null) {
                            jA = jLongValue;
                        } else {
                            jA = jLongValue;
                        }
                        if (je.e0.U(jA) != je.e0.U(e0Var.T.f9729r)) {
                        }
                    } else {
                        jA = jLongValue;
                    }
                    if (e0Var.T.f9718e == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    x0Var = e0Var.O;
                    if (x0Var.f9944h != x0Var.f9945i) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    jI = e0Var.I(sVarN, jA, z7, z6);
                    if (jLongValue != jI) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z5 |= z10;
                    j1 j1Var3 = e0Var.T;
                    sVar2 = sVarN;
                    Timeline timeline2 = j1Var3.f9714a;
                    j12 = j5;
                    e0Var.e0(timeline2, sVar2, timeline2, j1Var3.f9715b, j12, true);
                    sVar = sVar2;
                    j5 = j12;
                    j10 = jI;
                    i10 = 2;
                    j11 = j10;
                    e0Var = this;
                }
                e0Var.T = e0Var.o(sVar, j10, j5, j11, z5, i10);
                return;
            }
            e0Var.f9615g0 = d0Var;
            z5 = z5;
            sVar = sVarN;
            j10 = jLongValue;
            i10 = 2;
            j11 = j10;
            e0Var = this;
            e0Var.T = e0Var.o(sVar, j10, j5, j11, z5, i10);
            return;
        } catch (Throwable th7) {
            th = th7;
        }
        j = 0;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, md.q] */
    public final long I(md.s sVar, long j, boolean z5, boolean z6) throws com.google.android.exoplayer2.b {
        a0();
        this.Y = false;
        if (z6 || this.T.f9718e == 3) {
            V(2);
        }
        x0 x0Var = this.O;
        v0 v0Var = x0Var.f9944h;
        v0 v0Var2 = v0Var;
        while (v0Var2 != null && !sVar.equals(v0Var2.f9898f.f9917a)) {
            v0Var2 = v0Var2.f9902l;
        }
        if (z5 || v0Var != v0Var2 || (v0Var2 != null && v0Var2.f9905o + j < 0)) {
            e[] eVarArr = this.f9610d;
            for (e eVar : eVarArr) {
                b(eVar);
            }
            if (v0Var2 != null) {
                while (x0Var.f9944h != v0Var2) {
                    x0Var.a();
                }
                x0Var.l(v0Var2);
                v0Var2.f9905o = 1000000000000L;
                f(new boolean[eVarArr.length]);
            }
        }
        if (v0Var2 != null) {
            ?? r10 = v0Var2.f9893a;
            x0Var.l(v0Var2);
            if (!v0Var2.f9896d) {
                v0Var2.f9898f = v0Var2.f9898f.b(j);
            } else if (v0Var2.f9897e) {
                j = r10.v(j);
                r10.w(j - this.J);
            }
            C(j);
            s();
        } else {
            x0Var.b();
            C(j);
        }
        k(false);
        this.E.d(2);
        return j;
    }

    public final void J(l1 l1Var) {
        je.a0 a0Var = this.E;
        if (l1Var.f9752f != this.G) {
            a0Var.a(15, l1Var).b();
            return;
        }
        synchronized (l1Var) {
        }
        try {
            l1Var.f9747a.c(l1Var.f9750d, l1Var.f9751e);
            l1Var.b(true);
            int i7 = this.T.f9718e;
            if (i7 == 3 || i7 == 2) {
                a0Var.d(2);
            }
        } catch (Throwable th2) {
            l1Var.b(true);
            throw th2;
        }
    }

    public final void K(l1 l1Var) {
        Looper looper = l1Var.f9752f;
        if (looper.getThread().isAlive()) {
            this.M.a(looper, null).c(new com.google.firebase.messaging.s(this, l1Var));
        } else {
            je.b.N("TAG", "Trying to send message on a dead thread.");
            l1Var.b(false);
        }
    }

    public final void M(boolean z5, AtomicBoolean atomicBoolean) {
        if (this.f9609c0 != z5) {
            this.f9609c0 = z5;
            if (!z5) {
                for (e eVar : this.f9610d) {
                    if (!q(eVar) && this.f9612e.remove(eVar)) {
                        eVar.w();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void N(a0 a0Var) throws Throwable {
        this.U.a(1);
        int i7 = a0Var.f9554c;
        md.r0 r0Var = a0Var.f9553b;
        ArrayList arrayList = a0Var.f9552a;
        if (i7 != -1) {
            this.f9615g0 = new d0(new n1(arrayList, r0Var), a0Var.f9554c, a0Var.f9555d);
        }
        g1 g1Var = this.P;
        ArrayList arrayList2 = (ArrayList) g1Var.f9661c;
        g1Var.i(0, arrayList2.size());
        l(g1Var.a(arrayList2.size(), arrayList, r0Var), false);
    }

    public final void O(boolean z5) {
        if (z5 == this.f9613e0) {
            return;
        }
        this.f9613e0 = z5;
        if (z5 || !this.T.f9726o) {
            return;
        }
        this.E.d(2);
    }

    public final void P(boolean z5) throws com.google.android.exoplayer2.b {
        this.W = z5;
        B();
        if (this.X) {
            x0 x0Var = this.O;
            if (x0Var.f9945i != x0Var.f9944h) {
                G(true);
                k(false);
            }
        }
    }

    public final void Q(int i7, int i10, boolean z5, boolean z6) {
        this.U.a(z6 ? 1 : 0);
        b0 b0Var = this.U;
        b0Var.f9564a = true;
        b0Var.f9569f = true;
        b0Var.f9570g = i10;
        this.T = this.T.d(i7, z5);
        this.Y = false;
        for (v0 v0Var = this.O.f9944h; v0Var != null; v0Var = v0Var.f9902l) {
            for (fe.p pVar : v0Var.f9904n.f9147c) {
                if (pVar != null) {
                    pVar.e(z5);
                }
            }
        }
        if (!W()) {
            a0();
            d0();
            return;
        }
        int i11 = this.T.f9718e;
        je.a0 a0Var = this.E;
        if (i11 == 3) {
            Y();
            a0Var.d(2);
        } else if (i11 == 2) {
            a0Var.d(2);
        }
    }

    public final void R(PlaybackParameters playbackParameters) {
        this.E.f13757a.removeMessages(16);
        k kVar = this.K;
        kVar.d(playbackParameters);
        PlaybackParameters playbackParametersB = kVar.b();
        n(playbackParametersB, playbackParametersB.f5574d, true, true);
    }

    public final void S(int i7) throws com.google.android.exoplayer2.b {
        this.a0 = i7;
        Timeline timeline = this.T.f9714a;
        x0 x0Var = this.O;
        x0Var.f9942f = i7;
        if (!x0Var.o(timeline)) {
            G(true);
        }
        k(false);
    }

    public final void T(boolean z5) throws com.google.android.exoplayer2.b {
        this.f9608b0 = z5;
        Timeline timeline = this.T.f9714a;
        x0 x0Var = this.O;
        x0Var.f9943g = z5;
        if (!x0Var.o(timeline)) {
            G(true);
        }
        k(false);
    }

    public final void U(md.r0 r0Var) throws Throwable {
        this.U.a(1);
        g1 g1Var = this.P;
        int size = ((ArrayList) g1Var.f9661c).size();
        if (r0Var.f15695b.length != size) {
            r0Var = new md.r0(new Random(r0Var.f15694a.nextLong())).a(size);
        }
        g1Var.k = r0Var;
        l(g1Var.c(), false);
    }

    public final void V(int i7) {
        j1 j1Var = this.T;
        if (j1Var.f9718e != i7) {
            if (i7 != 2) {
                this.f9620l0 = -9223372036854775807L;
            }
            this.T = j1Var.g(i7);
        }
    }

    public final boolean W() {
        j1 j1Var = this.T;
        return j1Var.f9723l && j1Var.f9724m == 0;
    }

    public final boolean X(Timeline timeline, md.s sVar) {
        if (sVar.a() || timeline.p()) {
            return false;
        }
        int i7 = timeline.g(sVar.f15689a, this.I).f9888i;
        v1 v1Var = this.H;
        timeline.n(i7, v1Var);
        return v1Var.a() && v1Var.F && v1Var.f9914x != -9223372036854775807L;
    }

    public final void Y() {
        this.Y = false;
        k kVar = this.K;
        kVar.f9732e = true;
        ((io.sentry.android.core.r) kVar.f9733i).e();
        for (e eVar : this.f9610d) {
            if (q(eVar)) {
                je.b.k(eVar.f9607y == 1);
                eVar.f9607y = 2;
                eVar.q();
            }
        }
    }

    public final void Z(boolean z5, boolean z6) {
        A(z5 || !this.f9609c0, false, true, false);
        this.U.a(z6 ? 1 : 0);
        this.f9623x.b(true);
        V(1);
    }

    public final void a(a0 a0Var, int i7) throws Throwable {
        this.U.a(1);
        g1 g1Var = this.P;
        if (i7 == -1) {
            i7 = ((ArrayList) g1Var.f9661c).size();
        }
        l(g1Var.a(i7, a0Var.f9552a, a0Var.f9553b), false);
    }

    public final void a0() {
        int i7;
        k kVar = this.K;
        kVar.f9732e = false;
        io.sentry.android.core.r rVar = (io.sentry.android.core.r) kVar.f9733i;
        if (rVar.f12391d) {
            rVar.c(rVar.a());
            rVar.f12391d = false;
        }
        for (e eVar : this.f9610d) {
            if (q(eVar) && (i7 = eVar.f9607y) == 2) {
                je.b.k(i7 == 2);
                eVar.f9607y = 1;
                eVar.r();
            }
        }
    }

    public final void b(e eVar) {
        if (q(eVar)) {
            k kVar = this.K;
            if (eVar == ((e) kVar.f9735w)) {
                kVar.f9736x = null;
                kVar.f9735w = null;
                kVar.f9731d = true;
            }
            int i7 = eVar.f9607y;
            if (i7 == 2) {
                je.b.k(i7 == 2);
                eVar.f9607y = 1;
                eVar.r();
            }
            je.b.k(eVar.f9607y == 1);
            eVar.f9603i.y();
            eVar.f9607y = 0;
            eVar.E = null;
            eVar.F = null;
            eVar.I = false;
            eVar.l();
            this.f9614f0--;
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, md.q0] */
    public final void b0() {
        v0 v0Var = this.O.j;
        boolean z5 = this.Z || (v0Var != null && v0Var.f9893a.C());
        j1 j1Var = this.T;
        if (z5 != j1Var.f9720g) {
            this.T = new j1(j1Var.f9714a, j1Var.f9715b, j1Var.f9716c, j1Var.f9717d, j1Var.f9718e, j1Var.f9719f, z5, j1Var.f9721h, j1Var.f9722i, j1Var.j, j1Var.k, j1Var.f9723l, j1Var.f9724m, j1Var.f9725n, j1Var.f9727p, j1Var.f9728q, j1Var.f9729r, j1Var.f9730s, j1Var.f9726o);
        }
    }

    @Override // md.p0
    public final void c(md.q0 q0Var) {
        this.E.a(9, (md.q) q0Var).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void c0(fe.u uVar) {
        Timeline timeline = this.T.f9714a;
        fe.p[] pVarArr = uVar.f9147c;
        j jVar = this.f9623x;
        int iMax = jVar.f9704f;
        if (iMax == -1) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                e[] eVarArr = this.f9610d;
                int i11 = 13107200;
                if (i7 < eVarArr.length) {
                    if (pVarArr[i7] != null) {
                        switch (eVarArr[i7].f9602e) {
                            case 0:
                                i11 = 144310272;
                                i10 += i11;
                                break;
                            case 1:
                                i10 += i11;
                                break;
                            case 2:
                                i11 = 131072000;
                                i10 += i11;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i11 = 131072;
                                i10 += i11;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i7++;
                } else {
                    iMax = Math.max(13107200, i10);
                }
            }
        }
        jVar.f9707i = iMax;
        jVar.f9699a.a(iMax);
    }

    @Override // md.p
    public final void d(md.q qVar) {
        this.E.a(8, qVar).b();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, md.q] */
    public final void d0() {
        PlaybackParameters playbackParametersB;
        char c8;
        long jMax;
        v0 v0Var = this.O.f9944h;
        if (v0Var == null) {
            return;
        }
        long jI = v0Var.f9896d ? v0Var.f9893a.I() : -9223372036854775807L;
        if (jI != -9223372036854775807L) {
            C(jI);
            if (jI != this.T.f9729r) {
                j1 j1Var = this.T;
                this.T = o(j1Var.f9715b, jI, j1Var.f9716c, jI, true, 5);
            }
        } else {
            k kVar = this.K;
            boolean z5 = v0Var != this.O.f9945i;
            io.sentry.android.core.r rVar = (io.sentry.android.core.r) kVar.f9733i;
            e eVar = (e) kVar.f9735w;
            if (eVar == null || eVar.j() || (!((e) kVar.f9735w).k() && (z5 || ((e) kVar.f9735w).i()))) {
                kVar.f9731d = true;
                if (kVar.f9732e) {
                    rVar.e();
                }
            } else {
                je.n nVar = (je.n) kVar.f9736x;
                nVar.getClass();
                long jA = nVar.a();
                if (!kVar.f9731d) {
                    rVar.c(jA);
                    playbackParametersB = nVar.b();
                    if (!playbackParametersB.equals((PlaybackParameters) rVar.f12395w)) {
                        rVar.d(playbackParametersB);
                        ((e0) kVar.f9734v).E.a(16, playbackParametersB).b();
                    }
                } else if (jA >= rVar.a()) {
                    kVar.f9731d = false;
                    if (kVar.f9732e) {
                        rVar.e();
                    }
                    rVar.c(jA);
                    playbackParametersB = nVar.b();
                    if (!playbackParametersB.equals((PlaybackParameters) rVar.f12395w)) {
                        rVar.d(playbackParametersB);
                        ((e0) kVar.f9734v).E.a(16, playbackParametersB).b();
                    }
                } else if (rVar.f12391d) {
                    rVar.c(rVar.a());
                    rVar.f12391d = false;
                }
            }
            long jA2 = kVar.a();
            this.h0 = jA2;
            long j = jA2 - v0Var.f9905o;
            long j5 = this.T.f9729r;
            if (!this.L.isEmpty() && !this.T.f9715b.a()) {
                if (this.f9618j0) {
                    this.f9618j0 = false;
                }
                j1 j1Var2 = this.T;
                j1Var2.f9714a.b(j1Var2.f9715b.f15689a);
                int iMin = Math.min(this.f9617i0, this.L.size());
                if (iMin > 0 && this.L.get(iMin - 1) != null) {
                    throw new ClassCastException();
                }
                if (iMin < this.L.size() && this.L.get(iMin) != null) {
                    throw new ClassCastException();
                }
                this.f9617i0 = iMin;
            }
            j1 j1Var3 = this.T;
            j1Var3.f9729r = j;
            j1Var3.f9730s = SystemClock.elapsedRealtime();
        }
        this.T.f9727p = this.O.j.d();
        j1 j1Var4 = this.T;
        long j7 = j1Var4.f9727p;
        v0 v0Var2 = this.O.j;
        j1Var4.f9728q = v0Var2 == null ? 0L : Math.max(0L, j7 - (this.h0 - v0Var2.f9905o));
        j1 j1Var5 = this.T;
        if (j1Var5.f9723l && j1Var5.f9718e == 3 && X(j1Var5.f9714a, j1Var5.f9715b)) {
            j1 j1Var6 = this.T;
            float f2 = 1.0f;
            if (j1Var6.f9725n.f5574d == 1.0f) {
                i iVar = this.Q;
                long jG = g(j1Var6.f9714a, j1Var6.f9715b.f15689a, j1Var6.f9729r);
                long j10 = this.T.f9727p;
                v0 v0Var3 = this.O.j;
                if (v0Var3 == null) {
                    jMax = 0;
                    c8 = 1;
                } else {
                    c8 = 1;
                    jMax = Math.max(0L, j10 - (this.h0 - v0Var3.f9905o));
                }
                if (iVar.f9683c != r10) {
                    long j11 = jG - jMax;
                    long j12 = iVar.f9691m;
                    if (j12 == r10) {
                        iVar.f9691m = j11;
                        iVar.f9692n = 0L;
                    } else {
                        long jMax2 = Math.max(j11, (long) ((j11 * 9.999871E-4f) + (j12 * 0.999f)));
                        iVar.f9691m = jMax2;
                        iVar.f9692n = (long) ((9.999871E-4f * Math.abs(j11 - jMax2)) + (0.999f * iVar.f9692n));
                    }
                    if (iVar.f9690l == r10 || SystemClock.elapsedRealtime() - iVar.f9690l >= 1000) {
                        iVar.f9690l = SystemClock.elapsedRealtime();
                        long j13 = (iVar.f9692n * 3) + iVar.f9691m;
                        if (iVar.f9688h > j13) {
                            float fI = je.e0.I(1000L);
                            long j14 = ((long) ((iVar.k - 1.0f) * fI)) + ((long) ((iVar.f9689i - 1.0f) * fI));
                            long j15 = iVar.f9685e;
                            long j16 = iVar.f9688h - j14;
                            long[] jArr = new long[3];
                            jArr[r14] = j13;
                            jArr[c8] = j15;
                            jArr[2] = j16;
                            iVar.f9688h = sa.a.x(jArr);
                        } else {
                            long j17 = je.e0.j(jG - ((long) (Math.max(0.0f, iVar.k - 1.0f) / 1.0E-7f)), iVar.f9688h, j13);
                            iVar.f9688h = j17;
                            long j18 = iVar.f9687g;
                            if (j18 != -9223372036854775807 && j17 > j18) {
                                iVar.f9688h = j18;
                            }
                        }
                        long j19 = jG - iVar.f9688h;
                        if (Math.abs(j19) < iVar.f9681a) {
                            iVar.k = 1.0f;
                        } else {
                            iVar.k = je.e0.h((1.0E-7f * j19) + 1.0f, iVar.j, iVar.f9689i);
                        }
                        f2 = iVar.k;
                    } else {
                        f2 = iVar.k;
                    }
                }
                if (this.K.b().f5574d != f2) {
                    PlaybackParameters playbackParameters = new PlaybackParameters(f2, this.T.f9725n.f5575e);
                    this.E.f13757a.removeMessages(16);
                    this.K.d(playbackParameters);
                    n(this.T.f9725n, this.K.b().f5574d, false, false);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:214:0x036d  */
    /* JADX WARN: Code duplicated, block: B:349:0x054d  */
    /* JADX WARN: Code duplicated, block: B:351:0x0558  */
    /* JADX WARN: Code duplicated, block: B:400:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160 A[EDGE_INSN: B:61:0x0160->B:149:0x0291 BREAK  A[LOOP:7: B:71:0x017a->B:88:0x01ad]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [int] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, md.q] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, md.q] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.lang.Object, md.q0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, md.q] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, md.q] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, md.q0] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Object, md.q0] */
    public final void e() throws com.google.android.exoplayer2.b {
        com.google.android.exoplayer2.b bVar;
        boolean z5;
        boolean z6;
        long j;
        boolean z7;
        boolean z10;
        boolean zR;
        int i7;
        boolean z11;
        boolean z12;
        int i10;
        md.o0 o0Var;
        long j5;
        boolean z13;
        w0 w0VarD;
        boolean z14;
        boolean z15;
        v0 v0Var;
        v0 v0Var2;
        boolean z16;
        e[] eVarArr;
        this.M.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.E.f13757a.removeMessages(2);
        long j7 = Long.MIN_VALUE;
        com.google.android.exoplayer2.b bVar2 = null;
        if (this.T.f9714a.p() || !this.P.f9659a) {
            bVar = null;
            jUptimeMillis = jUptimeMillis;
            j7 = Long.MIN_VALUE;
            z5 = false;
            z6 = true;
            j = -9223372036854775807L;
        } else {
            x0 x0Var = this.O;
            long j10 = this.h0;
            v0 v0Var3 = x0Var.j;
            if (v0Var3 == null) {
                j5 = -9223372036854775807L;
            } else {
                je.b.k(v0Var3.f9902l == null);
                if (v0Var3.f9896d) {
                    j5 = -9223372036854775807L;
                    v0Var3.f9893a.W(j10 - v0Var3.f9905o);
                } else {
                    j5 = -9223372036854775807L;
                }
            }
            x0 x0Var2 = this.O;
            v0 v0Var4 = x0Var2.j;
            if (v0Var4 == null || (!v0Var4.f9898f.f9925i && v0Var4.f9896d && ((!v0Var4.f9897e || v0Var4.f9893a.S() == Long.MIN_VALUE) && x0Var2.j.f9898f.f9921e != j5 && x0Var2.k < 100))) {
                x0 x0Var3 = this.O;
                long j11 = this.h0;
                j1 j1Var = this.T;
                v0 v0Var5 = x0Var3.j;
                if (v0Var5 == null) {
                    z13 = true;
                    w0VarD = x0Var3.e(j1Var.f9714a, j1Var.f9715b, j1Var.f9716c, j1Var.f9729r);
                } else {
                    z13 = true;
                    w0VarD = x0Var3.d(j1Var.f9714a, v0Var5, j11);
                }
                if (w0VarD != null) {
                    x0 x0Var4 = this.O;
                    e[] eVarArr2 = this.f9616i;
                    fe.r rVar = this.f9621v;
                    he.q qVar = this.f9623x.f9699a;
                    g1 g1Var = this.P;
                    fe.u uVar = this.f9622w;
                    z14 = z13;
                    v0 v0Var6 = x0Var4.j;
                    v0 v0Var7 = new v0(eVarArr2, v0Var6 == null ? 1000000000000L : (v0Var6.f9905o + v0Var6.f9898f.f9921e) - w0VarD.f9918b, rVar, qVar, g1Var, w0VarD, uVar);
                    v0 v0Var8 = x0Var4.j;
                    if (v0Var8 == null) {
                        x0Var4.f9944h = v0Var7;
                        x0Var4.f9945i = v0Var7;
                    } else if (v0Var7 != v0Var8.f9902l) {
                        v0Var8.b();
                        v0Var8.f9902l = v0Var7;
                        v0Var8.c();
                    }
                    x0Var4.f9946l = null;
                    x0Var4.j = v0Var7;
                    x0Var4.k++;
                    x0Var4.k();
                    v0Var7.f9893a.l(this, w0VarD.f9918b);
                    if (this.O.f9944h == v0Var7) {
                        C(w0VarD.f9918b);
                    }
                    z15 = false;
                    k(false);
                } else {
                    z14 = z13;
                    jUptimeMillis = jUptimeMillis;
                    j7 = Long.MIN_VALUE;
                    z15 = false;
                }
            } else {
                jUptimeMillis = jUptimeMillis;
                j7 = Long.MIN_VALUE;
                z15 = false;
                z14 = true;
            }
            if (this.Z) {
                this.Z = p();
                b0();
            } else {
                s();
            }
            e[] eVarArr3 = this.f9610d;
            x0 x0Var5 = this.O;
            v0 v0Var9 = x0Var5.f9945i;
            if (v0Var9 == null) {
                j = j5;
                z6 = z14;
                break;
            }
            if (v0Var9.f9902l != null && !this.X) {
                if (!v0Var9.f9896d) {
                    j = j5;
                    z6 = z14;
                    break;
                }
                ?? r5 = z15;
                while (true) {
                    if (r5 >= eVarArr3.length) {
                        v0 v0Var10 = v0Var9.f9902l;
                        if (v0Var10.f9896d || this.h0 >= v0Var10.e()) {
                            fe.u uVar2 = v0Var9.f9904n;
                            v0 v0Var11 = x0Var5.f9945i;
                            je.b.k((v0Var11 == null || v0Var11.f9902l == null) ? z15 : z14);
                            x0Var5.f9945i = x0Var5.f9945i.f9902l;
                            x0Var5.k();
                            v0 v0Var12 = x0Var5.f9945i;
                            fe.u uVar3 = v0Var12.f9904n;
                            Timeline timeline = this.T.f9714a;
                            j = j5;
                            z6 = z14;
                            e0(timeline, v0Var12.f9898f.f9917a, timeline, v0Var9.f9898f.f9917a, -9223372036854775807L, false);
                            if (v0Var12.f9896d && v0Var12.f9893a.I() != j) {
                                long jE = v0Var12.e();
                                for (e eVar : eVarArr3) {
                                    if (eVar.E != null) {
                                        L(eVar, jE);
                                    }
                                }
                                break;
                            }
                            for (int i11 = 0; i11 < eVarArr3.length; i11++) {
                                boolean zB = uVar2.b(i11);
                                boolean zB2 = uVar3.b(i11);
                                if (zB && !eVarArr3[i11].I) {
                                    boolean z17 = this.f9616i[i11].f9602e == -2 ? z6 : false;
                                    p1 p1Var = uVar2.f9146b[i11];
                                    p1 p1Var2 = uVar3.f9146b[i11];
                                    if (!zB2 || !p1Var2.equals(p1Var) || z17) {
                                        L(eVarArr3[i11], v0Var12.e());
                                    }
                                }
                            }
                            break;
                        }
                    } else {
                        e eVar2 = eVarArr3[r5];
                        md.o0 o0Var2 = v0Var9.f9895c[r5];
                        if (eVar2.E == o0Var2) {
                            if (o0Var2 != null && !eVar2.i()) {
                                v0 v0Var13 = v0Var9.f9902l;
                                if (!v0Var9.f9898f.f9922f || !v0Var13.f9896d || (!(eVar2 instanceof vd.k) && !(eVar2 instanceof cd.e) && eVar2.H < v0Var13.e())) {
                                }
                            }
                            r5++;
                        }
                    }
                    j = j5;
                    z6 = z14;
                    break;
                }
            }
            j = j5;
            z6 = z14;
            if (v0Var9.f9898f.f9925i || this.X) {
                for (int i12 = 0; i12 < eVarArr3.length; i12++) {
                    e eVar3 = eVarArr3[i12];
                    md.o0 o0Var3 = v0Var9.f9895c[i12];
                    if (o0Var3 != null && eVar3.E == o0Var3 && eVar3.i()) {
                        long j12 = v0Var9.f9898f.f9921e;
                        L(eVar3, (j12 == j || j12 == j7) ? j : j12 + v0Var9.f9905o);
                    }
                }
            }
            x0 x0Var6 = this.O;
            v0 v0Var14 = x0Var6.f9945i;
            if (v0Var14 != null && x0Var6.f9944h != v0Var14 && !v0Var14.f9899g) {
                fe.u uVar4 = v0Var14.f9904n;
                md.o0[] o0VarArr = v0Var14.f9895c;
                boolean z18 = false;
                int i13 = 0;
                while (true) {
                    eVarArr = this.f9610d;
                    if (i13 >= eVarArr.length) {
                        break;
                    }
                    e eVar4 = eVarArr[i13];
                    if (q(eVar4)) {
                        boolean z19 = eVar4.E != o0VarArr[i13] ? z6 : false;
                        if (!uVar4.b(i13) || z19) {
                            if (!eVar4.I) {
                                fe.p pVar = uVar4.f9147c[i13];
                                int length = pVar != null ? pVar.length() : 0;
                                Format[] formatArr = new Format[length];
                                for (int i14 = 0; i14 < length; i14++) {
                                    formatArr[i14] = pVar.f(i14);
                                }
                                eVar4.v(formatArr, o0VarArr[i13], v0Var14.e(), v0Var14.f9905o);
                            } else if (eVar4.j()) {
                                b(eVar4);
                            } else {
                                z18 = z6;
                            }
                        }
                    }
                    i13++;
                }
                if (!z18) {
                    f(new boolean[eVarArr.length]);
                }
            }
            x0 x0Var7 = this.O;
            boolean z20 = false;
            while (W() && !this.X && (v0Var = x0Var7.f9944h) != null && (v0Var2 = v0Var.f9902l) != null && this.h0 >= v0Var2.e() && v0Var2.f9899g) {
                if (z20) {
                    t();
                }
                v0 v0VarA = x0Var7.a();
                v0VarA.getClass();
                if (this.T.f9715b.f15689a.equals(v0VarA.f9898f.f9917a.f15689a)) {
                    md.s sVar = this.T.f9715b;
                    if (sVar.f15690b == -1) {
                        md.s sVar2 = v0VarA.f9898f.f9917a;
                        if (sVar2.f15690b != -1 || sVar.f15693e == sVar2.f15693e) {
                            z16 = false;
                        } else {
                            z16 = z6;
                        }
                    } else {
                        z16 = false;
                    }
                } else {
                    z16 = false;
                }
                w0 w0Var = v0VarA.f9898f;
                md.s sVar3 = w0Var.f9917a;
                long j13 = w0Var.f9918b;
                this.T = o(sVar3, j13, w0Var.f9919c, j13, !z16, 0);
                B();
                d0();
                z20 = z6;
                bVar2 = bVar2;
            }
            bVar = bVar2;
            z5 = false;
        }
        int i15 = this.T.f9718e;
        if (i15 == z6 || i15 == 4) {
            return;
        }
        v0 v0Var15 = this.O.f9944h;
        if (v0Var15 == null) {
            this.E.f13757a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
            return;
        }
        je.b.c("doSomeWork");
        d0();
        if (v0Var15.f9896d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            v0Var15.f9893a.w(this.T.f9729r - this.J);
            ?? r10 = z5;
            z7 = z6;
            z10 = z7;
            while (true) {
                e[] eVarArr4 = this.f9610d;
                if (r10 >= eVarArr4.length) {
                    break;
                }
                e eVar5 = eVarArr4[r10];
                if (q(eVar5)) {
                    eVar5.u(this.h0, jElapsedRealtime);
                    z10 = (z10 && eVar5.j()) ? z6 : z5;
                    boolean z21 = v0Var15.f9895c[r10] != eVar5.E ? z6 : z5;
                    boolean z22 = (z21 || ((z21 || !eVar5.i()) ? z5 : z6) || eVar5.k() || eVar5.j()) ? z6 : z5;
                    z7 = (z7 && z22) ? z6 : z5;
                    if (!z22) {
                        md.o0 o0Var4 = eVar5.E;
                        o0Var4.getClass();
                        o0Var4.b();
                    }
                }
                r10++;
            }
        } else {
            v0Var15.f9893a.r();
            z7 = z6;
            z10 = z7;
        }
        long j14 = v0Var15.f9898f.f9921e;
        boolean z23 = (z10 && v0Var15.f9896d && (j14 == j || j14 <= this.T.f9729r)) ? z6 : z5;
        if (z23 && this.X) {
            this.X = z5;
            Q(this.T.f9724m, 5, z5, z5);
        }
        if (z23 && v0Var15.f9898f.f9925i) {
            V(4);
            a0();
        } else {
            j1 j1Var2 = this.T;
            if (j1Var2.f9718e == 2) {
                x0 x0Var8 = this.O;
                if (this.f9614f0 == 0) {
                    zR = r();
                } else if (z7) {
                    if (j1Var2.f9720g) {
                        long j15 = X(j1Var2.f9714a, x0Var8.f9944h.f9898f.f9917a) ? this.Q.f9688h : j;
                        v0 v0Var16 = x0Var8.j;
                        boolean z24 = (!v0Var16.f9896d || (v0Var16.f9897e && v0Var16.f9893a.S() != j7) || !v0Var16.f9898f.f9925i) ? z5 : z6;
                        boolean z25 = (!v0Var16.f9898f.f9917a.a() || v0Var16.f9896d) ? z5 : z6;
                        if (z24 || z25) {
                            z7 = z7;
                            j = j;
                        } else {
                            j jVar = this.f9623x;
                            j1 j1Var3 = this.T;
                            Timeline timeline2 = j1Var3.f9714a;
                            long j16 = j1Var3.f9727p;
                            v0 v0Var17 = this.O.j;
                            z7 = z7;
                            long jMax = v0Var17 == null ? 0L : Math.max(0L, j16 - (this.h0 - v0Var17.f9905o));
                            float f2 = this.K.b().f5574d;
                            boolean z26 = this.Y;
                            jVar.getClass();
                            long jY = je.e0.y(jMax, f2);
                            long jMin = z26 ? jVar.f9703e : jVar.f9702d;
                            if (j15 != j) {
                                jMin = Math.min(j15 / 2, jMin);
                            }
                            if (jMin > 0 && jY < jMin) {
                                if (!jVar.f9705g) {
                                    he.q qVar2 = jVar.f9699a;
                                    synchronized (qVar2) {
                                        i7 = qVar2.f10664d * qVar2.f10662b;
                                    }
                                    if (i7 >= jVar.f9707i) {
                                    }
                                }
                                zR = false;
                            }
                        }
                        zR = true;
                    } else {
                        zR = z6;
                    }
                    if (zR) {
                        V(3);
                        this.f9619k0 = bVar;
                        if (W()) {
                            Y();
                        }
                    }
                } else {
                    zR = z5;
                }
                j = j;
                if (zR) {
                    V(3);
                    this.f9619k0 = bVar;
                    if (W()) {
                        Y();
                    }
                }
            } else {
                z7 = z7;
                j = j;
            }
            if (this.T.f9718e == 3 && (this.f9614f0 != 0 ? !z7 : !r())) {
                this.Y = W();
                V(2);
                if (this.Y) {
                    for (v0 v0Var18 = this.O.f9944h; v0Var18 != null; v0Var18 = v0Var18.f9902l) {
                        for (fe.p pVar2 : v0Var18.f9904n.f9147c) {
                            if (pVar2 != null) {
                                pVar2.r();
                            }
                        }
                    }
                    i iVar = this.Q;
                    long j17 = iVar.f9688h;
                    if (j17 != j) {
                        long j18 = j17 + iVar.f9682b;
                        iVar.f9688h = j18;
                        long j19 = iVar.f9687g;
                        if (j19 != j && j18 > j19) {
                            iVar.f9688h = j19;
                        }
                        iVar.f9690l = j;
                    }
                }
                a0();
            }
        }
        if (this.T.f9718e == 2) {
            int i16 = 0;
            while (true) {
                e[] eVarArr5 = this.f9610d;
                if (i16 >= eVarArr5.length) {
                    break;
                }
                if (q(eVarArr5[i16]) && (o0Var = this.f9610d[i16].E) == v0Var15.f9895c[i16]) {
                    o0Var.getClass();
                    o0Var.b();
                }
                i16++;
            }
            j1 j1Var4 = this.T;
            if (j1Var4.f9720g || j1Var4.f9728q >= 500000 || !p()) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (!z11) {
            this.f9620l0 = -9223372036854775807L;
        } else if (this.f9620l0 == -9223372036854775807L) {
            this.M.getClass();
            this.f9620l0 = SystemClock.elapsedRealtime();
        } else {
            this.M.getClass();
            if (SystemClock.elapsedRealtime() - this.f9620l0 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z27 = W() && this.T.f9718e == 3;
        boolean z28 = this.f9613e0 && this.f9611d0 && z27;
        j1 j1Var5 = this.T;
        if (j1Var5.f9726o != z28) {
            z12 = z28;
            this.T = new j1(j1Var5.f9714a, j1Var5.f9715b, j1Var5.f9716c, j1Var5.f9717d, j1Var5.f9718e, j1Var5.f9719f, j1Var5.f9720g, j1Var5.f9721h, j1Var5.f9722i, j1Var5.j, j1Var5.k, j1Var5.f9723l, j1Var5.f9724m, j1Var5.f9725n, j1Var5.f9727p, j1Var5.f9728q, j1Var5.f9729r, j1Var5.f9730s, z12);
        } else {
            z12 = z28;
        }
        this.f9611d0 = false;
        if (!z12 && (i10 = this.T.f9718e) != 4) {
            if (z27 || i10 == 2) {
                this.E.f13757a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
            } else if (i10 == 3 && this.f9614f0 != 0) {
                this.E.f13757a.sendEmptyMessageAtTime(2, jUptimeMillis + 1000);
            }
        }
        je.b.t();
    }

    public final void e0(Timeline timeline, md.s sVar, Timeline timeline2, md.s sVar2, long j, boolean z5) {
        boolean zX = X(timeline, sVar);
        Object obj = sVar.f15689a;
        if (!zX) {
            PlaybackParameters playbackParameters = sVar.a() ? PlaybackParameters.f5573v : this.T.f9725n;
            k kVar = this.K;
            if (kVar.b().equals(playbackParameters)) {
                return;
            }
            this.E.f13757a.removeMessages(16);
            kVar.d(playbackParameters);
            n(this.T.f9725n, playbackParameters.f5574d, false, false);
            return;
        }
        u1 u1Var = this.I;
        int i7 = timeline.g(obj, u1Var).f9888i;
        v1 v1Var = this.H;
        timeline.n(i7, v1Var);
        o0 o0Var = v1Var.H;
        int i10 = je.e0.f13788a;
        i iVar = this.Q;
        iVar.getClass();
        iVar.f9683c = je.e0.I(o0Var.f9802d);
        iVar.f9686f = je.e0.I(o0Var.f9803e);
        iVar.f9687g = je.e0.I(o0Var.f9804i);
        float f2 = o0Var.f9805v;
        if (f2 == -3.4028235E38f) {
            f2 = 0.97f;
        }
        iVar.j = f2;
        float f7 = o0Var.f9806w;
        if (f7 == -3.4028235E38f) {
            f7 = 1.03f;
        }
        iVar.f9689i = f7;
        if (f2 == 1.0f && f7 == 1.0f) {
            iVar.f9683c = -9223372036854775807L;
        }
        iVar.a();
        if (j != -9223372036854775807L) {
            iVar.f9684d = g(timeline, obj, j);
            iVar.a();
            return;
        }
        if (!je.e0.a(!timeline2.p() ? timeline2.m(timeline2.g(sVar2.f15689a, u1Var).f9888i, v1Var, 0L).f9909d : null, v1Var.f9909d) || z5) {
            iVar.f9684d = -9223372036854775807L;
            iVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    public final void f(boolean[] zArr) throws com.google.android.exoplayer2.b {
        e[] eVarArr;
        Set set;
        fe.u uVar;
        int i7;
        e[] eVarArr2;
        je.n nVar;
        x0 x0Var = this.O;
        v0 v0Var = x0Var.f9945i;
        fe.u uVar2 = v0Var.f9904n;
        int i10 = 0;
        while (true) {
            eVarArr = this.f9610d;
            int length = eVarArr.length;
            set = this.f9612e;
            if (i10 >= length) {
                break;
            }
            if (!uVar2.b(i10) && set.remove(eVarArr[i10])) {
                eVarArr[i10].w();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < eVarArr.length) {
            if (uVar2.b(i11)) {
                boolean z5 = zArr[i11];
                e eVar = eVarArr[i11];
                if (q(eVar)) {
                    uVar = uVar2;
                    i7 = i11;
                    eVarArr2 = eVarArr;
                } else {
                    v0 v0Var2 = x0Var.f9945i;
                    boolean z6 = v0Var2 == x0Var.f9944h;
                    fe.u uVar3 = v0Var2.f9904n;
                    p1 p1Var = uVar3.f9146b[i11];
                    fe.p pVar = uVar3.f9147c[i11];
                    int length2 = pVar != null ? pVar.length() : 0;
                    Format[] formatArr = new Format[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        formatArr[i12] = pVar.f(i12);
                    }
                    boolean z7 = W() && this.T.f9718e == 3;
                    boolean z10 = !z5 && z7;
                    this.f9614f0++;
                    set.add(eVar);
                    md.o0 o0Var = v0Var2.f9895c[i11];
                    uVar = uVar2;
                    long j = this.h0;
                    long jE = v0Var2.e();
                    i7 = i11;
                    eVarArr2 = eVarArr;
                    long j5 = v0Var2.f9905o;
                    je.b.k(eVar.f9607y == 0);
                    eVar.f9604v = p1Var;
                    eVar.f9607y = 1;
                    eVar.m(z10, z6);
                    eVar.v(formatArr, o0Var, jE, j5);
                    eVar.I = false;
                    eVar.H = j;
                    eVar.n(j, z10);
                    eVar.c(11, new z(this));
                    k kVar = this.K;
                    kVar.getClass();
                    je.n nVarG = eVar.g();
                    if (nVarG != null && nVarG != (nVar = (je.n) kVar.f9736x)) {
                        if (nVar != null) {
                            throw new com.google.android.exoplayer2.b(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        kVar.f9736x = nVarG;
                        kVar.f9735w = eVar;
                        ((ic.m0) nVarG).d((PlaybackParameters) ((io.sentry.android.core.r) kVar.f9733i).f12395w);
                    }
                    if (z7) {
                        je.b.k(eVar.f9607y == 1);
                        eVar.f9607y = 2;
                        eVar.q();
                    }
                }
            } else {
                uVar = uVar2;
                i7 = i11;
                eVarArr2 = eVarArr;
            }
            i11 = i7 + 1;
            uVar2 = uVar;
            eVarArr = eVarArr2;
        }
        v0Var.f9899g = true;
    }

    public final synchronized void f0(o oVar, long j) {
        this.M.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z5 = false;
        while (!((Boolean) oVar.get()).booleanValue() && j > 0) {
            try {
                this.M.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z5 = true;
            }
            this.M.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    public final long g(Timeline timeline, Object obj, long j) {
        u1 u1Var = this.I;
        int i7 = timeline.g(obj, u1Var).f9888i;
        v1 v1Var = this.H;
        timeline.n(i7, v1Var);
        if (v1Var.f9914x != -9223372036854775807L && v1Var.a() && v1Var.F) {
            return je.e0.I(je.e0.v(v1Var.f9915y) - v1Var.f9914x) - (j + u1Var.f9890w);
        }
        return -9223372036854775807L;
    }

    public final Pair h(Timeline timeline) {
        if (timeline.p()) {
            return Pair.create(j1.f9713t, 0L);
        }
        Pair pairI = timeline.i(this.H, this.I, timeline.a(this.f9608b0), -9223372036854775807L);
        md.s sVarN = this.O.n(timeline, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (sVarN.a()) {
            Object obj = sVarN.f15689a;
            u1 u1Var = this.I;
            timeline.g(obj, u1Var);
            jLongValue = sVarN.f15691c == u1Var.f(sVarN.f15690b) ? u1Var.f9892y.f16558e : 0L;
        }
        return Pair.create(sVarN, Long.valueOf(jLongValue));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i7;
        v0 v0Var;
        v0 v0Var2;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    Q(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    H((d0) message.obj);
                    break;
                case 4:
                    R((PlaybackParameters) message.obj);
                    break;
                case 5:
                    this.S = (q1) message.obj;
                    break;
                case 6:
                    Z(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((md.q) message.obj);
                    break;
                case 9:
                    i((md.q) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    S(message.arg1);
                    break;
                case 12:
                    T(message.arg1 != 0);
                    break;
                case 13:
                    M(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    l1 l1Var = (l1) message.obj;
                    l1Var.getClass();
                    J(l1Var);
                    break;
                case 15:
                    K((l1) message.obj);
                    break;
                case 16:
                    PlaybackParameters playbackParameters = (PlaybackParameters) message.obj;
                    n(playbackParameters, playbackParameters.f5574d, true, false);
                    break;
                case 17:
                    N((a0) message.obj);
                    break;
                case 18:
                    a((a0) message.obj, message.arg1);
                    break;
                case 19:
                    a3.e.x(message.obj);
                    v();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (md.r0) message.obj);
                    break;
                case 21:
                    U((md.r0) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message.arg1 != 0);
                    break;
                case 24:
                    O(message.arg1 == 1);
                    break;
                case 25:
                    z();
                    G(true);
                    break;
                case 26:
                    z();
                    G(true);
                    break;
                default:
                    return false;
            }
        } catch (com.google.android.exoplayer2.b e10) {
            e = e10;
            int i11 = e.f5634i;
            x0 x0Var = this.O;
            if (i11 == 1 && (v0Var2 = x0Var.f9945i) != null) {
                e = e.a(v0Var2.f9898f.f9917a);
            }
            if (e.F && this.f9619k0 == null) {
                je.b.O("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f9619k0 = e;
                je.a0 a0Var = this.E;
                je.z zVarA = a0Var.a(25, e);
                Handler handler = a0Var.f13757a;
                Message message2 = zVarA.f13867a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                zVarA.a();
            } else {
                com.google.android.exoplayer2.b bVar = this.f9619k0;
                if (bVar != null) {
                    bVar.addSuppressed(e);
                    e = this.f9619k0;
                }
                je.b.s("ExoPlayerImplInternal", "Playback error", e);
                if (e.f5634i == 1 && x0Var.f9944h != x0Var.f9945i) {
                    while (true) {
                        v0Var = x0Var.f9944h;
                        if (v0Var == x0Var.f9945i) {
                            break;
                        }
                        x0Var.a();
                    }
                    v0Var.getClass();
                    w0 w0Var = v0Var.f9898f;
                    md.s sVar = w0Var.f9917a;
                    long j = w0Var.f9918b;
                    this.T = o(sVar, j, w0Var.f9919c, j, true, 0);
                }
                Z(true, false);
                this.T = this.T.e(e);
            }
        } catch (h1 e11) {
            boolean z5 = e11.f9679d;
            int i12 = e11.f9680e;
            if (i12 == 1) {
                i7 = z5 ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i7 = z5 ? 3002 : 3004;
                }
                j(e11, i10);
            }
            i10 = i7;
            j(e11, i10);
        } catch (he.m e12) {
            j(e12, e12.f10628d);
        } catch (IOException e13) {
            j(e13, 2000);
        } catch (RuntimeException e14) {
            com.google.android.exoplayer2.b bVar2 = new com.google.android.exoplayer2.b(2, e14, ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) ? 1004 : 1000);
            je.b.s("ExoPlayerImplInternal", "Playback error", bVar2);
            Z(true, false);
            this.T = this.T.e(bVar2);
        } catch (mc.j e15) {
            j(e15, e15.f15562d);
        } catch (md.b e16) {
            j(e16, RNCWebViewManager.COMMAND_CLEAR_HISTORY);
        }
        t();
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, md.q0] */
    public final void i(md.q qVar) {
        v0 v0Var = this.O.j;
        if (v0Var == null || v0Var.f9893a != qVar) {
            return;
        }
        long j = this.h0;
        if (v0Var != null) {
            je.b.k(v0Var.f9902l == null);
            if (v0Var.f9896d) {
                v0Var.f9893a.W(j - v0Var.f9905o);
            }
        }
        s();
    }

    public final void j(IOException iOException, int i7) {
        com.google.android.exoplayer2.b bVar = new com.google.android.exoplayer2.b(0, iOException, i7);
        v0 v0Var = this.O.f9944h;
        if (v0Var != null) {
            bVar = bVar.a(v0Var.f9898f.f9917a);
        }
        je.b.s("ExoPlayerImplInternal", "Playback error", bVar);
        Z(false, false);
        this.T = this.T.e(bVar);
    }

    public final void k(boolean z5) {
        v0 v0Var = this.O.j;
        md.s sVar = v0Var == null ? this.T.f9715b : v0Var.f9898f.f9917a;
        boolean zEquals = this.T.k.equals(sVar);
        if (!zEquals) {
            this.T = this.T.b(sVar);
        }
        j1 j1Var = this.T;
        j1Var.f9727p = v0Var == null ? j1Var.f9729r : v0Var.d();
        j1 j1Var2 = this.T;
        long j = j1Var2.f9727p;
        v0 v0Var2 = this.O.j;
        j1Var2.f9728q = v0Var2 != null ? Math.max(0L, j - (this.h0 - v0Var2.f9905o)) : 0L;
        if ((!zEquals || z5) && v0Var != null && v0Var.f9896d) {
            c0(v0Var.f9904n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0300 A[Catch: all -> 0x0306, TRY_ENTER, TryCatch #2 {all -> 0x0306, blocks: (B:166:0x0300, B:179:0x031e, B:181:0x0328, B:183:0x032e, B:185:0x0338, B:186:0x0345), top: B:263:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:201:0x036b  */
    /* JADX WARN: Code duplicated, block: B:202:0x036d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0378  */
    /* JADX WARN: Code duplicated, block: B:209:0x0383  */
    /* JADX WARN: Code duplicated, block: B:211:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:220:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:222:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.google.android.exoplayer2.Timeline] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.google.android.exoplayer2.Timeline] */
    /* JADX WARN: Type inference failed for: r2v28, types: [gc.j1] */
    /* JADX WARN: Type inference failed for: r2v51, types: [gc.x0] */
    /* JADX WARN: Type inference failed for: r39v0, types: [gc.e0] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v38, types: [com.google.android.exoplayer2.Timeline] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l(Timeline timeline, boolean z5) throws Throwable {
        Object obj;
        v1 v1Var;
        long j;
        int iA;
        int i7;
        boolean z6;
        boolean z7;
        boolean z10;
        int iA2;
        boolean z11;
        Timeline timeline2;
        long j5;
        ?? r7;
        boolean z12;
        long j7;
        c0 c0Var;
        int i10;
        long jLongValue;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        long j10;
        int iA3;
        boolean z16;
        ?? r19;
        ?? r11;
        md.s sVar;
        long j11;
        ?? r12;
        ?? r110;
        boolean z17;
        boolean z18;
        ?? r111;
        ?? r13;
        ?? r10;
        long j12;
        e[] eVarArr;
        x0 x0Var;
        ?? r112;
        ?? r14;
        long j13;
        md.s sVar2;
        Object obj2;
        ?? r15;
        int i12;
        ?? r113;
        ?? r16;
        j1 j1Var = this.T;
        d0 d0Var = this.f9615g0;
        x0 x0Var2 = this.O;
        int i13 = this.a0;
        boolean z19 = this.f9608b0;
        v1 v1Var2 = this.H;
        u1 u1Var = this.I;
        boolean z20 = 4;
        if (timeline.p()) {
            md.s sVar3 = j1.f9713t;
            timeline2 = timeline;
            c0Var = new c0(sVar3, 0L, -9223372036854775807L, false, true, false);
            j = 0;
            r19 = sVar3;
        } else {
            md.s sVar4 = j1Var.f9715b;
            Object obj3 = sVar4.f15689a;
            Timeline timeline3 = j1Var.f9714a;
            boolean zP = timeline3.p();
            boolean z21 = zP || timeline3.g(sVar4.f15689a, u1Var).f9891x;
            long jLongValue2 = (j1Var.f9715b.a() || z21) ? j1Var.f9716c : j1Var.f9729r;
            if (d0Var != null) {
                Pair pairE = E(timeline, d0Var, true, i13, z19, v1Var2, u1Var);
                if (pairE == null) {
                    iA3 = timeline.a(z19);
                    j10 = jLongValue2;
                    obj = obj3;
                    z15 = false;
                    z16 = true;
                    z14 = false;
                } else {
                    if (d0Var.f9593c == -9223372036854775807L) {
                        jLongValue = jLongValue2;
                        obj = obj3;
                        z13 = false;
                        i11 = timeline.g(pairE.first, u1Var).f9888i;
                    } else {
                        obj = pairE.first;
                        jLongValue = ((Long) pairE.second).longValue();
                        z13 = true;
                        i11 = -1;
                    }
                    z14 = z13;
                    z15 = j1Var.f9718e == 4;
                    j10 = jLongValue;
                    iA3 = i11;
                    z16 = false;
                }
                z6 = z15;
                z7 = z16;
                z10 = z14;
                iA = iA3;
                i7 = -1;
                j = 0;
                jLongValue2 = j10;
                v1Var = v1Var2;
            } else {
                obj = obj3;
                if (j1Var.f9714a.p()) {
                    iA = timeline.a(z19);
                    v1Var = v1Var2;
                } else if (timeline.b(obj) == -1) {
                    Object objF = F(v1Var2, u1Var, i13, z19, obj, j1Var.f9714a, timeline);
                    v1Var = v1Var2;
                    if (objF == null) {
                        u1Var = u1Var;
                        iA2 = timeline.a(z19);
                        z11 = true;
                    } else {
                        u1Var = u1Var;
                        iA2 = timeline.g(objF, u1Var).f9888i;
                        z11 = false;
                    }
                    iA = iA2;
                    z7 = z11;
                    jLongValue2 = jLongValue2;
                    obj = obj;
                    i7 = -1;
                    j = 0;
                    z6 = false;
                    z10 = false;
                } else {
                    v1Var = v1Var2;
                    if (jLongValue2 == -9223372036854775807L) {
                        iA = timeline.g(obj, u1Var).f9888i;
                    } else if (z21) {
                        j1Var.f9714a.g(sVar4.f15689a, u1Var);
                        if (j1Var.f9714a.m(u1Var.f9888i, v1Var, 0L).L == j1Var.f9714a.b(sVar4.f15689a)) {
                            j = 0;
                            Pair pairI = timeline.i(v1Var, u1Var, timeline.g(obj, u1Var).f9888i, jLongValue2 + u1Var.f9890w);
                            obj = pairI.first;
                            jLongValue2 = ((Long) pairI.second).longValue();
                        } else {
                            j = 0;
                            jLongValue2 = jLongValue2;
                            obj = obj;
                        }
                        iA = -1;
                        i7 = -1;
                        z6 = false;
                        z7 = false;
                        z10 = true;
                    } else {
                        j = 0;
                        iA = -1;
                        i7 = -1;
                        z6 = false;
                        z7 = false;
                        z10 = false;
                    }
                }
                i7 = -1;
                j = 0;
                z6 = false;
                z7 = false;
                z10 = false;
            }
            if (iA != i7) {
                int i14 = iA;
                timeline2 = timeline;
                Pair pairI2 = timeline2.i(v1Var, u1Var, i14, -9223372036854775807L);
                obj = pairI2.first;
                jLongValue2 = ((Long) pairI2.second).longValue();
                j5 = -9223372036854775807L;
            } else {
                timeline2 = timeline;
                j5 = jLongValue2;
            }
            md.s sVarN = x0Var2.n(timeline2, obj, jLongValue2);
            int i15 = sVarN.f15693e;
            r7 = (!sVar4.f15689a.equals(obj) || sVar4.a() || sVarN.a() || !(i15 == i7 || ((i10 = sVar4.f15693e) != i7 && i15 >= i10))) ? 0 : 1;
            u1 u1VarG = timeline2.g(obj, u1Var);
            if (z21 || jLongValue2 != j5) {
                z12 = false;
            } else {
                Object obj4 = sVar4.f15689a;
                int i16 = sVar4.f15691c;
                int i17 = sVar4.f15690b;
                if (obj4.equals(sVarN.f15689a) && (!(sVar4.a() && u1VarG.h(i17)) ? sVarN.a() && u1VarG.h(sVarN.f15690b) : !(u1VarG.e(i17, i16) == 4 || u1VarG.e(i17, i16) == 2))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (r7 != 0 || z12) {
                sVarN = sVar4;
            }
            if (!sVarN.a()) {
                j7 = jLongValue2;
            } else if (sVarN.equals(sVar4)) {
                jLongValue2 = j1Var.f9729r;
                j7 = jLongValue2;
            } else {
                timeline2.g(sVarN.f15689a, u1Var);
                j7 = sVarN.f15691c == u1Var.f(sVarN.f15690b) ? u1Var.f9892y.f16558e : j;
            }
            c0Var = new c0(sVarN, j7, j5, z6, z7, z10);
            r19 = zP;
        }
        md.s sVar5 = c0Var.f9576a;
        long j14 = c0Var.f9578c;
        boolean z22 = c0Var.f9579d;
        long jI = c0Var.f9577b;
        boolean z23 = (this.T.f9715b.equals(sVar5) && jI == this.T.f9729r) ? false : true;
        try {
            if (c0Var.f9580e) {
                try {
                    z17 = true;
                    if (this.T.f9718e != 1) {
                        try {
                            V(4);
                        } catch (Throwable th2) {
                            th = th2;
                            r11 = timeline2;
                            sVar = sVar5;
                            j11 = j14;
                            r110 = 1;
                            r12 = 0;
                        }
                    }
                    z18 = false;
                    try {
                        A(false, false, false, true);
                    } catch (Throwable th3) {
                        th = th3;
                        r11 = timeline2;
                        sVar = sVar5;
                        j11 = j14;
                        r110 = z17;
                        r12 = z18;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z17 = true;
                    z18 = false;
                }
            } else {
                z17 = true;
                z18 = false;
            }
            try {
                if (z23) {
                    r7 = timeline2;
                    r19 = z17;
                    z20 = z18;
                    if (r7.p()) {
                        r16 = z20;
                        r113 = r19;
                        sVar = sVar5;
                        r14 = r16;
                        r112 = r113;
                    } else {
                        for (v0 v0Var = this.O.f9944h; v0Var != null; v0Var = v0Var.f9902l) {
                            if (v0Var.f9898f.f9917a.equals(sVar5)) {
                                r16 = z20;
                                r113 = r19;
                                v0Var.f9898f = this.O.h(r7, v0Var.f9898f);
                                v0Var.h();
                            } else {
                                r16 = z20;
                                r113 = r19;
                            }
                        }
                        try {
                            r16 = z20;
                            r113 = r19;
                            x0 x0Var3 = this.O;
                            sVar = sVar5;
                            try {
                                jI = I(sVar, jI, x0Var3.f9944h != x0Var3.f9945i ? r19 == true ? 1 : 0 : z20, z22);
                                r14 = z20;
                                r112 = r19;
                            } catch (Throwable th5) {
                                th = th5;
                                jI = jI;
                                r10 = r7;
                                r13 = z20;
                                r111 = r19;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            sVar = sVar5;
                            r10 = r7;
                            r13 = z20;
                            r111 = r19;
                        }
                    }
                    j1 j1Var2 = this.T;
                    Timeline timeline4 = j1Var2.f9714a;
                    md.s sVar6 = j1Var2.f9715b;
                    if (c0Var.f9581f) {
                        j13 = jI;
                    } else {
                        j13 = -9223372036854775807L;
                    }
                    sVar2 = sVar;
                    e0(timeline, sVar2, timeline4, sVar6, j13, false);
                    if (z23) {
                        j1 j1Var3 = this.T;
                        obj2 = j1Var3.f9715b.f15689a;
                        Timeline timeline5 = j1Var3.f9714a;
                        if (z23) {
                            r15 = r14;
                        } else {
                            r15 = r14;
                        }
                        long j15 = this.T.f9717d;
                        if (timeline.b(obj2) == -1) {
                            i12 = 4;
                        } else {
                            i12 = 3;
                        }
                        this.T = o(sVar2, jI, j14, j15, r15, i12);
                    } else {
                        j1 j1Var4 = this.T;
                        obj2 = j1Var4.f9715b.f15689a;
                        Timeline timeline6 = j1Var4.f9714a;
                        if (z23) {
                            r15 = r14;
                        } else {
                            r15 = r14;
                        }
                        long j16 = this.T.f9717d;
                        if (timeline.b(obj2) == -1) {
                            i12 = 4;
                        } else {
                            i12 = 3;
                        }
                        this.T = o(sVar2, jI, j14, j16, r15, i12);
                    }
                    B();
                    D(r2, this.T.f9714a);
                    this.T = this.T.h(r2);
                    if (!timeline.p()) {
                        this.f9615g0 = null;
                    }
                    k(r14);
                    return;
                }
                try {
                    x0 x0Var4 = this.O;
                    r19 = z17;
                    z20 = z18;
                    try {
                        long j17 = this.h0;
                        try {
                            e[] eVarArr2 = this.f9610d;
                            v0 v0Var2 = x0Var4.f9945i;
                            try {
                                if (v0Var2 != null) {
                                    long j18 = v0Var2.f9905o;
                                    if (v0Var2.f9896d) {
                                        long jMax = j18;
                                        ?? r5 = z20;
                                        while (true) {
                                            if (r5 < eVarArr2.length) {
                                                if (q(eVarArr2[r5])) {
                                                    e eVar = eVarArr2[r5];
                                                    eVarArr = eVarArr2;
                                                    if (eVar.E == v0Var2.f9895c[r5]) {
                                                        x0Var = x0Var4;
                                                        long j19 = eVar.H;
                                                        if (j19 == Long.MIN_VALUE) {
                                                            timeline = timeline;
                                                            x0Var4 = x0Var;
                                                            j17 = j17;
                                                            j12 = Long.MIN_VALUE;
                                                            break;
                                                        }
                                                        jMax = Math.max(j19, jMax);
                                                        sVar = sVar5;
                                                        r10 = r7;
                                                        r13 = z20;
                                                        r111 = r19;
                                                        j11 = j14;
                                                        r11 = r10;
                                                        r12 = r13;
                                                        r110 = r111;
                                                    }
                                                    x0Var4 = x0Var;
                                                    eVarArr2 = eVarArr;
                                                    r5++;
                                                } else {
                                                    eVarArr = eVarArr2;
                                                }
                                                x0Var = x0Var4;
                                                x0Var4 = x0Var;
                                                eVarArr2 = eVarArr;
                                                r5++;
                                            } else {
                                                j12 = jMax;
                                                j17 = j17;
                                            }
                                        }
                                    } else {
                                        j12 = j18;
                                        j17 = j17;
                                        timeline = timeline;
                                    }
                                    r16 = z20;
                                    r113 = r19;
                                    if (!x0Var4.p(timeline, j17, j12)) {
                                        G(z20);
                                        r16 = z20;
                                        r113 = r19;
                                    }
                                    r16 = z20;
                                    r113 = r19;
                                    sVar = sVar5;
                                    r14 = r16;
                                    r112 = r113;
                                    j1 j1Var5 = this.T;
                                    Timeline timeline7 = j1Var5.f9714a;
                                    md.s sVar7 = j1Var5.f9715b;
                                    if (c0Var.f9581f) {
                                        j13 = jI;
                                    } else {
                                        j13 = -9223372036854775807L;
                                    }
                                    sVar2 = sVar;
                                    e0(timeline, sVar2, timeline7, sVar7, j13, false);
                                    if (z23 || j14 != this.T.f9716c) {
                                        j1 j1Var6 = this.T;
                                        obj2 = j1Var6.f9715b.f15689a;
                                        Timeline timeline8 = j1Var6.f9714a;
                                        if (z23 || !z5 || timeline8.p() || timeline8.g(obj2, this.I).f9891x) {
                                            r15 = r14;
                                        } else {
                                            r15 = r112;
                                        }
                                        long j110 = this.T.f9717d;
                                        if (timeline.b(obj2) == -1) {
                                            i12 = 4;
                                        } else {
                                            i12 = 3;
                                        }
                                        this.T = o(sVar2, jI, j14, j110, r15, i12);
                                    }
                                    B();
                                    D(r2, this.T.f9714a);
                                    this.T = this.T.h(r2);
                                    if (!timeline.p()) {
                                        this.f9615g0 = null;
                                    }
                                    k(r14);
                                    return;
                                }
                                j12 = j;
                                r16 = z20;
                                r113 = r19;
                                if (!x0Var4.p(timeline, j17, j12)) {
                                    G(z20);
                                    r16 = z20;
                                    r113 = r19;
                                }
                                r16 = z20;
                                r113 = r19;
                                sVar = sVar5;
                                r14 = r16;
                                r112 = r113;
                                j1 j1Var7 = this.T;
                                Timeline timeline9 = j1Var7.f9714a;
                                md.s sVar8 = j1Var7.f9715b;
                                if (c0Var.f9581f) {
                                    j13 = jI;
                                } else {
                                    j13 = -9223372036854775807L;
                                }
                                sVar2 = sVar;
                                e0(timeline, sVar2, timeline9, sVar8, j13, false);
                                if (z23) {
                                    j1 j1Var8 = this.T;
                                    obj2 = j1Var8.f9715b.f15689a;
                                    Timeline timeline10 = j1Var8.f9714a;
                                    if (z23) {
                                        r15 = r14;
                                    } else {
                                        r15 = r14;
                                    }
                                    long j111 = this.T.f9717d;
                                    if (timeline.b(obj2) == -1) {
                                        i12 = 4;
                                    } else {
                                        i12 = 3;
                                    }
                                    this.T = o(sVar2, jI, j14, j111, r15, i12);
                                } else {
                                    j1 j1Var9 = this.T;
                                    obj2 = j1Var9.f9715b.f15689a;
                                    Timeline timeline11 = j1Var9.f9714a;
                                    if (z23) {
                                        r15 = r14;
                                    } else {
                                        r15 = r14;
                                    }
                                    long j112 = this.T.f9717d;
                                    if (timeline.b(obj2) == -1) {
                                        i12 = 4;
                                    } else {
                                        i12 = 3;
                                    }
                                    this.T = o(sVar2, jI, j14, j112, r15, i12);
                                }
                                B();
                                D(r2, this.T.f9714a);
                                this.T = this.T.h(r2);
                                if (!timeline.p()) {
                                    this.f9615g0 = null;
                                }
                                k(r14);
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                r7 = timeline;
                            }
                            break;
                        } catch (Throwable th8) {
                            th = th8;
                            r7 = timeline;
                            z20 = z20;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    r7 = timeline;
                    r19 = z17;
                    z20 = z18;
                }
            } catch (Throwable th11) {
                th = th11;
            }
        } catch (Throwable th12) {
            th = th12;
            r11 = timeline2;
            sVar = sVar5;
            j11 = j14;
            r12 = 0;
            r110 = 1;
        }
        j1 j1Var10 = this.T;
        Timeline timeline12 = j1Var10.f9714a;
        md.s sVar9 = j1Var10.f9715b;
        md.s sVar10 = sVar;
        e0(r11, sVar10, timeline12, sVar9, c0Var.f9581f ? jI : -9223372036854775807L, false);
        if (z23 || j11 != this.T.f9716c) {
            j1 j1Var11 = this.T;
            Object obj5 = j1Var11.f9715b.f15689a;
            Timeline timeline13 = j1Var11.f9714a;
            this.T = o(sVar10, jI, j11, this.T.f9717d, (!z23 || !z5 || timeline13.p() || timeline13.g(obj5, this.I).f9891x) ? r12 : r110, r11.b(obj5) == -1 ? 4 : 3);
        }
        B();
        D(r11, this.T.f9714a);
        this.T = this.T.h(r11);
        if (!r11.p()) {
            this.f9615g0 = null;
        }
        k(r12);
        throw th;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, md.q] */
    public final void m(md.q qVar) throws com.google.android.exoplayer2.b {
        x0 x0Var = this.O;
        v0 v0Var = x0Var.j;
        if (v0Var == null || v0Var.f9893a != qVar) {
            return;
        }
        float f2 = this.K.b().f5574d;
        Timeline timeline = this.T.f9714a;
        v0Var.f9896d = true;
        v0Var.f9903m = v0Var.f9893a.Q();
        fe.u uVarG = v0Var.g(f2, timeline);
        w0 w0Var = v0Var.f9898f;
        long jMax = w0Var.f9918b;
        long j = w0Var.f9921e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = v0Var.a(uVarG, jMax, false, new boolean[v0Var.f9901i.length]);
        long j5 = v0Var.f9905o;
        w0 w0Var2 = v0Var.f9898f;
        v0Var.f9905o = (w0Var2.f9918b - jA) + j5;
        v0Var.f9898f = w0Var2.b(jA);
        c0(v0Var.f9904n);
        if (v0Var == x0Var.f9944h) {
            C(v0Var.f9898f.f9918b);
            f(new boolean[this.f9610d.length]);
            j1 j1Var = this.T;
            md.s sVar = j1Var.f9715b;
            long j7 = v0Var.f9898f.f9918b;
            this.T = o(sVar, j7, j1Var.f9716c, j7, false, 5);
        }
        s();
    }

    public final void n(PlaybackParameters playbackParameters, float f2, boolean z5, boolean z6) {
        int i7;
        if (z5) {
            if (z6) {
                this.U.a(1);
            }
            this.T = this.T.f(playbackParameters);
        }
        float f7 = playbackParameters.f5574d;
        v0 v0Var = this.O.f9944h;
        while (true) {
            i7 = 0;
            if (v0Var == null) {
                break;
            }
            fe.p[] pVarArr = v0Var.f9904n.f9147c;
            int length = pVarArr.length;
            while (i7 < length) {
                fe.p pVar = pVarArr[i7];
                if (pVar != null) {
                    pVar.o(f7);
                }
                i7++;
            }
            v0Var = v0Var.f9902l;
        }
        e[] eVarArr = this.f9610d;
        int length2 = eVarArr.length;
        while (i7 < length2) {
            e eVar = eVarArr[i7];
            if (eVar != null) {
                eVar.x(f2, playbackParameters.f5574d);
            }
            i7++;
        }
    }

    public final j1 o(md.s sVar, long j, long j5, long j7, boolean z5, int i7) {
        ei.r0 r0VarF;
        this.f9618j0 = (!this.f9618j0 && j == this.T.f9729r && sVar.equals(this.T.f9715b)) ? false : true;
        B();
        j1 j1Var = this.T;
        md.y0 y0Var = j1Var.f9721h;
        fe.u uVar = j1Var.f9722i;
        List list = j1Var.j;
        if (this.P.f9659a) {
            v0 v0Var = this.O.f9944h;
            y0Var = v0Var == null ? md.y0.f15735v : v0Var.f9903m;
            uVar = v0Var == null ? this.f9622w : v0Var.f9904n;
            fe.p[] pVarArr = uVar.f9147c;
            ei.b0 b0Var = new ei.b0();
            boolean z6 = false;
            for (fe.p pVar : pVarArr) {
                if (pVar != null) {
                    Metadata metadata = pVar.f(0).G;
                    if (metadata == null) {
                        b0Var.a(new Metadata(new cd.b[0]));
                    } else {
                        b0Var.a(metadata);
                        z6 = true;
                    }
                }
            }
            if (z6) {
                r0VarF = b0Var.f();
            } else {
                ei.c0 c0Var = ei.e0.f8303e;
                r0VarF = ei.r0.f8352w;
            }
            list = r0VarF;
            if (v0Var != null) {
                w0 w0Var = v0Var.f9898f;
                if (w0Var.f9919c != j5) {
                    v0Var.f9898f = w0Var.a(j5);
                }
            }
        } else if (!sVar.equals(j1Var.f9715b)) {
            y0Var = md.y0.f15735v;
            uVar = this.f9622w;
            list = ei.r0.f8352w;
        }
        md.y0 y0Var2 = y0Var;
        fe.u uVar2 = uVar;
        List list2 = list;
        if (z5) {
            b0 b0Var2 = this.U;
            if (!b0Var2.f9567d || b0Var2.f9568e == 5) {
                b0Var2.f9564a = true;
                b0Var2.f9567d = true;
                b0Var2.f9568e = i7;
            } else {
                je.b.g(i7 == 5);
            }
        }
        j1 j1Var2 = this.T;
        long j10 = j1Var2.f9727p;
        v0 v0Var2 = this.O.j;
        return j1Var2.c(sVar, j, j5, j7, v0Var2 == null ? 0L : Math.max(0L, j10 - (this.h0 - v0Var2.f9905o)), y0Var2, uVar2, list2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, md.q0] */
    public final boolean p() {
        v0 v0Var = this.O.j;
        if (v0Var == null) {
            return false;
        }
        return (!v0Var.f9896d ? 0L : v0Var.f9893a.k()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        v0 v0Var = this.O.f9944h;
        long j = v0Var.f9898f.f9921e;
        if (v0Var.f9896d) {
            return j == -9223372036854775807L || this.T.f9729r < j || !W();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, md.q] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, md.q0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, md.q0] */
    public final void s() {
        boolean zC;
        if (p()) {
            v0 v0Var = this.O.j;
            long jK = !v0Var.f9896d ? 0L : v0Var.f9893a.k();
            v0 v0Var2 = this.O.j;
            long jMax = v0Var2 == null ? 0L : Math.max(0L, jK - (this.h0 - v0Var2.f9905o));
            v0 v0Var3 = this.O.f9944h;
            zC = this.f9623x.c(jMax, this.K.b().f5574d);
            if (!zC && jMax < 500000 && this.J > 0) {
                this.O.f9944h.f9893a.w(this.T.f9729r);
                zC = this.f9623x.c(jMax, this.K.b().f5574d);
            }
        } else {
            zC = false;
        }
        this.Z = zC;
        if (zC) {
            v0 v0Var4 = this.O.j;
            long j = this.h0;
            je.b.k(v0Var4.f9902l == null);
            v0Var4.f9893a.z(j - v0Var4.f9905o);
        }
        b0();
    }

    public final void t() {
        b0 b0Var = this.U;
        j1 j1Var = this.T;
        boolean z5 = b0Var.f9564a | (b0Var.f9565b != j1Var);
        b0Var.f9564a = z5;
        b0Var.f9565b = j1Var;
        if (z5) {
            com.google.android.exoplayer2.c cVar = this.N.f9831d;
            cVar.f5652i.c(new com.mkuczera.haptic.a(6, cVar, b0Var));
            this.U = new b0(this.T);
        }
    }

    public final void u() throws Throwable {
        l(this.P.c(), true);
    }

    public final void v() {
        this.U.a(1);
        throw null;
    }

    public final void w() {
        this.U.a(1);
        A(false, false, false, true);
        this.f9623x.b(false);
        V(this.T.f9714a.p() ? 4 : 2);
        he.s sVar = (he.s) this.f9624y;
        sVar.getClass();
        g1 g1Var = this.P;
        ArrayList arrayList = (ArrayList) g1Var.f9661c;
        je.b.k(!g1Var.f9659a);
        g1Var.f9668l = sVar;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            f1 f1Var = (f1) arrayList.get(i7);
            g1Var.g(f1Var);
            ((HashSet) g1Var.f9666h).add(f1Var);
        }
        g1Var.f9659a = true;
        this.E.d(2);
    }

    public final void x() {
        A(true, false, true, false);
        for (int i7 = 0; i7 < this.f9610d.length; i7++) {
            e eVar = this.f9616i[i7];
            synchronized (eVar.f9601d) {
                eVar.K = null;
            }
            e eVar2 = this.f9610d[i7];
            je.b.k(eVar2.f9607y == 0);
            eVar2.o();
        }
        this.f9623x.b(true);
        V(1);
        HandlerThread handlerThread = this.F;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.V = true;
            notifyAll();
        }
    }

    public final void y(int i7, int i10, md.r0 r0Var) throws Throwable {
        this.U.a(1);
        g1 g1Var = this.P;
        g1Var.getClass();
        je.b.g(i7 >= 0 && i7 <= i10 && i10 <= ((ArrayList) g1Var.f9661c).size());
        g1Var.k = r0Var;
        g1Var.i(i7, i10);
        l(g1Var.c(), false);
    }

    public final void z() throws com.google.android.exoplayer2.b {
        int i7;
        float f2 = this.K.b().f5574d;
        x0 x0Var = this.O;
        v0 v0Var = x0Var.f9944h;
        v0 v0Var2 = x0Var.f9945i;
        boolean z5 = true;
        for (v0 v0Var3 = v0Var; v0Var3 != null && v0Var3.f9896d; v0Var3 = v0Var3.f9902l) {
            fe.u uVarG = v0Var3.g(f2, this.T.f9714a);
            fe.u uVar = v0Var3.f9904n;
            fe.p[] pVarArr = uVarG.f9147c;
            boolean z6 = false;
            if (uVar != null && uVar.f9147c.length == pVarArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= pVarArr.length) {
                        if (v0Var3 == v0Var2) {
                            z5 = false;
                        }
                    } else if (uVarG.a(uVar, i10)) {
                        i10++;
                    }
                }
            }
            if (z5) {
                x0 x0Var2 = this.O;
                v0 v0Var4 = x0Var2.f9944h;
                boolean zL = x0Var2.l(v0Var4);
                boolean[] zArr = new boolean[this.f9610d.length];
                long jA = v0Var4.a(uVarG, this.T.f9729r, zL, zArr);
                j1 j1Var = this.T;
                if (j1Var.f9718e != 4 && jA != j1Var.f9729r) {
                    z6 = true;
                }
                j1 j1Var2 = this.T;
                i7 = 4;
                this.T = o(j1Var2.f9715b, jA, j1Var2.f9716c, j1Var2.f9717d, z6, 5);
                if (z6) {
                    C(jA);
                }
                boolean[] zArr2 = new boolean[this.f9610d.length];
                int i11 = 0;
                while (true) {
                    e[] eVarArr = this.f9610d;
                    if (i11 >= eVarArr.length) {
                        break;
                    }
                    e eVar = eVarArr[i11];
                    boolean zQ = q(eVar);
                    zArr2[i11] = zQ;
                    md.o0 o0Var = v0Var4.f9895c[i11];
                    if (zQ) {
                        if (o0Var != eVar.E) {
                            b(eVar);
                        } else if (zArr[i11]) {
                            long j = this.h0;
                            eVar.I = false;
                            eVar.H = j;
                            eVar.n(j, false);
                        }
                    }
                    i11++;
                }
                f(zArr2);
            } else {
                i7 = 4;
                this.O.l(v0Var3);
                if (v0Var3.f9896d) {
                    v0Var3.a(uVarG, Math.max(v0Var3.f9898f.f9918b, this.h0 - v0Var3.f9905o), false, new boolean[v0Var3.f9901i.length]);
                }
            }
            k(true);
            if (this.T.f9718e != i7) {
                s();
                d0();
                this.E.d(2);
                return;
            }
            return;
        }
    }
}
