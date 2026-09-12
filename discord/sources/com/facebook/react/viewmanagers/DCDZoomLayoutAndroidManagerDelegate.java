package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.DCDZoomLayoutAndroidManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class DCDZoomLayoutAndroidManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & DCDZoomLayoutAndroidManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDZoomLayoutAndroidManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t5, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("unzoom")) {
            ((DCDZoomLayoutAndroidManagerInterface) this.mViewManager).unzoom(t5, readableArray.getBoolean(0));
        } else if (str.equals("zoomTo")) {
            ((DCDZoomLayoutAndroidManagerInterface) this.mViewManager).zoomTo(t5, (float) readableArray.getDouble(0), (float) readableArray.getDouble(1), (float) readableArray.getDouble(2), readableArray.getBoolean(3));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1853558344:
                if (str.equals("gestureEnabled")) {
                    b10 = 0;
                }
                break;
            case -153607991:
                if (str.equals("minimumZoomScale")) {
                    b10 = 1;
                }
                break;
            case -89739529:
                if (str.equals("maximumZoomScale")) {
                    b10 = 2;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((DCDZoomLayoutAndroidManagerInterface) this.mViewManager).setGestureEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 1:
                ((DCDZoomLayoutAndroidManagerInterface) this.mViewManager).setMinimumZoomScale(t5, obj != null ? Float.valueOf(((Double) obj).floatValue()) : null);
                break;
            case 2:
                ((DCDZoomLayoutAndroidManagerInterface) this.mViewManager).setMaximumZoomScale(t5, obj != null ? Float.valueOf(((Double) obj).floatValue()) : null);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
