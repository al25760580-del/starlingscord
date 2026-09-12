package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.sockets.Socket;
import io.ktor.network.sockets.SocketAddress;
import io.ktor.network.sockets.SocketOptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Endpoint.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/ktor/network/sockets/Socket;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "io.ktor.client.engine.cio.Endpoint$connect$2$connect$1", f = "Endpoint.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {}, v = 1)
final class Endpoint$connect$2$connect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Socket>, Object> {
    final /* synthetic */ SocketAddress $address;
    final /* synthetic */ long $socketTimeout;
    int label;
    final /* synthetic */ Endpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Endpoint$connect$2$connect$1(Endpoint endpoint, SocketAddress socketAddress, long j, Continuation<? super Endpoint$connect$2$connect$1> continuation) {
        super(2, continuation);
        this.this$0 = endpoint;
        this.$address = socketAddress;
        this.$socketTimeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Endpoint$connect$2$connect$1(this.this$0, this.$address, this.$socketTimeout, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Socket> continuation) {
        return ((Endpoint$connect$2$connect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ConnectionFactory connectionFactory = this.this$0.connectionFactory;
        SocketAddress socketAddress = this.$address;
        final long j = this.$socketTimeout;
        this.label = 1;
        Object objConnect = connectionFactory.connect(socketAddress, new Function1() { // from class: io.ktor.client.engine.cio.Endpoint$connect$2$connect$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Endpoint$connect$2$connect$1.invokeSuspend$lambda$0(j, (SocketOptions.TCPClientSocketOptions) obj2);
            }
        }, this);
        return objConnect == coroutine_suspended ? coroutine_suspended : objConnect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(long j, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        tCPClientSocketOptions.setSocketTimeout(j);
        return Unit.INSTANCE;
    }
}
