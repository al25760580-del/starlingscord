package uo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up.b f21194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final up.b f21195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final up.b f21196c;

    public c(up.b javaClass, up.b kotlinReadOnly, up.b kotlinMutable) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        Intrinsics.checkNotNullParameter(kotlinReadOnly, "kotlinReadOnly");
        Intrinsics.checkNotNullParameter(kotlinMutable, "kotlinMutable");
        this.f21194a = javaClass;
        this.f21195b = kotlinReadOnly;
        this.f21196c = kotlinMutable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f21194a, cVar.f21194a) && Intrinsics.areEqual(this.f21195b, cVar.f21195b) && Intrinsics.areEqual(this.f21196c, cVar.f21196c);
    }

    public final int hashCode() {
        return this.f21196c.hashCode() + ((this.f21195b.hashCode() + (this.f21194a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f21194a + ", kotlinReadOnly=" + this.f21195b + ", kotlinMutable=" + this.f21196c + ')';
    }
}
