package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGFilterManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setFilterUnits(T t5, String str);

    void setHeight(T t5, Dynamic dynamic);

    void setName(T t5, String str);

    void setPrimitiveUnits(T t5, String str);

    void setWidth(T t5, Dynamic dynamic);

    void setX(T t5, Dynamic dynamic);

    void setY(T t5, Dynamic dynamic);
}
