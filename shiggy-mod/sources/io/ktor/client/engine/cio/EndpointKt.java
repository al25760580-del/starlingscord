package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.plugins.HttpTimeoutCapability;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.http.URLProtocolKt;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.slf4j.Logger;

/* JADX INFO: compiled from: Endpoint.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "callContext", "Lio/ktor/client/request/HttpRequestData;", "request", "", "timeout", "", "setupTimeout", "(Lkotlin/coroutines/CoroutineContext;Lio/ktor/client/request/HttpRequestData;J)V", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "engineConfig", "getRequestTimeout", "(Lio/ktor/client/request/HttpRequestData;Lio/ktor/client/engine/cio/CIOEngineConfig;)J", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "ktor-client-cio"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class EndpointKt {
    private static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.engine.cio.Endpoint");

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupTimeout(CoroutineContext coroutineContext, HttpRequestData httpRequestData, long j) {
        if (j == Long.MAX_VALUE || j == 0) {
            return;
        }
        final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, new CoroutineName("cio-request-timeout"), null, new EndpointKt$setupTimeout$timeoutJob$1(j, coroutineContext, httpRequestData, null), 2, null);
        JobKt.getJob(coroutineContext).invokeOnCompletion(new Function1() { // from class: io.ktor.client.engine.cio.EndpointKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EndpointKt.setupTimeout$lambda$0(jobLaunch$default, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupTimeout$lambda$0(Job job, Throwable th) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final long getRequestTimeout(HttpRequestData request, CIOEngineConfig engineConfig) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(engineConfig, "engineConfig");
        boolean zIsWebsocket = URLProtocolKt.isWebsocket(request.getUrl().getProtocol());
        if (request.getCapabilityOrNull(HttpTimeoutCapability.INSTANCE) != null || zIsWebsocket || HttpRequestKt.isUpgradeRequest(request) || HttpRequestKt.isSseRequest(request)) {
            return Long.MAX_VALUE;
        }
        return engineConfig.getRequestTimeout();
    }
}
