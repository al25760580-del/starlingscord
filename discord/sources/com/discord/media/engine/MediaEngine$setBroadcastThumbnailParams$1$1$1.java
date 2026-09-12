package com.discord.media.engine;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@xn.d(c = "com.discord.media.engine.MediaEngine$setBroadcastThumbnailParams$1$1$1", f = "MediaEngine.kt", l = {557}, m = "invokeSuspend")
public final class MediaEngine$setBroadcastThumbnailParams$1$1$1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Function1<String, Unit> $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$setBroadcastThumbnailParams$1$1$1(Bitmap bitmap, Function1<? super String, Unit> function1, Continuation continuation) {
        super(2, continuation);
        this.$bitmap = bitmap;
        this.$callback = function1;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new MediaEngine$setBroadcastThumbnailParams$1$1$1(this.$bitmap, this.$callback, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        if (i7 == 0) {
            ib.a.L(obj);
            MediaEngine.Companion companion = MediaEngine.INSTANCE;
            Bitmap bitmap = this.$bitmap;
            this.label = 1;
            obj = companion.encodeThumbnail(bitmap, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        this.$callback.invoke((String) obj);
        return Unit.f14616a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MediaEngine$setBroadcastThumbnailParams$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
