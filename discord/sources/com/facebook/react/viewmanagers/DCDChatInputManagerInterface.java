package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface DCDChatInputManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void backspace(T t5);

    void blur(T t5);

    void closeCustomKeyboard(T t5);

    void flushText(T t5, String str);

    void focus(T t5);

    void openCustomKeyboard(T t5);

    void openSystemKeyboard(T t5);

    void replaceRange(T t5, int i7, int i10, String str, String str2, boolean z5, String str3);

    void setEditable(T t5, boolean z5);

    void setKeyboardAppearance(T t5, int i7);

    void setKeyboardType(T t5, String str);

    void setMarkAsSpoilerTitle(T t5, String str);

    void setMaxHeight(T t5, Float f2);

    void setPlaceholder(T t5, String str);

    void setPlaceholderColor(T t5, Integer num);

    void setSelectedRange(T t5, int i7, int i10);

    void setSelectionColor(T t5, Integer num);

    void setSetNoExtractUI(T t5, Boolean bool);

    void setShouldShowCursor(T t5, boolean z5);

    void setText(T t5, String str);

    void setTextColor(T t5, Integer num);

    void setVerticalInset(T t5, Float f2);

    void updateTextBlocks(T t5, String str, String str2);
}
