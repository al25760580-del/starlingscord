package io.ktor.client.plugins.sse;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpStatusCode;
import io.ktor.sse.ServerSentEvent;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.util.ThrowableKt;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ClosedByteChannelException;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.io.files.FileSystemKt;
import org.slf4j.Logger;

/* JADX INFO: compiled from: DefaultClientSSESession.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "It should be marked with `@InternalAPI`, please use `ClientSSESession` instead")
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u000e*\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\u0004\u0018\u00010\u001c*\u00020\u0004H\u0082@¢\u0006\u0004\b \u0010\u0018J\u0017\u0010!\u001a\u00020\u001c*\u00060\u001aj\u0002`\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#*\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020#*\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010%J\u0013\u0010'\u001a\u00020#*\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010%R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00102R\u0016\u0010\f\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00109R\u0014\u0010:\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00160?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00160?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lio/ktor/client/plugins/sse/DefaultClientSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lio/ktor/client/plugins/sse/SSEClientContent;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;)V", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;)V", "", "bodyBuffer", "()[B", "", "doReconnection", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "getRequestForReconnection", "()Lio/ktor/client/request/HttpRequestBuilder;", "close", "()V", "Lio/ktor/sse/ServerSentEvent;", "tryParseEvent", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseEvent", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "comment", "appendComment", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "readUTF8LineWithSave", "toText", "(Ljava/lang/StringBuilder;)Ljava/lang/String;", "", "isEmpty", "(Lio/ktor/sse/ServerSentEvent;)Z", "isCommentsEvent", "isRetryEvent", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "lastEventId", "Ljava/lang/String;", "", "reconnectionTimeMillis", "J", "showCommentEvents", "Z", "showRetryEvents", "", "maxReconnectionAttempts", "I", "needToReconnect", "Lio/ktor/client/plugins/sse/BodyBuffer;", "Lio/ktor/client/plugins/sse/BodyBuffer;", "initialRequest", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/HttpClient;", "clientForReconnection", "Lio/ktor/client/HttpClient;", "Lkotlinx/coroutines/flow/Flow;", "_incoming", "Lkotlinx/coroutines/flow/Flow;", "getIncoming", "()Lkotlinx/coroutines/flow/Flow;", "incoming", "ktor-client-core"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DefaultClientSSESession implements SSESession {
    private Flow<ServerSentEvent> _incoming;
    private BodyBuffer bodyBuffer;
    private final HttpClient clientForReconnection;
    private final CoroutineContext coroutineContext;
    private final HttpRequestBuilder initialRequest;
    private ByteReadChannel input;
    private String lastEventId;
    private final int maxReconnectionAttempts;
    private boolean needToReconnect;
    private long reconnectionTimeMillis;
    private final boolean showCommentEvents;
    private final boolean showRetryEvents;

    /* JADX INFO: renamed from: io.ktor.client.plugins.sse.DefaultClientSSESession$parseEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: DefaultClientSSESession.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {172, 174, 223}, m = "parseEvent", n = {"$this$parseEvent", "data", "comments", "curRetry", "lastEventId", "wasData", "wasComments", "$this$parseEvent", "data", "comments", "curRetry", "lastEventId", "line", "wasData", "wasComments", "$this$parseEvent", "data", "comments", "eventType", "curRetry", "lastEventId", "line", "wasData", "wasComments"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
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
            return DefaultClientSSESession.this.parseEvent(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.sse.DefaultClientSSESession$readUTF8LineWithSave$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DefaultClientSSESession.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", i = {0}, l = {232}, m = "readUTF8LineWithSave", n = {"$this$readUTF8LineWithSave"}, s = {"L$0"}, v = 1)
    static final class C00581 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00581(Continuation<? super C00581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultClientSSESession.this.readUTF8LineWithSave(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DefaultClientSSESession.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", i = {0}, l = {151}, m = "tryParseEvent", n = {"$this$tryParseEvent"}, s = {"L$0"}, v = 1)
    static final class C00591 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00591(Continuation<? super C00591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultClientSSESession.this.tryParseEvent(null, this);
        }
    }

    public DefaultClientSSESession(SSEClientContent content, ByteReadChannel input, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.input = input;
        this.coroutineContext = coroutineContext;
        this.reconnectionTimeMillis = Duration.m1819getInWholeMillisecondsimpl(content.getReconnectionTime());
        this.showCommentEvents = content.getShowCommentEvents();
        this.showRetryEvents = content.getShowRetryEvents();
        int maxReconnectionAttempts = content.getMaxReconnectionAttempts();
        this.maxReconnectionAttempts = maxReconnectionAttempts;
        this.needToReconnect = maxReconnectionAttempts > 0;
        this.bodyBuffer = SSEBufferPolicyKt.toBodyBuffer(content.getBufferPolicy());
        HttpRequestBuilder initialRequest = content.getInitialRequest();
        this.initialRequest = initialRequest;
        this.clientForReconnection = (HttpClient) initialRequest.getAttributes().get(SSEKt.getSSEClientForReconnectionAttr());
        this._incoming = FlowKt.onCompletion(FlowKt.m2000catch(FlowKt.flow(new DefaultClientSSESession$_incoming$1(this, null)), new DefaultClientSSESession$_incoming$2(this, null)), new DefaultClientSSESession$_incoming$3(this, null));
        JobKt.getJob(getCoroutineContext()).invokeOnCompletion(new Function1() { // from class: io.ktor.client.plugins.sse.DefaultClientSSESession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultClientSSESession._init_$lambda$0(this.f$0, (Throwable) obj);
            }
        });
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    public byte[] bodyBuffer() {
        return this.bodyBuffer.toByteArray();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultClientSSESession(SSEClientContent content, ByteReadChannel input) {
        this(content, input, content.getCallContext().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)).plus(new CoroutineName("DefaultClientSSESession")));
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(input, "input");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(DefaultClientSSESession defaultClientSSESession, Throwable th) {
        defaultClientSSESession.close();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2, reason: invalid class name */
    /* JADX INFO: compiled from: DefaultClientSSESession.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2", f = "DefaultClientSSESession.kt", i = {0, 1, 1, 2, 2, 2}, l = {101, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 110}, m = "invokeSuspend", n = {"retries", "retries", "reconnectionRequest", "retries", "reconnectionRequest", "reconnectionResponse"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2"}, v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultClientSSESession.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x008d A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x001d, B:39:0x0120, B:41:0x0130, B:42:0x0136, B:23:0x0058, B:26:0x007b, B:28:0x008d, B:29:0x00c9, B:32:0x00df, B:34:0x00ef, B:35:0x0109, B:13:0x0032, B:16:0x003c), top: B:56:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00de  */
        /* JADX WARN: Code duplicated, block: B:32:0x00df A[Catch: all -> 0x0040, PHI: r1 r5 r10
          0x00df: PHI (r1v16 io.ktor.client.request.HttpRequestBuilder) = (r1v15 io.ktor.client.request.HttpRequestBuilder), (r1v24 io.ktor.client.request.HttpRequestBuilder) binds: [B:30:0x00dc, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
          0x00df: PHI (r5v3 kotlin.jvm.internal.Ref$IntRef) = (r5v2 kotlin.jvm.internal.Ref$IntRef), (r5v9 kotlin.jvm.internal.Ref$IntRef) binds: [B:30:0x00dc, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
          0x00df: PHI (r10v18 java.lang.Object) = (r10v17 java.lang.Object), (r10v0 java.lang.Object) binds: [B:30:0x00dc, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0040, blocks: (B:8:0x001d, B:39:0x0120, B:41:0x0130, B:42:0x0136, B:23:0x0058, B:26:0x007b, B:28:0x008d, B:29:0x00c9, B:32:0x00df, B:34:0x00ef, B:35:0x0109, B:13:0x0032, B:16:0x003c), top: B:56:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00ef A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x001d, B:39:0x0120, B:41:0x0130, B:42:0x0136, B:23:0x0058, B:26:0x007b, B:28:0x008d, B:29:0x00c9, B:32:0x00df, B:34:0x00ef, B:35:0x0109, B:13:0x0032, B:16:0x003c), top: B:56:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x011f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011f -> B:39:0x0120). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.IntRef intRef;
            HttpRequestBuilder requestForReconnection;
            Logger logger;
            DefaultClientSSESession defaultClientSSESession;
            HttpResponse response;
            Logger logger2;
            HttpResponse httpResponse;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.IntRef intRef2 = new Ref.IntRef();
                    intRef2.element = 1;
                    intRef = intRef2;
                    if (intRef.element <= DefaultClientSSESession.this.maxReconnectionAttempts) {
                        ByteReadChannelKt.cancel(DefaultClientSSESession.this.input);
                        this.L$0 = intRef;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 1;
                        if (DelayKt.delay(DefaultClientSSESession.this.reconnectionTimeMillis, this) != coroutine_suspended) {
                            requestForReconnection = DefaultClientSSESession.this.getRequestForReconnection();
                            logger = SSEKt.getLOGGER();
                            defaultClientSSESession = DefaultClientSSESession.this;
                            if (LoggerJvmKt.isTraceEnabled(logger)) {
                                logger.trace("Sending SSE request " + requestForReconnection.getUrl() + " (attempt " + (intRef.element + 1) + FileSystemKt.UnixPathSeparator + (defaultClientSSESession.maxReconnectionAttempts + 1) + ')');
                            }
                            this.L$0 = intRef;
                            this.L$1 = requestForReconnection;
                            this.label = 2;
                            obj = DefaultClientSSESession.this.clientForReconnection.execute$ktor_client_core(requestForReconnection, this);
                            if (obj == coroutine_suspended) {
                                response = ((HttpClientCall) obj).getResponse();
                                logger2 = SSEKt.getLOGGER();
                                if (LoggerJvmKt.isTraceEnabled(logger2)) {
                                    logger2.trace("Receive response for reconnection SSE request to " + requestForReconnection.getUrl());
                                }
                                this.L$0 = intRef;
                                this.L$1 = SpillingKt.nullOutSpilledVariable(requestForReconnection);
                                this.L$2 = response;
                                this.label = 3;
                                if (SSEKt.checkResponse(response, this) != coroutine_suspended) {
                                    httpResponse = response;
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    intRef = (Ref.IntRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    requestForReconnection = DefaultClientSSESession.this.getRequestForReconnection();
                    logger = SSEKt.getLOGGER();
                    defaultClientSSESession = DefaultClientSSESession.this;
                    if (LoggerJvmKt.isTraceEnabled(logger)) {
                        logger.trace("Sending SSE request " + requestForReconnection.getUrl() + " (attempt " + (intRef.element + 1) + FileSystemKt.UnixPathSeparator + (defaultClientSSESession.maxReconnectionAttempts + 1) + ')');
                    }
                    this.L$0 = intRef;
                    this.L$1 = requestForReconnection;
                    this.label = 2;
                    obj = DefaultClientSSESession.this.clientForReconnection.execute$ktor_client_core(requestForReconnection, this);
                    if (obj == coroutine_suspended) {
                        response = ((HttpClientCall) obj).getResponse();
                        logger2 = SSEKt.getLOGGER();
                        if (LoggerJvmKt.isTraceEnabled(logger2)) {
                            logger2.trace("Receive response for reconnection SSE request to " + requestForReconnection.getUrl());
                        }
                        this.L$0 = intRef;
                        this.L$1 = SpillingKt.nullOutSpilledVariable(requestForReconnection);
                        this.L$2 = response;
                        this.label = 3;
                        if (SSEKt.checkResponse(response, this) != coroutine_suspended) {
                            httpResponse = response;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 2) {
                    requestForReconnection = (HttpRequestBuilder) this.L$1;
                    intRef = (Ref.IntRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    response = ((HttpClientCall) obj).getResponse();
                    logger2 = SSEKt.getLOGGER();
                    if (LoggerJvmKt.isTraceEnabled(logger2)) {
                        logger2.trace("Receive response for reconnection SSE request to " + requestForReconnection.getUrl());
                    }
                    this.L$0 = intRef;
                    this.L$1 = SpillingKt.nullOutSpilledVariable(requestForReconnection);
                    this.L$2 = response;
                    this.label = 3;
                    if (SSEKt.checkResponse(response, this) != coroutine_suspended) {
                        httpResponse = response;
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                httpResponse = (HttpResponse) this.L$2;
                intRef = (Ref.IntRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                if (intRef.element == DefaultClientSSESession.this.maxReconnectionAttempts) {
                    Logger logger3 = SSEKt.getLOGGER();
                    DefaultClientSSESession defaultClientSSESession2 = DefaultClientSSESession.this;
                    if (LoggerJvmKt.isTraceEnabled(logger3)) {
                        logger3.trace("Max retries (" + defaultClientSSESession2.maxReconnectionAttempts + ") reached for SSE reconnection, closing session");
                    }
                    throw th;
                }
                Logger logger4 = SSEKt.getLOGGER();
                if (LoggerJvmKt.isTraceEnabled(logger4)) {
                    logger4.trace("SSE reconnection attempt " + (intRef.element + 1) + " failed");
                }
                intRef.element++;
            }
            if (Intrinsics.areEqual(httpResponse.getStatus(), HttpStatusCode.INSTANCE.getNoContent())) {
                DefaultClientSSESession.this.needToReconnect = false;
            }
            DefaultClientSSESession.this.input = httpResponse.getRawContent();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doReconnection(Continuation<? super Unit> continuation) {
        Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(getCoroutineContext(), new AnonymousClass2(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequestBuilder getRequestForReconnection() {
        HttpRequestBuilder httpRequestBuilderTakeFrom = new HttpRequestBuilder().takeFrom(this.initialRequest);
        httpRequestBuilderTakeFrom.getAttributes().remove(BuildersKt.getSseRequestAttr());
        httpRequestBuilderTakeFrom.getAttributes().put(SSEKt.getSSEReconnectionRequestAttr(), true);
        String str = this.lastEventId;
        if (str != null) {
            httpRequestBuilderTakeFrom.getHeaders().append(HttpHeaders.INSTANCE.getLastEventID(), str);
        }
        return httpRequestBuilderTakeFrom;
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    public Flow<ServerSentEvent> getIncoming() {
        return this._incoming;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close() {
        JobKt__JobKt.cancel$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        ByteReadChannelKt.cancel(this.input);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object tryParseEvent(ByteReadChannel byteReadChannel, Continuation<? super ServerSentEvent> continuation) throws Throwable {
        C00591 c00591;
        if (continuation instanceof C00591) {
            c00591 = (C00591) continuation;
            if ((c00591.label & Integer.MIN_VALUE) != 0) {
                c00591.label -= Integer.MIN_VALUE;
            } else {
                c00591 = new C00591(continuation);
            }
        } else {
            c00591 = new C00591(continuation);
        }
        Object event = c00591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00591.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(event);
                c00591.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
                c00591.label = 1;
                event = parseEvent(byteReadChannel, c00591);
                if (event == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(event);
            }
            return (ServerSentEvent) event;
        } catch (ClosedByteChannelException e) {
            Throwable rootCause = ThrowableKt.getRootCause(e);
            if (rootCause instanceof SocketTimeoutException) {
                throw rootCause;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x011c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0122  */
    /* JADX WARN: Code duplicated, block: B:40:0x0127  */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Code duplicated, block: B:44:0x013a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0150 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0151  */
    /* JADX WARN: Code duplicated, block: B:49:0x015d  */
    /* JADX WARN: Code duplicated, block: B:51:0x016b  */
    /* JADX WARN: Code duplicated, block: B:52:0x017b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0195  */
    /* JADX WARN: Code duplicated, block: B:56:0x019a  */
    /* JADX WARN: Code duplicated, block: B:58:0x019f  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01de  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f3 A[PHI: r15
      0x01f3: PHI (r15v10 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r15v9 kotlin.jvm.internal.Ref$ObjectRef)
      (r15v12 kotlin.jvm.internal.Ref$ObjectRef)
      (r15v13 kotlin.jvm.internal.Ref$ObjectRef)
      (r15v14 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:74:0x01f1, B:70:0x01db, B:68:0x01d0, B:67:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x020e  */
    /* JADX WARN: Code duplicated, block: B:79:0x021a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0221  */
    /* JADX WARN: Code duplicated, block: B:82:0x0234  */
    /* JADX WARN: Code duplicated, block: B:88:0x025a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0265 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x0266  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v19, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0104 -> B:31:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x025a -> B:89:0x0261). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object parseEvent(io.ktor.utils.io.ByteReadChannel r23, kotlin.coroutines.Continuation<? super io.ktor.sse.ServerSentEvent> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.DefaultClientSSESession.parseEvent(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void appendComment(StringBuilder sb, String str) {
        sb.append(StringsKt.removePrefix(StringsKt.removePrefix(str, (CharSequence) ServerSentEventKt.COLON), (CharSequence) ServerSentEventKt.SPACE)).append(ServerSentEventKt.END_OF_LINE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object readUTF8LineWithSave(ByteReadChannel byteReadChannel, Continuation<? super String> continuation) throws Throwable {
        C00581 c00581;
        if (continuation instanceof C00581) {
            c00581 = (C00581) continuation;
            if ((c00581.label & Integer.MIN_VALUE) != 0) {
                c00581.label -= Integer.MIN_VALUE;
            } else {
                c00581 = new C00581(continuation);
            }
        } else {
            c00581 = new C00581(continuation);
        }
        Object uTF8Line$default = c00581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00581.label;
        if (i == 0) {
            ResultKt.throwOnFailure(uTF8Line$default);
            c00581.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
            c00581.label = 1;
            uTF8Line$default = ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel, 0, c00581, 1, null);
            if (uTF8Line$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(uTF8Line$default);
        }
        String str = (String) uTF8Line$default;
        if (str == null) {
            return null;
        }
        this.bodyBuffer.appendLine(str);
        return str;
    }

    private final String toText(StringBuilder sb) {
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.removeSuffix(string, (CharSequence) ServerSentEventKt.END_OF_LINE);
    }

    private final boolean isEmpty(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getId() == null && serverSentEvent.getEvent() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCommentsEvent(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRetryEvent(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getComments() == null && serverSentEvent.getRetry() != null;
    }
}
