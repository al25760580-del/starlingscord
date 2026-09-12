package tp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends io.sentry.config.a {
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f20874l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String name, String desc) {
        super(17);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.k = name;
        this.f20874l = desc;
    }

    @Override // io.sentry.config.a
    public final String c() {
        return this.k + ':' + this.f20874l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.k, dVar.k) && Intrinsics.areEqual(this.f20874l, dVar.f20874l);
    }

    public final int hashCode() {
        return this.f20874l.hashCode() + (this.k.hashCode() * 31);
    }
}
