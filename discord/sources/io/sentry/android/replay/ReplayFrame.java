package io.sentry.android.replay;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/sentry/android/replay/ReplayFrame;", "", "screenshot", "Ljava/io/File;", "timestamp", "", "screen", "", "(Ljava/io/File;JLjava/lang/String;)V", "getScreen", "()Ljava/lang/String;", "getScreenshot", "()Ljava/io/File;", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ReplayFrame {
    public static final int $stable = 8;
    private final String screen;

    @NotNull
    private final File screenshot;
    private final long timestamp;

    public ReplayFrame(@NotNull File screenshot, long j, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.screenshot = screenshot;
        this.timestamp = j;
        this.screen = str;
    }

    public static /* synthetic */ ReplayFrame copy$default(ReplayFrame replayFrame, File file, long j, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            file = replayFrame.screenshot;
        }
        if ((i7 & 2) != 0) {
            j = replayFrame.timestamp;
        }
        if ((i7 & 4) != 0) {
            str = replayFrame.screen;
        }
        return replayFrame.copy(file, j, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getScreenshot() {
        return this.screenshot;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScreen() {
        return this.screen;
    }

    @NotNull
    public final ReplayFrame copy(@NotNull File screenshot, long timestamp, String screen) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        return new ReplayFrame(screenshot, timestamp, screen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplayFrame)) {
            return false;
        }
        ReplayFrame replayFrame = (ReplayFrame) other;
        return Intrinsics.areEqual(this.screenshot, replayFrame.screenshot) && this.timestamp == replayFrame.timestamp && Intrinsics.areEqual(this.screen, replayFrame.screen);
    }

    public final String getScreen() {
        return this.screen;
    }

    @NotNull
    public final File getScreenshot() {
        return this.screenshot;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iH = com.discord.chat.presentation.list.a.h(this.timestamp, this.screenshot.hashCode() * 31, 31);
        String str = this.screen;
        return iH + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReplayFrame(screenshot=");
        sb2.append(this.screenshot);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", screen=");
        return g.g(sb2, this.screen, ')');
    }

    public /* synthetic */ ReplayFrame(File file, long j, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, j, (i7 & 4) != 0 ? null : str);
    }
}
