package com.discord.reactevents;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\u0018\u00002\u00020\u0001BC\u0012:\u0010\u0002\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u00040\u0003\"\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0007J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0007J\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/reactevents/ReactEvents;", "", "events", "", "Lkotlin/Pair;", "", "Lkotlin/reflect/KClass;", "Lcom/discord/reactevents/ReactEvent;", "<init>", "([Lkotlin/Pair;)V", "eventRegistry", "Lcom/discord/reactevents/ReactEventRegistry;", "emitEvent", "", "view", "Landroid/view/View;", "event", "context", "Lcom/facebook/react/bridge/ReactContext;", "reactTag", "", "emitModuleEvent", "Landroid/content/Context;", "exportEventConstants", "", "react_events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactEvents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactEvents.kt\ncom/discord/reactevents/ReactEvents\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,62:1\n13472#2,2:63\n*S KotlinDebug\n*F\n+ 1 ReactEvents.kt\ncom/discord/reactevents/ReactEvents\n*L\n16#1:63,2\n*E\n"})
public final class ReactEvents {

    @NotNull
    private final ReactEventRegistry eventRegistry;

    public ReactEvents(@NotNull Pair<String, ? extends KClass>... events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.eventRegistry = new ReactEventRegistry();
        for (Pair<String, ? extends KClass> pair : events) {
            this.eventRegistry.registerEvent((String) pair.f14612d, (KClass) pair.f14613e);
        }
    }

    public final void emitEvent(@NotNull View view, @NotNull ReactEvent event) {
        ReactContext reactContext;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        Context context = view.getContext();
        if (context instanceof ReactContext) {
            reactContext = (ReactContext) context;
        } else {
            if (!(context instanceof ContextWrapper)) {
                throw new IllegalStateException((context + " not a " + ReactContext.class).toString());
            }
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNull(baseContext, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            reactContext = (ReactContext) baseContext;
        }
        emitEvent(reactContext, view, event);
    }

    public final void emitModuleEvent(@NotNull Context context, @NotNull ReactEvent event) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(event, "event");
        EventEmitterUtilsKt.emitReactNativeEvent(context, this.eventRegistry.getEventName(event), event.getData());
    }

    @NotNull
    public final Map<String, Object> exportEventConstants() {
        return this.eventRegistry.exportEventConstants();
    }

    public final void emitEvent(@NotNull ReactContext context, @NotNull View view, @NotNull ReactEvent event) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        emitEvent(context, view.getId(), event);
    }

    public final void emitEvent(@NotNull ReactContext context, int reactTag, @NotNull ReactEvent event) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher(context);
        if (eventDispatcher != null) {
            eventDispatcher.dispatchEvent(new DispatchedEvent(UIManagerHelper.getSurfaceId(context), reactTag, this.eventRegistry.getEventName(event), event));
        }
    }
}
