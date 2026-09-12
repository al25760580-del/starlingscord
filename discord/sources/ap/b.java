package ap;

import gs.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f2856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f2857b;

    public b(Class cls, o oVar) {
        this.f2856a = cls;
        this.f2857b = oVar;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f2856a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(x.m(name, '.', '/'));
        sb2.append(".class");
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return Intrinsics.areEqual(this.f2856a, ((b) obj).f2856a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2856a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a3.e.w(b.class, sb2, ": ");
        sb2.append(this.f2856a);
        return sb2.toString();
    }
}
