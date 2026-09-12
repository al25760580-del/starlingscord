package com.discord.blur;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BlurView f3990e;

    public /* synthetic */ a(BlurView blurView, int i7) {
        this.f3989d = i7;
        this.f3990e = blurView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3989d) {
            case 0:
                return BlurView.onDetachedFromWindow$lambda$3(this.f3990e);
            case 1:
                return BlurView.onAttachedToWindow$lambda$2(this.f3990e);
            case 2:
                return BlurView.blurTargetChangeListener$lambda$0(this.f3990e);
            default:
                return BlurView._init_$lambda$1(this.f3990e);
        }
    }
}
