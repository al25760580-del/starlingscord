package or;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements KType {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final KType f17579d;

    public n0(KType origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f17579d = origin;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        KType kType = n0Var != null ? n0Var.f17579d : null;
        KType kType2 = this.f17579d;
        if (!Intrinsics.areEqual(kType2, kType)) {
            return false;
        }
        mo.c classifier = kType2.getClassifier();
        if (classifier instanceof KClass) {
            KType kType3 = obj instanceof KType ? (KType) obj : null;
            mo.c classifier2 = kType3 != null ? kType3.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return Intrinsics.areEqual(gn.h.B((KClass) classifier), gn.h.B((KClass) classifier2));
            }
        }
        return false;
    }

    @Override // mo.b
    public final List getAnnotations() {
        return this.f17579d.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.f17579d.getArguments();
    }

    @Override // kotlin.reflect.KType
    public final mo.c getClassifier() {
        return this.f17579d.getClassifier();
    }

    public final int hashCode() {
        return this.f17579d.hashCode();
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.f17579d.isMarkedNullable();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f17579d;
    }
}
