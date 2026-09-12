package com.facebook.react.views.modal;

import ac.b;
import android.content.DialogInterface;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.ModalHostViewManagerDelegate;
import com.facebook.react.viewmanagers.ModalHostViewManagerInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = ReactModalHostManager.REACT_CLASS)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0017J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0013H\u0017J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0013H\u0017J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0013H\u0017J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0013H\u0017J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0013H\u0017J\u001a\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0017J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0013H\u0017J\u001a\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u001bH\u0017J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001dH\u0017J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0013H\u0017J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\"H\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\"\u0010%\u001a\u0004\u0018\u00010#2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/modal/ReactModalHostView;", "Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onDropViewInstance", "", "view", "setAnimationType", "value", "setTransparent", "", "setStatusBarTranslucent", "setNavigationBarTranslucent", "setHardwareAccelerated", "setVisible", "setPresentationStyle", "setAnimated", "setSupportedOrientations", "Lcom/facebook/react/bridge/ReadableArray;", "setIdentifier", "", "setAllowSwipeDismissal", "setTestId", "addEventEmitters", "getExportedCustomDirectEventTypeConstants", "", "", "onAfterUpdateTransaction", "updateState", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getDelegate", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactModalHostManager extends ViewGroupManager<ReactModalHostView> implements ModalHostViewManagerInterface<ReactModalHostView> {

    @NotNull
    public static final String REACT_CLASS = "RCTModalHostView";

    @NotNull
    private final ViewManagerDelegate<ReactModalHostView> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public ReactModalHostManager() {
        super(null, 1, 0 == true ? 1 : 0);
        this.delegate = new ModalHostViewManagerDelegate(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(EventDispatcher eventDispatcher, ThemedReactContext themedReactContext, ReactModalHostView reactModalHostView, DialogInterface dialogInterface) {
        eventDispatcher.dispatchEvent(new RequestCloseEvent(UIManagerHelper.getSurfaceId(themedReactContext), reactModalHostView.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$1(EventDispatcher eventDispatcher, ThemedReactContext themedReactContext, ReactModalHostView reactModalHostView, DialogInterface dialogInterface) {
        eventDispatcher.dispatchEvent(new ShowEvent(UIManagerHelper.getSurfaceId(themedReactContext), reactModalHostView.getId()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ReactModalHostView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put(RequestCloseEvent.EVENT_NAME, v0.b(new Pair("registrationName", "onRequestClose")));
        exportedCustomDirectEventTypeConstants.put(ShowEvent.EVENT_NAME, v0.b(new Pair("registrationName", "onShow")));
        exportedCustomDirectEventTypeConstants.put("topDismiss", v0.b(new Pair("registrationName", "onDismiss")));
        exportedCustomDirectEventTypeConstants.put("topOrientationChange", v0.b(new Pair("registrationName", "onOrientationChange")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "allowSwipeDismissal")
    public void setAllowSwipeDismissal(@NotNull ReactModalHostView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "animated")
    public void setAnimated(@NotNull ReactModalHostView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "identifier")
    public void setIdentifier(@NotNull ReactModalHostView view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "presentationStyle")
    public void setPresentationStyle(@NotNull ReactModalHostView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "supportedOrientations")
    public void setSupportedOrientations(@NotNull ReactModalHostView view, ReadableArray value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = ViewProps.VISIBLE)
    public void setVisible(@NotNull ReactModalHostView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull final ThemedReactContext reactContext, @NotNull final ReactModalHostView view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        final EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher(reactContext);
        if (eventDispatcher != null) {
            view.setOnRequestCloseListener(new b(eventDispatcher, reactContext, view, 5));
            view.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.facebook.react.views.modal.a
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ReactModalHostManager.addEventEmitters$lambda$1(eventDispatcher, reactContext, view, dialogInterface);
                }
            });
            view.setEventDispatcher(eventDispatcher);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactModalHostView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ReactModalHostView(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ReactModalHostView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.showOrUpdate();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull ReactModalHostView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance(view);
        view.onDropInstance();
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "animationType")
    public void setAnimationType(@NotNull ReactModalHostView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            view.setAnimationType(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "hardwareAccelerated")
    public void setHardwareAccelerated(@NotNull ReactModalHostView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHardwareAccelerated(value);
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(@NotNull ReactModalHostView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarTranslucent(value);
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(@NotNull ReactModalHostView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarTranslucent(value);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTestId(@NotNull ReactModalHostView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setTestId(view, value);
        view.setDialogRootViewGroupTestId(value);
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "transparent")
    public void setTransparent(@NotNull ReactModalHostView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTransparent(value);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(@NotNull ReactModalHostView view, @NotNull ReactStylesDiffMap props, @NotNull StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        view.setStateWrapper(stateWrapper);
        return null;
    }
}
