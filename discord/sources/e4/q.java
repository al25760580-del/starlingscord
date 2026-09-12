package e4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8032b;

    public q(String tag, String workSpecId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f8031a = tag;
        this.f8032b = workSpecId;
    }
}
