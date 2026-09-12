package com.discord.reactevents;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/reactevents/DispatchedEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", StackTraceHelper.NAME_KEY, "", "payload", "Lcom/discord/reactevents/ReactEvent;", "<init>", "(IILjava/lang/String;Lcom/discord/reactevents/ReactEvent;)V", "getEventName", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "react_events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DispatchedEvent extends Event<DispatchedEvent> {

    @NotNull
    private final String name;

    @NotNull
    private final ReactEvent payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DispatchedEvent(int i7, int i10, @NotNull String name, @NotNull ReactEvent payload) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.name = name;
        this.payload = payload;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public WritableMap getEventData() {
        return this.payload.serialize();
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    /* JADX INFO: renamed from: getEventName, reason: from getter */
    public String getName() {
        return this.name;
    }
}
