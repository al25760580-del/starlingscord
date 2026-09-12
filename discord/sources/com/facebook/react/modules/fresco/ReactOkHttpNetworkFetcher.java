package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import rn.n;
import zs.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/modules/fresco/ReactOkHttpNetworkFetcher;", "Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher;", "okHttpClient", "Lokhttp3/OkHttpClient;", "<init>", "(Lokhttp3/OkHttpClient;)V", "getHeaders", "", "", "readableMap", "Lcom/facebook/react/bridge/ReadableMap;", "fetch", "", "fetchState", "Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$OkHttpNetworkFetchState;", "callback", "Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactOkHttpNetworkFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactOkHttpNetworkFetcher.kt\ncom/facebook/react/modules/fresco/ReactOkHttpNetworkFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class ReactOkHttpNetworkFetcher extends OkHttpNetworkFetcher {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageCacheControl.values().length];
            try {
                iArr[ImageCacheControl.RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCacheControl.FORCE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageCacheControl.ONLY_IF_CACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageCacheControl.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactOkHttpNetworkFetcher(@NotNull OkHttpClient okHttpClient) {
        super(okHttpClient);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
    }

    private final Map<String, String> getHeaders(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            String string = readableMap.getString(strNextKey);
            if (string != null) {
                map.put(strNextKey, string);
            }
        }
        return map;
    }

    @Override // com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher, com.facebook.imagepipeline.producers.NetworkFetcher
    public void fetch(@NotNull OkHttpNetworkFetcher.OkHttpNetworkFetchState fetchState, @NotNull NetworkFetcher.Callback callback) {
        boolean z5;
        Map<String, String> mapD;
        boolean z6;
        int i7;
        boolean z7;
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.f4792f = SystemClock.elapsedRealtime();
        ProducerContext producerContext = fetchState.f4935b;
        Uri sourceUri = producerContext.g().getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getUri(...)");
        boolean z10 = true;
        boolean z11 = false;
        int i10 = -1;
        if (producerContext.g() instanceof ReactNetworkImageRequest) {
            ImageRequest imageRequestG = producerContext.g();
            Intrinsics.checkNotNull(imageRequestG, "null cannot be cast to non-null type com.facebook.react.modules.fresco.ReactNetworkImageRequest");
            ReactNetworkImageRequest reactNetworkImageRequest = (ReactNetworkImageRequest) imageRequestG;
            mapD = getHeaders(reactNetworkImageRequest.getHeaders());
            int i11 = WhenMappings.$EnumSwitchMapping$0[reactNetworkImageRequest.getCacheControl().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    Intrinsics.checkNotNullParameter(timeUnit2, "timeUnit");
                    long seconds = timeUnit2.toSeconds(Integer.MAX_VALUE);
                    i10 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                } else if (i11 == 3) {
                    TimeUnit timeUnit3 = TimeUnit.SECONDS;
                    TimeUnit timeUnit4 = TimeUnit.SECONDS;
                    Intrinsics.checkNotNullParameter(timeUnit4, "timeUnit");
                    long seconds2 = timeUnit4.toSeconds(Integer.MAX_VALUE);
                    i10 = seconds2 > 2147483647L ? Integer.MAX_VALUE : (int) seconds2;
                    z11 = true;
                    z10 = false;
                } else {
                    if (i11 != 4) {
                        throw new n();
                    }
                    z11 = true;
                }
                z10 = z11;
            } else {
                z11 = false;
                z11 = true;
            }
            z6 = z11;
            z5 = z11;
            i7 = i10;
            z7 = z10;
        } else {
            z5 = true;
            mapD = null;
            z6 = false;
            i7 = -1;
            z7 = false;
        }
        if (mapD == null) {
            mapD = w0.d();
        }
        Headers headersA = a.a(mapD);
        Request.Builder builder = new Request.Builder();
        builder.e(headersA);
        builder.c(new CacheControl(z7, z5, -1, -1, false, false, false, i7, -1, z6, false, false, null));
        String string = sourceUri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        builder.i(string);
        builder.f("GET", null);
        fetchWithRequest(fetchState, callback, builder.b());
    }
}
