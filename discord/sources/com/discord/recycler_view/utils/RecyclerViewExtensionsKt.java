package com.discord.recycler_view.utils;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.recycler_view.scroller.Scroller;
import com.discord.recycler_view.scroller.SmoothScroller;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a*\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0000\u001a\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\u0000¨\u0006\u000f"}, d2 = {"toggleSuppressLayout", "", "Landroidx/recyclerview/widget/RecyclerView;", "setReactNativeClipToPadding", "scrollToPositionAnimated", ViewProps.POSITION, "", "targetAlignment", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "onComplete", "Lkotlin/Function0;", "scrollToPositionWithOffset", "offset", "scrollToCenter", "scrollToTop", "recycler_view_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RecyclerViewExtensionsKt {
    public static final void scrollToCenter(@NotNull RecyclerView recyclerView, int i7) {
        View view;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (!((LinearLayoutManager) layoutManager).getReverseLayout()) {
            scrollToPositionWithOffset(recyclerView, i7, recyclerView.getHeight() / 2);
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i7);
        int height = (viewHolderFindViewHolderForAdapterPosition == null || (view = viewHolderFindViewHolderForAdapterPosition.itemView) == null) ? 0 : view.getHeight();
        if (height == 0) {
            recyclerView.scrollToPosition(i7);
        } else {
            scrollToPositionWithOffset(recyclerView, i7, (recyclerView.getHeight() / 2) - (height / 2));
        }
    }

    public static final void scrollToPositionAnimated(@NotNull RecyclerView recyclerView, int i7, @NotNull Scroller.TargetAlignment targetAlignment, @NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(targetAlignment, "targetAlignment");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutManager.startSmoothScroll(new SmoothScroller(context, i7, targetAlignment, onComplete));
    }

    public static final void scrollToPositionWithOffset(@NotNull RecyclerView recyclerView, int i7, int i10) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i7, i10);
    }

    public static final void scrollToTop(@NotNull RecyclerView recyclerView, int i7, int i10) {
        View view;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (!((LinearLayoutManager) layoutManager).getReverseLayout()) {
            scrollToPositionWithOffset(recyclerView, i7, i10);
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i7);
        int height = (viewHolderFindViewHolderForAdapterPosition == null || (view = viewHolderFindViewHolderForAdapterPosition.itemView) == null) ? 0 : view.getHeight();
        if (height == 0) {
            recyclerView.scrollToPosition(i7);
        } else {
            scrollToPositionWithOffset(recyclerView, i7, ((recyclerView.getHeight() - recyclerView.getPaddingBottom()) - height) - i10);
        }
    }

    public static final void setReactNativeClipToPadding(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.setPadding(0, -1, 0, 0);
        recyclerView.setClipToPadding(true);
    }

    public static final void toggleSuppressLayout(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.suppressLayout(true);
        recyclerView.suppressLayout(false);
    }
}
