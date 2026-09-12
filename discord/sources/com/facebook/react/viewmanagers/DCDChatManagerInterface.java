package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface DCDChatManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void clearRows(T t5, int i7);

    void fadeIn(T t5);

    void scrollIntoView(T t5, int i7, boolean z5, boolean z6);

    void scrollTo(T t5, int i7, boolean z5, boolean z6, int i10);

    void scrollToBottom(T t5, boolean z5);

    void setAdjustContentOffsetWithBounds(T t5, Boolean bool);

    void setAlwaysRespectKeyboard(T t5, Boolean bool);

    void setAnimateEmoji(T t5, Boolean bool);

    void setChannelId(T t5, String str);

    void setHACK_fixModalInteraction(T t5, Boolean bool);

    void setInverted(T t5, boolean z5);

    void setKeyboardBackgroundColor(T t5, Integer num);

    void setRoleStyle(T t5, String str);

    void updateRows(T t5, String str, boolean z5, String str2, int i7, boolean z6, boolean z7, boolean z10);
}
