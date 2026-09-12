package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.ResponseAdapter;
import io.ktor.http.Headers;
import io.ktor.http.HeadersImpl;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpMethodKt;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.http.cio.ChunkedTransferEncodingKt;
import io.ktor.http.cio.ConnectionOptions;
import io.ktor.http.cio.HttpHeadersMap;
import io.ktor.http.cio.HttpParserKt;
import io.ktor.http.cio.RequestResponseBuilder;
import io.ktor.http.cio.Response;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ClosedReadChannelException;
import io.ktor.utils.io.ReaderJob;
import io.ktor.utils.io.ReaderScope;
import io.ktor.websocket.RawWebSocketJvmKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.io.Source;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a:\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a2\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a(\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a8\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u001c\u0010\u001d\u001a(\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0#0!*\u00020 H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010'\u001a\u00020\u0006*\u00020&H\u0000¢\u0006\u0004\b'\u0010(\u001a%\u0010+\u001a\u00020\u0002*\u00020\u00022\u0006\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u0006H\u0000¢\u0006\u0004\b+\u0010,\u001a#\u0010.\u001a\u00020\u0002*\u00020\u00022\u0006\u0010)\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0006H\u0000¢\u0006\u0004\b.\u0010,\u001a-\u00102\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\"2\b\u00100\u001a\u0004\u0018\u00010\"2\b\u00101\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b2\u00103\u001a!\u00105\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b5\u00106¨\u00067"}, d2 = {"Lio/ktor/client/request/HttpRequestData;", "request", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "Lkotlin/coroutines/CoroutineContext;", "callContext", "", "overProxy", "closeChannel", "", "writeRequest", "(Lio/ktor/client/request/HttpRequestData;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeHeaders", "(Lio/ktor/client/request/HttpRequestData;Lio/ktor/utils/io/ByteWriteChannel;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeBody", "(Lio/ktor/client/request/HttpRequestData;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/content/OutgoingContent;", "getUnwrapped", "(Lio/ktor/http/content/OutgoingContent;)Lio/ktor/http/content/OutgoingContent;", "body", "channel", "processOutgoingContent", "(Lio/ktor/client/request/HttpRequestData;Lio/ktor/http/content/OutgoingContent;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/util/date/GMTDate;", "requestTime", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/client/request/HttpResponseData;", "readResponse", "(Lio/ktor/util/date/GMTDate;Lio/ktor/client/request/HttpRequestData;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTunnel", "(Lio/ktor/client/request/HttpRequestData;Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/cio/HttpHeadersMap;", "", "", "", "toMap", "(Lio/ktor/http/cio/HttpHeadersMap;)Ljava/util/Map;", "Lio/ktor/http/HttpStatusCode;", "isInformational", "(Lio/ktor/http/HttpStatusCode;)Z", "coroutineContext", "closeOnCoroutineCompletion", "withoutClosePropagation", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;Z)Lio/ktor/utils/io/ByteWriteChannel;", "propagateClose", "handleHalfClosed", "contentLength", "responseEncoding", "contentEncoding", "isChunked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "expectHeader", "expectContinue", "(Ljava/lang/String;Lio/ktor/http/content/OutgoingContent;)Z", "ktor-client-cio"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UtilsKt {

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.UtilsKt$startTunnel$1, reason: invalid class name */
    /* JADX INFO: compiled from: utils.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.UtilsKt", f = "utils.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {240, 241, 243, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "startTunnel", n = {"request", "output", "input", "builder", "hostWithPort", "request", "output", "input", "builder", "hostWithPort", "request", "output", "input", "builder", "hostWithPort", "request", "output", "input", "builder", "hostWithPort", "rawResponse", "it", "it", "$i$a$-use-UtilsKt$startTunnel$5", "$i$a$-let-UtilsKt$startTunnel$5$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "I$0", "I$1"}, v = 1)
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
            return UtilsKt.startTunnel(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.UtilsKt$writeHeaders$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: utils.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.UtilsKt", f = "utils.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {91, 92, 95}, m = "writeHeaders", n = {"request", "output", "builder", "method", "url", "headers", "body", "contentLength", "contentEncoding", "responseEncoding", "expected", "normalizedUrl", "urlString", "overProxy", "closeChannel", "chunked", "hasContent", "request", "output", "builder", "method", "url", "headers", "body", "contentLength", "contentEncoding", "responseEncoding", "expected", "normalizedUrl", "urlString", "overProxy", "closeChannel", "chunked", "hasContent", "request", "output", "builder", "method", "url", "headers", "body", "contentLength", "contentEncoding", "responseEncoding", "expected", "cause", "overProxy", "closeChannel", "chunked"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "Z$0", "Z$1", "Z$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "Z$0", "Z$1", "Z$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "Z$0", "Z$1", "Z$2"}, v = 1)
    static final class C00401 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        int label;
        /* synthetic */ Object result;

        C00401(Continuation<? super C00401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UtilsKt.writeHeaders(null, null, false, false, this);
        }
    }

    public static /* synthetic */ Object writeRequest$default(HttpRequestData httpRequestData, ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z, boolean z2, Continuation continuation, int i, Object obj) {
        if ((i & 16) != 0) {
            z2 = true;
        }
        return writeRequest(httpRequestData, byteWriteChannel, coroutineContext, z, z2, continuation);
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.UtilsKt$writeRequest$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: utils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.UtilsKt$writeRequest$2", f = "utils.kt", i = {}, l = {30, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C00412 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $callContext;
        final /* synthetic */ boolean $closeChannel;
        final /* synthetic */ ByteWriteChannel $output;
        final /* synthetic */ boolean $overProxy;
        final /* synthetic */ HttpRequestData $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00412(HttpRequestData httpRequestData, ByteWriteChannel byteWriteChannel, boolean z, boolean z2, CoroutineContext coroutineContext, Continuation<? super C00412> continuation) {
            super(2, continuation);
            this.$request = httpRequestData;
            this.$output = byteWriteChannel;
            this.$overProxy = z;
            this.$closeChannel = z2;
            this.$callContext = coroutineContext;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C00412(this.$request, this.$output, this.$overProxy, this.$closeChannel, this.$callContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C00412) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (io.ktor.client.engine.cio.UtilsKt.writeBody$default(r10.$request, r10.$output, r10.$callContext, false, r10, 8, null) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r11)
                goto L4b
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L35
            L1e:
                kotlin.ResultKt.throwOnFailure(r11)
                io.ktor.client.request.HttpRequestData r11 = r10.$request
                io.ktor.utils.io.ByteWriteChannel r1 = r10.$output
                boolean r4 = r10.$overProxy
                boolean r5 = r10.$closeChannel
                r6 = r10
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r10.label = r3
                java.lang.Object r11 = io.ktor.client.engine.cio.UtilsKt.writeHeaders(r11, r1, r4, r5, r6)
                if (r11 != r0) goto L35
                goto L4a
            L35:
                io.ktor.client.request.HttpRequestData r3 = r10.$request
                io.ktor.utils.io.ByteWriteChannel r4 = r10.$output
                kotlin.coroutines.CoroutineContext r5 = r10.$callContext
                r7 = r10
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r10.label = r2
                r6 = 0
                r8 = 8
                r9 = 0
                java.lang.Object r11 = io.ktor.client.engine.cio.UtilsKt.writeBody$default(r3, r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.UtilsKt.C00412.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object writeRequest(HttpRequestData httpRequestData, ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z, boolean z2, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(coroutineContext, new C00412(httpRequestData, byteWriteChannel, z, z2, coroutineContext, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:109:0x03be  */
    /* JADX WARN: Code duplicated, block: B:125:0x0364 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0232  */
    /* JADX WARN: Code duplicated, block: B:78:0x025b A[Catch: all -> 0x020e, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x020e, blocks: (B:52:0x01e9, B:54:0x01f7, B:56:0x0200, B:55:0x01fc, B:63:0x0219, B:66:0x0221, B:73:0x0242, B:75:0x0246, B:78:0x025b), top: B:131:0x01e9 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:88:0x033a  */
    public static final Object writeHeaders(HttpRequestData httpRequestData, ByteWriteChannel byteWriteChannel, boolean z, boolean z2, Continuation<? super Unit> continuation) throws Throwable {
        C00401 c00401;
        final RequestResponseBuilder requestResponseBuilder;
        String str;
        boolean zIsChunked;
        String str2;
        boolean z3;
        String str3;
        HttpMethod httpMethod;
        Url url;
        Headers headers;
        OutgoingContent outgoingContent;
        String str4;
        String str5;
        String str6;
        HttpRequestData httpRequestData2;
        Url urlBuild;
        Url url2;
        String hostWithPort;
        int i;
        Source sourceBuild;
        int i2;
        boolean z4;
        String str7;
        RequestResponseBuilder requestResponseBuilder2;
        boolean z5;
        String str8;
        RequestResponseBuilder requestResponseBuilder3;
        RequestResponseBuilder requestResponseBuilder4;
        Throwable th;
        ByteWriteChannel byteWriteChannel2 = byteWriteChannel;
        boolean z6 = z;
        if (continuation instanceof C00401) {
            c00401 = (C00401) continuation;
            if ((c00401.label & Integer.MIN_VALUE) != 0) {
                c00401.label -= Integer.MIN_VALUE;
            } else {
                c00401 = new C00401(continuation);
            }
        } else {
            c00401 = new C00401(continuation);
        }
        Object obj = c00401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c00401.label;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = c00401.I$0;
                boolean z7 = c00401.Z$2;
                z4 = c00401.Z$1;
                z5 = c00401.Z$0;
                String str9 = (String) c00401.L$12;
                Url url3 = (Url) c00401.L$11;
                str7 = (String) c00401.L$10;
                str6 = (String) c00401.L$9;
                str5 = (String) c00401.L$8;
                str4 = (String) c00401.L$7;
                outgoingContent = (OutgoingContent) c00401.L$6;
                headers = (Headers) c00401.L$5;
                url = (Url) c00401.L$4;
                HttpMethod httpMethod2 = (HttpMethod) c00401.L$3;
                RequestResponseBuilder requestResponseBuilder5 = (RequestResponseBuilder) c00401.L$2;
                ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) c00401.L$1;
                httpRequestData2 = (HttpRequestData) c00401.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    i2 = i4;
                    str8 = str9;
                    httpMethod = httpMethod2;
                    requestResponseBuilder2 = requestResponseBuilder5;
                    url2 = url3;
                    zIsChunked = z7;
                    byteWriteChannel2 = byteWriteChannel3;
                    try {
                        c00401.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData2);
                        c00401.L$1 = byteWriteChannel2;
                        c00401.L$2 = requestResponseBuilder2;
                        c00401.L$3 = SpillingKt.nullOutSpilledVariable(httpMethod);
                        c00401.L$4 = SpillingKt.nullOutSpilledVariable(url);
                        c00401.L$5 = SpillingKt.nullOutSpilledVariable(headers);
                        c00401.L$6 = SpillingKt.nullOutSpilledVariable(outgoingContent);
                        c00401.L$7 = SpillingKt.nullOutSpilledVariable(str4);
                        c00401.L$8 = SpillingKt.nullOutSpilledVariable(str5);
                        c00401.L$9 = SpillingKt.nullOutSpilledVariable(str6);
                        c00401.L$10 = SpillingKt.nullOutSpilledVariable(str7);
                        c00401.L$11 = SpillingKt.nullOutSpilledVariable(url2);
                        c00401.L$12 = SpillingKt.nullOutSpilledVariable(str8);
                        c00401.Z$0 = z5;
                        c00401.Z$1 = z4;
                        c00401.Z$2 = zIsChunked;
                        c00401.I$0 = i2;
                        c00401.label = 2;
                        if (byteWriteChannel2.flush(c00401) != coroutine_suspended) {
                            requestResponseBuilder3 = requestResponseBuilder2;
                            requestResponseBuilder3.release();
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        String str10 = str7;
                        z3 = z4;
                        z6 = z5;
                        requestResponseBuilder = requestResponseBuilder2;
                        str2 = str10;
                        if (z3) {
                            try {
                                c00401.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData2);
                                c00401.L$1 = SpillingKt.nullOutSpilledVariable(byteWriteChannel2);
                                c00401.L$2 = requestResponseBuilder;
                                c00401.L$3 = SpillingKt.nullOutSpilledVariable(httpMethod);
                                c00401.L$4 = SpillingKt.nullOutSpilledVariable(url);
                                c00401.L$5 = SpillingKt.nullOutSpilledVariable(headers);
                                c00401.L$6 = SpillingKt.nullOutSpilledVariable(outgoingContent);
                                c00401.L$7 = SpillingKt.nullOutSpilledVariable(str4);
                                c00401.L$8 = SpillingKt.nullOutSpilledVariable(str5);
                                c00401.L$9 = SpillingKt.nullOutSpilledVariable(str6);
                                c00401.L$10 = SpillingKt.nullOutSpilledVariable(str2);
                                c00401.L$11 = th;
                                c00401.L$12 = null;
                                c00401.Z$0 = z6;
                                c00401.Z$1 = z3;
                                c00401.Z$2 = zIsChunked;
                                c00401.label = 3;
                                if (byteWriteChannel2.flushAndClose(c00401) != coroutine_suspended) {
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                requestResponseBuilder4 = requestResponseBuilder;
                                requestResponseBuilder4.release();
                                throw th;
                            }
                        } else {
                            requestResponseBuilder4 = requestResponseBuilder;
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    zIsChunked = z7;
                    httpMethod = httpMethod2;
                    str2 = str7;
                    byteWriteChannel2 = byteWriteChannel3;
                    z3 = z4;
                    z6 = z5;
                    requestResponseBuilder = requestResponseBuilder5;
                }
                return coroutine_suspended;
            }
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z8 = c00401.Z$2;
                boolean z9 = c00401.Z$1;
                boolean z10 = c00401.Z$0;
                th = (Throwable) c00401.L$11;
                requestResponseBuilder4 = (RequestResponseBuilder) c00401.L$2;
                try {
                    ResultKt.throwOnFailure(obj);
                    throw th;
                } catch (Throwable th5) {
                    th = th5;
                    requestResponseBuilder4.release();
                    throw th;
                }
            }
            int i5 = c00401.I$0;
            boolean z11 = c00401.Z$2;
            boolean z12 = c00401.Z$1;
            boolean z13 = c00401.Z$0;
            str2 = (String) c00401.L$10;
            String str11 = (String) c00401.L$9;
            String str12 = (String) c00401.L$8;
            String str13 = (String) c00401.L$7;
            OutgoingContent outgoingContent2 = (OutgoingContent) c00401.L$6;
            Headers headers2 = (Headers) c00401.L$5;
            Url url4 = (Url) c00401.L$4;
            HttpMethod httpMethod3 = (HttpMethod) c00401.L$3;
            requestResponseBuilder3 = (RequestResponseBuilder) c00401.L$2;
            ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) c00401.L$1;
            HttpRequestData httpRequestData3 = (HttpRequestData) c00401.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                requestResponseBuilder3.release();
                return Unit.INSTANCE;
            } catch (Throwable th6) {
                th = th6;
                httpMethod = httpMethod3;
                httpRequestData2 = httpRequestData3;
                url = url4;
                headers = headers2;
                outgoingContent = outgoingContent2;
                str4 = str13;
                str5 = str12;
                str6 = str11;
                z3 = z12;
                z6 = z13;
                requestResponseBuilder = requestResponseBuilder3;
                zIsChunked = z11;
                byteWriteChannel2 = byteWriteChannel4;
            }
            if (z3) {
                c00401.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData2);
                c00401.L$1 = SpillingKt.nullOutSpilledVariable(byteWriteChannel2);
                c00401.L$2 = requestResponseBuilder;
                c00401.L$3 = SpillingKt.nullOutSpilledVariable(httpMethod);
                c00401.L$4 = SpillingKt.nullOutSpilledVariable(url);
                c00401.L$5 = SpillingKt.nullOutSpilledVariable(headers);
                c00401.L$6 = SpillingKt.nullOutSpilledVariable(outgoingContent);
                c00401.L$7 = SpillingKt.nullOutSpilledVariable(str4);
                c00401.L$8 = SpillingKt.nullOutSpilledVariable(str5);
                c00401.L$9 = SpillingKt.nullOutSpilledVariable(str6);
                c00401.L$10 = SpillingKt.nullOutSpilledVariable(str2);
                c00401.L$11 = th;
                c00401.L$12 = null;
                c00401.Z$0 = z6;
                c00401.Z$1 = z3;
                c00401.Z$2 = zIsChunked;
                c00401.label = 3;
                if (byteWriteChannel2.flushAndClose(c00401) != coroutine_suspended) {
                    th = th;
                    throw th;
                }
                return coroutine_suspended;
            }
            requestResponseBuilder4 = requestResponseBuilder;
            throw th;
        }
        ResultKt.throwOnFailure(obj);
        requestResponseBuilder = new RequestResponseBuilder();
        HttpMethod method = httpRequestData.getMethod();
        Url url5 = httpRequestData.getUrl();
        Headers headers3 = httpRequestData.getHeaders();
        OutgoingContent body = httpRequestData.getBody();
        String strValueOf = headers3.get(HttpHeaders.INSTANCE.getContentLength());
        if (strValueOf != null) {
            str = strValueOf;
        } else {
            Long contentLength = body.getContentLength();
            if (contentLength != null) {
                strValueOf = String.valueOf(contentLength.longValue());
                str = strValueOf;
            } else {
                str = null;
            }
        }
        String str14 = headers3.get(HttpHeaders.INSTANCE.getTransferEncoding());
        String str15 = body.getHeaders().get(HttpHeaders.INSTANCE.getTransferEncoding());
        zIsChunked = isChunked(str, str15, str14);
        str2 = headers3.get(HttpHeaders.INSTANCE.getExpect());
        try {
            if (url5.getRawSegments().isEmpty()) {
                try {
                    URLBuilder URLBuilder = URLUtilsKt.URLBuilder(url5);
                    URLBuilderKt.setEncodedPath(URLBuilder, "/");
                    urlBuild = URLBuilder.build();
                } catch (Throwable th7) {
                    th = th7;
                    httpRequestData2 = httpRequestData;
                    z3 = z2;
                    httpMethod = method;
                    url = url5;
                    headers = headers3;
                    outgoingContent = body;
                    str4 = str;
                    str5 = str14;
                    str6 = str15;
                }
            } else {
                urlBuild = url5;
            }
            String urlString = z6 ? urlBuild.getUrlString() : URLUtilsKt.getFullPath(urlBuild);
            url2 = urlBuild;
            str3 = str15;
            try {
                requestResponseBuilder.requestLine(method, urlString, HttpProtocolVersion.INSTANCE.getHTTP_1_1().toString());
                if (!headers3.contains(HttpHeaders.INSTANCE.getHost())) {
                    try {
                        if (url5.getProtocol().getDefaultPort() == url5.getPort()) {
                            hostWithPort = url5.getHost();
                        } else {
                            hostWithPort = URLUtilsKt.getHostWithPort(url5);
                        }
                        requestResponseBuilder.headerLine(HttpHeaders.INSTANCE.getHost(), hostWithPort);
                        boolean z14 = body instanceof OutgoingContent.NoContent;
                        i = !z14 ? 1 : 0;
                        if (str == null && (HttpMethodKt.getSupportsRequestBody(method) || !z14)) {
                            requestResponseBuilder.headerLine(HttpHeaders.INSTANCE.getContentLength(), str);
                        }
                        io.ktor.client.engine.UtilsKt.mergeHeaders(headers3, body, new Function2() { // from class: io.ktor.client.engine.cio.UtilsKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return UtilsKt.writeHeaders$lambda$1(requestResponseBuilder, (String) obj2, (String) obj3);
                            }
                        });
                        if (zIsChunked && str14 == null && str3 == null && !(body instanceof OutgoingContent.NoContent)) {
                            requestResponseBuilder.headerLine(HttpHeaders.INSTANCE.getTransferEncoding(), "chunked");
                        }
                        if (expectContinue(str2, body)) {
                            String expect = HttpHeaders.INSTANCE.getExpect();
                            Intrinsics.checkNotNull(str2);
                            requestResponseBuilder.headerLine(expect, str2);
                        }
                        requestResponseBuilder.emptyLine();
                        sourceBuild = requestResponseBuilder.build();
                        c00401.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData);
                        c00401.L$1 = byteWriteChannel2;
                        c00401.L$2 = requestResponseBuilder;
                        c00401.L$3 = SpillingKt.nullOutSpilledVariable(method);
                        c00401.L$4 = SpillingKt.nullOutSpilledVariable(url5);
                        c00401.L$5 = SpillingKt.nullOutSpilledVariable(headers3);
                        c00401.L$6 = SpillingKt.nullOutSpilledVariable(body);
                        c00401.L$7 = SpillingKt.nullOutSpilledVariable(str);
                        c00401.L$8 = SpillingKt.nullOutSpilledVariable(str14);
                        c00401.L$9 = SpillingKt.nullOutSpilledVariable(str3);
                        c00401.L$10 = SpillingKt.nullOutSpilledVariable(str2);
                        c00401.L$11 = SpillingKt.nullOutSpilledVariable(url2);
                        c00401.L$12 = SpillingKt.nullOutSpilledVariable(urlString);
                        c00401.Z$0 = z6;
                        z3 = z2;
                        try {
                            c00401.Z$1 = z3;
                            c00401.Z$2 = zIsChunked;
                            c00401.I$0 = i;
                            c00401.label = 1;
                            if (ByteWriteChannelOperationsKt.writePacket(byteWriteChannel2, sourceBuild, c00401) != coroutine_suspended) {
                                i2 = i;
                                z4 = z3;
                                httpMethod = method;
                                str7 = str2;
                                url = url5;
                                requestResponseBuilder2 = requestResponseBuilder;
                                headers = headers3;
                                z5 = z;
                                outgoingContent = body;
                                str4 = str;
                                str5 = str14;
                                str6 = str3;
                                httpRequestData2 = httpRequestData;
                                str8 = urlString;
                                c00401.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData2);
                                c00401.L$1 = byteWriteChannel2;
                                c00401.L$2 = requestResponseBuilder2;
                                c00401.L$3 = SpillingKt.nullOutSpilledVariable(httpMethod);
                                c00401.L$4 = SpillingKt.nullOutSpilledVariable(url);
                                c00401.L$5 = SpillingKt.nullOutSpilledVariable(headers);
                                c00401.L$6 = SpillingKt.nullOutSpilledVariable(outgoingContent);
                                c00401.L$7 = SpillingKt.nullOutSpilledVariable(str4);
                                c00401.L$8 = SpillingKt.nullOutSpilledVariable(str5);
                                c00401.L$9 = SpillingKt.nullOutSpilledVariable(str6);
                                c00401.L$10 = SpillingKt.nullOutSpilledVariable(str7);
                                c00401.L$11 = SpillingKt.nullOutSpilledVariable(url2);
                                c00401.L$12 = SpillingKt.nullOutSpilledVariable(str8);
                                c00401.Z$0 = z5;
                                c00401.Z$1 = z4;
                                c00401.Z$2 = zIsChunked;
                                c00401.I$0 = i2;
                                c00401.label = 2;
                                if (byteWriteChannel2.flush(c00401) != coroutine_suspended) {
                                    requestResponseBuilder3 = requestResponseBuilder2;
                                    requestResponseBuilder3.release();
                                    return Unit.INSTANCE;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            z6 = z;
                            httpMethod = method;
                            url = url5;
                            headers = headers3;
                            outgoingContent = body;
                            str4 = str;
                            str5 = str14;
                            str6 = str3;
                            httpRequestData2 = httpRequestData;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        z3 = z2;
                        httpMethod = method;
                        url = url5;
                        headers = headers3;
                        outgoingContent = body;
                        str4 = str;
                        str5 = str14;
                        str6 = str3;
                        httpRequestData2 = httpRequestData;
                    }
                } else {
                    boolean z15 = body instanceof OutgoingContent.NoContent;
                    i = !z15 ? 1 : 0;
                    if (str == null) {
                    }
                    io.ktor.client.engine.UtilsKt.mergeHeaders(headers3, body, new Function2() { // from class: io.ktor.client.engine.cio.UtilsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return UtilsKt.writeHeaders$lambda$1(requestResponseBuilder, (String) obj2, (String) obj3);
                        }
                    });
                    if (zIsChunked) {
                        requestResponseBuilder.headerLine(HttpHeaders.INSTANCE.getTransferEncoding(), "chunked");
                    }
                    if (expectContinue(str2, body)) {
                        String expect2 = HttpHeaders.INSTANCE.getExpect();
                        Intrinsics.checkNotNull(str2);
                        requestResponseBuilder.headerLine(expect2, str2);
                    }
                    requestResponseBuilder.emptyLine();
                    sourceBuild = requestResponseBuilder.build();
                    c00401.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData);
                    c00401.L$1 = byteWriteChannel2;
                    c00401.L$2 = requestResponseBuilder;
                    c00401.L$3 = SpillingKt.nullOutSpilledVariable(method);
                    c00401.L$4 = SpillingKt.nullOutSpilledVariable(url5);
                    c00401.L$5 = SpillingKt.nullOutSpilledVariable(headers3);
                    c00401.L$6 = SpillingKt.nullOutSpilledVariable(body);
                    c00401.L$7 = SpillingKt.nullOutSpilledVariable(str);
                    c00401.L$8 = SpillingKt.nullOutSpilledVariable(str14);
                    c00401.L$9 = SpillingKt.nullOutSpilledVariable(str3);
                    c00401.L$10 = SpillingKt.nullOutSpilledVariable(str2);
                    c00401.L$11 = SpillingKt.nullOutSpilledVariable(url2);
                    c00401.L$12 = SpillingKt.nullOutSpilledVariable(urlString);
                    c00401.Z$0 = z6;
                    z3 = z2;
                    c00401.Z$1 = z3;
                    c00401.Z$2 = zIsChunked;
                    c00401.I$0 = i;
                    c00401.label = 1;
                    if (ByteWriteChannelOperationsKt.writePacket(byteWriteChannel2, sourceBuild, c00401) != coroutine_suspended) {
                        i2 = i;
                        z4 = z3;
                        httpMethod = method;
                        str7 = str2;
                        url = url5;
                        requestResponseBuilder2 = requestResponseBuilder;
                        headers = headers3;
                        z5 = z;
                        outgoingContent = body;
                        str4 = str;
                        str5 = str14;
                        str6 = str3;
                        httpRequestData2 = httpRequestData;
                        str8 = urlString;
                        c00401.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData2);
                        c00401.L$1 = byteWriteChannel2;
                        c00401.L$2 = requestResponseBuilder2;
                        c00401.L$3 = SpillingKt.nullOutSpilledVariable(httpMethod);
                        c00401.L$4 = SpillingKt.nullOutSpilledVariable(url);
                        c00401.L$5 = SpillingKt.nullOutSpilledVariable(headers);
                        c00401.L$6 = SpillingKt.nullOutSpilledVariable(outgoingContent);
                        c00401.L$7 = SpillingKt.nullOutSpilledVariable(str4);
                        c00401.L$8 = SpillingKt.nullOutSpilledVariable(str5);
                        c00401.L$9 = SpillingKt.nullOutSpilledVariable(str6);
                        c00401.L$10 = SpillingKt.nullOutSpilledVariable(str7);
                        c00401.L$11 = SpillingKt.nullOutSpilledVariable(url2);
                        c00401.L$12 = SpillingKt.nullOutSpilledVariable(str8);
                        c00401.Z$0 = z5;
                        c00401.Z$1 = z4;
                        c00401.Z$2 = zIsChunked;
                        c00401.I$0 = i2;
                        c00401.label = 2;
                        if (byteWriteChannel2.flush(c00401) != coroutine_suspended) {
                            requestResponseBuilder3 = requestResponseBuilder2;
                            requestResponseBuilder3.release();
                            return Unit.INSTANCE;
                        }
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                z3 = z2;
            }
        } catch (Throwable th11) {
            th = th11;
            z3 = z2;
            str3 = str15;
        }
        return coroutine_suspended;
    }

    public static /* synthetic */ Object writeHeaders$default(HttpRequestData httpRequestData, ByteWriteChannel byteWriteChannel, boolean z, boolean z2, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return writeHeaders(httpRequestData, byteWriteChannel, z, z2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeHeaders$lambda$1(RequestResponseBuilder requestResponseBuilder, String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(key, HttpHeaders.INSTANCE.getContentLength()) || Intrinsics.areEqual(key, HttpHeaders.INSTANCE.getExpect())) {
            return Unit.INSTANCE;
        }
        requestResponseBuilder.headerLine(key, value);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object writeBody$default(HttpRequestData httpRequestData, ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return writeBody(httpRequestData, byteWriteChannel, coroutineContext, z, continuation);
    }

    public static final Object writeBody(HttpRequestData httpRequestData, ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z, Continuation<? super Unit> continuation) {
        ByteWriteChannel channel;
        OutgoingContent unwrapped = getUnwrapped(httpRequestData.getBody());
        if (unwrapped instanceof OutgoingContent.NoContent) {
            if (z) {
                ByteWriteChannelKt.close(byteWriteChannel);
            }
            return Unit.INSTANCE;
        }
        if (unwrapped instanceof OutgoingContent.ProtocolUpgrade) {
            throw new UnsupportedContentTypeException(unwrapped);
        }
        String strValueOf = httpRequestData.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
        if (strValueOf == null) {
            Long contentLength = unwrapped.getContentLength();
            strValueOf = contentLength != null ? String.valueOf(contentLength.longValue()) : null;
        }
        ReaderJob readerJobEncodeChunked = isChunked(strValueOf, unwrapped.getHeaders().get(HttpHeaders.INSTANCE.getTransferEncoding()), httpRequestData.getHeaders().get(HttpHeaders.INSTANCE.getTransferEncoding())) ? ChunkedTransferEncodingKt.encodeChunked(byteWriteChannel, coroutineContext) : null;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineContext.plus(new CoroutineName("cio-client-body-writer"))), null, null, new C00392(httpRequestData, unwrapped, (readerJobEncodeChunked == null || (channel = readerJobEncodeChunked.getChannel()) == null) ? byteWriteChannel : channel, readerJobEncodeChunked, byteWriteChannel, z, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.UtilsKt$writeBody$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: utils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.UtilsKt$writeBody$2", f = "utils.kt", i = {}, l = {130, 135, 137, 135, 137}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C00392 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OutgoingContent $body;
        final /* synthetic */ ByteWriteChannel $channel;
        final /* synthetic */ ReaderJob $chunkedJob;
        final /* synthetic */ boolean $closeChannel;
        final /* synthetic */ ByteWriteChannel $output;
        final /* synthetic */ HttpRequestData $request;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00392(HttpRequestData httpRequestData, OutgoingContent outgoingContent, ByteWriteChannel byteWriteChannel, ReaderJob readerJob, ByteWriteChannel byteWriteChannel2, boolean z, Continuation<? super C00392> continuation) {
            super(2, continuation);
            this.$request = httpRequestData;
            this.$body = outgoingContent;
            this.$channel = byteWriteChannel;
            this.$chunkedJob = readerJob;
            this.$output = byteWriteChannel2;
            this.$closeChannel = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C00392(this.$request, this.$body, this.$channel, this.$chunkedJob, this.$output, this.$closeChannel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C00392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0077  */
        /* JADX WARN: Code duplicated, block: B:42:0x0097  */
        /* JADX WARN: Code duplicated, block: B:45:0x009b  */
        /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:78:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:81:0x00fd  */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        
            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.join(r11, r10) == r0) goto L66;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.UtilsKt.C00392.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static final OutgoingContent getUnwrapped(OutgoingContent outgoingContent) {
        return outgoingContent instanceof OutgoingContent.ContentWrapper ? getUnwrapped(((OutgoingContent.ContentWrapper) outgoingContent).getDelegate()) : outgoingContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object processOutgoingContent(HttpRequestData httpRequestData, OutgoingContent outgoingContent, ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) throws Throwable {
        if (outgoingContent instanceof OutgoingContent.ByteArrayContent) {
            Object objWriteFully$default = ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, ((OutgoingContent.ByteArrayContent) outgoingContent).getBytes(), 0, 0, continuation, 6, null);
            return objWriteFully$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFully$default : Unit.INSTANCE;
        }
        if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
            Object objCopyAndClose = ByteReadChannelOperationsKt.copyAndClose(((OutgoingContent.ReadChannelContent) outgoingContent).readFrom(), byteWriteChannel, continuation);
            return objCopyAndClose == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCopyAndClose : Unit.INSTANCE;
        }
        if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
            Object objWriteTo = ((OutgoingContent.WriteChannelContent) outgoingContent).writeTo(byteWriteChannel, continuation);
            return objWriteTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteTo : Unit.INSTANCE;
        }
        if (outgoingContent instanceof OutgoingContent.ContentWrapper) {
            Object objProcessOutgoingContent = processOutgoingContent(httpRequestData, ((OutgoingContent.ContentWrapper) outgoingContent).getDelegate(), byteWriteChannel, continuation);
            return objProcessOutgoingContent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objProcessOutgoingContent : Unit.INSTANCE;
        }
        if (outgoingContent instanceof OutgoingContent.ProtocolUpgrade) {
            throw new IllegalStateException("unreachable code".toString());
        }
        if (outgoingContent instanceof OutgoingContent.NoContent) {
            throw new IllegalStateException("unreachable code".toString());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.UtilsKt$readResponse$2, reason: invalid class name */
    /* JADX INFO: compiled from: utils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/request/HttpResponseData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2", f = "utils.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpResponseData>, Object> {
        final /* synthetic */ CoroutineContext $callContext;
        final /* synthetic */ ByteReadChannel $input;
        final /* synthetic */ ByteWriteChannel $output;
        final /* synthetic */ HttpRequestData $request;
        final /* synthetic */ GMTDate $requestTime;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, GMTDate gMTDate, HttpRequestData httpRequestData, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$input = byteReadChannel;
            this.$output = byteWriteChannel;
            this.$callContext = coroutineContext;
            this.$requestTime = gMTDate;
            this.$request = httpRequestData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$input, this.$output, this.$callContext, this.$requestTime, this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpResponseData> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object response;
            HttpProtocolVersion httpProtocolVersion;
            ByteReadChannel empty;
            HttpStatusCode httpStatusCode;
            Object obj2;
            String string;
            Long longOrNull;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                response = HttpParserKt.parseResponse(this.$input, this);
                if (response == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                response = obj;
            }
            Response response2 = (Response) response;
            if (response2 == null) {
                throw new ClosedReadChannelException(new EOFException("Failed to parse HTTP response: the server prematurely closed the connection"));
            }
            Response response3 = response2;
            ByteReadChannel byteReadChannel = this.$input;
            ByteWriteChannel byteWriteChannel = this.$output;
            CoroutineContext coroutineContext = this.$callContext;
            GMTDate gMTDate = this.$requestTime;
            HttpRequestData httpRequestData = this.$request;
            try {
                HttpStatusCode httpStatusCode2 = new HttpStatusCode(response2.getStatus(), response2.getStatusText().toString());
                CharSequence charSequence = response2.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
                long jLongValue = (charSequence == null || (string = charSequence.toString()) == null || (longOrNull = StringsKt.toLongOrNull(string)) == null) ? -1L : longOrNull.longValue();
                CharSequence charSequence2 = response2.getHeaders().get(HttpHeaders.INSTANCE.getTransferEncoding());
                String string2 = charSequence2 != null ? charSequence2.toString() : null;
                ConnectionOptions connectionOptions = ConnectionOptions.INSTANCE.parse(response2.getHeaders().get(HttpHeaders.INSTANCE.getConnection()));
                HeadersImpl headersImpl = new HeadersImpl(UtilsKt.toMap(response2.getHeaders()));
                HttpProtocolVersion httpProtocolVersion2 = HttpProtocolVersion.INSTANCE.parse(response2.getVersion());
                if (Intrinsics.areEqual(httpStatusCode2, HttpStatusCode.INSTANCE.getSwitchingProtocols())) {
                    HttpResponseData httpResponseData = new HttpResponseData(httpStatusCode2, gMTDate, headersImpl, httpProtocolVersion2, RawWebSocketJvmKt.RawWebSocket$default(byteReadChannel, byteWriteChannel, 0L, true, coroutineContext, 4, null), coroutineContext);
                    CloseableKt.closeFinally(response3, null);
                    return httpResponseData;
                }
                if (Intrinsics.areEqual(httpRequestData.getMethod(), HttpMethod.INSTANCE.getHead()) || CollectionsKt.listOf((Object[]) new HttpStatusCode[]{HttpStatusCode.INSTANCE.getNotModified(), HttpStatusCode.INSTANCE.getNoContent()}).contains(httpStatusCode2) || UtilsKt.isInformational(httpStatusCode2)) {
                    httpProtocolVersion = httpProtocolVersion2;
                    empty = ByteReadChannel.INSTANCE.getEmpty();
                } else {
                    httpProtocolVersion = httpProtocolVersion2;
                    empty = ByteWriteChannelOperationsKt.writer$default(CoroutineScopeKt.CoroutineScope(coroutineContext.plus(new CoroutineName("cio-client-body-reader"))), (CoroutineContext) null, true, (Function2) new UtilsKt$readResponse$2$1$body$httpBodyParser$1(httpProtocolVersion, jLongValue, string2, connectionOptions, byteReadChannel, null), 1, (Object) null).getChannel();
                }
                ByteReadChannel byteReadChannel2 = empty;
                ResponseAdapter responseAdapter = (ResponseAdapter) httpRequestData.getAttributes().getOrNull(HttpRequestKt.getResponseAdapterAttributeKey());
                if (responseAdapter != null) {
                    Object objAdapt = responseAdapter.adapt(httpRequestData, httpStatusCode2, headersImpl, byteReadChannel2, httpRequestData.getBody(), coroutineContext);
                    httpStatusCode = httpStatusCode2;
                    if (objAdapt != null) {
                        obj2 = objAdapt;
                    }
                    HttpResponseData httpResponseData2 = new HttpResponseData(httpStatusCode, gMTDate, headersImpl, httpProtocolVersion, obj2, coroutineContext);
                    CloseableKt.closeFinally(response3, null);
                    return httpResponseData2;
                }
                httpStatusCode = httpStatusCode2;
                obj2 = byteReadChannel2;
                HttpResponseData httpResponseData3 = new HttpResponseData(httpStatusCode, gMTDate, headersImpl, httpProtocolVersion, obj2, coroutineContext);
                CloseableKt.closeFinally(response3, null);
                return httpResponseData3;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(response3, th);
                    throw th2;
                }
            }
        }
    }

    public static final Object readResponse(GMTDate gMTDate, HttpRequestData httpRequestData, ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, Continuation<? super HttpResponseData> continuation) {
        return BuildersKt.withContext(coroutineContext, new AnonymousClass2(byteReadChannel, byteWriteChannel, coroutineContext, gMTDate, httpRequestData, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x01bd A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:67:0x022b, B:76:0x0240, B:77:0x0243, B:22:0x007b, B:53:0x01b9, B:55:0x01bd, B:78:0x0244, B:79:0x0252, B:25:0x0094, B:49:0x0199, B:28:0x00ad, B:74:0x023e), top: B:86:0x0025, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01cb A[Catch: all -> 0x023c, TryCatch #2 {all -> 0x023c, blocks: (B:56:0x01c0, B:58:0x01cb, B:60:0x01db, B:70:0x0234, B:71:0x023b), top: B:87:0x01c0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01db A[Catch: all -> 0x023c, TRY_LEAVE, TryCatch #2 {all -> 0x023c, blocks: (B:56:0x01c0, B:58:0x01cb, B:60:0x01db, B:70:0x0234, B:71:0x023b), top: B:87:0x01c0 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x021f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0234 A[Catch: all -> 0x023c, TRY_ENTER, TryCatch #2 {all -> 0x023c, blocks: (B:56:0x01c0, B:58:0x01cb, B:60:0x01db, B:70:0x0234, B:71:0x023b), top: B:87:0x01c0 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0244 A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:67:0x022b, B:76:0x0240, B:77:0x0243, B:22:0x007b, B:53:0x01b9, B:55:0x01bd, B:78:0x0244, B:79:0x0252, B:25:0x0094, B:49:0x0199, B:28:0x00ad, B:74:0x023e), top: B:86:0x0025, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v25, types: [io.ktor.http.cio.RequestResponseBuilder] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final Object startTunnel(HttpRequestData httpRequestData, ByteWriteChannel byteWriteChannel, ByteReadChannel byteReadChannel, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        RequestResponseBuilder requestResponseBuilder;
        String hostWithPort;
        ByteWriteChannel byteWriteChannel2;
        HttpRequestData httpRequestData2;
        String str;
        ByteWriteChannel byteWriteChannel3;
        RequestResponseBuilder requestResponseBuilder2;
        HttpRequestData httpRequestData3;
        ByteWriteChannel byteWriteChannel4;
        Response response;
        Response response2;
        Closeable closeable;
        Response response3;
        CharSequence charSequence;
        RequestResponseBuilder requestResponseBuilder3;
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
        Object response4 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(response4);
                requestResponseBuilder = new RequestResponseBuilder();
                try {
                    hostWithPort = URLUtilsKt.getHostWithPort(httpRequestData.getUrl());
                    requestResponseBuilder.requestLine(new HttpMethod("CONNECT"), hostWithPort, HttpProtocolVersion.INSTANCE.getHTTP_1_1().toString());
                    requestResponseBuilder.headerLine(HttpHeaders.INSTANCE.getHost(), hostWithPort);
                    requestResponseBuilder.headerLine("Proxy-Connection", "Keep-Alive");
                    String str2 = httpRequestData.getHeaders().get(HttpHeaders.INSTANCE.getUserAgent());
                    if (str2 != null) {
                        requestResponseBuilder.headerLine(HttpHeaders.INSTANCE.getUserAgent(), str2);
                    }
                    String str3 = httpRequestData.getHeaders().get(HttpHeaders.INSTANCE.getProxyAuthenticate());
                    if (str3 != null) {
                        requestResponseBuilder.headerLine(HttpHeaders.INSTANCE.getProxyAuthenticate(), str3);
                    }
                    String str4 = httpRequestData.getHeaders().get(HttpHeaders.INSTANCE.getProxyAuthorization());
                    if (str4 != null) {
                        requestResponseBuilder.headerLine(HttpHeaders.INSTANCE.getProxyAuthorization(), str4);
                    }
                    requestResponseBuilder.emptyLine();
                    Source sourceBuild = requestResponseBuilder.build();
                    anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData);
                    anonymousClass1.L$1 = byteWriteChannel;
                    anonymousClass1.L$2 = byteReadChannel;
                    anonymousClass1.L$3 = requestResponseBuilder;
                    anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(hostWithPort);
                    anonymousClass1.label = 1;
                    Object objWritePacket = ByteWriteChannelOperationsKt.writePacket(byteWriteChannel, sourceBuild, anonymousClass1);
                    byteWriteChannel2 = byteWriteChannel;
                    if (objWritePacket == coroutine_suspended) {
                    }
                    requestResponseBuilder3 = byteWriteChannel;
                    return coroutine_suspended;
                } catch (Throwable th) {
                    th = th;
                    byteWriteChannel = requestResponseBuilder;
                    byteWriteChannel.release();
                    throw th;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    str = (String) anonymousClass1.L$4;
                    RequestResponseBuilder requestResponseBuilder4 = (RequestResponseBuilder) anonymousClass1.L$3;
                    byteReadChannel = (ByteReadChannel) anonymousClass1.L$2;
                    ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) anonymousClass1.L$1;
                    httpRequestData2 = (HttpRequestData) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(response4);
                    byteWriteChannel3 = byteWriteChannel5;
                    requestResponseBuilder2 = requestResponseBuilder4;
                    anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData2);
                    anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(byteWriteChannel3);
                    anonymousClass1.L$2 = byteReadChannel;
                    anonymousClass1.L$3 = requestResponseBuilder2;
                    anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(str);
                    anonymousClass1.label = 3;
                    response4 = HttpParserKt.parseResponse(byteReadChannel, anonymousClass1);
                    if (response4 == coroutine_suspended) {
                        httpRequestData3 = httpRequestData2;
                        byteWriteChannel4 = byteWriteChannel3;
                        byteWriteChannel = requestResponseBuilder2;
                        response = (Response) response4;
                        if (response == null) {
                            throw new ClosedReadChannelException(new EOFException("Failed to parse CONNECT response: unexpected EOF"));
                        }
                        response2 = response;
                        response3 = response2;
                        if (response.getStatus() / ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION != 1) {
                            throw new IOException("Can not establish tunnel connection");
                        }
                        charSequence = response.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
                        if (charSequence != null) {
                            long j = Long.parseLong(charSequence.toString());
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData3);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(byteWriteChannel4);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
                            anonymousClass1.L$3 = byteWriteChannel;
                            anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(str);
                            anonymousClass1.L$5 = SpillingKt.nullOutSpilledVariable(response);
                            anonymousClass1.L$6 = response2;
                            anonymousClass1.L$7 = SpillingKt.nullOutSpilledVariable(response3);
                            anonymousClass1.L$8 = SpillingKt.nullOutSpilledVariable(charSequence);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.I$1 = 0;
                            anonymousClass1.label = 4;
                            response4 = ByteReadChannelOperationsKt.discard(byteReadChannel, j, anonymousClass1);
                            if (response4 != coroutine_suspended) {
                                requestResponseBuilder3 = byteWriteChannel;
                                closeable = response2;
                                byteWriteChannel = byteWriteChannel;
                                Boxing.boxLong(((Number) response4).longValue());
                                response2 = closeable;
                                requestResponseBuilder3 = byteWriteChannel;
                            }
                        }
                        requestResponseBuilder3 = byteWriteChannel;
                        CloseableKt.closeFinally(response2, null);
                        requestResponseBuilder3.release();
                        return Unit.INSTANCE;
                    }
                    requestResponseBuilder3 = byteWriteChannel;
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = anonymousClass1.I$1;
                    int i3 = anonymousClass1.I$0;
                    closeable = (Closeable) anonymousClass1.L$6;
                    byteWriteChannel = (RequestResponseBuilder) anonymousClass1.L$3;
                    try {
                        ResultKt.throwOnFailure(response4);
                        byteWriteChannel = byteWriteChannel;
                        Boxing.boxLong(((Number) response4).longValue());
                        response2 = closeable;
                        requestResponseBuilder3 = byteWriteChannel;
                        requestResponseBuilder3 = byteWriteChannel;
                        CloseableKt.closeFinally(response2, null);
                        requestResponseBuilder3.release();
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(closeable, th);
                            throw th3;
                        }
                    }
                }
                str = (String) anonymousClass1.L$4;
                RequestResponseBuilder requestResponseBuilder5 = (RequestResponseBuilder) anonymousClass1.L$3;
                byteReadChannel = (ByteReadChannel) anonymousClass1.L$2;
                ByteWriteChannel byteWriteChannel6 = (ByteWriteChannel) anonymousClass1.L$1;
                httpRequestData3 = (HttpRequestData) anonymousClass1.L$0;
                ResultKt.throwOnFailure(response4);
                byteWriteChannel4 = byteWriteChannel6;
                byteWriteChannel = requestResponseBuilder5;
                response = (Response) response4;
                if (response == null) {
                    throw new ClosedReadChannelException(new EOFException("Failed to parse CONNECT response: unexpected EOF"));
                }
                response2 = response;
                try {
                    response3 = response2;
                    if (response.getStatus() / ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION != 1) {
                        throw new IOException("Can not establish tunnel connection");
                    }
                    charSequence = response.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
                    if (charSequence != null) {
                        long j2 = Long.parseLong(charSequence.toString());
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData3);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(byteWriteChannel4);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
                        anonymousClass1.L$3 = byteWriteChannel;
                        anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(str);
                        anonymousClass1.L$5 = SpillingKt.nullOutSpilledVariable(response);
                        anonymousClass1.L$6 = response2;
                        anonymousClass1.L$7 = SpillingKt.nullOutSpilledVariable(response3);
                        anonymousClass1.L$8 = SpillingKt.nullOutSpilledVariable(charSequence);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.I$1 = 0;
                        anonymousClass1.label = 4;
                        response4 = ByteReadChannelOperationsKt.discard(byteReadChannel, j2, anonymousClass1);
                        if (response4 != coroutine_suspended) {
                            requestResponseBuilder3 = byteWriteChannel;
                            closeable = response2;
                            byteWriteChannel = byteWriteChannel;
                            Boxing.boxLong(((Number) response4).longValue());
                            response2 = closeable;
                            requestResponseBuilder3 = byteWriteChannel;
                        }
                        requestResponseBuilder3 = byteWriteChannel;
                        return coroutine_suspended;
                    }
                    requestResponseBuilder3 = byteWriteChannel;
                    CloseableKt.closeFinally(response2, null);
                    requestResponseBuilder3.release();
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                    closeable = response2;
                    throw th;
                }
            }
            String str5 = (String) anonymousClass1.L$4;
            RequestResponseBuilder requestResponseBuilder6 = (RequestResponseBuilder) anonymousClass1.L$3;
            byteReadChannel = (ByteReadChannel) anonymousClass1.L$2;
            ByteWriteChannel byteWriteChannel7 = (ByteWriteChannel) anonymousClass1.L$1;
            HttpRequestData httpRequestData4 = (HttpRequestData) anonymousClass1.L$0;
            ResultKt.throwOnFailure(response4);
            requestResponseBuilder = requestResponseBuilder6;
            byteWriteChannel2 = byteWriteChannel7;
            hostWithPort = str5;
            httpRequestData = httpRequestData4;
            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData);
            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(byteWriteChannel2);
            anonymousClass1.L$2 = byteReadChannel;
            anonymousClass1.L$3 = requestResponseBuilder;
            anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(hostWithPort);
            anonymousClass1.label = 2;
            if (byteWriteChannel2.flush(anonymousClass1) != coroutine_suspended) {
                httpRequestData2 = httpRequestData;
                str = hostWithPort;
                byteWriteChannel3 = byteWriteChannel2;
                requestResponseBuilder2 = requestResponseBuilder;
                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData2);
                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(byteWriteChannel3);
                anonymousClass1.L$2 = byteReadChannel;
                anonymousClass1.L$3 = requestResponseBuilder2;
                anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(str);
                anonymousClass1.label = 3;
                response4 = HttpParserKt.parseResponse(byteReadChannel, anonymousClass1);
                if (response4 == coroutine_suspended) {
                    httpRequestData3 = httpRequestData2;
                    byteWriteChannel4 = byteWriteChannel3;
                    byteWriteChannel = requestResponseBuilder2;
                    response = (Response) response4;
                    if (response == null) {
                        throw new ClosedReadChannelException(new EOFException("Failed to parse CONNECT response: unexpected EOF"));
                    }
                    response2 = response;
                    response3 = response2;
                    if (response.getStatus() / ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION != 1) {
                        throw new IOException("Can not establish tunnel connection");
                    }
                    charSequence = response.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
                    if (charSequence != null) {
                        long j3 = Long.parseLong(charSequence.toString());
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(httpRequestData3);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(byteWriteChannel4);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
                        anonymousClass1.L$3 = byteWriteChannel;
                        anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(str);
                        anonymousClass1.L$5 = SpillingKt.nullOutSpilledVariable(response);
                        anonymousClass1.L$6 = response2;
                        anonymousClass1.L$7 = SpillingKt.nullOutSpilledVariable(response3);
                        anonymousClass1.L$8 = SpillingKt.nullOutSpilledVariable(charSequence);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.I$1 = 0;
                        anonymousClass1.label = 4;
                        response4 = ByteReadChannelOperationsKt.discard(byteReadChannel, j3, anonymousClass1);
                        if (response4 != coroutine_suspended) {
                            requestResponseBuilder3 = byteWriteChannel;
                            closeable = response2;
                            byteWriteChannel = byteWriteChannel;
                            Boxing.boxLong(((Number) response4).longValue());
                            response2 = closeable;
                            requestResponseBuilder3 = byteWriteChannel;
                        }
                    }
                    requestResponseBuilder3 = byteWriteChannel;
                    CloseableKt.closeFinally(response2, null);
                    requestResponseBuilder3.release();
                    return Unit.INSTANCE;
                }
            }
            requestResponseBuilder3 = byteWriteChannel;
            return coroutine_suspended;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static final Map<String, List<String>> toMap(HttpHeadersMap httpHeadersMap) {
        Intrinsics.checkNotNullParameter(httpHeadersMap, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> it = httpHeadersMap.offsets().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            String string = httpHeadersMap.nameAtOffset(iIntValue).toString();
            String string2 = httpHeadersMap.valueAtOffset(iIntValue).toString();
            List list = (List) linkedHashMap.get(string);
            if ((list != null ? Boolean.valueOf(list.add(string2)) : null) == null) {
                linkedHashMap.put(string, CollectionsKt.mutableListOf(string2));
            }
        }
        return linkedHashMap;
    }

    public static final boolean isInformational(HttpStatusCode httpStatusCode) {
        Intrinsics.checkNotNullParameter(httpStatusCode, "<this>");
        return httpStatusCode.getValue() / 100 == 1;
    }

    public static /* synthetic */ ByteWriteChannel withoutClosePropagation$default(ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return withoutClosePropagation(byteWriteChannel, coroutineContext, z);
    }

    public static final ByteWriteChannel withoutClosePropagation(final ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        if (z) {
            JobKt.getJob(coroutineContext).invokeOnCompletion(new Function1() { // from class: io.ktor.client.engine.cio.UtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UtilsKt.withoutClosePropagation$lambda$0(byteWriteChannel, (Throwable) obj);
                }
            });
        }
        return ByteReadChannelOperationsKt.reader((CoroutineScope) GlobalScope.INSTANCE, coroutineContext, true, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) new C00382(byteWriteChannel, null)).getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withoutClosePropagation$lambda$0(ByteWriteChannel byteWriteChannel, Throwable th) {
        ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.UtilsKt$withoutClosePropagation$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: utils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ReaderScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.UtilsKt$withoutClosePropagation$2", f = "utils.kt", i = {0, 1}, l = {292, 293}, m = "invokeSuspend", n = {"$this$reader", "$this$reader"}, s = {"L$0", "L$0"}, v = 1)
    static final class C00382 extends SuspendLambda implements Function2<ReaderScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ByteWriteChannel $this_withoutClosePropagation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00382(ByteWriteChannel byteWriteChannel, Continuation<? super C00382> continuation) {
            super(2, continuation);
            this.$this_withoutClosePropagation = byteWriteChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C00382 c00382 = new C00382(this.$this_withoutClosePropagation, continuation);
            c00382.L$0 = obj;
            return c00382;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReaderScope readerScope, Continuation<? super Unit> continuation) {
            return ((C00382) create(readerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (r8.$this_withoutClosePropagation.flush(r8) == r1) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.L$0
                io.ktor.utils.io.ReaderScope r0 = (io.ktor.utils.io.ReaderScope) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r8.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                kotlin.ResultKt.throwOnFailure(r9)
                goto L56
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L42
            L22:
                kotlin.ResultKt.throwOnFailure(r9)
                io.ktor.utils.io.ByteReadChannel r9 = r0.getChannel()
                io.ktor.utils.io.ByteWriteChannel r2 = r8.$this_withoutClosePropagation
                r5 = r8
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r8.L$0 = r6
                r8.label = r4
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.Object r9 = io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(r9, r2, r6, r5)
                if (r9 != r1) goto L42
                goto L55
            L42:
                io.ktor.utils.io.ByteWriteChannel r9 = r8.$this_withoutClosePropagation
                r2 = r8
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r8.L$0 = r0
                r8.label = r3
                java.lang.Object r9 = r9.flush(r2)
                if (r9 != r1) goto L56
            L55:
                return r1
            L56:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.UtilsKt.C00382.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final ByteWriteChannel handleHalfClosed(ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return z ? byteWriteChannel : withoutClosePropagation$default(byteWriteChannel, coroutineContext, false, 2, null);
    }

    public static final boolean isChunked(String str, String str2, String str3) {
        return str == null || Intrinsics.areEqual(str2, "chunked") || Intrinsics.areEqual(str3, "chunked");
    }

    public static final boolean expectContinue(String str, OutgoingContent body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return (str == null || (body instanceof OutgoingContent.NoContent)) ? false : true;
    }
}
