package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGFeBlendManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeBlendManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeBlendManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1221029593:
                if (str.equals("height")) {
                    b10 = 0;
                }
                break;
            case -934426595:
                if (str.equals("result")) {
                    b10 = 1;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b10 = 2;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b10 = 3;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
                    b10 = 4;
                }
                break;
            case 104365:
                if (str.equals("in2")) {
                    b10 = 5;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    b10 = 6;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b10 = 7;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setHeight(t5, new DynamicFromObject(obj));
                break;
            case 1:
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setResult(t5, obj != null ? (String) obj : null);
                break;
            case 2:
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setX(t5, new DynamicFromObject(obj));
                break;
            case 3:
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setY(t5, new DynamicFromObject(obj));
                break;
            case 4:
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setIn1(t5, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setIn2(t5, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setMode(t5, (String) obj);
                break;
            case 7:
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setWidth(t5, new DynamicFromObject(obj));
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
