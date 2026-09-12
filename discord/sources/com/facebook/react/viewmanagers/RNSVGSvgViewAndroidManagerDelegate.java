package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGSvgViewAndroidManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGSvgViewAndroidManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGSvgViewAndroidManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2064426617:
                if (str.equals("bbHeight")) {
                    b10 = 0;
                }
                break;
            case -1989576717:
                if (str.equals(ViewProps.BORDER_RIGHT_COLOR)) {
                    b10 = 1;
                }
                break;
            case -1697814026:
                if (str.equals("backfaceVisibility")) {
                    b10 = 2;
                }
                break;
            case -1567958285:
                if (str.equals("vbHeight")) {
                    b10 = 3;
                }
                break;
            case -1470826662:
                if (str.equals(ViewProps.BORDER_TOP_COLOR)) {
                    b10 = 4;
                }
                break;
            case -1308858324:
                if (str.equals(ViewProps.BORDER_BOTTOM_COLOR)) {
                    b10 = 5;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    b10 = 6;
                }
                break;
            case -1141400650:
                if (str.equals("accessible")) {
                    b10 = 7;
                }
                break;
            case -1122140597:
                if (str.equals(ViewProps.BORDER_TOP_START_RADIUS)) {
                    b10 = 8;
                }
                break;
            case -867333731:
                if (str.equals(ViewProps.BORDER_BOTTOM_START_RADIUS)) {
                    b10 = 9;
                }
                break;
            case -679581037:
                if (str.equals("hasTVPreferredFocus")) {
                    b10 = 10;
                }
                break;
            case -631506969:
                if (str.equals("nextFocusDown")) {
                    b10 = 11;
                }
                break;
            case -631278772:
                if (str.equals("nextFocusLeft")) {
                    b10 = 12;
                }
                break;
            case -483490364:
                if (str.equals(ViewProps.BORDER_TOP_END_RADIUS)) {
                    b10 = 13;
                }
                break;
            case -329721498:
                if (str.equals("bbWidth")) {
                    b10 = 14;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b10 = 15;
                }
                break;
            case -252105751:
                if (str.equals(ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)) {
                    b10 = 16;
                }
                break;
            case -242276144:
                if (str.equals(ViewProps.BORDER_LEFT_COLOR)) {
                    b10 = 17;
                }
                break;
            case -223134121:
                if (str.equals(ViewProps.BORDER_START_END_RADIUS)) {
                    b10 = 18;
                }
                break;
            case -148030058:
                if (str.equals(ViewProps.BORDER_BOTTOM_END_RADIUS)) {
                    b10 = 19;
                }
                break;
            case -109689771:
                if (str.equals("nativeForegroundAndroid")) {
                    b10 = 20;
                }
                break;
            case -27894242:
                if (str.equals(ViewProps.BORDER_START_START_RADIUS)) {
                    b10 = 21;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    b10 = 22;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    b10 = 23;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    b10 = 24;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    b10 = 25;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    b10 = 26;
                }
                break;
            case 306963138:
                if (str.equals(ViewProps.BORDER_BLOCK_START_COLOR)) {
                    b10 = 27;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    b10 = 28;
                }
                break;
            case 503397728:
                if (str.equals("nextFocusForward")) {
                    b10 = 29;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    b10 = 30;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    b10 = 31;
                }
                break;
            case 660795168:
                if (str.equals("nextFocusUp")) {
                    b10 = 32;
                }
                break;
            case 684610594:
                if (str.equals(ViewProps.BORDER_BLOCK_COLOR)) {
                    b10 = 33;
                }
                break;
            case 722830999:
                if (str.equals(ViewProps.BORDER_COLOR)) {
                    b10 = 34;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    b10 = 35;
                }
                break;
            case 762983977:
                if (str.equals(ViewProps.BORDER_BLOCK_END_COLOR)) {
                    b10 = 36;
                }
                break;
            case 910681861:
                if (str.equals(ViewProps.BORDER_END_START_RADIUS)) {
                    b10 = 37;
                }
                break;
            case 926871597:
                if (str.equals("hitSlop")) {
                    b10 = 38;
                }
                break;
            case 1220735892:
                if (str.equals(ViewProps.BORDER_END_COLOR)) {
                    b10 = 39;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b10 = 40;
                }
                break;
            case 1629011506:
                if (str.equals("focusable")) {
                    b10 = 41;
                }
                break;
            case 1667773924:
                if (str.equals(ViewProps.NEEDS_OFFSCREEN_ALPHA_COMPOSITING)) {
                    b10 = 42;
                }
                break;
            case 1735382270:
                if (str.equals(ViewProps.BORDER_END_END_RADIUS)) {
                    b10 = 43;
                }
                break;
            case 1747724810:
                if (str.equals("nativeBackgroundAndroid")) {
                    b10 = 44;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    b10 = 45;
                }
                break;
            case 1910855543:
                if (str.equals("nextFocusRight")) {
                    b10 = 46;
                }
                break;
            case 2119889261:
                if (str.equals(ViewProps.BORDER_START_COLOR)) {
                    b10 = 47;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbHeight(t5, new DynamicFromObject(obj));
                break;
            case 1:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderRightColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 2:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBackfaceVisibility(t5, obj != null ? (String) obj : null);
                break;
            case 3:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setVbHeight(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 4:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 5:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 6:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopLeftRadius(t5, new DynamicFromObject(obj));
                break;
            case 7:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setAccessible(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 8:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopStartRadius(t5, new DynamicFromObject(obj));
                break;
            case 9:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomStartRadius(t5, new DynamicFromObject(obj));
                break;
            case 10:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setHasTVPreferredFocus(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNextFocusDown(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 12:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNextFocusLeft(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 13:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopEndRadius(t5, new DynamicFromObject(obj));
                break;
            case 14:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbWidth(t5, new DynamicFromObject(obj));
                break;
            case 15:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setPointerEvents(t5, obj != null ? (String) obj : null);
                break;
            case 16:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setRemoveClippedSubviews(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderLeftColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 18:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStartEndRadius(t5, new DynamicFromObject(obj));
                break;
            case 19:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomEndRadius(t5, new DynamicFromObject(obj));
                break;
            case 20:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNativeForegroundAndroid(t5, (ReadableMap) obj);
                break;
            case 21:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStartStartRadius(t5, new DynamicFromObject(obj));
                break;
            case 22:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setMinX(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 23:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setMinY(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 24:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setAlign(t5, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 26:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setVbWidth(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 27:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBlockStartColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 28:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopRightRadius(t5, new DynamicFromObject(obj));
                break;
            case 29:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNextFocusForward(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 30:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomLeftRadius(t5, new DynamicFromObject(obj));
                break;
            case 31:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomRightRadius(t5, new DynamicFromObject(obj));
                break;
            case 32:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNextFocusUp(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 33:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBlockColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 34:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 35:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStyle(t5, obj != null ? (String) obj : null);
                break;
            case 36:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBlockEndColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderEndStartRadius(t5, new DynamicFromObject(obj));
                break;
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setHitSlop(t5, new DynamicFromObject(obj));
                break;
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderEndColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 40:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderRadius(t5, new DynamicFromObject(obj));
                break;
            case 41:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setFocusable(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 42:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNeedsOffscreenAlphaCompositing(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderEndEndRadius(t5, new DynamicFromObject(obj));
                break;
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNativeBackgroundAndroid(t5, (ReadableMap) obj);
                break;
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setMeetOrSlice(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 46:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNextFocusRight(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStartColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
