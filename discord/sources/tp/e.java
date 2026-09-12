package tp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends io.sentry.config.a {
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f20875l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String name, String desc) {
        super(17);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.k = name;
        this.f20875l = desc;
    }

    @Override // io.sentry.config.a
    public final String c() {
        return this.k + this.f20875l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.k, eVar.k) && Intrinsics.areEqual(this.f20875l, eVar.f20875l);
    }

    public final int hashCode() {
        return this.f20875l.hashCode() + (this.k.hashCode() * 31);
    }
}
