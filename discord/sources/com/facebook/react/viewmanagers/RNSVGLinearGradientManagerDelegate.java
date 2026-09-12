package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGLinearGradientManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGLinearGradientManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGLinearGradientManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1932235233:
                if (str.equals("gradientUnits")) {
                    b10 = 0;
                }
                break;
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    b10 = 1;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b10 = 2;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b10 = 3;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b10 = 4;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b10 = 5;
                }
                break;
            case 3769:
                if (str.equals("x1")) {
                    b10 = 6;
                }
                break;
            case 3770:
                if (str.equals("x2")) {
                    b10 = 7;
                }
                break;
            case 3800:
                if (str.equals("y1")) {
                    b10 = 8;
                }
                break;
            case 3801:
                if (str.equals("y2")) {
                    b10 = 9;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b10 = 10;
                }
                break;
            case 3373707:
                if (str.equals(StackTraceHelper.NAME_KEY)) {
                    b10 = 11;
                }
                break;
            case 89650992:
                if (str.equals("gradient")) {
                    b10 = 12;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b10 = 13;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b10 = 14;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b10 = 15;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    b10 = 16;
                }
                break;
            case 1822665244:
                if (str.equals("gradientTransform")) {
                    b10 = 17;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b10 = 18;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setGradientUnits(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 1:
                this.mViewManager.setOpacity(t5, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case 2:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setMatrix(t5, (ReadableArray) obj);
                break;
            case 3:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setMarkerEnd(t5, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setMarkerMid(t5, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setPointerEvents(t5, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setX1(t5, new DynamicFromObject(obj));
                break;
            case 7:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setX2(t5, new DynamicFromObject(obj));
                break;
            case 8:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setY1(t5, new DynamicFromObject(obj));
                break;
            case 9:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setY2(t5, new DynamicFromObject(obj));
                break;
            case 10:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setMask(t5, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setName(t5, obj != null ? (String) obj : null);
                break;
            case 12:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setGradient(t5, (ReadableArray) obj);
                break;
            case 13:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setMarkerStart(t5, obj != null ? (String) obj : null);
                break;
            case 14:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setClipPath(t5, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setClipRule(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 16:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setDisplay(t5, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setGradientTransform(t5, (ReadableArray) obj);
                break;
            case 18:
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setResponsible(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
