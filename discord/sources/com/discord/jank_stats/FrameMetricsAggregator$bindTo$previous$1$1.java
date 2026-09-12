package com.discord.jank_stats;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class FrameMetricsAggregator$bindTo$previous$1$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public FrameMetricsAggregator$bindTo$previous$1$1(Object obj) {
        super(1, obj, FrameMetricsAggregator.class, "recordFrame", "recordFrame(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f14616a;
    }

    public final void invoke(boolean z5) {
        ((FrameMetricsAggregator) this.receiver).recordFrame(z5);
    }
}
