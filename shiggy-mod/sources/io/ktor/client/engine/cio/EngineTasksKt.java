package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.plugins.HttpTimeoutCapability;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMethod;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EngineTasks.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/client/request/HttpRequestData;", "", "requiresDedicatedConnection", "(Lio/ktor/client/request/HttpRequestData;)Z", "containsCustomTimeouts", "ktor-client-cio"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class EngineTasksKt {
    public static final boolean requiresDedicatedConnection(HttpRequestData httpRequestData) {
        Intrinsics.checkNotNullParameter(httpRequestData, "<this>");
        List<Headers> listListOf = CollectionsKt.listOf((Object[]) new Headers[]{httpRequestData.getHeaders(), httpRequestData.getBody().getHeaders()});
        if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
            for (Headers headers : listListOf) {
                if (Intrinsics.areEqual(headers.get(HttpHeaders.INSTANCE.getConnection()), "close") || headers.contains(HttpHeaders.INSTANCE.getUpgrade())) {
                }
            }
            if (!CollectionsKt.listOf((Object[]) new HttpMethod[]{HttpMethod.INSTANCE.getGet(), HttpMethod.INSTANCE.getHead()}).contains(httpRequestData.getMethod()) && !containsCustomTimeouts(httpRequestData) && !HttpRequestKt.isSseRequest(httpRequestData)) {
                return false;
            }
        } else if (!CollectionsKt.listOf((Object[]) new HttpMethod[]{HttpMethod.INSTANCE.getGet(), HttpMethod.INSTANCE.getHead()}).contains(httpRequestData.getMethod())) {
        }
        return true;
    }

    private static final boolean containsCustomTimeouts(HttpRequestData httpRequestData) {
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) httpRequestData.getCapabilityOrNull(HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig != null) {
            return (httpTimeoutConfig.get_connectTimeoutMillis() == null && httpTimeoutConfig.get_socketTimeoutMillis() == null) ? false : true;
        }
        return false;
    }
}
