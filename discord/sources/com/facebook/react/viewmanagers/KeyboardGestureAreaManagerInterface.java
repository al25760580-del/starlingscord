package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface KeyboardGestureAreaManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setEnableSwipeToDismiss(T t5, boolean z5);

    void setInterpolator(T t5, String str);

    void setOffset(T t5, double d6);

    void setShowOnSwipeUp(T t5, boolean z5);

    void setTextInputNativeID(T t5, String str);
}
