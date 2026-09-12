package com.discord.fastest_list.android;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig;
import com.discord.fastest_list.android.view_holder.FastestListViewHolder;
import com.discord.fastest_list.android.view_holder.FastestListViewHolderItem;
import com.discord.fastest_list.android.view_holder.FastestListViewHolderListFooter;
import com.discord.fastest_list.android.view_holder.FastestListViewHolderListHeader;
import com.discord.fastest_list.android.view_holder.FastestListViewHolderSectionFooter;
import com.discord.fastest_list.android.view_holder.FastestListViewHolderSectionHeader;
import com.discord.misc.utilities.ids.IdUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kk.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(¨\u0006*"}, d2 = {"Lcom/discord/fastest_list/android/FastestListViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/discord/fastest_list/android/view_holder/FastestListViewHolder;", "Lcom/discord/fastest_list/android/FastestListLayoutManager;", "layoutManager", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig;", "placeholderConfig", "Lcom/discord/fastest_list/android/FastestListSections;", "sections", "Lkotlin/Function2;", "Lcom/discord/fastest_list/android/FastestListSections$Entry;", "", "", "onUnexpectedItemSize", "<init>", "(Lcom/discord/fastest_list/android/FastestListLayoutManager;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig;Lcom/discord/fastest_list/android/FastestListSections;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/discord/fastest_list/android/view_holder/FastestListViewHolder;", "getItemCount", "()I", ViewProps.POSITION, "getItemViewType", "(I)I", "", "getItemId", "(I)J", "holder", "onBindViewHolder", "(Lcom/discord/fastest_list/android/view_holder/FastestListViewHolder;I)V", "onViewRecycled", "(Lcom/discord/fastest_list/android/view_holder/FastestListViewHolder;)V", "", "setPlaceholderConfig", "(Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig;)Z", "Lcom/discord/fastest_list/android/FastestListLayoutManager;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig;", "Lcom/discord/fastest_list/android/FastestListSections;", "Lkotlin/jvm/functions/Function2;", "DataChanged", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FastestListViewAdapter extends RecyclerView.Adapter {

    @NotNull
    private final FastestListLayoutManager layoutManager;

    @NotNull
    private final Function2<FastestListSections.Entry, Integer, Unit> onUnexpectedItemSize;

    @NotNull
    private FastestListPlaceholderConfig placeholderConfig;

    @NotNull
    private final FastestListSections sections;

    /* JADX WARN: Multi-variable type inference failed */
    public FastestListViewAdapter(@NotNull FastestListLayoutManager layoutManager, @NotNull FastestListPlaceholderConfig placeholderConfig, @NotNull FastestListSections sections, @NotNull Function2<? super FastestListSections.Entry, ? super Integer, Unit> onUnexpectedItemSize) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(placeholderConfig, "placeholderConfig");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(onUnexpectedItemSize, "onUnexpectedItemSize");
        this.layoutManager = layoutManager;
        this.placeholderConfig = placeholderConfig;
        this.sections = sections;
        this.onUnexpectedItemSize = onUnexpectedItemSize;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.sections.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return IdUtilsKt.convertToId(this.sections.getItem(position).getKey());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.sections.getItemViewType(position);
    }

    public final boolean setPlaceholderConfig(@NotNull FastestListPlaceholderConfig placeholderConfig) {
        Intrinsics.checkNotNullParameter(placeholderConfig, "placeholderConfig");
        if (Intrinsics.areEqual(this.placeholderConfig, placeholderConfig)) {
            return false;
        }
        this.placeholderConfig = placeholderConfig;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FastestListViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.onBindViewHolder(this.sections.getItem(position), this.layoutManager.getHorizontal(), this.placeholderConfig);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FastestListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            return new FastestListViewHolderItem(parent, this.onUnexpectedItemSize);
        }
        if (viewType == 1) {
            return new FastestListViewHolderSectionHeader(parent, this.onUnexpectedItemSize);
        }
        if (viewType == 2) {
            return new FastestListViewHolderSectionFooter(parent, this.onUnexpectedItemSize);
        }
        if (viewType == 3) {
            return new FastestListViewHolderListHeader(parent, this.onUnexpectedItemSize);
        }
        if (viewType == 4) {
            return new FastestListViewHolderListFooter(parent, this.onUnexpectedItemSize);
        }
        throw new IllegalArgumentException(b.h(viewType, "Unknown view type "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull FastestListViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled((RecyclerView.ViewHolder) holder);
        holder.onViewRecycled();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/discord/fastest_list/android/FastestListViewAdapter$DataChanged;", "", ViewProps.POSITION, "", "count", "<init>", "(II)V", "getPosition", "()I", "getCount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DataChanged {
        private final int count;
        private final int position;

        public DataChanged(int i7, int i10) {
            this.position = i7;
            this.count = i10;
        }

        public static /* synthetic */ DataChanged copy$default(DataChanged dataChanged, int i7, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i7 = dataChanged.position;
            }
            if ((i11 & 2) != 0) {
                i10 = dataChanged.count;
            }
            return dataChanged.copy(i7, i10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        @NotNull
        public final DataChanged copy(int position, int count) {
            return new DataChanged(position, count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataChanged)) {
                return false;
            }
            DataChanged dataChanged = (DataChanged) other;
            return this.position == dataChanged.position && this.count == dataChanged.count;
        }

        public final int getCount() {
            return this.count;
        }

        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Integer.hashCode(this.count) + (Integer.hashCode(this.position) * 31);
        }

        @NotNull
        public String toString() {
            return g.c(this.position, "DataChanged(position=", this.count, ", count=", ")");
        }

        public /* synthetic */ DataChanged(int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i7, (i11 & 2) != 0 ? 1 : i10);
        }
    }
}
