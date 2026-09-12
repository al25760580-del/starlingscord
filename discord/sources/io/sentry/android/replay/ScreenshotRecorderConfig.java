package io.sentry.android.replay;

import a3.e;
import android.content.Context;
import ho.c;
import io.sentry.a6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B5\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\""}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorderConfig;", "", "scaleFactorX", "", "scaleFactorY", "(FF)V", "recordingWidth", "", "recordingHeight", "frameRate", "bitRate", "(IIFFII)V", "getBitRate", "()I", "getFrameRate", "getRecordingHeight", "getRecordingWidth", "getScaleFactorX", "()F", "getScaleFactorY", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ScreenshotRecorderConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int bitRate;
    private final int frameRate;
    private final int recordingHeight;
    private final int recordingWidth;
    private final float scaleFactorX;
    private final float scaleFactorY;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorderConfig$Companion;", "", "<init>", "()V", "", "adjustToBlockSize", "(I)I", "Landroid/content/Context;", "context", "Lio/sentry/a6;", "sessionReplay", "windowWidth", "windowHeight", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "fromSize", "(Landroid/content/Context;Lio/sentry/a6;II)Lio/sentry/android/replay/ScreenshotRecorderConfig;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int adjustToBlockSize(int i7) {
            int i10 = i7 % 16;
            return i10 <= 8 ? Math.max(16, i7 - i10) : (16 - i10) + i7;
        }

        @NotNull
        public final ScreenshotRecorderConfig fromSize(@NotNull Context context, @NotNull a6 sessionReplay, int windowWidth, int windowHeight) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionReplay, "sessionReplay");
            float f2 = windowHeight;
            Integer numValueOf = Integer.valueOf(adjustToBlockSize(c.b((f2 / context.getResources().getDisplayMetrics().density) * sessionReplay.f12055g.sizeScale)));
            float f7 = windowWidth;
            Integer numValueOf2 = Integer.valueOf(adjustToBlockSize(c.b((f7 / context.getResources().getDisplayMetrics().density) * sessionReplay.f12055g.sizeScale)));
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            return new ScreenshotRecorderConfig(iIntValue2, iIntValue, iIntValue2 / f7, iIntValue / f2, sessionReplay.f12056h, sessionReplay.f12055g.bitRate);
        }

        private Companion() {
        }
    }

    public ScreenshotRecorderConfig(int i7, int i10, float f2, float f7, int i11, int i12) {
        this.recordingWidth = i7;
        this.recordingHeight = i10;
        this.scaleFactorX = f2;
        this.scaleFactorY = f7;
        this.frameRate = i11;
        this.bitRate = i12;
    }

    public static /* synthetic */ ScreenshotRecorderConfig copy$default(ScreenshotRecorderConfig screenshotRecorderConfig, int i7, int i10, float f2, float f7, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i7 = screenshotRecorderConfig.recordingWidth;
        }
        if ((i13 & 2) != 0) {
            i10 = screenshotRecorderConfig.recordingHeight;
        }
        if ((i13 & 4) != 0) {
            f2 = screenshotRecorderConfig.scaleFactorX;
        }
        if ((i13 & 8) != 0) {
            f7 = screenshotRecorderConfig.scaleFactorY;
        }
        if ((i13 & 16) != 0) {
            i11 = screenshotRecorderConfig.frameRate;
        }
        if ((i13 & 32) != 0) {
            i12 = screenshotRecorderConfig.bitRate;
        }
        int i14 = i11;
        int i15 = i12;
        return screenshotRecorderConfig.copy(i7, i10, f2, f7, i14, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getScaleFactorX() {
        return this.scaleFactorX;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getScaleFactorY() {
        return this.scaleFactorY;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBitRate() {
        return this.bitRate;
    }

    @NotNull
    public final ScreenshotRecorderConfig copy(int recordingWidth, int recordingHeight, float scaleFactorX, float scaleFactorY, int frameRate, int bitRate) {
        return new ScreenshotRecorderConfig(recordingWidth, recordingHeight, scaleFactorX, scaleFactorY, frameRate, bitRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenshotRecorderConfig)) {
            return false;
        }
        ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) other;
        return this.recordingWidth == screenshotRecorderConfig.recordingWidth && this.recordingHeight == screenshotRecorderConfig.recordingHeight && Float.compare(this.scaleFactorX, screenshotRecorderConfig.scaleFactorX) == 0 && Float.compare(this.scaleFactorY, screenshotRecorderConfig.scaleFactorY) == 0 && this.frameRate == screenshotRecorderConfig.frameRate && this.bitRate == screenshotRecorderConfig.bitRate;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public final float getScaleFactorX() {
        return this.scaleFactorX;
    }

    public final float getScaleFactorY() {
        return this.scaleFactorY;
    }

    public int hashCode() {
        return Integer.hashCode(this.bitRate) + com.discord.chat.presentation.list.a.u(this.frameRate, e.a(e.a(com.discord.chat.presentation.list.a.u(this.recordingHeight, Integer.hashCode(this.recordingWidth) * 31, 31), 31, this.scaleFactorX), 31, this.scaleFactorY), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb2.append(this.recordingWidth);
        sb2.append(", recordingHeight=");
        sb2.append(this.recordingHeight);
        sb2.append(", scaleFactorX=");
        sb2.append(this.scaleFactorX);
        sb2.append(", scaleFactorY=");
        sb2.append(this.scaleFactorY);
        sb2.append(", frameRate=");
        sb2.append(this.frameRate);
        sb2.append(", bitRate=");
        return com.discord.chat.presentation.list.a.j(sb2, this.bitRate, ')');
    }

    public ScreenshotRecorderConfig(float f2, float f7) {
        this(0, 0, f2, f7, 0, 0);
    }
}
