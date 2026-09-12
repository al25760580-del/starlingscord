package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;
import com.swmansion.rnscreens.bottomsheet.SheetDetents;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0003\b\u0017\u0018\u0000 b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0015H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\tH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0017H\u0007J\u001a\u0010#\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\tH\u0017J\u001a\u0010%\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\tH\u0017J\u0018\u0010'\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0017J\u001a\u0010*\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\tH\u0017J\u001a\u0010+\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\tH\u0017J\u001a\u0010-\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\tH\u0017J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0002\u00101J\u001a\u00102\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\tH\u0017J\u0018\u00104\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00105\u001a\u00020)H\u0017J\u0018\u00106\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00107\u001a\u00020)H\u0017J\u001f\u00108\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0002\u00101J\u0018\u0010:\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010;\u001a\u00020)H\u0017J\u0018\u0010<\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010=\u001a\u00020)H\u0017J\u0018\u0010>\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010?\u001a\u00020)H\u0017J\u001a\u0010@\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020\u0017H\u0017J\u001a\u0010B\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010C\u001a\u00020)H\u0017J\u001a\u0010D\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010E\u001a\u00020)H\u0017J\u001c\u0010F\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010A\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010G\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020)H\u0016J\u001a\u0010H\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020\u0017H\u0016J\u001a\u0010I\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020)H\u0016J\u001a\u0010J\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020)H\u0016J\u001c\u0010K\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010A\u001a\u0004\u0018\u00010LH\u0016J\u001a\u0010M\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020)H\u0016J\u001a\u0010N\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020)H\u0016J\u001c\u0010O\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010A\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010P\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010A\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010Q\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010A\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010R\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010A\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010S\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010A\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010T\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020)H\u0016J\u001a\u0010U\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020)H\u0016J\u001a\u0010V\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020)H\u0016J\u001a\u0010W\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010XH\u0017J\u0018\u0010Y\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u0017H\u0017J\u0018\u0010Z\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010A\u001a\u00020)H\u0017J\u0018\u0010[\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u0011H\u0017J\u0018\u0010\\\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010A\u001a\u00020)H\u0017J\u0018\u0010]\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u0017H\u0017J\u001a\u0010^\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0`H\u0016J\u000e\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/Screen;", "Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setActivityState", "", "view", "activityState", "", "addView", "parent", "child", "Landroid/view/View;", "index", "", "removeViewAt", "removeView", "updateState", "", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "onAfterUpdateTransaction", "logNotAvailable", "propName", "setStackPresentation", "presentation", "setStackAnimation", "animation", "setGestureEnabled", "gestureEnabled", "", "setReplaceAnimation", "setScreenOrientation", "screenOrientation", "setStatusBarAnimation", "statusBarAnimation", "setStatusBarColor", "statusBarColor", "(Lcom/swmansion/rnscreens/Screen;Ljava/lang/Integer;)V", "setStatusBarStyle", "statusBarStyle", "setStatusBarTranslucent", "statusBarTranslucent", "setStatusBarHidden", "statusBarHidden", "setNavigationBarColor", "navigationBarColor", "setNavigationBarTranslucent", "navigationBarTranslucent", "setNavigationBarHidden", "navigationBarHidden", "setNativeBackButtonDismissalEnabled", "nativeBackButtonDismissalEnabled", "setSheetElevation", "value", "setSheetShouldOverflowTopInset", "sheetShouldOverflowTopInset", "setSheetDefaultResizeAnimationEnabled", "sheetDefaultResizeAnimationEnabled", "setFullScreenSwipeEnabled", "setFullScreenSwipeShadowEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "setGestureResponseDistance", "Lcom/facebook/react/bridge/ReadableMap;", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "setBottomScrollEdgeEffect", "setLeftScrollEdgeEffect", "setRightScrollEdgeEffect", "setTopScrollEdgeEffect", "setSynchronousShadowStateUpdatesEnabled", "setIos26AllowInteractionsDuringTransition", "setAndroidResetScreenShadowStateOnOrientationChangeEnabled", "setSheetAllowedDetents", "Lcom/facebook/react/bridge/ReadableArray;", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "setSheetInitialDetent", "setScreenId", "getExportedCustomDirectEventTypeConstants", "", "getDelegate", "Companion", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ScreenViewManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nScreenViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenViewManager.kt\ncom/swmansion/rnscreens/ScreenViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n1#2:455\n*E\n"})
public class ScreenViewManager extends ViewGroupManager<Screen> implements RNSScreenManagerInterface<Screen> {

    @NotNull
    public static final String REACT_CLASS = "RNSScreen";

    @NotNull
    private final ViewManagerDelegate<Screen> delegate;

    public ScreenViewManager() {
        super(null, 1, null);
        this.delegate = new RNSScreenManagerDelegate(this);
    }

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<Screen> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return w0.h(new Pair("topDismissed", w0.f(new Pair("registrationName", "onDismissed"))), new Pair("topWillAppear", w0.f(new Pair("registrationName", "onWillAppear"))), new Pair("topAppear", w0.f(new Pair("registrationName", "onAppear"))), new Pair("topWillDisappear", w0.f(new Pair("registrationName", "onWillDisappear"))), new Pair("topDisappear", w0.f(new Pair("registrationName", "onDisappear"))), new Pair("topHeaderHeightChange", w0.f(new Pair("registrationName", "onHeaderHeightChange"))), new Pair("topHeaderBackButtonClicked", w0.f(new Pair("registrationName", "onHeaderBackButtonClicked"))), new Pair("topTransitionProgress", w0.f(new Pair("registrationName", "onTransitionProgress"))), new Pair("topSheetDetentChanged", w0.f(new Pair("registrationName", "onSheetDetentChanged"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setAndroidResetScreenShadowStateOnOrientationChangeEnabled(Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setBottomScrollEdgeEffect(Screen view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setCustomAnimationOnSwipe(Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setFullScreenSwipeEnabled(Screen view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setFullScreenSwipeShadowEnabled(Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setGestureResponseDistance(Screen view, ReadableMap value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHideKeyboardOnSwipe(Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHomeIndicatorHidden(Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setIos26AllowInteractionsDuringTransition(Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setLeftScrollEdgeEffect(Screen view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setPreventNativeDismiss(Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setRightScrollEdgeEffect(Screen view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSwipeDirection(Screen view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSynchronousShadowStateUpdatesEnabled(Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setTopScrollEdgeEffect(Screen view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setTransitionDuration(Screen view, int value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Screen createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new Screen(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull Screen view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.onFinalizePropsUpdate$react_native_screens_release();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull Screen parent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        super.removeView(parent, view);
        if (view instanceof ScreenFooter) {
            parent.setFooter(null);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setActivityState(@NotNull Screen view, float activityState) {
        Intrinsics.checkNotNullParameter(view, "view");
        setActivityState(view, (int) activityState);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(@NotNull Screen view, boolean gestureEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setGestureEnabled(gestureEnabled);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(@NotNull Screen view, boolean nativeBackButtonDismissalEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNativeBackButtonDismissalEnabled(nativeBackButtonDismissalEnabled);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(@NotNull Screen view, Integer navigationBarColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("navigationBarColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "navigationBarHidden")
    public void setNavigationBarHidden(@NotNull Screen view, boolean navigationBarHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(navigationBarHidden));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(@NotNull Screen view, boolean navigationBarTranslucent) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("navigationBarTranslucent");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "replaceAnimation")
    public void setReplaceAnimation(@NotNull Screen view, String animation) {
        Screen.ReplaceAnimation replaceAnimation;
        Intrinsics.checkNotNullParameter(view, "view");
        if (animation == null || Intrinsics.areEqual(animation, "pop")) {
            replaceAnimation = Screen.ReplaceAnimation.f7133e;
        } else {
            if (!Intrinsics.areEqual(animation, "push")) {
                throw new JSApplicationIllegalArgumentException("Unknown replace animation type ".concat(animation));
            }
            replaceAnimation = Screen.ReplaceAnimation.f7132d;
        }
        view.setReplaceAnimation(replaceAnimation);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setScreenId(@NotNull Screen view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null || value.length() == 0) {
            value = null;
        }
        view.setScreenId(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "screenOrientation")
    public void setScreenOrientation(@NotNull Screen view, String screenOrientation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScreenOrientation(screenOrientation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetAllowedDetents")
    public void setSheetAllowedDetents(@NotNull Screen view, ReadableArray value) {
        ?? C;
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null || value.size() <= 0) {
            C = kotlin.collections.c0.c(Double.valueOf(1.0d));
        } else {
            int size = value.size();
            C = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                C.add(Double.valueOf(value.getDouble(i7)));
            }
        }
        view.setSheetDetents(new SheetDetents(C));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetCornerRadius")
    public void setSheetCornerRadius(@NotNull Screen view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetCornerRadius(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetDefaultResizeAnimationEnabled")
    public void setSheetDefaultResizeAnimationEnabled(Screen view, boolean sheetDefaultResizeAnimationEnabled) {
        if (view != null) {
            view.setSheetDefaultResizeAnimationEnabled(sheetDefaultResizeAnimationEnabled);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetElevation")
    public void setSheetElevation(Screen view, int value) {
        if (view != null) {
            view.setSheetElevation(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(@NotNull Screen view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetExpandsWhenScrolledToEdge(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetGrabberVisible")
    public void setSheetGrabberVisible(@NotNull Screen view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetGrabberVisible(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetInitialDetent")
    public void setSheetInitialDetent(@NotNull Screen view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetInitialDetentIndex(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetLargestUndimmedDetent")
    public void setSheetLargestUndimmedDetent(@NotNull Screen view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (-1 > value || value >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        }
        view.setSheetLargestUndimmedDetentIndex(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetShouldOverflowTopInset")
    public void setSheetShouldOverflowTopInset(Screen view, boolean sheetShouldOverflowTopInset) {
        if (view != null) {
            view.setSheetShouldOverflowTopInset(sheetShouldOverflowTopInset);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r3.equals("default") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r3.equals("flip") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r3.equals("simple_push") != false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @com.facebook.react.uimanager.annotations.ReactProp(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackAnimation(@org.jetbrains.annotations.NotNull com.swmansion.rnscreens.Screen r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L91
            int r0 = r3.hashCode()
            switch(r0) {
                case -1418955385: goto L7c;
                case -1198710326: goto L71;
                case -427095442: goto L66;
                case -349395819: goto L5b;
                case 3135100: goto L50;
                case 3145837: goto L47;
                case 3387192: goto L3c;
                case 182437661: goto L31;
                case 1500346553: goto L26;
                case 1544803905: goto L1c;
                case 1601504978: goto L10;
                default: goto Le;
            }
        Le:
            goto L85
        L10:
            java.lang.String r0 = "slide_from_bottom"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            com.swmansion.rnscreens.Screen$StackAnimation r3 = com.swmansion.rnscreens.Screen.StackAnimation.f7138v
            goto L93
        L1c:
            java.lang.String r0 = "default"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            goto L91
        L26:
            java.lang.String r0 = "ios_from_right"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            com.swmansion.rnscreens.Screen$StackAnimation r3 = com.swmansion.rnscreens.Screen.StackAnimation.E
            goto L93
        L31:
            java.lang.String r0 = "fade_from_bottom"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            com.swmansion.rnscreens.Screen$StackAnimation r3 = com.swmansion.rnscreens.Screen.StackAnimation.f7141y
            goto L93
        L3c:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            com.swmansion.rnscreens.Screen$StackAnimation r3 = com.swmansion.rnscreens.Screen.StackAnimation.f7136e
            goto L93
        L47:
            java.lang.String r0 = "flip"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            goto L91
        L50:
            java.lang.String r0 = "fade"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            com.swmansion.rnscreens.Screen$StackAnimation r3 = com.swmansion.rnscreens.Screen.StackAnimation.f7137i
            goto L93
        L5b:
            java.lang.String r0 = "slide_from_right"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            com.swmansion.rnscreens.Screen$StackAnimation r3 = com.swmansion.rnscreens.Screen.StackAnimation.f7139w
            goto L93
        L66:
            java.lang.String r0 = "slide_from_left"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            com.swmansion.rnscreens.Screen$StackAnimation r3 = com.swmansion.rnscreens.Screen.StackAnimation.f7140x
            goto L93
        L71:
            java.lang.String r0 = "ios_from_left"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            com.swmansion.rnscreens.Screen$StackAnimation r3 = com.swmansion.rnscreens.Screen.StackAnimation.F
            goto L93
        L7c:
            java.lang.String r0 = "simple_push"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            goto L91
        L85:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r0 = "Unknown animation type "
            java.lang.String r3 = r0.concat(r3)
            r2.<init>(r3)
            throw r2
        L91:
            com.swmansion.rnscreens.Screen$StackAnimation r3 = com.swmansion.rnscreens.Screen.StackAnimation.f7135d
        L93:
            r2.setStackAnimation(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.Screen, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3.equals("fullScreenModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r3.equals("containedTransparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r3.equals("pageSheet") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r3.equals("containedModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r3.equals("modal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r3 = com.swmansion.rnscreens.Screen.StackPresentation.f7143e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r3.equals("transparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r3 = com.swmansion.rnscreens.Screen.StackPresentation.f7144i;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @com.facebook.react.uimanager.annotations.ReactProp(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackPresentation(@org.jetbrains.annotations.NotNull com.swmansion.rnscreens.Screen r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L62
            int r0 = r3.hashCode()
            switch(r0) {
                case -76271493: goto L54;
                case 3452698: goto L49;
                case 104069805: goto L3e;
                case 438078970: goto L35;
                case 872434704: goto L2c;
                case 955284238: goto L23;
                case 1171936146: goto L1a;
                case 1798290171: goto Lf;
                default: goto Le;
            }
        Le:
            goto L62
        Lf:
            java.lang.String r0 = "formSheet"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            com.swmansion.rnscreens.Screen$StackPresentation r3 = com.swmansion.rnscreens.Screen.StackPresentation.f7145v
            goto L5e
        L1a:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L23:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            goto L5c
        L2c:
            java.lang.String r0 = "pageSheet"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L35:
            java.lang.String r0 = "containedModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L3e:
            java.lang.String r0 = "modal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
        L46:
            com.swmansion.rnscreens.Screen$StackPresentation r3 = com.swmansion.rnscreens.Screen.StackPresentation.f7143e
            goto L5e
        L49:
            java.lang.String r0 = "push"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            com.swmansion.rnscreens.Screen$StackPresentation r3 = com.swmansion.rnscreens.Screen.StackPresentation.f7142d
            goto L5e
        L54:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
        L5c:
            com.swmansion.rnscreens.Screen$StackPresentation r3 = com.swmansion.rnscreens.Screen.StackPresentation.f7144i
        L5e:
            r2.setStackPresentation(r3)
            return
        L62:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r0 = "Unknown presentation type "
            java.lang.String r3 = a3.e.l(r0, r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.Screen, java.lang.String):void");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarAnimation")
    public void setStatusBarAnimation(@NotNull Screen view, String statusBarAnimation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((statusBarAnimation == null || Intrinsics.areEqual(ViewProps.NONE, statusBarAnimation)) ? false : true));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(@NotNull Screen view, Integer statusBarColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("statusBarColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarHidden")
    public void setStatusBarHidden(@NotNull Screen view, boolean statusBarHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(statusBarHidden));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarStyle")
    public void setStatusBarStyle(@NotNull Screen view, String statusBarStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarStyle(statusBarStyle);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(@NotNull Screen view, boolean statusBarTranslucent) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("statusBarTranslucent");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(@NotNull Screen view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull Screen parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof ScreenContentWrapper) {
            parent.registerLayoutCallbackForWrapper((ScreenContentWrapper) child);
        } else if (child instanceof ScreenFooter) {
            parent.setFooter((ScreenFooter) child);
        }
        super.addView(parent, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull Screen parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent.getChildAt(index) instanceof ScreenFooter) {
            parent.setFooter(null);
        }
        super.removeViewAt(parent, index);
    }

    @ReactProp(name = "activityState")
    public final void setActivityState(@NotNull Screen view, int activityState) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (activityState == -1) {
            return;
        }
        if (activityState == 0) {
            view.setActivityState(Screen.ActivityState.f7128d);
        } else if (activityState == 1) {
            view.setActivityState(Screen.ActivityState.f7129e);
        } else {
            if (activityState != 2) {
                return;
            }
            view.setActivityState(Screen.ActivityState.f7130i);
        }
    }
}
