package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNCSliderManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAccessibilityIncrements(T t5, ReadableArray readableArray);

    void setAccessibilityUnits(T t5, String str);

    void setDisabled(T t5, boolean z5);

    void setInverted(T t5, boolean z5);

    void setLowerLimit(T t5, float f2);

    void setMaximumTrackImage(T t5, ReadableMap readableMap);

    void setMaximumTrackTintColor(T t5, Integer num);

    void setMaximumValue(T t5, double d6);

    void setMinimumTrackImage(T t5, ReadableMap readableMap);

    void setMinimumTrackTintColor(T t5, Integer num);

    void setMinimumValue(T t5, double d6);

    void setStep(T t5, double d6);

    void setTapToSeek(T t5, boolean z5);

    void setTestID(T t5, String str);

    void setThumbImage(T t5, ReadableMap readableMap);

    void setThumbSize(T t5, float f2);

    void setThumbTintColor(T t5, Integer num);

    void setTrackImage(T t5, ReadableMap readableMap);

    void setUpperLimit(T t5, float f2);

    void setValue(T t5, float f2);

    void setVertical(T t5, boolean z5);
}
