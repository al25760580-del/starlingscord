package io.sentry.android.replay.video;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.SentryLevel;
import io.sentry.android.replay.util.SystemProperties;
import io.sentry.w5;
import java.nio.ByteBuffer;
import kk.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lio/sentry/android/replay/video/SimpleVideoEncoder;", "", "Lio/sentry/w5;", "options", "Lio/sentry/android/replay/video/MuxerConfig;", "muxerConfig", "Lkotlin/Function0;", "", "onClose", "<init>", "(Lio/sentry/w5;Lio/sentry/android/replay/video/MuxerConfig;Lkotlin/jvm/functions/Function0;)V", "", "endOfStream", "drainCodec", "(Z)V", ViewProps.START, "()V", "Landroid/graphics/Bitmap;", "image", "encode", "(Landroid/graphics/Bitmap;)V", "release", "Lio/sentry/w5;", "getOptions", "()Lio/sentry/w5;", "Lio/sentry/android/replay/video/MuxerConfig;", "getMuxerConfig", "()Lio/sentry/android/replay/video/MuxerConfig;", "Lkotlin/jvm/functions/Function0;", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "hasExynosCodec$delegate", "Lkotlin/Lazy;", "getHasExynosCodec", "()Z", "hasExynosCodec", "Landroid/media/MediaCodec;", "mediaCodec", "Landroid/media/MediaCodec;", "getMediaCodec$sentry_android_replay_release", "()Landroid/media/MediaCodec;", "Landroid/media/MediaFormat;", "mediaFormat$delegate", "getMediaFormat", "()Landroid/media/MediaFormat;", "mediaFormat", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "Lio/sentry/android/replay/video/SimpleMp4FrameMuxer;", "frameMuxer", "Lio/sentry/android/replay/video/SimpleMp4FrameMuxer;", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "", "getDuration", "()J", "duration", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
public final class SimpleVideoEncoder {
    public static final int $stable = 8;

    @NotNull
    private final MediaCodec.BufferInfo bufferInfo;

    @NotNull
    private final SimpleMp4FrameMuxer frameMuxer;

    /* JADX INFO: renamed from: hasExynosCodec$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hasExynosCodec;

    @NotNull
    private final MediaCodec mediaCodec;

    /* JADX INFO: renamed from: mediaFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mediaFormat;

    @NotNull
    private final MuxerConfig muxerConfig;
    private final Function0<Unit> onClose;

    @NotNull
    private final w5 options;
    private Surface surface;

    public SimpleVideoEncoder(@NotNull w5 options, @NotNull MuxerConfig muxerConfig, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(muxerConfig, "muxerConfig");
        this.options = options;
        this.muxerConfig = muxerConfig;
        this.onClose = function0;
        m mVar = m.f19487i;
        this.hasExynosCodec = l.a(mVar, new Function0<Boolean>() { // from class: io.sentry.android.replay.video.SimpleVideoEncoder$hasExynosCodec$2
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z5 = false;
                MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
                for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                    String name = mediaCodecInfo.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (StringsKt.D(name, "c2.exynos", false)) {
                        z5 = true;
                        break;
                    }
                }
                return Boolean.valueOf(z5);
            }
        });
        MediaCodec mediaCodecCreateByCodecName = getHasExynosCodec() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.getMimeType());
        Intrinsics.checkNotNull(mediaCodecCreateByCodecName);
        this.mediaCodec = mediaCodecCreateByCodecName;
        this.mediaFormat = l.a(mVar, new Function0<MediaFormat>() { // from class: io.sentry.android.replay.video.SimpleVideoEncoder$mediaFormat$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final MediaFormat invoke() {
                int bitRate = this.this$0.getMuxerConfig().getBitRate();
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = this.this$0.getMediaCodec().getCodecInfo().getCapabilitiesForType(this.this$0.getMuxerConfig().getMimeType()).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(bitRate))) {
                        this.this$0.getOptions().getLogger().q(SentryLevel.DEBUG, "Encoder doesn't support the provided bitRate: " + bitRate + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(bitRate));
                        Intrinsics.checkNotNullExpressionValue(objClamp, "clamp(...)");
                        bitRate = ((Number) objClamp).intValue();
                    }
                } catch (Throwable th2) {
                    this.this$0.getOptions().getLogger().g(SentryLevel.DEBUG, "Could not retrieve MediaCodec info", th2);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.this$0.getMuxerConfig().getMimeType(), this.this$0.getMuxerConfig().getRecordingWidth(), this.this$0.getMuxerConfig().getRecordingHeight());
                Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", bitRate);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", this.this$0.getMuxerConfig().getFrameRate());
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            }
        });
        this.bufferInfo = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.getFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this.frameMuxer = new SimpleMp4FrameMuxer(absolutePath, muxerConfig.getFrameRate());
    }

    private final void drainCodec(boolean endOfStream) {
        ByteBuffer byteBuffer;
        if (this.options.getSessionReplay().f12060n) {
            this.options.getLogger().q(SentryLevel.DEBUG, "[Encoder]: drainCodec(" + endOfStream + ')', new Object[0]);
        }
        if (endOfStream) {
            if (this.options.getSessionReplay().f12060n) {
                this.options.getLogger().q(SentryLevel.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            this.mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.mediaCodec.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(this.bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -1) {
                if (!endOfStream) {
                    return;
                }
                if (this.options.getSessionReplay().f12060n) {
                    this.options.getLogger().q(SentryLevel.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.mediaCodec.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.frameMuxer.getStarted()) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                if (this.options.getSessionReplay().f12060n) {
                    this.options.getLogger().q(SentryLevel.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                }
                this.frameMuxer.start(outputFormat);
            } else if (iDequeueOutputBuffer < 0) {
                if (this.options.getSessionReplay().f12060n) {
                    this.options.getLogger().q(SentryLevel.DEBUG, b.h(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                }
            } else {
                if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                    throw new RuntimeException(g.d(iDequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
                if ((this.bufferInfo.flags & 2) != 0) {
                    if (this.options.getSessionReplay().f12060n) {
                        this.options.getLogger().q(SentryLevel.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                    }
                    this.bufferInfo.size = 0;
                }
                if (this.bufferInfo.size != 0) {
                    if (!this.frameMuxer.getStarted()) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    this.frameMuxer.muxVideoFrame(byteBuffer, this.bufferInfo);
                    if (this.options.getSessionReplay().f12060n) {
                        this.options.getLogger().q(SentryLevel.DEBUG, b.l(new StringBuilder("[Encoder]: sent "), this.bufferInfo.size, " bytes to muxer"), new Object[0]);
                    }
                }
                this.mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.bufferInfo.flags & 4) != 0) {
                    if (this.options.getSessionReplay().f12060n) {
                        if (endOfStream) {
                            this.options.getLogger().q(SentryLevel.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                            return;
                        } else {
                            this.options.getLogger().q(SentryLevel.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    private final boolean getHasExynosCodec() {
        return ((Boolean) this.hasExynosCodec.getValue()).booleanValue();
    }

    private final MediaFormat getMediaFormat() {
        return (MediaFormat) this.mediaFormat.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public final void encode(@NotNull Bitmap image) {
        Surface surface;
        Canvas canvasLockCanvas;
        Intrinsics.checkNotNullParameter(image, "image");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (StringsKt.D(MANUFACTURER, "xiaomi", true)) {
            surface = this.surface;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            if (StringsKt.D(MANUFACTURER, "motorola", true)) {
                surface = this.surface;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                SystemProperties systemProperties = SystemProperties.INSTANCE;
                SystemProperties.Property property = SystemProperties.Property.SOC_MANUFACTURER;
                if (x.i(SystemProperties.get$default(systemProperties, property, null, 2, null), "spreadtrum", true) || x.i(SystemProperties.get$default(systemProperties, property, null, 2, null), "unisoc", true)) {
                    surface = this.surface;
                    if (surface != null) {
                        canvasLockCanvas = surface.lockCanvas(null);
                    } else {
                        canvasLockCanvas = null;
                    }
                } else {
                    Surface surface2 = this.surface;
                    if (surface2 != null) {
                        canvasLockCanvas = surface2.lockHardwareCanvas();
                    } else {
                        canvasLockCanvas = null;
                    }
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(image, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = this.surface;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        drainCodec(false);
    }

    public final long getDuration() {
        return this.frameMuxer.getVideoTime();
    }

    @NotNull
    /* JADX INFO: renamed from: getMediaCodec$sentry_android_replay_release, reason: from getter */
    public final MediaCodec getMediaCodec() {
        return this.mediaCodec;
    }

    @NotNull
    public final MuxerConfig getMuxerConfig() {
        return this.muxerConfig;
    }

    public final Function0<Unit> getOnClose() {
        return this.onClose;
    }

    @NotNull
    public final w5 getOptions() {
        return this.options;
    }

    public final void release() {
        try {
            Function0<Unit> function0 = this.onClose;
            if (function0 != null) {
                function0.invoke();
            }
            drainCodec(true);
            this.mediaCodec.stop();
            this.mediaCodec.release();
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.frameMuxer.release();
        } catch (Throwable th2) {
            this.options.getLogger().g(SentryLevel.DEBUG, "Failed to properly release video encoder", th2);
        }
    }

    public final void start() {
        this.mediaCodec.configure(getMediaFormat(), (Surface) null, (MediaCrypto) null, 1);
        this.surface = this.mediaCodec.createInputSurface();
        this.mediaCodec.start();
        drainCodec(false);
    }

    public /* synthetic */ SimpleVideoEncoder(w5 w5Var, MuxerConfig muxerConfig, Function0 function0, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(w5Var, muxerConfig, (i7 & 4) != 0 ? null : function0);
    }
}
