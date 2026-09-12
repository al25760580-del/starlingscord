package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface VirtualViewExperimentalManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setInitialHidden(T t5, boolean z5);

    void setRemoveClippedSubviews(T t5, boolean z5);

    void setRenderState(T t5, int i7);
}
