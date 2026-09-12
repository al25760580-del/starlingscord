package co;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f3751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3752b;

    public d(File root, List segments) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f3751a = root;
        this.f3752b = segments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f3751a, dVar.f3751a) && Intrinsics.areEqual(this.f3752b, dVar.f3752b);
    }

    public final int hashCode() {
        return this.f3752b.hashCode() + (this.f3751a.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f3751a + ", segments=" + this.f3752b + ')';
    }
}
