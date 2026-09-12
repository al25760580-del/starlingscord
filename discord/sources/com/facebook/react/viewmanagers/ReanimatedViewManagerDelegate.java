package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.ReanimatedViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class ReanimatedViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & ReanimatedViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public ReanimatedViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        if (str.equals("hasEnteringAnimation")) {
            ((ReanimatedViewManagerInterface) this.mViewManager).setHasEnteringAnimation(t5, obj == null ? false : ((Boolean) obj).booleanValue());
        } else {
            super.kotlinCompat$setProperty(t5, str, obj);
        }
    }
}
