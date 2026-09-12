package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGDefsManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setClipPath(T t5, String str);

    void setClipRule(T t5, int i7);

    void setDisplay(T t5, String str);

    void setMarkerEnd(T t5, String str);

    void setMarkerMid(T t5, String str);

    void setMarkerStart(T t5, String str);

    void setMask(T t5, String str);

    void setMatrix(T t5, ReadableArray readableArray);

    void setName(T t5, String str);

    void setOpacity(T t5, float f2);

    void setPointerEvents(T t5, String str);

    void setResponsible(T t5, boolean z5);
}
