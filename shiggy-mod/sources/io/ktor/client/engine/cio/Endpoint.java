package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import io.ktor.client.plugins.HttpTimeoutCapability;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.UnixSocketSettings;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpStatusCode;
import io.ktor.network.sockets.Connection;
import io.ktor.network.sockets.InetSocketAddress;
import io.ktor.network.sockets.SocketAddress;
import io.ktor.network.tls.TLSConfigBuilder;
import io.ktor.network.tls.TLSConfigBuilderKt;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import java.io.Closeable;
import java.net.Proxy;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: Endpoint.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 W2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001WB_\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b\"\u0010#J \u0010$\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b$\u0010\u001fJH\u0010-\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b/\u00100J$\u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204022\u0006\u00101\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b5\u00100J+\u0010:\u001a\u000608j\u0002`92\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<022\u0006\u00101\u001a\u00020\u001aH\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00142\u0006\u0010?\u001a\u000203H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0014H\u0016¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u001c\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010FR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010GR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010HR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010IR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010MR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010NR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020 0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lio/ktor/client/engine/cio/Endpoint;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "", "host", "", "port", "Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", "proxy", "", "secure", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "config", "Lio/ktor/client/engine/cio/ConnectionFactory;", "connectionFactory", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/Function0;", "", "onDone", "Lio/ktor/client/request/UnixSocketSettings;", "unixSocket", "<init>", "(Ljava/lang/String;ILjava/net/Proxy;ZLio/ktor/client/engine/cio/CIOEngineConfig;Lio/ktor/client/engine/cio/ConnectionFactory;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lio/ktor/client/request/UnixSocketSettings;)V", "Lio/ktor/client/request/HttpRequestData;", "request", "callContext", "Lio/ktor/client/request/HttpResponseData;", "execute", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/engine/cio/RequestTask;", "task", "makePipelineRequest", "(Lio/ktor/client/engine/cio/RequestTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeDedicatedRequest", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "originOutput", "Lio/ktor/util/date/GMTDate;", "requestTime", "overProxy", "processExpectContinue", "(Lio/ktor/client/request/HttpRequestData;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;Lio/ktor/util/date/GMTDate;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPipeline", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestData", "Lkotlin/Pair;", "Lio/ktor/network/sockets/SocketAddress;", "Lio/ktor/network/sockets/Connection;", "connect", "connectAttempts", "timeoutFails", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getTimeoutException", "(IILio/ktor/client/request/HttpRequestData;)Ljava/lang/Exception;", "", "retrieveTimeouts", "(Lio/ktor/client/request/HttpRequestData;)Lkotlin/Pair;", "address", "releaseConnection", "(Lio/ktor/network/sockets/SocketAddress;)V", "close", "()V", "Ljava/lang/String;", "I", "Ljava/net/Proxy;", "Z", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "Lio/ktor/client/engine/cio/ConnectionFactory;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/jvm/functions/Function0;", "Lio/ktor/client/request/UnixSocketSettings;", "Lkotlinx/coroutines/channels/Channel;", "deliveryPoint", "Lkotlinx/coroutines/channels/Channel;", "maxEndpointIdleTime", "J", "Lkotlinx/coroutines/Job;", "timeout", "Lkotlinx/coroutines/Job;", "Companion", "ktor-client-cio"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class Endpoint implements CoroutineScope, Closeable {
    public static final long CONTINUE_RESPONSE_TIMEOUT_MILLIS = 1000;
    private static final /* synthetic */ AtomicIntegerFieldUpdater connections$FU = AtomicIntegerFieldUpdater.newUpdater(Endpoint.class, "connections");
    private final CIOEngineConfig config;
    private final ConnectionFactory connectionFactory;
    private volatile /* synthetic */ int connections;
    private final CoroutineContext coroutineContext;
    private final Channel<RequestTask> deliveryPoint;
    private final String host;
    volatile /* synthetic */ long lastActivity;
    private final long maxEndpointIdleTime;
    private final Function0<Unit> onDone;
    private final int port;
    private final Proxy proxy;
    private final boolean secure;
    private final Job timeout;
    private final UnixSocketSettings unixSocket;

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.Endpoint$connect$1, reason: invalid class name */
    /* JADX INFO: compiled from: Endpoint.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {221, 223, 237, 251}, m = "connect", n = {"requestData", "timeoutFails", "address", "connect", "connectAttempts", "connectTimeout", "socketTimeout", "it", "$i$a$-repeat-Endpoint$connect$2", "requestData", "timeoutFails", "address", "connect", "connectAttempts", "connectTimeout", "socketTimeout", "it", "$i$a$-repeat-Endpoint$connect$2", "requestData", "timeoutFails", "address", "connect", "socket", "connection", "connectAttempts", "connectTimeout", "socketTimeout", "it", "$i$a$-repeat-Endpoint$connect$2", "requestData", "timeoutFails", "address", "connect", "socket", "connection", "realAddress", "connectAttempts", "connectTimeout", "socketTimeout", "it", "$i$a$-repeat-Endpoint$connect$2"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "J$1", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "J$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "J$0", "J$1", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "J$0", "J$1", "I$1", "I$2"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Endpoint.this.connect(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.Endpoint$createPipeline$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Endpoint.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", i = {0}, l = {184}, m = "createPipeline", n = {"request"}, s = {"L$0"}, v = 1)
    static final class C00341 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00341(Continuation<? super C00341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Endpoint.this.createPipeline(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.Endpoint$execute$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Endpoint.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {67, 73, 74}, m = "execute", n = {"request", "callContext", "request", "callContext", "response", "task", "request", "callContext", "response", "task"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, v = 1)
    static final class C00351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C00351(Continuation<? super C00351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Endpoint.this.execute(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.Endpoint$makeDedicatedRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Endpoint.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 131, 133, 134}, m = "makeDedicatedRequest", n = {"request", "callContext", "request", "callContext", "address", "connection", "input", "originOutput", "output", "requestTime", "timeout", "overProxy", "request", "callContext", "address", "connection", "input", "originOutput", "output", "requestTime", "timeout", "overProxy", "request", "callContext", "address", "connection", "input", "originOutput", "output", "requestTime", "timeout", "overProxy"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0", "I$0"}, v = 1)
    static final class C00361 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C00361(Continuation<? super C00361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Endpoint.this.makeDedicatedRequest(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.Endpoint$makePipelineRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Endpoint.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", i = {0, 0, 1, 1}, l = {87, 94}, m = "makePipelineRequest", n = {"task", "connections", "task", "connections"}, s = {"L$0", "I$0", "L$0", "I$0"}, v = 1)
    static final class C00371 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00371(Continuation<? super C00371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Endpoint.this.makePipelineRequest(null, this);
        }
    }

    public Endpoint(String host, int i, Proxy proxy, boolean z, CIOEngineConfig config, ConnectionFactory connectionFactory, CoroutineContext coroutineContext, Function0<Unit> onDone, UnixSocketSettings unixSocketSettings) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        this.host = host;
        this.port = i;
        this.proxy = proxy;
        this.secure = z;
        this.config = config;
        this.connectionFactory = connectionFactory;
        this.coroutineContext = coroutineContext;
        this.onDone = onDone;
        this.unixSocket = unixSocketSettings;
        this.lastActivity = DateJvmKt.getTimeMillis();
        this.connections = 0;
        this.deliveryPoint = ChannelKt.Channel$default(0, null, null, 7, null);
        this.maxEndpointIdleTime = ((long) 2) * config.getEndpoint().getConnectTimeout();
        this.timeout = BuildersKt__Builders_commonKt.launch$default(this, getCoroutineContext().plus(new CoroutineName("cio-endpoint-timeout")), null, new Endpoint$timeout$1(this, null), 2, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    public final Object execute(HttpRequestData httpRequestData, CoroutineContext coroutineContext, Continuation<? super HttpResponseData> continuation) throws Throwable {
        C00351 c00351;
        RequestTask requestTask;
        CoroutineContext coroutineContext2;
        CompletableDeferred completableDeferred;
        Throwable th;
        Object obj;
        if (continuation instanceof C00351) {
            c00351 = (C00351) continuation;
            if ((c00351.label & Integer.MIN_VALUE) != 0) {
                c00351.label -= Integer.MIN_VALUE;
            } else {
                c00351 = new C00351(continuation);
            }
        } else {
            c00351 = new C00351(continuation);
        }
        Object obj2 = c00351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00351.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            this.lastActivity = DateJvmKt.getTimeMillis();
            if (!this.config.getPipelining() || EngineTasksKt.requiresDedicatedConnection(httpRequestData)) {
                c00351.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData);
                c00351.L$1 = SpillingKt.nullOutSpilledVariable(coroutineContext);
                c00351.label = 1;
                Object objMakeDedicatedRequest = makeDedicatedRequest(httpRequestData, coroutineContext, c00351);
                if (objMakeDedicatedRequest != coroutine_suspended) {
                    return objMakeDedicatedRequest;
                }
            } else {
                CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                requestTask = new RequestTask(httpRequestData, completableDeferredCompletableDeferred$default, coroutineContext);
                try {
                    c00351.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData);
                    c00351.L$1 = SpillingKt.nullOutSpilledVariable(coroutineContext);
                    c00351.L$2 = completableDeferredCompletableDeferred$default;
                    c00351.L$3 = requestTask;
                    c00351.label = 2;
                    if (makePipelineRequest(requestTask, c00351) != coroutine_suspended) {
                        coroutineContext2 = coroutineContext;
                        completableDeferred = completableDeferredCompletableDeferred$default;
                        obj = httpRequestData;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpRequestData = requestTask;
                    httpRequestData.getResponse().completeExceptionally(th);
                    throw th;
                }
            }
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj2);
            return obj2;
        }
        try {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
                return obj2;
            }
            RequestTask requestTask2 = (RequestTask) c00351.L$3;
            completableDeferred = (CompletableDeferred) c00351.L$2;
            CoroutineContext coroutineContext3 = (CoroutineContext) c00351.L$1;
            Object obj3 = (HttpRequestData) c00351.L$0;
            ResultKt.throwOnFailure(obj2);
            coroutineContext2 = coroutineContext3;
            requestTask = requestTask2;
            obj = obj3;
        } catch (Throwable th3) {
            th = th3;
            httpRequestData.getResponse().completeExceptionally(th);
            throw th;
        }
        c00351.L$0 = SpillingKt.nullOutSpilledVariable(obj);
        c00351.L$1 = SpillingKt.nullOutSpilledVariable(coroutineContext2);
        c00351.L$2 = SpillingKt.nullOutSpilledVariable(completableDeferred);
        c00351.L$3 = requestTask;
        c00351.label = 3;
        Object objAwait = completableDeferred.await(c00351);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[PHI: r6 r7
      0x0085: PHI (r6v4 io.ktor.client.engine.cio.RequestTask) = 
      (r6v0 io.ktor.client.engine.cio.RequestTask)
      (r6v0 io.ktor.client.engine.cio.RequestTask)
      (r6v9 io.ktor.client.engine.cio.RequestTask)
     binds: [B:25:0x0067, B:27:0x0077, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r7v8 int) = (r7v5 int), (r7v5 int), (r7v9 int) binds: [B:25:0x0067, B:27:0x0077, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r2.send(r6, r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object makePipelineRequest(io.ktor.client.engine.cio.RequestTask r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.client.engine.cio.Endpoint.C00371
            if (r0 == 0) goto L14
            r0 = r7
            io.ktor.client.engine.cio.Endpoint$makePipelineRequest$1 r0 = (io.ktor.client.engine.cio.Endpoint.C00371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            io.ktor.client.engine.cio.Endpoint$makePipelineRequest$1 r0 = new io.ktor.client.engine.cio.Endpoint$makePipelineRequest$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            int r6 = r0.I$0
            java.lang.Object r6 = r0.L$0
            io.ktor.client.engine.cio.RequestTask r6 = (io.ktor.client.engine.cio.RequestTask) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L98
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            io.ktor.client.engine.cio.RequestTask r2 = (io.ktor.client.engine.cio.RequestTask) r2
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L47
            r7 = r6
            r6 = r2
            goto L85
        L47:
            r6 = move-exception
            goto L7d
        L49:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.channels.Channel<io.ktor.client.engine.cio.RequestTask> r7 = r5.deliveryPoint
            java.lang.Object r7 = r7.mo359trySendJP2dKIU(r6)
            boolean r7 = kotlinx.coroutines.channels.ChannelResult.m1988isSuccessimpl(r7)
            if (r7 == 0) goto L5b
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L5b:
            int r7 = r5.connections
            io.ktor.client.engine.cio.CIOEngineConfig r2 = r5.config
            io.ktor.client.engine.cio.EndpointConfig r2 = r2.getEndpoint()
            int r2 = r2.getMaxConnectionsPerRoute()
            if (r7 >= r2) goto L85
            io.ktor.client.request.HttpRequestData r2 = r6.getRequest()     // Catch: java.lang.Throwable -> L7a
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L7a
            r0.I$0 = r7     // Catch: java.lang.Throwable -> L7a
            r0.label = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r5.createPipeline(r2, r0)     // Catch: java.lang.Throwable -> L7a
            if (r2 != r1) goto L85
            goto L97
        L7a:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L7d:
            kotlinx.coroutines.CompletableDeferred r7 = r2.getResponse()
            r7.completeExceptionally(r6)
            throw r6
        L85:
            kotlinx.coroutines.channels.Channel<io.ktor.client.engine.cio.RequestTask> r2 = r5.deliveryPoint
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r4
            r0.I$0 = r7
            r0.label = r3
            java.lang.Object r6 = r2.send(r6, r0)
            if (r6 != r1) goto L98
        L97:
            return r1
        L98:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.Endpoint.makePipelineRequest(io.ktor.client.engine.cio.RequestTask, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:61:0x0227  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    public final Object makeDedicatedRequest(HttpRequestData httpRequestData, CoroutineContext coroutineContext, Continuation<? super HttpResponseData> continuation) throws Throwable {
        C00361 c00361;
        HttpRequestData httpRequestData2;
        HttpRequestData httpRequestData3;
        CoroutineContext coroutineContext2;
        GMTDate gMTDate;
        SocketAddress socketAddress;
        ByteReadChannel byteReadChannel;
        Connection connection;
        int i;
        ByteWriteChannel byteWriteChannel;
        HttpRequestData httpRequestData4;
        long j;
        CoroutineContext coroutineContext3;
        ByteWriteChannel byteWriteChannel2;
        HttpRequestData httpRequestData5 = httpRequestData;
        if (continuation instanceof C00361) {
            c00361 = (C00361) continuation;
            if ((c00361.label & Integer.MIN_VALUE) != 0) {
                c00361.label -= Integer.MIN_VALUE;
            } else {
                c00361 = new C00361(continuation);
            }
        } else {
            c00361 = new C00361(continuation);
        }
        C00361 c00362 = c00361;
        Object objProcessExpectContinue = c00362.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c00362.label;
        ?? r8 = 1;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objProcessExpectContinue);
                    c00362.L$0 = httpRequestData5;
                    c00362.L$1 = coroutineContext;
                    c00362.label = 1;
                    Object objConnect = connect(httpRequestData5, c00362);
                    if (objConnect != coroutine_suspended) {
                        httpRequestData3 = httpRequestData5;
                        coroutineContext2 = coroutineContext;
                        objProcessExpectContinue = objConnect;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        int i3 = c00362.I$0;
                        long j2 = c00362.J$0;
                        ResultKt.throwOnFailure(objProcessExpectContinue);
                        return (HttpResponseData) objProcessExpectContinue;
                    }
                    if (i2 == 3) {
                        i = c00362.I$0;
                        j = c00362.J$0;
                        GMTDate gMTDate2 = (GMTDate) c00362.L$7;
                        byteWriteChannel2 = (ByteWriteChannel) c00362.L$6;
                        byteWriteChannel = (ByteWriteChannel) c00362.L$5;
                        byteReadChannel = (ByteReadChannel) c00362.L$4;
                        connection = (Connection) c00362.L$3;
                        socketAddress = (SocketAddress) c00362.L$2;
                        coroutineContext3 = (CoroutineContext) c00362.L$1;
                        HttpRequestData httpRequestData6 = (HttpRequestData) c00362.L$0;
                        try {
                            ResultKt.throwOnFailure(objProcessExpectContinue);
                            gMTDate = gMTDate2;
                            httpRequestData4 = httpRequestData6;
                            try {
                                c00362.L$0 = httpRequestData4;
                                c00362.L$1 = SpillingKt.nullOutSpilledVariable(coroutineContext3);
                                c00362.L$2 = SpillingKt.nullOutSpilledVariable(socketAddress);
                                c00362.L$3 = SpillingKt.nullOutSpilledVariable(connection);
                                c00362.L$4 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
                                c00362.L$5 = SpillingKt.nullOutSpilledVariable(byteWriteChannel);
                                c00362.L$6 = SpillingKt.nullOutSpilledVariable(byteWriteChannel2);
                                c00362.L$7 = SpillingKt.nullOutSpilledVariable(gMTDate);
                                c00362.J$0 = j;
                                c00362.I$0 = i;
                                c00362.label = 4;
                                objProcessExpectContinue = UtilsKt.readResponse(gMTDate, httpRequestData4, byteReadChannel, byteWriteChannel, coroutineContext3, c00362);
                                if (objProcessExpectContinue != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            } catch (Throwable th) {
                                th = th;
                                httpRequestData2 = httpRequestData4;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            httpRequestData2 = httpRequestData6;
                        }
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = c00362.I$0;
                        long j3 = c00362.J$0;
                        ResultKt.throwOnFailure(objProcessExpectContinue);
                    }
                    return (HttpResponseData) objProcessExpectContinue;
                }
                CoroutineContext coroutineContext4 = (CoroutineContext) c00362.L$1;
                HttpRequestData httpRequestData7 = (HttpRequestData) c00362.L$0;
                try {
                    ResultKt.throwOnFailure(objProcessExpectContinue);
                    httpRequestData3 = httpRequestData7;
                    coroutineContext2 = coroutineContext4;
                } catch (Throwable th3) {
                    th = th3;
                    httpRequestData2 = httpRequestData7;
                }
                throw ExceptionsKt.mapToKtor(th, httpRequestData2);
                Pair pair = (Pair) objProcessExpectContinue;
                final SocketAddress socketAddress2 = (SocketAddress) pair.component1();
                final Connection connection2 = (Connection) pair.component2();
                final ByteReadChannel input = connection2.getInput();
                final ByteWriteChannel output = connection2.getOutput();
                ByteWriteChannel byteWriteChannelHandleHalfClosed = UtilsKt.handleHalfClosed(output, coroutineContext2, this.config.getEndpoint().getAllowHalfClose());
                CoroutineContext.Element element = coroutineContext2.get(Job.INSTANCE);
                Intrinsics.checkNotNull(element);
                ((Job) element).invokeOnCompletion(new Function1() { // from class: io.ktor.client.engine.cio.Endpoint$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Endpoint.makeDedicatedRequest$lambda$0(input, output, connection2, this, socketAddress2, (Throwable) obj);
                    }
                });
                long requestTimeout = EndpointKt.getRequestTimeout(httpRequestData3, this.config);
                EndpointKt.setupTimeout(coroutineContext2, httpRequestData3, requestTimeout);
                GMTDate gMTDateGMTDate$default = DateJvmKt.GMTDate$default(null, 1, null);
                if (this.proxy == null) {
                    r8 = 0;
                }
                if (UtilsKt.expectContinue(httpRequestData3.getHeaders().get(HttpHeaders.INSTANCE.getExpect()), httpRequestData3.getBody())) {
                    try {
                        c00362.L$0 = httpRequestData3;
                        c00362.L$1 = SpillingKt.nullOutSpilledVariable(coroutineContext2);
                        c00362.L$2 = SpillingKt.nullOutSpilledVariable(socketAddress2);
                        c00362.L$3 = SpillingKt.nullOutSpilledVariable(connection2);
                        c00362.L$4 = SpillingKt.nullOutSpilledVariable(input);
                        c00362.L$5 = SpillingKt.nullOutSpilledVariable(output);
                        c00362.L$6 = SpillingKt.nullOutSpilledVariable(byteWriteChannelHandleHalfClosed);
                        c00362.L$7 = SpillingKt.nullOutSpilledVariable(gMTDateGMTDate$default);
                        c00362.J$0 = requestTimeout;
                        c00362.I$0 = r8;
                        c00362.label = 2;
                        objProcessExpectContinue = processExpectContinue(httpRequestData3, input, byteWriteChannelHandleHalfClosed, output, coroutineContext2, gMTDateGMTDate$default, r8, c00362);
                        if (objProcessExpectContinue == coroutine_suspended) {
                        }
                        return (HttpResponseData) objProcessExpectContinue;
                    } catch (Throwable th4) {
                        th = th4;
                        httpRequestData5 = httpRequestData3;
                        httpRequestData2 = httpRequestData5;
                        throw ExceptionsKt.mapToKtor(th, httpRequestData2);
                    }
                }
                gMTDate = gMTDateGMTDate$default;
                boolean z = r8;
                HttpRequestData httpRequestData8 = httpRequestData3;
                c00362.L$0 = httpRequestData8;
                c00362.L$1 = coroutineContext2;
                c00362.L$2 = SpillingKt.nullOutSpilledVariable(socketAddress2);
                c00362.L$3 = SpillingKt.nullOutSpilledVariable(connection2);
                c00362.L$4 = input;
                c00362.L$5 = output;
                c00362.L$6 = SpillingKt.nullOutSpilledVariable(byteWriteChannelHandleHalfClosed);
                c00362.L$7 = gMTDate;
                c00362.J$0 = requestTimeout;
                c00362.I$0 = z ? 1 : 0;
                c00362.label = 3;
                httpRequestData2 = httpRequestData8;
                try {
                    if (UtilsKt.writeRequest$default(httpRequestData2, byteWriteChannelHandleHalfClosed, coroutineContext2, z, false, c00362, 16, null) != coroutine_suspended) {
                        socketAddress = socketAddress2;
                        byteReadChannel = input;
                        connection = connection2;
                        i = z ? 1 : 0;
                        byteWriteChannel = output;
                        httpRequestData4 = httpRequestData2;
                        j = requestTimeout;
                        coroutineContext3 = coroutineContext2;
                        byteWriteChannel2 = byteWriteChannelHandleHalfClosed;
                        c00362.L$0 = httpRequestData4;
                        c00362.L$1 = SpillingKt.nullOutSpilledVariable(coroutineContext3);
                        c00362.L$2 = SpillingKt.nullOutSpilledVariable(socketAddress);
                        c00362.L$3 = SpillingKt.nullOutSpilledVariable(connection);
                        c00362.L$4 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
                        c00362.L$5 = SpillingKt.nullOutSpilledVariable(byteWriteChannel);
                        c00362.L$6 = SpillingKt.nullOutSpilledVariable(byteWriteChannel2);
                        c00362.L$7 = SpillingKt.nullOutSpilledVariable(gMTDate);
                        c00362.J$0 = j;
                        c00362.I$0 = i;
                        c00362.label = 4;
                        objProcessExpectContinue = UtilsKt.readResponse(gMTDate, httpRequestData4, byteReadChannel, byteWriteChannel, coroutineContext3, c00362);
                        if (objProcessExpectContinue != coroutine_suspended) {
                            return (HttpResponseData) objProcessExpectContinue;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                return coroutine_suspended;
            } catch (Throwable th6) {
                th = th6;
                httpRequestData2 = httpRequestData3;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeDedicatedRequest$lambda$0(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, Connection connection, Endpoint endpoint, SocketAddress socketAddress, Throwable th) {
        Throwable thUnwrapCancellationException = th != null ? ExceptionUtilsJvmKt.unwrapCancellationException(th) : null;
        try {
            byteReadChannel.cancel(thUnwrapCancellationException);
            ByteWriteChannelOperationsKt.close(byteWriteChannel, thUnwrapCancellationException);
            connection.getSocket().close();
        } catch (Throwable th2) {
            try {
                EndpointKt.LOGGER.debug("An error occurred while closing connection", th2);
            } finally {
                endpoint.releaseConnection(socketAddress);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.Endpoint$processExpectContinue$2, reason: invalid class name */
    /* JADX INFO: compiled from: Endpoint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/request/HttpResponseData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.Endpoint$processExpectContinue$2", f = "Endpoint.kt", i = {2, 3, 3, 3, 4, 4, 5, 5, 6, 7}, l = {150, 152, 157, 164, 168, 172, 177, 180}, m = "invokeSuspend", n = {"responseReady", "responseReady", "response", "newRequest", "responseReady", "response", "responseReady", "response", "responseReady", "responseReady"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0"}, v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpResponseData>, Object> {
        final /* synthetic */ CoroutineContext $callContext;
        final /* synthetic */ ByteReadChannel $input;
        final /* synthetic */ ByteWriteChannel $originOutput;
        final /* synthetic */ ByteWriteChannel $output;
        final /* synthetic */ boolean $overProxy;
        final /* synthetic */ HttpRequestData $request;
        final /* synthetic */ GMTDate $requestTime;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(HttpRequestData httpRequestData, ByteWriteChannel byteWriteChannel, boolean z, GMTDate gMTDate, ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel2, CoroutineContext coroutineContext, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = httpRequestData;
            this.$output = byteWriteChannel;
            this.$overProxy = z;
            this.$requestTime = gMTDate;
            this.$input = byteReadChannel;
            this.$originOutput = byteWriteChannel2;
            this.$callContext = coroutineContext;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$request, this.$output, this.$overProxy, this.$requestTime, this.$input, this.$originOutput, this.$callContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpResponseData> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:22:0x007b A[PHI: r15
          0x007b: PHI (r15v6 java.lang.Object) = (r15v5 java.lang.Object), (r15v0 java.lang.Object) binds: [B:20:0x0077, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:24:0x0080  */
        /* JADX WARN: Code duplicated, block: B:27:0x009e A[PHI: r1 r15
          0x009e: PHI (r1v6 java.lang.Boolean) = (r1v5 java.lang.Boolean), (r1v11 java.lang.Boolean) binds: [B:25:0x009a, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x009e: PHI (r15v13 java.lang.Object) = (r15v12 java.lang.Object), (r15v0 java.lang.Object) binds: [B:25:0x009a, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:34:0x0101  */
        /* JADX WARN: Code duplicated, block: B:37:0x0124  */
        /* JADX WARN: Code duplicated, block: B:40:0x013b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x013c  */
        /* JADX WARN: Code duplicated, block: B:44:0x0159 A[PHI: r1
          0x0159: PHI (r1v12 java.lang.Boolean) = (r1v5 java.lang.Boolean), (r1v6 java.lang.Boolean), (r1v6 java.lang.Boolean), (r1v14 java.lang.Boolean) binds: [B:42:0x0156, B:35:0x0121, B:30:0x00f1, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:46:0x017a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:47:0x017b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Boolean bool;
            HttpResponseData httpResponseData;
            HttpStatusCode statusCode;
            HttpRequestData httpRequestDataBuild;
            Object response;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (UtilsKt.writeHeaders$default(this.$request, this.$output, this.$overProxy, false, this, 8, null) != coroutine_suspended) {
                        this.label = 2;
                        obj = TimeoutKt.withTimeoutOrNull(1000L, new Endpoint$processExpectContinue$2$responseReady$1(this.$input, null), this);
                        if (obj != coroutine_suspended) {
                            bool = (Boolean) obj;
                            if (bool != null) {
                                this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                this.label = 3;
                                obj = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                                if (obj != coroutine_suspended) {
                                    httpResponseData = (HttpResponseData) obj;
                                    statusCode = httpResponseData.getStatusCode();
                                    if (Intrinsics.areEqual(statusCode, HttpStatusCode.INSTANCE.getExpectationFailed())) {
                                        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                                        HttpRequestKt.takeFrom(httpRequestBuilder, this.$request);
                                        httpRequestBuilder.getHeaders().remove(HttpHeaders.INSTANCE.getExpect());
                                        httpRequestDataBuild = httpRequestBuilder.build();
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                        this.L$1 = SpillingKt.nullOutSpilledVariable(httpResponseData);
                                        this.L$2 = SpillingKt.nullOutSpilledVariable(httpRequestDataBuild);
                                        this.label = 4;
                                        if (UtilsKt.writeRequest$default(httpRequestDataBuild, this.$output, this.$callContext, this.$overProxy, false, this, 16, null) != coroutine_suspended) {
                                            this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 8;
                                            response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                                            if (response != coroutine_suspended) {
                                                return response;
                                            }
                                        }
                                    } else if (Intrinsics.areEqual(statusCode, HttpStatusCode.INSTANCE.getContinue())) {
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                        this.L$1 = SpillingKt.nullOutSpilledVariable(httpResponseData);
                                        this.label = 5;
                                        if (UtilsKt.writeBody$default(this.$request, this.$output, this.$callContext, false, this, 8, null) != coroutine_suspended) {
                                            this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 8;
                                            response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                                            if (response != coroutine_suspended) {
                                                return response;
                                            }
                                        }
                                    } else {
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                        this.L$1 = httpResponseData;
                                        this.label = 6;
                                        if (this.$output.flushAndClose(this) == coroutine_suspended) {
                                            return httpResponseData;
                                        }
                                    }
                                }
                            } else {
                                this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                this.label = 7;
                                if (UtilsKt.writeBody$default(this.$request, this.$output, this.$callContext, false, this, 8, null) != coroutine_suspended) {
                                    this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 8;
                                    response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                                    if (response != coroutine_suspended) {
                                        return response;
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    this.label = 2;
                    obj = TimeoutKt.withTimeoutOrNull(1000L, new Endpoint$processExpectContinue$2$responseReady$1(this.$input, null), this);
                    if (obj != coroutine_suspended) {
                        bool = (Boolean) obj;
                        if (bool != null) {
                            this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                            this.label = 3;
                            obj = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                            if (obj != coroutine_suspended) {
                                httpResponseData = (HttpResponseData) obj;
                                statusCode = httpResponseData.getStatusCode();
                                if (Intrinsics.areEqual(statusCode, HttpStatusCode.INSTANCE.getExpectationFailed())) {
                                    HttpRequestBuilder httpRequestBuilder2 = new HttpRequestBuilder();
                                    HttpRequestKt.takeFrom(httpRequestBuilder2, this.$request);
                                    httpRequestBuilder2.getHeaders().remove(HttpHeaders.INSTANCE.getExpect());
                                    httpRequestDataBuild = httpRequestBuilder2.build();
                                    this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                    this.L$1 = SpillingKt.nullOutSpilledVariable(httpResponseData);
                                    this.L$2 = SpillingKt.nullOutSpilledVariable(httpRequestDataBuild);
                                    this.label = 4;
                                    if (UtilsKt.writeRequest$default(httpRequestDataBuild, this.$output, this.$callContext, this.$overProxy, false, this, 16, null) != coroutine_suspended) {
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 8;
                                        response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                                        if (response != coroutine_suspended) {
                                            return response;
                                        }
                                    }
                                } else if (Intrinsics.areEqual(statusCode, HttpStatusCode.INSTANCE.getContinue())) {
                                    this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                    this.L$1 = SpillingKt.nullOutSpilledVariable(httpResponseData);
                                    this.label = 5;
                                    if (UtilsKt.writeBody$default(this.$request, this.$output, this.$callContext, false, this, 8, null) != coroutine_suspended) {
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 8;
                                        response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                                        if (response != coroutine_suspended) {
                                            return response;
                                        }
                                    }
                                } else {
                                    this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                    this.L$1 = httpResponseData;
                                    this.label = 6;
                                    if (this.$output.flushAndClose(this) == coroutine_suspended) {
                                        return httpResponseData;
                                    }
                                }
                            }
                        } else {
                            this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                            this.label = 7;
                            if (UtilsKt.writeBody$default(this.$request, this.$output, this.$callContext, false, this, 8, null) != coroutine_suspended) {
                                this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 8;
                                response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                                if (response != coroutine_suspended) {
                                    return response;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    bool = (Boolean) obj;
                    if (bool != null) {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                        this.label = 3;
                        obj = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                        if (obj != coroutine_suspended) {
                            httpResponseData = (HttpResponseData) obj;
                            statusCode = httpResponseData.getStatusCode();
                            if (Intrinsics.areEqual(statusCode, HttpStatusCode.INSTANCE.getExpectationFailed())) {
                                HttpRequestBuilder httpRequestBuilder3 = new HttpRequestBuilder();
                                HttpRequestKt.takeFrom(httpRequestBuilder3, this.$request);
                                httpRequestBuilder3.getHeaders().remove(HttpHeaders.INSTANCE.getExpect());
                                httpRequestDataBuild = httpRequestBuilder3.build();
                                this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                this.L$1 = SpillingKt.nullOutSpilledVariable(httpResponseData);
                                this.L$2 = SpillingKt.nullOutSpilledVariable(httpRequestDataBuild);
                                this.label = 4;
                                if (UtilsKt.writeRequest$default(httpRequestDataBuild, this.$output, this.$callContext, this.$overProxy, false, this, 16, null) != coroutine_suspended) {
                                    this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 8;
                                    response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                                    if (response != coroutine_suspended) {
                                        return response;
                                    }
                                }
                            } else if (Intrinsics.areEqual(statusCode, HttpStatusCode.INSTANCE.getContinue())) {
                                this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                this.L$1 = SpillingKt.nullOutSpilledVariable(httpResponseData);
                                this.label = 5;
                                if (UtilsKt.writeBody$default(this.$request, this.$output, this.$callContext, false, this, 8, null) != coroutine_suspended) {
                                    this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 8;
                                    response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                                    if (response != coroutine_suspended) {
                                        return response;
                                    }
                                }
                            } else {
                                this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                                this.L$1 = httpResponseData;
                                this.label = 6;
                                if (this.$output.flushAndClose(this) == coroutine_suspended) {
                                    return httpResponseData;
                                }
                            }
                        }
                    } else {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                        this.label = 7;
                        if (UtilsKt.writeBody$default(this.$request, this.$output, this.$callContext, false, this, 8, null) != coroutine_suspended) {
                            this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 8;
                            response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                            if (response != coroutine_suspended) {
                                return response;
                            }
                        }
                    }
                    return coroutine_suspended;
                case 3:
                    bool = (Boolean) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    httpResponseData = (HttpResponseData) obj;
                    statusCode = httpResponseData.getStatusCode();
                    if (Intrinsics.areEqual(statusCode, HttpStatusCode.INSTANCE.getExpectationFailed())) {
                        HttpRequestBuilder httpRequestBuilder4 = new HttpRequestBuilder();
                        HttpRequestKt.takeFrom(httpRequestBuilder4, this.$request);
                        httpRequestBuilder4.getHeaders().remove(HttpHeaders.INSTANCE.getExpect());
                        httpRequestDataBuild = httpRequestBuilder4.build();
                        this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(httpResponseData);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(httpRequestDataBuild);
                        this.label = 4;
                        if (UtilsKt.writeRequest$default(httpRequestDataBuild, this.$output, this.$callContext, this.$overProxy, false, this, 16, null) != coroutine_suspended) {
                            this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 8;
                            response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                            if (response != coroutine_suspended) {
                                return response;
                            }
                        }
                    } else if (Intrinsics.areEqual(statusCode, HttpStatusCode.INSTANCE.getContinue())) {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(httpResponseData);
                        this.label = 5;
                        if (UtilsKt.writeBody$default(this.$request, this.$output, this.$callContext, false, this, 8, null) != coroutine_suspended) {
                            this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 8;
                            response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                            if (response != coroutine_suspended) {
                                return response;
                            }
                        }
                    } else {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                        this.L$1 = httpResponseData;
                        this.label = 6;
                        if (this.$output.flushAndClose(this) == coroutine_suspended) {
                            return httpResponseData;
                        }
                    }
                    return coroutine_suspended;
                case 4:
                    bool = (Boolean) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 8;
                    response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                    if (response != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return response;
                case 5:
                    bool = (Boolean) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 8;
                    response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                    if (response != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return response;
                case 6:
                    HttpResponseData httpResponseData2 = (HttpResponseData) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    return httpResponseData2;
                case 7:
                    bool = (Boolean) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(bool);
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 8;
                    response = UtilsKt.readResponse(this.$requestTime, this.$request, this.$input, this.$originOutput, this.$callContext, this);
                    if (response != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return response;
                case 8:
                    ResultKt.throwOnFailure(obj);
                    return obj;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processExpectContinue(HttpRequestData httpRequestData, ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, ByteWriteChannel byteWriteChannel2, CoroutineContext coroutineContext, GMTDate gMTDate, boolean z, Continuation<? super HttpResponseData> continuation) {
        return BuildersKt.withContext(coroutineContext, new AnonymousClass2(httpRequestData, byteWriteChannel, z, gMTDate, byteReadChannel, byteWriteChannel2, coroutineContext, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object createPipeline(HttpRequestData httpRequestData, Continuation<? super Unit> continuation) throws Exception {
        C00341 c00341;
        if (continuation instanceof C00341) {
            c00341 = (C00341) continuation;
            if ((c00341.label & Integer.MIN_VALUE) != 0) {
                c00341.label -= Integer.MIN_VALUE;
            } else {
                c00341 = new C00341(continuation);
            }
        } else {
            c00341 = new C00341(continuation);
        }
        Object objConnect = c00341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00341.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objConnect);
            c00341.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData);
            c00341.label = 1;
            objConnect = connect(httpRequestData, c00341);
            if (objConnect == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objConnect);
        }
        Pair pair = (Pair) objConnect;
        final SocketAddress socketAddress = (SocketAddress) pair.component1();
        new ConnectionPipeline(this.config.getEndpoint().getKeepAliveTime(), this.config.getEndpoint().getPipelineMaxSize(), (Connection) pair.component2(), this.proxy != null, this.deliveryPoint, getCoroutineContext()).getPipelineContext().invokeOnCompletion(new Function1() { // from class: io.ktor.client.engine.cio.Endpoint$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Endpoint.createPipeline$lambda$0(this.f$0, socketAddress, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createPipeline$lambda$0(Endpoint endpoint, SocketAddress socketAddress, Throwable th) {
        endpoint.releaseConnection(socketAddress);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x0301  */
    /* JADX WARN: Code duplicated, block: B:36:0x0138 A[Catch: all -> 0x00fa, TRY_ENTER, TryCatch #2 {all -> 0x00fa, blocks: (B:96:0x02f5, B:97:0x02fa, B:27:0x00b6, B:51:0x01cc, B:53:0x01d0, B:36:0x0138, B:38:0x013c, B:40:0x0155, B:42:0x0168, B:46:0x0192, B:47:0x019e, B:39:0x014a, B:30:0x00ed), top: B:107:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x013c A[Catch: all -> 0x00fa, TryCatch #2 {all -> 0x00fa, blocks: (B:96:0x02f5, B:97:0x02fa, B:27:0x00b6, B:51:0x01cc, B:53:0x01d0, B:36:0x0138, B:38:0x013c, B:40:0x0155, B:42:0x0168, B:46:0x0192, B:47:0x019e, B:39:0x014a, B:30:0x00ed), top: B:107:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x014a A[Catch: all -> 0x00fa, TryCatch #2 {all -> 0x00fa, blocks: (B:96:0x02f5, B:97:0x02fa, B:27:0x00b6, B:51:0x01cc, B:53:0x01d0, B:36:0x0138, B:38:0x013c, B:40:0x0155, B:42:0x0168, B:46:0x0192, B:47:0x019e, B:39:0x014a, B:30:0x00ed), top: B:107:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0168 A[Catch: all -> 0x00fa, TryCatch #2 {all -> 0x00fa, blocks: (B:96:0x02f5, B:97:0x02fa, B:27:0x00b6, B:51:0x01cc, B:53:0x01d0, B:36:0x0138, B:38:0x013c, B:40:0x0155, B:42:0x0168, B:46:0x0192, B:47:0x019e, B:39:0x014a, B:30:0x00ed), top: B:107:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x018b  */
    /* JADX WARN: Code duplicated, block: B:45:0x018d  */
    /* JADX WARN: Code duplicated, block: B:47:0x019e A[Catch: all -> 0x00fa, TryCatch #2 {all -> 0x00fa, blocks: (B:96:0x02f5, B:97:0x02fa, B:27:0x00b6, B:51:0x01cc, B:53:0x01d0, B:36:0x0138, B:38:0x013c, B:40:0x0155, B:42:0x0168, B:46:0x0192, B:47:0x019e, B:39:0x014a, B:30:0x00ed), top: B:107:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d0 A[Catch: all -> 0x00fa, TRY_LEAVE, TryCatch #2 {all -> 0x00fa, blocks: (B:96:0x02f5, B:97:0x02fa, B:27:0x00b6, B:51:0x01cc, B:53:0x01d0, B:36:0x0138, B:38:0x013c, B:40:0x0155, B:42:0x0168, B:46:0x0192, B:47:0x019e, B:39:0x014a, B:30:0x00ed), top: B:107:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.client.engine.cio.ConnectionFactory] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [io.ktor.network.sockets.Socket] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v7, types: [io.ktor.network.sockets.Socket, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [io.ktor.network.sockets.SocketAddress] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01c1 -> B:51:0x01cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object connect(io.ktor.client.request.HttpRequestData r26, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends io.ktor.network.sockets.SocketAddress, io.ktor.network.sockets.Connection>> r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.Endpoint.connect(io.ktor.client.request.HttpRequestData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connect$lambda$0$0(Endpoint endpoint, InetSocketAddress inetSocketAddress, TLSConfigBuilder tls) {
        Intrinsics.checkNotNullParameter(tls, "$this$tls");
        TLSConfigBuilderKt.takeFrom(tls, endpoint.config.getHttps());
        String serverName = tls.getServerName();
        if (serverName == null) {
            serverName = inetSocketAddress.getHostname();
        }
        tls.setServerName(serverName);
        return Unit.INSTANCE;
    }

    private final Exception getTimeoutException(int connectAttempts, int timeoutFails, HttpRequestData request) {
        if (timeoutFails == connectAttempts) {
            return HttpTimeoutKt.ConnectTimeoutException$default(request, null, 2, null);
        }
        return new FailToConnectException();
    }

    private final Pair<Long, Long> retrieveTimeouts(HttpRequestData requestData) {
        Pair<Long, Long> pair = TuplesKt.to(Long.valueOf(this.config.getEndpoint().getConnectTimeout()), Long.valueOf(this.config.getEndpoint().getSocketTimeout()));
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) requestData.getCapabilityOrNull(HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig == null) {
            return pair;
        }
        Long l = httpTimeoutConfig.get_socketTimeoutMillis();
        long jLongValue = l != null ? l.longValue() : this.config.getEndpoint().getSocketTimeout();
        Long l2 = httpTimeoutConfig.get_connectTimeoutMillis();
        return TuplesKt.to(Long.valueOf(l2 != null ? l2.longValue() : this.config.getEndpoint().getConnectTimeout()), Long.valueOf(jLongValue));
    }

    private final void releaseConnection(SocketAddress address) {
        this.connectionFactory.release(address);
        connections$FU.decrementAndGet(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Job.DefaultImpls.cancel$default(this.timeout, (CancellationException) null, 1, (Object) null);
    }
}
