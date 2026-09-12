package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNDatePickerManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setButtonColor(T t5, String str);

    void setCancelText(T t5, String str);

    void setConfirmText(T t5, String str);

    void setDate(T t5, String str);

    void setDividerColor(T t5, String str);

    void setIs24hourSource(T t5, String str);

    void setLocale(T t5, String str);

    void setMaximumDate(T t5, String str);

    void setMinimumDate(T t5, String str);

    void setMinuteInterval(T t5, int i7);

    void setModal(T t5, boolean z5);

    void setMode(T t5, String str);

    void setOpen(T t5, boolean z5);

    void setTextColor(T t5, String str);

    void setTheme(T t5, String str);

    void setTimeZoneOffsetInMinutes(T t5, String str);

    void setTitle(T t5, String str);
}
