package com.discord.chat.presentation.message.view;

import android.view.View;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MediaView f4249e;

    public /* synthetic */ r(MediaView mediaView, int i7) {
        this.f4248d = i7;
        this.f4249e = mediaView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4248d) {
            case 0:
                return MediaView.attachStateChangeListener$lambda$2(this.f4249e, ((Boolean) obj).booleanValue());
            case 1:
                return MediaView.attachStateChangeListener$lambda$3(this.f4249e, ((Boolean) obj).booleanValue());
            case 2:
                return MediaView.registerForPortal$lambda$22(this.f4249e, (View) obj);
            case 3:
                return MediaView.prepareMediaPlayer$lambda$21$lambda$18(this.f4249e, (MediaPlayer.Event) obj);
            case 4:
                return MediaView.prepareMediaPlayer$lambda$21$lambda$19(this.f4249e, ((Float) obj).floatValue());
            default:
                return MediaView.prepareMediaPlayer$lambda$21$lambda$20(this.f4249e, (MediaPlayFinishedAnalytics) obj);
        }
    }
}
