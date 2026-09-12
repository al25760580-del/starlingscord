package com.facebook.react.devsupport.inspector;

import com.facebook.react.modules.network.OkHttpClientProvider;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;", "", "<init>", "()V", "httpClient", "Lokhttp3/OkHttpClient;", "getHttpClient$ReactAndroid_release", "()Lokhttp3/OkHttpClient;", "websocketClient", "getWebsocketClient$ReactAndroid_release", "httpScheme", "", "host", "httpScheme$ReactAndroid_release", "wsScheme", "wsScheme$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevSupportHttpClient {

    @NotNull
    public static final DevSupportHttpClient INSTANCE = new DevSupportHttpClient();

    @NotNull
    private static final OkHttpClient httpClient;

    @NotNull
    private static final OkHttpClient websocketClient;

    static {
        OkHttpClient.Builder builderB = OkHttpClientProvider.getOkHttpClient().b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builderB.a(5L, timeUnit);
        builderB.d(0L, TimeUnit.MILLISECONDS);
        builderB.c(0L, TimeUnit.MINUTES);
        OkHttpClient okHttpClient = new OkHttpClient(builderB);
        httpClient = okHttpClient;
        OkHttpClient.Builder builderB2 = okHttpClient.b();
        builderB2.a(10L, timeUnit);
        builderB2.d(10L, timeUnit);
        websocketClient = new OkHttpClient(builderB2);
    }

    private DevSupportHttpClient() {
    }

    @NotNull
    public final OkHttpClient getHttpClient$ReactAndroid_release() {
        return httpClient;
    }

    @NotNull
    public final OkHttpClient getWebsocketClient$ReactAndroid_release() {
        return websocketClient;
    }

    @NotNull
    public final String httpScheme$ReactAndroid_release(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return x.h(host, ":443", false) ? "https" : "http";
    }

    @NotNull
    public final String wsScheme$ReactAndroid_release(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return x.h(host, ":443", false) ? "wss" : "ws";
    }
}
