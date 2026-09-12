package mq;

import ar.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.d1;
import lq.e1;
import lq.q0;
import lq.t0;
import lq.y;
import lq.z;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f16017a = new e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lq.y] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lq.y] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [vo.r0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static d0 b(d0 d0Var) {
        z zVarB;
        q0 q0VarR0 = d0Var.r0();
        ?? r5 = 0;
        if (q0VarR0 instanceof yp.c) {
            yp.c cVar = (yp.c) q0VarR0;
            t0 projection = cVar.f23502a;
            t0 t0Var = projection.a() == e1.IN_VARIANCE ? projection : null;
            d1 d1VarW0 = (t0Var == null || (zVarB = t0Var.b()) == null) ? null : zVarB.w0();
            if (cVar.f23503b == null) {
                Collection collectionH = cVar.h();
                ArrayList supertypes = new ArrayList(e0.l(collectionH, 10));
                Iterator it = collectionH.iterator();
                while (it.hasNext()) {
                    supertypes.add(((z) it.next()).w0());
                }
                Intrinsics.checkNotNullParameter(projection, "projection");
                Intrinsics.checkNotNullParameter(supertypes, "supertypes");
                cVar.f23503b = new i(projection, new jq.e(1, supertypes), (r0) r5, 8);
            }
            pq.b bVar = pq.b.f18511d;
            i iVar = cVar.f23503b;
            Intrinsics.checkNotNull(iVar);
            return new h(bVar, iVar, d1VarW0, d0Var.q0(), d0Var.t0(), 32);
        }
        if (!(q0VarR0 instanceof y) || !d0Var.t0()) {
            return d0Var;
        }
        ?? r6 = (y) q0VarR0;
        LinkedHashSet linkedHashSet = r6.f15265b;
        ArrayList typesToIntersect = new ArrayList(e0.l(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z5 = false;
        while (it2.hasNext()) {
            typesToIntersect.add(c9.a.B((z) it2.next()));
            z5 = true;
        }
        if (z5) {
            z zVar = r6.f15264a;
            d1 d1VarB = zVar != null ? c9.a.B(zVar) : null;
            Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
            typesToIntersect.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(typesToIntersect);
            linkedHashSet2.hashCode();
            y yVar = new y(linkedHashSet2);
            yVar.f15264a = d1VarB;
            r5 = yVar;
        }
        if (r5 != 0) {
            r6 = r5;
        }
        return r6.b();
    }

    public final d1 a(pq.d type) {
        d1 d1VarE;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof z)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        d1 origin = ((z) type).w0();
        if (origin instanceof d0) {
            d1VarE = b((d0) origin);
        } else {
            if (!(origin instanceof lq.s)) {
                throw new rn.n();
            }
            lq.s sVar = (lq.s) origin;
            d0 d0Var = sVar.f15249i;
            d0 d0Var2 = sVar.f15248e;
            d0 d0VarB = b(d0Var2);
            d0 d0VarB2 = b(d0Var);
            d1VarE = (d0VarB == d0Var2 && d0VarB2 == d0Var) ? origin : lq.c.e(d0VarB, d0VarB2);
        }
        c1 transform = new c1(1, this, e.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0, 6);
        Intrinsics.checkNotNullParameter(d1VarE, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(transform, "transform");
        z zVarF = lq.c.f(origin);
        return lq.c.G(d1VarE, zVarF != null ? (z) transform.invoke(zVarF) : null);
    }
}
