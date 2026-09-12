package bq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import vq.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f3381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f3382c;

    public d(Ref.ObjectRef objectRef, Function1 function1) {
        this.f3381b = objectRef;
        this.f3382c = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, vo.d] */
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
    @Override // vq.m
    public final void c(Object obj) {
        ?? current = (vo.d) obj;
        Intrinsics.checkNotNullParameter(current, "current");
        Ref.ObjectRef objectRef = this.f3381b;
        if (objectRef.element == 0 && ((Boolean) this.f3382c.invoke(current)).booleanValue()) {
            objectRef.element = current;
        }
    }

    @Override // vq.m
    public final boolean d(Object obj) {
        vo.d current = (vo.d) obj;
        Intrinsics.checkNotNullParameter(current, "current");
        return this.f3381b.element == 0;
    }

    @Override // vq.m
    public final Object k() {
        return (vo.d) this.f3381b.element;
    }
}
