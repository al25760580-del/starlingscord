package g0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p, g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.e f9447d;

    public j(g intrinsicMeasureScope, m0.e layoutDirection) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f9447d = layoutDirection;
    }

    @Override // g0.g
    public final m0.e getLayoutDirection() {
        return this.f9447d;
    }
}
