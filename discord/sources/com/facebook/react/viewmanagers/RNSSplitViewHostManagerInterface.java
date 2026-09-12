package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSSplitViewHostManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setColumnMetrics(T t5, ReadableMap readableMap);

    void setDisplayModeButtonVisibility(T t5, String str);

    void setOrientation(T t5, String str);

    void setPreferredDisplayMode(T t5, String str);

    void setPreferredSplitBehavior(T t5, String str);

    void setPresentsWithGesture(T t5, boolean z5);

    void setPrimaryBackgroundStyle(T t5, String str);

    void setPrimaryEdge(T t5, String str);

    void setShowInspector(T t5, boolean z5);

    void setShowSecondaryToggleButton(T t5, boolean z5);

    void setTopColumnForCollapsing(T t5, String str);

    void showColumn(T t5, String str);
}
