package com.discord.recycler_view.scroller;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/discord/recycler_view/scroller/SmoothScroller;", "Landroidx/recyclerview/widget/m0;", "Landroid/content/Context;", "context", "", "targetPosition", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "targetAlignment", "Lkotlin/Function0;", "", "onStopScroll", "<init>", "(Landroid/content/Context;ILcom/discord/recycler_view/scroller/Scroller$TargetAlignment;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "child", "onChildAttachedToWindow", "(Landroid/view/View;)V", "dx", "dy", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$Action;", "action", "onSeekTargetStep", "(IILandroidx/recyclerview/widget/RecyclerView$State;Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$Action;)V", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateDtToFit", "(IIIII)I", "onStop", "()V", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "Lkotlin/jvm/functions/Function0;", "targetView", "Landroid/view/View;", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmoothScroller extends m0 {
    private final Function0<Unit> onStopScroll;

    @NotNull
    private final Scroller.TargetAlignment targetAlignment;
    private View targetView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmoothScroller(@NotNull Context context, int i7, @NotNull Scroller.TargetAlignment targetAlignment, Function0<Unit> function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetAlignment, "targetAlignment");
        this.targetAlignment = targetAlignment;
        this.onStopScroll = function0;
        setTargetPosition(i7);
    }

    @Override // androidx.recyclerview.widget.m0
    public int calculateDtToFit(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
        Scroller.TargetAlignment targetAlignment = this.targetAlignment;
        if (targetAlignment instanceof Scroller.TargetAlignment.Center) {
            return (((boxEnd - boxStart) / 2) + boxStart) - (((viewEnd - viewStart) / 2) + viewStart);
        }
        if (targetAlignment instanceof Scroller.TargetAlignment.Top) {
            return ((Scroller.TargetAlignment.Top) targetAlignment).getOffsetPx() + (boxStart - viewStart);
        }
        if (targetAlignment instanceof Scroller.TargetAlignment.Anywhere) {
            return super.calculateDtToFit(viewStart, viewEnd, boxStart, boxEnd, snapPreference);
        }
        throw new n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onChildAttachedToWindow(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.onChildAttachedToWindow(child);
        if (this.targetView == null && getChildPosition(child) == getTargetPosition()) {
            this.targetView = child;
        }
    }

    @Override // androidx.recyclerview.widget.m0, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onSeekTargetStep(int dx, int dy, @NotNull RecyclerView.State state, @NotNull RecyclerView.SmoothScroller.Action action) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        View view = this.targetView;
        if (view != null) {
            onTargetFound(view, state, action);
        } else {
            super.onSeekTargetStep(dx, dy, state, action);
        }
    }

    @Override // androidx.recyclerview.widget.m0, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStop() {
        super.onStop();
        Function0<Unit> function0 = this.onStopScroll;
        if (function0 != null) {
            function0.invoke();
        }
        this.targetView = null;
    }
}
