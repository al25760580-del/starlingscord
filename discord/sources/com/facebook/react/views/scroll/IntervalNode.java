package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lcom/facebook/react/views/scroll/IntervalNode;", "", "interval", "Lcom/facebook/react/views/scroll/Interval;", "virtualView", "Lcom/facebook/react/views/scroll/VirtualView;", "max", "", "height", ViewProps.LEFT, ViewProps.RIGHT, "<init>", "(Lcom/facebook/react/views/scroll/Interval;Lcom/facebook/react/views/scroll/VirtualView;IILcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)V", "getInterval", "()Lcom/facebook/react/views/scroll/Interval;", "setInterval", "(Lcom/facebook/react/views/scroll/Interval;)V", "getVirtualView", "()Lcom/facebook/react/views/scroll/VirtualView;", "setVirtualView", "(Lcom/facebook/react/views/scroll/VirtualView;)V", "getMax", "()I", "setMax", "(I)V", "getHeight", "setHeight", "getLeft", "()Lcom/facebook/react/views/scroll/IntervalNode;", "setLeft", "(Lcom/facebook/react/views/scroll/IntervalNode;)V", "getRight", "setRight", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class IntervalNode {
    private int height;

    @NotNull
    private Interval interval;
    private IntervalNode left;
    private int max;
    private IntervalNode right;

    @NotNull
    private VirtualView virtualView;

    public IntervalNode(@NotNull Interval interval, @NotNull VirtualView virtualView, int i7, int i10, IntervalNode intervalNode, IntervalNode intervalNode2) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(virtualView, "virtualView");
        this.interval = interval;
        this.virtualView = virtualView;
        this.max = i7;
        this.height = i10;
        this.left = intervalNode;
        this.right = intervalNode2;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final Interval getInterval() {
        return this.interval;
    }

    public final IntervalNode getLeft() {
        return this.left;
    }

    public final int getMax() {
        return this.max;
    }

    public final IntervalNode getRight() {
        return this.right;
    }

    @NotNull
    public final VirtualView getVirtualView() {
        return this.virtualView;
    }

    public final void setHeight(int i7) {
        this.height = i7;
    }

    public final void setInterval(@NotNull Interval interval) {
        Intrinsics.checkNotNullParameter(interval, "<set-?>");
        this.interval = interval;
    }

    public final void setLeft(IntervalNode intervalNode) {
        this.left = intervalNode;
    }

    public final void setMax(int i7) {
        this.max = i7;
    }

    public final void setRight(IntervalNode intervalNode) {
        this.right = intervalNode;
    }

    public final void setVirtualView(@NotNull VirtualView virtualView) {
        Intrinsics.checkNotNullParameter(virtualView, "<set-?>");
        this.virtualView = virtualView;
    }

    public /* synthetic */ IntervalNode(Interval interval, VirtualView virtualView, int i7, int i10, IntervalNode intervalNode, IntervalNode intervalNode2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interval, virtualView, (i11 & 4) != 0 ? interval.getEnd() : i7, (i11 & 8) != 0 ? 1 : i10, (i11 & 16) != 0 ? null : intervalNode, (i11 & 32) != 0 ? null : intervalNode2);
    }
}
