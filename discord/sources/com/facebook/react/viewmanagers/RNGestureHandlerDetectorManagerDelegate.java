package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNGestureHandlerDetectorManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNGestureHandlerDetectorManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNGestureHandlerDetectorManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNGestureHandlerDetectorManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "moduleId":
                ((RNGestureHandlerDetectorManagerInterface) this.mViewManager).setModuleId(t5, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case "pointerEvents":
                ((RNGestureHandlerDetectorManagerInterface) this.mViewManager).setPointerEvents(t5, (String) obj);
                break;
            case "virtualChildren":
                ((RNGestureHandlerDetectorManagerInterface) this.mViewManager).setVirtualChildren(t5, (ReadableArray) obj);
                break;
            case "handlerTags":
                ((RNGestureHandlerDetectorManagerInterface) this.mViewManager).setHandlerTags(t5, (ReadableArray) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
