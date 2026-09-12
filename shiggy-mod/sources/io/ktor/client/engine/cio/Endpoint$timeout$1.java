package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.util.date.DateJvmKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: Endpoint.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "io.ktor.client.engine.cio.Endpoint$timeout$1", f = "Endpoint.kt", i = {0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {"remaining"}, s = {"J$0"}, v = 1)
final class Endpoint$timeout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    int label;
    final /* synthetic */ Endpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Endpoint$timeout$1(Endpoint endpoint, Continuation<? super Endpoint$timeout$1> continuation) {
        super(2, continuation);
        this.this$0 = endpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Endpoint$timeout$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Endpoint$timeout$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long timeMillis;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable unused) {
            }
        }
        do {
            timeMillis = (this.this$0.lastActivity + this.this$0.maxEndpointIdleTime) - DateJvmKt.getTimeMillis();
            if (timeMillis <= 0) {
                SendChannel.DefaultImpls.close$default(this.this$0.deliveryPoint, null, 1, null);
                this.this$0.onDone.invoke();
                return Unit.INSTANCE;
            }
            this.J$0 = timeMillis;
            this.label = 1;
        } while (DelayKt.delay(timeMillis, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
