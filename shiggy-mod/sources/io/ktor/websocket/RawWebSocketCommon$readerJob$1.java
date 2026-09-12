package io.ktor.websocket;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: RawWebSocketCommon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", f = "RawWebSocketCommon.kt", i = {1, 2, 3}, l = {98, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 105, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m = "invokeSuspend", n = {"frame", "cause", "cause"}, s = {"L$0", "L$0", "L$0"}, v = 1)
final class RawWebSocketCommon$readerJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawWebSocketCommon$readerJob$1(RawWebSocketCommon rawWebSocketCommon, Continuation<? super RawWebSocketCommon$readerJob$1> continuation) {
        super(2, continuation);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RawWebSocketCommon$readerJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RawWebSocketCommon$readerJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004c A[Catch: all -> 0x003e, CancellationException -> 0x0040, ProtocolViolationException -> 0x0043, FrameTooBigException -> 0x0046, EOFException | ClosedReceiveChannelException -> 0x00b1, EOFException | ClosedReceiveChannelException -> 0x00b1, TRY_ENTER, TryCatch #4 {EOFException | ClosedReceiveChannelException -> 0x00b1, blocks: (B:19:0x0036, B:31:0x004c, B:31:0x004c, B:34:0x006d, B:34:0x006d, B:36:0x0079, B:36:0x0079, B:40:0x008b, B:40:0x008b, B:39:0x0083, B:39:0x0083, B:41:0x008e, B:41:0x008e, B:20:0x003a), top: B:64:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[Catch: all -> 0x003e, CancellationException -> 0x0040, ProtocolViolationException -> 0x0043, FrameTooBigException -> 0x0046, EOFException | ClosedReceiveChannelException -> 0x00b1, EOFException | ClosedReceiveChannelException -> 0x00b1, PHI: r11
      0x006d: PHI (r11v14 java.lang.Object) = (r11v19 java.lang.Object), (r11v0 java.lang.Object) binds: [B:32:0x0069, B:20:0x003a] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {EOFException | ClosedReceiveChannelException -> 0x00b1, blocks: (B:19:0x0036, B:31:0x004c, B:31:0x004c, B:34:0x006d, B:34:0x006d, B:36:0x0079, B:36:0x0079, B:40:0x008b, B:40:0x008b, B:39:0x0083, B:39:0x0083, B:41:0x008e, B:41:0x008e, B:20:0x003a), top: B:64:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0079 A[Catch: all -> 0x003e, CancellationException -> 0x0040, ProtocolViolationException -> 0x0043, FrameTooBigException -> 0x0046, EOFException | ClosedReceiveChannelException -> 0x00b1, EOFException | ClosedReceiveChannelException -> 0x00b1, TryCatch #4 {EOFException | ClosedReceiveChannelException -> 0x00b1, blocks: (B:19:0x0036, B:31:0x004c, B:31:0x004c, B:34:0x006d, B:34:0x006d, B:36:0x0079, B:36:0x0079, B:40:0x008b, B:40:0x008b, B:39:0x0083, B:39:0x0083, B:41:0x008e, B:41:0x008e, B:20:0x003a), top: B:64:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[Catch: all -> 0x003e, CancellationException -> 0x0040, ProtocolViolationException -> 0x0043, FrameTooBigException -> 0x0046, EOFException | ClosedReceiveChannelException -> 0x00b1, EOFException | ClosedReceiveChannelException -> 0x00b1, TryCatch #4 {EOFException | ClosedReceiveChannelException -> 0x00b1, blocks: (B:19:0x0036, B:31:0x004c, B:31:0x004c, B:34:0x006d, B:34:0x006d, B:36:0x0079, B:36:0x0079, B:40:0x008b, B:40:0x008b, B:39:0x0083, B:39:0x0083, B:41:0x008e, B:41:0x008e, B:20:0x003a), top: B:64:0x000b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00a3 -> B:31:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommon$readerJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
