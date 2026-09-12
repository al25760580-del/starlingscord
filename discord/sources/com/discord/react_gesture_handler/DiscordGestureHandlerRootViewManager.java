package com.discord.react_gesture_handler;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.DiscordGestureHandlerRootViewManagerDelegate;
import com.facebook.react.viewmanagers.DiscordGestureHandlerRootViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = DiscordGestureHandlerRootViewManager.NAME)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/react_gesture_handler/DiscordGestureHandlerRootViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;", "Lcom/facebook/react/viewmanagers/DiscordGestureHandlerRootViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DiscordGestureHandlerRootViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "Companion", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiscordGestureHandlerRootViewManager extends ViewGroupManager<DiscordGestureHandlerEnabledRootView> implements DiscordGestureHandlerRootViewManagerInterface<DiscordGestureHandlerEnabledRootView> {

    @NotNull
    public static final String NAME = "DiscordGestureHandlerRootView";

    @NotNull
    private final DiscordGestureHandlerRootViewManagerDelegate<DiscordGestureHandlerEnabledRootView, DiscordGestureHandlerRootViewManager> delegate;

    public DiscordGestureHandlerRootViewManager() {
        super(null, 1, null);
        this.delegate = new DiscordGestureHandlerRootViewManagerDelegate<>(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<DiscordGestureHandlerEnabledRootView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DiscordGestureHandlerEnabledRootView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new DiscordGestureHandlerEnabledRootView(reactContext);
    }
}
