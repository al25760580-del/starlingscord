package com.discord.audio;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DiscordAudioManager f3962e;

    public /* synthetic */ b(DiscordAudioManager discordAudioManager, int i7) {
        this.f3961d = i7;
        this.f3962e = discordAudioManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3961d) {
            case 0:
                return DiscordAudioManager.AnonymousClass1.onAudioDevicesAdded$lambda$1(this.f3962e, (DiscordAudioManagerListener) obj);
            default:
                return DiscordAudioManager.AnonymousClass1.onAudioDevicesRemoved$lambda$4(this.f3962e, (DiscordAudioManagerListener) obj);
        }
    }
}
