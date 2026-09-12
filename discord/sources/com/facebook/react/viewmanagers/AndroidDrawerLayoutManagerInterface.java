package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface AndroidDrawerLayoutManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void closeDrawer(T t5);

    void openDrawer(T t5);

    void setDrawerBackgroundColor(T t5, Integer num);

    void setDrawerLockMode(T t5, String str);

    void setDrawerPosition(T t5, String str);

    void setDrawerWidth(T t5, Float f2);

    void setKeyboardDismissMode(T t5, String str);

    void setStatusBarBackgroundColor(T t5, Integer num);
}
