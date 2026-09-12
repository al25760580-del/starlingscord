package com.discord.media_player;

import com.google.android.exoplayer2.SimpleExoPlayer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4482e;

    public /* synthetic */ c(boolean z5, int i7) {
        this.f4481d = i7;
        this.f4482e = z5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4481d) {
            case 0:
                return MediaPlayerManagerModule.setMuted$lambda$2(this.f4482e, (SimpleExoPlayer) obj);
            default:
                return MediaPlayerManagerModule.setLoopPlayback$lambda$3(this.f4482e, (SimpleExoPlayer) obj);
        }
    }
}
