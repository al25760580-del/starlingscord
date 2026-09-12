package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNGestureHandlerButtonManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setActiveOpacity(T t5, float f2);

    void setActiveScale(T t5, float f2);

    void setActiveUnderlayOpacity(T t5, float f2);

    void setBorderBlockColor(T t5, Integer num);

    void setBorderBlockEndColor(T t5, Integer num);

    void setBorderBlockStartColor(T t5, Integer num);

    void setBorderBottomColor(T t5, Integer num);

    void setBorderBottomEndRadius(T t5, Dynamic dynamic);

    void setBorderBottomLeftRadius(T t5, Dynamic dynamic);

    void setBorderBottomRightRadius(T t5, Dynamic dynamic);

    void setBorderBottomStartRadius(T t5, Dynamic dynamic);

    void setBorderBottomWidth(T t5, float f2);

    void setBorderColor(T t5, Integer num);

    void setBorderEndColor(T t5, Integer num);

    void setBorderEndEndRadius(T t5, Dynamic dynamic);

    void setBorderEndStartRadius(T t5, Dynamic dynamic);

    void setBorderEndWidth(T t5, float f2);

    void setBorderLeftColor(T t5, Integer num);

    void setBorderLeftWidth(T t5, float f2);

    void setBorderRadius(T t5, Dynamic dynamic);

    void setBorderRightColor(T t5, Integer num);

    void setBorderRightWidth(T t5, float f2);

    void setBorderStartColor(T t5, Integer num);

    void setBorderStartEndRadius(T t5, Dynamic dynamic);

    void setBorderStartStartRadius(T t5, Dynamic dynamic);

    void setBorderStartWidth(T t5, float f2);

    void setBorderStyle(T t5, String str);

    void setBorderTopColor(T t5, Integer num);

    void setBorderTopEndRadius(T t5, Dynamic dynamic);

    void setBorderTopLeftRadius(T t5, Dynamic dynamic);

    void setBorderTopRightRadius(T t5, Dynamic dynamic);

    void setBorderTopStartRadius(T t5, Dynamic dynamic);

    void setBorderTopWidth(T t5, float f2);

    void setBorderWidth(T t5, float f2);

    void setBorderless(T t5, boolean z5);

    void setDefaultOpacity(T t5, float f2);

    void setDefaultScale(T t5, float f2);

    void setDefaultUnderlayOpacity(T t5, float f2);

    void setEnabled(T t5, boolean z5);

    void setExclusive(T t5, boolean z5);

    void setForeground(T t5, boolean z5);

    void setHoverAnimationInDuration(T t5, int i7);

    void setHoverAnimationOutDuration(T t5, int i7);

    void setHoverOpacity(T t5, float f2);

    void setHoverScale(T t5, float f2);

    void setHoverUnderlayOpacity(T t5, float f2);

    void setLongPressAnimationOutDuration(T t5, int i7);

    void setLongPressDuration(T t5, int i7);

    void setNeedsOffscreenAlphaCompositing(T t5, boolean z5);

    void setOverflow(T t5, String str);

    void setPointerEvents(T t5, String str);

    void setRippleColor(T t5, Integer num);

    void setRippleRadius(T t5, int i7);

    void setTapAnimationInDuration(T t5, int i7);

    void setTapAnimationOutDuration(T t5, int i7);

    void setTouchSoundDisabled(T t5, boolean z5);

    void setUnderlayColor(T t5, Integer num);
}
