package com.discord.media_player;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@xn.d(c = "com.discord.media_player.MediaPlayerManager$mediaPlayerEventHandler$1$2$1", f = "MediaPlayerManager.kt", l = {}, m = "invokeSuspend")
public final class MediaPlayerManager$mediaPlayerEventHandler$1$2$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ MediaPlayer $prevMediaPlayer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerManager$mediaPlayerEventHandler$1$2$1(MediaPlayer mediaPlayer, Continuation continuation) {
        super(2, continuation);
        this.$prevMediaPlayer = mediaPlayer;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new MediaPlayerManager$mediaPlayerEventHandler$1$2$1(this.$prevMediaPlayer, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ib.a.L(obj);
        this.$prevMediaPlayer.pause();
        return Unit.f14616a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MediaPlayerManager$mediaPlayerEventHandler$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
