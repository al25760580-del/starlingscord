package to;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up.c f20864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20865b;

    public k(String classNamePrefix, up.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(classNamePrefix, "classNamePrefix");
        this.f20864a = packageFqName;
        this.f20865b = classNamePrefix;
    }

    public final up.e a(int i7) {
        up.e eVarE = up.e.e(this.f20865b + i7);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return eVarE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20864a);
        sb2.append('.');
        return s0.g.g(sb2, this.f20865b, 'N');
    }
}
