package com.discord.reactevents;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.d;
import org.jetbrains.annotations.NotNull;
import rr.b;
import sr.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"Lcom/discord/reactevents/ReactEvent;", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "react_events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReactEvent {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static WritableMap serialize(@NotNull ReactEvent reactEvent) {
            Class<?> type = reactEvent.getClass();
            a aVar = a.f20556b;
            Intrinsics.checkNotNullParameter(type, "type");
            return NativeMapExtensionsKt.toNativeMap(aVar.a(d.E(b.f19552a, type), reactEvent));
        }
    }

    @NotNull
    WritableMap serialize();
}
