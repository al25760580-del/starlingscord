package io.sentry.android.replay;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/sentry/android/replay/GeneratedVideo;", "", MediaStreamTrack.VIDEO_TRACK_KIND, "Ljava/io/File;", "frameCount", "", "duration", "", "(Ljava/io/File;IJ)V", "getDuration", "()J", "getFrameCount", "()I", "getVideo", "()Ljava/io/File;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GeneratedVideo {
    public static final int $stable = 8;
    private final long duration;
    private final int frameCount;

    @NotNull
    private final File video;

    public GeneratedVideo(@NotNull File video, int i7, long j) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.video = video;
        this.frameCount = i7;
        this.duration = j;
    }

    public static /* synthetic */ GeneratedVideo copy$default(GeneratedVideo generatedVideo, File file, int i7, long j, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = generatedVideo.video;
        }
        if ((i10 & 2) != 0) {
            i7 = generatedVideo.frameCount;
        }
        if ((i10 & 4) != 0) {
            j = generatedVideo.duration;
        }
        return generatedVideo.copy(file, i7, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFrameCount() {
        return this.frameCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final GeneratedVideo copy(@NotNull File video, int frameCount, long duration) {
        Intrinsics.checkNotNullParameter(video, "video");
        return new GeneratedVideo(video, frameCount, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneratedVideo)) {
            return false;
        }
        GeneratedVideo generatedVideo = (GeneratedVideo) other;
        return Intrinsics.areEqual(this.video, generatedVideo.video) && this.frameCount == generatedVideo.frameCount && this.duration == generatedVideo.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    @NotNull
    public final File getVideo() {
        return this.video;
    }

    public int hashCode() {
        return Long.hashCode(this.duration) + com.discord.chat.presentation.list.a.u(this.frameCount, this.video.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "GeneratedVideo(video=" + this.video + ", frameCount=" + this.frameCount + ", duration=" + this.duration + ')';
    }
}
