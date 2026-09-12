package ip;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.e1;
import lq.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends yo.c {
    public final e4.i I;
    public final bp.c0 J;

    public g0(e4.i c8, bp.c0 javaTypeParameter, int i7, vo.m containingDeclaration) {
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        kq.o oVar = ((hp.a) c8.f7980e).f10957a;
        hp.c cVar = new hp.c(c8, javaTypeParameter, false);
        up.e eVarE = up.e.e(javaTypeParameter.f3343a.getName());
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        super(oVar, containingDeclaration, cVar, eVarE, e1.INVARIANT, false, i7, ((hp.a) c8.f7980e).f10967m);
        this.I = c8;
        this.J = javaTypeParameter;
    }

    @Override // yo.g
    public final List B0(List bounds) {
        mp.o oVar;
        lq.z zVar;
        lq.z zVarA;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        e4.i context = this.I;
        mp.o oVar2 = ((hp.a) context.f7980e).f10972r;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(this, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(bounds, 10));
        Iterator it = bounds.iterator();
        while (it.hasNext()) {
            lq.z zVar2 = (lq.z) it.next();
            mp.n predicate = mp.n.f15999v;
            Intrinsics.checkNotNullParameter(zVar2, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            if (b1.c(zVar2, predicate, null)) {
                oVar = oVar2;
                zVar = zVar2;
            } else {
                oVar = oVar2;
                zVar = zVar2;
                zVarA = oVar.a(new g3.b((wo.a) this, false, context, ep.a.TYPE_PARAMETER_BOUNDS, false), zVar, n0.f14659d, null, false);
                if (zVarA == null) {
                }
                arrayList.add(zVarA);
                oVar2 = oVar;
            }
            zVarA = zVar;
            arrayList.add(zVarA);
            oVar2 = oVar;
        }
        return arrayList;
    }

    @Override // yo.g
    public final void C0(lq.z type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // yo.g
    public final List D0() {
        Type[] bounds = this.J.f3343a.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new bp.q(type));
        }
        bp.q qVar = (bp.q) CollectionsKt.b0(arrayList);
        Collection collection = arrayList;
        if (Intrinsics.areEqual(qVar != null ? qVar.f3366a : null, Object.class)) {
            collection = n0.f14659d;
        }
        boolean zIsEmpty = collection.isEmpty();
        e4.i iVar = this.I;
        if (zIsEmpty) {
            lq.d0 d0VarE = ((hp.a) iVar.f7980e).f10969o.f().e();
            Intrinsics.checkNotNullExpressionValue(d0VarE, "getAnyType(...)");
            lq.d0 d0VarP = ((hp.a) iVar.f7980e).f10969o.f().p();
            Intrinsics.checkNotNullExpressionValue(d0VarP, "getNullableAnyType(...)");
            return kotlin.collections.c0.c(lq.c.e(d0VarE, d0VarP));
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(((e4.m) iVar.f7983w).M((bp.q) it.next(), xr.m.S(z0.f15271e, false, this, 3)));
        }
        return arrayList2;
    }
}
