package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSTabsScreenManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBadgeValue(T t5, String str);

    void setBottomScrollEdgeEffect(T t5, String str);

    void setDrawableIconResourceName(T t5, String str);

    void setIconImageSource(T t5, ReadableMap readableMap);

    void setIconResourceName(T t5, String str);

    void setIconType(T t5, String str);

    void setImageIconResource(T t5, ReadableMap readableMap);

    void setIsFocused(T t5, boolean z5);

    void setIsTitleUndefined(T t5, boolean z5);

    void setLeftScrollEdgeEffect(T t5, String str);

    void setOrientation(T t5, String str);

    void setOverrideScrollViewContentInsetAdjustmentBehavior(T t5, boolean z5);

    void setRightScrollEdgeEffect(T t5, String str);

    void setScrollEdgeAppearance(T t5, Dynamic dynamic);

    void setSelectedIconImageSource(T t5, ReadableMap readableMap);

    void setSelectedIconResourceName(T t5, String str);

    void setSpecialEffects(T t5, ReadableMap readableMap);

    void setStandardAppearance(T t5, Dynamic dynamic);

    void setSystemItem(T t5, String str);

    void setTabBarItemAccessibilityLabel(T t5, String str);

    void setTabBarItemBadgeBackgroundColor(T t5, Integer num);

    void setTabBarItemBadgeTextColor(T t5, Integer num);

    void setTabBarItemTestID(T t5, String str);

    void setTabKey(T t5, String str);

    void setTitle(T t5, String str);

    void setTopScrollEdgeEffect(T t5, String str);

    void setUserInterfaceStyle(T t5, String str);
}
