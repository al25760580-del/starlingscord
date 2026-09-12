package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.cio.CIOHeaders;
import io.ktor.http.cio.Response;
import io.ktor.network.sockets.Connection;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ConnectionPipeline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "io.ktor.client.engine.cio.ConnectionPipeline$responseHandler$1", f = "ConnectionPipeline.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 6}, l = {72, 75, 125, 135, 140, 145, 145}, m = "invokeSuspend", n = {"$this$launch", "shouldClose", "$this$launch", "requestTime", "task", "shouldClose", "$this$launch", "requestTime", "task", "rawResponse", "callContext", "callJob", NotificationCompat.CATEGORY_STATUS, "method", "transferEncoding", "connectionType", "headers", "version", "responseChannel", "skipTask", "body", "response", "$this$use$iv", "$this$invokeSuspend_u24lambda_u242", "shouldClose", "contentLength", "chunked", "hasBody", "$i$f$use", "$i$a$-use-ConnectionPipeline$responseHandler$1$2", "$this$launch", "requestTime", "task", "rawResponse", "callContext", "callJob", NotificationCompat.CATEGORY_STATUS, "method", "transferEncoding", "connectionType", "headers", "version", "responseChannel", "skipTask", "body", "response", "shouldClose", "contentLength", "chunked", "hasBody", "$this$launch", "requestTime", "task", "shouldClose", "$this$launch", "$this$launch"}, s = {"L$0", "I$0", "L$0", "L$2", "L$3", "I$0", "L$0", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "I$0", "J$0", "Z$0", "I$1", "I$2", "I$3", "L$0", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "I$0", "J$0", "Z$0", "I$1", "L$0", "L$2", "L$3", "I$0", "L$0", "L$0"}, v = 1)
final class ConnectionPipeline$responseHandler$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Connection $connection;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ ConnectionPipeline this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectionPipeline$responseHandler$1(ConnectionPipeline connectionPipeline, Connection connection, Continuation<? super ConnectionPipeline$responseHandler$1> continuation) {
        super(2, continuation);
        this.this$0 = connectionPipeline;
        this.$connection = connection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConnectionPipeline$responseHandler$1 connectionPipeline$responseHandler$1 = new ConnectionPipeline$responseHandler$1(this.this$0, this.$connection, continuation);
        connectionPipeline$responseHandler$1.L$0 = obj;
        return connectionPipeline$responseHandler$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConnectionPipeline$responseHandler$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0327  */
    /* JADX WARN: Code duplicated, block: B:106:0x034a A[Catch: all -> 0x04e7, TRY_LEAVE, TryCatch #3 {all -> 0x04e7, blocks: (B:104:0x0330, B:106:0x034a, B:103:0x0329), top: B:192:0x0330 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:134:0x0434  */
    /* JADX WARN: Code duplicated, block: B:136:0x0459  */
    /* JADX WARN: Code duplicated, block: B:140:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:147:0x04e4 A[PHI: r3 r10 r11 r21 r26
      0x04e4: PHI (r3v11 int) = (r3v20 int), (r3v21 int) binds: [B:142:0x04d9, B:135:0x0457] A[DONT_GENERATE, DONT_INLINE]
      0x04e4: PHI (r10v3 io.ktor.client.engine.cio.RequestTask) = (r10v7 io.ktor.client.engine.cio.RequestTask), (r10v8 io.ktor.client.engine.cio.RequestTask) binds: [B:142:0x04d9, B:135:0x0457] A[DONT_GENERATE, DONT_INLINE]
      0x04e4: PHI (r11v3 kotlinx.coroutines.channels.ChannelIterator) = (r11v5 kotlinx.coroutines.channels.ChannelIterator), (r11v6 kotlinx.coroutines.channels.ChannelIterator) binds: [B:142:0x04d9, B:135:0x0457] A[DONT_GENERATE, DONT_INLINE]
      0x04e4: PHI (r21v1 io.ktor.util.date.GMTDate) = (r21v6 io.ktor.util.date.GMTDate), (r21v7 io.ktor.util.date.GMTDate) binds: [B:142:0x04d9, B:135:0x0457] A[DONT_GENERATE, DONT_INLINE]
      0x04e4: PHI (r26v8 boolean) = (r26v14 boolean), (r26v15 boolean) binds: [B:142:0x04d9, B:135:0x0457] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:155:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:167:0x0537 A[Catch: all -> 0x05ce, TryCatch #7 {all -> 0x05ce, blocks: (B:9:0x0034, B:170:0x0576, B:32:0x0163, B:36:0x019b, B:38:0x01a3, B:164:0x051b, B:165:0x0527, B:167:0x0537, B:28:0x014a, B:31:0x0157), top: B:200:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0574  */
    /* JADX WARN: Code duplicated, block: B:170:0x0576 A[Catch: all -> 0x05ce, PHI: r0 r1 r26
      0x0576: PHI (r0v133 int) = (r0v70 int), (r0v134 int) binds: [B:168:0x0572, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0576: PHI (r1v67 kotlinx.coroutines.channels.ChannelIterator) = (r1v22 kotlinx.coroutines.channels.ChannelIterator), (r1v73 kotlinx.coroutines.channels.ChannelIterator) binds: [B:168:0x0572, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0576: PHI (r26v38 boolean) = (r26v11 boolean), (r26v39 boolean) binds: [B:168:0x0572, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #7 {all -> 0x05ce, blocks: (B:9:0x0034, B:170:0x0576, B:32:0x0163, B:36:0x019b, B:38:0x01a3, B:164:0x051b, B:165:0x0527, B:167:0x0537, B:28:0x014a, B:31:0x0157), top: B:200:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0578 A[PHI: r0 r1 r26
      0x0578: PHI (r0v131 int) = (r0v70 int), (r0v133 int) binds: [B:166:0x0535, B:170:0x0576] A[DONT_GENERATE, DONT_INLINE]
      0x0578: PHI (r1v65 kotlinx.coroutines.channels.ChannelIterator) = (r1v22 kotlinx.coroutines.channels.ChannelIterator), (r1v67 kotlinx.coroutines.channels.ChannelIterator) binds: [B:166:0x0535, B:170:0x0576] A[DONT_GENERATE, DONT_INLINE]
      0x0578: PHI (r26v37 boolean) = (r26v11 boolean), (r26v38 boolean) binds: [B:166:0x0535, B:170:0x0576] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:174:0x0580  */
    /* JADX WARN: Code duplicated, block: B:175:0x0584  */
    /* JADX WARN: Code duplicated, block: B:186:0x0273 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x02e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0137 A[PHI: r0 r1 r2 r3 r4 r16
      0x0137: PHI (r0v83 java.lang.Object) = (r0v11 java.lang.Object), (r0v129 java.lang.Object) binds: [B:23:0x0135, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r1v33 int) = (r1v9 int), (r1v63 int) binds: [B:23:0x0135, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r2v28 io.ktor.client.engine.cio.RequestTask) = (r2v4 io.ktor.client.engine.cio.RequestTask), (r2v66 io.ktor.client.engine.cio.RequestTask) binds: [B:23:0x0135, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r3v26 io.ktor.util.date.GMTDate) = (r3v3 io.ktor.util.date.GMTDate), (r3v41 io.ktor.util.date.GMTDate) binds: [B:23:0x0135, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r4v23 kotlinx.coroutines.channels.ChannelIterator) = (r4v2 kotlinx.coroutines.channels.ChannelIterator), (r4v36 kotlinx.coroutines.channels.ChannelIterator) binds: [B:23:0x0135, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r16v9 boolean) = (r16v17 boolean), (r16v14 boolean) binds: [B:23:0x0135, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0198  */
    /* JADX WARN: Code duplicated, block: B:35:0x019a  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a3 A[Catch: all -> 0x05ce, TRY_LEAVE, TryCatch #7 {all -> 0x05ce, blocks: (B:9:0x0034, B:170:0x0576, B:32:0x0163, B:36:0x019b, B:38:0x01a3, B:164:0x051b, B:165:0x0527, B:167:0x0537, B:28:0x014a, B:31:0x0157), top: B:200:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x01dd A[Catch: all -> 0x0512, TRY_LEAVE, TryCatch #11 {all -> 0x0512, blocks: (B:42:0x01d8, B:44:0x01dd, B:55:0x0232), top: B:208:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x021e A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:46:0x0218, B:48:0x021e, B:50:0x0224), top: B:194:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x029a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d2 A[Catch: all -> 0x02da, TRY_LEAVE, TryCatch #17 {all -> 0x02da, blocks: (B:77:0x02b4, B:79:0x02d2), top: B:220:0x02b4 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:97:0x030b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0535 -> B:171:0x0578). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x0572 -> B:170:0x0576). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 1580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.ConnectionPipeline$responseHandler$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Response response, HeadersBuilder headersBuilder) {
        headersBuilder.appendAll(new CIOHeaders(response.getHeaders()));
        response.getHeaders().release();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(ByteReadChannel byteReadChannel, Throwable th) {
        ByteReadChannelKt.cancel(byteReadChannel);
        return Unit.INSTANCE;
    }
}
