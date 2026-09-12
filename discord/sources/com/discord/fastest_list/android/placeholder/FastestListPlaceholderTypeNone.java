package com.discord.fastest_list.android.placeholder;

import android.view.ViewGroup;
import com.discord.fastest_list.android.FastestListSections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001¨\u0006\u0013"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeNone;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholder;", "<init>", "()V", "onPlaceholderShouldBind", "", "view", "Landroid/view/ViewGroup;", "item", "Lcom/discord/fastest_list/android/FastestListSections$Entry;", "onPlaceholderShouldUnbind", "equals", "", "other", "", "hashCode", "", "toString", "", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FastestListPlaceholderTypeNone extends FastestListPlaceholder {

    @NotNull
    public static final FastestListPlaceholderTypeNone INSTANCE = new FastestListPlaceholderTypeNone();

    private FastestListPlaceholderTypeNone() {
        super(null);
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof FastestListPlaceholderTypeNone);
    }

    public int hashCode() {
        return 179003907;
    }

    @Override // com.discord.fastest_list.android.placeholder.FastestListPlaceholder
    public void onPlaceholderShouldBind(@NotNull ViewGroup view, @NotNull FastestListSections.Entry item) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // com.discord.fastest_list.android.placeholder.FastestListPlaceholder
    public void onPlaceholderShouldUnbind(@NotNull ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @NotNull
    public String toString() {
        return "FastestListPlaceholderTypeNone";
    }
}
