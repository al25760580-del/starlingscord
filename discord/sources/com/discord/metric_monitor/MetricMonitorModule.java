package com.discord.metric_monitor;

import b7.a;
import com.discord.codegen.NativeMetricMonitorModuleSpec;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/metric_monitor/MetricMonitorModule;", "Lcom/discord/codegen/NativeMetricMonitorModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "addListener", "", "eventType", "", "removeListeners", "count", "", "Companion", "metric_monitor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MetricMonitorModule extends NativeMetricMonitorModuleSpec {

    @NotNull
    private static final String LOG_METRIC = "logMetric";

    @NotNull
    private final ReactEvents reactEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricMonitorModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactEvents = new ReactEvents(new Pair(LOG_METRIC, Reflection.getOrCreateKotlinClass(MetricEvent.class)));
        MonitoringAgent.INSTANCE.setMetricLogger$metric_monitor_release(new a(0, this, reactContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(MetricMonitorModule metricMonitorModule, ReactApplicationContext reactApplicationContext, MetricEvent metric) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        metricMonitorModule.reactEvents.emitModuleEvent(reactApplicationContext, metric);
        return Unit.f14616a;
    }

    @Override // com.discord.codegen.NativeMetricMonitorModuleSpec
    public void addListener(@NotNull String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
    }

    @Override // com.discord.codegen.NativeMetricMonitorModuleSpec
    public void removeListeners(double count) {
    }
}
