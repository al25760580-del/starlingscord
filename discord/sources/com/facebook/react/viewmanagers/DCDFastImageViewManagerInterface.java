package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface DCDFastImageViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setEnableAnimation(T t5, boolean z5);

    void setFade(T t5, boolean z5);

    void setManualPlayback(T t5, boolean z5);

    void setPaused(T t5, boolean z5);

    void setPlaceholder(T t5, String str);

    void setResizeMode(T t5, String str);

    void setSource(T t5, ReadableMap readableMap);

    void setUsesSmallCache(T t5, boolean z5);
}
