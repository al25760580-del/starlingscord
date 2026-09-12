package h2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10290a;

    public c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f10290a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return Intrinsics.areEqual(this.f10290a, ((c) obj).f10290a);
    }

    public final int hashCode() {
        return this.f10290a.hashCode();
    }

    public final String toString() {
        return this.f10290a;
    }
}
