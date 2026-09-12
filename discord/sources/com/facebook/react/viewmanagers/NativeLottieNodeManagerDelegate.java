package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.NativeLottieNodeManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class NativeLottieNodeManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & NativeLottieNodeManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public NativeLottieNodeManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t5, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("setup")) {
            ((NativeLottieNodeManagerInterface) this.mViewManager).setup(t5, readableArray.getString(0), readableArray.getString(1), readableArray.getInt(2), readableArray.getInt(3), readableArray.getInt(4), readableArray.getBoolean(5), readableArray.getString(6));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        super.kotlinCompat$setProperty(t5, str, obj);
    }
}
