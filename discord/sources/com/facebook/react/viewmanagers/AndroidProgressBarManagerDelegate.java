package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidProgressBarManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AndroidProgressBarManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidProgressBarManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                    b10 = 0;
                }
                break;
            case -877170387:
                if (str.equals(ViewProps.TEST_ID)) {
                    b10 = 1;
                }
                break;
            case -676876213:
                if (str.equals(ReactProgressBarViewManager.PROP_ATTR)) {
                    b10 = 2;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    b10 = 3;
                }
                break;
            case 633138363:
                if (str.equals(ReactProgressBarViewManager.PROP_INDETERMINATE)) {
                    b10 = 4;
                }
                break;
            case 1118509918:
                if (str.equals(ReactProgressBarViewManager.PROP_ANIMATING)) {
                    b10 = 5;
                }
                break;
            case 1804741442:
                if (str.equals(ReactProgressBarViewManager.PROP_STYLE)) {
                    b10 = 6;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setProgress(t5, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case 1:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setTestID(t5, obj == null ? "" : (String) obj);
                break;
            case 2:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setTypeAttr(t5, obj != null ? (String) obj : null);
                break;
            case 3:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 4:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setIndeterminate(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setAnimating(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 6:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setStyleAttr(t5, obj != null ? (String) obj : null);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
