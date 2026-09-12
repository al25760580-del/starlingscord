package ip;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f13394e;

    public /* synthetic */ x(b0 b0Var, int i7) {
        this.f13393d = i7;
        this.f13394e = b0Var;
    }

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
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13393d) {
            case 0:
                eq.f kindFilter = eq.f.f8623m;
                eq.o.f8649a.getClass();
                eq.l nameFilter = eq.l.f8642e;
                Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
                Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
                dp.c cVar = dp.c.f7696v;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zA = kindFilter.a(eq.f.f8622l);
                List list = kindFilter.f8630a;
                b0 b0Var = this.f13394e;
                if (zA) {
                    for (up.e eVar : b0Var.h(kindFilter, nameFilter)) {
                        nameFilter.invoke(eVar);
                        vq.m.b(linkedHashSet, b0Var.g(eVar, cVar));
                    }
                }
                if (kindFilter.a(eq.f.f8621i) && !list.contains(eq.b.f8610a)) {
                    for (up.e eVar2 : b0Var.i(kindFilter, nameFilter)) {
                        nameFilter.invoke(eVar2);
                        linkedHashSet.addAll(b0Var.c(eVar2, cVar));
                    }
                }
                if (kindFilter.a(eq.f.j) && !list.contains(eq.b.f8610a)) {
                    for (up.e eVar3 : b0Var.o(kindFilter)) {
                        nameFilter.invoke(eVar3);
                        linkedHashSet.addAll(b0Var.a(eVar3, cVar));
                    }
                }
                return CollectionsKt.i0(linkedHashSet);
            case 1:
                return this.f13394e.k();
            case 2:
                return this.f13394e.i(eq.f.f8626p, null);
            case 3:
                return this.f13394e.o(eq.f.f8627q);
            default:
                return this.f13394e.h(eq.f.f8625o, null);
        }
    }
}
