package io.ktor.network.tls;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ActorScope;

/* JADX INFO: compiled from: TLSClientHandshake.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ActorScope;", "Lio/ktor/network/tls/TLSRecord;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "io.ktor.network.tls.TLSClientHandshake$output$1", f = "TLSClientHandshake.kt", i = {0, 1, 1, 1}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 114}, m = "invokeSuspend", n = {"$this$actor", "$this$actor", "rawRecord", "record"}, s = {"L$0", "L$0", "L$2", "L$3"}, v = 1)
final class TLSClientHandshake$output$1 extends SuspendLambda implements Function2<ActorScope<TLSRecord>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteWriteChannel $rawOutput;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ TLSClientHandshake this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TLSClientHandshake$output$1(TLSClientHandshake tLSClientHandshake, ByteWriteChannel byteWriteChannel, Continuation<? super TLSClientHandshake$output$1> continuation) {
        super(2, continuation);
        this.this$0 = tLSClientHandshake;
        this.$rawOutput = byteWriteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TLSClientHandshake$output$1 tLSClientHandshake$output$1 = new TLSClientHandshake$output$1(this.this$0, this.$rawOutput, continuation);
        tLSClientHandshake$output$1.L$0 = obj;
        return tLSClientHandshake$output$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ActorScope<TLSRecord> actorScope, Continuation<? super Unit> continuation) {
        return ((TLSClientHandshake$output$1) create(actorScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001e, B:22:0x0067, B:24:0x006f, B:26:0x007b, B:28:0x0083, B:29:0x0088), top: B:35:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001e, B:22:0x0067, B:24:0x006f, B:26:0x007b, B:28:0x0083, B:29:0x0088), top: B:35:0x001e }] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (io.ktor.network.tls.RenderKt.writeRecord(r9.$rawOutput, r5, r9) == r1) goto L31;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a3 -> B:8:0x0021). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            kotlinx.coroutines.channels.ActorScope r0 = (kotlinx.coroutines.channels.ActorScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L2e
            if (r2 != r3) goto L26
            java.lang.Object r2 = r9.L$3
            io.ktor.network.tls.TLSRecord r2 = (io.ktor.network.tls.TLSRecord) r2
            java.lang.Object r2 = r9.L$2
            io.ktor.network.tls.TLSRecord r2 = (io.ktor.network.tls.TLSRecord) r2
            java.lang.Object r2 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L23
        L21:
            r10 = r2
            goto L41
        L23:
            r10 = move-exception
            goto La6
        L26:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2e:
            java.lang.Object r2 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L59
        L36:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.channels.Channel r10 = r0.getChannel()
            kotlinx.coroutines.channels.ChannelIterator r10 = r10.iterator()
        L41:
            r2 = r9
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r9.L$0 = r0
            r9.L$1 = r10
            r5 = 0
            r9.L$2 = r5
            r9.L$3 = r5
            r9.label = r4
            java.lang.Object r2 = r10.hasNext(r2)
            if (r2 != r1) goto L56
            goto La5
        L56:
            r8 = r2
            r2 = r10
            r10 = r8
        L59:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lad
            java.lang.Object r10 = r2.next()
            io.ktor.network.tls.TLSRecord r10 = (io.ktor.network.tls.TLSRecord) r10
            io.ktor.network.tls.TLSClientHandshake r5 = r9.this$0     // Catch: java.lang.Throwable -> L23
            boolean r5 = r5.getUseCipher()     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L7a
            io.ktor.network.tls.TLSClientHandshake r5 = r9.this$0     // Catch: java.lang.Throwable -> L23
            io.ktor.network.tls.cipher.TLSCipher r5 = io.ktor.network.tls.TLSClientHandshake.access$getCipher(r5)     // Catch: java.lang.Throwable -> L23
            io.ktor.network.tls.TLSRecord r5 = r5.encrypt(r10)     // Catch: java.lang.Throwable -> L23
            goto L7b
        L7a:
            r5 = r10
        L7b:
            io.ktor.network.tls.TLSRecordType r6 = r10.getType()     // Catch: java.lang.Throwable -> L23
            io.ktor.network.tls.TLSRecordType r7 = io.ktor.network.tls.TLSRecordType.ChangeCipherSpec     // Catch: java.lang.Throwable -> L23
            if (r6 != r7) goto L88
            io.ktor.network.tls.TLSClientHandshake r6 = r9.this$0     // Catch: java.lang.Throwable -> L23
            r6.setUseCipher(r4)     // Catch: java.lang.Throwable -> L23
        L88:
            io.ktor.utils.io.ByteWriteChannel r6 = r9.$rawOutput     // Catch: java.lang.Throwable -> L23
            r7 = r9
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7     // Catch: java.lang.Throwable -> L23
            r9.L$0 = r0     // Catch: java.lang.Throwable -> L23
            r9.L$1 = r2     // Catch: java.lang.Throwable -> L23
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Throwable -> L23
            r9.L$2 = r10     // Catch: java.lang.Throwable -> L23
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)     // Catch: java.lang.Throwable -> L23
            r9.L$3 = r10     // Catch: java.lang.Throwable -> L23
            r9.label = r3     // Catch: java.lang.Throwable -> L23
            java.lang.Object r10 = io.ktor.network.tls.RenderKt.writeRecord(r6, r5, r7)     // Catch: java.lang.Throwable -> L23
            if (r10 != r1) goto L21
        La5:
            return r1
        La6:
            kotlinx.coroutines.channels.Channel r0 = r0.getChannel()
            r0.close(r10)
        Lad:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.TLSClientHandshake$output$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
