package com.discord.audio;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DiscordAudioManager2 f3964e;

    public /* synthetic */ c(DiscordAudioManager2 discordAudioManager2, int i7) {
        this.f3963d = i7;
        this.f3964e = discordAudioManager2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3963d) {
            case 0:
                return DiscordAudioManager2.AnonymousClass1.onAudioDevicesAdded$lambda$1(this.f3964e, (DiscordAudioManagerListener) obj);
            default:
                return DiscordAudioManager2.AnonymousClass1.onAudioDevicesRemoved$lambda$5(this.f3964e, (DiscordAudioManagerListener) obj);
        }
    }
}
