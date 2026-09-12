package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0007J\n\u0010\f\u001a\u00020\u0005*\u00020\rJ\n\u0010\f\u001a\u00020\u0005*\u00020\u000eJ\n\u0010\f\u001a\u00020\u0005*\u00020\u0005J\n\u0010\f\u001a\u00020\u0005*\u00020\u0007J\n\u0010\u000f\u001a\u00020\u0005*\u00020\rJ\n\u0010\u000f\u001a\u00020\u0005*\u00020\u000eJ\n\u0010\u000f\u001a\u00020\u0005*\u00020\u0005J\n\u0010\u000f\u001a\u00020\u0005*\u00020\u0007¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/uimanager/PixelUtil;", "", "<init>", "()V", "toPixelFromDIP", "", "value", "", "toPixelFromSP", "maxFontScale", "toDIPFromPixel", "getDisplayMetricDensity", "dpToPx", "", "", "pxToDp", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PixelUtil {

    @NotNull
    public static final PixelUtil INSTANCE = new PixelUtil();

    private PixelUtil() {
    }

    public static final float getDisplayMetricDensity() {
        return DisplayMetricsHolder.getScreenDisplayMetrics().density;
    }

    public static final float toDIPFromPixel(float value) {
        if (Float.isNaN(value)) {
            return Float.NaN;
        }
        return value / DisplayMetricsHolder.getScreenDisplayMetrics().density;
    }

    public static final float toPixelFromDIP(float value) {
        if (Float.isNaN(value)) {
            return Float.NaN;
        }
        return TypedValue.applyDimension(1, value, DisplayMetricsHolder.getScreenDisplayMetrics());
    }

    public static final float toPixelFromSP(float f2) {
        return toPixelFromSP$default(f2, 0.0f, 2, null);
    }

    public static /* synthetic */ float toPixelFromSP$default(float f2, float f7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            f7 = Float.NaN;
        }
        return toPixelFromSP(f2, f7);
    }

    public final float dpToPx(int i7) {
        return toPixelFromDIP(i7);
    }

    public final float pxToDp(int i7) {
        return toDIPFromPixel(i7);
    }

    public static final float toPixelFromSP(float value, float maxFontScale) {
        if (Float.isNaN(value)) {
            return Float.NaN;
        }
        DisplayMetrics screenDisplayMetrics = DisplayMetricsHolder.getScreenDisplayMetrics();
        float fApplyDimension = TypedValue.applyDimension(2, value, screenDisplayMetrics);
        return maxFontScale >= 1.0f ? Math.min(fApplyDimension, value * screenDisplayMetrics.density * maxFontScale) : fApplyDimension;
    }

    public final float dpToPx(long j) {
        return toPixelFromDIP(j);
    }

    public final float pxToDp(long j) {
        return toDIPFromPixel(j);
    }

    public final float dpToPx(float f2) {
        return toPixelFromDIP(f2);
    }

    public final float pxToDp(float f2) {
        return toDIPFromPixel(f2);
    }

    public static final float toPixelFromDIP(double value) {
        return toPixelFromDIP((float) value);
    }

    public final float dpToPx(double d6) {
        return toPixelFromDIP((float) d6);
    }

    public final float pxToDp(double d6) {
        return toDIPFromPixel((float) d6);
    }

    public static final float toPixelFromSP(double value) {
        return toPixelFromSP$default((float) value, 0.0f, 2, null);
    }
}
