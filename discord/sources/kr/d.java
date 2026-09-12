package kr;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.n0;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends or.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f14798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14800c;

    public d(KClass baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f14798a = baseClass;
        this.f14799b = n0.f14659d;
        this.f14800c = l.a(m.f19486e, new i6.a(6, this));
    }

    @Override // or.b
    public final KClass c() {
        return this.f14798a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f14800c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f14798a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(KClass baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.f14799b = w.b(classAnnotations);
    }
}
