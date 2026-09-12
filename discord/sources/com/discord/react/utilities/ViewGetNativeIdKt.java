package com.discord.react.utilities;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getNativeId", "", "Landroid/view/View;", "react_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ViewGetNativeIdKt {
    @NotNull
    public static final String getNativeId(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(com.facebook.react.R.id.view_tag_native_id);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
        return (String) tag;
    }
}
