package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 extends w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f15247b = new f();

    @Override // lq.w0
    public final t0 e(z key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return h(key.r0());
    }

    public abstract t0 h(q0 q0Var);
}
