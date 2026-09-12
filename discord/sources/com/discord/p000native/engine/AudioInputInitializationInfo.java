package com.discord.p000native.engine;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/discord/native/engine/AudioInputInitializationInfo;", "", "description", "Lcom/discord/native/engine/AudioInputDeviceDescription;", "timeToInitializedNanos", "", "(Lcom/discord/native/engine/AudioInputDeviceDescription;J)V", "getDescription", "()Lcom/discord/native/engine/AudioInputDeviceDescription;", "getTimeToInitializedNanos", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AudioInputInitializationInfo {

    @NotNull
    private final AudioInputDeviceDescription description;
    private final long timeToInitializedNanos;

    public AudioInputInitializationInfo(@NotNull AudioInputDeviceDescription description, long j) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.description = description;
        this.timeToInitializedNanos = j;
    }

    public static /* synthetic */ AudioInputInitializationInfo copy$default(AudioInputInitializationInfo audioInputInitializationInfo, AudioInputDeviceDescription audioInputDeviceDescription, long j, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            audioInputDeviceDescription = audioInputInitializationInfo.description;
        }
        if ((i7 & 2) != 0) {
            j = audioInputInitializationInfo.timeToInitializedNanos;
        }
        return audioInputInitializationInfo.copy(audioInputDeviceDescription, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AudioInputDeviceDescription getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimeToInitializedNanos() {
        return this.timeToInitializedNanos;
    }

    @NotNull
    public final AudioInputInitializationInfo copy(@NotNull AudioInputDeviceDescription description, long timeToInitializedNanos) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new AudioInputInitializationInfo(description, timeToInitializedNanos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioInputInitializationInfo)) {
            return false;
        }
        AudioInputInitializationInfo audioInputInitializationInfo = (AudioInputInitializationInfo) other;
        return Intrinsics.areEqual(this.description, audioInputInitializationInfo.description) && this.timeToInitializedNanos == audioInputInitializationInfo.timeToInitializedNanos;
    }

    @NotNull
    public final AudioInputDeviceDescription getDescription() {
        return this.description;
    }

    public final long getTimeToInitializedNanos() {
        return this.timeToInitializedNanos;
    }

    public int hashCode() {
        return Long.hashCode(this.timeToInitializedNanos) + (this.description.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AudioInputInitializationInfo(description=" + this.description + ", timeToInitializedNanos=" + this.timeToInitializedNanos + ")";
    }
}
