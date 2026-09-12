package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.FastestListManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class FastestListManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & FastestListManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public FastestListManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t5, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("scrollToLocation")) {
            ((FastestListManagerInterface) this.mViewManager).scrollToLocation(t5, readableArray.getInt(0), readableArray.getInt(1), readableArray.getBoolean(2), readableArray.getInt(3));
        } else if (str.equals("scrollToTop")) {
            ((FastestListManagerInterface) this.mViewManager).scrollToTop(t5, readableArray.getBoolean(0));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1655631413:
                if (str.equals("renderAhead")) {
                    b10 = 0;
                }
                break;
            case -1635659115:
                if (str.equals("placeholderConfig")) {
                    b10 = 1;
                }
                break;
            case -922092170:
                if (str.equals("showsVerticalScrollIndicator")) {
                    b10 = 2;
                }
                break;
            case -4439498:
                if (str.equals("keyboardDismissOnDrag")) {
                    b10 = 3;
                }
                break;
            case 541802110:
                if (str.equals("insetEnd")) {
                    b10 = 4;
                }
                break;
            case 993893701:
                if (str.equals("insetStart")) {
                    b10 = 5;
                }
                break;
            case 1387629604:
                if (str.equals("horizontal")) {
                    b10 = 6;
                }
                break;
            case 1473194217:
                if (str.equals("sectionsVersioned")) {
                    b10 = 7;
                }
                break;
            case 1782490647:
                if (str.equals("scrollEventThrottle")) {
                    b10 = 8;
                }
                break;
            case 1915931784:
                if (str.equals("showsHorizontalScrollIndicator")) {
                    b10 = 9;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((FastestListManagerInterface) this.mViewManager).setRenderAhead(t5, obj == null ? null : (String) obj);
                break;
            case 1:
                ((FastestListManagerInterface) this.mViewManager).setPlaceholderConfig(t5, (ReadableMap) obj);
                break;
            case 2:
                ((FastestListManagerInterface) this.mViewManager).setShowsVerticalScrollIndicator(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((FastestListManagerInterface) this.mViewManager).setKeyboardDismissOnDrag(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 4:
                ((FastestListManagerInterface) this.mViewManager).setInsetEnd(t5, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case 5:
                ((FastestListManagerInterface) this.mViewManager).setInsetStart(t5, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case 6:
                ((FastestListManagerInterface) this.mViewManager).setHorizontal(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((FastestListManagerInterface) this.mViewManager).setSectionsVersioned(t5, (ReadableMap) obj);
                break;
            case 8:
                ((FastestListManagerInterface) this.mViewManager).setScrollEventThrottle(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 9:
                ((FastestListManagerInterface) this.mViewManager).setShowsHorizontalScrollIndicator(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
