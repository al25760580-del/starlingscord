package com.discord.theme.utils;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.core.view.WindowInsetsControllerCompat;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.theme.ThemeManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"updateSystemUi", "", "Landroid/view/View;", "Landroid/app/Activity;", "setLightTheme", "Landroidx/core/view/WindowInsetsControllerCompat;", "isLightTheme", "", "theme_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UpdateSystemUiKt {
    private static final void setLightTheme(WindowInsetsControllerCompat windowInsetsControllerCompat, boolean z5) {
        windowInsetsControllerCompat.c(z5);
        windowInsetsControllerCompat.b(z5);
    }

    public static final void updateSystemUi(@NotNull View view) {
        WindowInsetsController windowInsetsController;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ThemeManager themeManager = ThemeManager.INSTANCE;
        if (themeManager.isInitialized()) {
            boolean zIsThemeLight = themeManager.isThemeLight();
            if (Build.VERSION.SDK_INT < 30 || (windowInsetsController = view.getWindowInsetsController()) == null) {
                return;
            }
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(windowInsetsController);
            Intrinsics.checkNotNullExpressionValue(windowInsetsControllerCompat, "toWindowInsetsControllerCompat(...)");
            setLightTheme(windowInsetsControllerCompat, zIsThemeLight);
        }
    }

    public static final void updateSystemUi(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        ThemeManager themeManager = ThemeManager.INSTANCE;
        if (themeManager.isInitialized()) {
            boolean zIsThemeLight = themeManager.isThemeLight();
            View rootView = ActivityExtensionsKt.getRootView(activity);
            if (rootView != null) {
                WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(activity.getWindow(), rootView);
                Intrinsics.checkNotNullExpressionValue(windowInsetsControllerCompat, "getInsetsController(...)");
                setLightTheme(windowInsetsControllerCompat, zIsThemeLight);
            }
        }
    }
}
