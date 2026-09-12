package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wo.h f15217a;

    public j(wo.h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f15217a = annotations;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return Intrinsics.areEqual(((j) obj).f15217a, this.f15217a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15217a.hashCode();
    }
}
