package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface EmojiPickerViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void refreshEmojis(T t5);

    void scrollToHeaderIndex(T t5, int i7, boolean z5);

    void scrollingEnabled(T t5, boolean z5);

    void setConfig(T t5, ReadableMap readableMap);

    void setEmojiData(T t5, ReadableMap readableMap);

    void setEmojiMargin(T t5, int i7);

    void setEmojiSize(T t5, int i7);

    void setPaddingBottom(T t5, float f2);

    void setPaddingTop(T t5, float f2);

    void setUseTier0UpsellContent(T t5, boolean z5);
}
