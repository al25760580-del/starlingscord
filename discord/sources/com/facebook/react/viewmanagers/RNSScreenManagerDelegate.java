package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        byte b10;
        str.getClass();
        switch (str) {
            case "synchronousShadowStateUpdatesEnabled":
                b10 = 0;
                break;
            case "bottomScrollEdgeEffect":
                b10 = 1;
                break;
            case "homeIndicatorHidden":
                b10 = 2;
                break;
            case "topScrollEdgeEffect":
                b10 = 3;
                break;
            case "gestureEnabled":
                b10 = 4;
                break;
            case "leftScrollEdgeEffect":
                b10 = 5;
                break;
            case "hideKeyboardOnSwipe":
                b10 = 6;
                break;
            case "rightScrollEdgeEffect":
                b10 = 7;
                break;
            case "sheetCornerRadius":
                b10 = 8;
                break;
            case "navigationBarHidden":
                b10 = 9;
                break;
            case "statusBarTranslucent":
                b10 = 10;
                break;
            case "stackPresentation":
                b10 = 11;
                break;
            case "activityState":
                b10 = 12;
                break;
            case "statusBarColor":
                b10 = 13;
                break;
            case "statusBarStyle":
                b10 = 14;
                break;
            case "fullScreenSwipeShadowEnabled":
                b10 = 15;
                break;
            case "stackAnimation":
                b10 = 16;
                break;
            case "navigationBarColor":
                b10 = 17;
                break;
            case "screenId":
                b10 = 18;
                break;
            case "sheetInitialDetent":
                b10 = 19;
                break;
            case "sheetAllowedDetents":
                b10 = 20;
                break;
            case "replaceAnimation":
                b10 = 21;
                break;
            case "preventNativeDismiss":
                b10 = 22;
                break;
            case "statusBarHidden":
                b10 = 23;
                break;
            case "fullScreenSwipeEnabled":
                b10 = 24;
                break;
            case "gestureResponseDistance":
                b10 = 25;
                break;
            case "screenOrientation":
                b10 = 26;
                break;
            case "sheetLargestUndimmedDetent":
                b10 = 27;
                break;
            case "transitionDuration":
                b10 = 28;
                break;
            case "sheetShouldOverflowTopInset":
                b10 = 29;
                break;
            case "swipeDirection":
                b10 = 30;
                break;
            case "customAnimationOnSwipe":
                b10 = 31;
                break;
            case "navigationBarTranslucent":
                b10 = 32;
                break;
            case "ios26AllowInteractionsDuringTransition":
                b10 = 33;
                break;
            case "sheetElevation":
                b10 = 34;
                break;
            case "sheetDefaultResizeAnimationEnabled":
                b10 = 35;
                break;
            case "sheetGrabberVisible":
                b10 = 36;
                break;
            case "statusBarAnimation":
                b10 = 37;
                break;
            case "nativeBackButtonDismissalEnabled":
                b10 = 38;
                break;
            case "androidResetScreenShadowStateOnOrientationChangeEnabled":
                b10 = 39;
                break;
            case "sheetExpandsWhenScrolledToEdge":
                b10 = 40;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                ((RNSScreenManagerInterface) this.mViewManager).setSynchronousShadowStateUpdatesEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSScreenManagerInterface) this.mViewManager).setBottomScrollEdgeEffect(t5, (String) obj);
                break;
            case 2:
                ((RNSScreenManagerInterface) this.mViewManager).setHomeIndicatorHidden(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((RNSScreenManagerInterface) this.mViewManager).setTopScrollEdgeEffect(t5, (String) obj);
                break;
            case 4:
                ((RNSScreenManagerInterface) this.mViewManager).setGestureEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 5:
                ((RNSScreenManagerInterface) this.mViewManager).setLeftScrollEdgeEffect(t5, (String) obj);
                break;
            case 6:
                ((RNSScreenManagerInterface) this.mViewManager).setHideKeyboardOnSwipe(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((RNSScreenManagerInterface) this.mViewManager).setRightScrollEdgeEffect(t5, (String) obj);
                break;
            case 8:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetCornerRadius(t5, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 9:
                ((RNSScreenManagerInterface) this.mViewManager).setNavigationBarHidden(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 10:
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarTranslucent(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((RNSScreenManagerInterface) this.mViewManager).setStackPresentation(t5, (String) obj);
                break;
            case 12:
                ((RNSScreenManagerInterface) this.mViewManager).setActivityState(t5, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 13:
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 14:
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarStyle(t5, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSScreenManagerInterface) this.mViewManager).setFullScreenSwipeShadowEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 16:
                ((RNSScreenManagerInterface) this.mViewManager).setStackAnimation(t5, (String) obj);
                break;
            case 17:
                ((RNSScreenManagerInterface) this.mViewManager).setNavigationBarColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 18:
                ((RNSScreenManagerInterface) this.mViewManager).setScreenId(t5, obj == null ? "" : (String) obj);
                break;
            case 19:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetInitialDetent(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 20:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetAllowedDetents(t5, (ReadableArray) obj);
                break;
            case 21:
                ((RNSScreenManagerInterface) this.mViewManager).setReplaceAnimation(t5, (String) obj);
                break;
            case 22:
                ((RNSScreenManagerInterface) this.mViewManager).setPreventNativeDismiss(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 23:
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarHidden(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 24:
                ((RNSScreenManagerInterface) this.mViewManager).setFullScreenSwipeEnabled(t5, (String) obj);
                break;
            case 25:
                ((RNSScreenManagerInterface) this.mViewManager).setGestureResponseDistance(t5, (ReadableMap) obj);
                break;
            case 26:
                ((RNSScreenManagerInterface) this.mViewManager).setScreenOrientation(t5, obj != null ? (String) obj : null);
                break;
            case 27:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetLargestUndimmedDetent(t5, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case 28:
                ((RNSScreenManagerInterface) this.mViewManager).setTransitionDuration(t5, obj == null ? 500 : ((Double) obj).intValue());
                break;
            case 29:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetShouldOverflowTopInset(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 30:
                ((RNSScreenManagerInterface) this.mViewManager).setSwipeDirection(t5, (String) obj);
                break;
            case 31:
                ((RNSScreenManagerInterface) this.mViewManager).setCustomAnimationOnSwipe(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 32:
                ((RNSScreenManagerInterface) this.mViewManager).setNavigationBarTranslucent(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 33:
                ((RNSScreenManagerInterface) this.mViewManager).setIos26AllowInteractionsDuringTransition(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 34:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetElevation(t5, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case 35:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetDefaultResizeAnimationEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 36:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetGrabberVisible(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarAnimation(t5, obj != null ? (String) obj : null);
                break;
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                ((RNSScreenManagerInterface) this.mViewManager).setNativeBackButtonDismissalEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                ((RNSScreenManagerInterface) this.mViewManager).setAndroidResetScreenShadowStateOnOrientationChangeEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 40:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetExpandsWhenScrolledToEdge(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
