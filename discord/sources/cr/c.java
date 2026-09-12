package cr;

import ar.a2;
import ar.b0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7346d = j.f7378p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ar.k f7347e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f7348i;

    public c(h hVar) {
        this.f7348i = hVar;
    }

    public final Object a(dr.g frame) throws Throwable {
        o oVar;
        o oVarS;
        Object obj = this.f7346d;
        boolean z5 = true;
        if (obj == j.f7378p || obj == j.f7374l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f7362y;
            h hVar = this.f7348i;
            o oVar2 = (o) atomicReferenceFieldUpdater.get(hVar);
            while (!hVar.z()) {
                long andIncrement = h.f7358i.getAndIncrement(hVar);
                long j = j.f7366b;
                long j5 = andIncrement / j;
                int i7 = (int) (andIncrement % j);
                if (oVar2.f9398i != j5) {
                    o oVarS2 = hVar.s(j5, oVar2);
                    if (oVarS2 == null) {
                        continue;
                    } else {
                        oVar = oVarS2;
                    }
                } else {
                    oVar = oVar2;
                }
                Object objJ = hVar.J(oVar, i7, andIncrement, null);
                a5.h hVar2 = j.f7375m;
                if (objJ == hVar2) {
                    throw new IllegalStateException("unreachable");
                }
                a5.h hVar3 = j.f7377o;
                if (objJ == hVar3) {
                    if (andIncrement < hVar.w()) {
                        oVar.b();
                    }
                    oVar2 = oVar;
                } else if (objJ == j.f7376n) {
                    ar.k kVarP = b0.p(wn.f.b(frame));
                    try {
                        this.f7347e = kVarP;
                        try {
                            Object objJ2 = hVar.J(oVar, i7, andIncrement, this);
                            if (objJ2 != hVar2) {
                                if (objJ2 == hVar3) {
                                    if (andIncrement < hVar.w()) {
                                        oVar.b();
                                    }
                                    o oVar3 = (o) h.f7362y.get(hVar);
                                    while (true) {
                                        if (hVar.z()) {
                                            ar.k kVar = this.f7347e;
                                            Intrinsics.checkNotNull(kVar);
                                            this.f7347e = null;
                                            this.f7346d = j.f7374l;
                                            Throwable thT = hVar.t();
                                            if (thT != null) {
                                                rn.q qVar = Result.f14614e;
                                                kVar.resumeWith(ib.a.o(thT));
                                                break;
                                            }
                                            rn.q qVar2 = Result.f14614e;
                                            kVar.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = h.f7358i.getAndIncrement(hVar);
                                        long j7 = j.f7366b;
                                        long j10 = andIncrement2 / j7;
                                        int i10 = (int) (andIncrement2 % j7);
                                        if (oVar3.f9398i != j10) {
                                            oVarS = hVar.s(j10, oVar3);
                                            if (oVarS == null) {
                                            }
                                        } else {
                                            oVarS = oVar3;
                                        }
                                        Object objJ3 = hVar.J(oVarS, i10, andIncrement2, this);
                                        if (objJ3 == j.f7375m) {
                                            b(oVarS, i10);
                                            break;
                                        }
                                        if (objJ3 == j.f7377o) {
                                            if (andIncrement2 < hVar.w()) {
                                                oVarS.b();
                                            }
                                            oVar3 = oVarS;
                                        } else {
                                            if (objJ3 == j.f7376n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            oVarS.b();
                                            this.f7346d = objJ3;
                                            this.f7347e = null;
                                        }
                                    }
                                } else {
                                    oVar.b();
                                    this.f7346d = objJ2;
                                    this.f7347e = null;
                                }
                                kVarP.k(Boolean.TRUE, null);
                                break;
                            }
                            b(oVar, i7);
                            Object objR = kVarP.r();
                            if (objR == wn.a.f22354d) {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            }
                            return objR;
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            kVarP.A();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    oVar.b();
                    this.f7346d = objJ;
                }
            }
            this.f7346d = j.f7374l;
            Throwable thT2 = hVar.t();
            if (thT2 != null) {
                int i11 = fr.v.f9399a;
                throw thT2;
            }
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }

    @Override // ar.a2
    public final void b(fr.u uVar, int i7) {
        ar.k kVar = this.f7347e;
        if (kVar != null) {
            kVar.b(uVar, i7);
        }
    }
}
