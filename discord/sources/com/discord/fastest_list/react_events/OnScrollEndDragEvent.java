package com.discord.fastest_list.react_events;

import com.discord.fastest_list.android.scroll.FastestListScrollOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/fastest_list/react_events/OnScrollEndDragEvent;", "Lcom/discord/fastest_list/react_events/OnScrollEvent;", "data", "Lcom/discord/fastest_list/android/scroll/FastestListScrollOffset$Data;", "<init>", "(Lcom/discord/fastest_list/android/scroll/FastestListScrollOffset$Data;)V", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnScrollEndDragEvent extends OnScrollEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnScrollEndDragEvent(@NotNull FastestListScrollOffset.Data data) {
        super(data);
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
