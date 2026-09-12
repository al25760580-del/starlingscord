package com.facebook.react.modules.deviceinfo;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.m0;
import androidx.core.view.u0;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.views.view.WindowUtilKt;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t3.a;
import t3.b;
import t3.c;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "DeviceInfo")
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\u0006\u0010\u001b\u001a\u00020\u0018J\b\u0010\u001c\u001a\u00020\u0018H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;", "Lcom/facebook/fbreact/specs/NativeDeviceInfoSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "fontScale", "", "previousDisplayMetrics", "Lcom/facebook/react/bridge/ReadableMap;", "getWindowDisplayMetrics", "Landroid/util/DisplayMetrics;", "getWindowDisplayMetrics$ReactAndroid_release", "getDisplayMetricsWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "getDisplayMetricsWritableMap$ReactAndroid_release", "getPhysicalPixelsWritableMap", "displayMetrics", "getTypedExportedConstants", "", "", "", "onHostResume", "", "onHostPause", "onHostDestroy", "emitUpdateDimensionsEvent", "invalidate", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceInfoModule extends NativeDeviceInfoSpec implements LifecycleEventListener {

    @NotNull
    public static final String NAME = "DeviceInfo";
    private float fontScale;
    private ReadableMap previousDisplayMetrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.fontScale = reactContext.getResources().getConfiguration().fontScale;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactContext);
        reactContext.addLifecycleEventListener(this);
    }

    private final WritableMap getPhysicalPixelsWritableMap(DisplayMetrics displayMetrics) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", this.fontScale);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public final void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (!reactApplicationContext.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException("DeviceInfo", new ReactNoCrashSoftException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
            return;
        }
        WritableMap displayMetricsWritableMap$ReactAndroid_release = getDisplayMetricsWritableMap$ReactAndroid_release();
        ReadableMap readableMap = this.previousDisplayMetrics;
        if (readableMap == null) {
            this.previousDisplayMetrics = displayMetricsWritableMap$ReactAndroid_release.copy();
        } else {
            if (Intrinsics.areEqual(displayMetricsWritableMap$ReactAndroid_release, readableMap)) {
                return;
            }
            this.previousDisplayMetrics = displayMetricsWritableMap$ReactAndroid_release.copy();
            reactApplicationContext.emitDeviceEvent("didUpdateDimensions", displayMetricsWritableMap$ReactAndroid_release);
        }
    }

    @NotNull
    public final WritableMap getDisplayMetricsWritableMap$ReactAndroid_release() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("windowPhysicalPixels", getPhysicalPixelsWritableMap(getWindowDisplayMetrics$ReactAndroid_release()));
        writableNativeMap.putMap("screenPhysicalPixels", getPhysicalPixelsWritableMap(DisplayMetricsHolder.getScreenDisplayMetrics()));
        return writableNativeMap;
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceInfoSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        WritableMap displayMetricsWritableMap$ReactAndroid_release = getDisplayMetricsWritableMap$ReactAndroid_release();
        this.previousDisplayMetrics = displayMetricsWritableMap$ReactAndroid_release.copy();
        return w0.g(new Pair("Dimensions", displayMetricsWritableMap$ReactAndroid_release.toHashMap()), new Pair("isEdgeToEdge", Boolean.valueOf(WindowUtilKt.isEdgeToEdgeFeatureFlagOn())));
    }

    @NotNull
    public final DisplayMetrics getWindowDisplayMetrics$ReactAndroid_release() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(getReactApplicationContext().getResources().getDisplayMetrics());
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            b.f20590a.getClass();
            c it = a.f20589b;
            Intrinsics.checkNotNullParameter(it, "it");
            Rect rectA = it.a(currentActivity).a();
            if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
                displayMetrics.widthPixels = rectA.width();
                displayMetrics.heightPixels = rectA.height();
                return displayMetrics;
            }
            View decorView = currentActivity.getWindow().getDecorView();
            WeakHashMap weakHashMap = u0.f1729a;
            WindowInsetsCompat windowInsetsCompatA = m0.a(decorView);
            if (windowInsetsCompatA != null) {
                Insets insetsF = windowInsetsCompatA.f1605a.f(647);
                Intrinsics.checkNotNullExpressionValue(insetsF, "getInsets(...)");
                displayMetrics.widthPixels = rectA.width() - (insetsF.f1556a + insetsF.f1558c);
                displayMetrics.heightPixels = rectA.height() - (insetsF.f1557b + insetsF.f1559d);
            }
        }
        return displayMetrics;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Configuration configuration;
        Resources resources = getReactApplicationContext().getResources();
        Float fValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Float.valueOf(configuration.fontScale);
        if (fValueOf == null || Intrinsics.areEqual(fValueOf, this.fontScale)) {
            return;
        }
        this.fontScale = fValueOf.floatValue();
        emitUpdateDimensionsEvent();
    }
}
