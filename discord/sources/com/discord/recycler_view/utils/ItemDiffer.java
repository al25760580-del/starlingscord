package com.discord.recycler_view.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/discord/recycler_view/utils/ItemDiffer;", "Landroidx/recyclerview/widget/c;", "", "Lcom/discord/recycler_view/utils/ItemDiffableType;", "oldItems", "newItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "getOldListSize", "()I", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "getChangePayload", "(II)Ljava/lang/Boolean;", "Ljava/util/List;", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ItemDiffer extends androidx.recyclerview.widget.c {

    @NotNull
    private final List<ItemDiffableType> newItems;

    @NotNull
    private final List<ItemDiffableType> oldItems;

    /* JADX WARN: Multi-variable type inference failed */
    public ItemDiffer(@NotNull List<? extends ItemDiffableType> oldItems, @NotNull List<? extends ItemDiffableType> newItems) {
        Intrinsics.checkNotNullParameter(oldItems, "oldItems");
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.oldItems = oldItems;
        this.newItems = newItems;
    }

    @Override // androidx.recyclerview.widget.c
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return Intrinsics.areEqual(this.oldItems.get(oldItemPosition), this.newItems.get(newItemPosition));
    }

    @Override // androidx.recyclerview.widget.c
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return Intrinsics.areEqual(this.oldItems.get(oldItemPosition).getItemId(), this.newItems.get(newItemPosition).getItemId());
    }

    @Override // androidx.recyclerview.widget.c
    public int getNewListSize() {
        return this.newItems.size();
    }

    @Override // androidx.recyclerview.widget.c
    public int getOldListSize() {
        return this.oldItems.size();
    }

    @Override // androidx.recyclerview.widget.c
    @NotNull
    public Boolean getChangePayload(int oldItemPosition, int newItemPosition) {
        return Boolean.FALSE;
    }
}
