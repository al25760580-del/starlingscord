package com.discord.fastest_list.react_events;

import com.discord.fastest_list.android.FastestListSections;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/fastest_list/react_events/OnUnexpectedItemSizeEvent;", "Lcom/discord/reactevents/ReactEvent;", "entry", "Lcom/discord/fastest_list/android/FastestListSections$Entry;", "size", "", "<init>", "(Lcom/discord/fastest_list/android/FastestListSections$Entry;I)V", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnUnexpectedItemSizeEvent implements ReactEvent {

    @NotNull
    private final FastestListSections.Entry entry;
    private final int size;

    public OnUnexpectedItemSizeEvent(@NotNull FastestListSections.Entry entry, int i7) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.entry = entry;
        this.size = i7;
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        Pair pair = new Pair("section", Integer.valueOf(this.entry.mo946getSectionsZRFyWU()));
        FastestListSections.Entry entry = this.entry;
        return NativeMapExtensionsKt.nativeMapOf(pair, new Pair("item", Integer.valueOf(entry instanceof FastestListSections.Entry.SectionItem ? ((FastestListSections.Entry.SectionItem) entry).m963getItemJXkbwXs() : 0)), new Pair("isSectionHeader", Boolean.valueOf(this.entry instanceof FastestListSections.Entry.SectionHeader)), new Pair("isSectionFooter", Boolean.valueOf(this.entry instanceof FastestListSections.Entry.SectionFooter)), new Pair("size", Float.valueOf(SizeUtilsKt.getPxToDp(this.size))), new Pair("sizeExpected", Float.valueOf(SizeUtilsKt.getPxToDp(this.entry.getSize()))));
    }
}
