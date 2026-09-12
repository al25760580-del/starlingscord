package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface ModalHostViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAllowSwipeDismissal(T t5, boolean z5);

    void setAnimated(T t5, boolean z5);

    void setAnimationType(T t5, String str);

    void setHardwareAccelerated(T t5, boolean z5);

    void setIdentifier(T t5, int i7);

    void setNavigationBarTranslucent(T t5, boolean z5);

    void setPresentationStyle(T t5, String str);

    void setStatusBarTranslucent(T t5, boolean z5);

    void setSupportedOrientations(T t5, ReadableArray readableArray);

    void setTransparent(T t5, boolean z5);

    void setVisible(T t5, boolean z5);
}
