package io.sentry.android.replay;

import io.sentry.a6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\"(\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"(\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lio/sentry/a6;", "", "value", "getMaskAllText", "(Lio/sentry/a6;)Z", "setMaskAllText", "(Lio/sentry/a6;Z)V", "maskAllText", "getMaskAllImages", "setMaskAllImages", "maskAllImages", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SessionReplayOptionsKt {
    @d
    public static final boolean getMaskAllImages(@NotNull a6 a6Var) {
        Intrinsics.checkNotNullParameter(a6Var, "<this>");
        throw new IllegalStateException("Getter not supported");
    }

    @d
    public static final boolean getMaskAllText(@NotNull a6 a6Var) {
        Intrinsics.checkNotNullParameter(a6Var, "<this>");
        throw new IllegalStateException("Getter not supported");
    }

    public static final void setMaskAllImages(@NotNull a6 a6Var, boolean z5) {
        Intrinsics.checkNotNullParameter(a6Var, "<this>");
        a6Var.i(z5);
    }

    public static final void setMaskAllText(@NotNull a6 a6Var, boolean z5) {
        Intrinsics.checkNotNullParameter(a6Var, "<this>");
        a6Var.j(z5);
    }
}
