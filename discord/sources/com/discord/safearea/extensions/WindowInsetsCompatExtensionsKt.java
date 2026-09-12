package com.discord.safearea.extensions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.f2;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\r*\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\r*\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a%\u0010\u0013\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0016\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroid/app/Activity;", "Landroidx/core/view/WindowInsetsCompat;", "getWindowInsetsCompat", "(Landroid/app/Activity;)Landroidx/core/view/WindowInsetsCompat;", "Landroid/view/Window;", "", "insetType", "", ViewProps.VISIBLE, "", "setInsetsType", "(Landroid/view/Window;IZ)V", "ignoringVisibility", "Landroidx/core/graphics/Insets;", "getImeInsets", "(Landroidx/core/view/WindowInsetsCompat;Z)Landroidx/core/graphics/Insets;", "getDisplayCutoutInsets", "Landroid/content/Context;", "context", "getSystemBarInsets", "(Landroidx/core/view/WindowInsetsCompat;Landroid/content/Context;Z)Landroidx/core/graphics/Insets;", "type", "getInsets", "(Landroidx/core/view/WindowInsetsCompat;IZ)Landroidx/core/graphics/Insets;", "safe_area_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsetsCompatExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsCompatExtensions.kt\ncom/discord/safearea/extensions/WindowInsetsCompatExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
public final class WindowInsetsCompatExtensionsKt {
    @NotNull
    public static final Insets getDisplayCutoutInsets(@NotNull WindowInsetsCompat windowInsetsCompat, boolean z5) {
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "<this>");
        return getInsets(windowInsetsCompat, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, z5);
    }

    public static /* synthetic */ Insets getDisplayCutoutInsets$default(WindowInsetsCompat windowInsetsCompat, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = false;
        }
        return getDisplayCutoutInsets(windowInsetsCompat, z5);
    }

    @NotNull
    public static final Insets getImeInsets(@NotNull WindowInsetsCompat windowInsetsCompat, boolean z5) {
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "<this>");
        return getInsets(windowInsetsCompat, 8, z5);
    }

    public static /* synthetic */ Insets getImeInsets$default(WindowInsetsCompat windowInsetsCompat, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = false;
        }
        return getImeInsets(windowInsetsCompat, z5);
    }

    private static final Insets getInsets(WindowInsetsCompat windowInsetsCompat, int i7, boolean z5) {
        Insets insetsG = z5 ? windowInsetsCompat.f1605a.g(i7) : windowInsetsCompat.f1605a.f(i7);
        Intrinsics.checkNotNull(insetsG);
        return insetsG;
    }

    public static /* synthetic */ Insets getInsets$default(WindowInsetsCompat windowInsetsCompat, int i7, boolean z5, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z5 = false;
        }
        return getInsets(windowInsetsCompat, i7, z5);
    }

    @NotNull
    public static final Insets getSystemBarInsets(@NotNull WindowInsetsCompat windowInsetsCompat, @NotNull Context context, boolean z5) {
        int dimensionPixelSize;
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Insets insets = getInsets(windowInsetsCompat, 519, z5);
        if (Build.VERSION.SDK_INT > 29) {
            return insets;
        }
        if (z5) {
            f2 f2Var = windowInsetsCompat.f1605a;
            f2 f2Var2 = windowInsetsCompat.f1605a;
            Insets insetsB = Insets.b(f2Var.i().f1556a, f2Var2.i().f1557b, f2Var2.i().f1558c, f2Var2.i().f1559d);
            Intrinsics.checkNotNullExpressionValue(insetsB, "of(...)");
            return insetsB;
        }
        Integer numValueOf = Integer.valueOf(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(numValueOf.intValue());
        } else {
            dimensionPixelSize = 0;
        }
        Insets insetsB2 = Insets.b(insets.f1556a, insets.f1557b, insets.f1558c, dimensionPixelSize);
        Intrinsics.checkNotNullExpressionValue(insetsB2, "of(...)");
        return insetsB2;
    }

    public static /* synthetic */ Insets getSystemBarInsets$default(WindowInsetsCompat windowInsetsCompat, Context context, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        return getSystemBarInsets(windowInsetsCompat, context, z5);
    }

    public static final WindowInsetsCompat getWindowInsetsCompat(@NotNull Activity activity) {
        View viewPeekDecorView;
        WindowInsets rootWindowInsets;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Window window = activity.getWindow();
        if (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (rootWindowInsets = viewPeekDecorView.getRootWindowInsets()) == null) {
            return null;
        }
        return WindowInsetsCompat.g(null, rootWindowInsets);
    }

    public static final void setInsetsType(@NotNull Window window, int i7, boolean z5) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        windowInsetsControllerCompat.d();
        if (z5) {
            windowInsetsControllerCompat.e(i7);
        } else {
            windowInsetsControllerCompat.a(i7);
        }
    }
}
