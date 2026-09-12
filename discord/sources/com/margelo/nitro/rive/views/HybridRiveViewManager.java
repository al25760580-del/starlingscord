package com.margelo.nitro.rive.views;

import al.b;
import android.view.View;
import com.discord.R;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.margelo.nitro.rive.HybridRiveView;
import em.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\u0012"}, d2 = {"Lcom/margelo/nitro/rive/views/HybridRiveViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Landroid/view/View;", "<init>", "()V", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "updateState", "", "view", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "prepareToRecycleView", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class HybridRiveViewManager extends SimpleViewManager<View> {
    public HybridRiveViewManager() {
        if (b.class.isAssignableFrom(HybridRiveView.class)) {
            super.setupViewRecycling();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public View createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        HybridRiveView hybridRiveView = new HybridRiveView(reactContext);
        m view = hybridRiveView.getView();
        view.setTag(R.id.associated_hybrid_view_tag, hybridRiveView);
        return view;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RiveView";
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public View prepareToRecycleView(@NotNull ThemedReactContext reactContext, @NotNull View view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.prepareToRecycleView(reactContext, view);
        view.getTag(R.id.associated_hybrid_view_tag);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(@NotNull View view, @NotNull ReactStylesDiffMap props, @NotNull StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        Object tag = view.getTag(R.id.associated_hybrid_view_tag);
        HybridRiveView hybridRiveView = tag instanceof HybridRiveView ? (HybridRiveView) tag : null;
        if (hybridRiveView != null) {
            hybridRiveView.beforeUpdate();
            HybridRiveViewStateUpdater.updateViewProps(hybridRiveView, stateWrapper);
            hybridRiveView.afterUpdate();
            return super.updateState(view, props, stateWrapper);
        }
        throw new Error("Couldn't find view " + view + " in local views table!");
    }
}
