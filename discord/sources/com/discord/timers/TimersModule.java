package com.discord.timers;

import com.discord.codegen.NativeTimersModuleSpec;
import com.discord.reactevents.ReactEvents;
import com.discord.timers.reactevents.IntervalEvent;
import com.discord.timers.reactevents.TimerEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/discord/timers/TimersModule;", "Lcom/discord/codegen/NativeTimersModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "timersManager", "Lcom/discord/timers/TimersManager;", "setTimeout", "", StackTraceHelper.ID_KEY, "", "timeout", "clearTimeout", "setInterval", "clearInterval", "addListener", "type", "", "removeListeners", "count", "react_timers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimersModule extends NativeTimersModuleSpec {

    @NotNull
    private final ReactEvents reactEvents;

    @NotNull
    private final TimersManager timersManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimersModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactEvents = new ReactEvents(new Pair("timer", Reflection.getOrCreateKotlinClass(TimerEvent.class)), new Pair("interval", Reflection.getOrCreateKotlinClass(IntervalEvent.class)));
        this.timersManager = new TimersManager(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setInterval$lambda$1(TimersModule timersModule, double d6) {
        ReactEvents reactEvents = timersModule.reactEvents;
        ReactApplicationContext reactApplicationContext = timersModule.getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        reactEvents.emitModuleEvent(reactApplicationContext, new IntervalEvent((int) d6));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTimeout$lambda$0(TimersModule timersModule, double d6) {
        ReactEvents reactEvents = timersModule.reactEvents;
        ReactApplicationContext reactApplicationContext = timersModule.getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        reactEvents.emitModuleEvent(reactApplicationContext, new TimerEvent((int) d6));
        return Unit.f14616a;
    }

    @Override // com.discord.codegen.NativeTimersModuleSpec
    public void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // com.discord.codegen.NativeTimersModuleSpec
    public void clearInterval(double id2) {
        this.timersManager.clearInterval((int) id2);
    }

    @Override // com.discord.codegen.NativeTimersModuleSpec
    public void clearTimeout(double id2) {
        this.timersManager.clearTimeout((int) id2);
    }

    @Override // com.discord.codegen.NativeTimersModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.discord.codegen.NativeTimersModuleSpec
    public void setInterval(double id2, double timeout) {
        this.timersManager.setInterval((int) id2, timeout, new a(this, id2, 0));
    }

    @Override // com.discord.codegen.NativeTimersModuleSpec
    public void setTimeout(double id2, double timeout) {
        this.timersManager.setTimeout((int) id2, timeout, new a(this, id2, 1));
    }
}
