package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNPlainTextManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAllowFontScaling(T t5, boolean z5);

    void setColor(T t5, Integer num);

    void setEllipsizeMode(T t5, String str);

    void setExperiment(T t5, boolean z5);

    void setFontFamily(T t5, String str);

    void setFontSize(T t5, float f2);

    void setFontStyle(T t5, String str);

    void setFontVariant(T t5, ReadableArray readableArray);

    void setFontVariationSettings(T t5, String str);

    void setFontWeight(T t5, String str);

    void setHasLetterSpacing(T t5, boolean z5);

    void setIncludeFontPadding(T t5, boolean z5);

    void setLetterSpacing(T t5, float f2);

    void setLineHeight(T t5, float f2);

    void setLineHeightClippingIos(T t5, boolean z5);

    void setMaxFontSizeMultiplier(T t5, float f2);

    void setNumberOfLines(T t5, int i7);

    void setText(T t5, String str);

    void setTextAlign(T t5, String str);

    void setTextAlignVertical(T t5, String str);

    void setTextDecorationLine(T t5, String str);

    void setTextTransform(T t5, String str);
}
