package z9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f23631c = new c("UNKNOWN", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23633b;

    public c(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f23632a = name;
        this.f23633b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f23632a, cVar.f23632a) && Intrinsics.areEqual(this.f23633b, cVar.f23633b);
    }

    public final int hashCode() {
        int iHashCode = this.f23632a.hashCode() * 31;
        String str = this.f23633b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.f23632a;
    }
}
