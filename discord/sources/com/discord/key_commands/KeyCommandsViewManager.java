package com.discord.key_commands;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.KeyCommandsViewManagerDelegate;
import com.facebook.react.viewmanagers.KeyCommandsViewManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = KeyCommandsViewManager.NAME)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/key_commands/KeyCommandsViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/viewmanagers/KeyCommandsViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/KeyCommandsViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setKeyCommands", "", "view", "value", "Lcom/facebook/react/bridge/ReadableArray;", "Companion", "key_commands_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyCommandsViewManager extends ViewGroupManager<ReactViewGroup> implements KeyCommandsViewManagerInterface<ReactViewGroup> {

    @NotNull
    public static final String NAME = "KeyCommandsView";

    @NotNull
    private final KeyCommandsViewManagerDelegate<ReactViewGroup, KeyCommandsViewManager> delegate;

    public KeyCommandsViewManager() {
        super(null, 1, null);
        this.delegate = new KeyCommandsViewManagerDelegate<>(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.viewmanagers.KeyCommandsViewManagerInterface
    public void setKeyCommands(@NotNull ReactViewGroup view, ReadableArray value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactViewGroup createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ReactViewGroup(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public KeyCommandsViewManagerDelegate<ReactViewGroup, KeyCommandsViewManager> getDelegate() {
        return this.delegate;
    }
}
