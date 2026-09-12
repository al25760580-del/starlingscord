package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: compiled from: EngineTasks.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lio/ktor/client/engine/cio/RequestTask;", "", "Lio/ktor/client/request/HttpRequestData;", "request", "Lkotlinx/coroutines/CompletableDeferred;", "Lio/ktor/client/request/HttpResponseData;", "response", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lio/ktor/client/request/HttpRequestData;Lkotlinx/coroutines/CompletableDeferred;Lkotlin/coroutines/CoroutineContext;)V", "component1", "()Lio/ktor/client/request/HttpRequestData;", "component2", "()Lkotlinx/coroutines/CompletableDeferred;", "component3", "()Lkotlin/coroutines/CoroutineContext;", "copy", "(Lio/ktor/client/request/HttpRequestData;Lkotlinx/coroutines/CompletableDeferred;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/client/engine/cio/RequestTask;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/request/HttpRequestData;", "getRequest", "Lkotlinx/coroutines/CompletableDeferred;", "getResponse", "Lkotlin/coroutines/CoroutineContext;", "getContext", "ktor-client-cio"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class RequestTask {
    private final CoroutineContext context;
    private final HttpRequestData request;
    private final CompletableDeferred<HttpResponseData> response;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestTask copy$default(RequestTask requestTask, HttpRequestData httpRequestData, CompletableDeferred completableDeferred, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            httpRequestData = requestTask.request;
        }
        if ((i & 2) != 0) {
            completableDeferred = requestTask.response;
        }
        if ((i & 4) != 0) {
            coroutineContext = requestTask.context;
        }
        return requestTask.copy(httpRequestData, completableDeferred, coroutineContext);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HttpRequestData getRequest() {
        return this.request;
    }

    public final CompletableDeferred<HttpResponseData> component2() {
        return this.response;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CoroutineContext getContext() {
        return this.context;
    }

    public final RequestTask copy(HttpRequestData request, CompletableDeferred<HttpResponseData> response, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(context, "context");
        return new RequestTask(request, response, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestTask)) {
            return false;
        }
        RequestTask requestTask = (RequestTask) other;
        return Intrinsics.areEqual(this.request, requestTask.request) && Intrinsics.areEqual(this.response, requestTask.response) && Intrinsics.areEqual(this.context, requestTask.context);
    }

    public int hashCode() {
        return (((this.request.hashCode() * 31) + this.response.hashCode()) * 31) + this.context.hashCode();
    }

    public String toString() {
        return "RequestTask(request=" + this.request + ", response=" + this.response + ", context=" + this.context + ')';
    }

    public RequestTask(HttpRequestData request, CompletableDeferred<HttpResponseData> response, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(context, "context");
        this.request = request;
        this.response = response;
        this.context = context;
    }

    public final HttpRequestData getRequest() {
        return this.request;
    }

    public final CompletableDeferred<HttpResponseData> getResponse() {
        return this.response;
    }

    public final CoroutineContext getContext() {
        return this.context;
    }
}
