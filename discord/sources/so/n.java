package so;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yo.z;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.r f20360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f20362c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f20359e = {kk.b.p(n.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), kk.b.p(n.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), kk.b.p(n.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), kk.b.p(n.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), kk.b.p(n.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), kk.b.p(n.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), kk.b.p(n.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), kk.b.p(n.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f20358d = new m();

    public n(z module, com.google.firebase.messaging.r notFoundClasses) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.f20360a = notFoundClasses;
        this.f20361b = rn.l.a(rn.m.f19486e, new l(module, 0));
        this.f20362c = new m();
    }
}
