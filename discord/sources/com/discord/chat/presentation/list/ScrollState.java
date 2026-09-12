package com.discord.chat.presentation.list;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010(\u001a\u00020\rHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u008c\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\rHÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001a¨\u00061"}, d2 = {"Lcom/discord/chat/presentation/list/ScrollState;", "", "isDragging", "", "isSettling", "isNearBottom", "isAtBottom", "isNearTop", "isAtTop", "scrollDirection", "Lcom/discord/chat/presentation/list/ScrollDirection;", "isFirstMessageVisible", "firstVisibleMessageIndex", "", "firstVisibleMessagePercentVisible", "", "lastVisibleMessageIndex", "lastVisibleMessagePercentVisible", "<init>", "(ZZZZZZLcom/discord/chat/presentation/list/ScrollDirection;ZILjava/lang/Double;ILjava/lang/Double;)V", "()Z", "getScrollDirection", "()Lcom/discord/chat/presentation/list/ScrollDirection;", "getFirstVisibleMessageIndex", "()I", "getFirstVisibleMessagePercentVisible", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLastVisibleMessageIndex", "getLastVisibleMessagePercentVisible", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ZZZZZZLcom/discord/chat/presentation/list/ScrollDirection;ZILjava/lang/Double;ILjava/lang/Double;)Lcom/discord/chat/presentation/list/ScrollState;", "equals", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScrollState {
    private final int firstVisibleMessageIndex;
    private final Double firstVisibleMessagePercentVisible;
    private final boolean isAtBottom;
    private final boolean isAtTop;
    private final boolean isDragging;
    private final boolean isFirstMessageVisible;
    private final boolean isNearBottom;
    private final boolean isNearTop;
    private final boolean isSettling;
    private final int lastVisibleMessageIndex;
    private final Double lastVisibleMessagePercentVisible;
    private final ScrollDirection scrollDirection;

    public ScrollState(boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12, ScrollDirection scrollDirection, boolean z13, int i7, Double d6, int i10, Double d7) {
        this.isDragging = z5;
        this.isSettling = z6;
        this.isNearBottom = z7;
        this.isAtBottom = z10;
        this.isNearTop = z11;
        this.isAtTop = z12;
        this.scrollDirection = scrollDirection;
        this.isFirstMessageVisible = z13;
        this.firstVisibleMessageIndex = i7;
        this.firstVisibleMessagePercentVisible = d6;
        this.lastVisibleMessageIndex = i10;
        this.lastVisibleMessagePercentVisible = d7;
    }

    public static /* synthetic */ ScrollState copy$default(ScrollState scrollState, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12, ScrollDirection scrollDirection, boolean z13, int i7, Double d6, int i10, Double d7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z5 = scrollState.isDragging;
        }
        if ((i11 & 2) != 0) {
            z6 = scrollState.isSettling;
        }
        if ((i11 & 4) != 0) {
            z7 = scrollState.isNearBottom;
        }
        if ((i11 & 8) != 0) {
            z10 = scrollState.isAtBottom;
        }
        if ((i11 & 16) != 0) {
            z11 = scrollState.isNearTop;
        }
        if ((i11 & 32) != 0) {
            z12 = scrollState.isAtTop;
        }
        if ((i11 & 64) != 0) {
            scrollDirection = scrollState.scrollDirection;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            z13 = scrollState.isFirstMessageVisible;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            i7 = scrollState.firstVisibleMessageIndex;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            d6 = scrollState.firstVisibleMessagePercentVisible;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            i10 = scrollState.lastVisibleMessageIndex;
        }
        if ((i11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
            d7 = scrollState.lastVisibleMessagePercentVisible;
        }
        int i12 = i10;
        Double d8 = d7;
        int i13 = i7;
        Double d9 = d6;
        ScrollDirection scrollDirection2 = scrollDirection;
        boolean z14 = z13;
        boolean z15 = z11;
        boolean z16 = z12;
        return scrollState.copy(z5, z6, z7, z10, z15, z16, scrollDirection2, z14, i13, d9, i12, d8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsDragging() {
        return this.isDragging;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getFirstVisibleMessagePercentVisible() {
        return this.firstVisibleMessagePercentVisible;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getLastVisibleMessageIndex() {
        return this.lastVisibleMessageIndex;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getLastVisibleMessagePercentVisible() {
        return this.lastVisibleMessagePercentVisible;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSettling() {
        return this.isSettling;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsNearBottom() {
        return this.isNearBottom;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsAtBottom() {
        return this.isAtBottom;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsNearTop() {
        return this.isNearTop;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsAtTop() {
        return this.isAtTop;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ScrollDirection getScrollDirection() {
        return this.scrollDirection;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsFirstMessageVisible() {
        return this.isFirstMessageVisible;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFirstVisibleMessageIndex() {
        return this.firstVisibleMessageIndex;
    }

    @NotNull
    public final ScrollState copy(boolean isDragging, boolean isSettling, boolean isNearBottom, boolean isAtBottom, boolean isNearTop, boolean isAtTop, ScrollDirection scrollDirection, boolean isFirstMessageVisible, int firstVisibleMessageIndex, Double firstVisibleMessagePercentVisible, int lastVisibleMessageIndex, Double lastVisibleMessagePercentVisible) {
        return new ScrollState(isDragging, isSettling, isNearBottom, isAtBottom, isNearTop, isAtTop, scrollDirection, isFirstMessageVisible, firstVisibleMessageIndex, firstVisibleMessagePercentVisible, lastVisibleMessageIndex, lastVisibleMessagePercentVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollState)) {
            return false;
        }
        ScrollState scrollState = (ScrollState) other;
        return this.isDragging == scrollState.isDragging && this.isSettling == scrollState.isSettling && this.isNearBottom == scrollState.isNearBottom && this.isAtBottom == scrollState.isAtBottom && this.isNearTop == scrollState.isNearTop && this.isAtTop == scrollState.isAtTop && this.scrollDirection == scrollState.scrollDirection && this.isFirstMessageVisible == scrollState.isFirstMessageVisible && this.firstVisibleMessageIndex == scrollState.firstVisibleMessageIndex && Intrinsics.areEqual((Object) this.firstVisibleMessagePercentVisible, (Object) scrollState.firstVisibleMessagePercentVisible) && this.lastVisibleMessageIndex == scrollState.lastVisibleMessageIndex && Intrinsics.areEqual((Object) this.lastVisibleMessagePercentVisible, (Object) scrollState.lastVisibleMessagePercentVisible);
    }

    public final int getFirstVisibleMessageIndex() {
        return this.firstVisibleMessageIndex;
    }

    public final Double getFirstVisibleMessagePercentVisible() {
        return this.firstVisibleMessagePercentVisible;
    }

    public final int getLastVisibleMessageIndex() {
        return this.lastVisibleMessageIndex;
    }

    public final Double getLastVisibleMessagePercentVisible() {
        return this.lastVisibleMessagePercentVisible;
    }

    public final ScrollDirection getScrollDirection() {
        return this.scrollDirection;
    }

    public int hashCode() {
        int iG = a.g(a.g(a.g(a.g(a.g(Boolean.hashCode(this.isDragging) * 31, 31, this.isSettling), 31, this.isNearBottom), 31, this.isAtBottom), 31, this.isNearTop), 31, this.isAtTop);
        ScrollDirection scrollDirection = this.scrollDirection;
        int iU = a.u(this.firstVisibleMessageIndex, a.g((iG + (scrollDirection == null ? 0 : scrollDirection.hashCode())) * 31, 31, this.isFirstMessageVisible), 31);
        Double d6 = this.firstVisibleMessagePercentVisible;
        int iU2 = a.u(this.lastVisibleMessageIndex, (iU + (d6 == null ? 0 : d6.hashCode())) * 31, 31);
        Double d7 = this.lastVisibleMessagePercentVisible;
        return iU2 + (d7 != null ? d7.hashCode() : 0);
    }

    public final boolean isAtBottom() {
        return this.isAtBottom;
    }

    public final boolean isAtTop() {
        return this.isAtTop;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public final boolean isFirstMessageVisible() {
        return this.isFirstMessageVisible;
    }

    public final boolean isNearBottom() {
        return this.isNearBottom;
    }

    public final boolean isNearTop() {
        return this.isNearTop;
    }

    public final boolean isSettling() {
        return this.isSettling;
    }

    @NotNull
    public String toString() {
        boolean z5 = this.isDragging;
        boolean z6 = this.isSettling;
        boolean z7 = this.isNearBottom;
        boolean z10 = this.isAtBottom;
        boolean z11 = this.isNearTop;
        boolean z12 = this.isAtTop;
        ScrollDirection scrollDirection = this.scrollDirection;
        boolean z13 = this.isFirstMessageVisible;
        int i7 = this.firstVisibleMessageIndex;
        Double d6 = this.firstVisibleMessagePercentVisible;
        int i10 = this.lastVisibleMessageIndex;
        Double d7 = this.lastVisibleMessagePercentVisible;
        StringBuilder sb2 = new StringBuilder("ScrollState(isDragging=");
        sb2.append(z5);
        sb2.append(", isSettling=");
        sb2.append(z6);
        sb2.append(", isNearBottom=");
        a3.e.B(sb2, z7, ", isAtBottom=", z10, ", isNearTop=");
        a3.e.B(sb2, z11, ", isAtTop=", z12, ", scrollDirection=");
        sb2.append(scrollDirection);
        sb2.append(", isFirstMessageVisible=");
        sb2.append(z13);
        sb2.append(", firstVisibleMessageIndex=");
        sb2.append(i7);
        sb2.append(", firstVisibleMessagePercentVisible=");
        sb2.append(d6);
        sb2.append(", lastVisibleMessageIndex=");
        sb2.append(i10);
        sb2.append(", lastVisibleMessagePercentVisible=");
        sb2.append(d7);
        sb2.append(")");
        return sb2.toString();
    }
}
