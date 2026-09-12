package to;

import eq.n;
import eq.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lq.e1;
import lq.q0;
import so.p;
import vo.e0;
import vo.n0;
import vo.y;
import yo.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends yo.b {
    public static final up.b I;
    public static final up.b J;
    public final int E;
    public final b F;
    public final e G;
    public final List H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kq.l f20855w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e0 f20856x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k f20857y;

    static {
        up.c cVar = p.f20402l;
        up.e eVarE = up.e.e("Function");
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        I = new up.b(cVar, eVarE);
        up.c cVar2 = p.f20401i;
        up.e eVarE2 = up.e.e("KFunction");
        Intrinsics.checkNotNullExpressionValue(eVarE2, "identifier(...)");
        J = new up.b(cVar2, eVarE2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kq.l storageManager, iq.c containingDeclaration, k functionTypeKind, int i7) {
        super(storageManager, functionTypeKind.a(i7));
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
        this.f20855w = storageManager;
        this.f20856x = containingDeclaration;
        this.f20857y = functionTypeKind;
        this.E = i7;
        this.F = new b(this);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(this, "containingClass");
        this.G = new e(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i7, 1);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(intRange, 10));
        Iterator it = intRange.iterator();
        while (((lo.b) it).f15156i) {
            int iNextInt = ((s0) it).nextInt();
            arrayList.add(o0.F0(this, e1.IN_VARIANCE, up.e.e("P" + iNextInt), arrayList.size(), this.f20855w));
            arrayList2.add(Unit.f14616a);
        }
        arrayList.add(o0.F0(this, e1.OUT_VARIANCE, up.e.e("R"), arrayList.size(), this.f20855w));
        this.H = CollectionsKt.i0(arrayList);
        i8.b bVar = d.f20858d;
        k functionTypeKind2 = this.f20857y;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(functionTypeKind2, "functionTypeKind");
        if (Intrinsics.areEqual(functionTypeKind2, g.f20860c) || Intrinsics.areEqual(functionTypeKind2, j.f20863c) || Intrinsics.areEqual(functionTypeKind2, h.f20861c)) {
            return;
        }
        Intrinsics.areEqual(functionTypeKind2, i.f20862c);
    }

    @Override // yo.y
    public final o B(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.G;
    }

    @Override // vo.f
    public final /* bridge */ /* synthetic */ yo.h E() {
        return null;
    }

    @Override // vo.f
    public final /* bridge */ /* synthetic */ o F() {
        return n.f8648b;
    }

    @Override // vo.f
    public final /* bridge */ /* synthetic */ vo.f H() {
        return null;
    }

    @Override // vo.f
    public final vo.g c() {
        return vo.g.f21809e;
    }

    @Override // vo.m
    public final n0 d() {
        vo.o0 NO_SOURCE = n0.C;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // vo.f, vo.x
    public final y e() {
        return y.f21855w;
    }

    @Override // vo.l
    public final vo.l g() {
        return this.f20856x;
    }

    @Override // wo.a
    public final wo.h getAnnotations() {
        return wo.g.f22379a;
    }

    @Override // vo.f, vo.x, vo.o
    public final ep.p getVisibility() {
        ep.p PUBLIC = vo.p.f21828e;
        Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // vo.x
    public final boolean isExternal() {
        return false;
    }

    @Override // vo.f
    public final boolean isInline() {
        return false;
    }

    @Override // vo.f
    public final boolean isValue() {
        return false;
    }

    @Override // vo.f
    public final vo.s0 j0() {
        return null;
    }

    @Override // vo.f, vo.j
    public final List l() {
        return this.H;
    }

    @Override // vo.i
    public final q0 n() {
        return this.F;
    }

    @Override // vo.f
    public final boolean o() {
        return false;
    }

    @Override // vo.x
    public final boolean o0() {
        return false;
    }

    @Override // vo.f
    public final Collection p() {
        return kotlin.collections.n0.f14659d;
    }

    @Override // vo.f
    public final boolean s() {
        return false;
    }

    @Override // vo.f
    public final boolean s0() {
        return false;
    }

    public final String toString() {
        String strB = getName().b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        return strB;
    }

    @Override // vo.f
    public final Collection w() {
        return kotlin.collections.n0.f14659d;
    }

    @Override // vo.x
    public final boolean y() {
        return false;
    }

    @Override // vo.j
    public final boolean z() {
        return false;
    }
}
