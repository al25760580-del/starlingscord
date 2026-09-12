package io.sentry.android.replay.util;

import io.sentry.util.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/sentry/util/i;", "", "rate", "", "sample", "(Lio/sentry/util/i;Ljava/lang/Double;)Z", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SamplingKt {
    public static final boolean sample(@NotNull i iVar, Double d6) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return d6 != null && d6.doubleValue() >= iVar.c();
    }
}
