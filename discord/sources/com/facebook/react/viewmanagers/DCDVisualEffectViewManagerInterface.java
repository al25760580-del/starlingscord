package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface DCDVisualEffectViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBlurAmount(T t5, float f2);

    void setBlurEffectName(T t5, String str);

    void setBlurTargetViewNativeId(T t5, String str);

    void setBlurTintIOSParityCompensationColor(T t5, Integer num);

    void setTintColor(T t5, Integer num);
}
