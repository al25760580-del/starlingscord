package io.ktor.client.engine.cio;

import ShiggyXposed.xposed.BuildConfig;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketAddress;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.util.collections.ConcurrentMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: compiled from: ConnectionFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00170\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/ktor/client/engine/cio/ConnectionFactory;", "", "Lio/ktor/network/selector/SelectorManager;", "selector", "", "connectionsLimit", "addressConnectionsLimit", "<init>", "(Lio/ktor/network/selector/SelectorManager;II)V", "Lio/ktor/network/sockets/SocketAddress;", "address", "Lkotlin/Function1;", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "", "Lkotlin/ExtensionFunctionType;", "configuration", "Lio/ktor/network/sockets/Socket;", "connect", "(Lio/ktor/network/sockets/SocketAddress;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.BUILD_TYPE, "(Lio/ktor/network/sockets/SocketAddress;)V", "Lio/ktor/network/selector/SelectorManager;", "I", "Lkotlinx/coroutines/sync/Semaphore;", "limit", "Lkotlinx/coroutines/sync/Semaphore;", "Lio/ktor/util/collections/ConcurrentMap;", "addressLimit", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-cio"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ConnectionFactory {
    private final int addressConnectionsLimit;
    private final ConcurrentMap<SocketAddress, Semaphore> addressLimit;
    private final Semaphore limit;
    private final SelectorManager selector;

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.ConnectionFactory$connect$1, reason: invalid class name */
    /* JADX INFO: compiled from: ConnectionFactory.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.engine.cio.ConnectionFactory", f = "ConnectionFactory.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {24, 27, 30}, m = "connect", n = {"address", "configuration", "address", "configuration", "addressSemaphore", "address", "configuration", "addressSemaphore"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionFactory.this.connect(null, null, this);
        }
    }

    public ConnectionFactory(SelectorManager selector, int i, int i2) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.selector = selector;
        this.addressConnectionsLimit = i2;
        this.limit = SemaphoreKt.Semaphore$default(i, 0, 2, null);
        this.addressLimit = new ConcurrentMap<>(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.network.sockets.SocketAddress, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.ktor.network.sockets.SocketAddress, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Semaphore] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r9v9, types: [io.ktor.network.sockets.TcpSocketBuilder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connect(io.ktor.network.sockets.SocketAddress r7, kotlin.jvm.functions.Function1<? super io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions, kotlin.Unit> r8, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Socket> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.ktor.client.engine.cio.ConnectionFactory.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r9
            io.ktor.client.engine.cio.ConnectionFactory$connect$1 r0 = (io.ktor.client.engine.cio.ConnectionFactory.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            io.ktor.client.engine.cio.ConnectionFactory$connect$1 r0 = new io.ktor.client.engine.cio.ConnectionFactory$connect$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L67
            if (r2 == r5) goto L5a
            if (r2 == r4) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.sync.Semaphore r7 = (kotlinx.coroutines.sync.Semaphore) r7
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r8 = r0.L$0
            io.ktor.network.sockets.SocketAddress r8 = (io.ktor.network.sockets.SocketAddress) r8
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3d
            goto Lb8
        L3d:
            r8 = move-exception
            goto Lbb
        L40:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L48:
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.sync.Semaphore r7 = (kotlinx.coroutines.sync.Semaphore) r7
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r2 = r0.L$0
            io.ktor.network.sockets.SocketAddress r2 = (io.ktor.network.sockets.SocketAddress) r2
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L58
            goto L97
        L58:
            r7 = move-exception
            goto Lbf
        L5a:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r7 = r0.L$0
            io.ktor.network.sockets.SocketAddress r7 = (io.ktor.network.sockets.SocketAddress) r7
            kotlin.ResultKt.throwOnFailure(r9)
            goto L79
        L67:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.sync.Semaphore r9 = r6.limit
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.acquire(r0)
            if (r9 != r1) goto L79
            goto Lb7
        L79:
            io.ktor.util.collections.ConcurrentMap<io.ktor.network.sockets.SocketAddress, kotlinx.coroutines.sync.Semaphore> r9 = r6.addressLimit     // Catch: java.lang.Throwable -> L58
            io.ktor.client.engine.cio.ConnectionFactory$$ExternalSyntheticLambda0 r2 = new io.ktor.client.engine.cio.ConnectionFactory$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.Object r9 = r9.computeIfAbsent(r7, r2)     // Catch: java.lang.Throwable -> L58
            kotlinx.coroutines.sync.Semaphore r9 = (kotlinx.coroutines.sync.Semaphore) r9     // Catch: java.lang.Throwable -> L58
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L58
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L58
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L58
            r0.label = r4     // Catch: java.lang.Throwable -> L58
            java.lang.Object r2 = r9.acquire(r0)     // Catch: java.lang.Throwable -> L58
            if (r2 != r1) goto L95
            goto Lb7
        L95:
            r2 = r7
            r7 = r9
        L97:
            io.ktor.network.selector.SelectorManager r9 = r6.selector     // Catch: java.lang.Throwable -> L3d
            io.ktor.network.sockets.SocketBuilder r9 = io.ktor.network.sockets.BuildersKt.aSocket(r9)     // Catch: java.lang.Throwable -> L3d
            io.ktor.network.sockets.TcpSocketBuilder r9 = r9.tcp()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)     // Catch: java.lang.Throwable -> L3d
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)     // Catch: java.lang.Throwable -> L3d
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L3d
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L3d
            r0.label = r3     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r9 = r9.connect(r2, r8, r0)     // Catch: java.lang.Throwable -> L3d
            if (r9 != r1) goto Lb8
        Lb7:
            return r1
        Lb8:
            io.ktor.network.sockets.Socket r9 = (io.ktor.network.sockets.Socket) r9     // Catch: java.lang.Throwable -> L3d
            return r9
        Lbb:
            r7.release()     // Catch: java.lang.Throwable -> L58
            throw r8     // Catch: java.lang.Throwable -> L58
        Lbf:
            kotlinx.coroutines.sync.Semaphore r8 = r6.limit
            r8.release()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.ConnectionFactory.connect(io.ktor.network.sockets.SocketAddress, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object connect$default(ConnectionFactory connectionFactory, SocketAddress socketAddress, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.engine.cio.ConnectionFactory$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ConnectionFactory.connect$lambda$0((SocketOptions.TCPClientSocketOptions) obj2);
                }
            };
        }
        return connectionFactory.connect(socketAddress, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connect$lambda$0(SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        Intrinsics.checkNotNullParameter(tCPClientSocketOptions, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Semaphore connect$lambda$1(ConnectionFactory connectionFactory) {
        return SemaphoreKt.Semaphore$default(connectionFactory.addressConnectionsLimit, 0, 2, null);
    }

    public final void release(SocketAddress address) {
        Intrinsics.checkNotNullParameter(address, "address");
        Semaphore semaphore = this.addressLimit.get(address);
        if (semaphore != null) {
            semaphore.release();
        }
        this.limit.release();
    }
}
