package com.discord.fastest_list.android;

import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001:\u0001(BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R8\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010'\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker;", "", "Lcom/discord/fastest_list/android/FastestListLayoutManager;", "layoutManager", "Lcom/discord/fastest_list/android/FastestListSections;", "sections", "Lkotlin/Function5;", "", "", "", "onVisibleItemsChanged", "<init>", "(Lcom/discord/fastest_list/android/FastestListLayoutManager;Lcom/discord/fastest_list/android/FastestListSections;Lkotlin/jvm/functions/Function5;)V", "itemEndPosition", "itemStartPosition", "computeVisibleItems", "(II)V", "", "isUnchanged", "(II)Z", "updateVisibleItemPositions", "()V", "Lcom/discord/fastest_list/android/FastestListLayoutManager;", "Lcom/discord/fastest_list/android/FastestListSections;", "Lkotlin/jvm/functions/Function5;", "positionStartPrev", "I", "positionEndPrev", "positionStartPrevRaw", "positionEndPrevRaw", "sectionsId", "Ljava/lang/String;", "getLastItemPosition", "()I", "lastItemPosition", "getItemBuffer", "itemBuffer", "getScrollingForward", "()Z", "scrollingForward", "RenderAhead", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FastestListVisibleItemsTracker {

    @NotNull
    private final FastestListLayoutManager layoutManager;

    @NotNull
    private final Function5 onVisibleItemsChanged;
    private int positionEndPrev;
    private int positionEndPrevRaw;
    private int positionStartPrev;
    private int positionStartPrevRaw;

    @NotNull
    private final FastestListSections sections;

    @NotNull
    private String sectionsId;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker$RenderAhead;", "", "extraLayoutPercent", "", "<init>", "(Ljava/lang/String;IF)V", "getExtraLayoutPercent", "()F", "NOMINAL", "HALF", "FULL", "Companion", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum RenderAhead {
        NOMINAL(1.0f),
        HALF(2.0f),
        FULL(3.0f);

        private final float extraLayoutPercent;
        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker$RenderAhead$Companion;", "", "<init>", "()V", "create", "Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker$RenderAhead;", "value", "", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final RenderAhead create(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int iHashCode = value.hashCode();
                if (iHashCode != 3154575) {
                    if (iHashCode != 3194931) {
                        if (iHashCode == 2122893532 && value.equals("nominal")) {
                            return RenderAhead.NOMINAL;
                        }
                    } else if (value.equals("half")) {
                        return RenderAhead.HALF;
                    }
                } else if (value.equals("full")) {
                    return RenderAhead.FULL;
                }
                throw new IllegalArgumentException("Unknown item type: ".concat(value));
            }

            private Companion() {
            }
        }

        RenderAhead(float f2) {
            this.extraLayoutPercent = f2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public final float getExtraLayoutPercent() {
            return this.extraLayoutPercent;
        }
    }

    public FastestListVisibleItemsTracker(@NotNull FastestListLayoutManager layoutManager, @NotNull FastestListSections sections, @NotNull Function5 onVisibleItemsChanged) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(onVisibleItemsChanged, "onVisibleItemsChanged");
        this.layoutManager = layoutManager;
        this.sections = sections;
        this.onVisibleItemsChanged = onVisibleItemsChanged;
        this.positionStartPrev = -1;
        this.positionEndPrev = -1;
        this.positionStartPrevRaw = -1;
        this.positionEndPrevRaw = -1;
        this.sectionsId = "";
    }

    private final void computeVisibleItems(int itemEndPosition, int itemStartPosition) {
        this.sectionsId = this.sections.getSectionsId();
        this.positionStartPrev = itemStartPosition;
        this.positionEndPrev = itemEndPosition;
        FastestListSections.Entry.SectionItem itemAtPosition = this.sections.getItemAtPosition(itemStartPosition, false);
        FastestListSections.Entry.SectionItem itemAtPosition2 = this.sections.getItemAtPosition(itemEndPosition, true);
        this.onVisibleItemsChanged.invoke(this.sectionsId, Integer.valueOf(itemAtPosition.mo946getSectionsZRFyWU()), Integer.valueOf(itemAtPosition2.mo946getSectionsZRFyWU()), Integer.valueOf(itemAtPosition.m963getItemJXkbwXs()), Integer.valueOf(itemAtPosition2.m963getItemJXkbwXs()));
    }

    private final int getItemBuffer() {
        return (int) Math.ceil(this.layoutManager.getExtraLayoutSpace() / this.sections.getItemSizeAverage());
    }

    private final int getLastItemPosition() {
        return this.layoutManager.getItemCount() - 1;
    }

    private final boolean getScrollingForward() {
        return this.layoutManager.getScrollingForward();
    }

    private final boolean isUnchanged(int itemEndPosition, int itemStartPosition) {
        return Intrinsics.areEqual(this.sectionsId, this.sections.getSectionsId()) && itemEndPosition == this.positionEndPrev && itemStartPosition == this.positionStartPrev;
    }

    public final void updateVisibleItemPositions() {
        int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition == -1) {
            return;
        }
        if (this.positionEndPrevRaw == iFindLastVisibleItemPosition && this.positionStartPrevRaw == iFindFirstVisibleItemPosition && Intrinsics.areEqual(this.sectionsId, this.sections.getSectionsId())) {
            return;
        }
        this.positionEndPrevRaw = iFindLastVisibleItemPosition;
        this.positionStartPrevRaw = iFindFirstVisibleItemPosition;
        if (getLastItemPosition() < 0) {
            if (isUnchanged(iFindLastVisibleItemPosition, iFindFirstVisibleItemPosition)) {
                return;
            }
            computeVisibleItems(iFindLastVisibleItemPosition, iFindFirstVisibleItemPosition);
            return;
        }
        if (getScrollingForward()) {
            iFindLastVisibleItemPosition = Math.min(getLastItemPosition(), iFindLastVisibleItemPosition + getItemBuffer());
        } else {
            iFindFirstVisibleItemPosition = Math.max(0, iFindFirstVisibleItemPosition - getItemBuffer());
        }
        if (isUnchanged(iFindLastVisibleItemPosition, iFindFirstVisibleItemPosition)) {
            return;
        }
        int i7 = this.positionEndPrev - this.positionStartPrev;
        int i10 = i7 - (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition);
        if (i10 > 0) {
            iFindLastVisibleItemPosition = Math.min(getLastItemPosition(), iFindLastVisibleItemPosition + i10);
            int i11 = i7 - (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition);
            if (i11 > 0) {
                iFindFirstVisibleItemPosition = Math.max(0, iFindFirstVisibleItemPosition - i11);
            }
            if (isUnchanged(iFindLastVisibleItemPosition, iFindFirstVisibleItemPosition)) {
                return;
            }
        }
        computeVisibleItems(iFindLastVisibleItemPosition, iFindFirstVisibleItemPosition);
    }
}
