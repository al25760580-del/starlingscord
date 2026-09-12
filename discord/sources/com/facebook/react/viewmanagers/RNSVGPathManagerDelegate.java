package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGPathManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGPathManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGPathManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGPathManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1274492040:
                if (str.equals(ViewProps.FILTER)) {
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
            case -993894751:
                if (str.equals("propList")) {
                    b10 = 3;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b10 = 4;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b10 = 5;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b10 = 6;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b10 = 7;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b10 = 8;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b10 = 9;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b10 = 10;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b10 = 11;
                }
                break;
            case 100:
                if (str.equals("d")) {
                    b10 = 12;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b10 = 13;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b10 = 14;
                }
                break;
            case 3373707:
                if (str.equals(StackTraceHelper.NAME_KEY)) {
                    b10 = 15;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b10 = 16;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    b10 = 17;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b10 = 18;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b10 = 19;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b10 = 20;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b10 = 21;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b10 = 22;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b10 = 23;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    b10 = 24;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b10 = 25;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b10 = 26;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b10 = 27;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSVGPathManagerInterface) this.mViewManager).setFilter(t5, obj != null ? (String) obj : null);
                break;
            case 1:
                this.mViewManager.setOpacity(t5, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 2:
                ((RNSVGPathManagerInterface) this.mViewManager).setMatrix(t5, (ReadableArray) obj);
                break;
            case 3:
                ((RNSVGPathManagerInterface) this.mViewManager).setPropList(t5, (ReadableArray) obj);
                break;
            case 4:
                ((RNSVGPathManagerInterface) this.mViewManager).setMarkerEnd(t5, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNSVGPathManagerInterface) this.mViewManager).setMarkerMid(t5, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGPathManagerInterface) this.mViewManager).setStroke(t5, new DynamicFromObject(obj));
                break;
            case 7:
                ((RNSVGPathManagerInterface) this.mViewManager).setFillRule(t5, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 8:
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeOpacity(t5, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 9:
                ((RNSVGPathManagerInterface) this.mViewManager).setPointerEvents(t5, obj != null ? (String) obj : null);
                break;
            case 10:
                ((RNSVGPathManagerInterface) this.mViewManager).setFillOpacity(t5, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 11:
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeDashoffset(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 12:
                ((RNSVGPathManagerInterface) this.mViewManager).setD(t5, obj != null ? (String) obj : null);
                break;
            case 13:
                ((RNSVGPathManagerInterface) this.mViewManager).setFill(t5, new DynamicFromObject(obj));
                break;
            case 14:
                ((RNSVGPathManagerInterface) this.mViewManager).setMask(t5, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSVGPathManagerInterface) this.mViewManager).setName(t5, obj != null ? (String) obj : null);
                break;
            case 16:
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeMiterlimit(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 17:
                ((RNSVGPathManagerInterface) this.mViewManager).setColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 18:
                ((RNSVGPathManagerInterface) this.mViewManager).setVectorEffect(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 19:
                ((RNSVGPathManagerInterface) this.mViewManager).setMarkerStart(t5, obj != null ? (String) obj : null);
                break;
            case 20:
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeDasharray(t5, new DynamicFromObject(obj));
                break;
            case 21:
                ((RNSVGPathManagerInterface) this.mViewManager).setClipPath(t5, obj != null ? (String) obj : null);
                break;
            case 22:
                ((RNSVGPathManagerInterface) this.mViewManager).setClipRule(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 23:
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeLinecap(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 24:
                ((RNSVGPathManagerInterface) this.mViewManager).setDisplay(t5, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeLinejoin(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 26:
                ((RNSVGPathManagerInterface) this.mViewManager).setResponsible(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 27:
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeWidth(t5, new DynamicFromObject(obj));
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
