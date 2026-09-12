package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGTSpanManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGTSpanManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGTSpanManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1603134955:
                if (str.equals("lengthAdjust")) {
                    b10 = 0;
                }
                break;
            case -1274492040:
                if (str.equals(ViewProps.FILTER)) {
                    b10 = 1;
                }
                break;
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    b10 = 2;
                }
                break;
            case -1171891896:
                if (str.equals("alignmentBaseline")) {
                    b10 = 3;
                }
                break;
            case -1139902161:
                if (str.equals("verticalAlign")) {
                    b10 = 4;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b10 = 5;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    b10 = 6;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b10 = 7;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b10 = 8;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    b10 = 9;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b10 = 10;
                }
                break;
            case -734428249:
                if (str.equals(ViewProps.FONT_WEIGHT)) {
                    b10 = 11;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b10 = 12;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b10 = 13;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b10 = 14;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b10 = 15;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b10 = 16;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b10 = 17;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b10 = 18;
                }
                break;
            case 3220:
                if (str.equals("dx")) {
                    b10 = 19;
                }
                break;
            case 3221:
                if (str.equals("dy")) {
                    b10 = 20;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b10 = 21;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b10 = 22;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b10 = 23;
                }
                break;
            case 3373707:
                if (str.equals(StackTraceHelper.NAME_KEY)) {
                    b10 = 24;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b10 = 25;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    b10 = 26;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b10 = 27;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b10 = 28;
                }
                break;
            case 275888445:
                if (str.equals("baselineShift")) {
                    b10 = 29;
                }
                break;
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    b10 = 30;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b10 = 31;
                }
                break;
            case 778043962:
                if (str.equals("inlineSize")) {
                    b10 = 32;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b10 = 33;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b10 = 34;
                }
                break;
            case 951530617:
                if (str.equals("content")) {
                    b10 = 35;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b10 = 36;
                }
                break;
            case 1637488243:
                if (str.equals("textLength")) {
                    b10 = 37;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    b10 = 38;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b10 = 39;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b10 = 40;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b10 = 41;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setLengthAdjust(t5, obj != null ? (String) obj : null);
                break;
            case 1:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFilter(t5, obj != null ? (String) obj : null);
                break;
            case 2:
                this.mViewManager.setOpacity(t5, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 3:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setAlignmentBaseline(t5, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setVerticalAlign(t5, new DynamicFromObject(obj));
                break;
            case 5:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setMatrix(t5, (ReadableArray) obj);
                break;
            case 6:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setPropList(t5, (ReadableArray) obj);
                break;
            case 7:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setMarkerEnd(t5, obj != null ? (String) obj : null);
                break;
            case 8:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setMarkerMid(t5, obj != null ? (String) obj : null);
                break;
            case 9:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setRotate(t5, new DynamicFromObject(obj));
                break;
            case 10:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStroke(t5, new DynamicFromObject(obj));
                break;
            case 11:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFontWeight(t5, new DynamicFromObject(obj));
                break;
            case 12:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFillRule(t5, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 13:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeOpacity(t5, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 14:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setPointerEvents(t5, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFillOpacity(t5, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 16:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeDashoffset(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 17:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setX(t5, new DynamicFromObject(obj));
                break;
            case 18:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setY(t5, new DynamicFromObject(obj));
                break;
            case 19:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setDx(t5, new DynamicFromObject(obj));
                break;
            case 20:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setDy(t5, new DynamicFromObject(obj));
                break;
            case 21:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFill(t5, new DynamicFromObject(obj));
                break;
            case 22:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFont(t5, new DynamicFromObject(obj));
                break;
            case 23:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setMask(t5, obj != null ? (String) obj : null);
                break;
            case 24:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setName(t5, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeMiterlimit(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 26:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 27:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setVectorEffect(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 28:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setMarkerStart(t5, obj != null ? (String) obj : null);
                break;
            case 29:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setBaselineShift(t5, new DynamicFromObject(obj));
                break;
            case 30:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFontSize(t5, new DynamicFromObject(obj));
                break;
            case 31:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeDasharray(t5, new DynamicFromObject(obj));
                break;
            case 32:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setInlineSize(t5, new DynamicFromObject(obj));
                break;
            case 33:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setClipPath(t5, obj != null ? (String) obj : null);
                break;
            case 34:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setClipRule(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 35:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setContent(t5, obj != null ? (String) obj : null);
                break;
            case 36:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeLinecap(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setTextLength(t5, new DynamicFromObject(obj));
                break;
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setDisplay(t5, obj != null ? (String) obj : null);
                break;
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeLinejoin(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 40:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setResponsible(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 41:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeWidth(t5, new DynamicFromObject(obj));
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
