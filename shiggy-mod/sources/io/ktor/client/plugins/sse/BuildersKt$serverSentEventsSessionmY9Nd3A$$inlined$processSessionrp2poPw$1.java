package io.ktor.client.plugins.sse;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpStatement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSession-mY9Nd3A$$inlined$processSession-rp2poPw$1, reason: invalid class name */
/* JADX INFO: compiled from: builders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "io/ktor/client/plugins/sse/BuildersKt$processSession$2"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {1270, 1273, 1285, 1285}, m = "invokeSuspend", n = {"this_$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "this_$iv", "response$iv", "$this$body$iv$iv", "$completion$iv$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$i$f$body", "this_$iv", "response$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "this_$iv", "response$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv"}, s = {"L$0", "I$0", "I$1", "I$2", "L$0", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2"}, v = 1)
public final class BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CompletableDeferred $sessionDeferred;
    final /* synthetic */ HttpStatement $statement;
    final /* synthetic */ HttpClient $this_processSession;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(HttpStatement httpStatement, CompletableDeferred completableDeferred, HttpClient httpClient, Continuation continuation) {
        super(2, continuation);
        this.$statement = httpStatement;
        this.$sessionDeferred = completableDeferred;
        this.$this_processSession = httpClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(this.$statement, this.$sessionDeferred, this.$this_processSession, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[Catch: all -> 0x0064, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:17:0x005d, B:42:0x00e7, B:46:0x0116, B:47:0x011d), top: B:63:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0116 A[Catch: all -> 0x0064, TRY_ENTER, TryCatch #1 {all -> 0x0064, blocks: (B:17:0x005d, B:42:0x00e7, B:46:0x0116, B:47:0x011d), top: B:63:0x005d }] */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        if (r10.cleanup(r9, r16) == r2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0143, code lost:
    
        if (r10.cleanup(r9, r16) == r2) goto L52;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
