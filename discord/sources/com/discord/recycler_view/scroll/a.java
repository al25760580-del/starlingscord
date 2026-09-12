package com.discord.recycler_view.scroll;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.OnScrollListener f4558e;

    public /* synthetic */ a(RecyclerView.OnScrollListener onScrollListener, int i7) {
        this.f4557d = i7;
        this.f4558e = onScrollListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4557d) {
            case 0:
                return DebouncedScrollListener.scrollEvents$lambda$0((DebouncedScrollListener) this.f4558e, (DebouncedScrollListener.ScrollEvent) obj);
            case 1:
                return DebouncedScrollListener.setTimeoutMillis$lambda$1((DebouncedScrollListener) this.f4558e, (DebouncedScrollListener.ScrollEvent) obj);
            default:
                return DebouncedVelocityTrackingScrollListener.velocityEvents$lambda$0((DebouncedVelocityTrackingScrollListener) this.f4558e, (DebouncedVelocityTrackingScrollListener.VelocityEvent) obj);
        }
    }
}
