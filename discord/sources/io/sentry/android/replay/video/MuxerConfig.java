package io.sentry.android.replay.video;

import android.annotation.TargetApi;
import com.discord.chat.presentation.list.a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0015¨\u0006$"}, d2 = {"Lio/sentry/android/replay/video/MuxerConfig;", "", "file", "Ljava/io/File;", "recordingWidth", "", "recordingHeight", "frameRate", "bitRate", "mimeType", "", "(Ljava/io/File;IIIILjava/lang/String;)V", "getBitRate", "()I", "getFile", "()Ljava/io/File;", "getFrameRate", "getMimeType", "()Ljava/lang/String;", "getRecordingHeight", "setRecordingHeight", "(I)V", "getRecordingWidth", "setRecordingWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(24)
public final /* data */ class MuxerConfig {
    public static final int $stable = 8;
    private final int bitRate;

    @NotNull
    private final File file;
    private final int frameRate;

    @NotNull
    private final String mimeType;
    private int recordingHeight;
    private int recordingWidth;

    public MuxerConfig(@NotNull File file, int i7, int i10, int i11, int i12, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.file = file;
        this.recordingWidth = i7;
        this.recordingHeight = i10;
        this.frameRate = i11;
        this.bitRate = i12;
        this.mimeType = mimeType;
    }

    public static /* synthetic */ MuxerConfig copy$default(MuxerConfig muxerConfig, File file, int i7, int i10, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            file = muxerConfig.file;
        }
        if ((i13 & 2) != 0) {
            i7 = muxerConfig.recordingWidth;
        }
        if ((i13 & 4) != 0) {
            i10 = muxerConfig.recordingHeight;
        }
        if ((i13 & 8) != 0) {
            i11 = muxerConfig.frameRate;
        }
        if ((i13 & 16) != 0) {
            i12 = muxerConfig.bitRate;
        }
        if ((i13 & 32) != 0) {
            str = muxerConfig.mimeType;
        }
        int i14 = i12;
        String str2 = str;
        return muxerConfig.copy(file, i7, i10, i11, i14, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBitRate() {
        return this.bitRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final MuxerConfig copy(@NotNull File file, int recordingWidth, int recordingHeight, int frameRate, int bitRate, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new MuxerConfig(file, recordingWidth, recordingHeight, frameRate, bitRate, mimeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MuxerConfig)) {
            return false;
        }
        MuxerConfig muxerConfig = (MuxerConfig) other;
        return Intrinsics.areEqual(this.file, muxerConfig.file) && this.recordingWidth == muxerConfig.recordingWidth && this.recordingHeight == muxerConfig.recordingHeight && this.frameRate == muxerConfig.frameRate && this.bitRate == muxerConfig.bitRate && Intrinsics.areEqual(this.mimeType, muxerConfig.mimeType);
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public int hashCode() {
        return this.mimeType.hashCode() + a.u(this.bitRate, a.u(this.frameRate, a.u(this.recordingHeight, a.u(this.recordingWidth, this.file.hashCode() * 31, 31), 31), 31), 31);
    }

    public final void setRecordingHeight(int i7) {
        this.recordingHeight = i7;
    }

    public final void setRecordingWidth(int i7) {
        this.recordingWidth = i7;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MuxerConfig(file=");
        sb2.append(this.file);
        sb2.append(", recordingWidth=");
        sb2.append(this.recordingWidth);
        sb2.append(", recordingHeight=");
        sb2.append(this.recordingHeight);
        sb2.append(", frameRate=");
        sb2.append(this.frameRate);
        sb2.append(", bitRate=");
        sb2.append(this.bitRate);
        sb2.append(", mimeType=");
        return g.g(sb2, this.mimeType, ')');
    }

    public /* synthetic */ MuxerConfig(File file, int i7, int i10, int i11, int i12, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i7, i10, i11, i12, (i13 & 32) != 0 ? "video/avc" : str);
    }
}
