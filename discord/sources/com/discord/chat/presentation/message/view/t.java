package com.discord.chat.presentation.message.view;

import android.view.View;
import android.widget.FrameLayout;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerViewState;
import com.discord.media_player.MediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4255d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4256e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f4257i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4258v;

    public /* synthetic */ t(MediaView mediaView, boolean z5, MediaSource mediaSource) {
        this.f4257i = mediaView;
        this.f4256e = z5;
        this.f4258v = mediaSource;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4255d) {
            case 0:
                MediaView.setMediaData$lambda$10((MediaView) this.f4257i, this.f4256e, (MediaSource) this.f4258v, view);
                break;
            default:
                AudioPlayerView.configurePlayButton$lambda$12((AudioPlayerView) this.f4257i, (AudioPlayerViewState) this.f4258v, this.f4256e, view);
                break;
        }
    }

    public /* synthetic */ t(AudioPlayerView audioPlayerView, AudioPlayerViewState audioPlayerViewState, boolean z5) {
        this.f4257i = audioPlayerView;
        this.f4258v = audioPlayerViewState;
        this.f4256e = z5;
    }
}
