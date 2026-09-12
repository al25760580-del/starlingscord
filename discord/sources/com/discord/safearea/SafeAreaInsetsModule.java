package com.discord.safearea;

import android.app.Activity;
import android.os.Build;
import android.util.AndroidRuntimeException;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.discord.codegen.NativeSafeAreaInsetsModuleSpec;
import com.discord.lifecycle.AppEntryActivityRegistry;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.safearea.extensions.WindowInsetsCompatExtensionsKt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import y7.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/discord/safearea/SafeAreaInsetsModule;", "Lcom/discord/codegen/NativeSafeAreaInsetsModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "getImeInsets", "", "exludeSytemBars", "", "appEntryKey", "", "activityForAppEntry", "Landroid/app/Activity;", "getStableSafeAreaInsets", "Lcom/facebook/react/bridge/WritableMap;", "setStatusBarVisible", "", ViewProps.VISIBLE, "setNavigationBarVisible", "setNavigationBarContrastEnforced", "enforced", "safe_area_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSafeAreaInsetsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeAreaInsetsModule.kt\ncom/discord/safearea/SafeAreaInsetsModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
public final class SafeAreaInsetsModule extends NativeSafeAreaInsetsModuleSpec {

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeAreaInsetsModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    private final Activity activityForAppEntry(String appEntryKey) {
        AppEntryActivityRegistry appEntryActivityRegistry = AppEntryActivityRegistry.INSTANCE;
        if (StringsKt.K(appEntryKey)) {
            appEntryKey = null;
        }
        if (appEntryKey == null) {
            appEntryKey = "main";
        }
        return appEntryActivityRegistry.getActivityForAppEntry(appEntryKey);
    }

    private static final WritableNativeMap getStableSafeAreaInsets$lambda$1(int i7, int i10, int i11, int i12) {
        return NativeMapExtensionsKt.nativeMapOf(new Pair(ViewProps.LEFT, Float.valueOf(SizeUtilsKt.getPxToDp(i7))), new Pair(ViewProps.TOP, Float.valueOf(SizeUtilsKt.getPxToDp(i10))), new Pair(ViewProps.RIGHT, Float.valueOf(SizeUtilsKt.getPxToDp(i11))), new Pair(ViewProps.BOTTOM, Float.valueOf(SizeUtilsKt.getPxToDp(i12))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setNavigationBarContrastEnforced$lambda$4(SafeAreaInsetsModule safeAreaInsetsModule, boolean z5) {
        Activity currentActivity;
        Window window;
        Window window2;
        Window window3;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 35) {
            Activity currentActivity2 = safeAreaInsetsModule.reactContext.getCurrentActivity();
            if (currentActivity2 != null && (window3 = currentActivity2.getWindow()) != null) {
                window3.setStatusBarColor(0);
            }
            Activity currentActivity3 = safeAreaInsetsModule.reactContext.getCurrentActivity();
            if (currentActivity3 != null && (window2 = currentActivity3.getWindow()) != null) {
                window2.setNavigationBarColor(0);
            }
        }
        if (i7 < 29 || (currentActivity = safeAreaInsetsModule.reactContext.getCurrentActivity()) == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setNavigationBarVisible$lambda$3(SafeAreaInsetsModule safeAreaInsetsModule, boolean z5) {
        Window window;
        Activity currentActivity = safeAreaInsetsModule.getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        WindowInsetsCompatExtensionsKt.setInsetsType(window, 2, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStatusBarVisible$lambda$2(SafeAreaInsetsModule safeAreaInsetsModule, boolean z5) {
        Window window;
        Activity currentActivity = safeAreaInsetsModule.getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        WindowInsetsCompatExtensionsKt.setInsetsType(window, 1, z5);
    }

    @Override // com.discord.codegen.NativeSafeAreaInsetsModuleSpec
    public double getImeInsets(boolean exludeSytemBars, @NotNull String appEntryKey) {
        WindowInsetsCompat windowInsetsCompat;
        Insets systemBarInsets$default;
        Insets imeInsets$default;
        Intrinsics.checkNotNullParameter(appEntryKey, "appEntryKey");
        Activity activityActivityForAppEntry = activityForAppEntry(appEntryKey);
        if (activityActivityForAppEntry == null) {
            return 0.0d;
        }
        try {
            windowInsetsCompat = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(activityActivityForAppEntry);
        } catch (AndroidRuntimeException | NullPointerException unused) {
            windowInsetsCompat = null;
        }
        int i7 = 0;
        int i10 = (windowInsetsCompat == null || (imeInsets$default = WindowInsetsCompatExtensionsKt.getImeInsets$default(windowInsetsCompat, false, 1, null)) == null) ? 0 : imeInsets$default.f1559d;
        if (i10 <= 0) {
            return 0.0d;
        }
        if (windowInsetsCompat != null && (systemBarInsets$default = WindowInsetsCompatExtensionsKt.getSystemBarInsets$default(windowInsetsCompat, activityActivityForAppEntry, false, 2, null)) != null) {
            i7 = systemBarInsets$default.f1559d;
        }
        if (i7 != i10 || Build.VERSION.SDK_INT > 29) {
            return exludeSytemBars ? SizeUtilsKt.getPxToDp(i10 - i7) : SizeUtilsKt.getPxToDp(i10);
        }
        return 0.0d;
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.discord.codegen.NativeSafeAreaInsetsModuleSpec
    public WritableMap getStableSafeAreaInsets(@NotNull String appEntryKey) {
        Intrinsics.checkNotNullParameter(appEntryKey, "appEntryKey");
        Activity activityActivityForAppEntry = activityForAppEntry(appEntryKey);
        if (activityActivityForAppEntry == null) {
            return null;
        }
        try {
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(activityActivityForAppEntry);
            if (windowInsetsCompat == null) {
                return null;
            }
            Insets displayCutoutInsets = WindowInsetsCompatExtensionsKt.getDisplayCutoutInsets(windowInsetsCompat, true);
            Insets systemBarInsets = WindowInsetsCompatExtensionsKt.getSystemBarInsets(windowInsetsCompat, activityActivityForAppEntry, true);
            return getStableSafeAreaInsets$lambda$1(Math.max(displayCutoutInsets.f1556a, systemBarInsets.f1556a), Math.max(displayCutoutInsets.f1557b, systemBarInsets.f1557b), Math.max(displayCutoutInsets.f1558c, systemBarInsets.f1558c), Math.max(displayCutoutInsets.f1559d, systemBarInsets.f1559d));
        } catch (AndroidRuntimeException | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.discord.codegen.NativeSafeAreaInsetsModuleSpec
    public void setNavigationBarContrastEnforced(boolean enforced) {
        UiThreadUtil.runOnUiThread(new a(this, enforced, 0));
    }

    @Override // com.discord.codegen.NativeSafeAreaInsetsModuleSpec
    public void setNavigationBarVisible(boolean visible) {
        UiThreadUtil.runOnUiThread(new a(this, visible, 2));
    }

    @Override // com.discord.codegen.NativeSafeAreaInsetsModuleSpec
    public void setStatusBarVisible(boolean visible) {
        UiThreadUtil.runOnUiThread(new a(this, visible, 1));
    }
}
