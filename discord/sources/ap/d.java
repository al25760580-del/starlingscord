package ap;

import bp.s;
import hq.m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f2859b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f2860c = new d();

    @Override // hq.m
    public void a(vo.f descriptor, ArrayList unresolvedSuperClasses) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }

    @Override // hq.m
    public void b(vo.d descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    public f c(lp.c javaElement) {
        Intrinsics.checkNotNullParameter(javaElement, "javaElement");
        return new f((s) javaElement);
    }
}
