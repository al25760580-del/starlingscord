package k0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f14224b;

    public i(String name, Function2 mergePolicy) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mergePolicy, "mergePolicy");
        this.f14223a = name;
        this.f14224b = mergePolicy;
    }

    public final String toString() {
        return "SemanticsPropertyKey: " + this.f14223a;
    }
}
