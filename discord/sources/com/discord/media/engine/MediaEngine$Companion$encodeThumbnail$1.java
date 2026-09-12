package com.discord.media.engine;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@xn.d(c = "com.discord.media.engine.MediaEngine$Companion", f = "MediaEngine.kt", l = {828, 831}, m = "encodeThumbnail")
public final class MediaEngine$Companion$encodeThumbnail$1 extends xn.c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaEngine.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngine$Companion$encodeThumbnail$1(MediaEngine.Companion companion, Continuation continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // xn.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.encodeThumbnail(null, this);
    }
}
