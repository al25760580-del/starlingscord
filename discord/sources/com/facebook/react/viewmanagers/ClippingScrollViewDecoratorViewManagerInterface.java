package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface ClippingScrollViewDecoratorViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setApplyWorkaroundForContentInsetHitTestBug(T t5, boolean z5);

    void setContentInsetBottom(T t5, double d6);

    void setContentInsetTop(T t5, double d6);
}
