package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface AndroidSwipeRefreshLayoutManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setColors(T t5, ReadableArray readableArray);

    void setEnabled(T t5, boolean z5);

    void setNativeRefreshing(T t5, boolean z5);

    void setProgressBackgroundColor(T t5, Integer num);

    void setProgressViewOffset(T t5, float f2);

    void setRefreshing(T t5, boolean z5);

    void setSize(T t5, String str);
}
