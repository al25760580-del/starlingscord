package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.sockets.Connection;
import io.ktor.network.sockets.Socket;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TLSCommon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a$\u0010\u0003\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0003\u0010\b\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0003\u0010\t\u001a5\u0010\u0003\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0086@¢\u0006\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/network/sockets/Socket;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "tls", "(Lio/ktor/network/sockets/Socket;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/network/sockets/Connection;", "Lio/ktor/network/tls/TLSConfig;", "config", "(Lio/ktor/network/sockets/Connection;Lkotlin/coroutines/CoroutineContext;Lio/ktor/network/tls/TLSConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/network/sockets/Connection;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lio/ktor/network/tls/TLSConfigBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Lio/ktor/network/sockets/Connection;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class TLSCommonKt {

    /* JADX INFO: renamed from: io.ktor.network.tls.TLSCommonKt$tls$3, reason: invalid class name */
    /* JADX INFO: compiled from: TLSCommon.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.TLSCommonKt", f = "TLSCommon.kt", i = {0, 0, 0}, l = {47}, m = "tls", n = {"$this$tls", "coroutineContext", "config"}, s = {"L$0", "L$1", "L$2"}, v = 1)
    static final class AnonymousClass3 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TLSCommonKt.tls((Connection) null, (CoroutineContext) null, (TLSConfig) null, this);
        }
    }

    public static final Object tls(Socket socket, CoroutineContext coroutineContext, Continuation<? super Socket> continuation) {
        return TLSKt.tls(socket, coroutineContext, (Function1<? super TLSConfigBuilder, Unit>) new Function1() { // from class: io.ktor.network.tls.TLSCommonKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TLSCommonKt.tls$lambda$0((TLSConfigBuilder) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tls$lambda$0(TLSConfigBuilder tls) {
        Intrinsics.checkNotNullParameter(tls, "$this$tls");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object tls(Connection connection, CoroutineContext coroutineContext, TLSConfig tLSConfig, Continuation<? super Socket> continuation) throws Throwable {
        AnonymousClass3 anonymousClass3;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            if ((anonymousClass3.label & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(continuation);
        }
        AnonymousClass3 anonymousClass4 = anonymousClass3;
        Object objOpenTLSSession = anonymousClass4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass4.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objOpenTLSSession);
                Socket socket = connection.getSocket();
                ByteReadChannel input = connection.getInput();
                ByteWriteChannel output = connection.getOutput();
                anonymousClass4.L$0 = connection;
                anonymousClass4.L$1 = SpillingKt.nullOutSpilledVariable(coroutineContext);
                anonymousClass4.L$2 = SpillingKt.nullOutSpilledVariable(tLSConfig);
                anonymousClass4.label = 1;
                objOpenTLSSession = TLSClientSessionJvmKt.openTLSSession(socket, input, output, tLSConfig, coroutineContext, anonymousClass4);
                if (objOpenTLSSession == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                connection = (Connection) anonymousClass4.L$0;
                ResultKt.throwOnFailure(objOpenTLSSession);
            }
            return (Socket) objOpenTLSSession;
        } catch (Throwable th) {
            connection.getInput().cancel(th);
            ByteWriteChannelOperationsKt.close(connection.getOutput(), th);
            connection.getSocket().close();
            throw th;
        }
    }

    public static final Object tls(Connection connection, CoroutineContext coroutineContext, Continuation<? super Socket> continuation) {
        return tls(connection, coroutineContext, (Function1<? super TLSConfigBuilder, Unit>) new Function1() { // from class: io.ktor.network.tls.TLSCommonKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TLSCommonKt.tls$lambda$1((TLSConfigBuilder) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tls$lambda$1(TLSConfigBuilder tls) {
        Intrinsics.checkNotNullParameter(tls, "$this$tls");
        return Unit.INSTANCE;
    }

    public static final Object tls(Connection connection, CoroutineContext coroutineContext, Function1<? super TLSConfigBuilder, Unit> function1, Continuation<? super Socket> continuation) {
        TLSConfigBuilder tLSConfigBuilder = new TLSConfigBuilder();
        function1.invoke(tLSConfigBuilder);
        return tls(connection, coroutineContext, tLSConfigBuilder.build(), continuation);
    }
}
