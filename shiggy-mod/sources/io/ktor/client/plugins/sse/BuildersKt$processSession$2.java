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

/* JADX INFO: compiled from: builders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {1270, 1273, 1285, 1285}, m = "invokeSuspend", n = {"this_$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "this_$iv", "response$iv", "$this$body$iv$iv", "$completion$iv$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "$i$f$body", "this_$iv", "response$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv", "this_$iv", "response$iv", "$i$f$body", "$i$f$unwrapRequestTimeoutException", "$i$a$-unwrapRequestTimeoutException-HttpStatement$body$4$iv"}, s = {"L$0", "I$0", "I$1", "I$2", "L$0", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2"}, v = 1)
public final class BuildersKt$processSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CompletableDeferred<T> $sessionDeferred;
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
    public BuildersKt$processSession$2(HttpStatement httpStatement, CompletableDeferred<T> completableDeferred, HttpClient httpClient, Continuation<? super BuildersKt$processSession$2> continuation) {
        super(2, continuation);
        this.$statement = httpStatement;
        this.$sessionDeferred = completableDeferred;
        this.$this_processSession = httpClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuildersKt$processSession$2(this.$statement, this.$sessionDeferred, this.$this_processSession, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuildersKt$processSession$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0141, code lost:
    
        if (r12.cleanup(r11, r17) == r2) goto L50;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.BuildersKt$processSession$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
