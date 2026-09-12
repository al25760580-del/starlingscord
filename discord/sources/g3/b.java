package g3;

import android.content.Context;
import e4.i;
import ep.w;
import ip.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.d0;
import lq.s;
import lq.z;
import mp.g;
import mp.h;
import vo.r0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9465e;

    public b(wo.a aVar, boolean z5, i containerContext, ep.a containerApplicabilityType, boolean z6) {
        Intrinsics.checkNotNullParameter(containerContext, "containerContext");
        Intrinsics.checkNotNullParameter(containerApplicabilityType, "containerApplicabilityType");
        this.f9463c = aVar;
        this.f9461a = z5;
        this.f9464d = containerContext;
        this.f9465e = containerApplicabilityType;
        this.f9462b = z6;
    }

    public static void a(Object obj, ArrayList arrayList, bp.i iVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) iVar.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, iVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:64:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[LOOP:3: B:26:0x0063->B:65:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable, java.util.Collection] */
    public static h b(r0 receiver) {
        ?? arrayList;
        z zVarF;
        g gVar;
        Intrinsics.checkNotNullParameter(receiver, "<this>");
        if (!(receiver instanceof g0)) {
            return null;
        }
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        List<pq.d> upperBounds = ((yo.g) receiver).getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!e4.f.S((pq.d) it.next())) {
                if (upperBounds.isEmpty()) {
                    if (upperBounds.isEmpty()) {
                        return null;
                    }
                    for (pq.d dVar : upperBounds) {
                        Intrinsics.checkNotNullParameter(dVar, "<this>");
                        if (lq.c.f((z) dVar) != null) {
                            arrayList = new ArrayList();
                            for (pq.d dVar2 : upperBounds) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                zVarF = lq.c.f((z) dVar2);
                                if (zVarF != null) {
                                    arrayList.add(zVarF);
                                }
                            }
                        }
                    }
                    return null;
                }
                Iterator it2 = upperBounds.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        if (upperBounds.isEmpty()) {
                            return null;
                        }
                        while (r1.hasNext()) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            if (lq.c.f((z) dVar) != null) {
                                arrayList = new ArrayList();
                                while (r2.hasNext()) {
                                    Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                    zVarF = lq.c.f((z) dVar2);
                                    if (zVarF != null) {
                                        arrayList.add(zVarF);
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    if (d((pq.d) it2.next()) != null) {
                        arrayList = upperBounds;
                    }
                }
                if (arrayList.isEmpty()) {
                    gVar = g.f15977e;
                    break;
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        gVar = g.f15977e;
                        break;
                    }
                    if (!e4.f.Y((pq.d) it3.next())) {
                        gVar = g.f15978i;
                        break;
                    }
                }
                return new h(gVar, arrayList != upperBounds);
            }
        }
        return null;
    }

    public static up.d c(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        if (d0Var == null) {
            b1.a(30);
            throw null;
        }
        nq.i iVar = b1.f15178a;
        vo.i iVarG = d0Var.r0().g();
        vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
        if (fVar != null) {
            return xp.e.g(fVar);
        }
        return null;
    }

    public static g d(pq.d dVar) {
        d0 d0VarM;
        d0 d0VarM2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        s sVarL = e4.f.l(dVar);
        if (sVarL == null || (d0VarM = e4.f.h0(sVarL)) == null) {
            d0VarM = e4.f.m(dVar);
            Intrinsics.checkNotNull(d0VarM);
        }
        if (e4.f.W(d0VarM)) {
            return g.f15977e;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        s sVarL2 = e4.f.l(dVar);
        if (sVarL2 == null || (d0VarM2 = e4.f.x0(sVarL2)) == null) {
            d0VarM2 = e4.f.m(dVar);
            Intrinsics.checkNotNull(d0VarM2);
        }
        if (e4.f.W(d0VarM2)) {
            return null;
        }
        return g.f15978i;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public ArrayList e(pq.d dVar) {
        i iVar = (i) this.f9464d;
        w wVar = (w) iVar.f7982v.getValue();
        ep.b bVar = ((hp.a) iVar.f7980e).f10971q;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        mp.a aVar = new mp.a(dVar, bVar.b(wVar, ((z) dVar).getAnnotations()), null);
        bp.i iVar2 = new bp.i(14, this);
        ArrayList arrayList = new ArrayList(1);
        a(aVar, arrayList, iVar2);
        return arrayList;
    }

    public b(Context context, String str, a1.d callback, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f9463c = context;
        this.f9464d = str;
        this.f9465e = callback;
        this.f9461a = z5;
        this.f9462b = z6;
    }
}
