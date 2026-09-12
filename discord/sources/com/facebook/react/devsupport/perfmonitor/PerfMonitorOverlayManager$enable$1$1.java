package com.facebook.react.devsupport.perfmonitor;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class PerfMonitorOverlayManager$enable$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public PerfMonitorOverlayManager$enable$1$1(Object obj) {
        super(0, obj, PerfMonitorOverlayManager.class, "handleRecordingButtonPress", "handleRecordingButtonPress()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1232invoke();
        return Unit.f14616a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m1232invoke() {
        ((PerfMonitorOverlayManager) this.receiver).handleRecordingButtonPress();
    }
}
