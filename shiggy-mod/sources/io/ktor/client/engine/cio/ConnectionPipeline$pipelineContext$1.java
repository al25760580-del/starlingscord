package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: ConnectionPipeline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "io.ktor.client.engine.cio.ConnectionPipeline$pipelineContext$1", f = "ConnectionPipeline.kt", i = {1, 2, 3, 4}, l = {44, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 50, 56, 57}, m = "invokeSuspend", n = {"task", "task", "task", "task"}, s = {"L$0", "L$0", "L$0", "L$0"}, v = 1)
final class ConnectionPipeline$pipelineContext$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $keepAliveTime;
    final /* synthetic */ boolean $overProxy;
    final /* synthetic */ Channel<RequestTask> $tasks;
    Object L$0;
    int label;
    final /* synthetic */ ConnectionPipeline this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectionPipeline$pipelineContext$1(long j, ConnectionPipeline connectionPipeline, boolean z, Channel<RequestTask> channel, Continuation<? super ConnectionPipeline$pipelineContext$1> continuation) {
        super(2, continuation);
        this.$keepAliveTime = j;
        this.this$0 = connectionPipeline;
        this.$overProxy = z;
        this.$tasks = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConnectionPipeline$pipelineContext$1(this.$keepAliveTime, this.this$0, this.$overProxy, this.$tasks, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConnectionPipeline$pipelineContext$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051 A[Catch: all -> 0x004a, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, TRY_ENTER, TryCatch #1 {ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, blocks: (B:10:0x001c, B:30:0x0051, B:30:0x0051, B:30:0x0051, B:33:0x006b, B:33:0x006b, B:33:0x006b, B:42:0x00a3, B:42:0x00a3, B:42:0x00a3, B:45:0x00c6, B:45:0x00c6, B:45:0x00c6, B:15:0x002c, B:15:0x002c, B:15:0x002c, B:48:0x00de, B:48:0x00de, B:48:0x00de, B:49:0x00e5, B:49:0x00e5, B:49:0x00e5, B:25:0x0046, B:25:0x0046, B:25:0x0046), top: B:55:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b A[Catch: all -> 0x004a, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, PHI: r15
      0x006b: PHI (r15v16 java.lang.Object) = (r15v22 java.lang.Object), (r15v0 java.lang.Object) binds: [B:31:0x0067, B:25:0x0046] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, blocks: (B:10:0x001c, B:30:0x0051, B:30:0x0051, B:30:0x0051, B:33:0x006b, B:33:0x006b, B:33:0x006b, B:42:0x00a3, B:42:0x00a3, B:42:0x00a3, B:45:0x00c6, B:45:0x00c6, B:45:0x00c6, B:15:0x002c, B:15:0x002c, B:15:0x002c, B:48:0x00de, B:48:0x00de, B:48:0x00de, B:49:0x00e5, B:49:0x00e5, B:49:0x00e5, B:25:0x0046, B:25:0x0046, B:25:0x0046), top: B:55:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:36:0x0072, B:39:0x0086, B:18:0x0035, B:21:0x003e), top: B:55:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[Catch: all -> 0x0042, PHI: r1
      0x0086: PHI (r1v5 io.ktor.client.engine.cio.RequestTask) = (r1v19 io.ktor.client.engine.cio.RequestTask), (r1v20 io.ktor.client.engine.cio.RequestTask) binds: [B:37:0x0083, B:21:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:36:0x0072, B:39:0x0086, B:18:0x0035, B:21:0x003e), top: B:55:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3 A[Catch: all -> 0x004a, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, PHI: r1
      0x00a3: PHI (r1v4 io.ktor.client.engine.cio.RequestTask) = (r1v21 io.ktor.client.engine.cio.RequestTask), (r1v22 io.ktor.client.engine.cio.RequestTask) binds: [B:40:0x00a0, B:18:0x0035] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, blocks: (B:10:0x001c, B:30:0x0051, B:30:0x0051, B:30:0x0051, B:33:0x006b, B:33:0x006b, B:33:0x006b, B:42:0x00a3, B:42:0x00a3, B:42:0x00a3, B:45:0x00c6, B:45:0x00c6, B:45:0x00c6, B:15:0x002c, B:15:0x002c, B:15:0x002c, B:48:0x00de, B:48:0x00de, B:48:0x00de, B:49:0x00e5, B:49:0x00e5, B:49:0x00e5, B:25:0x0046, B:25:0x0046, B:25:0x0046), top: B:55:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6 A[Catch: all -> 0x004a, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, PHI: r1
      0x00c6: PHI (r1v2 java.lang.Object) = (r1v23 java.lang.Object), (r1v24 java.lang.Object) binds: [B:43:0x00c3, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {ClosedChannelException | CancellationException | ClosedReceiveChannelException -> 0x00f2, blocks: (B:10:0x001c, B:30:0x0051, B:30:0x0051, B:30:0x0051, B:33:0x006b, B:33:0x006b, B:33:0x006b, B:42:0x00a3, B:42:0x00a3, B:42:0x00a3, B:45:0x00c6, B:45:0x00c6, B:45:0x00c6, B:15:0x002c, B:15:0x002c, B:15:0x002c, B:48:0x00de, B:48:0x00de, B:48:0x00de, B:49:0x00e5, B:49:0x00e5, B:49:0x00e5, B:25:0x0046, B:25:0x0046, B:25:0x0046), top: B:55:0x000c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [io.ktor.client.engine.cio.RequestTask, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00db -> B:30:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.ConnectionPipeline$pipelineContext$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
