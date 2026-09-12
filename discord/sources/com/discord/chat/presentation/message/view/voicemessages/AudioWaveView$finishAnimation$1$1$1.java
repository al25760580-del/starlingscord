package com.discord.chat.presentation.message.view.voicemessages;

import ar.b0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@xn.d(c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1$1$1", f = "AudioWaveView.kt", l = {123}, m = "invokeSuspend")
public final class AudioWaveView$finishAnimation$1$1$1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
    int label;

    public AudioWaveView$finishAnimation$1$1$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new AudioWaveView$finishAnimation$1$1$1(continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        if (i7 == 0) {
            ib.a.L(obj);
            this.label = 1;
            if (b0.j(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        return Unit.f14616a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AudioWaveView$finishAnimation$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
