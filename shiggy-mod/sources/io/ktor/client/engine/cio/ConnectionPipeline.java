package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.sockets.Connection;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: compiled from: ConnectionPipeline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lio/ktor/client/engine/cio/ConnectionPipeline;", "Lkotlinx/coroutines/CoroutineScope;", "", "keepAliveTime", "", "pipelineMaxSize", "Lio/ktor/network/sockets/Connection;", "connection", "", "overProxy", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/client/engine/cio/RequestTask;", "tasks", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "<init>", "(JILio/ktor/network/sockets/Connection;ZLkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/utils/io/ByteReadChannel;", "networkInput", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "networkOutput", "Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlinx/coroutines/sync/Semaphore;", "requestLimit", "Lkotlinx/coroutines/sync/Semaphore;", "Lio/ktor/client/engine/cio/ConnectionResponseTask;", "responseChannel", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/Job;", "pipelineContext", "Lkotlinx/coroutines/Job;", "getPipelineContext", "()Lkotlinx/coroutines/Job;", "responseHandler", "ktor-client-cio"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ConnectionPipeline implements CoroutineScope {
    private final CoroutineContext coroutineContext;
    private final ByteReadChannel networkInput;
    private final ByteWriteChannel networkOutput;
    private final Job pipelineContext;
    private final Semaphore requestLimit;
    private final Channel<ConnectionResponseTask> responseChannel;
    private final Job responseHandler;

    public ConnectionPipeline(long j, int i, Connection connection, boolean z, Channel<RequestTask> tasks, CoroutineContext parentContext) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        this.coroutineContext = parentContext.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
        this.networkInput = connection.getInput();
        this.networkOutput = connection.getOutput();
        this.requestLimit = SemaphoreKt.Semaphore$default(i, 0, 2, null);
        this.responseChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        ConnectionPipeline connectionPipeline = this;
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(connectionPipeline, null, CoroutineStart.LAZY, new ConnectionPipeline$pipelineContext$1(j, this, z, tasks, null), 1, null);
        this.pipelineContext = jobLaunch$default;
        Job jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(connectionPipeline, null, CoroutineStart.LAZY, new ConnectionPipeline$responseHandler$1(this, connection, null), 1, null);
        this.responseHandler = jobLaunch$default2;
        jobLaunch$default.start();
        jobLaunch$default2.start();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final Job getPipelineContext() {
        return this.pipelineContext;
    }
}
