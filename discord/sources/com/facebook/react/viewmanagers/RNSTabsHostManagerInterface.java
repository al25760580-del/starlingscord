package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSTabsHostManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setControlNavigationStateInJS(T t5, boolean z5);

    void setNativeContainerBackgroundColor(T t5, Integer num);

    void setTabBarBackgroundColor(T t5, Integer num);

    void setTabBarControllerMode(T t5, String str);

    void setTabBarHidden(T t5, boolean z5);

    void setTabBarItemActiveIndicatorColor(T t5, Integer num);

    void setTabBarItemActiveIndicatorEnabled(T t5, boolean z5);

    void setTabBarItemIconColor(T t5, Integer num);

    void setTabBarItemIconColorActive(T t5, Integer num);

    void setTabBarItemLabelVisibilityMode(T t5, String str);

    void setTabBarItemRippleColor(T t5, Integer num);

    void setTabBarItemTitleFontColor(T t5, Integer num);

    void setTabBarItemTitleFontColorActive(T t5, Integer num);

    void setTabBarItemTitleFontFamily(T t5, String str);

    void setTabBarItemTitleFontSize(T t5, float f2);

    void setTabBarItemTitleFontSizeActive(T t5, float f2);

    void setTabBarItemTitleFontStyle(T t5, String str);

    void setTabBarItemTitleFontWeight(T t5, String str);

    void setTabBarMinimizeBehavior(T t5, String str);

    void setTabBarTintColor(T t5, Integer num);
}
