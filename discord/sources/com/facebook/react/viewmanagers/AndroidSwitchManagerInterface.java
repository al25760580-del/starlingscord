package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface AndroidSwitchManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setDisabled(T t5, boolean z5);

    void setEnabled(T t5, boolean z5);

    void setNativeValue(T t5, boolean z5);

    void setOn(T t5, boolean z5);

    void setThumbColor(T t5, Integer num);

    void setThumbTintColor(T t5, Integer num);

    void setTrackColorForFalse(T t5, Integer num);

    void setTrackColorForTrue(T t5, Integer num);

    void setTrackTintColor(T t5, Integer num);

    void setValue(T t5, boolean z5);
}
