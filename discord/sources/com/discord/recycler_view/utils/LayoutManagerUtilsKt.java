package com.discord.recycler_view.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"isPositionVisible", "", "Landroidx/recyclerview/widget/LinearLayoutManager;", ViewProps.POSITION, "", "prioritizeCompletelyVisible", "(Landroidx/recyclerview/widget/LinearLayoutManager;IZ)Ljava/lang/Boolean;", "recycler_view_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutManagerUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutManagerUtils.kt\ncom/discord/recycler_view/utils/LayoutManagerUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1#2:33\n*E\n"})
public final class LayoutManagerUtilsKt {
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    public static final Boolean isPositionVisible(@NotNull LinearLayoutManager linearLayoutManager, int i7, boolean z5) {
        Integer numValueOf;
        Integer numValueOf2;
        Intrinsics.checkNotNullParameter(linearLayoutManager, "<this>");
        if (z5) {
            int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            numValueOf = Integer.valueOf(iFindFirstCompletelyVisibleItemPosition);
            if (iFindFirstCompletelyVisibleItemPosition == -1) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                numValueOf = Integer.valueOf(iFindFirstVisibleItemPosition);
                if (iFindFirstVisibleItemPosition == -1) {
                    numValueOf = null;
                }
            }
        } else {
            int iFindFirstVisibleItemPosition2 = linearLayoutManager.findFirstVisibleItemPosition();
            numValueOf = Integer.valueOf(iFindFirstVisibleItemPosition2);
            if (iFindFirstVisibleItemPosition2 == -1) {
                numValueOf = null;
            }
        }
        if (z5) {
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            numValueOf2 = Integer.valueOf(iFindLastCompletelyVisibleItemPosition);
            if (iFindLastCompletelyVisibleItemPosition == -1) {
                numValueOf2 = null;
            }
            if (numValueOf2 == null) {
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                numValueOf2 = Integer.valueOf(iFindLastVisibleItemPosition);
                if (iFindLastVisibleItemPosition == -1) {
                    numValueOf2 = null;
                }
            }
        } else {
            int iFindLastVisibleItemPosition2 = linearLayoutManager.findLastVisibleItemPosition();
            numValueOf2 = Integer.valueOf(iFindLastVisibleItemPosition2);
            if (iFindLastVisibleItemPosition2 == -1) {
                numValueOf2 = null;
            }
        }
        if (numValueOf == null || numValueOf2 == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        return Boolean.valueOf(iIntValue <= i7 && i7 <= new IntRange(iIntValue, numValueOf2.intValue(), 1).f14689e);
    }
}
