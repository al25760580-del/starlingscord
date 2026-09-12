package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSScreenManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setActivityState(T t5, float f2);

    void setAndroidResetScreenShadowStateOnOrientationChangeEnabled(T t5, boolean z5);

    void setBottomScrollEdgeEffect(T t5, String str);

    void setCustomAnimationOnSwipe(T t5, boolean z5);

    void setFullScreenSwipeEnabled(T t5, String str);

    void setFullScreenSwipeShadowEnabled(T t5, boolean z5);

    void setGestureEnabled(T t5, boolean z5);

    void setGestureResponseDistance(T t5, ReadableMap readableMap);

    void setHideKeyboardOnSwipe(T t5, boolean z5);

    void setHomeIndicatorHidden(T t5, boolean z5);

    void setIos26AllowInteractionsDuringTransition(T t5, boolean z5);

    void setLeftScrollEdgeEffect(T t5, String str);

    void setNativeBackButtonDismissalEnabled(T t5, boolean z5);

    void setNavigationBarColor(T t5, Integer num);

    void setNavigationBarHidden(T t5, boolean z5);

    void setNavigationBarTranslucent(T t5, boolean z5);

    void setPreventNativeDismiss(T t5, boolean z5);

    void setReplaceAnimation(T t5, String str);

    void setRightScrollEdgeEffect(T t5, String str);

    void setScreenId(T t5, String str);

    void setScreenOrientation(T t5, String str);

    void setSheetAllowedDetents(T t5, ReadableArray readableArray);

    void setSheetCornerRadius(T t5, float f2);

    void setSheetDefaultResizeAnimationEnabled(T t5, boolean z5);

    void setSheetElevation(T t5, int i7);

    void setSheetExpandsWhenScrolledToEdge(T t5, boolean z5);

    void setSheetGrabberVisible(T t5, boolean z5);

    void setSheetInitialDetent(T t5, int i7);

    void setSheetLargestUndimmedDetent(T t5, int i7);

    void setSheetShouldOverflowTopInset(T t5, boolean z5);

    void setStackAnimation(T t5, String str);

    void setStackPresentation(T t5, String str);

    void setStatusBarAnimation(T t5, String str);

    void setStatusBarColor(T t5, Integer num);

    void setStatusBarHidden(T t5, boolean z5);

    void setStatusBarStyle(T t5, String str);

    void setStatusBarTranslucent(T t5, boolean z5);

    void setSwipeDirection(T t5, String str);

    void setSynchronousShadowStateUpdatesEnabled(T t5, boolean z5);

    void setTopScrollEdgeEffect(T t5, String str);

    void setTransitionDuration(T t5, int i7);
}
