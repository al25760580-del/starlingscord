package com.discord.networking;

import androidx.appcompat.widget.k1;
import com.discord.logging.Log;
import com.discord.networking.okhttp.OkHttpDNSSelector;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.react.modules.fresco.ReactOkHttpNetworkFetcher;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.modules.websocket.WebSocketModule;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007¨\u0006\b"}, d2 = {"Lcom/discord/networking/ReactNetworking;", "", "<init>", "()V", "patchReactNetworking", "", "createReactOkHttpNetworkFetcher", "Lcom/facebook/imagepipeline/producers/NetworkFetcher;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactNetworking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactNetworking.kt\ncom/discord/networking/ReactNetworking\n+ 2 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n*L\n1#1,54:1\n578#2:55\n578#2:56\n*S KotlinDebug\n*F\n+ 1 ReactNetworking.kt\ncom/discord/networking/ReactNetworking\n*L\n35#1:55\n19#1:56\n*E\n"})
public final class ReactNetworking {

    @NotNull
    public static final ReactNetworking INSTANCE = new ReactNetworking();

    private ReactNetworking() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void patchReactNetworking$lambda$0(OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        final DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.INSTANCE;
        Interceptor interceptor = new Interceptor() { // from class: com.discord.networking.ReactNetworking$patchReactNetworking$lambda$0$$inlined$-addNetworkInterceptor$1
            @Override // okhttp3.Interceptor
            @NotNull
            public final Response intercept(@NotNull Interceptor.Chain chain) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                return companion.clientXHRInterceptor(chain);
            }
        };
        builder.getClass();
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        builder.f17347d.add(interceptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void patchReactNetworking$lambda$1(OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        OkHttpDNSSelector dns = new OkHttpDNSSelector(OkHttpDNSSelector.IPvMode.IPV4_FIRST);
        builder.getClass();
        Intrinsics.checkNotNullParameter(dns, "dns");
        if (!Intrinsics.areEqual(dns, builder.f17353l)) {
            builder.B = null;
        }
        Intrinsics.checkNotNullParameter(dns, "<set-?>");
        builder.f17353l = dns;
    }

    @NotNull
    public final NetworkFetcher createReactOkHttpNetworkFetcher() throws Exception {
        OkHttpClient.Builder builderB = OkHttpClientProvider.createClient().b();
        final DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.INSTANCE;
        Interceptor interceptor = new Interceptor() { // from class: com.discord.networking.ReactNetworking$createReactOkHttpNetworkFetcher$$inlined$-addNetworkInterceptor$1
            @Override // okhttp3.Interceptor
            @NotNull
            public final Response intercept(@NotNull Interceptor.Chain chain) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                return companion.frescoInterceptor(chain);
            }
        };
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        builderB.f17347d.add(interceptor);
        OkHttpClient okHttpClient = new OkHttpClient(builderB);
        try {
            Constructor declaredConstructor = ReactOkHttpNetworkFetcher.class.getDeclaredConstructor(OkHttpClient.class);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(okHttpClient);
            if (objNewInstance instanceof NetworkFetcher) {
                return (NetworkFetcher) objNewInstance;
            }
            throw new IllegalStateException(("Field " + ReactOkHttpNetworkFetcher.class + " not instance of " + NetworkFetcher.class + ".").toString());
        } catch (Exception e10) {
            Log.INSTANCE.e("ReactNetworking", "Failed to instantiate com.facebook.react.modules.fresco.ReactOkHttpNetworkFetcher", e10);
            throw e10;
        }
    }

    public final void patchReactNetworking() {
        NetworkingModule.INSTANCE.setCustomClientBuilder(new k1(21));
        WebSocketModule.INSTANCE.setCustomClientBuilder(new k1(22));
    }
}
