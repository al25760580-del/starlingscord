package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@xn.d(c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$attachStateChangeListener$1$1", f = "AudioPlayerView.kt", l = {109}, m = "invokeSuspend")
public final class AudioPlayerView$attachStateChangeListener$1$1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
    int label;
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$attachStateChangeListener$1$1(AudioPlayerView audioPlayerView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = audioPlayerView;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new AudioPlayerView$attachStateChangeListener$1$1(this.this$0, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        if (i7 == 0) {
            ib.a.L(obj);
            Flow currentPlayerSourceFlow = AudioPlayerManager.INSTANCE.getCurrentPlayerSourceFlow();
            final AudioPlayerView audioPlayerView = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$attachStateChangeListener$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(AudioPlayerManager.AudioSource audioSource, Continuation continuation) {
                    if (!Intrinsics.areEqual(audioSource, audioPlayerView.state.getAudioSource())) {
                        AudioPlayerView audioPlayerView2 = audioPlayerView;
                        audioPlayerView2.configurePlayButton(audioPlayerView2.state);
                        AudioPlayerView audioPlayerView3 = audioPlayerView;
                        audioPlayerView3.toggleDurationEmitter(audioPlayerView3.state.shouldEmitDuration$chat_release());
                    }
                    return Unit.f14616a;
                }
            };
            this.label = 1;
            if (currentPlayerSourceFlow.collect(flowCollector, this) == aVar) {
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
        return ((AudioPlayerView$attachStateChangeListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
