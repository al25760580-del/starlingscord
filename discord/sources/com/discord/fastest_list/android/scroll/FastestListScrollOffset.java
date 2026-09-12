package com.discord.fastest_list.android.scroll;

import a3.e;
import android.view.View;
import com.discord.chat.presentation.list.a;
import com.discord.fastest_list.android.FastestListLayoutManager;
import com.discord.fastest_list.android.FastestListSections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u0004\u0018\u00010\tJ \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/fastest_list/android/scroll/FastestListScrollOffset;", "", "layoutManager", "Lcom/discord/fastest_list/android/FastestListLayoutManager;", "sections", "Lcom/discord/fastest_list/android/FastestListSections;", "<init>", "(Lcom/discord/fastest_list/android/FastestListLayoutManager;Lcom/discord/fastest_list/android/FastestListSections;)V", "data", "Lcom/discord/fastest_list/android/scroll/FastestListScrollOffset$Data;", "compute", "computeScrollOffset", "firstVisibleItemPosition", "", "firstVisibleItemView", "Landroid/view/View;", "horizontal", "", "getContentWidth", "getContentHeight", "Data", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FastestListScrollOffset {

    @NotNull
    private Data data;

    @NotNull
    private final FastestListLayoutManager layoutManager;

    @NotNull
    private final FastestListSections sections;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006&"}, d2 = {"Lcom/discord/fastest_list/android/scroll/FastestListScrollOffset$Data;", "", "x", "", "y", "width", "height", "contentWidth", "contentHeight", "<init>", "(IIIIII)V", "getX", "()I", "setX", "(I)V", "getY", "setY", "getWidth", "setWidth", "getHeight", "setHeight", "getContentWidth", "setContentWidth", "getContentHeight", "setContentHeight", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data {
        private int contentHeight;
        private int contentWidth;
        private int height;
        private int width;
        private int x;
        private int y;

        public Data() {
            this(0, 0, 0, 0, 0, 0, 63, null);
        }

        public static /* synthetic */ Data copy$default(Data data, int i7, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i7 = data.x;
            }
            if ((i15 & 2) != 0) {
                i10 = data.y;
            }
            if ((i15 & 4) != 0) {
                i11 = data.width;
            }
            if ((i15 & 8) != 0) {
                i12 = data.height;
            }
            if ((i15 & 16) != 0) {
                i13 = data.contentWidth;
            }
            if ((i15 & 32) != 0) {
                i14 = data.contentHeight;
            }
            int i16 = i13;
            int i17 = i14;
            return data.copy(i7, i10, i11, i12, i16, i17);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getY() {
            return this.y;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getContentWidth() {
            return this.contentWidth;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getContentHeight() {
            return this.contentHeight;
        }

        @NotNull
        public final Data copy(int x5, int y5, int width, int height, int contentWidth, int contentHeight) {
            return new Data(x5, y5, width, height, contentWidth, contentHeight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return this.x == data.x && this.y == data.y && this.width == data.width && this.height == data.height && this.contentWidth == data.contentWidth && this.contentHeight == data.contentHeight;
        }

        public final int getContentHeight() {
            return this.contentHeight;
        }

        public final int getContentWidth() {
            return this.contentWidth;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public int hashCode() {
            return Integer.hashCode(this.contentHeight) + a.u(this.contentWidth, a.u(this.height, a.u(this.width, a.u(this.y, Integer.hashCode(this.x) * 31, 31), 31), 31), 31);
        }

        public final void setContentHeight(int i7) {
            this.contentHeight = i7;
        }

        public final void setContentWidth(int i7) {
            this.contentWidth = i7;
        }

        public final void setHeight(int i7) {
            this.height = i7;
        }

        public final void setWidth(int i7) {
            this.width = i7;
        }

        public final void setX(int i7) {
            this.x = i7;
        }

        public final void setY(int i7) {
            this.y = i7;
        }

        @NotNull
        public String toString() {
            int i7 = this.x;
            int i10 = this.y;
            int i11 = this.width;
            int i12 = this.height;
            int i13 = this.contentWidth;
            int i14 = this.contentHeight;
            StringBuilder sbR = e.r(i7, "Data(x=", i10, ", y=", ", width=");
            e.z(sbR, i11, ", height=", i12, ", contentWidth=");
            sbR.append(i13);
            sbR.append(", contentHeight=");
            sbR.append(i14);
            sbR.append(")");
            return sbR.toString();
        }

        public Data(int i7, int i10, int i11, int i12, int i13, int i14) {
            this.x = i7;
            this.y = i10;
            this.width = i11;
            this.height = i12;
            this.contentWidth = i13;
            this.contentHeight = i14;
        }

        public /* synthetic */ Data(int i7, int i10, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 0 : i7, (i15 & 2) != 0 ? 0 : i10, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? 0 : i14);
        }
    }

    public FastestListScrollOffset(@NotNull FastestListLayoutManager layoutManager, @NotNull FastestListSections sections) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.layoutManager = layoutManager;
        this.sections = sections;
        this.data = new Data(0, 0, 0, 0, 0, 0, 63, null);
    }

    private final Data computeScrollOffset(int firstVisibleItemPosition, View firstVisibleItemView, boolean horizontal) {
        int itemOffset = this.sections.getItemOffset(firstVisibleItemPosition) + (horizontal ? Math.abs(firstVisibleItemView.getLeft() - this.layoutManager.getPaddingLeft()) : Math.abs(firstVisibleItemView.getTop() - this.layoutManager.getPaddingTop()));
        Data data = this.data;
        data.setX(horizontal ? itemOffset : 0);
        if (horizontal) {
            itemOffset = 0;
        }
        data.setY(itemOffset);
        data.setWidth(this.layoutManager.getWidth());
        data.setHeight(this.layoutManager.getHeight());
        data.setContentWidth(getContentWidth());
        data.setContentHeight(getContentHeight());
        return data;
    }

    private final int getContentHeight() {
        return !this.layoutManager.getHorizontal() ? this.sections.getSectionsCumulativeSize() : this.layoutManager.getHeight();
    }

    private final int getContentWidth() {
        return this.layoutManager.getHorizontal() ? this.sections.getSectionsCumulativeSize() : this.layoutManager.getWidth();
    }

    public final Data compute() {
        View viewFindViewByPosition;
        int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || (viewFindViewByPosition = this.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            return null;
        }
        return computeScrollOffset(iFindFirstVisibleItemPosition, viewFindViewByPosition, this.layoutManager.getHorizontal());
    }
}
