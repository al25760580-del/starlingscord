package fp;

import ep.a0;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import so.o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up.e f9337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final up.e f9338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final up.e f9339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f9340d;

    static {
        up.e eVarE = up.e.e("message");
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        f9337a = eVarE;
        up.e eVarE2 = up.e.e("allowedTargets");
        Intrinsics.checkNotNullExpressionValue(eVarE2, "identifier(...)");
        f9338b = eVarE2;
        up.e eVarE3 = up.e.e("value");
        Intrinsics.checkNotNullExpressionValue(eVarE3, "identifier(...)");
        f9339c = eVarE3;
        f9340d = w0.g(new Pair(o.f20386t, a0.f8490c), new Pair(o.f20389w, a0.f8491d), new Pair(o.f20390x, a0.f8493f));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static gp.g a(up.c kotlinName, lp.b annotationOwner, e4.i c8) {
        bp.d dVarA;
        Intrinsics.checkNotNullParameter(kotlinName, "kotlinName");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        Intrinsics.checkNotNullParameter(c8, "c");
        if (Intrinsics.areEqual(kotlinName, o.f20379m)) {
            up.c DEPRECATED_ANNOTATION = a0.f8492e;
            Intrinsics.checkNotNullExpressionValue(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            bp.d dVarA2 = annotationOwner.a(DEPRECATED_ANNOTATION);
            if (dVarA2 != null) {
                return new h(dVarA2, c8);
            }
        }
        up.c cVar = (up.c) f9340d.get(kotlinName);
        if (cVar == null || (dVarA = annotationOwner.a(cVar)) == null) {
            return null;
        }
        return b(dVarA, c8, false);
    }

    public static gp.g b(bp.d annotation, e4.i c8, boolean z5) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c8, "c");
        up.b bVarA = bp.c.a(gn.h.B(gn.h.z(annotation.f3344a)));
        up.c TARGET_ANNOTATION = a0.f8490c;
        Intrinsics.checkNotNullExpressionValue(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (Intrinsics.areEqual(bVarA, yk.a.G(TARGET_ANNOTATION))) {
            return new k(annotation, c8);
        }
        up.c RETENTION_ANNOTATION = a0.f8491d;
        Intrinsics.checkNotNullExpressionValue(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (Intrinsics.areEqual(bVarA, yk.a.G(RETENTION_ANNOTATION))) {
            return new j(annotation, c8);
        }
        up.c DOCUMENTED_ANNOTATION = a0.f8493f;
        Intrinsics.checkNotNullExpressionValue(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (Intrinsics.areEqual(bVarA, yk.a.G(DOCUMENTED_ANNOTATION))) {
            return new c(c8, annotation, o.f20390x);
        }
        up.c DEPRECATED_ANNOTATION = a0.f8492e;
        Intrinsics.checkNotNullExpressionValue(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (Intrinsics.areEqual(bVarA, yk.a.G(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new ip.f(annotation, c8, z5);
    }
}
