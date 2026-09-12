package io.ktor.client.plugins.websocket.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.websocket.ClientWebSocketSession;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
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

/* JADX INFO: compiled from: buildersCio.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a]\u0010\u000e\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0086\u0001\u0010\u0014\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0086\u0001\u0010\u0016\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0086\u0001\u0010\u0017\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lio/ktor/client/HttpClient;", "Lio/ktor/http/HttpMethod;", "method", "", "host", "", "port", "path", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/plugins/websocket/ClientWebSocketSession;", "webSocketRawSession", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "webSocketRaw", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wsRaw", "wssRaw", "ktor-client-cio"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BuildersCioKt {

    /* JADX INFO: renamed from: io.ktor.client.plugins.websocket.cio.BuildersCioKt$webSocketRaw$1, reason: invalid class name */
    /* JADX INFO: compiled from: buildersCio.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.websocket.cio.BuildersCioKt", f = "buildersCio.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5}, l = {69, 77, 81, 79, 81, 81}, m = "webSocketRaw", n = {"$this$webSocketRaw", "method", "host", "port", "path", "request", "block", "$this$webSocketRaw", "method", "host", "port", "path", "request", "block", "session", "$this$webSocketRaw", "method", "host", "port", "path", "request", "block", "session", "$this$webSocketRaw", "method", "host", "port", "path", "request", "block", "session", "cause", "$this$webSocketRaw", "method", "host", "port", "path", "request", "block", "session", "$this$webSocketRaw", "method", "host", "port", "path", "request", "block", "session"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BuildersCioKt.webSocketRaw(null, null, null, null, null, null, null, this);
        }
    }

    public static /* synthetic */ Object webSocketRawSession$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, Continuation continuation, int i, Object obj) {
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
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.cio.BuildersCioKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersCioKt.webSocketRawSession$lambda$0((HttpRequestBuilder) obj2);
                }
            };
        }
        return webSocketRawSession(httpClient, httpMethod, str, num, str2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketRawSession$lambda$0(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.websocket.cio.BuildersCioKt$webSocketRawSession$3, reason: invalid class name */
    /* JADX INFO: compiled from: buildersCio.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.websocket.cio.BuildersCioKt$webSocketRawSession$3", f = "buildersCio.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4}, l = {132, 135, 46, 147, 147}, m = "invokeSuspend", n = {"this_$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "this_$iv", "response$iv", "$this$body$iv$iv", "$completion$iv$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$i$f$body", "this_$iv", "response$iv", "result$iv", "$completion", "session", "sessionCompleted", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$i$a$-body-BuildersCioKt$webSocketRawSession$3$1", "this_$iv", "response$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "this_$iv", "response$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv"}, s = {"L$0", "I$0", "I$1", "I$2", "L$0", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2"}, v = 1)
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HttpStatement $request;
        final /* synthetic */ CompletableDeferred<ClientWebSocketSession> $result;
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
        AnonymousClass3(HttpStatement httpStatement, CompletableDeferred<ClientWebSocketSession> completableDeferred, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$request = httpStatement;
            this.$result = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$request, this.$result, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.cio.BuildersCioKt.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0180  */
    /* JADX WARN: Code duplicated, block: B:42:0x0211 A[PHI: r2 r3 r4 r5 r6 r7 r11 r12
      0x0211: PHI (r2v24 io.ktor.client.plugins.websocket.ClientWebSocketSession) = 
      (r2v18 io.ktor.client.plugins.websocket.ClientWebSocketSession)
      (r2v30 io.ktor.client.plugins.websocket.ClientWebSocketSession)
     binds: [B:40:0x020d, B:14:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r3v16 kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.ClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) = 
      (r3v11 kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.ClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>)
      (r3v19 kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.ClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>)
     binds: [B:40:0x020d, B:14:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r4v14 kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>) = 
      (r4v9 kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>)
      (r4v17 kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>)
     binds: [B:40:0x020d, B:14:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r5v14 java.lang.String) = (r5v9 java.lang.String), (r5v17 java.lang.String) binds: [B:40:0x020d, B:14:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r6v14 java.lang.Integer) = (r6v9 java.lang.Integer), (r6v17 java.lang.Integer) binds: [B:40:0x020d, B:14:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r7v15 java.lang.String) = (r7v10 java.lang.String), (r7v18 java.lang.String) binds: [B:40:0x020d, B:14:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r11v14 io.ktor.http.HttpMethod) = (r11v9 io.ktor.http.HttpMethod), (r11v17 io.ktor.http.HttpMethod) binds: [B:40:0x020d, B:14:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r12v11 io.ktor.client.HttpClient) = (r12v6 io.ktor.client.HttpClient), (r12v14 io.ktor.client.HttpClient) binds: [B:40:0x020d, B:14:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01c3, code lost:
    
        if (io.ktor.websocket.WebSocketSessionKt.close$default(r0, null, r8, 1, null) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x024d, code lost:
    
        if (io.ktor.websocket.WebSocketSessionKt.close$default(r0, null, r8, 1, null) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object webSocketRaw(io.ktor.client.HttpClient r16, io.ktor.http.HttpMethod r17, java.lang.String r18, final java.lang.Integer r19, java.lang.String r20, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> r21, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.ClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.cio.BuildersCioKt.webSocketRaw(io.ktor.client.HttpClient, io.ktor.http.HttpMethod, java.lang.String, java.lang.Integer, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object webSocketRaw$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
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
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.cio.BuildersCioKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersCioKt.webSocketRaw$lambda$0((HttpRequestBuilder) obj2);
                }
            };
        }
        Function1 function3 = function1;
        return webSocketRaw(httpClient, httpMethod, str, num, str2, function3, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketRaw$lambda$0(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketRaw$lambda$1(Integer num, Function1 function1, HttpRequestBuilder webSocketRawSession) {
        Intrinsics.checkNotNullParameter(webSocketRawSession, "$this$webSocketRawSession");
        webSocketRawSession.getUrl().setProtocol(URLProtocol.INSTANCE.getWS());
        if (num != null) {
            webSocketRawSession.getUrl().setPort(num.intValue());
        }
        function1.invoke(webSocketRawSession);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object wsRaw$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
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
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.cio.BuildersCioKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersCioKt.wsRaw$lambda$0((HttpRequestBuilder) obj2);
                }
            };
        }
        Function1 function3 = function1;
        return wsRaw(httpClient, httpMethod, str, num, str2, function3, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wsRaw$lambda$0(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object wsRaw(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super ClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocketRaw = webSocketRaw(httpClient, httpMethod, str, num, str2, function1, function2, continuation);
        return objWebSocketRaw == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocketRaw : Unit.INSTANCE;
    }

    public static /* synthetic */ Object wssRaw$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
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
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.cio.BuildersCioKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BuildersCioKt.wssRaw$lambda$0((HttpRequestBuilder) obj2);
                }
            };
        }
        Function1 function3 = function1;
        return wssRaw(httpClient, httpMethod, str, num, str2, function3, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wssRaw$lambda$0(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object wssRaw(HttpClient httpClient, HttpMethod httpMethod, String str, final Integer num, String str2, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super ClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocketRaw = webSocketRaw(httpClient, httpMethod, str, num, str2, new Function1() { // from class: io.ktor.client.plugins.websocket.cio.BuildersCioKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuildersCioKt.wssRaw$lambda$1(num, function1, (HttpRequestBuilder) obj);
            }
        }, function2, continuation);
        return objWebSocketRaw == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocketRaw : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wssRaw$lambda$1(Integer num, Function1 function1, HttpRequestBuilder webSocketRaw) {
        Intrinsics.checkNotNullParameter(webSocketRaw, "$this$webSocketRaw");
        webSocketRaw.getUrl().setProtocol(URLProtocol.INSTANCE.getWSS());
        if (num != null) {
            webSocketRaw.getUrl().setPort(num.intValue());
        }
        function1.invoke(webSocketRaw);
        return Unit.INSTANCE;
    }

    public static final Object webSocketRawSession(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientWebSocketSession> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(httpMethod);
        HttpRequestKt.url$default(httpRequestBuilder, "ws", str, num, str2, null, 16, null);
        function1.invoke(httpRequestBuilder);
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new AnonymousClass3(httpStatement, completableDeferredCompletableDeferred$default, null), 3, null);
        return completableDeferredCompletableDeferred$default.await(continuation);
    }
}
