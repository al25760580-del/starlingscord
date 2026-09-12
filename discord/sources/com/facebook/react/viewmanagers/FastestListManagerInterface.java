package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface FastestListManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void scrollToLocation(T t5, int i7, int i10, boolean z5, int i11);

    void scrollToTop(T t5, boolean z5);

    void setHorizontal(T t5, boolean z5);

    void setInsetEnd(T t5, float f2);

    void setInsetStart(T t5, float f2);

    void setKeyboardDismissOnDrag(T t5, boolean z5);

    void setPlaceholderConfig(T t5, ReadableMap readableMap);

    void setRenderAhead(T t5, String str);

    void setScrollEventThrottle(T t5, int i7);

    void setSectionsVersioned(T t5, ReadableMap readableMap);

    void setShowsHorizontalScrollIndicator(T t5, boolean z5);

    void setShowsVerticalScrollIndicator(T t5, boolean z5);
}
