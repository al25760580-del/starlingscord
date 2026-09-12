package com.discord.media.engine;

import com.discord.media.engine.video.events.OnBroadcastThumbnailEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@xn.d(c = "com.discord.media.engine.MediaEngineModule$setBroadcastThumbnailParams$1$1$1", f = "MediaEngineModule.kt", l = {}, m = "invokeSuspend")
public final class MediaEngineModule$setBroadcastThumbnailParams$1$1$1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ String $imgdata;
    int label;
    final /* synthetic */ MediaEngineModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$setBroadcastThumbnailParams$1$1$1(MediaEngineModule mediaEngineModule, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mediaEngineModule;
        this.$imgdata = str;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new MediaEngineModule$setBroadcastThumbnailParams$1$1$1(this.this$0, this.$imgdata, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ib.a.L(obj);
        this.this$0.reactEvents.emitModuleEvent(this.this$0.getReactContext(), new OnBroadcastThumbnailEvent(this.$imgdata));
        return Unit.f14616a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MediaEngineModule$setBroadcastThumbnailParams$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
