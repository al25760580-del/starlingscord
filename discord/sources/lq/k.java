package lq;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f15220a = {kk.b.p(k.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o9.d f15221b;

    static {
        e4.r rVar = l0.f15225e;
        KClass kClass = Reflection.getOrCreateKotlinClass(j.class);
        rVar.getClass();
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String qualifiedName = kClass.getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName);
        o9.d dVar = new o9.d(rVar.H(qualifiedName), 8);
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f15221b = dVar;
    }

    public static final wo.h a(l0 l0Var) {
        wo.h hVar;
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        j jVar = (j) f15221b.getValue(l0Var, f15220a[0]);
        return (jVar == null || (hVar = jVar.f15217a) == null) ? wo.g.f22379a : hVar;
    }
}
