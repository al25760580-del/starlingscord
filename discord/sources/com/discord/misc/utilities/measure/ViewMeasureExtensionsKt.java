package com.discord.misc.utilities.measure;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import lo.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, d2 = {"measureAndLayout", "", "Landroid/view/View;", "getMaximumSizeOfChildren", "Lkotlin/Pair;", "", "Landroid/view/ViewGroup;", "widthMeasureSpec", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewMeasureExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewMeasureExtensions.kt\ncom/discord/misc/utilities/measure/ViewMeasureExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,42:1\n1803#2,2:43\n1805#2:46\n297#3:45\n*S KotlinDebug\n*F\n+ 1 ViewMeasureExtensions.kt\ncom/discord/misc/utilities/measure/ViewMeasureExtensionsKt\n*L\n30#1:43,2\n30#1:46\n32#1:45\n*E\n"})
public final class ViewMeasureExtensionsKt {
    @NotNull
    public static final Pair<Integer, Integer> getMaximumSizeOfChildren(@NotNull ViewGroup viewGroup, int i7) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        IntRange intRangeI = j.i(0, viewGroup.getChildCount());
        Pair<Integer, Integer> pair = new Pair<>(0, 0);
        Iterator it = intRangeI.iterator();
        if (!it.hasNext()) {
            return pair;
        }
        View childAt = viewGroup.getChildAt(((s0) it).nextInt());
        Intrinsics.checkNotNull(childAt);
        if (childAt.getVisibility() == 8) {
            return pair;
        }
        childAt.measure(i7, 0);
        return new Pair<>(Integer.valueOf(Math.max(((Number) 0).intValue(), childAt.getMeasuredWidth())), Integer.valueOf(Math.max(((Number) 0).intValue(), childAt.getMeasuredHeight())));
    }

    public static final void measureAndLayout(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
}
