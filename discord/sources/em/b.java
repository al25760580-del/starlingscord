package em;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8456a;

    public b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f8456a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f8456a, ((b) obj).f8456a);
    }

    public final int hashCode() {
        return this.f8456a.hashCode();
    }

    public final String toString() {
        return s0.g.e("ByName(name=", this.f8456a, ")");
    }
}
