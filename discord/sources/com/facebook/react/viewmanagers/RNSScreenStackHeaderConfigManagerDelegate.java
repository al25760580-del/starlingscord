package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSScreenStackHeaderConfigManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSScreenStackHeaderConfigManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenStackHeaderConfigManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2035671681:
                if (str.equals("synchronousShadowStateUpdatesEnabled")) {
                    b10 = 0;
                }
                break;
            case -1941136198:
                if (str.equals("consumeLeftInset")) {
                    b10 = 1;
                }
                break;
            case -1829317469:
                if (str.equals("userInterfaceStyle")) {
                    b10 = 2;
                }
                break;
            case -1822687399:
                if (str.equals("translucent")) {
                    b10 = 3;
                }
                break;
            case -1799367701:
                if (str.equals("titleColor")) {
                    b10 = 4;
                }
                break;
            case -1795707688:
                if (str.equals("blurEffect")) {
                    b10 = 5;
                }
                break;
            case -1774658170:
                if (str.equals("largeTitleColor")) {
                    b10 = 6;
                }
                break;
            case -1715368693:
                if (str.equals("titleFontFamily")) {
                    b10 = 7;
                }
                break;
            case -1503810304:
                if (str.equals("disableBackButtonMenu")) {
                    b10 = 8;
                }
                break;
            case -1225100257:
                if (str.equals("titleFontWeight")) {
                    b10 = 9;
                }
                break;
            case -1217487446:
                if (str.equals(ViewProps.HIDDEN)) {
                    b10 = 10;
                }
                break;
            case -1094575123:
                if (str.equals("largeTitleFontSize")) {
                    b10 = 11;
                }
                break;
            case -1093089076:
                if (str.equals("backButtonDisplayMode")) {
                    b10 = 12;
                }
                break;
            case -1063138943:
                if (str.equals("backTitleVisible")) {
                    b10 = 13;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    b10 = 14;
                }
                break;
            case -389245640:
                if (str.equals("largeTitleBackgroundColor")) {
                    b10 = 15;
                }
                break;
            case -140063148:
                if (str.equals("backButtonInCustomView")) {
                    b10 = 16;
                }
                break;
            case 347216:
                if (str.equals("largeTitleFontFamily")) {
                    b10 = 17;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    b10 = 18;
                }
                break;
            case 110371416:
                if (str.equals(AlertFragment.ARG_TITLE)) {
                    b10 = 19;
                }
                break;
            case 183888321:
                if (str.equals("backTitleFontSize")) {
                    b10 = 20;
                }
                break;
            case 243070244:
                if (str.equals("backTitleFontFamily")) {
                    b10 = 21;
                }
                break;
            case 339462402:
                if (str.equals("hideShadow")) {
                    b10 = 22;
                }
                break;
            case 490615652:
                if (str.equals("largeTitleFontWeight")) {
                    b10 = 23;
                }
                break;
            case 946001674:
                if (str.equals("headerRightBarButtonItems")) {
                    b10 = 24;
                }
                break;
            case 1014803837:
                if (str.equals("consumeRightInset")) {
                    b10 = 25;
                }
                break;
            case 1038753243:
                if (str.equals("hideBackButton")) {
                    b10 = 26;
                }
                break;
            case 1249557231:
                if (str.equals("headerLeftBarButtonItems")) {
                    b10 = 27;
                }
                break;
            case 1287124693:
                if (str.equals(ViewProps.BACKGROUND_COLOR)) {
                    b10 = 28;
                }
                break;
            case 1324688817:
                if (str.equals("backTitle")) {
                    b10 = 29;
                }
                break;
            case 1467093014:
                if (str.equals("consumeBottomInset")) {
                    b10 = 30;
                }
                break;
            case 1518161768:
                if (str.equals("titleFontSize")) {
                    b10 = 31;
                }
                break;
            case 1564506303:
                if (str.equals("largeTitleHideShadow")) {
                    b10 = 32;
                }
                break;
            case 2029798365:
                if (str.equals("largeTitle")) {
                    b10 = 33;
                }
                break;
            case 2099541337:
                if (str.equals("topInsetEnabled")) {
                    b10 = 34;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setSynchronousShadowStateUpdatesEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setConsumeLeftInset(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 2:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setUserInterfaceStyle(t5, (String) obj);
                break;
            case 3:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTranslucent(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 4:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 5:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBlurEffect(t5, (String) obj);
                break;
            case 6:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 7:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontFamily(t5, obj != null ? (String) obj : null);
                break;
            case 8:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setDisableBackButtonMenu(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 9:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontWeight(t5, obj != null ? (String) obj : null);
                break;
            case 10:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHidden(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontSize(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 12:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackButtonDisplayMode(t5, (String) obj);
                break;
            case 13:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleVisible(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 14:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setDirection(t5, (String) obj);
                break;
            case 15:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleBackgroundColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 16:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackButtonInCustomView(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontFamily(t5, obj != null ? (String) obj : null);
                break;
            case 18:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 19:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitle(t5, obj != null ? (String) obj : null);
                break;
            case 20:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleFontSize(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 21:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleFontFamily(t5, obj != null ? (String) obj : null);
                break;
            case 22:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHideShadow(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 23:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontWeight(t5, obj != null ? (String) obj : null);
                break;
            case 24:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHeaderRightBarButtonItems(t5, (ReadableArray) obj);
                break;
            case 25:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setConsumeRightInset(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 26:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHideBackButton(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 27:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHeaderLeftBarButtonItems(t5, (ReadableArray) obj);
                break;
            case 28:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackgroundColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 29:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitle(t5, obj != null ? (String) obj : null);
                break;
            case 30:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setConsumeBottomInset(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 31:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontSize(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 32:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleHideShadow(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 33:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitle(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 34:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTopInsetEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
