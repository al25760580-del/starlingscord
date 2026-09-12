package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSModalScreenManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSModalScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSModalScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSModalScreenManagerDelegate(BaseViewManager baseViewManager) {
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
            case "homeIndicatorHidden":
                b10 = 1;
                break;
            case "gestureEnabled":
                b10 = 2;
                break;
            case "hideKeyboardOnSwipe":
                b10 = 3;
                break;
            case "sheetCornerRadius":
                b10 = 4;
                break;
            case "navigationBarHidden":
                b10 = 5;
                break;
            case "statusBarTranslucent":
                b10 = 6;
                break;
            case "stackPresentation":
                b10 = 7;
                break;
            case "activityState":
                b10 = 8;
                break;
            case "statusBarColor":
                b10 = 9;
                break;
            case "statusBarStyle":
                b10 = 10;
                break;
            case "fullScreenSwipeShadowEnabled":
                b10 = 11;
                break;
            case "stackAnimation":
                b10 = 12;
                break;
            case "navigationBarColor":
                b10 = 13;
                break;
            case "screenId":
                b10 = 14;
                break;
            case "sheetInitialDetent":
                b10 = 15;
                break;
            case "sheetAllowedDetents":
                b10 = 16;
                break;
            case "replaceAnimation":
                b10 = 17;
                break;
            case "preventNativeDismiss":
                b10 = 18;
                break;
            case "statusBarHidden":
                b10 = 19;
                break;
            case "fullScreenSwipeEnabled":
                b10 = 20;
                break;
            case "gestureResponseDistance":
                b10 = 21;
                break;
            case "screenOrientation":
                b10 = 22;
                break;
            case "sheetLargestUndimmedDetent":
                b10 = 23;
                break;
            case "transitionDuration":
                b10 = 24;
                break;
            case "sheetShouldOverflowTopInset":
                b10 = 25;
                break;
            case "swipeDirection":
                b10 = 26;
                break;
            case "customAnimationOnSwipe":
                b10 = 27;
                break;
            case "navigationBarTranslucent":
                b10 = 28;
                break;
            case "sheetElevation":
                b10 = 29;
                break;
            case "sheetDefaultResizeAnimationEnabled":
                b10 = 30;
                break;
            case "sheetGrabberVisible":
                b10 = 31;
                break;
            case "statusBarAnimation":
                b10 = 32;
                break;
            case "nativeBackButtonDismissalEnabled":
                b10 = 33;
                break;
            case "sheetExpandsWhenScrolledToEdge":
                b10 = 34;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSynchronousShadowStateUpdatesEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSModalScreenManagerInterface) this.mViewManager).setHomeIndicatorHidden(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 2:
                ((RNSModalScreenManagerInterface) this.mViewManager).setGestureEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 3:
                ((RNSModalScreenManagerInterface) this.mViewManager).setHideKeyboardOnSwipe(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 4:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetCornerRadius(t5, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 5:
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarHidden(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarTranslucent(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStackPresentation(t5, (String) obj);
                break;
            case 8:
                ((RNSModalScreenManagerInterface) this.mViewManager).setActivityState(t5, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 9:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 10:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarStyle(t5, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSModalScreenManagerInterface) this.mViewManager).setFullScreenSwipeShadowEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 12:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStackAnimation(t5, (String) obj);
                break;
            case 13:
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 14:
                ((RNSModalScreenManagerInterface) this.mViewManager).setScreenId(t5, obj == null ? "" : (String) obj);
                break;
            case 15:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetInitialDetent(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 16:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetAllowedDetents(t5, (ReadableArray) obj);
                break;
            case 17:
                ((RNSModalScreenManagerInterface) this.mViewManager).setReplaceAnimation(t5, (String) obj);
                break;
            case 18:
                ((RNSModalScreenManagerInterface) this.mViewManager).setPreventNativeDismiss(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 19:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarHidden(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 20:
                ((RNSModalScreenManagerInterface) this.mViewManager).setFullScreenSwipeEnabled(t5, (String) obj);
                break;
            case 21:
                ((RNSModalScreenManagerInterface) this.mViewManager).setGestureResponseDistance(t5, (ReadableMap) obj);
                break;
            case 22:
                ((RNSModalScreenManagerInterface) this.mViewManager).setScreenOrientation(t5, obj != null ? (String) obj : null);
                break;
            case 23:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetLargestUndimmedDetent(t5, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case 24:
                ((RNSModalScreenManagerInterface) this.mViewManager).setTransitionDuration(t5, obj == null ? 500 : ((Double) obj).intValue());
                break;
            case 25:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetShouldOverflowTopInset(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 26:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSwipeDirection(t5, (String) obj);
                break;
            case 27:
                ((RNSModalScreenManagerInterface) this.mViewManager).setCustomAnimationOnSwipe(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 28:
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarTranslucent(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 29:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetElevation(t5, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case 30:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetDefaultResizeAnimationEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 31:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetGrabberVisible(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 32:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarAnimation(t5, obj != null ? (String) obj : null);
                break;
            case 33:
                ((RNSModalScreenManagerInterface) this.mViewManager).setNativeBackButtonDismissalEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 34:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetExpandsWhenScrolledToEdge(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
