package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGFeCompositeManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeCompositeManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeCompositeManagerDelegate(BaseViewManager baseViewManager) {
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
            case 3366:
                if (str.equals("k1")) {
                    b10 = 4;
                }
                break;
            case 3367:
                if (str.equals("k2")) {
                    b10 = 5;
                }
                break;
            case 3368:
                if (str.equals("k3")) {
                    b10 = 6;
                }
                break;
            case 3369:
                if (str.equals("k4")) {
                    b10 = 7;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
                    b10 = 8;
                }
                break;
            case 104365:
                if (str.equals("in2")) {
                    b10 = 9;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b10 = 10;
                }
                break;
            case 1662708749:
                if (str.equals("operator1")) {
                    b10 = 11;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setHeight(t5, new DynamicFromObject(obj));
                break;
            case 1:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setResult(t5, obj != null ? (String) obj : null);
                break;
            case 2:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setX(t5, new DynamicFromObject(obj));
                break;
            case 3:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setY(t5, new DynamicFromObject(obj));
                break;
            case 4:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setK1(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 5:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setK2(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 6:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setK3(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 7:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setK4(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 8:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setIn1(t5, obj != null ? (String) obj : null);
                break;
            case 9:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setIn2(t5, obj != null ? (String) obj : null);
                break;
            case 10:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setWidth(t5, new DynamicFromObject(obj));
                break;
            case 11:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setOperator1(t5, (String) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
