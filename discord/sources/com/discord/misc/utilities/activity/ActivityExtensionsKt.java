package com.discord.misc.utilities.activity;

import android.R;
import android.app.Activity;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"getContentView", "Landroid/view/View;", "Landroid/app/Activity;", "getRootView", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ActivityExtensionsKt {
    public static final View getContentView(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return activity.findViewById(R.id.content);
    }

    public static final View getRootView(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        View contentView = getContentView(activity);
        if (contentView != null) {
            return contentView.getRootView();
        }
        return null;
    }
}
