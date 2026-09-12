package com.discord.p000native.engine;

import a3.e;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/discord/native/engine/VideoInputDeviceDescription;", "", StackTraceHelper.NAME_KEY, "", "guid", "facing", "Lcom/discord/native/engine/VideoInputDeviceFacing;", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/native/engine/VideoInputDeviceFacing;)V", "getFacing", "()Lcom/discord/native/engine/VideoInputDeviceFacing;", "getGuid", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VideoInputDeviceDescription {

    @NotNull
    private final VideoInputDeviceFacing facing;

    @NotNull
    private final String guid;

    @NotNull
    private final String name;

    public VideoInputDeviceDescription(@NotNull String name, @NotNull String guid, @NotNull VideoInputDeviceFacing facing) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(facing, "facing");
        this.name = name;
        this.guid = guid;
        this.facing = facing;
    }

    public static /* synthetic */ VideoInputDeviceDescription copy$default(VideoInputDeviceDescription videoInputDeviceDescription, String str, String str2, VideoInputDeviceFacing videoInputDeviceFacing, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = videoInputDeviceDescription.name;
        }
        if ((i7 & 2) != 0) {
            str2 = videoInputDeviceDescription.guid;
        }
        if ((i7 & 4) != 0) {
            videoInputDeviceFacing = videoInputDeviceDescription.facing;
        }
        return videoInputDeviceDescription.copy(str, str2, videoInputDeviceFacing);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VideoInputDeviceFacing getFacing() {
        return this.facing;
    }

    @NotNull
    public final VideoInputDeviceDescription copy(@NotNull String name, @NotNull String guid, @NotNull VideoInputDeviceFacing facing) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(facing, "facing");
        return new VideoInputDeviceDescription(name, guid, facing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoInputDeviceDescription)) {
            return false;
        }
        VideoInputDeviceDescription videoInputDeviceDescription = (VideoInputDeviceDescription) other;
        return Intrinsics.areEqual(this.name, videoInputDeviceDescription.name) && Intrinsics.areEqual(this.guid, videoInputDeviceDescription.guid) && this.facing == videoInputDeviceDescription.facing;
    }

    @NotNull
    public final VideoInputDeviceFacing getFacing() {
        return this.facing;
    }

    @NotNull
    public final String getGuid() {
        return this.guid;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.facing.hashCode() + e.d(this.name.hashCode() * 31, 31, this.guid);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.guid;
        VideoInputDeviceFacing videoInputDeviceFacing = this.facing;
        StringBuilder sbU = e.u("VideoInputDeviceDescription(name=", str, ", guid=", str2, ", facing=");
        sbU.append(videoInputDeviceFacing);
        sbU.append(")");
        return sbU.toString();
    }
}
