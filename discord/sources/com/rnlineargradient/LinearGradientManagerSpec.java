package com.rnlineargradient;

import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNLinearGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNLinearGradientManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LinearGradientManagerSpec<T extends View> extends SimpleViewManager<T> implements RNLinearGradientManagerInterface<T> {
    private final ViewManagerDelegate<T> mDelegate = new RNLinearGradientManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<T> getDelegate() {
        return this.mDelegate;
    }
}
