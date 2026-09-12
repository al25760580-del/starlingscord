package com.discord.safearea.extensions;

import android.os.Build;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"setSystemUITransparent", "", "Landroid/view/Window;", "safe_area_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WindowExtensionsKt {
    public static final void setSystemUITransparent(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
    }
}
