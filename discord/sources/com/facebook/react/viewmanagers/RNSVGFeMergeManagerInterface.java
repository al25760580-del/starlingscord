package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGFeMergeManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setHeight(T t5, Dynamic dynamic);

    void setNodes(T t5, ReadableArray readableArray);

    void setResult(T t5, String str);

    void setWidth(T t5, Dynamic dynamic);

    void setX(T t5, Dynamic dynamic);

    void setY(T t5, Dynamic dynamic);
}
