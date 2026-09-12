package e4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7987b;

    public k(String name, String workSpecId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f7986a = name;
        this.f7987b = workSpecId;
    }
}
