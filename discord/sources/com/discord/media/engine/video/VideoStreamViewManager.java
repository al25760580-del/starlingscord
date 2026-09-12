package com.discord.media.engine.video;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.discord.media.engine.video.events.OnReadyEvent;
import com.discord.media.engine.video.events.OnSizeEvent;
import com.discord.media.engine.video.texture_view.VideoStreamTextureView;
import com.discord.reactevents.ReactEvents;
import com.discord.wakelock.ScreenWakeLock;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.DCDVideoRendererManagerDelegate;
import com.facebook.react.viewmanagers.DCDVideoRendererManagerInterface;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.webrtc.RendererCommon;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "DCDVideoRenderer")
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002 !B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000f\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0014J\u001a\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0002R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/discord/media/engine/video/VideoStreamViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/media/engine/video/texture_view/VideoStreamTextureView;", "Lcom/facebook/react/viewmanagers/DCDVideoRendererManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDVideoRendererManagerDelegate;", "kotlin.jvm.PlatformType", "prevStreamIdByViewId", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "pendingStreamIdByViewId", "getDelegate", "getName", "getExportedCustomDirectEventTypeConstants", "", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onDropViewInstance", "", "view", "setStreamId", "value", "setUseSurfaceDirectRenderer", "", "onAfterUpdateTransaction", "applyStreamId", "RenderListener", "Companion", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoStreamViewManager extends SimpleViewManager<VideoStreamTextureView> implements DCDVideoRendererManagerInterface<VideoStreamTextureView> {

    @NotNull
    public static final String NAME = "DCDVideoRenderer";

    @NotNull
    public static final String WAKE_LOCK_KEY = "DCDVideoRenderer";

    @NotNull
    private static final ReactEvents reactEvents = new ReactEvents(new Pair("onReady", Reflection.getOrCreateKotlinClass(OnReadyEvent.class)), new Pair("onSize", Reflection.getOrCreateKotlinClass(OnSizeEvent.class)));

    @NotNull
    private final DCDVideoRendererManagerDelegate<VideoStreamTextureView, VideoStreamViewManager> delegate = new DCDVideoRendererManagerDelegate<>(this);

    @NotNull
    private final HashMap<Integer, String> prevStreamIdByViewId = new HashMap<>();

    @NotNull
    private final HashMap<Integer, String> pendingStreamIdByViewId = new HashMap<>();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/media/engine/video/VideoStreamViewManager$RenderListener;", "Lorg/webrtc/RendererCommon$RendererEvents;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "onFirstFrameRendered", "", "onFrameResolutionChanged", "width", "", "height", ViewProps.ROTATION, "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RenderListener implements RendererCommon.RendererEvents {

        @NotNull
        private final View view;

        public RenderListener(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFirstFrameRendered() {
            VideoStreamViewManager.reactEvents.emitEvent(this.view, new OnReadyEvent());
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFrameResolutionChanged(int width, int height, int rotation) {
            int i7 = rotation % 180;
            int i10 = i7 == 0 ? width : height;
            if (i7 == 0) {
                width = height;
            }
            VideoStreamViewManager.reactEvents.emitEvent(this.view, new OnSizeEvent(i10, width));
        }
    }

    private final void applyStreamId(VideoStreamTextureView view, String value) {
        String str = this.prevStreamIdByViewId.get(Integer.valueOf(view.getId()));
        if (str == null || !Intrinsics.areEqual(value, str)) {
            this.prevStreamIdByViewId.put(Integer.valueOf(view.getId()), value);
            if (value != null) {
                view.startRenderingStream(value, new RenderListener(view));
            } else {
                view.reset();
            }
            synchronized (this) {
                try {
                    Context context = view.getContext();
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    Activity currentActivity = ((ReactContext) context).getCurrentActivity();
                    if (currentActivity != null) {
                        AttachedVideoSinks attachedVideoSinks = AttachedVideoSinks.INSTANCE;
                        if (attachedVideoSinks.anySinksActive()) {
                            ScreenWakeLock.INSTANCE.requestLock(currentActivity, "DCDVideoRenderer");
                        } else if (!attachedVideoSinks.anySinksActive()) {
                            ScreenWakeLock.INSTANCE.releaseLock(currentActivity, "DCDVideoRenderer");
                        }
                    }
                    Unit unit = Unit.f14616a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "DCDVideoRenderer";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public VideoStreamTextureView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new VideoStreamTextureView(reactContext, null, 2, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DCDVideoRendererManagerDelegate<VideoStreamTextureView, VideoStreamViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull VideoStreamTextureView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        if (this.pendingStreamIdByViewId.containsKey(Integer.valueOf(view.getId()))) {
            applyStreamId(view, this.pendingStreamIdByViewId.remove(Integer.valueOf(view.getId())));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull VideoStreamTextureView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.pendingStreamIdByViewId.remove(Integer.valueOf(view.getId()));
        applyStreamId(view, null);
    }

    @Override // com.facebook.react.viewmanagers.DCDVideoRendererManagerInterface
    public void setStreamId(@NotNull VideoStreamTextureView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.pendingStreamIdByViewId.put(Integer.valueOf(view.getId()), value);
    }

    @Override // com.facebook.react.viewmanagers.DCDVideoRendererManagerInterface
    public void setUseSurfaceDirectRenderer(@NotNull VideoStreamTextureView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseSurfaceDirectRenderer(value);
    }
}
