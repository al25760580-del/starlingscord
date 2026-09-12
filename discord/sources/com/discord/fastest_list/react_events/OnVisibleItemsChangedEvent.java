package com.discord.fastest_list.react_events;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/fastest_list/react_events/OnVisibleItemsChangedEvent;", "Lcom/discord/reactevents/ReactEvent;", "data", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "(Lcom/facebook/react/bridge/WritableMap;)V", "sectionsId", "", "sectionStart", "", "sectionEnd", "itemStart", "itemEnd", "(Ljava/lang/String;IIII)V", "serialize", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnVisibleItemsChangedEvent implements ReactEvent {

    @NotNull
    private final WritableMap data;

    private OnVisibleItemsChangedEvent(WritableMap writableMap) {
        this.data = writableMap;
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize, reason: from getter */
    public WritableMap getData() {
        return this.data;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnVisibleItemsChangedEvent(@NotNull String sectionsId, int i7, int i10, int i11, int i12) {
        this(NativeMapExtensionsKt.nativeMapOf(new Pair("sectionsId", sectionsId), new Pair("sectionStart", Integer.valueOf(i7)), new Pair("sectionEnd", Integer.valueOf(i10)), new Pair("itemStart", Integer.valueOf(i11)), new Pair("itemEnd", Integer.valueOf(i12))));
        Intrinsics.checkNotNullParameter(sectionsId, "sectionsId");
    }
}
