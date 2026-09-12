package app.rive;

import a3.e;
import app.rive.core.StateMachineHandle;
import dr.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@d(c = "app.rive.RiveCanvasSession$beginPlaying$4$viewModelDirtyCollector$1", f = "RiveCanvasSession.kt", l = {360}, m = "invokeSuspend")
public final class RiveCanvasSession$beginPlaying$4$viewModelDirtyCollector$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    int label;
    final /* synthetic */ RiveCanvasSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession$beginPlaying$4$viewModelDirtyCollector$1(RiveCanvasSession riveCanvasSession, Continuation continuation) {
        super(2, continuation);
        this.this$0 = riveCanvasSession;
    }

    @Override // xn.a
    @NotNull
    public final Continuation create(Object obj, @NotNull Continuation continuation) {
        return new RiveCanvasSession$beginPlaying$4$viewModelDirtyCollector$1(this.this$0, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(@NotNull Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        if (i7 == 0) {
            ib.a.L(obj);
            v dirtyFlow = this.this$0.viewModelInstance.getDirtyFlow();
            final RiveCanvasSession riveCanvasSession = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.rive.RiveCanvasSession$beginPlaying$4$viewModelDirtyCollector$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(@NotNull Unit unit, @NotNull Continuation continuation) {
                    final RiveCanvasSession riveCanvasSession2 = riveCanvasSession;
                    RiveLog.INSTANCE.getLogger().v("Rive/CanvasSession", new Function0<String>() { // from class: app.rive.RiveCanvasSession.beginPlaying.4.viewModelDirtyCollector.1.1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return e.l("View model instance dirty, unsettling ", StateMachineHandle.m224toStringimpl(riveCanvasSession2.stateMachine.getStateMachineHandle()));
                        }
                    });
                    riveCanvasSession.settled = false;
                    return Unit.f14616a;
                }
            };
            this.label = 1;
            if (dirtyFlow.collect(flowCollector, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        throw new rn.h();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
        return ((RiveCanvasSession$beginPlaying$4$viewModelDirtyCollector$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
