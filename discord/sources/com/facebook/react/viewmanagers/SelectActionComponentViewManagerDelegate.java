package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.SelectActionComponentViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class SelectActionComponentViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & SelectActionComponentViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public SelectActionComponentViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        if (str.equals("model")) {
            ((SelectActionComponentViewManagerInterface) this.mViewManager).setModel(t5, (ReadableMap) obj);
        } else {
            super.kotlinCompat$setProperty(t5, str, obj);
        }
    }
}
