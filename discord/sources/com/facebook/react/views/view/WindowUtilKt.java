package com.facebook.react.views.view;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.e1;
import androidx.core.view.j0;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.util.AndroidVersion;
import com.facebook.react.views.common.UiModeUtils;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0006\u0010\n\u001a\u00020\f\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0000\u001a\u0014\u0010\u0013\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007H\u0000\u001a\u0016\u0010\u0015\u001a\u00020\f*\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0000\u001a\f\u0010\u0018\u001a\u00020\f*\u00020\u0011H\u0002\u001a\f\u0010\u0019\u001a\u00020\f*\u00020\u0011H\u0002\u001a\f\u0010\u001a\u001a\u00020\f*\u00020\u0011H\u0000\u001a\f\u0010\u001b\u001a\u00020\f*\u00020\u0011H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"LightNavigationBarColor", "", "getLightNavigationBarColor", "()I", "DarkNavigationBarColor", "getDarkNavigationBarColor", "value", "", "isEdgeToEdgeFeatureFlagOn", "()Z", "setEdgeToEdgeFeatureFlagOn", "(Z)V", "", "updateEdgeToEdgeFeatureFlag", "activity", "Landroid/app/Activity;", "setStatusBarTranslucency", "Landroid/view/Window;", "isTranslucent", "setStatusBarVisibility", "isHidden", "setStatusBarStyle", "style", "", "statusBarHide", "statusBarShow", "enableEdgeToEdge", "disableEdgeToEdge", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WindowUtilKt {
    private static boolean isEdgeToEdgeFeatureFlagOn;
    private static final int LightNavigationBarColor = Color.argb(230, 255, 255, 255);
    private static final int DarkNavigationBarColor = Color.argb(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 27, 27, 27);

    public static final void disableEdgeToEdge(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        e1.k(window, true);
    }

    public static final void enableEdgeToEdge(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        boolean z5 = false;
        e1.k(window, false);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        Context context = window.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zIsDarkMode = UiModeUtils.isDarkMode(context);
        window.setStatusBarColor(0);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            window.setNavigationBarColor(0);
            TypedArray typedArrayObtainStyledAttributes = window.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enforceNavigationBarContrast});
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                window.setStatusBarContrastEnforced(false);
                window.setNavigationBarContrastEnforced(z6);
                if (z6) {
                    windowInsetsControllerCompat.b(!zIsDarkMode);
                }
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            if (i7 >= 26 && !zIsDarkMode) {
                z5 = true;
            }
            window.setNavigationBarColor(z5 ? LightNavigationBarColor : DarkNavigationBarColor);
            windowInsetsControllerCompat.b(z5);
        }
        if (i7 >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = i7 >= 30 ? 3 : 1;
        }
    }

    public static final int getDarkNavigationBarColor() {
        return DarkNavigationBarColor;
    }

    public static final int getLightNavigationBarColor() {
        return LightNavigationBarColor;
    }

    public static final boolean isEdgeToEdgeFeatureFlagOn() {
        return isEdgeToEdgeFeatureFlagOn;
    }

    public static final void setEdgeToEdgeFeatureFlagOn(boolean z5) {
        isEdgeToEdgeFeatureFlagOn = z5;
    }

    public static final void setStatusBarStyle(@NotNull Window window, String str) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (Build.VERSION.SDK_INT <= 30) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(Intrinsics.areEqual("dark-content", str) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        } else {
            if (Intrinsics.areEqual("dark-content", str)) {
                WindowInsetsController insetsController = window.getInsetsController();
                if (insetsController != null) {
                    insetsController.setSystemBarsAppearance(8, 8);
                    return;
                }
                return;
            }
            WindowInsetsController insetsController2 = window.getInsetsController();
            if (insetsController2 != null) {
                insetsController2.setSystemBarsAppearance(0, 8);
            }
        }
    }

    public static final void setStatusBarTranslucency(@NotNull Window window, boolean z5) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (z5) {
            window.getDecorView().setOnApplyWindowInsetsListener(new b());
        } else {
            window.getDecorView().setOnApplyWindowInsetsListener(null);
        }
        View decorView = window.getDecorView();
        WeakHashMap weakHashMap = u0.f1729a;
        j0.c(decorView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets setStatusBarTranslucency$lambda$0(View v6, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(v6, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = v6.onApplyWindowInsets(insets);
        return windowInsetsOnApplyWindowInsets.replaceSystemWindowInsets(windowInsetsOnApplyWindowInsets.getSystemWindowInsetLeft(), 0, windowInsetsOnApplyWindowInsets.getSystemWindowInsetRight(), windowInsetsOnApplyWindowInsets.getSystemWindowInsetBottom());
    }

    public static final void setStatusBarVisibility(@NotNull Window window, boolean z5) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (z5) {
            statusBarHide(window);
        } else {
            statusBarShow(window);
        }
    }

    private static final void statusBarHide(Window window) {
        if (isEdgeToEdgeFeatureFlagOn) {
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
            windowInsetsControllerCompat.d();
            windowInsetsControllerCompat.a(1);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
                window.setDecorFitsSystemWindows(false);
            }
            window.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            window.clearFlags(RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    private static final void statusBarShow(Window window) {
        if (isEdgeToEdgeFeatureFlagOn) {
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
            windowInsetsControllerCompat.d();
            windowInsetsControllerCompat.e(1);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 0;
                window.setDecorFitsSystemWindows(true);
            }
            window.addFlags(RecyclerView.ItemAnimator.FLAG_MOVED);
            window.clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
    }

    public static final void updateEdgeToEdgeFeatureFlag(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (AndroidVersion.isAtLeastTargetSdk35$ReactAndroid_release(activity)) {
            if (Build.VERSION.SDK_INT >= 36) {
                isEdgeToEdgeFeatureFlagOn = true;
            } else {
                TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{16844442});
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                try {
                    boolean z5 = !typedArrayObtainStyledAttributes.getBoolean(0, false);
                    typedArrayObtainStyledAttributes.recycle();
                    isEdgeToEdgeFeatureFlagOn = z5;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            }
        }
        if (isEdgeToEdgeFeatureFlagOn) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            enableEdgeToEdge(window);
        }
    }

    public static final void setEdgeToEdgeFeatureFlagOn() {
        isEdgeToEdgeFeatureFlagOn = true;
    }
}
