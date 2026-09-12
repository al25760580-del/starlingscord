package com.discord.fastest_list.android.placeholder;

import com.discord.fastest_list.android.FastestListSections;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000  2\u00020\u0001:\u0001 BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÂ\u0003JY\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig;", "", "listFooter", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;", "listHeader", "sectionFooter", "sectionHeader", "sectionItem", "sectionItemAtFront", "sectionItemAtRear", "sectionItemSingleton", "<init>", "(Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;)V", "getForEntry", "entry", "Lcom/discord/fastest_list/android/FastestListSections$Entry;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FastestListPlaceholderConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final FastestListPlaceholderType listFooter;

    @NotNull
    private final FastestListPlaceholderType listHeader;

    @NotNull
    private final FastestListPlaceholderType sectionFooter;

    @NotNull
    private final FastestListPlaceholderType sectionHeader;

    @NotNull
    private final FastestListPlaceholderType sectionItem;

    @NotNull
    private final FastestListPlaceholderType sectionItemAtFront;

    @NotNull
    private final FastestListPlaceholderType sectionItemAtRear;

    @NotNull
    private final FastestListPlaceholderType sectionItemSingleton;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig$Companion;", "", "<init>", "()V", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FastestListPlaceholderConfig(@NotNull FastestListPlaceholderType listFooter, @NotNull FastestListPlaceholderType listHeader, @NotNull FastestListPlaceholderType sectionFooter, @NotNull FastestListPlaceholderType sectionHeader, @NotNull FastestListPlaceholderType sectionItem, @NotNull FastestListPlaceholderType sectionItemAtFront, @NotNull FastestListPlaceholderType sectionItemAtRear, @NotNull FastestListPlaceholderType sectionItemSingleton) {
        Intrinsics.checkNotNullParameter(listFooter, "listFooter");
        Intrinsics.checkNotNullParameter(listHeader, "listHeader");
        Intrinsics.checkNotNullParameter(sectionFooter, "sectionFooter");
        Intrinsics.checkNotNullParameter(sectionHeader, "sectionHeader");
        Intrinsics.checkNotNullParameter(sectionItem, "sectionItem");
        Intrinsics.checkNotNullParameter(sectionItemAtFront, "sectionItemAtFront");
        Intrinsics.checkNotNullParameter(sectionItemAtRear, "sectionItemAtRear");
        Intrinsics.checkNotNullParameter(sectionItemSingleton, "sectionItemSingleton");
        this.listFooter = listFooter;
        this.listHeader = listHeader;
        this.sectionFooter = sectionFooter;
        this.sectionHeader = sectionHeader;
        this.sectionItem = sectionItem;
        this.sectionItemAtFront = sectionItemAtFront;
        this.sectionItemAtRear = sectionItemAtRear;
        this.sectionItemSingleton = sectionItemSingleton;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final FastestListPlaceholderType getListFooter() {
        return this.listFooter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final FastestListPlaceholderType getListHeader() {
        return this.listHeader;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final FastestListPlaceholderType getSectionFooter() {
        return this.sectionFooter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final FastestListPlaceholderType getSectionHeader() {
        return this.sectionHeader;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final FastestListPlaceholderType getSectionItem() {
        return this.sectionItem;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final FastestListPlaceholderType getSectionItemAtFront() {
        return this.sectionItemAtFront;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final FastestListPlaceholderType getSectionItemAtRear() {
        return this.sectionItemAtRear;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    private final FastestListPlaceholderType getSectionItemSingleton() {
        return this.sectionItemSingleton;
    }

    public static /* synthetic */ FastestListPlaceholderConfig copy$default(FastestListPlaceholderConfig fastestListPlaceholderConfig, FastestListPlaceholderType fastestListPlaceholderType, FastestListPlaceholderType fastestListPlaceholderType2, FastestListPlaceholderType fastestListPlaceholderType3, FastestListPlaceholderType fastestListPlaceholderType4, FastestListPlaceholderType fastestListPlaceholderType5, FastestListPlaceholderType fastestListPlaceholderType6, FastestListPlaceholderType fastestListPlaceholderType7, FastestListPlaceholderType fastestListPlaceholderType8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            fastestListPlaceholderType = fastestListPlaceholderConfig.listFooter;
        }
        if ((i7 & 2) != 0) {
            fastestListPlaceholderType2 = fastestListPlaceholderConfig.listHeader;
        }
        if ((i7 & 4) != 0) {
            fastestListPlaceholderType3 = fastestListPlaceholderConfig.sectionFooter;
        }
        if ((i7 & 8) != 0) {
            fastestListPlaceholderType4 = fastestListPlaceholderConfig.sectionHeader;
        }
        if ((i7 & 16) != 0) {
            fastestListPlaceholderType5 = fastestListPlaceholderConfig.sectionItem;
        }
        if ((i7 & 32) != 0) {
            fastestListPlaceholderType6 = fastestListPlaceholderConfig.sectionItemAtFront;
        }
        if ((i7 & 64) != 0) {
            fastestListPlaceholderType7 = fastestListPlaceholderConfig.sectionItemAtRear;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            fastestListPlaceholderType8 = fastestListPlaceholderConfig.sectionItemSingleton;
        }
        FastestListPlaceholderType fastestListPlaceholderType9 = fastestListPlaceholderType7;
        FastestListPlaceholderType fastestListPlaceholderType10 = fastestListPlaceholderType8;
        FastestListPlaceholderType fastestListPlaceholderType11 = fastestListPlaceholderType5;
        FastestListPlaceholderType fastestListPlaceholderType12 = fastestListPlaceholderType6;
        return fastestListPlaceholderConfig.copy(fastestListPlaceholderType, fastestListPlaceholderType2, fastestListPlaceholderType3, fastestListPlaceholderType4, fastestListPlaceholderType11, fastestListPlaceholderType12, fastestListPlaceholderType9, fastestListPlaceholderType10);
    }

    @NotNull
    public final FastestListPlaceholderConfig copy(@NotNull FastestListPlaceholderType listFooter, @NotNull FastestListPlaceholderType listHeader, @NotNull FastestListPlaceholderType sectionFooter, @NotNull FastestListPlaceholderType sectionHeader, @NotNull FastestListPlaceholderType sectionItem, @NotNull FastestListPlaceholderType sectionItemAtFront, @NotNull FastestListPlaceholderType sectionItemAtRear, @NotNull FastestListPlaceholderType sectionItemSingleton) {
        Intrinsics.checkNotNullParameter(listFooter, "listFooter");
        Intrinsics.checkNotNullParameter(listHeader, "listHeader");
        Intrinsics.checkNotNullParameter(sectionFooter, "sectionFooter");
        Intrinsics.checkNotNullParameter(sectionHeader, "sectionHeader");
        Intrinsics.checkNotNullParameter(sectionItem, "sectionItem");
        Intrinsics.checkNotNullParameter(sectionItemAtFront, "sectionItemAtFront");
        Intrinsics.checkNotNullParameter(sectionItemAtRear, "sectionItemAtRear");
        Intrinsics.checkNotNullParameter(sectionItemSingleton, "sectionItemSingleton");
        return new FastestListPlaceholderConfig(listFooter, listHeader, sectionFooter, sectionHeader, sectionItem, sectionItemAtFront, sectionItemAtRear, sectionItemSingleton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastestListPlaceholderConfig)) {
            return false;
        }
        FastestListPlaceholderConfig fastestListPlaceholderConfig = (FastestListPlaceholderConfig) other;
        return Intrinsics.areEqual(this.listFooter, fastestListPlaceholderConfig.listFooter) && Intrinsics.areEqual(this.listHeader, fastestListPlaceholderConfig.listHeader) && Intrinsics.areEqual(this.sectionFooter, fastestListPlaceholderConfig.sectionFooter) && Intrinsics.areEqual(this.sectionHeader, fastestListPlaceholderConfig.sectionHeader) && Intrinsics.areEqual(this.sectionItem, fastestListPlaceholderConfig.sectionItem) && Intrinsics.areEqual(this.sectionItemAtFront, fastestListPlaceholderConfig.sectionItemAtFront) && Intrinsics.areEqual(this.sectionItemAtRear, fastestListPlaceholderConfig.sectionItemAtRear) && Intrinsics.areEqual(this.sectionItemSingleton, fastestListPlaceholderConfig.sectionItemSingleton);
    }

    @NotNull
    public final FastestListPlaceholderType getForEntry(@NotNull FastestListSections.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!(entry instanceof FastestListSections.Entry.SectionItem)) {
            if (entry instanceof FastestListSections.Entry.ListFooter) {
                return this.listFooter;
            }
            if (entry instanceof FastestListSections.Entry.ListHeader) {
                return this.listHeader;
            }
            if (entry instanceof FastestListSections.Entry.SectionFooter) {
                return this.sectionFooter;
            }
            if (entry instanceof FastestListSections.Entry.SectionHeader) {
                return this.sectionHeader;
            }
            throw new n();
        }
        FastestListSections.Entry.SectionItem sectionItem = (FastestListSections.Entry.SectionItem) entry;
        if (sectionItem.getAtFront() && sectionItem.getAtRear()) {
            FastestListPlaceholderType fastestListPlaceholderType = this.sectionItemSingleton;
            return fastestListPlaceholderType instanceof FastestListPlaceholderType.None ? this.sectionItem : fastestListPlaceholderType;
        }
        if (sectionItem.getAtFront()) {
            FastestListPlaceholderType fastestListPlaceholderType2 = this.sectionItemAtFront;
            return fastestListPlaceholderType2 instanceof FastestListPlaceholderType.None ? this.sectionItem : fastestListPlaceholderType2;
        }
        if (!sectionItem.getAtRear()) {
            return this.sectionItem;
        }
        FastestListPlaceholderType fastestListPlaceholderType3 = this.sectionItemAtRear;
        return fastestListPlaceholderType3 instanceof FastestListPlaceholderType.None ? this.sectionItem : fastestListPlaceholderType3;
    }

    public int hashCode() {
        return this.sectionItemSingleton.hashCode() + ((this.sectionItemAtRear.hashCode() + ((this.sectionItemAtFront.hashCode() + ((this.sectionItem.hashCode() + ((this.sectionHeader.hashCode() + ((this.sectionFooter.hashCode() + ((this.listHeader.hashCode() + (this.listFooter.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FastestListPlaceholderConfig(listFooter=" + this.listFooter + ", listHeader=" + this.listHeader + ", sectionFooter=" + this.sectionFooter + ", sectionHeader=" + this.sectionHeader + ", sectionItem=" + this.sectionItem + ", sectionItemAtFront=" + this.sectionItemAtFront + ", sectionItemAtRear=" + this.sectionItemAtRear + ", sectionItemSingleton=" + this.sectionItemSingleton + ")";
    }
}
