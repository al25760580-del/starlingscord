package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNGestureHandlerRootViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNGestureHandlerRootViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNGestureHandlerRootViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNGestureHandlerRootViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        if (str.equals("moduleId")) {
            ((RNGestureHandlerRootViewManagerInterface) this.mViewManager).setModuleId(t5, obj == null ? -1 : ((Double) obj).intValue());
        } else if (str.equals("unstable_forceActive")) {
            ((RNGestureHandlerRootViewManagerInterface) this.mViewManager).setUnstable_forceActive(t5, obj == null ? false : ((Boolean) obj).booleanValue());
        } else {
            super.kotlinCompat$setProperty(t5, str, obj);
        }
    }
}
