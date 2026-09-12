package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface LottieAnimationViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void pause(T t5);

    void play(T t5, int i7, int i10);

    void reset(T t5);

    void resume(T t5);

    void setAutoPlay(T t5, boolean z5);

    void setCacheComposition(T t5, boolean z5);

    void setColorFilters(T t5, ReadableArray readableArray);

    void setDummy(T t5, ReadableMap readableMap);

    void setEnableMergePathsAndroidForKitKatAndAbove(T t5, boolean z5);

    void setEnableSafeModeAndroid(T t5, boolean z5);

    void setHardwareAccelerationAndroid(T t5, boolean z5);

    void setImageAssetsFolder(T t5, String str);

    void setLoop(T t5, boolean z5);

    void setProgress(T t5, float f2);

    void setRenderMode(T t5, String str);

    void setResizeMode(T t5, String str);

    void setSourceDotLottieURI(T t5, String str);

    void setSourceJson(T t5, String str);

    void setSourceName(T t5, String str);

    void setSourceURL(T t5, String str);

    void setSpeed(T t5, double d6);

    void setTextFiltersAndroid(T t5, ReadableArray readableArray);

    void setTextFiltersIOS(T t5, ReadableArray readableArray);
}
