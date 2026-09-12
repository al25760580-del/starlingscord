package xp;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lq.q0;
import vo.e0;
import vo.n0;
import vo.r0;
import vo.x;
import yo.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements mq.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f22998a = new c();

    public static /* synthetic */ void b(int i7) {
        Object[] objArr = new Object[3];
        if (i7 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static n0 e(vo.b bVar) {
        while (bVar instanceof vo.d) {
            vo.d dVar = (vo.d) bVar;
            if (dVar.c() != vo.c.f21793e) {
                break;
            }
            Collection collectionH = dVar.h();
            Intrinsics.checkNotNullExpressionValue(collectionH, "getOverriddenDescriptors(...)");
            bVar = (vo.d) CollectionsKt.a0(collectionH);
            if (bVar == null) {
                return null;
            }
        }
        return bVar.d();
    }

    @Override // mq.c
    public boolean a(q0 q0Var, q0 q0Var2) {
        if (q0Var == null) {
            b(0);
            throw null;
        }
        if (q0Var2 != null) {
            return q0Var.equals(q0Var2);
        }
        b(1);
        throw null;
    }

    public boolean c(vo.l lVar, vo.l lVar2, boolean z5) {
        if ((lVar instanceof vo.f) && (lVar2 instanceof vo.f)) {
            return Intrinsics.areEqual(((vo.f) lVar).n(), ((vo.f) lVar2).n());
        }
        if ((lVar instanceof r0) && (lVar2 instanceof r0)) {
            return d((r0) lVar, (r0) lVar2, z5, a.f22995d);
        }
        if (!(lVar instanceof vo.b) || !(lVar2 instanceof vo.b)) {
            return ((lVar instanceof e0) && (lVar2 instanceof e0)) ? Intrinsics.areEqual(((b0) ((e0) lVar)).f23420x, ((b0) ((e0) lVar2)).f23420x) : Intrinsics.areEqual(lVar, lVar2);
        }
        vo.b a10 = (vo.b) lVar;
        vo.b b10 = (vo.b) lVar2;
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        mq.f kotlinTypeRefiner = mq.f.f16018a;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!Intrinsics.areEqual(a10, b10)) {
            if (Intrinsics.areEqual(a10.getName(), b10.getName()) && ((!(a10 instanceof x) || !(b10 instanceof x) || ((x) a10).y() == ((x) b10).y()) && ((!Intrinsics.areEqual(a10.g(), b10.g()) || (z5 && Intrinsics.areEqual(e(a10), e(b10)))) && !e.o(a10) && !e.o(b10)))) {
                vo.l lVarG = a10.g();
                vo.l lVarG2 = b10.g();
                if (((lVarG instanceof vo.d) || (lVarG2 instanceof vo.d)) ? false : c(lVarG, lVarG2, z5)) {
                    gc.b bVar = new gc.b();
                    bVar.f9562b = z5;
                    bVar.f9561a = a10;
                    bVar.f9563c = b10;
                    l lVar3 = new l(bVar);
                    Intrinsics.checkNotNullExpressionValue(lVar3, "create(...)");
                    j jVarB = lVar3.m(a10, b10, null, true).b();
                    j jVar = j.f23004d;
                    if (jVarB != jVar || lVar3.m(b10, a10, null, true).b() != jVar) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean d(r0 a10, r0 b10, boolean z5, Function2 equivalentCallables) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.areEqual(a10, b10)) {
            return true;
        }
        if (Intrinsics.areEqual(a10.g(), b10.g())) {
            return false;
        }
        vo.l lVarG = a10.g();
        vo.l lVarG2 = b10.g();
        return (((lVarG instanceof vo.d) || (lVarG2 instanceof vo.d)) ? ((Boolean) equivalentCallables.invoke(lVarG, lVarG2)).booleanValue() : c(lVarG, lVarG2, z5)) && a10.getIndex() == b10.getIndex();
    }
}
