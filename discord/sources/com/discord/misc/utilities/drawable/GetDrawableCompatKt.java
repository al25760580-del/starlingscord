package com.discord.misc.utilities.drawable;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mf.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"getDrawableCompat", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "drawableResId", "", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GetDrawableCompatKt {
    public static final Drawable getDrawableCompat(@NotNull Context context, int i7) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return f.u(context, i7);
    }
}
