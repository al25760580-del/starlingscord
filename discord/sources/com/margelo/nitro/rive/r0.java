package com.margelo.nitro.rive;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HybridRiveView f6974e;

    public /* synthetic */ r0(HybridRiveView hybridRiveView, int i7) {
        this.f6973d = i7;
        this.f6974e = hybridRiveView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6973d) {
            case 0:
                return HybridRiveView.removeEventListeners$lambda$10(this.f6974e);
            case 1:
                return HybridRiveView.pause$lambda$7(this.f6974e);
            case 2:
                return HybridRiveView.play$lambda$6(this.f6974e);
            case 3:
                return HybridRiveView.afterUpdate$lambda$11(this.f6974e);
            default:
                return HybridRiveView.reset$lambda$8(this.f6974e);
        }
    }
}
