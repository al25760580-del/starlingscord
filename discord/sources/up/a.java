package up;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f21256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f21257b;

    static {
        e eVar = g.f21278f;
        c cVar = c.f21261c;
        zs.a.Y(eVar);
    }

    public a(c packageName, e callableName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
        this.f21256a = packageName;
        this.f21257b = callableName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f21256a, aVar.f21256a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f21257b, aVar.f21257b);
    }

    public final int hashCode() {
        return this.f21257b.hashCode() + ((this.f21256a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return x.m(this.f21256a.f21262a.f21265a, '.', '/') + "/" + this.f21257b;
    }
}
