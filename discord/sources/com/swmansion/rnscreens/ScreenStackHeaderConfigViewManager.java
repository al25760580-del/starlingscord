package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 u2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001vB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010#J\u001f\u0010%\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b.\u0010#J!\u00101\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u00102J\u001f\u00106\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0015H\u0017¢\u0006\u0004\b6\u0010&J!\u00108\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b8\u00102J!\u0010:\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b=\u0010;J\u001f\u0010?\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010>\u001a\u00020+H\u0017¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010A\u001a\u00020+H\u0017¢\u0006\u0004\bB\u0010@J\u001f\u0010D\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010C\u001a\u00020+H\u0017¢\u0006\u0004\bD\u0010@J\u001f\u0010F\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010E\u001a\u00020+H\u0017¢\u0006\u0004\bF\u0010@J\u001f\u0010H\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010G\u001a\u00020+H\u0017¢\u0006\u0004\bH\u0010@J\u001f\u0010J\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010I\u001a\u00020+H\u0017¢\u0006\u0004\bJ\u0010@J!\u0010L\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010K\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\bL\u0010;J\u001f\u0010N\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010M\u001a\u00020+H\u0017¢\u0006\u0004\bN\u0010@J\u001f\u0010P\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010O\u001a\u00020+H\u0017¢\u0006\u0004\bP\u0010@J\u001f\u0010R\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020+H\u0017¢\u0006\u0004\bR\u0010@J!\u0010T\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010S\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bT\u00102J!\u0010V\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\bV\u0010@J\u001b\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0WH\u0016¢\u0006\u0004\bX\u0010YJ\u0015\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00020ZH\u0014¢\u0006\u0004\b[\u0010\\J#\u0010]\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b]\u00102J#\u0010^\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b^\u00102J!\u0010_\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020\u0015H\u0016¢\u0006\u0004\b_\u0010&J!\u0010`\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\b`\u0010@J!\u0010a\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\ba\u0010@J#\u0010b\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bb\u00102J!\u0010c\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020\u0015H\u0016¢\u0006\u0004\bc\u0010&J#\u0010d\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bd\u00102J#\u0010e\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\be\u0010;J!\u0010f\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\bf\u0010@J#\u0010g\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bg\u0010;J!\u0010h\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\bh\u0010@J#\u0010i\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bi\u00102J#\u0010j\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bj\u00102J#\u0010l\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010kH\u0016¢\u0006\u0004\bl\u0010mJ#\u0010n\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010kH\u0016¢\u0006\u0004\bn\u0010mJ#\u0010o\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bo\u00102J\u0017\u0010q\u001a\u00020\u00172\u0006\u0010p\u001a\u00020\u0006H\u0002¢\u0006\u0004\bq\u0010rR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010t¨\u0006w"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/LayoutShadowNode;", "parent", "Landroid/view/View;", "child", "", "index", "", "addView", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Landroid/view/View;I)V", "view", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "onDropViewInstance", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;)V", "removeAllViews", "removeViewAt", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;I)V", "getChildCount", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;)I", "getChildAt", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;I)Landroid/view/View;", "", "needsCustomLayoutForChildren", "()Z", "onAfterUpdateTransaction", "config", AlertFragment.ARG_TITLE, "setTitle", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Ljava/lang/Integer;)V", ViewProps.BACKGROUND_COLOR, "setBackgroundColor", "hideShadow", "setHideShadow", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Z)V", "hideBackButton", "setHideBackButton", "topInsetEnabled", "setTopInsetEnabled", "consumeLeftInset", "setConsumeLeftInset", "consumeRightInset", "setConsumeRightInset", "consumeBottomInset", "setConsumeBottomInset", ViewProps.COLOR, "setColor", ViewProps.HIDDEN, "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "value", "setSynchronousShadowStateUpdatesEnabled", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "setBackTitle", "setBackTitleFontFamily", "setBackTitleFontSize", "setBackTitleVisible", "setLargeTitle", "setLargeTitleFontFamily", "setLargeTitleFontSize", "setLargeTitleFontWeight", "setLargeTitleBackgroundColor", "setLargeTitleHideShadow", "setLargeTitleColor", "setDisableBackButtonMenu", "setBackButtonDisplayMode", "setBlurEffect", "Lcom/facebook/react/bridge/ReadableArray;", "setHeaderLeftBarButtonItems", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Lcom/facebook/react/bridge/ReadableArray;)V", "setHeaderRightBarButtonItems", "setUserInterfaceStyle", "propName", "logNotAvailable", "(Ljava/lang/String;)V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "com/swmansion/rnscreens/h0", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<ScreenStackHeaderConfig> implements RNSScreenStackHeaderConfigManagerInterface<ScreenStackHeaderConfig> {

    @NotNull
    public static final h0 Companion = new h0();

    @NotNull
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";

    @NotNull
    private final ViewManagerDelegate<ScreenStackHeaderConfig> delegate;

    public ScreenStackHeaderConfigViewManager() {
        super(null, 1, null);
        this.delegate = new RNSScreenStackHeaderConfigManagerDelegate(this);
    }

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ScreenStackHeaderConfig> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return w0.f(new Pair("topAttached", w0.f(new Pair("registrationName", "onAttached"))), new Pair("topDetached", w0.f(new Pair("registrationName", "onDetached"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setSynchronousShadowStateUpdatesEnabled(ScreenStackHeaderConfig config, boolean value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public LayoutShadowNode createShadowNodeInstance(@NotNull ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return new g0();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ScreenStackHeaderConfig createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ScreenStackHeaderConfig(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ScreenStackHeaderConfig parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        super.onAfterUpdateTransaction(parent);
        parent.d();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull ScreenStackHeaderConfig view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.Q = true;
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(@NotNull ScreenStackHeaderConfig parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.f7167y.clear();
        parent.b();
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackButtonDisplayMode(ScreenStackHeaderConfig view, String value) {
        logNotAvailable("backButtonDisplayMode");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(@NotNull ScreenStackHeaderConfig config, boolean backButtonInCustomView) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setBackButtonInCustomView(backButtonInCustomView);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitle(ScreenStackHeaderConfig view, String value) {
        logNotAvailable("backTitle");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleFontFamily(ScreenStackHeaderConfig view, String value) {
        logNotAvailable("backTitleFontFamily");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleFontSize(ScreenStackHeaderConfig view, int value) {
        logNotAvailable("backTitleFontSize");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleVisible(ScreenStackHeaderConfig view, boolean value) {
        logNotAvailable("backTitleVisible");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(customType = "Color", name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(@NotNull ScreenStackHeaderConfig config, Integer backgroundColor) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBlurEffect(ScreenStackHeaderConfig view, String value) {
        logNotAvailable("blurEffect");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(@NotNull ScreenStackHeaderConfig config, Integer color) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTintColor(color != null ? color.intValue() : 0);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(defaultBoolean = true, name = "consumeBottomInset")
    public void setConsumeBottomInset(@NotNull ScreenStackHeaderConfig config, boolean consumeBottomInset) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setConsumeBottomInset(consumeBottomInset);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(defaultBoolean = true, name = "consumeLeftInset")
    public void setConsumeLeftInset(@NotNull ScreenStackHeaderConfig config, boolean consumeLeftInset) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setConsumeLeftInset(consumeLeftInset);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(defaultBoolean = true, name = "consumeRightInset")
    public void setConsumeRightInset(@NotNull ScreenStackHeaderConfig config, boolean consumeRightInset) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setConsumeRightInset(consumeRightInset);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "direction")
    public void setDirection(@NotNull ScreenStackHeaderConfig config, String direction) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setDirection(direction);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setDisableBackButtonMenu(ScreenStackHeaderConfig view, boolean value) {
        logNotAvailable("disableBackButtonMenu");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setHeaderLeftBarButtonItems(ScreenStackHeaderConfig view, ReadableArray value) {
        logNotAvailable("headerLeftBarButtonItems");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setHeaderRightBarButtonItems(ScreenStackHeaderConfig view, ReadableArray value) {
        logNotAvailable("headerRightBarButtonItems");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = ViewProps.HIDDEN)
    public void setHidden(@NotNull ScreenStackHeaderConfig config, boolean hidden) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHidden(hidden);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "hideBackButton")
    public void setHideBackButton(@NotNull ScreenStackHeaderConfig config, boolean hideBackButton) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHideBackButton(hideBackButton);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "hideShadow")
    public void setHideShadow(@NotNull ScreenStackHeaderConfig config, boolean hideShadow) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHideShadow(hideShadow);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitle(ScreenStackHeaderConfig view, boolean value) {
        logNotAvailable("largeTitle");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleBackgroundColor(ScreenStackHeaderConfig view, Integer value) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleColor(ScreenStackHeaderConfig view, Integer value) {
        logNotAvailable("largeTitleColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontFamily(ScreenStackHeaderConfig view, String value) {
        logNotAvailable("largeTitleFontFamily");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontSize(ScreenStackHeaderConfig view, int value) {
        logNotAvailable("largeTitleFontSize");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontWeight(ScreenStackHeaderConfig view, String value) {
        logNotAvailable("largeTitleFontWeight");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleHideShadow(ScreenStackHeaderConfig view, boolean value) {
        logNotAvailable("largeTitleHideShadow");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = AlertFragment.ARG_TITLE)
    public void setTitle(@NotNull ScreenStackHeaderConfig config, String title) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitle(title);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(customType = "Color", name = "titleColor")
    public void setTitleColor(@NotNull ScreenStackHeaderConfig config, Integer titleColor) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (titleColor != null) {
            config.setTitleColor(titleColor.intValue());
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "titleFontFamily")
    public void setTitleFontFamily(@NotNull ScreenStackHeaderConfig config, String titleFontFamily) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontFamily(titleFontFamily);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "titleFontSize")
    public void setTitleFontSize(@NotNull ScreenStackHeaderConfig config, int titleFontSize) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontSize(titleFontSize);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "titleFontWeight")
    public void setTitleFontWeight(@NotNull ScreenStackHeaderConfig config, String titleFontWeight) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontWeight(titleFontWeight);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "topInsetEnabled")
    public void setTopInsetEnabled(@NotNull ScreenStackHeaderConfig config, boolean topInsetEnabled) {
        Intrinsics.checkNotNullParameter(config, "config");
        logNotAvailable("topInsetEnabled");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "translucent")
    public void setTranslucent(@NotNull ScreenStackHeaderConfig config, boolean translucent) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTranslucent(translucent);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setUserInterfaceStyle(ScreenStackHeaderConfig view, String value) {
        logNotAvailable("userInterfaceStyle");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(@NotNull ScreenStackHeaderConfig view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull ScreenStackHeaderConfig parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof k0) {
            k0 child2 = (k0) child;
            parent.getClass();
            Intrinsics.checkNotNullParameter(child2, "child");
            parent.f7167y.add(index, child2);
            parent.b();
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @NotNull
    public View getChildAt(@NotNull ScreenStackHeaderConfig parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object obj = parent.f7167y.get(index);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (k0) obj;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull ScreenStackHeaderConfig parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull ScreenStackHeaderConfig parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.f7167y.remove(index);
        parent.b();
    }
}
