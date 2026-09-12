package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNLinearGradientManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNLinearGradientManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNLinearGradientManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNLinearGradientManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "startPoint":
                ((RNLinearGradientManagerInterface) this.mViewManager).setStartPoint(t5, (ReadableMap) obj);
                break;
            case "colors":
                ((RNLinearGradientManagerInterface) this.mViewManager).setColors(t5, (ReadableArray) obj);
                break;
            case "locations":
                ((RNLinearGradientManagerInterface) this.mViewManager).setLocations(t5, (ReadableArray) obj);
                break;
            case "useAngle":
                ((RNLinearGradientManagerInterface) this.mViewManager).setUseAngle(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "angle":
                ((RNLinearGradientManagerInterface) this.mViewManager).setAngle(t5, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case "borderRadii":
                ((RNLinearGradientManagerInterface) this.mViewManager).setBorderRadii(t5, (ReadableArray) obj);
                break;
            case "angleCenter":
                ((RNLinearGradientManagerInterface) this.mViewManager).setAngleCenter(t5, (ReadableMap) obj);
                break;
            case "endPoint":
                ((RNLinearGradientManagerInterface) this.mViewManager).setEndPoint(t5, (ReadableMap) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
