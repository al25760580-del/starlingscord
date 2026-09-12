package com.discord.client_info;

import android.content.Context;
import bc.i;
import com.facebook.react.modules.network.OkHttpClientProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Lcom/discord/client_info/ClientUserAgent;", "", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "userAgent", "", "createDispatcher", "Lokhttp3/Dispatcher;", "DiscordUserAgentInterceptor", "client_info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClientUserAgent {

    @NotNull
    public static final ClientUserAgent INSTANCE = new ClientUserAgent();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/client_info/ClientUserAgent$DiscordUserAgentInterceptor;", "Lokhttp3/Interceptor;", "userAgent", "", "<init>", "(Ljava/lang/String;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "client_info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DiscordUserAgentInterceptor implements Interceptor {

        @NotNull
        private final String userAgent;

        public DiscordUserAgentInterceptor(@NotNull String userAgent) {
            Intrinsics.checkNotNullParameter(userAgent, "userAgent");
            this.userAgent = userAgent;
        }

        @Override // okhttp3.Interceptor
        @NotNull
        public Response intercept(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            Request.Builder builderB = chain.i().b();
            builderB.g("User-Agent");
            builderB.a("User-Agent", this.userAgent);
            return chain.a(builderB.b());
        }
    }

    private ClientUserAgent() {
    }

    private final Dispatcher createDispatcher() {
        int i7;
        int i10;
        Dispatcher dispatcher = new Dispatcher();
        synchronized (dispatcher) {
            i7 = dispatcher.f17313a;
        }
        int i11 = i7 * 2;
        if (i11 < 1) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("max < 1: ", Integer.valueOf(i11)).toString());
        }
        synchronized (dispatcher) {
            dispatcher.f17313a = i11;
            Unit unit = Unit.f14616a;
        }
        dispatcher.e();
        synchronized (dispatcher) {
            i10 = dispatcher.f17313a;
        }
        if (i10 < 1) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("max < 1: ", Integer.valueOf(i10)).toString());
        }
        synchronized (dispatcher) {
            dispatcher.f17314b = i10;
        }
        dispatcher.e();
        return dispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient init$lambda$0(Context context, String str) {
        OkHttpClient.Builder builderCreateClientBuilder = OkHttpClientProvider.createClientBuilder(context);
        Dispatcher dispatcher = INSTANCE.createDispatcher();
        builderCreateClientBuilder.getClass();
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(dispatcher, "<set-?>");
        builderCreateClientBuilder.f17344a = dispatcher;
        DiscordUserAgentInterceptor interceptor = new DiscordUserAgentInterceptor(str);
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        builderCreateClientBuilder.f17346c.add(interceptor);
        return new OkHttpClient(builderCreateClientBuilder);
    }

    public final void init(@NotNull Context context, @NotNull String userAgent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        OkHttpClientProvider.setOkHttpClientFactory(new i(4, context, userAgent));
    }
}
