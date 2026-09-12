package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNLinearGradientManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAngle(T t5, float f2);

    void setAngleCenter(T t5, ReadableMap readableMap);

    void setBorderRadii(T t5, ReadableArray readableArray);

    void setColors(T t5, ReadableArray readableArray);

    void setEndPoint(T t5, ReadableMap readableMap);

    void setLocations(T t5, ReadableArray readableArray);

    void setStartPoint(T t5, ReadableMap readableMap);

    void setUseAngle(T t5, boolean z5);
}
