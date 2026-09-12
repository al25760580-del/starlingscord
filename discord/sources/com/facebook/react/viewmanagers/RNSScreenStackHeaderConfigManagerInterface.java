package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSScreenStackHeaderConfigManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBackButtonDisplayMode(T t5, String str);

    void setBackButtonInCustomView(T t5, boolean z5);

    void setBackTitle(T t5, String str);

    void setBackTitleFontFamily(T t5, String str);

    void setBackTitleFontSize(T t5, int i7);

    void setBackTitleVisible(T t5, boolean z5);

    void setBackgroundColor(T t5, Integer num);

    void setBlurEffect(T t5, String str);

    void setColor(T t5, Integer num);

    void setConsumeBottomInset(T t5, boolean z5);

    void setConsumeLeftInset(T t5, boolean z5);

    void setConsumeRightInset(T t5, boolean z5);

    void setDirection(T t5, String str);

    void setDisableBackButtonMenu(T t5, boolean z5);

    void setHeaderLeftBarButtonItems(T t5, ReadableArray readableArray);

    void setHeaderRightBarButtonItems(T t5, ReadableArray readableArray);

    void setHidden(T t5, boolean z5);

    void setHideBackButton(T t5, boolean z5);

    void setHideShadow(T t5, boolean z5);

    void setLargeTitle(T t5, boolean z5);

    void setLargeTitleBackgroundColor(T t5, Integer num);

    void setLargeTitleColor(T t5, Integer num);

    void setLargeTitleFontFamily(T t5, String str);

    void setLargeTitleFontSize(T t5, int i7);

    void setLargeTitleFontWeight(T t5, String str);

    void setLargeTitleHideShadow(T t5, boolean z5);

    void setSynchronousShadowStateUpdatesEnabled(T t5, boolean z5);

    void setTitle(T t5, String str);

    void setTitleColor(T t5, Integer num);

    void setTitleFontFamily(T t5, String str);

    void setTitleFontSize(T t5, int i7);

    void setTitleFontWeight(T t5, String str);

    void setTopInsetEnabled(T t5, boolean z5);

    void setTranslucent(T t5, boolean z5);

    void setUserInterfaceStyle(T t5, String str);
}
