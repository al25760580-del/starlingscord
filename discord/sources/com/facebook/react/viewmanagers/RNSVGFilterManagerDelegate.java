package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFilterManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGFilterManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFilterManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFilterManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "primitiveUnits":
                ((RNSVGFilterManagerInterface) this.mViewManager).setPrimitiveUnits(t5, (String) obj);
                break;
            case "height":
                ((RNSVGFilterManagerInterface) this.mViewManager).setHeight(t5, new DynamicFromObject(obj));
                break;
            case "filterUnits":
                ((RNSVGFilterManagerInterface) this.mViewManager).setFilterUnits(t5, (String) obj);
                break;
            case "x":
                ((RNSVGFilterManagerInterface) this.mViewManager).setX(t5, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFilterManagerInterface) this.mViewManager).setY(t5, new DynamicFromObject(obj));
                break;
            case "name":
                ((RNSVGFilterManagerInterface) this.mViewManager).setName(t5, obj == null ? null : (String) obj);
                break;
            case "width":
                ((RNSVGFilterManagerInterface) this.mViewManager).setWidth(t5, new DynamicFromObject(obj));
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
