package po;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends c9.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tp.e f18098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18099i;

    public j(tp.e signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f18098h = signature;
        this.f18099i = signature.c();
    }

    @Override // c9.a
    public final String d() {
        return this.f18099i;
    }
}
