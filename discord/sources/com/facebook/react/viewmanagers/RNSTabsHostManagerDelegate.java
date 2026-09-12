package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSTabsHostManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSTabsHostManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSTabsHostManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSTabsHostManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1873119606:
                if (str.equals("tabBarTintColor")) {
                    b10 = 0;
                }
                break;
            case -1716883528:
                if (str.equals("tabBarItemLabelVisibilityMode")) {
                    b10 = 1;
                }
                break;
            case -1583805635:
                if (str.equals("tabBarControllerMode")) {
                    b10 = 2;
                }
                break;
            case -1167805191:
                if (str.equals("tabBarItemIconColor")) {
                    b10 = 3;
                }
                break;
            case -1140765365:
                if (str.equals("tabBarItemActiveIndicatorColor")) {
                    b10 = 4;
                }
                break;
            case -727132909:
                if (str.equals("tabBarItemTitleFontColorActive")) {
                    b10 = 5;
                }
                break;
            case -149697865:
                if (str.equals("tabBarBackgroundColor")) {
                    b10 = 6;
                }
                break;
            case -141083017:
                if (str.equals("tabBarItemTitleFontSize")) {
                    b10 = 7;
                }
                break;
            case -93216851:
                if (str.equals("tabBarItemTitleFontColor")) {
                    b10 = 8;
                }
                break;
            case -78279173:
                if (str.equals("tabBarItemTitleFontStyle")) {
                    b10 = 9;
                }
                break;
            case 144476014:
                if (str.equals("tabBarMinimizeBehavior")) {
                    b10 = 10;
                }
                break;
            case 278168456:
                if (str.equals("tabBarHidden")) {
                    b10 = 11;
                }
                break;
            case 595595083:
                if (str.equals("nativeContainerBackgroundColor")) {
                    b10 = 12;
                }
                break;
            case 676974377:
                if (str.equals("tabBarItemActiveIndicatorEnabled")) {
                    b10 = 13;
                }
                break;
            case 697418079:
                if (str.equals("tabBarItemIconColorActive")) {
                    b10 = 14;
                }
                break;
            case 1458977038:
                if (str.equals("controlNavigationStateInJS")) {
                    b10 = 15;
                }
                break;
            case 1478227034:
                if (str.equals("tabBarItemTitleFontFamily")) {
                    b10 = 16;
                }
                break;
            case 1935822306:
                if (str.equals("tabBarItemRippleColor")) {
                    b10 = 17;
                }
                break;
            case 1968495470:
                if (str.equals("tabBarItemTitleFontWeight")) {
                    b10 = 18;
                }
                break;
            case 2018161757:
                if (str.equals("tabBarItemTitleFontSizeActive")) {
                    b10 = 19;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarTintColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 1:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemLabelVisibilityMode(t5, (String) obj);
                break;
            case 2:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarControllerMode(t5, (String) obj);
                break;
            case 3:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemIconColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 4:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemActiveIndicatorColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 5:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemTitleFontColorActive(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 6:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarBackgroundColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 7:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemTitleFontSize(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 8:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemTitleFontColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 9:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemTitleFontStyle(t5, obj != null ? (String) obj : null);
                break;
            case 10:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarMinimizeBehavior(t5, (String) obj);
                break;
            case 11:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarHidden(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 12:
                ((RNSTabsHostManagerInterface) this.mViewManager).setNativeContainerBackgroundColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 13:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemActiveIndicatorEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 14:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemIconColorActive(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 15:
                ((RNSTabsHostManagerInterface) this.mViewManager).setControlNavigationStateInJS(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 16:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemTitleFontFamily(t5, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemRippleColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 18:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemTitleFontWeight(t5, obj != null ? (String) obj : null);
                break;
            case 19:
                ((RNSTabsHostManagerInterface) this.mViewManager).setTabBarItemTitleFontSizeActive(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
