package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.ActivityIndicatorViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityIndicatorViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & ActivityIndicatorViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public ActivityIndicatorViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "size":
                ((ActivityIndicatorViewManagerInterface) this.mViewManager).setSize(t5, (String) obj);
                break;
            case "color":
                ((ActivityIndicatorViewManagerInterface) this.mViewManager).setColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case "hidesWhenStopped":
                ((ActivityIndicatorViewManagerInterface) this.mViewManager).setHidesWhenStopped(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "animating":
                ((ActivityIndicatorViewManagerInterface) this.mViewManager).setAnimating(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
