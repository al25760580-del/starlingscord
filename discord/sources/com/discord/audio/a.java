package com.discord.audio;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AndroidAudioDevice f3960e;

    public /* synthetic */ a(AndroidAudioDevice androidAudioDevice, int i7) {
        this.f3959d = i7;
        this.f3960e = androidAudioDevice;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3959d) {
            case 0:
                return DiscordAudioManager.emitEffectiveDevice$lambda$3(this.f3960e, (DiscordAudioManagerListener) obj);
            default:
                return DiscordAudioManager2.emitEffectiveDevice$lambda$7(this.f3960e, (DiscordAudioManagerListener) obj);
        }
    }
}
