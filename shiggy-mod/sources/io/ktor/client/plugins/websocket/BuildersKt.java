package io.ktor.client.plugins.websocket;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: builders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a.\u0010\u0006\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\f\u001a\u00020\u000b*\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\f\u001a\u00020\u000b*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\u0015\u001a7\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\u0017\u001aV\u0010\u001c\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0086\u0001\u0010\u001c\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001e\u001a`\u0010\u001c\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001f\u001a\u0086\u0001\u0010 \u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001e\u001aV\u0010 \u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001d\u001a`\u0010 \u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001f\u001aV\u0010!\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001d\u001a`\u0010!\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001f\u001a\u0086\u0001\u0010!\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "", "Lkotlin/ExtensionFunctionType;", "config", "WebSockets", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/client/HttpClient;", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;", "webSocketSession", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/HttpMethod;", "method", "", "host", "", "port", "path", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "webSocket", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ws", "wss", "ktor-client-core"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BuildersKt {

    /* JADX INFO: renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocket$1, reason: invalid class name */
    /* JADX INFO: compiled from: builders.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.websocket.BuildersKt", f = "builders.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6}, l = {271, 274, 114, 116, 116, 286, 286}, m = "webSocket", n = {"$this$webSocket", "request", "block", "session", "this_$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$this$webSocket", "request", "block", "session", "this_$iv", "response$iv", "$this$body$iv$iv", "$completion$iv$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$i$f$body", "$this$webSocket", "request", "block", "session", "this_$iv", "response$iv", "result$iv", "$completion", "it", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$i$a$-body-BuildersKt$webSocket$2", "$this$webSocket", "request", "block", "session", "this_$iv", "response$iv", "result$iv", "$completion", "it", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$i$a$-body-BuildersKt$webSocket$2", "$this$webSocket", "request", "block", "session", "this_$iv", "response$iv", "result$iv", "$completion", "it", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$i$a$-body-BuildersKt$webSocket$2", "$this$webSocket", "request", "block", "session", "this_$iv", "response$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$this$webSocket", "request", "block", "session", "this_$iv", "response$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BuildersKt.webSocket(null, null, null, this);
        }
    }

    public static final void WebSockets(HttpClientConfig<?> httpClientConfig, final Function1<? super WebSockets.Config, Unit> config) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        httpClientConfig.install(WebSockets.INSTANCE, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuildersKt.WebSockets$lambda$0(config, (WebSockets.Config) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebSockets$lambda$0(Function1 function1, WebSockets.Config install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        function1.invoke(install);
        return Unit.INSTANCE;
    }

    public static final Object webSocketSession(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super DefaultClientWebSocketSession> continuation) {
        HttpClientPluginKt.plugin(httpClient, WebSockets.INSTANCE);
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.url(new Function2() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BuildersKt.webSocketSession$lambda$0$0((URLBuilder) obj, (URLBuilder) obj2);
            }
        });
        function1.invoke(httpRequestBuilder);
        BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new AnonymousClass2(new HttpStatement(httpRequestBuilder, httpClient), completableDeferredCompletableDeferred$default, null), 3, null);
        return completableDeferredCompletableDeferred$default.await(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketSession$lambda$0$0(URLBuilder url, URLBuilder it) {
        Intrinsics.checkNotNullParameter(url, "$this$url");
        Intrinsics.checkNotNullParameter(it, "it");
        url.setProtocol(URLProtocol.INSTANCE.getWS());
        url.setPort(url.getProtocol().getDefaultPort());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2, reason: invalid class name */
    /* JADX INFO: compiled from: builders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2", f = "builders.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4}, l = {269, 272, 56, 284, 284}, m = "invokeSuspend", n = {"this_$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "this_$iv", "response$iv", "$this$body$iv$iv", "$completion$iv$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$i$f$body", "this_$iv", "response$iv", "result$iv", "$completion", "session", "sessionCompleted", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$i$a$-body-BuildersKt$webSocketSession$2$1", "this_$iv", "response$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "this_$iv", "response$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv"}, s = {"L$0", "I$0", "I$1", "I$2", "L$0", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2"}, v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CompletableDeferred<DefaultClientWebSocketSession> $sessionDeferred;
        final /* synthetic */ HttpStatement $statement;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(HttpStatement httpStatement, CompletableDeferred<DefaultClientWebSocketSession> completableDeferred, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$statement = httpStatement;
            this.$sessionDeferred = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$statement, this.$sessionDeferred, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:48:0x011f A[Catch: all -> 0x0194, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0194, blocks: (B:48:0x011f, B:58:0x0198, B:59:0x019f), top: B:75:0x011d }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0167  */
        /* JADX WARN: Code duplicated, block: B:58:0x0198 A[Catch: all -> 0x0194, TRY_ENTER, TryCatch #2 {all -> 0x0194, blocks: (B:48:0x011f, B:58:0x0198, B:59:0x019f), top: B:75:0x011d }] */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0191, code lost:
        
            if (r10.cleanup(r8, r17) == r2) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x01c7, code lost:
        
            if (r10.cleanup(r8, r17) == r2) goto L64;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 475
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.BuildersKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            httpMethod = HttpMethod.INSTANCE.getGet();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersKt.webSocketSession$lambda$1((HttpRequestBuilder) obj2);
                }
            };
        }
        return webSocketSession(httpClient, httpMethod, str, num, str2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketSession$lambda$1(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object webSocketSession(HttpClient httpClient, final HttpMethod httpMethod, final String str, final Integer num, final String str2, final Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuildersKt.webSocketSession$lambda$2(httpMethod, str, num, str2, function1, (HttpRequestBuilder) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketSession$lambda$2(HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, HttpRequestBuilder webSocketSession) {
        Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
        webSocketSession.setMethod(httpMethod);
        HttpRequestKt.url$default(webSocketSession, "ws", str, num, str2, null, 16, null);
        function1.invoke(webSocketSession);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersKt.webSocketSession$lambda$3((HttpRequestBuilder) obj2);
                }
            };
        }
        return webSocketSession(httpClient, str, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketSession$lambda$3(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object webSocketSession(HttpClient httpClient, final String str, final Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuildersKt.webSocketSession$lambda$4(str, function1, (HttpRequestBuilder) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketSession$lambda$4(String str, Function1 function1, HttpRequestBuilder webSocketSession) {
        Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
        URLParserKt.takeFrom(webSocketSession.getUrl(), str);
        function1.invoke(webSocketSession);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0250  */
    /* JADX WARN: Code duplicated, block: B:54:0x025b A[Catch: all -> 0x0183, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0183, blocks: (B:32:0x017e, B:54:0x025b, B:75:0x0387, B:76:0x038e), top: B:90:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x029d  */
    /* JADX WARN: Code duplicated, block: B:61:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x02e6 A[Catch: all -> 0x00ee, PHI: r0 r1 r4 r5 r6 r8 r9 r10 r11 r12 r13 r14 r15
      0x02e6: PHI (r0v47 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) = 
      (r0v35 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession)
      (r0v55 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession)
     binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r1v32 int) = (r1v29 int), (r1v39 int) binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r4v13 int) = (r4v11 int), (r4v14 int) binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r5v25 java.util.concurrent.CancellationException) = (r5v23 java.util.concurrent.CancellationException), (r5v27 java.util.concurrent.CancellationException) binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r6v12 int) = (r6v8 int), (r6v13 int) binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r8v17 int) = (r8v13 int), (r8v18 int) binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r9v17 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) = 
      (r9v13 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession)
      (r9v21 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession)
     binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r10v17 io.ktor.client.statement.HttpResponse) = (r10v12 io.ktor.client.statement.HttpResponse), (r10v19 io.ktor.client.statement.HttpResponse) binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r11v15 io.ktor.client.statement.HttpStatement) = (r11v10 io.ktor.client.statement.HttpStatement), (r11v17 io.ktor.client.statement.HttpStatement) binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r12v16 io.ktor.client.statement.HttpStatement) = (r12v11 io.ktor.client.statement.HttpStatement), (r12v18 io.ktor.client.statement.HttpStatement) binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r13v16 kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) = 
      (r13v11 kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>)
      (r13v18 kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>)
     binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r14v16 kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>) = 
      (r14v11 kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>)
      (r14v18 kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>)
     binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r15v16 io.ktor.client.HttpClient) = (r15v11 io.ktor.client.HttpClient), (r15v18 io.ktor.client.HttpClient) binds: [B:60:0x02e2, B:23:0x00ea] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x00ee, blocks: (B:19:0x00b4, B:73:0x037f, B:74:0x0386, B:22:0x00e7, B:62:0x02e6, B:59:0x02a2, B:70:0x033a), top: B:93:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x037e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0387 A[Catch: all -> 0x0183, TRY_ENTER, TryCatch #2 {all -> 0x0183, blocks: (B:32:0x017e, B:54:0x025b, B:75:0x0387, B:76:0x038e), top: B:90:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x032b, code lost:
    
        if (r11.cleanup(r10, r2) == r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03d2, code lost:
    
        if (r11.cleanup(r10, r2) == r3) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object webSocket(io.ktor.client.HttpClient r19, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> r20, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.BuildersKt.webSocket(io.ktor.client.HttpClient, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocket$lambda$0$0(URLBuilder url, URLBuilder it) {
        Intrinsics.checkNotNullParameter(url, "$this$url");
        Intrinsics.checkNotNullParameter(it, "it");
        url.setProtocol(URLProtocol.INSTANCE.getWS());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object webSocket$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            httpMethod = HttpMethod.INSTANCE.getGet();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersKt.webSocket$lambda$2((HttpRequestBuilder) obj2);
                }
            };
        }
        Function1 function3 = function1;
        return webSocket(httpClient, httpMethod, str, num, str2, function3, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocket$lambda$2(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object webSocket(HttpClient httpClient, final HttpMethod httpMethod, final String str, final Integer num, final String str2, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuildersKt.webSocket$lambda$3(httpMethod, str, num, str2, function1, (HttpRequestBuilder) obj);
            }
        }, function2, continuation);
        return objWebSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocket$lambda$3(HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, HttpRequestBuilder webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.setMethod(httpMethod);
        HttpRequestKt.url$default(webSocket, "ws", str, num, str2, null, 16, null);
        function1.invoke(webSocket);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object webSocket$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersKt.webSocket$lambda$4((HttpRequestBuilder) obj2);
                }
            };
        }
        return webSocket(httpClient, str, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocket$lambda$4(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object webSocket(HttpClient httpClient, final String str, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, HttpMethod.INSTANCE.getGet(), null, null, null, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuildersKt.webSocket$lambda$5(str, function1, (HttpRequestBuilder) obj);
            }
        }, function2, continuation);
        return objWebSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocket$lambda$5(String str, Function1 function1, HttpRequestBuilder webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.getUrl().setProtocol(URLProtocol.INSTANCE.getWS());
        webSocket.getUrl().setPort(UtilsKt.getPort(webSocket));
        URLParserKt.takeFrom(webSocket.getUrl(), str);
        function1.invoke(webSocket);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object ws$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            httpMethod = HttpMethod.INSTANCE.getGet();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersKt.ws$lambda$0((HttpRequestBuilder) obj2);
                }
            };
        }
        Function1 function3 = function1;
        return ws(httpClient, httpMethod, str, num, str2, function3, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ws$lambda$0(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object ws(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, httpMethod, str, num, str2, function1, function2, continuation);
        return objWebSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    public static final Object ws(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, function1, function2, continuation);
        return objWebSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    public static /* synthetic */ Object ws$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersKt.ws$lambda$1((HttpRequestBuilder) obj2);
                }
            };
        }
        return ws(httpClient, str, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ws$lambda$1(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object ws(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, str, function1, function2, continuation);
        return objWebSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    public static final Object wss(HttpClient httpClient, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuildersKt.wss$lambda$0(function1, (HttpRequestBuilder) obj);
            }
        }, function2, continuation);
        return objWebSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wss$lambda$0(Function1 function1, HttpRequestBuilder webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.getUrl().setProtocol(URLProtocol.INSTANCE.getWSS());
        webSocket.getUrl().setPort(webSocket.getUrl().getProtocol().getDefaultPort());
        function1.invoke(webSocket);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object wss$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersKt.wss$lambda$1((HttpRequestBuilder) obj2);
                }
            };
        }
        return wss(httpClient, str, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wss$lambda$1(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object wss(HttpClient httpClient, final String str, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWss = wss(httpClient, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuildersKt.wss$lambda$2(str, function1, (HttpRequestBuilder) obj);
            }
        }, function2, continuation);
        return objWss == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWss : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wss$lambda$2(String str, Function1 function1, HttpRequestBuilder wss) {
        Intrinsics.checkNotNullParameter(wss, "$this$wss");
        URLParserKt.takeFrom(wss.getUrl(), str);
        function1.invoke(wss);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object wss$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            httpMethod = HttpMethod.INSTANCE.getGet();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersKt.wss$lambda$3((HttpRequestBuilder) obj2);
                }
            };
        }
        Function1 function3 = function1;
        return wss(httpClient, httpMethod, str, num, str2, function3, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wss$lambda$3(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object wss(HttpClient httpClient, HttpMethod httpMethod, String str, final Integer num, String str2, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, httpMethod, str, num, str2, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuildersKt.wss$lambda$4(num, function1, (HttpRequestBuilder) obj);
            }
        }, function2, continuation);
        return objWebSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wss$lambda$4(Integer num, Function1 function1, HttpRequestBuilder webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.getUrl().setProtocol(URLProtocol.INSTANCE.getWSS());
        if (num != null) {
            webSocket.getUrl().setPort(num.intValue());
        }
        function1.invoke(webSocket);
        return Unit.INSTANCE;
    }
}
