package com.discord.blur;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BlurViewHardwareAccelerated f3992e;

    public /* synthetic */ b(BlurViewHardwareAccelerated blurViewHardwareAccelerated, int i7) {
        this.f3991d = i7;
        this.f3992e = blurViewHardwareAccelerated;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3991d) {
            case 0:
                return BlurViewHardwareAccelerated.blurTargetChangeListener$lambda$0(this.f3992e);
            case 1:
                return BlurViewHardwareAccelerated._init_$lambda$1(this.f3992e);
            case 2:
                return BlurViewHardwareAccelerated.onDetachedFromWindow$lambda$3(this.f3992e);
            default:
                return BlurViewHardwareAccelerated.onAttachedToWindow$lambda$2(this.f3992e);
        }
    }
}
