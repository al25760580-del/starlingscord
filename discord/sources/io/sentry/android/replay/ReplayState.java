package io.sentry.android.replay;

import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayState;", "", "(Ljava/lang/String;I)V", "INITIAL", "STARTED", "RESUMED", "PAUSED", "STOPPED", "CLOSED", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum ReplayState {
    INITIAL,
    STARTED,
    RESUMED,
    PAUSED,
    STOPPED,
    CLOSED;

    private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }
}
