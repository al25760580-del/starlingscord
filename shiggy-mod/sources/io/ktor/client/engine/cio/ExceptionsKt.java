package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.util.ThrowableKt;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lio/ktor/client/request/HttpRequestData;", "request", "mapToKtor", "(Ljava/lang/Throwable;Lio/ktor/client/request/HttpRequestData;)Ljava/lang/Throwable;", "ktor-client-cio"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ExceptionsKt {
    public static final Throwable mapToKtor(Throwable th, HttpRequestData request) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Throwable cause = th.getCause();
        SocketTimeoutException SocketTimeoutException = (cause != null ? ThrowableKt.getRootCause(cause) : null) instanceof SocketTimeoutException ? HttpTimeoutKt.SocketTimeoutException(request, th.getCause()) : th.getCause();
        return SocketTimeoutException == null ? th : SocketTimeoutException;
    }
}
