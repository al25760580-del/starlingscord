package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGFeGaussianBlurManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setEdgeMode(T t5, String str);

    void setHeight(T t5, Dynamic dynamic);

    void setIn1(T t5, String str);

    void setResult(T t5, String str);

    void setStdDeviationX(T t5, float f2);

    void setStdDeviationY(T t5, float f2);

    void setWidth(T t5, Dynamic dynamic);

    void setX(T t5, Dynamic dynamic);

    void setY(T t5, Dynamic dynamic);
}
