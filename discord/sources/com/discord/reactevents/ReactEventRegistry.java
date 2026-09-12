package com.discord.reactevents;

import com.facebook.react.uimanager.ViewProps;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0007J\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0005J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002R\"\u0010\u0004\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/discord/reactevents/ReactEventRegistry;", "", "<init>", "()V", "events", "", "Lkotlin/reflect/KClass;", "Lcom/discord/reactevents/ReactEvent;", "", "value", "", "didExportEvents", "getDidExportEvents", "()Z", "registerEvent", "", "eventName", "eventClass", "getEventName", "event", "exportEventConstants", "prefixWithTop", "input", "react_events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactEventRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactEventRegistry.kt\ncom/discord/reactevents/ReactEventRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1252#2,4:40\n*S KotlinDebug\n*F\n+ 1 ReactEventRegistry.kt\ncom/discord/reactevents/ReactEventRegistry\n*L\n27#1:40,4\n*E\n"})
public final class ReactEventRegistry {
    private boolean didExportEvents;

    @NotNull
    private final Map<KClass, String> events = new LinkedHashMap();

    private final String prefixWithTop(String input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(ViewProps.ON, "oldValue");
        Intrinsics.checkNotNullParameter(ViewProps.TOP, "newValue");
        int iJ = StringsKt.J(input, ViewProps.ON, 0, false, 2);
        return iJ < 0 ? input : StringsKt.Q(input, iJ, 2 + iJ, ViewProps.TOP).toString();
    }

    @NotNull
    public final Map<String, Object> exportEventConstants() {
        this.didExportEvents = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : this.events.values()) {
            linkedHashMap.put(prefixWithTop(str), w0.h(new Pair("registrationName", str)));
        }
        return linkedHashMap;
    }

    public final boolean getDidExportEvents() {
        return this.didExportEvents;
    }

    @NotNull
    public final String getEventName(@NotNull ReactEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = this.events.get(Reflection.getOrCreateKotlinClass(event.getClass()));
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(("No event name registered for event: " + Reflection.getOrCreateKotlinClass(event.getClass())).toString());
    }

    public final void registerEvent(@NotNull String eventName, @NotNull KClass eventClass) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        if (!this.events.containsKey(eventClass)) {
            this.events.put(eventClass, eventName);
            return;
        }
        throw new IllegalStateException("event " + ((Object) this.events.get(eventClass)) + " already registered for" + eventClass + ". using the same class for multiple events is not supported.");
    }
}
