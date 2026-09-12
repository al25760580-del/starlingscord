package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface ClipViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setCutouts(T t5, ReadableArray readableArray);
}
