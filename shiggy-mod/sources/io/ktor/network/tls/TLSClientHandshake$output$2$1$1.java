package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: TLSClientHandshake.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "io.ktor.network.tls.TLSClientHandshake$output$2$1$1", f = "TLSClientHandshake.kt", i = {0, 0, 1, 1}, l = {132, 133}, m = "invokeSuspend", n = {"closeRecord", "record", "closeRecord", "record"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
final class TLSClientHandshake$output$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteWriteChannel $rawOutput;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TLSClientHandshake this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TLSClientHandshake$output$2$1$1(TLSClientHandshake tLSClientHandshake, ByteWriteChannel byteWriteChannel, Continuation<? super TLSClientHandshake$output$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = tLSClientHandshake;
        this.$rawOutput = byteWriteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TLSClientHandshake$output$2$1$1(this.this$0, this.$rawOutput, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TLSClientHandshake$output$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if (r10.$rawOutput.flushAndClose(r10) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r0 = r10.L$1
            io.ktor.network.tls.TLSRecord r0 = (io.ktor.network.tls.TLSRecord) r0
            java.lang.Object r0 = r10.L$0
            io.ktor.network.tls.TLSRecord r0 = (io.ktor.network.tls.TLSRecord) r0
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> Lb3
            goto La7
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            java.lang.Object r1 = r10.L$1
            io.ktor.network.tls.TLSRecord r1 = (io.ktor.network.tls.TLSRecord) r1
            java.lang.Object r3 = r10.L$0
            io.ktor.network.tls.TLSRecord r3 = (io.ktor.network.tls.TLSRecord) r3
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> Lb3
            goto L8d
        L2f:
            kotlin.ResultKt.throwOnFailure(r11)
            io.ktor.network.tls.TLSRecordType r5 = io.ktor.network.tls.TLSRecordType.Alert     // Catch: java.lang.Throwable -> Lb3
            kotlinx.io.Buffer r11 = new kotlinx.io.Buffer     // Catch: java.lang.Throwable -> Lb3
            r11.<init>()     // Catch: java.lang.Throwable -> Lb3
            r1 = r11
            kotlinx.io.Sink r1 = (kotlinx.io.Sink) r1     // Catch: java.lang.Throwable -> Lb3
            io.ktor.network.tls.TLSAlertLevel r4 = io.ktor.network.tls.TLSAlertLevel.WARNING     // Catch: java.lang.Throwable -> Lb3
            int r4 = r4.getCode()     // Catch: java.lang.Throwable -> Lb3
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> Lb3
            r1.writeByte(r4)     // Catch: java.lang.Throwable -> Lb3
            io.ktor.network.tls.TLSAlertType r4 = io.ktor.network.tls.TLSAlertType.CloseNotify     // Catch: java.lang.Throwable -> Lb3
            int r4 = r4.getCode()     // Catch: java.lang.Throwable -> Lb3
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> Lb3
            r1.writeByte(r4)     // Catch: java.lang.Throwable -> Lb3
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb3
            r7 = r11
            kotlinx.io.Source r7 = (kotlinx.io.Source) r7     // Catch: java.lang.Throwable -> Lb3
            io.ktor.network.tls.TLSRecord r4 = new io.ktor.network.tls.TLSRecord     // Catch: java.lang.Throwable -> Lb3
            r6 = 0
            r8 = 2
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lb3
            io.ktor.network.tls.TLSClientHandshake r11 = r10.this$0     // Catch: java.lang.Throwable -> Lb3
            boolean r11 = r11.getUseCipher()     // Catch: java.lang.Throwable -> Lb3
            if (r11 == 0) goto L71
            io.ktor.network.tls.TLSClientHandshake r11 = r10.this$0     // Catch: java.lang.Throwable -> Lb3
            io.ktor.network.tls.cipher.TLSCipher r11 = io.ktor.network.tls.TLSClientHandshake.access$getCipher(r11)     // Catch: java.lang.Throwable -> Lb3
            io.ktor.network.tls.TLSRecord r11 = r11.encrypt(r4)     // Catch: java.lang.Throwable -> Lb3
            r1 = r11
            goto L72
        L71:
            r1 = r4
        L72:
            io.ktor.utils.io.ByteWriteChannel r11 = r10.$rawOutput     // Catch: java.lang.Throwable -> Lb3
            r5 = r10
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)     // Catch: java.lang.Throwable -> Lb3
            r10.L$0 = r6     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)     // Catch: java.lang.Throwable -> Lb3
            r10.L$1 = r6     // Catch: java.lang.Throwable -> Lb3
            r10.label = r3     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r11 = io.ktor.network.tls.RenderKt.writeRecord(r11, r1, r5)     // Catch: java.lang.Throwable -> Lb3
            if (r11 != r0) goto L8c
            goto La6
        L8c:
            r3 = r4
        L8d:
            io.ktor.utils.io.ByteWriteChannel r11 = r10.$rawOutput     // Catch: java.lang.Throwable -> Lb3
            r4 = r10
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Throwable -> Lb3
            r10.L$0 = r3     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)     // Catch: java.lang.Throwable -> Lb3
            r10.L$1 = r1     // Catch: java.lang.Throwable -> Lb3
            r10.label = r2     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r11 = r11.flushAndClose(r4)     // Catch: java.lang.Throwable -> Lb3
            if (r11 != r0) goto La7
        La6:
            return r0
        La7:
            io.ktor.network.tls.TLSClientHandshake r11 = r10.this$0
            kotlinx.coroutines.CompletableJob r11 = io.ktor.network.tls.TLSClientHandshake.access$getCloseTask$p(r11)
            r11.complete()
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        Lb3:
            r0 = move-exception
            r11 = r0
            io.ktor.network.tls.TLSClientHandshake r0 = r10.this$0
            kotlinx.coroutines.CompletableJob r0 = io.ktor.network.tls.TLSClientHandshake.access$getCloseTask$p(r0)
            r0.complete()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.TLSClientHandshake$output$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
