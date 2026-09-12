package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSSearchBarManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void blur(T t5);

    void cancelSearch(T t5);

    void clearText(T t5);

    void focus(T t5);

    void setAllowToolbarIntegration(T t5, boolean z5);

    void setAutoCapitalize(T t5, String str);

    void setAutoFocus(T t5, boolean z5);

    void setBarTintColor(T t5, Integer num);

    void setCancelButtonText(T t5, String str);

    void setDisableBackButtonOverride(T t5, boolean z5);

    void setHeaderIconColor(T t5, Integer num);

    void setHideNavigationBar(T t5, String str);

    void setHideWhenScrolling(T t5, boolean z5);

    void setHintTextColor(T t5, Integer num);

    void setInputType(T t5, String str);

    void setObscureBackground(T t5, String str);

    void setPlaceholder(T t5, String str);

    void setPlacement(T t5, String str);

    void setShouldShowHintSearchIcon(T t5, boolean z5);

    void setText(T t5, String str);

    void setTextColor(T t5, Integer num);

    void setTintColor(T t5, Integer num);

    void toggleCancelButton(T t5, boolean z5);
}
