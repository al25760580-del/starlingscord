package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface ActivityIndicatorViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAnimating(T t5, boolean z5);

    void setColor(T t5, Integer num);

    void setHidesWhenStopped(T t5, boolean z5);

    void setSize(T t5, String str);
}
