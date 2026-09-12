package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSSplitViewHostManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSSplitViewHostManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSSplitViewHostManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSSplitViewHostManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t5, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("showColumn")) {
            ((RNSSplitViewHostManagerInterface) this.mViewManager).showColumn(t5, readableArray.getString(0));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "preferredSplitBehavior":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setPreferredSplitBehavior(t5, (String) obj);
                break;
            case "orientation":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setOrientation(t5, (String) obj);
                break;
            case "primaryEdge":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setPrimaryEdge(t5, (String) obj);
                break;
            case "showInspector":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setShowInspector(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "showSecondaryToggleButton":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setShowSecondaryToggleButton(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "preferredDisplayMode":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setPreferredDisplayMode(t5, (String) obj);
                break;
            case "primaryBackgroundStyle":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setPrimaryBackgroundStyle(t5, (String) obj);
                break;
            case "topColumnForCollapsing":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setTopColumnForCollapsing(t5, (String) obj);
                break;
            case "presentsWithGesture":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setPresentsWithGesture(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "displayModeButtonVisibility":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setDisplayModeButtonVisibility(t5, (String) obj);
                break;
            case "columnMetrics":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setColumnMetrics(t5, (ReadableMap) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
