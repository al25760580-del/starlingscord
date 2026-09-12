package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.media_player.MediaPlayer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AudioPlayerView f4271e;

    public /* synthetic */ c(AudioPlayerView audioPlayerView, int i7) {
        this.f4270d = i7;
        this.f4271e = audioPlayerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4270d) {
            case 0:
                return AudioPlayerView.prepareAudio$lambda$13(this.f4271e, (MediaPlayer.Event) obj);
            default:
                return AudioPlayerView.attachStateChangeListener$lambda$0(this.f4271e, ((Boolean) obj).booleanValue());
        }
    }
}
