package com.discord.fastest_list.android.view_holder;

import android.view.ViewGroup;
import com.discord.fastest_list.android.FastestListSections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/discord/fastest_list/android/view_holder/FastestListViewHolderSectionFooter;", "Lcom/discord/fastest_list/android/view_holder/FastestListViewHolder;", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function2;", "Lcom/discord/fastest_list/android/FastestListSections$Entry;", "", "", "onUnexpectedItemSize", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;)V", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FastestListViewHolderSectionFooter extends FastestListViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastestListViewHolderSectionFooter(@NotNull ViewGroup parent, @NotNull Function2<? super FastestListSections.Entry, ? super Integer, Unit> onUnexpectedItemSize) {
        super(parent, onUnexpectedItemSize, null);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(onUnexpectedItemSize, "onUnexpectedItemSize");
    }
}
