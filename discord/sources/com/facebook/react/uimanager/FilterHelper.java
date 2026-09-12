package com.facebook.react.uimanager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J2\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eJ\u001a\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010!\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010#\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010%\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010'\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010)\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001c\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00132\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b.¨\u0006/"}, d2 = {"Lcom/facebook/react/uimanager/FilterHelper;", "", "<init>", "()V", "parseFilters", "Landroid/graphics/RenderEffect;", "filters", "Lcom/facebook/react/bridge/ReadableArray;", "parseColorMatrixFilters", "Landroid/graphics/ColorMatrixColorFilter;", "isOnlyColorMatrixFilters", "", "createBlurEffect", "sigma", "", "chainedEffects", "createBrightnessEffect", "amount", "createBrightnessColorMatrix", "Landroid/graphics/ColorMatrix;", "createOpacityEffect", "createDropShadowEffect", "offsetX", "offsetY", "blurRadius", ViewProps.COLOR, "", "parseAndCreateDropShadowEffect", "filterValues", "Lcom/facebook/react/bridge/ReadableMap;", "createOpacityColorMatrix", "createContrastEffect", "createContrastColorMatrix", "createGrayscaleEffect", "createGrayscaleColorMatrix", "createSepiaEffect", "createSepiaColorMatrix", "createSaturateEffect", "createSaturateColorMatrix", "createHueRotateEffect", "createHueRotateColorMatrix", "createInvertEffect", "createInvertColorMatrix", "createColorMatrixEffect", "colorMatrix", "sigmaToRadius", "sigmaToRadius$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"UseRequiresApi"})
@TargetApi(31)
public final class FilterHelper {

    @NotNull
    public static final FilterHelper INSTANCE = new FilterHelper();

    private FilterHelper() {
    }

    public static /* synthetic */ RenderEffect createBlurEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createBlurEffect(f2, renderEffect);
    }

    private final ColorMatrix createBrightnessColorMatrix(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(amount, amount, amount, 1.0f);
        return colorMatrix;
    }

    public static /* synthetic */ RenderEffect createBrightnessEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createBrightnessEffect(f2, renderEffect);
    }

    private final RenderEffect createColorMatrixEffect(ColorMatrix colorMatrix, RenderEffect chainedEffects) {
        if (chainedEffects == null) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            Intrinsics.checkNotNull(renderEffectCreateColorFilterEffect);
            return renderEffectCreateColorFilterEffect;
        }
        RenderEffect renderEffectCreateColorFilterEffect2 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), chainedEffects);
        Intrinsics.checkNotNull(renderEffectCreateColorFilterEffect2);
        return renderEffectCreateColorFilterEffect2;
    }

    public static /* synthetic */ RenderEffect createColorMatrixEffect$default(FilterHelper filterHelper, ColorMatrix colorMatrix, RenderEffect renderEffect, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createColorMatrixEffect(colorMatrix, renderEffect);
    }

    private final ColorMatrix createContrastColorMatrix(float amount) {
        float f2 = ((-(amount / 2.0f)) + 0.5f) * 255;
        return new ColorMatrix(new float[]{amount, 0.0f, 0.0f, 0.0f, f2, 0.0f, amount, 0.0f, 0.0f, f2, 0.0f, 0.0f, amount, 0.0f, f2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createContrastEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createContrastEffect(f2, renderEffect);
    }

    public static /* synthetic */ RenderEffect createDropShadowEffect$default(FilterHelper filterHelper, float f2, float f7, float f10, int i7, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            renderEffect = null;
        }
        return filterHelper.createDropShadowEffect(f2, f7, f10, i7, renderEffect);
    }

    private final ColorMatrix createGrayscaleColorMatrix(float amount) {
        float f2 = 1 - amount;
        float f7 = 0.7152f - (f2 * 0.7152f);
        float f10 = 0.0722f - (f2 * 0.0722f);
        float f11 = 0.2126f - (f2 * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f2) + 0.2126f, f7, f10, 0.0f, 0.0f, f11, (0.2848f * f2) + 0.7152f, f10, 0.0f, 0.0f, f11, f7, (f2 * 0.9278f) + 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createGrayscaleEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createGrayscaleEffect(f2, renderEffect);
    }

    private final ColorMatrix createHueRotateColorMatrix(float amount) {
        double radians = Math.toRadians(amount);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f2 = 0.715f - (fCos * 0.715f);
        float f7 = fSin * 0.715f;
        float f10 = 0.072f - (fCos * 0.072f);
        float f11 = 0.213f - (fCos * 0.213f);
        return new ColorMatrix(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f2 - f7, (fSin * 0.928f) + f10, 0.0f, 0.0f, (0.143f * fSin) + f11, (0.14f * fSin) + (0.285f * fCos) + 0.715f, f10 - (0.283f * fSin), 0.0f, 0.0f, f11 - (0.787f * fSin), f2 + f7, (fSin * 0.072f) + (fCos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createHueRotateEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createHueRotateEffect(f2, renderEffect);
    }

    private final ColorMatrix createInvertColorMatrix(float amount) {
        float f2 = 1 - (2 * amount);
        float f7 = amount * 255;
        return new ColorMatrix(new float[]{f2, 0.0f, 0.0f, 0.0f, f7, 0.0f, f2, 0.0f, 0.0f, f7, 0.0f, 0.0f, f2, 0.0f, f7, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createInvertEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createInvertEffect(f2, renderEffect);
    }

    public static /* synthetic */ RenderEffect createOpacityEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createOpacityEffect(f2, renderEffect);
    }

    private final ColorMatrix createSaturateColorMatrix(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(amount);
        return colorMatrix;
    }

    public static /* synthetic */ RenderEffect createSaturateEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createSaturateEffect(f2, renderEffect);
    }

    private final ColorMatrix createSepiaColorMatrix(float amount) {
        float f2 = 1 - amount;
        return new ColorMatrix(new float[]{(0.607f * f2) + 0.393f, 0.769f - (f2 * 0.769f), 0.189f - (f2 * 0.189f), 0.0f, 0.0f, 0.349f - (f2 * 0.349f), (0.314f * f2) + 0.686f, 0.168f - (f2 * 0.168f), 0.0f, 0.0f, 0.272f - (f2 * 0.272f), 0.534f - (f2 * 0.534f), (f2 * 0.869f) + 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createSepiaEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createSepiaEffect(f2, renderEffect);
    }

    public static final boolean isOnlyColorMatrixFilters(ReadableArray filters) {
        if (filters == null || filters.size() == 0) {
            return false;
        }
        int size = filters.size();
        for (int i7 = 0; i7 < size; i7++) {
            ReadableMap map = filters.getMap(i7);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String key = map.getEntryIterator().next().getKey();
            if (Intrinsics.areEqual(key, "blur") || Intrinsics.areEqual(key, "dropShadow")) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ RenderEffect parseAndCreateDropShadowEffect$default(FilterHelper filterHelper, ReadableMap readableMap, RenderEffect renderEffect, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.parseAndCreateDropShadowEffect(readableMap, renderEffect);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ColorMatrixColorFilter parseColorMatrixFilters(ReadableArray filters) {
        ColorMatrix colorMatrixCreateSaturateColorMatrix;
        if (filters == null) {
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        int size = filters.size();
        for (int i7 = 0; i7 < size; i7++) {
            ReadableMap map = filters.getMap(i7);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Map.Entry<String, Object> next = map.getEntryIterator().next();
            String key = next.getKey();
            Object value = next.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
            float fDoubleValue = (float) ((Double) value).doubleValue();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createSaturateColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals(ViewProps.OPACITY)) {
                        throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createOpacityColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createInvertColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createGrayscaleColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createContrastColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createSepiaColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createBrightnessColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createHueRotateColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
            }
        }
        return new ColorMatrixColorFilter(colorMatrix);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final RenderEffect parseFilters(ReadableArray filters) {
        RenderEffect renderEffectCreateSaturateEffect = null;
        if (filters == null) {
            return null;
        }
        int size = filters.size();
        for (int i7 = 0; i7 < size; i7++) {
            ReadableMap map = filters.getMap(i7);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Map.Entry<String, Object> next = map.getEntryIterator().next();
            String key = next.getKey();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid filter name: ".concat(key));
                    }
                    FilterHelper filterHelper = INSTANCE;
                    Object value = next.getValue();
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper.createSaturateEffect((float) ((Double) value).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals(ViewProps.OPACITY)) {
                        throw new IllegalArgumentException("Invalid filter name: ".concat(key));
                    }
                    FilterHelper filterHelper2 = INSTANCE;
                    Object value2 = next.getValue();
                    Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper2.createOpacityEffect((float) ((Double) value2).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid filter name: ".concat(key));
                    }
                    FilterHelper filterHelper3 = INSTANCE;
                    Object value3 = next.getValue();
                    Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper3.createInvertEffect((float) ((Double) value3).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid filter name: ".concat(key));
                    }
                    FilterHelper filterHelper4 = INSTANCE;
                    Object value4 = next.getValue();
                    Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper4.createGrayscaleEffect((float) ((Double) value4).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid filter name: ".concat(key));
                    }
                    FilterHelper filterHelper5 = INSTANCE;
                    Object value5 = next.getValue();
                    Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper5.createContrastEffect((float) ((Double) value5).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case 3027047:
                    if (!key.equals("blur")) {
                        throw new IllegalArgumentException("Invalid filter name: ".concat(key));
                    }
                    FilterHelper filterHelper6 = INSTANCE;
                    Object value6 = next.getValue();
                    Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper6.createBlurEffect((float) ((Double) value6).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid filter name: ".concat(key));
                    }
                    FilterHelper filterHelper7 = INSTANCE;
                    Object value7 = next.getValue();
                    Intrinsics.checkNotNull(value7, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper7.createSepiaEffect((float) ((Double) value7).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid filter name: ".concat(key));
                    }
                    FilterHelper filterHelper8 = INSTANCE;
                    Object value8 = next.getValue();
                    Intrinsics.checkNotNull(value8, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper8.createBrightnessEffect((float) ((Double) value8).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid filter name: ".concat(key));
                    }
                    FilterHelper filterHelper9 = INSTANCE;
                    Object value9 = next.getValue();
                    Intrinsics.checkNotNull(value9, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper9.createHueRotateEffect((float) ((Double) value9).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case 906978543:
                    if (!key.equals("dropShadow")) {
                        throw new IllegalArgumentException("Invalid filter name: ".concat(key));
                    }
                    FilterHelper filterHelper10 = INSTANCE;
                    Object value10 = next.getValue();
                    Intrinsics.checkNotNull(value10, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
                    renderEffectCreateSaturateEffect = filterHelper10.parseAndCreateDropShadowEffect((ReadableMap) value10, renderEffectCreateSaturateEffect);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid filter name: ".concat(key));
            }
        }
        return renderEffectCreateSaturateEffect;
    }

    public final RenderEffect createBlurEffect(float sigma, RenderEffect chainedEffects) {
        if (sigma <= 0.5d) {
            return null;
        }
        float fSigmaToRadius$ReactAndroid_release = sigmaToRadius$ReactAndroid_release(sigma);
        return chainedEffects == null ? RenderEffect.createBlurEffect(fSigmaToRadius$ReactAndroid_release, fSigmaToRadius$ReactAndroid_release, Shader.TileMode.DECAL) : RenderEffect.createBlurEffect(fSigmaToRadius$ReactAndroid_release, fSigmaToRadius$ReactAndroid_release, chainedEffects, Shader.TileMode.DECAL);
    }

    @NotNull
    public final RenderEffect createBrightnessEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createBrightnessColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createContrastEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createContrastColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createDropShadowEffect(float offsetX, float offsetY, float blurRadius, int color, RenderEffect chainedEffects) {
        RenderEffect renderEffectCreateOffsetEffect;
        RenderEffect renderEffectCreateOffsetEffect2;
        if (chainedEffects == null) {
            renderEffectCreateOffsetEffect2 = RenderEffect.createOffsetEffect(0.0f, 0.0f);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect2, "createOffsetEffect(...)");
            renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(offsetX, offsetY);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect, "createOffsetEffect(...)");
        } else {
            RenderEffect renderEffectCreateOffsetEffect3 = RenderEffect.createOffsetEffect(0.0f, 0.0f, chainedEffects);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect3, "createOffsetEffect(...)");
            renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(offsetX, offsetY, chainedEffects);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect, "createOffsetEffect(...)");
            renderEffectCreateOffsetEffect2 = renderEffectCreateOffsetEffect3;
        }
        RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(color, BlendMode.SRC_IN), renderEffectCreateOffsetEffect);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateColorFilterEffect, "createColorFilterEffect(...)");
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, renderEffectCreateColorFilterEffect, Shader.TileMode.DECAL);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect, "createBlurEffect(...)");
        RenderEffect renderEffectCreateBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffectCreateBlurEffect, renderEffectCreateOffsetEffect2, BlendMode.SRC_OVER);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlendModeEffect, "createBlendModeEffect(...)");
        return renderEffectCreateBlendModeEffect;
    }

    @NotNull
    public final RenderEffect createGrayscaleEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createGrayscaleColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createHueRotateEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createHueRotateColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createInvertEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createInvertColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final ColorMatrix createOpacityColorMatrix(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(1.0f, 1.0f, 1.0f, amount);
        return colorMatrix;
    }

    @NotNull
    public final RenderEffect createOpacityEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createOpacityColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createSaturateEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createSaturateColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createSepiaEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createSepiaColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect parseAndCreateDropShadowEffect(@NotNull ReadableMap filterValues, RenderEffect chainedEffects) {
        Intrinsics.checkNotNullParameter(filterValues, "filterValues");
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        return createDropShadowEffect(pixelUtil.dpToPx(filterValues.getDouble("offsetX")), pixelUtil.dpToPx(filterValues.getDouble("offsetY")), filterValues.hasKey("standardDeviation") ? sigmaToRadius$ReactAndroid_release((float) filterValues.getDouble("standardDeviation")) : 0.0f, filterValues.hasKey(ViewProps.COLOR) ? filterValues.getInt(ViewProps.COLOR) : -16777216, chainedEffects);
    }

    public final float sigmaToRadius$ReactAndroid_release(float sigma) {
        float pixelFromDIP = PixelUtil.toPixelFromDIP(sigma);
        if (pixelFromDIP > 0.5f) {
            return (pixelFromDIP - 0.5f) / 0.57735f;
        }
        return 0.0f;
    }
}
