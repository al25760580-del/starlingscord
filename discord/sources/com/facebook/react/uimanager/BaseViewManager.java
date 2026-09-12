package com.facebook.react.uimanager;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.l0;
import androidx.core.view.u0;
import com.discord.jank_stats.JankStatsAggregatorKt;
import com.facebook.react.R;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.BlurEvent;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.FocusEvent;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.OutlineStyle;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseViewManager<T extends View, C extends LayoutShadowNode> extends ViewManager<T, C> implements View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final MatrixMathHelper.MatrixDecompositionContext sMatrixDecompositionContext = new MatrixMathHelper.MatrixDecompositionContext();
    private static final double[] sTransformDecompositionArray = new double[16];

    public static class BaseVMFocusChangeListener implements View.OnFocusChangeListener {
        private View.OnFocusChangeListener mOriginalFocusChangeListener;

        public BaseVMFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
            this.mOriginalFocusChangeListener = onFocusChangeListener;
        }

        public void attach(View view) {
            view.setOnFocusChangeListener(this);
        }

        public void detach(View view) {
            view.setOnFocusChangeListener(this.mOriginalFocusChangeListener);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z5) {
            EventDispatcher eventDispatcher;
            View.OnFocusChangeListener onFocusChangeListener = this.mOriginalFocusChangeListener;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z5);
            }
            int surfaceId = UIManagerHelper.getSurfaceId(view.getContext());
            if (surfaceId == -1 || !(view.getContext() instanceof ThemedReactContext) || (eventDispatcher = UIManagerHelper.getEventDispatcher((ThemedReactContext) view.getContext())) == null) {
                return;
            }
            if (z5) {
                eventDispatcher.dispatchEvent(new FocusEvent(surfaceId, view.getId()));
            } else {
                eventDispatcher.dispatchEvent(new BlurEvent(surfaceId, view.getId()));
            }
        }
    }

    public static class LayerEffectsHelper {
        private LayerEffectsHelper() {
        }

        public static void apply(@NonNull View view, ReadableArray readableArray, Boolean bool) {
            Paint paint;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31) {
                view.setRenderEffect(null);
            }
            if (readableArray == null) {
                paint = null;
            } else if (FilterHelper.isOnlyColorMatrixFilters(readableArray)) {
                paint = new Paint();
                paint.setColorFilter(FilterHelper.parseColorMatrixFilters(readableArray));
            } else {
                if (i7 >= 31) {
                    view.setRenderEffect(FilterHelper.parseFilters(readableArray));
                }
                paint = null;
            }
            if (paint == null) {
                view.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
            } else {
                view.setLayerType(2, paint);
            }
        }
    }

    public BaseViewManager() {
        super(null);
    }

    private void logUnsupportedPropertyWarning(String str) {
        o8.a.x(ReactConstants.TAG, "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f2) {
        if (f2 >= -3.4028235E38f && f2 <= Float.MAX_VALUE) {
            return f2;
        }
        if (f2 < -3.4028235E38f || f2 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f2 > Float.MAX_VALUE || f2 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f2)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f2);
    }

    private static void setPointerEventsFlag(@NonNull View view, PointerEventHelper.EVENT event, boolean z5) {
        Integer num = (Integer) view.getTag(R.id.pointer_events);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << event.ordinal();
        view.setTag(R.id.pointer_events, Integer.valueOf(z5 ? iOrdinal | iIntValue : (~iOrdinal) & iIntValue));
    }

    private void updateViewContentDescription(@NonNull T t5) {
        Dynamic dynamic;
        String str = (String) t5.getTag(R.id.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t5.getTag(R.id.accessibility_state);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t5.getTag(R.id.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t5.getContext().getString(R.string.state_mixed_description));
                } else if (strNextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t5.getContext().getString(R.string.state_busy_description));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t5.setContentDescription(TextUtils.join(", ", arrayList));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NonNull ThemedReactContext themedReactContext, @NonNull T t5) {
        super.addEventEmitters(themedReactContext, t5);
        new BaseVMFocusChangeListener(t5.getOnFocusChangeListener()).attach(t5);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        MapBuilder.Builder builderPut = MapBuilder.builder().put(PointerEventHelper.POINTER_CANCEL, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).put(PointerEventHelper.POINTER_DOWN, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(builderPut.put(PointerEventHelper.POINTER_ENTER, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_ENTER, "captured", ViewProps.ON_POINTER_ENTER_CAPTURE, "skipBubbling", bool))).put(PointerEventHelper.POINTER_LEAVE, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_LEAVE, "captured", ViewProps.ON_POINTER_LEAVE_CAPTURE, "skipBubbling", bool))).put(PointerEventHelper.POINTER_MOVE, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_MOVE, "captured", ViewProps.ON_POINTER_MOVE_CAPTURE))).put(PointerEventHelper.POINTER_UP, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).put(PointerEventHelper.POINTER_OUT, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_OUT, "captured", ViewProps.ON_POINTER_OUT_CAPTURE))).put(PointerEventHelper.POINTER_OVER, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_OVER, "captured", ViewProps.ON_POINTER_OVER_CAPTURE))).put(PointerEventHelper.CLICK, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_CLICK, "captured", ViewProps.ON_CLICK_CAPTURE))).put(BlurEvent.EVENT_NAME, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onBlur", "captured", "onBlurCapture"))).put(FocusEvent.EVENT_NAME, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onFocus", "captured", "onFocusCapture"))).put("topKeyDown", MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onKeyDown", "captured", "onKeyDownCapture"))).put("topKeyUp", MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onKeyUp", "captured", "onKeyUpCapture"))).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapBuilder.builder().put(ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT, MapBuilder.of("registrationName", "onAccessibilityAction")).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull T t5) {
        super.onAfterUpdateTransaction(t5);
        updateViewAccessibility(t5);
        Boolean bool = (Boolean) t5.getTag(R.id.invalidate_transform);
        if (bool != null && bool.booleanValue()) {
            t5.addOnLayoutChangeListener(this);
            setTransformProperty(t5, (ReadableArray) t5.getTag(R.id.transform), (ReadableArray) t5.getTag(R.id.transform_origin));
            t5.setTag(R.id.invalidate_transform, Boolean.FALSE);
        }
        LayerEffectsHelper.apply(t5, (ReadableArray) t5.getTag(R.id.filter), (Boolean) t5.getTag(R.id.use_hardware_layer));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull T t5) {
        super.onDropViewInstance(t5);
        View.OnFocusChangeListener onFocusChangeListener = t5.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof BaseVMFocusChangeListener) {
            ((BaseVMFocusChangeListener) onFocusChangeListener).detach(t5);
        }
        if (t5 instanceof ViewGroup) {
            ((ViewGroup) t5).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i15 - i13;
        int i18 = i11 - i7;
        if (i12 - i10 == i16 - i14 && i18 == i17) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(R.id.transform_origin);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(R.id.transform);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public T prepareToRecycleView(@NonNull ThemedReactContext themedReactContext, T t5) {
        t5.setTag(null);
        t5.setTag(R.id.pointer_events, null);
        t5.setTag(R.id.important_for_interaction, null);
        t5.setTag(R.id.react_test_id, null);
        t5.setTag(R.id.view_tag_native_id, null);
        t5.setTag(R.id.labelled_by, null);
        t5.setTag(R.id.accessibility_label, null);
        t5.setTag(R.id.accessibility_hint, null);
        t5.setTag(R.id.accessibility_role, null);
        t5.setTag(R.id.accessibility_state, null);
        t5.setTag(R.id.accessibility_actions, null);
        t5.setTag(R.id.accessibility_value, null);
        t5.setTag(R.id.accessibility_state_expanded, null);
        t5.setTag(R.id.view_clipped, null);
        setTransformProperty(t5, null, null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 28) {
            return null;
        }
        t5.resetPivot();
        t5.setTop(0);
        t5.setBottom(0);
        t5.setLeft(0);
        t5.setRight(0);
        t5.setElevation(0.0f);
        if (i7 >= 29) {
            t5.setAnimationMatrix(null);
        }
        t5.setTag(R.id.transform, null);
        t5.setTag(R.id.transform_origin, null);
        t5.setTag(R.id.invalidate_transform, null);
        t5.removeOnLayoutChangeListener(this);
        t5.setTag(R.id.use_hardware_layer, null);
        t5.setTag(R.id.filter, null);
        t5.setTag(R.id.mix_blend_mode, null);
        LayerEffectsHelper.apply(t5, null, null);
        if (i7 >= 28) {
            t5.setOutlineAmbientShadowColor(-16777216);
            t5.setOutlineSpotShadowColor(-16777216);
        }
        t5.setNextFocusDownId(-1);
        t5.setNextFocusForwardId(-1);
        t5.setNextFocusRightId(-1);
        t5.setNextFocusUpId(-1);
        t5.setOnClickListener(null);
        t5.setClickable(false);
        t5.setFocusable(false);
        t5.setFocusableInTouchMode(false);
        t5.setElevation(0.0f);
        t5.setAlpha(1.0f);
        setPadding(t5, 0, 0, 0, 0);
        t5.setForeground(null);
        return t5;
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ACTIONS)
    public void setAccessibilityActions(T t5, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t5.setTag(R.id.accessibility_actions, readableArray);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_COLLECTION)
    public void setAccessibilityCollection(@NonNull T t5, ReadableMap readableMap) {
        t5.setTag(R.id.accessibility_collection, readableMap);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_COLLECTION_ITEM)
    public void setAccessibilityCollectionItem(@NonNull T t5, ReadableMap readableMap) {
        t5.setTag(R.id.accessibility_collection_item, readableMap);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_HINT)
    public void setAccessibilityHint(@NonNull T t5, String str) {
        t5.setTag(R.id.accessibility_hint, str);
        updateViewContentDescription(t5);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LABEL)
    public void setAccessibilityLabel(@NonNull T t5, String str) {
        t5.setTag(R.id.accessibility_label, str);
        updateViewContentDescription(t5);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LABELLED_BY)
    public void setAccessibilityLabelledBy(@NonNull T t5, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t5.setTag(R.id.labelled_by, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t5.setTag(R.id.labelled_by, dynamic.asArray().getString(0));
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LIVE_REGION)
    public void setAccessibilityLiveRegion(@NonNull T t5, String str) {
        if (str == null || str.equals(ViewProps.NONE)) {
            WeakHashMap weakHashMap = u0.f1729a;
            t5.setAccessibilityLiveRegion(0);
        } else if (str.equals("polite")) {
            WeakHashMap weakHashMap2 = u0.f1729a;
            t5.setAccessibilityLiveRegion(1);
        } else if (str.equals("assertive")) {
            WeakHashMap weakHashMap3 = u0.f1729a;
            t5.setAccessibilityLiveRegion(2);
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ROLE)
    public void setAccessibilityRole(@NonNull T t5, String str) {
        if (str == null) {
            t5.setTag(R.id.accessibility_role, null);
        } else {
            t5.setTag(R.id.accessibility_role, ReactAccessibilityDelegate.AccessibilityRole.fromValue(str));
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_VALUE)
    public void setAccessibilityValue(T t5, ReadableMap readableMap) {
        if (readableMap == null) {
            t5.setTag(R.id.accessibility_value, null);
            t5.setContentDescription(null);
        } else {
            t5.setTag(R.id.accessibility_value, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t5);
            }
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(@NonNull T t5, int i7) {
        BackgroundStyleApplicator.setBackgroundColor(t5, Integer.valueOf(i7));
    }

    public void setBorderBottomLeftRadius(T t5, float f2) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    public void setBorderBottomRightRadius(T t5, float f2) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    public void setBorderRadius(T t5, float f2) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    public void setBorderTopLeftRadius(T t5, float f2) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    public void setBorderTopRightRadius(T t5, float f2) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @ReactProp(customType = "BoxShadow", name = ViewProps.BOX_SHADOW)
    public void setBoxShadow(T t5, ReadableArray readableArray) {
        BackgroundStyleApplicator.setBoxShadow(t5, readableArray);
    }

    @ReactProp(name = ViewProps.ON_CLICK)
    public void setClick(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.CLICK, z5);
    }

    @ReactProp(name = ViewProps.ON_CLICK_CAPTURE)
    public void setClickCapture(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.CLICK_CAPTURE, z5);
    }

    @ReactProp(name = ViewProps.ELEVATION)
    public void setElevation(@NonNull T t5, float f2) {
        float pixelFromDIP = PixelUtil.toPixelFromDIP(f2);
        WeakHashMap weakHashMap = u0.f1729a;
        l0.k(t5, pixelFromDIP);
    }

    @ReactProp(customType = "Filter", name = ViewProps.FILTER)
    public void setFilter(@NonNull T t5, ReadableArray readableArray) {
        t5.setTag(R.id.filter, readableArray);
    }

    @ReactProp(name = ViewProps.IMPORTANT_FOR_ACCESSIBILITY)
    public void setImportantForAccessibility(@NonNull T t5, String str) {
        if (str == null || str.equals("auto")) {
            t5.setImportantForAccessibility(0);
            return;
        }
        if (str.equals("yes")) {
            t5.setImportantForAccessibility(1);
        } else if (str.equals("no")) {
            t5.setImportantForAccessibility(2);
        } else if (str.equals("no-hide-descendants")) {
            t5.setImportantForAccessibility(4);
        }
    }

    @ReactProp(name = ViewProps.MIX_BLEND_MODE)
    public void setMixBlendMode(@NonNull T t5, String str) {
        t5.setTag(R.id.mix_blend_mode, BlendModeHelper.parseMixBlendMode(str));
        if (t5.getParent() instanceof View) {
            ((View) t5.getParent()).invalidate();
        }
    }

    @ReactProp(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = ViewProps.NATIVE_ID)
    public void setNativeId(@NonNull T t5, String str) {
        t5.setTag(R.id.view_tag_native_id, str);
        ReactFindViewUtil.notifyViewRendered(t5);
    }

    @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
    public void setOpacity(@NonNull T t5, float f2) {
        t5.setAlpha(f2);
    }

    @ReactProp(customType = "Color", name = ViewProps.OUTLINE_COLOR)
    public void setOutlineColor(T t5, Integer num) {
        BackgroundStyleApplicator.setOutlineColor(t5, num);
    }

    @ReactProp(name = ViewProps.OUTLINE_OFFSET)
    public void setOutlineOffset(T t5, float f2) {
        BackgroundStyleApplicator.setOutlineOffset(t5, f2);
    }

    @ReactProp(name = ViewProps.OUTLINE_STYLE)
    public void setOutlineStyle(T t5, String str) {
        BackgroundStyleApplicator.setOutlineStyle(t5, str == null ? null : OutlineStyle.fromString(str));
    }

    @ReactProp(name = ViewProps.OUTLINE_WIDTH)
    public void setOutlineWidth(T t5, float f2) {
        BackgroundStyleApplicator.setOutlineWidth(t5, f2);
    }

    @ReactProp(name = ViewProps.ON_POINTER_ENTER)
    public void setPointerEnter(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.ENTER, z5);
    }

    @ReactProp(name = ViewProps.ON_POINTER_ENTER_CAPTURE)
    public void setPointerEnterCapture(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.ENTER_CAPTURE, z5);
    }

    @ReactProp(name = ViewProps.ON_POINTER_LEAVE)
    public void setPointerLeave(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.LEAVE, z5);
    }

    @ReactProp(name = ViewProps.ON_POINTER_LEAVE_CAPTURE)
    public void setPointerLeaveCapture(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.LEAVE_CAPTURE, z5);
    }

    @ReactProp(name = ViewProps.ON_POINTER_MOVE)
    public void setPointerMove(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.MOVE, z5);
    }

    @ReactProp(name = ViewProps.ON_POINTER_MOVE_CAPTURE)
    public void setPointerMoveCapture(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.MOVE_CAPTURE, z5);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OUT)
    public void setPointerOut(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.OUT, z5);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OUT_CAPTURE)
    public void setPointerOutCapture(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.OUT_CAPTURE, z5);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OVER)
    public void setPointerOver(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.OVER, z5);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OVER_CAPTURE)
    public void setPointerOverCapture(@NonNull T t5, boolean z5) {
        setPointerEventsFlag(t5, PointerEventHelper.EVENT.OVER_CAPTURE, z5);
    }

    @ReactProp(name = ViewProps.RENDER_TO_HARDWARE_TEXTURE)
    public void setRenderToHardwareTexture(@NonNull T t5, boolean z5) {
        t5.setTag(R.id.use_hardware_layer, Boolean.valueOf(z5));
    }

    @ReactProp(name = "onResponderEnd")
    public void setResponderEnd(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onResponderGrant")
    public void setResponderGrant(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onResponderMove")
    public void setResponderMove(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onResponderReject")
    public void setResponderReject(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onResponderRelease")
    public void setResponderRelease(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onResponderStart")
    public void setResponderStart(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onResponderTerminate")
    public void setResponderTerminate(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = ViewProps.ROLE)
    public void setRole(@NonNull T t5, String str) {
        if (str == null) {
            t5.setTag(R.id.role, null);
        } else {
            t5.setTag(R.id.role, ReactAccessibilityDelegate.Role.fromValue(str));
        }
    }

    @ReactProp(name = ViewProps.ROTATION)
    @Deprecated
    public void setRotation(@NonNull T t5, float f2) {
        t5.setRotation(f2);
    }

    @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.SCALE_X)
    @Deprecated
    public void setScaleX(@NonNull T t5, float f2) {
        t5.setScaleX(f2);
    }

    @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.SCALE_Y)
    @Deprecated
    public void setScaleY(@NonNull T t5, float f2) {
        t5.setScaleY(f2);
    }

    @ReactProp(name = ViewProps.SCREEN_READER_FOCUSABLE)
    public void setScreenReaderFocusable(@NonNull T t5, boolean z5) {
        if (Build.VERSION.SDK_INT >= 28) {
            t5.setScreenReaderFocusable(z5);
        }
    }

    @ReactProp(customType = "Color", defaultInt = -16777216, name = ViewProps.SHADOW_COLOR)
    public void setShadowColor(@NonNull T t5, int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            t5.setOutlineAmbientShadowColor(i7);
            t5.setOutlineSpotShadowColor(i7);
        }
    }

    @ReactProp(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = ViewProps.TEST_ID)
    public void setTestId(@NonNull T t5, String str) {
        t5.setTag(R.id.react_test_id, str);
        t5.setTag(str);
    }

    @ReactProp(name = "onTouchCancel")
    public void setTouchCancel(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onTouchEnd")
    public void setTouchEnd(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onTouchMove")
    public void setTouchMove(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = "onTouchStart")
    public void setTouchStart(@NonNull T t5, boolean z5) {
    }

    @ReactProp(name = ViewProps.TRANSFORM)
    public void setTransform(@NonNull T t5, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t5.getTag(R.id.transform), readableArray)) {
            return;
        }
        t5.setTag(R.id.transform, readableArray);
        t5.setTag(R.id.invalidate_transform, Boolean.TRUE);
    }

    @ReactProp(name = ViewProps.TRANSFORM_ORIGIN)
    public void setTransformOrigin(@NonNull T t5, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t5.getTag(R.id.transform_origin), readableArray)) {
            return;
        }
        t5.setTag(R.id.transform_origin, readableArray);
        t5.setTag(R.id.invalidate_transform, Boolean.TRUE);
    }

    public void setTransformProperty(@NonNull T t5, ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray == null) {
            t5.setTranslationX(PixelUtil.toPixelFromDIP(0.0f));
            t5.setTranslationY(PixelUtil.toPixelFromDIP(0.0f));
            t5.setRotation(0.0f);
            t5.setRotationX(0.0f);
            t5.setRotationY(0.0f);
            t5.setScaleX(1.0f);
            t5.setScaleY(1.0f);
            t5.setCameraDistance(0.0f);
            return;
        }
        MatrixMathHelper.MatrixDecompositionContext matrixDecompositionContext = sMatrixDecompositionContext;
        matrixDecompositionContext.reset();
        double[] dArr = sTransformDecompositionArray;
        TransformHelper.processTransform(readableArray, dArr, PixelUtil.toDIPFromPixel(t5.getWidth()), PixelUtil.toDIPFromPixel(t5.getHeight()), readableArray2);
        MatrixMathHelper.decomposeMatrix(dArr, matrixDecompositionContext);
        t5.setTranslationX(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[0])));
        t5.setTranslationY(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[1])));
        t5.setRotation(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[2]));
        t5.setRotationX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[0]));
        t5.setRotationY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[1]));
        t5.setScaleX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[0]));
        t5.setScaleY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[1]));
        double[] dArr2 = matrixDecompositionContext.perspective;
        if (dArr2.length > 2) {
            float f2 = (float) dArr2[2];
            if (f2 == 0.0f) {
                f2 = 7.8125E-4f;
            }
            float f7 = (-1.0f) / f2;
            float f10 = DisplayMetricsHolder.getScreenDisplayMetrics().density;
            t5.setCameraDistance(sanitizeFloatPropertyValue(f10 * f10 * f7 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.TRANSLATE_X)
    @Deprecated
    public void setTranslateX(@NonNull T t5, float f2) {
        t5.setTranslationX(PixelUtil.toPixelFromDIP(f2));
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.TRANSLATE_Y)
    @Deprecated
    public void setTranslateY(@NonNull T t5, float f2) {
        t5.setTranslationY(PixelUtil.toPixelFromDIP(f2));
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_STATE)
    public void setViewState(@NonNull T t5, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t5.setTag(R.id.accessibility_state_expanded, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean zIsSelected = t5.isSelected();
            boolean z5 = readableMap.getBoolean("selected");
            t5.setSelected(z5);
            if (t5.isAccessibilityFocused() && zIsSelected && !z5) {
                t5.announceForAccessibility(t5.getContext().getString(R.string.state_unselected_description));
            }
        } else {
            t5.setSelected(false);
        }
        t5.setTag(R.id.accessibility_state, readableMap);
        if (readableMap.hasKey("disabled")) {
            t5.setEnabled(!readableMap.getBoolean("disabled"));
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals(STATE_EXPANDED) || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t5);
                return;
            } else if (t5.isAccessibilityFocused()) {
                t5.sendAccessibilityEvent(1);
            }
        }
    }

    @ReactProp(name = ViewProps.Z_INDEX)
    public void setZIndex(@NonNull T t5, float f2) {
        ViewGroupManager.setViewZIndex(t5, Math.round(f2));
        ViewParent parent = t5.getParent();
        if (parent instanceof ReactZIndexedViewGroup) {
            ((ReactZIndexedViewGroup) parent).updateDrawingOrder();
        }
    }

    public void updateViewAccessibility(@NonNull T t5) {
        ReactAccessibilityDelegate.setDelegate(t5, t5.isFocusable(), t5.getImportantForAccessibility());
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
