package com.discord.recycler_view.scroll;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class DebouncedVelocityTrackingScrollListener$velocityTracker$1 extends FunctionReferenceImpl implements Function2<RecyclerView, Float, Unit> {
    public DebouncedVelocityTrackingScrollListener$velocityTracker$1(Object obj) {
        super(2, obj, DebouncedVelocityTrackingScrollListener.class, "onScrollVelocityChanged", "onScrollVelocityChanged(Landroidx/recyclerview/widget/RecyclerView;F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((RecyclerView) obj, ((Number) obj2).floatValue());
        return Unit.f14616a;
    }

    public final void invoke(RecyclerView p3, float f2) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        ((DebouncedVelocityTrackingScrollListener) this.receiver).onScrollVelocityChanged(p3, f2);
    }
}
