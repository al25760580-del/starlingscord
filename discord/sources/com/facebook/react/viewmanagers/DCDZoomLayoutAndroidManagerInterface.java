package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface DCDZoomLayoutAndroidManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setGestureEnabled(T t5, boolean z5);

    void setMaximumZoomScale(T t5, Float f2);

    void setMinimumZoomScale(T t5, Float f2);

    void unzoom(T t5, boolean z5);

    void zoomTo(T t5, float f2, float f7, float f10, boolean z5);
}
