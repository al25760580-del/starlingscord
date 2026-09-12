package com.discord.react_gesture_handler.passthrough_touch;

import com.discord.chat.presentation.list.delegate.c;
import com.discord.react_gesture_handler.passthrough_touch.events.OnTouchDownData;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.PassthroughTouchViewManagerDelegate;
import com.facebook.react.viewmanagers.PassthroughTouchViewManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = PassthroughTouchViewManager.NAME)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u0012H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/react_gesture_handler/passthrough_touch/PassthroughTouchViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/react_gesture_handler/passthrough_touch/PassthroughTouchViewGroup;", "Lcom/facebook/react/viewmanagers/PassthroughTouchViewManagerInterface;", "<init>", "()V", "mDelegate", "Lcom/facebook/react/viewmanagers/PassthroughTouchViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "Companion", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PassthroughTouchViewManager extends ViewGroupManager<PassthroughTouchViewGroup> implements PassthroughTouchViewManagerInterface<PassthroughTouchViewGroup> {

    @NotNull
    public static final String NAME = "PassthroughTouchView";

    @NotNull
    private final PassthroughTouchViewManagerDelegate<PassthroughTouchViewGroup, PassthroughTouchViewManager> mDelegate;

    @NotNull
    private final ReactEvents reactEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public PassthroughTouchViewManager() {
        super(null, 1, 0 == true ? 1 : 0);
        this.mDelegate = new PassthroughTouchViewManagerDelegate<>(this);
        this.reactEvents = new ReactEvents(new Pair("onTouchDown", Reflection.getOrCreateKotlinClass(OnTouchDownData.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$1$lambda$0(PassthroughTouchViewManager passthroughTouchViewManager, ThemedReactContext themedReactContext, PassthroughTouchViewGroup passthroughTouchViewGroup) {
        passthroughTouchViewManager.reactEvents.emitEvent(themedReactContext, passthroughTouchViewGroup, new OnTouchDownData());
        return Unit.f14616a;
    }

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

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public PassthroughTouchViewGroup createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        PassthroughTouchViewGroup passthroughTouchViewGroup = new PassthroughTouchViewGroup(reactContext);
        passthroughTouchViewGroup.setOnTouchDown(new c(this, reactContext, passthroughTouchViewGroup, 3));
        return passthroughTouchViewGroup;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public PassthroughTouchViewManagerDelegate<PassthroughTouchViewGroup, PassthroughTouchViewManager> getDelegate() {
        return this.mDelegate;
    }
}
