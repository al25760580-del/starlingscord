package io.sentry.android.replay.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l0.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/sentry/android/replay/util/ComposeTextLayout;", "Lio/sentry/android/replay/util/TextLayout;", "Ll0/a;", "layout", "", "hasFillModifier", "<init>", "(Ll0/a;Z)V", "", "line", "offset", "", "getPrimaryHorizontal", "(II)F", "getEllipsisCount", "(I)I", "getLineVisibleEnd", "getLineTop", "getLineBottom", "getLineStart", "Ll0/a;", "getLayout$sentry_android_replay_release", "()Ll0/a;", "Z", "getLineCount", "()I", "lineCount", "getDominantTextColor", "()Ljava/lang/Integer;", "dominantTextColor", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeTextLayout implements TextLayout {
    public static final int $stable = 8;
    private final boolean hasFillModifier;

    @NotNull
    private final a layout;

    public ComposeTextLayout(@NotNull a layout, boolean z5) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.hasFillModifier = z5;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public Integer getDominantTextColor() {
        return null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getEllipsisCount(int line) {
        throw null;
    }

    @NotNull
    public final a getLayout$sentry_android_replay_release() {
        return null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineBottom(int line) {
        throw null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineCount() {
        throw null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineStart(int line) {
        throw null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineTop(int line) {
        throw null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineVisibleEnd(int line) {
        throw null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public float getPrimaryHorizontal(int line, int offset) {
        throw null;
    }
}
