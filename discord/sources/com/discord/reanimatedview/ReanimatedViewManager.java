package com.discord.reanimatedview;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.viewmanagers.ReanimatedViewManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.ReanimatedModule;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o5.a;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = ReanimatedViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 )2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001)B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\tH\u0017J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003J\u001a\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0017J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J \u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0017J\u001a\u0010$\u001a\u0004\u0018\u00010\u00032\u0006\u0010%\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010'\u001a\u00020(H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006*"}, d2 = {"Lcom/discord/reanimatedview/ReanimatedViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/viewmanagers/ReanimatedViewManagerInterface;", "Lcom/facebook/react/views/view/ReactViewGroup;", "<init>", "()V", "nodesManager", "Lcom/swmansion/reanimated/NodesManager;", "hasPullModeRendering", "", "getHasPullModeRendering", "()Z", "hasPullModeRendering$delegate", "Lkotlin/Lazy;", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setHasEnteringAnimation", "", "view", "value", "hasEnteringAnimation", "allowUpdating", "setTransform", "matrix", "Lcom/facebook/react/bridge/ReadableArray;", "setOpacity", ViewProps.OPACITY, "", "setBackgroundColor", ViewProps.BACKGROUND_COLOR, "", "setBorderRadius", "index", "rawBorderRadius", "Lcom/facebook/react/bridge/Dynamic;", "prepareToRecycleView", "reactContext", "onAfterUpdateTransaction", "getName", "", "Companion", "reanimated_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReanimatedViewManager extends ReactViewManager implements ReanimatedViewManagerInterface<ReactViewGroup> {

    @NotNull
    public static final String REACT_CLASS = "ReanimatedView";

    /* JADX INFO: renamed from: hasPullModeRendering$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hasPullModeRendering = l.b(new a(28));
    private NodesManager nodesManager;

    public final boolean allowUpdating(@NotNull ReactViewGroup view) {
        NodesManager nodesManager;
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getTag(R.id.firstRenderPerformed) != null && (nodesManager = this.nodesManager) != null) {
            Intrinsics.checkNotNull(nodesManager);
            if (!nodesManager.isPerformOperationsActive()) {
                return false;
            }
        }
        return true;
    }

    public final boolean getHasPullModeRendering() {
        return ((Boolean) this.hasPullModeRendering.getValue()).booleanValue();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    public final boolean hasEnteringAnimation(@NotNull ReactViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag = view.getTag(R.id.hasEnteringAnimation);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.facebook.react.views.view.ReactViewManager
    @ReactPropGroup(names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", ViewProps.BORDER_TOP_START_RADIUS, ViewProps.BORDER_TOP_END_RADIUS, ViewProps.BORDER_BOTTOM_START_RADIUS, ViewProps.BORDER_BOTTOM_END_RADIUS, ViewProps.BORDER_END_END_RADIUS, ViewProps.BORDER_END_START_RADIUS, ViewProps.BORDER_START_END_RADIUS, ViewProps.BORDER_START_START_RADIUS})
    public void setBorderRadius(@NotNull ReactViewGroup view, int index, @NotNull Dynamic rawBorderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(rawBorderRadius, "rawBorderRadius");
        if (allowUpdating(view)) {
            super.setBorderRadius(view, index, rawBorderRadius);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactViewGroup createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.nodesManager == null) {
            ReanimatedModule reanimatedModule = (ReanimatedModule) context.getNativeModule(ReanimatedModule.class);
            this.nodesManager = reanimatedModule != null ? reanimatedModule.getNodesManager() : null;
        }
        return new ReactViewGroup(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ReactViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.setTag(R.id.firstRenderPerformed, Boolean.TRUE);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public ReactViewGroup prepareToRecycleView(@NotNull ThemedReactContext reactContext, @NotNull ReactViewGroup view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(R.id.firstRenderPerformed, null);
        view.setTag(R.id.hasEnteringAnimation, null);
        return super.prepareToRecycleView(reactContext, view);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(customType = "Color", name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(@NotNull ReactViewGroup view, int backgroundColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (allowUpdating(view)) {
            super.setBackgroundColor(view, backgroundColor);
        }
    }

    @Override // com.facebook.react.viewmanagers.ReanimatedViewManagerInterface
    @ReactProp(defaultBoolean = false, name = "hasEnteringAnimation")
    public void setHasEnteringAnimation(ReactViewGroup view, boolean value) {
        if (!getHasPullModeRendering() || view == null) {
            return;
        }
        view.setTag(R.id.hasEnteringAnimation, Boolean.valueOf(value));
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.OPACITY)
    public void setOpacity(@NotNull ReactViewGroup view, float opacity) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (hasEnteringAnimation(view) || allowUpdating(view)) {
            super.setOpacity(view, opacity);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.TRANSFORM)
    public void setTransform(@NotNull ReactViewGroup view, ReadableArray matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (allowUpdating(view)) {
            super.setTransform(view, matrix);
        }
    }
}
