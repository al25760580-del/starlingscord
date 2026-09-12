package com.facebook.imagepipeline.backends.okhttp3;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.FetchState;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.producers.d;
import com.facebook.imagepipeline.producers.v0;
import gs.i;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import rn.u;

/* JADX INFO: loaded from: classes3.dex */
public class OkHttpNetworkFetcher extends d {

    @NotNull
    private static final Companion Companion = new Companion();

    @NotNull
    private static final String FETCH_TIME = "fetch_time";

    @NotNull
    private static final String IMAGE_SIZE = "image_size";

    @NotNull
    private static final String QUEUE_TIME = "queue_time";

    @NotNull
    private static final String TOTAL_TIME = "total_time";
    private final CacheControl cacheControl;

    @NotNull
    private final Call.Factory callFactory;

    @NotNull
    private final Executor cancellationExecutor;

    public static final class Companion {
    }

    public static final class OkHttpNetworkFetchState extends FetchState {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f4792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f4793g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f4794h;
    }

    public OkHttpNetworkFetcher(OkHttpClient callFactory) {
        Intrinsics.checkNotNullParameter(callFactory, "okHttpClient");
        ExecutorService cancellationExecutor = callFactory.f17337d.b();
        Intrinsics.checkNotNullExpressionValue(cancellationExecutor, "executorService(...)");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(cancellationExecutor, "cancellationExecutor");
        this.callFactory = callFactory;
        this.cancellationExecutor = cancellationExecutor;
        this.cacheControl = new CacheControl(false, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
    }

    public static final void access$handleException(OkHttpNetworkFetcher okHttpNetworkFetcher, Call call, Exception exc, NetworkFetcher.Callback callback) {
        okHttpNetworkFetcher.getClass();
        if (call.y()) {
            callback.a();
        } else {
            callback.onFailure(exc);
        }
    }

    public static final IOException access$makeExceptionFromResponse(OkHttpNetworkFetcher okHttpNetworkFetcher, String str, Response response) {
        okHttpNetworkFetcher.getClass();
        int i7 = ag.b.f502e;
        Intrinsics.checkNotNullParameter(response, "response");
        Response response2 = response.E;
        return new IOException(str, new ag.b(3));
    }

    public void fetchWithRequest(@NotNull OkHttpNetworkFetchState fetchState, @NotNull NetworkFetcher.Callback callback, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(request, "request");
        i iVarA = this.callFactory.a(request);
        fetchState.f4935b.i(new a(iVarA, this));
        iVarA.d(new b(fetchState, this, callback));
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    @NotNull
    public OkHttpNetworkFetchState createFetchState(@NotNull Consumer consumer, @NotNull ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerContext, "context");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        return new OkHttpNetworkFetchState(consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public void fetch(OkHttpNetworkFetchState fetchState, NetworkFetcher.Callback callback) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.f4792f = SystemClock.elapsedRealtime();
        ProducerContext producerContext = fetchState.f4935b;
        Uri sourceUri = producerContext.g().getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getUri(...)");
        try {
            Request.Builder builder = new Request.Builder();
            builder.i(sourceUri.toString());
            builder.f("GET", null);
            CacheControl cacheControl = this.cacheControl;
            if (cacheControl != null) {
                builder.c(cacheControl);
            }
            BytesRange bytesRange = producerContext.g().getBytesRange();
            if (bytesRange != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                u uVar = BytesRange.f4806c;
                String str = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{vi.d.m(bytesRange.f4807a), vi.d.m(bytesRange.f4808b)}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                builder.a("Range", str);
            }
            Request requestB = builder.b();
            Intrinsics.checkNotNullExpressionValue(requestB, "build(...)");
            fetchWithRequest(fetchState, callback, requestB);
        } catch (Exception e10) {
            ((v0) callback).onFailure(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public Map<String, String> getExtraMap(@NotNull OkHttpNetworkFetchState fetchState, int i7) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        return w0.g(new Pair(QUEUE_TIME, String.valueOf(fetchState.f4793g - fetchState.f4792f)), new Pair(FETCH_TIME, String.valueOf(fetchState.f4794h - fetchState.f4793g)), new Pair(TOTAL_TIME, String.valueOf(fetchState.f4794h - fetchState.f4792f)), new Pair(IMAGE_SIZE, String.valueOf(i7)));
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public void onFetchCompletion(@NotNull OkHttpNetworkFetchState fetchState, int i7) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        fetchState.f4794h = SystemClock.elapsedRealtime();
    }
}
