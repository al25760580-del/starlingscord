package h3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f10301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f10302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f callbackName, Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f10301d = callbackName;
        this.f10302e = cause;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f10302e;
    }
}
