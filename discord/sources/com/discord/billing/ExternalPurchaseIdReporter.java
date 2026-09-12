package com.discord.billing;

import ar.k0;
import ar.v0;
import com.discord.apirequestconfig.DiscordApiRequestConfig;
import com.discord.logging.Log;
import com.discord.metric_monitor.MetricEvent;
import com.discord.metric_monitor.MonitoringAgent;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.b0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002J!\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/billing/ExternalPurchaseIdReporter;", "", "<init>", "()V", "TAG", "", "httpClient", "Lokhttp3/OkHttpClient;", "jsonMediaType", "Lokhttp3/MediaType;", "report", "", "externalPurchaseId", "externalProductId", "postExternalPurchaseId", "", "trackResult", "statusCode", "exceptionName", "(Ljava/lang/Integer;Ljava/lang/String;)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExternalPurchaseIdReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalPurchaseIdReporter.kt\ncom/discord/billing/ExternalPurchaseIdReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,80:1\n1#2:81\n216#3,2:82\n*S KotlinDebug\n*F\n+ 1 ExternalPurchaseIdReporter.kt\ncom/discord/billing/ExternalPurchaseIdReporter\n*L\n55#1:82,2\n*E\n"})
public final class ExternalPurchaseIdReporter {

    @NotNull
    private static final String TAG = "ExternalPurchaseIdReporter";

    @NotNull
    private static final MediaType jsonMediaType;

    @NotNull
    public static final ExternalPurchaseIdReporter INSTANCE = new ExternalPurchaseIdReporter();

    @NotNull
    private static final OkHttpClient httpClient = OkHttpClientProvider.getOkHttpClient();

    /* JADX INFO: renamed from: com.discord.billing.ExternalPurchaseIdReporter$report$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.billing.ExternalPurchaseIdReporter$report$1", f = "ExternalPurchaseIdReporter.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $externalProductId;
        final /* synthetic */ String $externalPurchaseId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.$externalProductId = str;
            this.$externalPurchaseId = str2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$externalProductId, this.$externalPurchaseId, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            String simpleName;
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            Log.i$default(Log.INSTANCE, ExternalPurchaseIdReporter.TAG, a3.e.m("reporting external purchase id product=", this.$externalProductId, " token=", b0.B(12, this.$externalPurchaseId)), (Throwable) null, 4, (Object) null);
            Integer num = null;
            try {
                simpleName = null;
                num = new Integer(ExternalPurchaseIdReporter.INSTANCE.postExternalPurchaseId(this.$externalPurchaseId, this.$externalProductId));
            } catch (Exception e10) {
                Log.INSTANCE.w(ExternalPurchaseIdReporter.TAG, "external purchase id report failed product=" + this.$externalProductId, e10);
                simpleName = Reflection.getOrCreateKotlinClass(e10.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "Exception";
                }
            }
            ExternalPurchaseIdReporter.INSTANCE.trackResult(num, simpleName);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    static {
        Pattern pattern = MediaType.f17329d;
        jsonMediaType = a.a.i("application/json");
    }

    private ExternalPurchaseIdReporter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int postExternalPurchaseId(String externalPurchaseId, String externalProductId) {
        DiscordApiRequestConfig discordApiRequestConfig = DiscordApiRequestConfig.INSTANCE.get();
        if (discordApiRequestConfig == null) {
            throw new IllegalArgumentException("no api config");
        }
        JsonObject jsonObject = new JsonObject(w0.g(new Pair("external_purchase_id", pr.h.c(externalPurchaseId)), new Pair("external_product_id", pr.h.c(externalProductId))));
        Request.Builder builder = new Request.Builder();
        builder.i(discordApiRequestConfig.getApiBaseUrl() + "/billing/orders/external-purchase-id");
        RequestBody.Companion companion = RequestBody.Companion;
        String string = jsonObject.toString();
        MediaType mediaType = jsonMediaType;
        companion.getClass();
        okhttp3.d body = RequestBody.Companion.a(string, mediaType);
        Intrinsics.checkNotNullParameter(body, "body");
        builder.f("POST", body);
        builder.a("Authorization", discordApiRequestConfig.getToken());
        for (Map.Entry<String, String> entry : discordApiRequestConfig.getHeaders().entrySet()) {
            builder.a(entry.getKey(), entry.getValue());
        }
        Response responseE = httpClient.a(builder.b()).e();
        try {
            boolean zG = responseE.g();
            int i7 = responseE.f17382v;
            if (!zG) {
                Log.w$default(Log.INSTANCE, TAG, "external purchase id post failed status=" + i7 + " product=" + externalProductId, (Throwable) null, 4, (Object) null);
            }
            responseE.close();
            return i7;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(responseE, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackResult(Integer statusCode, String exceptionName) {
        try {
            MonitoringAgent monitoringAgent = MonitoringAgent.INSTANCE;
            Object obj = statusCode;
            if (statusCode == null) {
                obj = ViewProps.NONE;
            }
            String str = "status:" + obj;
            if (exceptionName == null) {
                exceptionName = ViewProps.NONE;
            }
            monitoringAgent.increment(new MetricEvent("billing_manager.external_purchase_id_report", d0.g(str, "exception:".concat(exceptionName))));
        } catch (Exception unused) {
        }
    }

    public final void report(@NotNull String externalPurchaseId, @NotNull String externalProductId) {
        Intrinsics.checkNotNullParameter(externalPurchaseId, "externalPurchaseId");
        Intrinsics.checkNotNullParameter(externalProductId, "externalProductId");
        hr.e eVar = k0.f2938a;
        ar.b0.t(v0.f2972d, hr.d.f11103i, new AnonymousClass1(externalProductId, externalPurchaseId, null), 2);
    }
}
