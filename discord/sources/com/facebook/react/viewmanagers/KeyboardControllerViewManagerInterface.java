package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface KeyboardControllerViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setEnabled(T t5, boolean z5);

    void setNavigationBarTranslucent(T t5, boolean z5);

    void setPreserveEdgeToEdge(T t5, boolean z5);

    void setStatusBarTranslucent(T t5, boolean z5);

    void synchronizeFocusedInputLayout(T t5);
}
