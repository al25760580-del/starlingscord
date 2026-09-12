package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGSvgViewAndroidManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAccessible(T t5, boolean z5);

    void setAlign(T t5, String str);

    void setBackfaceVisibility(T t5, String str);

    void setBbHeight(T t5, Dynamic dynamic);

    void setBbWidth(T t5, Dynamic dynamic);

    void setBorderBlockColor(T t5, Integer num);

    void setBorderBlockEndColor(T t5, Integer num);

    void setBorderBlockStartColor(T t5, Integer num);

    void setBorderBottomColor(T t5, Integer num);

    void setBorderBottomEndRadius(T t5, Dynamic dynamic);

    void setBorderBottomLeftRadius(T t5, Dynamic dynamic);

    void setBorderBottomRightRadius(T t5, Dynamic dynamic);

    void setBorderBottomStartRadius(T t5, Dynamic dynamic);

    void setBorderColor(T t5, Integer num);

    void setBorderEndColor(T t5, Integer num);

    void setBorderEndEndRadius(T t5, Dynamic dynamic);

    void setBorderEndStartRadius(T t5, Dynamic dynamic);

    void setBorderLeftColor(T t5, Integer num);

    void setBorderRadius(T t5, Dynamic dynamic);

    void setBorderRightColor(T t5, Integer num);

    void setBorderStartColor(T t5, Integer num);

    void setBorderStartEndRadius(T t5, Dynamic dynamic);

    void setBorderStartStartRadius(T t5, Dynamic dynamic);

    void setBorderStyle(T t5, String str);

    void setBorderTopColor(T t5, Integer num);

    void setBorderTopEndRadius(T t5, Dynamic dynamic);

    void setBorderTopLeftRadius(T t5, Dynamic dynamic);

    void setBorderTopRightRadius(T t5, Dynamic dynamic);

    void setBorderTopStartRadius(T t5, Dynamic dynamic);

    void setColor(T t5, Integer num);

    void setFocusable(T t5, boolean z5);

    void setHasTVPreferredFocus(T t5, boolean z5);

    void setHitSlop(T t5, Dynamic dynamic);

    void setMeetOrSlice(T t5, int i7);

    void setMinX(T t5, float f2);

    void setMinY(T t5, float f2);

    void setNativeBackgroundAndroid(T t5, ReadableMap readableMap);

    void setNativeForegroundAndroid(T t5, ReadableMap readableMap);

    void setNeedsOffscreenAlphaCompositing(T t5, boolean z5);

    void setNextFocusDown(T t5, int i7);

    void setNextFocusForward(T t5, int i7);

    void setNextFocusLeft(T t5, int i7);

    void setNextFocusRight(T t5, int i7);

    void setNextFocusUp(T t5, int i7);

    void setPointerEvents(T t5, String str);

    void setRemoveClippedSubviews(T t5, boolean z5);

    void setVbHeight(T t5, float f2);

    void setVbWidth(T t5, float f2);
}
