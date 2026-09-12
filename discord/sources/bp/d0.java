package bp;

import java.lang.annotation.Annotation;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends s implements lp.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f3345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation[] f3346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3348d;

    public d0(b0 type, Annotation[] reflectAnnotations, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reflectAnnotations, "reflectAnnotations");
        this.f3345a = type;
        this.f3346b = reflectAnnotations;
        this.f3347c = str;
        this.f3348d = z5;
    }

    @Override // lp.b
    public final d a(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return sa.a.j(this.f3346b, fqName);
    }

    @Override // lp.b
    public final Collection getAnnotations() {
        return sa.a.l(this.f3346b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a3.e.w(d0.class, sb2, ": ");
        sb2.append(this.f3348d ? "vararg " : "");
        String str = this.f3347c;
        sb2.append(str != null ? up.e.d(str) : null);
        sb2.append(": ");
        sb2.append(this.f3345a);
        return sb2.toString();
    }
}
