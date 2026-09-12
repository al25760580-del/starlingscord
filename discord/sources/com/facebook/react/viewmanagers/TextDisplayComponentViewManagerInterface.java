package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface TextDisplayComponentViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setMarkdownTextRenderOptions(T t5, ReadableMap readableMap);

    void setModel(T t5, ReadableMap readableMap);
}
