package com.discord.misc.utilities.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"setUpLayoutForList", "", "Landroid/view/ViewGroup;", "listSize", "", "inflater", "Lkotlin/Function0;", "Landroid/view/View;", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewGroupUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewGroupUtils.kt\ncom/discord/misc/utilities/view/ViewGroupUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class ViewGroupUtilsKt {
    public static final void setUpLayoutForList(@NotNull ViewGroup viewGroup, int i7, @NotNull Function0<? extends View> inflater) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (i7 == viewGroup.getChildCount()) {
            return;
        }
        if (viewGroup.getChildCount() > i7) {
            viewGroup.removeViews(0, viewGroup.getChildCount() - i7);
        } else if (viewGroup.getChildCount() < i7) {
            int childCount = i7 - viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                viewGroup.addView((View) inflater.invoke());
            }
        }
    }
}
