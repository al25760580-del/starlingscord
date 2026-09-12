package com.discord.media.engine.video.texture_view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import ar.b0;
import ar.k0;
import com.discord.logging.Log;
import com.discord.media.engine.MediaEngine;
import com.discord.media.engine.MediaEngineKt;
import com.discord.media.engine.types.Debug;
import com.discord.media.engine.types.VideoSink;
import com.discord.media.engine.video.AttachedVideoSinks;
import com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import fr.q;
import hr.e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.webrtc.MockBuffer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0016H\u0014J0\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0016H\u0014J\b\u00109\u001a\u000200H\u0002J\b\u0010:\u001a\u000200H\u0016J \u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0016H\u0016J\b\u0010?\u001a\u000200H\u0016J\u0018\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001dH\u0016J\u0010\u0010D\u001a\u0002002\u0006\u0010A\u001a\u00020BH\u0002J\u0018\u0010E\u001a\u0002002\u0006\u0010F\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u0003H\u0007J\b\u0010H\u001a\u000200H\u0007J\u001c\u0010I\u001a\u0002002\b\u0010F\u001a\u0004\u0018\u00010\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010J\u001a\u0002002\u0006\u0010G\u001a\u00020\u0003H\u0002J\u0017\u0010K\u001a\u0002002\b\u0010F\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\bLJ\b\u0010M\u001a\u000200H\u0002J\b\u0010N\u001a\u000200H\u0002J\b\u0010O\u001a\u00020\u000bH\u0016J\u0006\u0010P\u001a\u000200J\b\u0010Q\u001a\u000200H\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/discord/media/engine/video/texture_view/VideoStreamTextureView;", "Landroid/view/TextureView;", "Lcom/discord/media/engine/types/VideoSink;", "Lorg/webrtc/RendererCommon$RendererEvents;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", StackTraceHelper.NAME_KEY, "", "getName", "()Ljava/lang/String;", "videoLayoutMeasure", "Lorg/webrtc/RendererCommon$VideoLayoutMeasure;", "mediaEngine", "Lcom/discord/media/engine/MediaEngine;", "eglRenderer", "Lcom/discord/media/engine/video/texture_view/TextureViewEglRenderer;", "rendererEvents", "rotatedFrameWidth", "", "rotatedFrameHeight", "rotatedFrameRotation", "currentStreamId", "startRenderingTimestampNs", "", "useSurfaceDirectRenderer", "", "getUseSurfaceDirectRenderer", "()Z", "setUseSurfaceDirectRenderer", "(Z)V", "cachedAttachedScope", "Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;", "surface", "Landroid/view/Surface;", "getSurface$media_engine_release", "()Landroid/view/Surface;", "setSurface$media_engine_release", "(Landroid/view/Surface;)V", "lastRenderedRotation", "lastRenderedWidth", "lastRenderedHeight", "hasRenderedFirstFrame", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onMeasure", "", "widthSpec", "heightSpec", "onLayout", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "updateSurfaceSize", "onFirstFrameRendered", "onFrameResolutionChanged", "videoWidth", "videoHeight", ViewProps.ROTATION, "requestLayout", "onFrame", "frame", "Lorg/webrtc/VideoFrame;", "mirror", "updateFrameDimensionsAndReportEvents", "startRenderingStream", "streamId", "events", "reset", "attachToStream", "init", "initSurface", "initSurface$media_engine_release", "resetSurface", "releaseSurface", "toString", "clearSurfaceDirectVideoTransform", "applySurfaceDirectCoverTransform", "Companion", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVideoStreamTextureView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoStreamTextureView.kt\ncom/discord/media/engine/video/texture_view/VideoStreamTextureView\n+ 2 Debug.kt\ncom/discord/media/engine/types/Debug\n+ 3 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n*L\n1#1,413:1\n38#2,4:414\n38#2,4:418\n38#2,4:427\n44#2,7:431\n38#2,4:438\n58#2,4:447\n38#2,4:451\n38#2,4:455\n44#2,7:464\n17#3,5:422\n17#3,5:442\n17#3,5:459\n17#3,5:471\n*S KotlinDebug\n*F\n+ 1 VideoStreamTextureView.kt\ncom/discord/media/engine/video/texture_view/VideoStreamTextureView\n*L\n143#1:414,4\n155#1:418,4\n168#1:427,4\n180#1:431,7\n194#1:438,4\n209#1:447,4\n273#1:451,4\n286#1:455,4\n339#1:464,7\n166#1:422,5\n199#1:442,5\n294#1:459,5\n365#1:471,5\n*E\n"})
public final class VideoStreamTextureView extends TextureView implements VideoSink, RendererCommon.RendererEvents {

    @NotNull
    private static final String TAG = "VideoStreamTextureView";

    @NotNull
    private final AttachedViewCoroutineScope cachedAttachedScope;
    private String currentStreamId;

    @NotNull
    private final TextureViewEglRenderer eglRenderer;

    @NotNull
    private final AtomicBoolean hasRenderedFirstFrame;
    private int lastRenderedHeight;
    private int lastRenderedRotation;
    private int lastRenderedWidth;

    @NotNull
    private final MediaEngine mediaEngine;

    @NotNull
    private final String name;
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameRotation;
    private int rotatedFrameWidth;
    private long startRenderingTimestampNs;
    private volatile Surface surface;
    private boolean useSurfaceDirectRenderer;

    @NotNull
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicInteger count = new AtomicInteger();

    @NotNull
    private static final AtomicInteger liveCount = new AtomicInteger();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/discord/media/engine/video/texture_view/VideoStreamTextureView$Companion;", "", "<init>", "()V", "TAG", "", "count", "Ljava/util/concurrent/atomic/AtomicInteger;", "liveCount", "streamManager", "Lcom/discord/media/engine/video/texture_view/StreamManager;", "getStreamManager$media_engine_release", "()Lcom/discord/media/engine/video/texture_view/StreamManager;", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StreamManager getStreamManager$media_engine_release() {
            return StreamManager.INSTANCE.getInstance();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.video.texture_view.VideoStreamTextureView$updateFrameDimensionsAndReportEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.video.texture_view.VideoStreamTextureView$updateFrameDimensionsAndReportEvents$1", f = "VideoStreamTextureView.kt", l = {}, m = "invokeSuspend")
    public static final class C01951 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ int $newHeight;
        final /* synthetic */ int $newRotation;
        final /* synthetic */ int $newWidth;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01951(int i7, int i10, int i11, Continuation continuation) {
            super(2, continuation);
            this.$newWidth = i7;
            this.$newHeight = i10;
            this.$newRotation = i11;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return VideoStreamTextureView.this.new C01951(this.$newWidth, this.$newHeight, this.$newRotation, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            VideoStreamTextureView.this.rotatedFrameWidth = this.$newWidth;
            VideoStreamTextureView.this.rotatedFrameHeight = this.$newHeight;
            VideoStreamTextureView.this.rotatedFrameRotation = this.$newRotation;
            VideoStreamTextureView.this.updateSurfaceSize();
            VideoStreamTextureView.this.requestLayout();
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01951) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoStreamTextureView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySurfaceDirectCoverTransform() {
        if (this.useSurfaceDirectRenderer) {
            boolean z5 = this.rotatedFrameWidth > 0 && this.rotatedFrameHeight > 0;
            boolean z6 = getMeasuredWidth() > 0 && getMeasuredHeight() > 0;
            if (!z5 || !z6) {
                setTransform(new Matrix());
                return;
            }
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            int i7 = this.rotatedFrameRotation;
            boolean z7 = i7 == 90 || i7 == 270;
            float f2 = z7 ? this.rotatedFrameHeight : this.rotatedFrameWidth;
            float f7 = z7 ? this.rotatedFrameWidth : this.rotatedFrameHeight;
            float fMax = Math.max(measuredWidth / this.rotatedFrameWidth, measuredHeight / this.rotatedFrameHeight);
            Matrix matrix = new Matrix();
            matrix.setScale(f2 / measuredWidth, f7 / measuredHeight);
            float f10 = f2 / 2.0f;
            float f11 = f7 / 2.0f;
            matrix.postRotate(i7, f10, f11);
            matrix.postScale(fMax, fMax, f10, f11);
            matrix.postTranslate((measuredWidth - f2) / 2.0f, (measuredHeight - f7) / 2.0f);
            setTransform(matrix);
        }
    }

    private final void attachToStream(String streamId, RendererCommon.RendererEvents events) {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(com.discord.chat.presentation.list.a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        String str = this.currentStreamId;
        if (str != null) {
            Log.i$default(Log.INSTANCE, getName(), kk.b.h(liveCount.decrementAndGet(), "Releasing, liveCount now "), (Throwable) null, 4, (Object) null);
            if (getUseSurfaceDirectRenderer()) {
                resetSurface();
            } else {
                this.eglRenderer.release();
            }
            if (AttachedVideoSinks.INSTANCE.removeSink(this.mediaEngine, this, str)) {
                this.mediaEngine.activeSinksChanged$media_engine_release(str, false);
            }
            this.currentStreamId = null;
            if (getUseSurfaceDirectRenderer()) {
                clearSurfaceDirectVideoTransform();
            }
        }
        if (streamId == null) {
            return;
        }
        this.currentStreamId = streamId;
        initSurface$media_engine_release(streamId);
        try {
            if (events == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            init(events);
            if (AttachedVideoSinks.INSTANCE.addSink(this.mediaEngine, this, streamId)) {
                this.mediaEngine.activeSinksChanged$media_engine_release(streamId, true);
            }
            if (getUseSurfaceDirectRenderer() && isAvailable()) {
                updateSurfaceSize();
            }
        } catch (RuntimeException e10) {
            Log.INSTANCE.e(getName(), "Couldn't init EGLRenderer for stream", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(RendererCommon.RendererEvents events) {
        System.nanoTime();
        this.rendererEvents = events;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.rotatedFrameRotation = 0;
        this.hasRenderedFirstFrame.set(false);
        if (!this.useSurfaceDirectRenderer) {
            this.eglRenderer.initialize(events);
        }
        Log.i$default(Log.INSTANCE, TAG, "initialized, liveCount now " + liveCount.incrementAndGet() + ", surface direct renderer: " + this.useSurfaceDirectRenderer, (Throwable) null, 4, (Object) null);
        Debug debug = Debug.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseSurface() {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetSurface() {
        String str;
        if (this.useSurfaceDirectRenderer && (str = this.currentStreamId) != null) {
            INSTANCE.getStreamManager$media_engine_release().releaseIfActiveStreamConsumer(this.name, str);
        }
    }

    private final void updateFrameDimensionsAndReportEvents(VideoFrame frame) {
        RendererCommon.RendererEvents rendererEvents = null;
        if (!this.hasRenderedFirstFrame.get() && this.surface != null) {
            RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
            if (rendererEvents2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rendererEvents");
                rendererEvents2 = null;
            }
            rendererEvents2.onFirstFrameRendered();
            this.hasRenderedFirstFrame.set(true);
            this.lastRenderedWidth = 0;
            this.lastRenderedHeight = 0;
            this.lastRenderedRotation = -1;
        }
        if (this.lastRenderedWidth == frame.getRotatedWidth() && this.lastRenderedHeight == frame.getRotatedHeight() && this.lastRenderedRotation == frame.getRotation()) {
            return;
        }
        this.lastRenderedWidth = frame.getRotatedWidth();
        this.lastRenderedHeight = frame.getRotatedHeight();
        this.lastRenderedRotation = frame.getRotation();
        RendererCommon.RendererEvents rendererEvents3 = this.rendererEvents;
        if (rendererEvents3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rendererEvents");
        } else {
            rendererEvents = rendererEvents3;
        }
        rendererEvents.onFrameResolutionChanged(frame.getBuffer().getWidth(), frame.getBuffer().getHeight(), frame.getRotation());
        int rotatedWidth = frame.getRotatedWidth();
        int rotatedHeight = frame.getRotatedHeight();
        int rotation = frame.getRotation();
        AttachedViewCoroutineScope attachedViewCoroutineScope = this.cachedAttachedScope;
        e eVar = k0.f2938a;
        b0.t(attachedViewCoroutineScope, q.f9394a, new C01951(rotatedWidth, rotatedHeight, rotation, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSurfaceSize() {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(com.discord.chat.presentation.list.a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        if (isAvailable()) {
            Debug debug = Debug.INSTANCE;
            getName();
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            Intrinsics.checkNotNull(surfaceTexture);
            surfaceTexture.setDefaultBufferSize(getMeasuredWidth(), getMeasuredHeight());
            applySurfaceDirectCoverTransform();
        }
    }

    public final void clearSurfaceDirectVideoTransform() {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(com.discord.chat.presentation.list.a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        setTransform(new Matrix());
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getSurface$media_engine_release, reason: from getter */
    public final Surface getSurface() {
        return this.surface;
    }

    public final boolean getUseSurfaceDirectRenderer() {
        return this.useSurfaceDirectRenderer;
    }

    public final void initSurface$media_engine_release(String streamId) {
        Surface surface;
        if (!this.useSurfaceDirectRenderer || streamId == null || (surface = this.surface) == null) {
            return;
        }
        Companion companion = INSTANCE;
        companion.getStreamManager$media_engine_release().tryRegisterStreamConsumer(this.name, streamId, this);
        if (companion.getStreamManager$media_engine_release().isOnStreamConsumerStackTop(this.name, streamId)) {
            companion.getStreamManager$media_engine_release().setActiveStreamConsumer(streamId, surface);
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        Debug debug = Debug.INSTANCE;
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rendererEvents");
            rendererEvents = null;
        }
        rendererEvents.onFirstFrameRendered();
    }

    @Override // com.discord.media.engine.types.VideoSink
    public void onFrame(@NotNull VideoFrame frame, boolean mirror) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (this.useSurfaceDirectRenderer) {
            updateFrameDimensionsAndReportEvents(frame);
        } else {
            if (frame.getBuffer() instanceof MockBuffer) {
                return;
            }
            this.eglRenderer.onFrame(frame, mirror);
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(int videoWidth, int videoHeight, int rotation) {
        int i7 = (rotation == 0 || rotation == 180) ? videoWidth : videoHeight;
        int i10 = (rotation == 0 || rotation == 180) ? videoHeight : videoWidth;
        Debug debug = Debug.INSTANCE;
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rendererEvents");
            rendererEvents = null;
        }
        rendererEvents.onFrameResolutionChanged(videoWidth, videoHeight, rotation);
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(com.discord.chat.presentation.list.a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        this.rotatedFrameWidth = i7;
        this.rotatedFrameHeight = i10;
        this.rotatedFrameRotation = rotation;
        updateSurfaceSize();
        requestLayout();
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (changed) {
            float f2 = (right - left) / (bottom - top);
            if (Float.isNaN(f2)) {
                return;
            }
            Debug debug = Debug.INSTANCE;
            if (!this.useSurfaceDirectRenderer) {
                this.eglRenderer.setLayoutAspectRatio(f2);
            }
            updateSurfaceSize();
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthSpec, int heightSpec) {
        Point pointMeasure = this.videoLayoutMeasure.measure(widthSpec, heightSpec, this.rotatedFrameWidth, this.rotatedFrameHeight);
        if (this.rotatedFrameWidth != 0 || this.rotatedFrameHeight != 0) {
            Debug debug = Debug.INSTANCE;
        }
        setMeasuredDimension(pointMeasure.x, pointMeasure.y);
    }

    @Override // android.view.View
    public void requestLayout() {
        Debug debug = Debug.INSTANCE;
        super.requestLayout();
    }

    public final void reset() {
        Debug debug = Debug.INSTANCE;
        this.startRenderingTimestampNs = 0L;
        attachToStream(null, null);
    }

    public final void setSurface$media_engine_release(Surface surface) {
        this.surface = surface;
    }

    public final void setUseSurfaceDirectRenderer(boolean z5) {
        this.useSurfaceDirectRenderer = z5;
    }

    public final void startRenderingStream(@NotNull String streamId, @NotNull RendererCommon.RendererEvents events) {
        Intrinsics.checkNotNullParameter(streamId, "streamId");
        Intrinsics.checkNotNullParameter(events, "events");
        Debug debug = Debug.INSTANCE;
        this.startRenderingTimestampNs = System.nanoTime();
        attachToStream(streamId, events);
    }

    @Override // android.view.View
    @NotNull
    public String toString() {
        return this.name + " (currentStreamId=" + this.currentStreamId + ")";
    }

    public /* synthetic */ VideoStreamTextureView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStreamTextureView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        String strH = kk.b.h(count.incrementAndGet(), "VideoStreamTextureView-");
        this.name = strH;
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.mediaEngine = MediaEngineKt.getMediaEngine((ReactContext) context);
        this.eglRenderer = new TextureViewEglRenderer(strH);
        this.cachedAttachedScope = CoroutineViewUtilsKt.getAttachedScope(this);
        this.lastRenderedRotation = -1;
        this.hasRenderedFirstFrame = new AtomicBoolean(false);
        setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.discord.media.engine.video.texture_view.VideoStreamTextureView.1
            private long startNs = System.nanoTime();
            private int surfaceTextureCount;

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
                Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
                Debug debug = Debug.INSTANCE;
                VideoStreamTextureView.this.getName();
                VideoStreamTextureView.this.updateSurfaceSize();
                if (!VideoStreamTextureView.this.getUseSurfaceDirectRenderer()) {
                    VideoStreamTextureView.this.eglRenderer.onSurfaceTextureAvailable(surfaceTexture, width, height);
                    return;
                }
                VideoStreamTextureView.this.setSurface$media_engine_release(new Surface(surfaceTexture));
                VideoStreamTextureView videoStreamTextureView = VideoStreamTextureView.this;
                videoStreamTextureView.initSurface$media_engine_release(videoStreamTextureView.currentStreamId);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
                Intrinsics.checkNotNullParameter(surface, "surface");
                System.nanoTime();
                if (!VideoStreamTextureView.this.getUseSurfaceDirectRenderer()) {
                    boolean zOnSurfaceTextureDestroyed = VideoStreamTextureView.this.eglRenderer.onSurfaceTextureDestroyed(surface);
                    Debug debug = Debug.INSTANCE;
                    VideoStreamTextureView.this.getName();
                    return zOnSurfaceTextureDestroyed;
                }
                VideoStreamTextureView.this.resetSurface();
                VideoStreamTextureView.this.releaseSurface();
                Debug debug2 = Debug.INSTANCE;
                VideoStreamTextureView.this.getName();
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
                Intrinsics.checkNotNullParameter(surface, "surface");
                Debug debug = Debug.INSTANCE;
                VideoStreamTextureView.this.getName();
                if (VideoStreamTextureView.this.getUseSurfaceDirectRenderer()) {
                    VideoStreamTextureView.this.updateSurfaceSize();
                } else {
                    VideoStreamTextureView.this.eglRenderer.onSurfaceTextureSizeChanged(surface, width, height);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surface) {
                Intrinsics.checkNotNullParameter(surface, "surface");
                if (VideoStreamTextureView.this.getUseSurfaceDirectRenderer()) {
                    return;
                }
                VideoStreamTextureView.this.eglRenderer.onSurfaceTextureUpdated(surface);
            }
        });
    }
}
