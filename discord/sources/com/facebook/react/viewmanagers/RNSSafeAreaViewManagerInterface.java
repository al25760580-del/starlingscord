package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSSafeAreaViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setEdges(T t5, ReadableMap readableMap);

    void setInsetType(T t5, String str);
}
