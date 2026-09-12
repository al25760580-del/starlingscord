package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.sockets.Socket;
import io.ktor.network.sockets.SocketsKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import java.security.SecureRandom;
import java.util.List;
import javax.net.ssl.X509TrustManager;
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

/* JADX INFO: compiled from: TLS.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001aN\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u0005\u0010\u000f\u001a5\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0086@¢\u0006\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/network/sockets/Socket;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/network/tls/TLSConfig;", "config", "tls", "(Lio/ktor/network/sockets/Socket;Lkotlin/coroutines/CoroutineContext;Lio/ktor/network/tls/TLSConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "", "randomAlgorithm", "", "Lio/ktor/network/tls/CipherSuite;", "cipherSuites", "serverName", "(Lio/ktor/network/sockets/Socket;Lkotlin/coroutines/CoroutineContext;Ljavax/net/ssl/X509TrustManager;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lio/ktor/network/tls/TLSConfigBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Lio/ktor/network/sockets/Socket;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class TLSKt {

    /* JADX INFO: renamed from: io.ktor.network.tls.TLSKt$tls$1, reason: invalid class name */
    /* JADX INFO: compiled from: TLS.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.TLSKt", f = "TLS.kt", i = {0, 0, 0, 0, 0}, l = {33}, m = "tls", n = {"$this$tls", "coroutineContext", "config", "reader", "writer"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TLSKt.tls((Socket) null, (CoroutineContext) null, (TLSConfig) null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object tls(Socket socket, CoroutineContext coroutineContext, TLSConfig tLSConfig, Continuation<? super Socket> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ByteWriteChannel byteWriteChannelOpenWriteChannel$default;
        Socket socket2;
        ByteReadChannel byteReadChannel;
        Throwable th;
        ByteReadChannel byteReadChannel2;
        Socket socket3;
        ByteWriteChannel byteWriteChannel;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objOpenTLSSession = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass2.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objOpenTLSSession);
            ByteReadChannel byteReadChannelOpenReadChannel = SocketsKt.openReadChannel(socket);
            byteWriteChannelOpenWriteChannel$default = SocketsKt.openWriteChannel$default(socket, false, 1, null);
            try {
                anonymousClass2.L$0 = socket;
                anonymousClass2.L$1 = SpillingKt.nullOutSpilledVariable(coroutineContext);
                anonymousClass2.L$2 = SpillingKt.nullOutSpilledVariable(tLSConfig);
                anonymousClass2.L$3 = byteReadChannelOpenReadChannel;
                anonymousClass2.L$4 = byteWriteChannelOpenWriteChannel$default;
                anonymousClass2.label = 1;
                socket2 = socket;
                byteReadChannel = byteReadChannelOpenReadChannel;
                try {
                    objOpenTLSSession = TLSClientSessionJvmKt.openTLSSession(socket2, byteReadChannel, byteWriteChannelOpenWriteChannel$default, tLSConfig, coroutineContext, anonymousClass2);
                    if (objOpenTLSSession == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    socket3 = socket2;
                    byteReadChannel2 = byteReadChannel;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    byteReadChannel2 = byteReadChannel;
                    byteWriteChannel = byteWriteChannelOpenWriteChannel$default;
                    byteReadChannel2.cancel(th);
                    ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
                    socket2.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                socket2 = socket;
                byteReadChannel = byteReadChannelOpenReadChannel;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteWriteChannel = (ByteWriteChannel) anonymousClass2.L$4;
            byteReadChannel2 = (ByteReadChannel) anonymousClass2.L$3;
            Socket socket4 = (Socket) anonymousClass2.L$0;
            try {
                ResultKt.throwOnFailure(objOpenTLSSession);
                byteWriteChannelOpenWriteChannel$default = byteWriteChannel;
                socket3 = socket4;
            } catch (Throwable th4) {
                th = th4;
                socket2 = socket4;
                byteReadChannel2.cancel(th);
                ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
                socket2.close();
                throw th;
            }
        }
        try {
            return (Socket) objOpenTLSSession;
        } catch (Throwable th5) {
            th = th5;
            socket2 = socket3;
            byteWriteChannel = byteWriteChannelOpenWriteChannel$default;
            byteReadChannel2.cancel(th);
            ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
            socket2.close();
            throw th;
        }
    }

    public static /* synthetic */ Object tls$default(Socket socket, CoroutineContext coroutineContext, X509TrustManager x509TrustManager, String str, List list, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            x509TrustManager = null;
        }
        if ((i & 4) != 0) {
            str = "NativePRNGNonBlocking";
        }
        if ((i & 8) != 0) {
            list = CIOCipherSuites.INSTANCE.getSupportedSuites();
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        return tls(socket, coroutineContext, x509TrustManager, str, list, str2, continuation);
    }

    public static final Object tls(Socket socket, CoroutineContext coroutineContext, final X509TrustManager x509TrustManager, final String str, final List<CipherSuite> list, final String str2, Continuation<? super Socket> continuation) {
        return tls(socket, coroutineContext, (Function1<? super TLSConfigBuilder, Unit>) new Function1() { // from class: io.ktor.network.tls.TLSKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TLSKt.tls$lambda$0(x509TrustManager, str, list, str2, (TLSConfigBuilder) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tls$lambda$0(X509TrustManager x509TrustManager, String str, List list, String str2, TLSConfigBuilder tls) {
        Intrinsics.checkNotNullParameter(tls, "$this$tls");
        tls.setTrustManager(x509TrustManager);
        tls.setRandom(SecureRandom.getInstance(str));
        tls.setCipherSuites(list);
        tls.setServerName(str2);
        return Unit.INSTANCE;
    }

    public static final Object tls(Socket socket, CoroutineContext coroutineContext, Function1<? super TLSConfigBuilder, Unit> function1, Continuation<? super Socket> continuation) {
        TLSConfigBuilder tLSConfigBuilder = new TLSConfigBuilder();
        function1.invoke(tLSConfigBuilder);
        return tls(socket, coroutineContext, tLSConfigBuilder.build(), continuation);
    }
}
