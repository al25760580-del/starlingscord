package com.discord.react_gesture_handler.accessibility_focus;

import com.discord.react_gesture_handler.accessibility_focus.AccessibilityFocusViewManager;
import com.discord.react_gesture_handler.accessibility_focus.events.OnAccessibilityBlurData;
import com.discord.react_gesture_handler.accessibility_focus.events.OnAccessibilityFocusData;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.AccessibilityFocusViewManagerDelegate;
import com.facebook.react.viewmanagers.AccessibilityFocusViewManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = AccessibilityFocusViewManager.NAME)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u0012H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/react_gesture_handler/accessibility_focus/AccessibilityFocusViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/react_gesture_handler/accessibility_focus/AccessibilityFocusViewGroup;", "Lcom/facebook/react/viewmanagers/AccessibilityFocusViewManagerInterface;", "<init>", "()V", "mDelegate", "Lcom/facebook/react/viewmanagers/AccessibilityFocusViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "Companion", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AccessibilityFocusViewManager extends ViewGroupManager<AccessibilityFocusViewGroup> implements AccessibilityFocusViewManagerInterface<AccessibilityFocusViewGroup> {

    @NotNull
    public static final String NAME = "AccessibilityFocusView";

    @NotNull
    private final AccessibilityFocusViewManagerDelegate<AccessibilityFocusViewGroup, AccessibilityFocusViewManager> mDelegate;

    @NotNull
    private final ReactEvents reactEvents;

    public AccessibilityFocusViewManager() {
        super(null, 1, null);
        this.mDelegate = new AccessibilityFocusViewManagerDelegate<>(this);
        this.reactEvents = new ReactEvents(new Pair("onAccessibilityFocus", Reflection.getOrCreateKotlinClass(OnAccessibilityFocusData.class)), new Pair("onAccessibilityBlur", Reflection.getOrCreateKotlinClass(OnAccessibilityBlurData.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$2$lambda$0(AccessibilityFocusViewManager accessibilityFocusViewManager, ThemedReactContext themedReactContext, AccessibilityFocusViewGroup accessibilityFocusViewGroup) {
        accessibilityFocusViewManager.reactEvents.emitEvent(themedReactContext, accessibilityFocusViewGroup, new OnAccessibilityFocusData());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$2$lambda$1(AccessibilityFocusViewManager accessibilityFocusViewManager, ThemedReactContext themedReactContext, AccessibilityFocusViewGroup accessibilityFocusViewGroup) {
        accessibilityFocusViewManager.reactEvents.emitEvent(themedReactContext, accessibilityFocusViewGroup, new OnAccessibilityBlurData());
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
    public AccessibilityFocusViewGroup createViewInstance(@NotNull final ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        final AccessibilityFocusViewGroup accessibilityFocusViewGroup = new AccessibilityFocusViewGroup(reactContext);
        final int i7 = 0;
        accessibilityFocusViewGroup.setOnAccessibilityFocus(new Function0(this) { // from class: p7.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AccessibilityFocusViewManager f17785e;

            {
                this.f17785e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return AccessibilityFocusViewManager.createViewInstance$lambda$2$lambda$0(this.f17785e, reactContext, accessibilityFocusViewGroup);
                    default:
                        return AccessibilityFocusViewManager.createViewInstance$lambda$2$lambda$1(this.f17785e, reactContext, accessibilityFocusViewGroup);
                }
            }
        });
        final int i10 = 1;
        accessibilityFocusViewGroup.setOnAccessibilityBlur(new Function0(this) { // from class: p7.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AccessibilityFocusViewManager f17785e;

            {
                this.f17785e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return AccessibilityFocusViewManager.createViewInstance$lambda$2$lambda$0(this.f17785e, reactContext, accessibilityFocusViewGroup);
                    default:
                        return AccessibilityFocusViewManager.createViewInstance$lambda$2$lambda$1(this.f17785e, reactContext, accessibilityFocusViewGroup);
                }
            }
        });
        return accessibilityFocusViewGroup;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public AccessibilityFocusViewManagerDelegate<AccessibilityFocusViewGroup, AccessibilityFocusViewManager> getDelegate() {
        return this.mDelegate;
    }
}
