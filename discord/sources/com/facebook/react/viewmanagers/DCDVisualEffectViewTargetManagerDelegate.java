package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.DCDVisualEffectViewTargetManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class DCDVisualEffectViewTargetManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & DCDVisualEffectViewTargetManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDVisualEffectViewTargetManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        super.kotlinCompat$setProperty(t5, str, obj);
    }
}
