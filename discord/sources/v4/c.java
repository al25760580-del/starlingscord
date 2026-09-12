package v4;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import io.sentry.w1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21449a = io.sentry.internal.debugmeta.c.D0("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21450b = io.sentry.internal.debugmeta.c.D0("k");

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:75:0x0178  */
    public static r4.d a(w4.b bVar, l4.i iVar) {
        r4.a aVar;
        r4.b bVarL;
        List list;
        r4.b bVar2;
        r4.b bVar3;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z5 = bVar.B() == 3;
        if (z5) {
            bVar.f();
        }
        r4.b bVar4 = null;
        r4.b bVarL2 = null;
        w1 w1VarA = null;
        r4.e eVarB = null;
        r4.a aVar2 = null;
        r4.b bVarL3 = null;
        r4.a aVarN = null;
        r4.b bVarL4 = null;
        r4.b bVarL5 = null;
        while (bVar.n()) {
            switch (bVar.P(f21449a)) {
                case 0:
                    bVar.f();
                    while (bVar.n()) {
                        if (bVar.P(f21450b) != 0) {
                            bVar.Q();
                            bVar.T();
                        } else {
                            w1VarA = a.a(bVar, iVar);
                        }
                    }
                    bVar.i();
                    bVarL2 = bVarL2;
                    break;
                case 1:
                    eVarB = a.b(bVar, iVar);
                    break;
                case 2:
                    aVar2 = new r4.a(4, p.a(bVar, iVar, 1.0f, f.f21460y, false));
                    bVarL2 = bVarL2;
                    break;
                case 3:
                    iVar.a("Lottie doesn't support 3D layers.");
                    bVarL = gn.h.L(bVar, iVar, false);
                    list = (List) bVarL.f9357e;
                    if (list.isEmpty()) {
                        bVar2 = bVarL;
                        bVar3 = bVarL2;
                        list.add(new y4.a(iVar, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(iVar.f14873m)));
                    } else {
                        bVar2 = bVarL;
                        bVar3 = bVarL2;
                        if (((y4.a) list.get(0)).f23194b == null) {
                            list.set(0, new y4.a(iVar, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(iVar.f14873m)));
                        }
                    }
                    bVarL2 = bVar3;
                    bVar4 = bVar2;
                    break;
                case 4:
                    bVarL = gn.h.L(bVar, iVar, false);
                    list = (List) bVarL.f9357e;
                    if (list.isEmpty()) {
                        bVar2 = bVarL;
                        bVar3 = bVarL2;
                        list.add(new y4.a(iVar, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(iVar.f14873m)));
                    } else {
                        bVar2 = bVarL;
                        bVar3 = bVarL2;
                        if (((y4.a) list.get(0)).f23194b == null) {
                            list.set(0, new y4.a(iVar, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(iVar.f14873m)));
                        }
                    }
                    bVarL2 = bVar3;
                    bVar4 = bVar2;
                    break;
                case 5:
                    aVarN = gn.h.N(bVar, iVar);
                    break;
                case 6:
                    bVarL4 = gn.h.L(bVar, iVar, false);
                    break;
                case 7:
                    bVarL5 = gn.h.L(bVar, iVar, false);
                    break;
                case 8:
                    bVarL3 = gn.h.L(bVar, iVar, false);
                    break;
                case 9:
                    bVarL2 = gn.h.L(bVar, iVar, false);
                    break;
                default:
                    bVar.Q();
                    bVar.T();
                    break;
            }
        }
        r4.b bVar5 = bVarL2;
        if (z5) {
            bVar.i();
        }
        w1 w1Var = (w1VarA == null || (w1VarA.t0() && ((PointF) ((y4.a) w1VarA.f13269d.get(0)).f23194b).equals(0.0f, 0.0f))) ? null : w1VarA;
        if (eVarB == null || (!(eVarB instanceof r4.c) && eVarB.t0() && ((PointF) ((y4.a) eVarB.q0().get(0)).f23194b).equals(0.0f, 0.0f))) {
            eVarB = null;
        }
        r4.b bVar6 = (bVar4 == null || (bVar4.t0() && ((Float) ((y4.a) ((List) bVar4.f9357e).get(0)).f23194b).floatValue() == 0.0f)) ? null : bVar4;
        if (aVar2 == null) {
            aVar = null;
        } else {
            if (aVar2.t0()) {
                y4.b bVar7 = (y4.b) ((y4.a) ((List) aVar2.f9357e).get(0)).f23194b;
                if (bVar7.f23207a == 1.0f && bVar7.f23208b == 1.0f) {
                    aVar = null;
                }
            }
            aVar = aVar2;
        }
        return new r4.d(w1Var, eVarB, aVar, bVar6, aVarN, bVarL4, bVarL5, (bVarL3 == null || (bVarL3.t0() && ((Float) ((y4.a) ((List) bVarL3.f9357e).get(0)).f23194b).floatValue() == 0.0f)) ? null : bVarL3, (bVar5 == null || (bVar5.t0() && ((Float) ((y4.a) ((List) bVar5.f9357e).get(0)).f23194b).floatValue() == 0.0f)) ? null : bVar5);
    }
}
