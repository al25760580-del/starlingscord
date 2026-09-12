package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSTabsScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSTabsScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSTabsScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1991728986:
                if (str.equals("bottomScrollEdgeEffect")) {
                    b10 = 0;
                }
                break;
            case -1871891504:
                if (str.equals("topScrollEdgeEffect")) {
                    b10 = 1;
                }
                break;
            case -1829317469:
                if (str.equals("userInterfaceStyle")) {
                    b10 = 2;
                }
                break;
            case -1791070590:
                if (str.equals("leftScrollEdgeEffect")) {
                    b10 = 3;
                }
                break;
            case -1770963447:
                if (str.equals("specialEffects")) {
                    b10 = 4;
                }
                break;
            case -1628518761:
                if (str.equals("rightScrollEdgeEffect")) {
                    b10 = 5;
                }
                break;
            case -1559978286:
                if (str.equals("iconResourceName")) {
                    b10 = 6;
                }
                break;
            case -1439500848:
                if (str.equals("orientation")) {
                    b10 = 7;
                }
                break;
            case -1270820115:
                if (str.equals("isFocused")) {
                    b10 = 8;
                }
                break;
            case -1186468415:
                if (str.equals("overrideScrollViewContentInsetAdjustmentBehavior")) {
                    b10 = 9;
                }
                break;
            case -1167193694:
                if (str.equals("isTitleUndefined")) {
                    b10 = 10;
                }
                break;
            case -881409398:
                if (str.equals("tabKey")) {
                    b10 = 11;
                }
                break;
            case -776576227:
                if (str.equals("iconImageSource")) {
                    b10 = 12;
                }
                break;
            case -737911981:
                if (str.equals("iconType")) {
                    b10 = 13;
                }
                break;
            case -558395241:
                if (str.equals("tabBarItemAccessibilityLabel")) {
                    b10 = 14;
                }
                break;
            case -270334418:
                if (str.equals("scrollEdgeAppearance")) {
                    b10 = 15;
                }
                break;
            case -10721392:
                if (str.equals("drawableIconResourceName")) {
                    b10 = 16;
                }
                break;
            case 28389121:
                if (str.equals("standardAppearance")) {
                    b10 = 17;
                }
                break;
            case 110371416:
                if (str.equals(AlertFragment.ARG_TITLE)) {
                    b10 = 18;
                }
                break;
            case 642560482:
                if (str.equals("systemItem")) {
                    b10 = 19;
                }
                break;
            case 1001537282:
                if (str.equals("selectedIconImageSource")) {
                    b10 = 20;
                }
                break;
            case 1072026510:
                if (str.equals("badgeValue")) {
                    b10 = 21;
                }
                break;
            case 1519110851:
                if (str.equals("tabBarItemBadgeBackgroundColor")) {
                    b10 = 22;
                }
                break;
            case 1577043198:
                if (str.equals("tabBarItemTestID")) {
                    b10 = 23;
                }
                break;
            case 1595935908:
                if (str.equals("tabBarItemBadgeTextColor")) {
                    b10 = 24;
                }
                break;
            case 2021932941:
                if (str.equals("selectedIconResourceName")) {
                    b10 = 25;
                }
                break;
            case 2109188258:
                if (str.equals("imageIconResource")) {
                    b10 = 26;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setBottomScrollEdgeEffect(t5, (String) obj);
                break;
            case 1:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setTopScrollEdgeEffect(t5, (String) obj);
                break;
            case 2:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setUserInterfaceStyle(t5, (String) obj);
                break;
            case 3:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setLeftScrollEdgeEffect(t5, (String) obj);
                break;
            case 4:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setSpecialEffects(t5, (ReadableMap) obj);
                break;
            case 5:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setRightScrollEdgeEffect(t5, (String) obj);
                break;
            case 6:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setIconResourceName(t5, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setOrientation(t5, (String) obj);
                break;
            case 8:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setIsFocused(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 9:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setOverrideScrollViewContentInsetAdjustmentBehavior(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 10:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setIsTitleUndefined(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 11:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setTabKey(t5, obj != null ? (String) obj : null);
                break;
            case 12:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setIconImageSource(t5, (ReadableMap) obj);
                break;
            case 13:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setIconType(t5, (String) obj);
                break;
            case 14:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setTabBarItemAccessibilityLabel(t5, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setScrollEdgeAppearance(t5, new DynamicFromObject(obj));
                break;
            case 16:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setDrawableIconResourceName(t5, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setStandardAppearance(t5, new DynamicFromObject(obj));
                break;
            case 18:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setTitle(t5, obj != null ? (String) obj : null);
                break;
            case 19:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setSystemItem(t5, (String) obj);
                break;
            case 20:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setSelectedIconImageSource(t5, (ReadableMap) obj);
                break;
            case 21:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setBadgeValue(t5, obj != null ? (String) obj : null);
                break;
            case 22:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setTabBarItemBadgeBackgroundColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 23:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setTabBarItemTestID(t5, obj != null ? (String) obj : null);
                break;
            case 24:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setTabBarItemBadgeTextColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 25:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setSelectedIconResourceName(t5, obj != null ? (String) obj : null);
                break;
            case 26:
                ((RNSTabsScreenManagerInterface) this.mViewManager).setImageIconResource(t5, (ReadableMap) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
