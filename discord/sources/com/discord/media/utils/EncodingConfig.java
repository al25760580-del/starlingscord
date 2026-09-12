package com.discord.media.utils;

import a3.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003Jc\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006+"}, d2 = {"Lcom/discord/media/utils/EncodingConfig;", "", Snapshot.TARGET_WIDTH, "", Snapshot.TARGET_HEIGHT, "frameRate", "", "keyFrameIntervalSeconds", "targetBitrate", "useHEVC", "", "createHDR", "rotationDegrees", "progressUpdateGranularity", "<init>", "(IILjava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;ZZLjava/lang/Number;I)V", "getTargetWidth", "()I", "getTargetHeight", "getFrameRate", "()Ljava/lang/Number;", "getKeyFrameIntervalSeconds", "getTargetBitrate", "getUseHEVC", "()Z", "getCreateHDR", "getRotationDegrees", "getProgressUpdateGranularity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EncodingConfig {
    private final boolean createHDR;

    @NotNull
    private final Number frameRate;

    @NotNull
    private final Number keyFrameIntervalSeconds;
    private final int progressUpdateGranularity;

    @NotNull
    private final Number rotationDegrees;

    @NotNull
    private final Number targetBitrate;
    private final int targetHeight;
    private final int targetWidth;
    private final boolean useHEVC;

    public EncodingConfig(int i7, int i10, @NotNull Number frameRate, @NotNull Number keyFrameIntervalSeconds, @NotNull Number targetBitrate, boolean z5, boolean z6, @NotNull Number rotationDegrees, int i11) {
        Intrinsics.checkNotNullParameter(frameRate, "frameRate");
        Intrinsics.checkNotNullParameter(keyFrameIntervalSeconds, "keyFrameIntervalSeconds");
        Intrinsics.checkNotNullParameter(targetBitrate, "targetBitrate");
        Intrinsics.checkNotNullParameter(rotationDegrees, "rotationDegrees");
        this.targetWidth = i7;
        this.targetHeight = i10;
        this.frameRate = frameRate;
        this.keyFrameIntervalSeconds = keyFrameIntervalSeconds;
        this.targetBitrate = targetBitrate;
        this.useHEVC = z5;
        this.createHDR = z6;
        this.rotationDegrees = rotationDegrees;
        this.progressUpdateGranularity = i11;
    }

    public static /* synthetic */ EncodingConfig copy$default(EncodingConfig encodingConfig, int i7, int i10, Number number, Number number2, Number number3, boolean z5, boolean z6, Number number4, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i7 = encodingConfig.targetWidth;
        }
        if ((i12 & 2) != 0) {
            i10 = encodingConfig.targetHeight;
        }
        if ((i12 & 4) != 0) {
            number = encodingConfig.frameRate;
        }
        if ((i12 & 8) != 0) {
            number2 = encodingConfig.keyFrameIntervalSeconds;
        }
        if ((i12 & 16) != 0) {
            number3 = encodingConfig.targetBitrate;
        }
        if ((i12 & 32) != 0) {
            z5 = encodingConfig.useHEVC;
        }
        if ((i12 & 64) != 0) {
            z6 = encodingConfig.createHDR;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            number4 = encodingConfig.rotationDegrees;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            i11 = encodingConfig.progressUpdateGranularity;
        }
        Number number5 = number4;
        int i13 = i11;
        boolean z7 = z5;
        boolean z10 = z6;
        Number number6 = number3;
        Number number7 = number;
        return encodingConfig.copy(i7, i10, number7, number2, number6, z7, z10, number5, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTargetWidth() {
        return this.targetWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTargetHeight() {
        return this.targetHeight;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Number getFrameRate() {
        return this.frameRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Number getKeyFrameIntervalSeconds() {
        return this.keyFrameIntervalSeconds;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Number getTargetBitrate() {
        return this.targetBitrate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getUseHEVC() {
        return this.useHEVC;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getCreateHDR() {
        return this.createHDR;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Number getRotationDegrees() {
        return this.rotationDegrees;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getProgressUpdateGranularity() {
        return this.progressUpdateGranularity;
    }

    @NotNull
    public final EncodingConfig copy(int targetWidth, int targetHeight, @NotNull Number frameRate, @NotNull Number keyFrameIntervalSeconds, @NotNull Number targetBitrate, boolean useHEVC, boolean createHDR, @NotNull Number rotationDegrees, int progressUpdateGranularity) {
        Intrinsics.checkNotNullParameter(frameRate, "frameRate");
        Intrinsics.checkNotNullParameter(keyFrameIntervalSeconds, "keyFrameIntervalSeconds");
        Intrinsics.checkNotNullParameter(targetBitrate, "targetBitrate");
        Intrinsics.checkNotNullParameter(rotationDegrees, "rotationDegrees");
        return new EncodingConfig(targetWidth, targetHeight, frameRate, keyFrameIntervalSeconds, targetBitrate, useHEVC, createHDR, rotationDegrees, progressUpdateGranularity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncodingConfig)) {
            return false;
        }
        EncodingConfig encodingConfig = (EncodingConfig) other;
        return this.targetWidth == encodingConfig.targetWidth && this.targetHeight == encodingConfig.targetHeight && Intrinsics.areEqual(this.frameRate, encodingConfig.frameRate) && Intrinsics.areEqual(this.keyFrameIntervalSeconds, encodingConfig.keyFrameIntervalSeconds) && Intrinsics.areEqual(this.targetBitrate, encodingConfig.targetBitrate) && this.useHEVC == encodingConfig.useHEVC && this.createHDR == encodingConfig.createHDR && Intrinsics.areEqual(this.rotationDegrees, encodingConfig.rotationDegrees) && this.progressUpdateGranularity == encodingConfig.progressUpdateGranularity;
    }

    public final boolean getCreateHDR() {
        return this.createHDR;
    }

    @NotNull
    public final Number getFrameRate() {
        return this.frameRate;
    }

    @NotNull
    public final Number getKeyFrameIntervalSeconds() {
        return this.keyFrameIntervalSeconds;
    }

    public final int getProgressUpdateGranularity() {
        return this.progressUpdateGranularity;
    }

    @NotNull
    public final Number getRotationDegrees() {
        return this.rotationDegrees;
    }

    @NotNull
    public final Number getTargetBitrate() {
        return this.targetBitrate;
    }

    public final int getTargetHeight() {
        return this.targetHeight;
    }

    public final int getTargetWidth() {
        return this.targetWidth;
    }

    public final boolean getUseHEVC() {
        return this.useHEVC;
    }

    public int hashCode() {
        return Integer.hashCode(this.progressUpdateGranularity) + ((this.rotationDegrees.hashCode() + com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g((this.targetBitrate.hashCode() + ((this.keyFrameIntervalSeconds.hashCode() + ((this.frameRate.hashCode() + com.discord.chat.presentation.list.a.u(this.targetHeight, Integer.hashCode(this.targetWidth) * 31, 31)) * 31)) * 31)) * 31, 31, this.useHEVC), 31, this.createHDR)) * 31);
    }

    @NotNull
    public String toString() {
        int i7 = this.targetWidth;
        int i10 = this.targetHeight;
        Number number = this.frameRate;
        Number number2 = this.keyFrameIntervalSeconds;
        Number number3 = this.targetBitrate;
        boolean z5 = this.useHEVC;
        boolean z6 = this.createHDR;
        Number number4 = this.rotationDegrees;
        int i11 = this.progressUpdateGranularity;
        StringBuilder sbR = e.r(i7, "EncodingConfig(targetWidth=", i10, ", targetHeight=", ", frameRate=");
        sbR.append(number);
        sbR.append(", keyFrameIntervalSeconds=");
        sbR.append(number2);
        sbR.append(", targetBitrate=");
        sbR.append(number3);
        sbR.append(", useHEVC=");
        sbR.append(z5);
        sbR.append(", createHDR=");
        sbR.append(z6);
        sbR.append(", rotationDegrees=");
        sbR.append(number4);
        sbR.append(", progressUpdateGranularity=");
        return b.l(sbR, i11, ")");
    }
}
