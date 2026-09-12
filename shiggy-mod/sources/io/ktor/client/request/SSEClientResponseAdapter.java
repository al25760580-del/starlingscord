package io.ktor.client.request;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/client/request/SSEClientResponseAdapter;", "Lio/ktor/client/request/ResponseAdapter;", "<init>", "()V", "Lio/ktor/client/request/HttpRequestData;", "data", "Lio/ktor/http/HttpStatusCode;", NotificationCompat.CATEGORY_STATUS, "Lio/ktor/http/Headers;", "headers", "Lio/ktor/utils/io/ByteReadChannel;", "responseBody", "Lio/ktor/http/content/OutgoingContent;", "outgoingContent", "Lkotlin/coroutines/CoroutineContext;", "callContext", "", "adapt", "(Lio/ktor/client/request/HttpRequestData;Lio/ktor/http/HttpStatusCode;Lio/ktor/http/Headers;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/content/OutgoingContent;Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "ktor-client-core"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SSEClientResponseAdapter implements ResponseAdapter {
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, io.ktor.http.HttpStatusCode.INSTANCE.getNoContent()) != false) goto L19;
     */
    @Override // io.ktor.client.request.ResponseAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object adapt(io.ktor.client.request.HttpRequestData r2, io.ktor.http.HttpStatusCode r3, io.ktor.http.Headers r4, io.ktor.utils.io.ByteReadChannel r5, io.ktor.http.content.OutgoingContent r6, kotlin.coroutines.CoroutineContext r7) {
        /*
            r1 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "status"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "responseBody"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "outgoingContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "callContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            io.ktor.http.HttpHeaders r7 = io.ktor.http.HttpHeaders.INSTANCE
            java.lang.String r7 = r7.getContentType()
            java.lang.String r4 = r4.get(r7)
            r7 = 0
            if (r4 == 0) goto L32
            io.ktor.http.ContentType$Companion r0 = io.ktor.http.ContentType.INSTANCE
            io.ktor.http.ContentType r4 = r0.parse(r4)
            goto L33
        L32:
            r4 = r7
        L33:
            boolean r0 = io.ktor.client.request.HttpRequestKt.isSseRequest(r2)
            if (r0 == 0) goto L73
            boolean r2 = io.ktor.client.request.HttpRequestKt.isSseReconnectionRequest(r2)
            if (r2 != 0) goto L73
            io.ktor.http.HttpStatusCode$Companion r2 = io.ktor.http.HttpStatusCode.INSTANCE
            io.ktor.http.HttpStatusCode r2 = r2.getOK()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r2)
            if (r2 == 0) goto L5f
            if (r4 == 0) goto L52
            io.ktor.http.ContentType r2 = r4.withoutParameters()
            goto L53
        L52:
            r2 = r7
        L53:
            io.ktor.http.ContentType$Text r4 = io.ktor.http.ContentType.Text.INSTANCE
            io.ktor.http.ContentType r4 = r4.getEventStream()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 != 0) goto L6b
        L5f:
            io.ktor.http.HttpStatusCode$Companion r2 = io.ktor.http.HttpStatusCode.INSTANCE
            io.ktor.http.HttpStatusCode r2 = r2.getNoContent()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r2)
            if (r2 == 0) goto L73
        L6b:
            io.ktor.client.plugins.sse.SSEClientContent r6 = (io.ktor.client.plugins.sse.SSEClientContent) r6
            io.ktor.client.plugins.sse.DefaultClientSSESession r2 = new io.ktor.client.plugins.sse.DefaultClientSSESession
            r2.<init>(r6, r5)
            return r2
        L73:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.request.SSEClientResponseAdapter.adapt(io.ktor.client.request.HttpRequestData, io.ktor.http.HttpStatusCode, io.ktor.http.Headers, io.ktor.utils.io.ByteReadChannel, io.ktor.http.content.OutgoingContent, kotlin.coroutines.CoroutineContext):java.lang.Object");
    }
}
