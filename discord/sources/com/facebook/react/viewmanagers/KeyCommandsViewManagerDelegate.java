package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.KeyCommandsViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class KeyCommandsViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & KeyCommandsViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public KeyCommandsViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        if (str.equals("keyCommands")) {
            ((KeyCommandsViewManagerInterface) this.mViewManager).setKeyCommands(t5, (ReadableArray) obj);
        } else {
            super.kotlinCompat$setProperty(t5, str, obj);
        }
    }
}
