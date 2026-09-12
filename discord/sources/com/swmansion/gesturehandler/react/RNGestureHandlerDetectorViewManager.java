package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerDetectorManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerDetectorManagerInterface;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import jm.f;
import jm.g;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = RNGestureHandlerDetectorViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\"B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerDetectorViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Ljm/f;", "Lcom/facebook/react/viewmanagers/RNGestureHandlerDetectorManagerInterface;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Ljm/f;", "view", "Lcom/facebook/react/bridge/ReadableArray;", "value", "", "setHandlerTags", "(Ljm/f;Lcom/facebook/react/bridge/ReadableArray;)V", "", "setModuleId", "(Ljm/f;I)V", "setVirtualChildren", "onDropViewInstance", "(Ljm/f;)V", "pointerEventsStr", "setPointerEvents", "(Ljm/f;Ljava/lang/String;)V", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "jm/g", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNGestureHandlerDetectorViewManager extends ViewGroupManager<f> implements RNGestureHandlerDetectorManagerInterface<f> {

    @NotNull
    public static final g Companion = new g();

    @NotNull
    public static final String REACT_CLASS = "RNGestureHandlerDetector";

    @NotNull
    private final ViewManagerDelegate<f> mDelegate;

    public RNGestureHandlerDetectorViewManager() {
        super(null, 1, null);
        this.mDelegate = new RNGestureHandlerDetectorManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<f> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public f createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(reactContext, "context");
        f fVar = new f(reactContext);
        n0 n0Var = n0.f14659d;
        fVar.f13945d = n0Var;
        fVar.f13946e = n0Var;
        fVar.f13947i = new LinkedHashSet();
        fVar.f13948v = new LinkedHashSet();
        fVar.f13949w = new LinkedHashSet();
        fVar.f13950x = new LinkedHashMap();
        fVar.f13951y = -1;
        return fVar;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull f view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.f();
        super.onDropViewInstance(view);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerDetectorManagerInterface
    public void setHandlerTags(@NotNull f view, ReadableArray value) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHandlerTags(value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerDetectorManagerInterface
    public void setModuleId(@NotNull f view, int value) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setModuleId(value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerDetectorManagerInterface
    public void setPointerEvents(@NotNull f view, String pointerEventsStr) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPointerEvents(PointerEvents.INSTANCE.parsePointerEvents(pointerEventsStr));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerDetectorManagerInterface
    public void setVirtualChildren(@NotNull f view, ReadableArray value) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVirtualChildren(value);
    }
}
