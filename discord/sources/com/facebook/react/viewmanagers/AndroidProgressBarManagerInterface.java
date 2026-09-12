package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface AndroidProgressBarManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAnimating(T t5, boolean z5);

    void setColor(T t5, Integer num);

    void setIndeterminate(T t5, boolean z5);

    void setProgress(T t5, double d6);

    void setStyleAttr(T t5, String str);

    void setTestID(T t5, String str);

    void setTypeAttr(T t5, String str);
}
