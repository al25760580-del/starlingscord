package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGFeColorMatrixManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setHeight(T t5, Dynamic dynamic);

    void setIn1(T t5, String str);

    void setResult(T t5, String str);

    void setType(T t5, String str);

    void setValues(T t5, ReadableArray readableArray);

    void setWidth(T t5, Dynamic dynamic);

    void setX(T t5, Dynamic dynamic);

    void setY(T t5, Dynamic dynamic);
}
