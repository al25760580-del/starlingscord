package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNGestureHandlerDetectorManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setHandlerTags(T t5, ReadableArray readableArray);

    void setModuleId(T t5, int i7);

    void setPointerEvents(T t5, String str);

    void setVirtualChildren(T t5, ReadableArray readableArray);
}
