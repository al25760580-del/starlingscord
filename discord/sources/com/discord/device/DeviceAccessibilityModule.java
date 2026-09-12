package com.discord.device;

import android.app.Activity;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.discord.codegen.NativeDeviceAccessibilityModuleSpec;
import com.discord.device.utils.DeviceFocusLockManager;
import com.discord.device.utils.DeviceReducedMotion;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.ReactContextFindViewKt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.view.a;
import io.sentry.react.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/device/DeviceAccessibilityModule;", "Lcom/discord/codegen/NativeDeviceAccessibilityModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityStateChangeListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "initialize", "", "invalidate", "handleSetPrefersReducedMotion", "prefersReducedMotion", "", "enableFocusLock", "nativeIds", "Lcom/facebook/react/bridge/ReadableArray;", "focus", "", "disableFocusLock", "markCurrentFocus", "restorePreviousFocus", "isAccessibilityServiceEnabled", "device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceAccessibilityModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceAccessibilityModule.kt\ncom/discord/device/DeviceAccessibilityModule\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n31#2:61\n1617#3,9:62\n1869#3:71\n1870#3:73\n1626#3:74\n1#4:72\n*S KotlinDebug\n*F\n+ 1 DeviceAccessibilityModule.kt\ncom/discord/device/DeviceAccessibilityModule\n*L\n16#1:61\n43#1:62,9\n43#1:71\n43#1:73\n43#1:74\n43#1:72\n*E\n"})
public final class DeviceAccessibilityModule extends NativeDeviceAccessibilityModuleSpec {
    private final AccessibilityManager accessibilityManager;

    @NotNull
    private final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAccessibilityModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.accessibilityManager = (AccessibilityManager) reactContext.getSystemService(AccessibilityManager.class);
        this.accessibilityStateChangeListener = new a(1, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disableFocusLock$lambda$3() {
        DeviceFocusLockManager.INSTANCE.disableFocusLock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableFocusLock$lambda$2(ReadableArray readableArray, DeviceAccessibilityModule deviceAccessibilityModule) {
        DeviceFocusLockManager deviceFocusLockManager = DeviceFocusLockManager.INSTANCE;
        IntRange intRangeSizeRange = NativeArrayExtensionsKt.sizeRange(readableArray);
        ArrayList arrayList = new ArrayList();
        Iterator it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            ReactApplicationContext reactApplicationContext = deviceAccessibilityModule.getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            String string = readableArray.getString(iNextInt);
            Intrinsics.checkNotNull(string);
            View viewFindView = ReactContextFindViewKt.findView(reactApplicationContext, string);
            if (viewFindView != null) {
                arrayList.add(viewFindView);
            }
        }
        deviceFocusLockManager.enableFocusLock(arrayList);
    }

    @Override // com.discord.codegen.NativeDeviceAccessibilityModuleSpec
    public void disableFocusLock() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new bc.a(16));
        }
    }

    @Override // com.discord.codegen.NativeDeviceAccessibilityModuleSpec
    public void enableFocusLock(@NotNull ReadableArray nativeIds, boolean focus) {
        Intrinsics.checkNotNullParameter(nativeIds, "nativeIds");
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new d(15, nativeIds, this));
        }
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.discord.codegen.NativeDeviceAccessibilityModuleSpec
    public void handleSetPrefersReducedMotion(@NotNull String prefersReducedMotion) {
        Intrinsics.checkNotNullParameter(prefersReducedMotion, "prefersReducedMotion");
        DeviceReducedMotion.INSTANCE.setMotionPreference$device_release(prefersReducedMotion);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
        }
        super.invalidate();
    }

    @Override // com.discord.codegen.NativeDeviceAccessibilityModuleSpec
    public boolean isAccessibilityServiceEnabled() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    @Override // com.discord.codegen.NativeDeviceAccessibilityModuleSpec
    public void markCurrentFocus() {
    }

    @Override // com.discord.codegen.NativeDeviceAccessibilityModuleSpec
    public void restorePreviousFocus() {
    }
}
