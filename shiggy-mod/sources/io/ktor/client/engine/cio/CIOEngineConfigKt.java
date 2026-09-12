package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CIOEngineConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/engine/cio/CIOEngineConfig;", "Lkotlin/Function1;", "Lio/ktor/client/engine/cio/EndpointConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", "endpoint", "(Lio/ktor/client/engine/cio/CIOEngineConfig;Lkotlin/jvm/functions/Function1;)Lio/ktor/client/engine/cio/EndpointConfig;", "ktor-client-cio"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CIOEngineConfigKt {
    public static final EndpointConfig endpoint(CIOEngineConfig cIOEngineConfig, Function1<? super EndpointConfig, Unit> block) {
        Intrinsics.checkNotNullParameter(cIOEngineConfig, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        EndpointConfig endpoint = cIOEngineConfig.getEndpoint();
        block.invoke(endpoint);
        return endpoint;
    }
}
