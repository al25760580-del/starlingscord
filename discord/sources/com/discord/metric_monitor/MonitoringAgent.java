package com.discord.metric_monitor;

import com.discord.logging.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/discord/metric_monitor/MonitoringAgent;", "", "<init>", "()V", "metricLogger", "Lkotlin/Function1;", "Lcom/discord/metric_monitor/MetricEvent;", "", "getMetricLogger$metric_monitor_release", "()Lkotlin/jvm/functions/Function1;", "setMetricLogger$metric_monitor_release", "(Lkotlin/jvm/functions/Function1;)V", "increment", "metric", "metric_monitor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MonitoringAgent {

    @NotNull
    public static final MonitoringAgent INSTANCE = new MonitoringAgent();
    private static Function1<? super MetricEvent, Unit> metricLogger;

    private MonitoringAgent() {
    }

    public final Function1<MetricEvent, Unit> getMetricLogger$metric_monitor_release() {
        return metricLogger;
    }

    public final void increment(@NotNull MetricEvent metric) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        Function1<? super MetricEvent, Unit> function1 = metricLogger;
        if (function1 == null) {
            Log.w$default(Log.INSTANCE, "Metric Monitor", "Attempting to increment metric before logger initialized", (Throwable) null, 4, (Object) null);
        } else if (function1 != null) {
            function1.invoke(metric);
        }
    }

    public final void setMetricLogger$metric_monitor_release(Function1<? super MetricEvent, Unit> function1) {
        metricLogger = function1;
    }
}
