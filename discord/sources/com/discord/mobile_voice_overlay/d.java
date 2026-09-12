package com.discord.mobile_voice_overlay;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MobileVoiceOverlayModule f4507e;

    public /* synthetic */ d(MobileVoiceOverlayModule mobileVoiceOverlayModule, int i7) {
        this.f4506d = i7;
        this.f4507e = mobileVoiceOverlayModule;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4506d) {
            case 0:
                return MobileVoiceOverlayModule.mobileVoiceOverlay_delegate$lambda$2(this.f4507e);
            default:
                return MobileVoiceOverlayModule.mobileVoiceOverlay_delegate$lambda$2$lambda$0(this.f4507e);
        }
    }
}
