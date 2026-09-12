package com.discord.media.engine.video.screen_capture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import ho.c;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.webrtc.GlRectDrawer;
import org.webrtc.GlTextureFrameBuffer;
import org.webrtc.GlUtil;
import org.webrtc.JniCommon;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/discord/media/engine/video/screen_capture/ThumbnailEmitter;", "", "width", "", "height", "periodMs", "", "onNextThumbnail", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "<init>", "(IIJLkotlin/jvm/functions/Function1;)V", "outputByteBuffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "rectDrawer", "Lorg/webrtc/GlRectDrawer;", "frameDrawer", "Lorg/webrtc/VideoFrameDrawer;", "released", "", "periodNs", "lastTimestampNs", "onFrame", "frame", "Lorg/webrtc/VideoFrame;", "createThumbnail", "release", "Companion", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThumbnailEmitter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbnailEmitter.kt\ncom/discord/media/engine/video/screen_capture/ThumbnailEmitter\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,127:1\n83#2,6:128\n*S KotlinDebug\n*F\n+ 1 ThumbnailEmitter.kt\ncom/discord/media/engine/video/screen_capture/ThumbnailEmitter\n*L\n101#1:128,6\n*E\n"})
public final class ThumbnailEmitter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Matrix renderMatrix;

    @NotNull
    private final VideoFrameDrawer frameDrawer;
    private final int height;
    private long lastTimestampNs;

    @NotNull
    private final Function1<Bitmap, Unit> onNextThumbnail;
    private final ByteBuffer outputByteBuffer;
    private final long periodNs;

    @NotNull
    private final GlRectDrawer rectDrawer;
    private boolean released;
    private final int width;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/media/engine/video/screen_capture/ThumbnailEmitter$Companion;", "", "<init>", "()V", "renderMatrix", "Landroid/graphics/Matrix;", "toNanoSeconds", "", "milliseconds", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long toNanoSeconds(long milliseconds) {
            long j = 1000;
            return milliseconds * j * j;
        }

        private Companion() {
        }
    }

    static {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        renderMatrix = matrix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThumbnailEmitter(int i7, int i10, long j, @NotNull Function1<? super Bitmap, Unit> onNextThumbnail) {
        Intrinsics.checkNotNullParameter(onNextThumbnail, "onNextThumbnail");
        this.width = i7;
        this.height = i10;
        this.onNextThumbnail = onNextThumbnail;
        this.outputByteBuffer = JniCommon.nativeAllocateByteBuffer(i7 * i10 * 4);
        this.rectDrawer = new GlRectDrawer();
        this.frameDrawer = new VideoFrameDrawer();
        long nanoSeconds = INSTANCE.toNanoSeconds(j);
        this.periodNs = nanoSeconds;
        this.lastTimestampNs = -nanoSeconds;
    }

    private final Bitmap createThumbnail(VideoFrame frame) {
        GlTextureFrameBuffer glTextureFrameBuffer = new GlTextureFrameBuffer(6408);
        glTextureFrameBuffer.setSize(this.width, this.height);
        GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        float rotatedWidth = frame.getRotatedWidth();
        float rotatedHeight = frame.getRotatedHeight();
        float f2 = rotatedWidth / rotatedHeight;
        int i7 = this.width;
        int i10 = this.height;
        if (f2 < i7 / i10) {
            float f7 = (i10 / rotatedHeight) * rotatedWidth;
            this.frameDrawer.drawFrame(frame, this.rectDrawer, renderMatrix, c.b((i7 - f7) / 2.0f), 0, c.b(f7), this.height);
        } else {
            float f10 = (i7 / rotatedWidth) * rotatedHeight;
            this.frameDrawer.drawFrame(frame, this.rectDrawer, renderMatrix, 0, c.b((i10 - f10) / 2.0f), this.width, c.b(f10));
        }
        this.outputByteBuffer.rewind();
        GLES20.glReadPixels(0, 0, glTextureFrameBuffer.getWidth(), glTextureFrameBuffer.getHeight(), 6408, 5121, this.outputByteBuffer);
        GlUtil.checkNoGLES2Error("ThumbnailEmitter.createThumbnail");
        glTextureFrameBuffer.release();
        this.outputByteBuffer.rewind();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(this.outputByteBuffer);
        return bitmapCreateBitmap;
    }

    public final synchronized void onFrame(@NotNull VideoFrame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (this.released) {
            return;
        }
        long timestampNs = frame.getTimestampNs();
        if (timestampNs - this.lastTimestampNs > this.periodNs) {
            this.lastTimestampNs = timestampNs;
            this.onNextThumbnail.invoke(createThumbnail(frame));
        }
    }

    public final synchronized void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        this.frameDrawer.release();
        this.rectDrawer.release();
        JniCommon.nativeFreeByteBuffer(this.outputByteBuffer);
    }
}
