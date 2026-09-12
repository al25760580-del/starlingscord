package com.discord.avatar.react;

import com.discord.avatar.decoration.DecorationView;
import com.discord.avatar.react.events.OnImageLoadedEvent;
import com.discord.image.animated_image.apng.APNGImageView;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.APNGDecorationViewManagerDelegate;
import com.facebook.react.viewmanagers.APNGDecorationViewManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = APNGDecorationViewManager.NAME)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\"B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u001a\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0018\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020!H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/discord/avatar/react/APNGDecorationViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/avatar/decoration/DecorationView;", "Lcom/facebook/react/viewmanagers/APNGDecorationViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/APNGDecorationViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getReactEvents$avatar_release", "()Lcom/discord/reactevents/ReactEvents;", "getExportedCustomDirectEventTypeConstants", "", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onDropViewInstance", "", "view", "onAfterUpdateTransaction", "setUrl", "value", "setAutoplay", "", "play", "pause", "seek", "", "Companion", "avatar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class APNGDecorationViewManager extends SimpleViewManager<DecorationView> implements APNGDecorationViewManagerInterface<DecorationView> {

    @NotNull
    public static final String NAME = "APNGDecorationView";

    @NotNull
    private final APNGDecorationViewManagerDelegate<DecorationView, APNGDecorationViewManager> delegate = new APNGDecorationViewManagerDelegate<>(this);

    @NotNull
    private final ReactEvents reactEvents = new ReactEvents(new Pair("onLoad", Reflection.getOrCreateKotlinClass(OnImageLoadedEvent.class)));

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @NotNull
    /* JADX INFO: renamed from: getReactEvents$avatar_release, reason: from getter */
    public final ReactEvents getReactEvents() {
        return this.reactEvents;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DecorationView createViewInstance(@NotNull final ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        final DecorationView decorationView = new DecorationView(reactContext, null, 0, 6, null);
        decorationView.setEventHandler(new APNGImageView.APNGImageViewEventHandler() { // from class: com.discord.avatar.react.APNGDecorationViewManager$createViewInstance$1$1
            @Override // com.discord.image.animated_image.apng.APNGImageView.APNGImageViewEventHandler
            public void onImageLoaded(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.this$0.getReactEvents().emitEvent(reactContext, decorationView, new OnImageLoadedEvent(url));
            }
        });
        decorationView.inflateApngView(false);
        return decorationView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public APNGDecorationViewManagerDelegate<DecorationView, APNGDecorationViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull DecorationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.maybeUpdateView();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull DecorationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.recycle();
    }

    @Override // com.facebook.react.viewmanagers.APNGDecorationViewManagerInterface
    public void pause(@NotNull DecorationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.pause();
    }

    @Override // com.facebook.react.viewmanagers.APNGDecorationViewManagerInterface
    public void play(@NotNull DecorationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.play();
    }

    @Override // com.facebook.react.viewmanagers.APNGDecorationViewManagerInterface
    public void seek(@NotNull DecorationView view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.seek(value);
    }

    @Override // com.facebook.react.viewmanagers.APNGDecorationViewManagerInterface
    public void setAutoplay(@NotNull DecorationView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAutoplay(value);
    }

    @Override // com.facebook.react.viewmanagers.APNGDecorationViewManagerInterface
    public void setUrl(@NotNull DecorationView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            view.setUrl(value);
        }
    }
}
