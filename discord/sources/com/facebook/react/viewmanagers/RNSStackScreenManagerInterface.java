package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSStackScreenManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setActivityMode(T t5, String str);

    void setPreventNativeDismiss(T t5, boolean z5);

    void setScreenKey(T t5, String str);
}
