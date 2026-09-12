package bp;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends s implements lp.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeVariable f3343a;

    public c0(TypeVariable typeVariable) {
        Intrinsics.checkNotNullParameter(typeVariable, "typeVariable");
        this.f3343a = typeVariable;
    }

    @Override // lp.b
    public final d a(up.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        TypeVariable typeVariable = this.f3343a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return sa.a.j(declaredAnnotations, fqName);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return Intrinsics.areEqual(this.f3343a, ((c0) obj).f3343a);
        }
        return false;
    }

    @Override // lp.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f3343a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? n0.f14659d : sa.a.l(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f3343a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a3.e.w(c0.class, sb2, ": ");
        sb2.append(this.f3343a);
        return sb2.toString();
    }
}
