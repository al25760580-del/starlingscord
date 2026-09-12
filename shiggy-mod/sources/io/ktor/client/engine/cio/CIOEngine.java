package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.engine.HttpClientEngineBase;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.ProxyConfigJvmKt;
import io.ktor.client.engine.ProxyType;
import io.ktor.client.plugins.HttpTimeoutCapability;
import io.ktor.client.plugins.sse.SSECapability;
import io.ktor.client.plugins.websocket.WebSocketCapability;
import io.ktor.client.plugins.websocket.WebSocketExtensionsCapability;
import io.ktor.client.request.UnixSocketCapability;
import io.ktor.client.request.UnixSocketSettings;
import io.ktor.http.URLProtocol;
import io.ktor.http.URLProtocolKt;
import io.ktor.http.Url;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.selector.SelectorManagerKt;
import io.ktor.util.CoroutinesUtilsKt;
import io.ktor.util.collections.ConcurrentMap;
import io.ktor.util.network.NetworkAddressJvmKt;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: CIOEngine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00150\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b0\u00101R\u001c\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102¨\u00063"}, d2 = {"Lio/ktor/client/engine/cio/CIOEngine;", "Lio/ktor/client/engine/HttpClientEngineBase;", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "config", "<init>", "(Lio/ktor/client/engine/cio/CIOEngineConfig;)V", "Lio/ktor/client/request/HttpRequestData;", "data", "Lio/ktor/client/request/HttpResponseData;", "execute", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "Lio/ktor/http/Url;", "url", "Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", "proxy", "Lio/ktor/client/request/UnixSocketSettings;", "unixSocket", "Lio/ktor/client/engine/cio/Endpoint;", "selectEndpoint", "(Lio/ktor/http/Url;Ljava/net/Proxy;Lio/ktor/client/request/UnixSocketSettings;)Lio/ktor/client/engine/cio/Endpoint;", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "getConfig", "()Lio/ktor/client/engine/cio/CIOEngineConfig;", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "", "supportedCapabilities", "Ljava/util/Set;", "getSupportedCapabilities", "()Ljava/util/Set;", "Lio/ktor/util/collections/ConcurrentMap;", "", "endpoints", "Lio/ktor/util/collections/ConcurrentMap;", "Lio/ktor/network/selector/SelectorManager;", "selectorManager", "Lio/ktor/network/selector/SelectorManager;", "Lio/ktor/client/engine/cio/ConnectionFactory;", "connectionFactory", "Lio/ktor/client/engine/cio/ConnectionFactory;", "Lkotlin/coroutines/CoroutineContext;", "requestsJob", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Ljava/net/Proxy;", "ktor-client-cio"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CIOEngine extends HttpClientEngineBase {
    private final CIOEngineConfig config;
    private final ConnectionFactory connectionFactory;
    private final CoroutineContext coroutineContext;
    private final ConcurrentMap<String, Endpoint> endpoints;
    private final Proxy proxy;
    private final CoroutineContext requestsJob;
    private final SelectorManager selectorManager;
    private final Set<HttpClientEngineCapability<? extends Object>> supportedCapabilities;

    /* JADX INFO: compiled from: CIOEngine.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProxyType.values().length];
            try {
                iArr[ProxyType.SOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProxyType.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.CIOEngine$execute$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CIOEngine.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.CIOEngine", f = "CIOEngine.kt", i = {0, 1, 1, 1, 1}, l = {79, 86}, m = "execute", n = {"data", "data", "callContext", "unixSocket", "endpoint"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3"}, v = 1)
    static final class C00331 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C00331(Continuation<? super C00331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CIOEngine.this.execute(null, this);
        }
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public CIOEngineConfig getConfig() {
        return this.config;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOEngine(CIOEngineConfig config) {
        Proxy proxy;
        super("ktor-cio");
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.supportedCapabilities = SetsKt.setOf((Object[]) new HttpClientEngineCapability[]{HttpTimeoutCapability.INSTANCE, WebSocketCapability.INSTANCE, WebSocketExtensionsCapability.INSTANCE, SSECapability.INSTANCE, UnixSocketCapability.INSTANCE});
        this.endpoints = new ConcurrentMap<>(0, 1, null);
        SelectorManager SelectorManager = SelectorManagerKt.SelectorManager(getDispatcher());
        this.selectorManager = SelectorManager;
        this.connectionFactory = new ConnectionFactory(SelectorManager, getConfig().getMaxConnectionsCount(), getConfig().getEndpoint().getMaxConnectionsPerRoute());
        Proxy proxy2 = getConfig().getProxy();
        ProxyType type = proxy2 != null ? ProxyConfigJvmKt.getType(proxy2) : null;
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == -1 || i == 1) {
            proxy = null;
        } else if (i == 2) {
            proxy = getConfig().getProxy();
        } else {
            throw new IllegalStateException("CIO engine does not currently support " + type + " proxies.");
        }
        this.proxy = proxy;
        CoroutineContext coroutineContext = super.getCoroutineContext();
        CoroutineContext.Element element = coroutineContext.get(Job.INSTANCE);
        Intrinsics.checkNotNull(element);
        CoroutineContext coroutineContextSilentSupervisor = CoroutinesUtilsKt.SilentSupervisor((Job) element);
        this.requestsJob = coroutineContextSilentSupervisor;
        this.coroutineContext = coroutineContext.plus(coroutineContextSilentSupervisor);
        CoroutineContext.Element element2 = coroutineContextSilentSupervisor.get(Job.INSTANCE);
        Intrinsics.checkNotNull(element2);
        BuildersKt.launch(GlobalScope.INSTANCE, coroutineContext, CoroutineStart.ATOMIC, new AnonymousClass1((Job) element2, SelectorManager, null));
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine
    public Set<HttpClientEngineCapability<? extends Object>> getSupportedCapabilities() {
        return this.supportedCapabilities;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.CIOEngine$1, reason: invalid class name */
    /* JADX INFO: compiled from: CIOEngine.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.CIOEngine$1", f = "CIOEngine.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Job $requestJob;
        final /* synthetic */ SelectorManager $selector;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Job job, SelectorManager selectorManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$requestJob = job;
            this.$selector = selectorManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$requestJob, this.$selector, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$requestJob.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.$selector.close();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.$selector.close();
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:41:0x00b8
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // io.ktor.client.engine.HttpClientEngine
    public java.lang.Object execute(io.ktor.client.request.HttpRequestData r9, kotlin.coroutines.Continuation<? super io.ktor.client.request.HttpResponseData> r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.CIOEngine.execute(io.ktor.client.request.HttpRequestData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        Iterator<Map.Entry<String, Endpoint>> it = this.endpoints.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().close();
        }
        CoroutineContext.Element element = this.requestsJob.get(Job.INSTANCE);
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((CompletableJob) element).complete();
    }

    private final Endpoint selectEndpoint(Url url, Proxy proxy, final UnixSocketSettings unixSocket) {
        String host;
        int port;
        final URLProtocol protocol = url.getProtocol();
        if (proxy == null) {
            proxy = Proxy_jvmKt.lookupGlobalProxy(url);
        }
        final Proxy proxy2 = proxy;
        if (proxy2 != null) {
            SocketAddress socketAddressResolveAddress = ProxyConfigJvmKt.resolveAddress(proxy2);
            host = NetworkAddressJvmKt.getHostname(socketAddressResolveAddress);
            port = NetworkAddressJvmKt.getPort(socketAddressResolveAddress);
        } else {
            host = url.getHost();
            port = url.getPort();
        }
        final int i = port;
        final String str = host;
        final String str2 = str + AbstractJsonLexerKt.COLON + i + AbstractJsonLexerKt.COLON + protocol + AbstractJsonLexerKt.COLON + (unixSocket != null ? unixSocket.getPath() : null);
        return this.endpoints.computeIfAbsent(str2, new Function0() { // from class: io.ktor.client.engine.cio.CIOEngine$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CIOEngine.selectEndpoint$lambda$0(protocol, str, i, proxy2, this, unixSocket, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Endpoint selectEndpoint$lambda$0(URLProtocol uRLProtocol, String str, int i, Proxy proxy, final CIOEngine cIOEngine, UnixSocketSettings unixSocketSettings, final String str2) {
        return new Endpoint(str, i, proxy, URLProtocolKt.isSecure(uRLProtocol), cIOEngine.getConfig(), cIOEngine.connectionFactory, cIOEngine.getCoroutineContext(), new Function0() { // from class: io.ktor.client.engine.cio.CIOEngine$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CIOEngine.selectEndpoint$lambda$0$0(this.f$0, str2);
            }
        }, unixSocketSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectEndpoint$lambda$0$0(CIOEngine cIOEngine, String str) {
        cIOEngine.endpoints.remove(str);
        return Unit.INSTANCE;
    }
}
