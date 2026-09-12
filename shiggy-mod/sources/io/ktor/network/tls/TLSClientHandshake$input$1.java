package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: TLSClientHandshake.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/ktor/network/tls/TLSRecord;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "io.ktor.network.tls.TLSClientHandshake$input$1", f = "TLSClientHandshake.kt", i = {0, 0, 1, 1, 1, 1, 1}, l = {HtmlCompat.FROM_HTML_MODE_COMPACT, 93}, m = "invokeSuspend", n = {"$this$produce", "useCipher", "$this$produce", "rawRecord", "record", "packet", "useCipher"}, s = {"L$0", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
final class TLSClientHandshake$input$1 extends SuspendLambda implements Function2<ProducerScope<? super TLSRecord>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteReadChannel $rawInput;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ TLSClientHandshake this$0;

    /* JADX INFO: compiled from: TLSClientHandshake.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TLSRecordType.values().length];
            try {
                iArr[TLSRecordType.Alert.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TLSRecordType.ChangeCipherSpec.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TLSClientHandshake$input$1(ByteReadChannel byteReadChannel, TLSClientHandshake tLSClientHandshake, Continuation<? super TLSClientHandshake$input$1> continuation) {
        super(2, continuation);
        this.$rawInput = byteReadChannel;
        this.this$0 = tLSClientHandshake;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TLSClientHandshake$input$1 tLSClientHandshake$input$1 = new TLSClientHandshake$input$1(this.$rawInput, this.this$0, continuation);
        tLSClientHandshake$input$1.L$0 = obj;
        return tLSClientHandshake$input$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super TLSRecord> producerScope, Continuation<? super Unit> continuation) {
        return ((TLSClientHandshake$input$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[Catch: all -> 0x0038, ClosedReceiveChannelException -> 0x0138, PHI: r3 r7
      0x0057: PHI (r3v2 int) = (r3v12 int), (r3v13 int) binds: [B:18:0x0054, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r7v0 java.lang.Object) = (r7v14 java.lang.Object), (r7v15 java.lang.Object) binds: [B:18:0x0054, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {ClosedReceiveChannelException -> 0x0138, all -> 0x0038, blocks: (B:7:0x0024, B:17:0x003f, B:20:0x0057, B:22:0x005b, B:24:0x0067, B:27:0x007b, B:31:0x00af, B:34:0x00b7, B:35:0x00d5, B:36:0x00d6, B:37:0x00dd, B:38:0x00de, B:40:0x00f6, B:43:0x0102, B:12:0x0032), top: B:54:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[Catch: all -> 0x0038, ClosedReceiveChannelException -> 0x0138, TryCatch #3 {ClosedReceiveChannelException -> 0x0138, all -> 0x0038, blocks: (B:7:0x0024, B:17:0x003f, B:20:0x0057, B:22:0x005b, B:24:0x0067, B:27:0x007b, B:31:0x00af, B:34:0x00b7, B:35:0x00d5, B:36:0x00d6, B:37:0x00dd, B:38:0x00de, B:40:0x00f6, B:43:0x0102, B:12:0x0032), top: B:54:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[Catch: all -> 0x0038, ClosedReceiveChannelException -> 0x0138, TryCatch #3 {ClosedReceiveChannelException -> 0x0138, all -> 0x0038, blocks: (B:7:0x0024, B:17:0x003f, B:20:0x0057, B:22:0x005b, B:24:0x0067, B:27:0x007b, B:31:0x00af, B:34:0x00b7, B:35:0x00d5, B:36:0x00d6, B:37:0x00dd, B:38:0x00de, B:40:0x00f6, B:43:0x0102, B:12:0x0032), top: B:54:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af A[Catch: all -> 0x0038, ClosedReceiveChannelException -> 0x0138, TryCatch #3 {ClosedReceiveChannelException -> 0x0138, all -> 0x0038, blocks: (B:7:0x0024, B:17:0x003f, B:20:0x0057, B:22:0x005b, B:24:0x0067, B:27:0x007b, B:31:0x00af, B:34:0x00b7, B:35:0x00d5, B:36:0x00d6, B:37:0x00dd, B:38:0x00de, B:40:0x00f6, B:43:0x0102, B:12:0x0032), top: B:54:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[Catch: all -> 0x0038, ClosedReceiveChannelException -> 0x0138, TryCatch #3 {ClosedReceiveChannelException -> 0x0138, all -> 0x0038, blocks: (B:7:0x0024, B:17:0x003f, B:20:0x0057, B:22:0x005b, B:24:0x0067, B:27:0x007b, B:31:0x00af, B:34:0x00b7, B:35:0x00d5, B:36:0x00d6, B:37:0x00dd, B:38:0x00de, B:40:0x00f6, B:43:0x0102, B:12:0x0032), top: B:54:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6 A[Catch: all -> 0x0038, ClosedReceiveChannelException -> 0x0138, TryCatch #3 {ClosedReceiveChannelException -> 0x0138, all -> 0x0038, blocks: (B:7:0x0024, B:17:0x003f, B:20:0x0057, B:22:0x005b, B:24:0x0067, B:27:0x007b, B:31:0x00af, B:34:0x00b7, B:35:0x00d5, B:36:0x00d6, B:37:0x00dd, B:38:0x00de, B:40:0x00f6, B:43:0x0102, B:12:0x0032), top: B:54:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00de A[Catch: all -> 0x0038, ClosedReceiveChannelException -> 0x0138, TryCatch #3 {ClosedReceiveChannelException -> 0x0138, all -> 0x0038, blocks: (B:7:0x0024, B:17:0x003f, B:20:0x0057, B:22:0x005b, B:24:0x0067, B:27:0x007b, B:31:0x00af, B:34:0x00b7, B:35:0x00d5, B:36:0x00d6, B:37:0x00dd, B:38:0x00de, B:40:0x00f6, B:43:0x0102, B:12:0x0032), top: B:54:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6 A[Catch: all -> 0x0038, ClosedReceiveChannelException -> 0x0138, TRY_LEAVE, TryCatch #3 {ClosedReceiveChannelException -> 0x0138, all -> 0x0038, blocks: (B:7:0x0024, B:17:0x003f, B:20:0x0057, B:22:0x005b, B:24:0x0067, B:27:0x007b, B:31:0x00af, B:34:0x00b7, B:35:0x00d5, B:36:0x00d6, B:37:0x00dd, B:38:0x00de, B:40:0x00f6, B:43:0x0102, B:12:0x0032), top: B:54:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0102 A[Catch: all -> 0x0038, ClosedReceiveChannelException -> 0x0138, TRY_ENTER, TRY_LEAVE, TryCatch #3 {ClosedReceiveChannelException -> 0x0138, all -> 0x0038, blocks: (B:7:0x0024, B:17:0x003f, B:20:0x0057, B:22:0x005b, B:24:0x0067, B:27:0x007b, B:31:0x00af, B:34:0x00b7, B:35:0x00d5, B:36:0x00d6, B:37:0x00dd, B:38:0x00de, B:40:0x00f6, B:43:0x0102, B:12:0x0032), top: B:54:0x0010 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00aa -> B:17:0x003f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b5 -> B:17:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.TLSClientHandshake$input$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
