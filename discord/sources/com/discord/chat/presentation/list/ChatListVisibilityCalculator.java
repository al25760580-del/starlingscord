package com.discord.chat.presentation.list;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J(\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/discord/chat/presentation/list/ChatListVisibilityCalculator;", "", "<init>", "()V", "value", "", "firstMessagePosition", "getFirstMessagePosition", "()I", "", "firstMessagePercentVisible", "getFirstMessagePercentVisible", "()Ljava/lang/Double;", "Ljava/lang/Double;", "lastMessagePosition", "getLastMessagePosition", "lastMessagePercentVisible", "getLastMessagePercentVisible", "updateFirstAndLastMessageVisibilityData", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "resetVisibilityData", "getItemPercentVisible", ViewProps.POSITION, "intersectIntervals", "min1", "max1", "min2", "max2", "floorToOneDecimal", "number", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChatListVisibilityCalculator {
    private Double firstMessagePercentVisible;
    private Double lastMessagePercentVisible;
    private int firstMessagePosition = -1;
    private int lastMessagePosition = -1;

    private final double floorToOneDecimal(double number) {
        double d6 = 10;
        return Math.floor(number * d6) / d6;
    }

    private final double getItemPercentVisible(RecyclerView recyclerView, int position) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        View viewFindViewByPosition = ((LinearLayoutManager) layoutManager).findViewByPosition(position);
        if (viewFindViewByPosition == null) {
            return 0.0d;
        }
        int iMin = Math.min(viewFindViewByPosition.getTop(), viewFindViewByPosition.getBottom());
        int iMax = Math.max(viewFindViewByPosition.getTop(), viewFindViewByPosition.getBottom());
        int i7 = iMax - iMin;
        return floorToOneDecimal(i7 > 0 ? ((double) intersectIntervals(0, recyclerView.getHeight(), iMin, iMax)) / ((double) i7) : 0.0d);
    }

    private final int intersectIntervals(int min1, int max1, int min2, int max2) {
        int iMax = Math.max(min1, min2);
        int iMin = Math.min(max1, max2);
        if (iMax <= iMin) {
            return iMin - iMax;
        }
        return 0;
    }

    private final void resetVisibilityData() {
        this.firstMessagePosition = -1;
        this.firstMessagePercentVisible = null;
        this.lastMessagePosition = -1;
        this.lastMessagePercentVisible = null;
    }

    public final Double getFirstMessagePercentVisible() {
        return this.firstMessagePercentVisible;
    }

    public final int getFirstMessagePosition() {
        return this.firstMessagePosition;
    }

    public final Double getLastMessagePercentVisible() {
        return this.lastMessagePercentVisible;
    }

    public final int getLastMessagePosition() {
        return this.lastMessagePosition;
    }

    public final void updateFirstAndLastMessageVisibilityData(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        resetVisibilityData();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1) {
            return;
        }
        if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
            int i7 = iFindFirstVisibleItemPosition;
            while (true) {
                double itemPercentVisible = getItemPercentVisible(recyclerView, i7);
                if (itemPercentVisible > 0.0d && this.firstMessagePosition == -1) {
                    this.firstMessagePosition = i7;
                    this.firstMessagePercentVisible = Double.valueOf(itemPercentVisible);
                }
                if (i7 == iFindLastVisibleItemPosition) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            double itemPercentVisible2 = getItemPercentVisible(recyclerView, iFindLastVisibleItemPosition);
            if (itemPercentVisible2 > 0.0d && this.lastMessagePosition == -1) {
                this.lastMessagePosition = iFindLastVisibleItemPosition;
                this.lastMessagePercentVisible = Double.valueOf(itemPercentVisible2);
            }
            if (iFindLastVisibleItemPosition == iFindFirstVisibleItemPosition) {
                return;
            } else {
                iFindLastVisibleItemPosition--;
            }
        }
    }
}
