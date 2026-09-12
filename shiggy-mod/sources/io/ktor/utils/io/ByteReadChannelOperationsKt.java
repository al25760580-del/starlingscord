package io.ktor.utils.io;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import io.ktor.utils.io.core.BuffersKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.InputKt;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.io.Buffer;
import kotlinx.io.ByteStringsKt;
import kotlinx.io.Segment;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;
import kotlinx.io.bytestring.ByteString;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* JADX INFO: compiled from: ByteReadChannelOperations.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000H\u0086@¢\u0006\u0004\b\t\u0010\u0003\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u0000H\u0086@¢\u0006\u0004\b\r\u0010\u0003\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0011\u0010\u0003\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u001c\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u001c\u0010\u001b\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001e\u0010\u0015\u001a\u001c\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001f\u0010\u001c\u001a$\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001f\u0010!\u001a\u001c\u0010#\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\b#\u0010\u0015\u001a\u0014\u0010%\u001a\u00020$*\u00020\u0000H\u0086@¢\u0006\u0004\b%\u0010\u0003\u001a\u001c\u0010%\u001a\u00020$*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b%\u0010&\u001a0\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\nH\u0086@¢\u0006\u0004\b*\u0010+\u001a-\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010,\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0-¢\u0006\u0004\b*\u0010/\u001aN\u0010:\u001a\u000209*\u0002002\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020\u00012'\u0010.\u001a#\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0002\b8¢\u0006\u0004\b:\u0010;\u001aJ\u0010:\u001a\u000209*\u0002002\u0006\u00102\u001a\u0002012\u0006\u0010\u001a\u001a\u00020<2'\u0010.\u001a#\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0002\b8¢\u0006\u0004\b:\u0010=\u001a\u001c\u0010?\u001a\u00020$*\u00020\u00002\u0006\u0010>\u001a\u00020\nH\u0086@¢\u0006\u0004\b?\u0010\u0015\u001a\u001c\u0010A\u001a\u00020\u0013*\u00020\u00002\u0006\u0010@\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bA\u0010&\u001a\u001e\u0010B\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bB\u0010&\u001a*\u0010F\u001a\u00020\u0001*\u00020\u00002\n\u0010E\u001a\u00060Cj\u0002`D2\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\bF\u0010G\u001a4\u0010F\u001a\u00020\u0001*\u00020\u00002\n\u0010E\u001a\u00060Cj\u0002`D2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010I\u001a\u00020HH\u0087@¢\u0006\u0004\bJ\u0010K\u001aF\u0010M\u001a\u00020\n*\u00020\u000020\b\u0004\u0010.\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n06\u0012\u0006\u0012\u0004\u0018\u0001070LH\u0086H¢\u0006\u0004\bM\u0010N\u001a0\u0010Q\u001a\u00020\u0013*\u00020\u00002\u0006\u0010E\u001a\u00020\u00042\b\b\u0002\u0010O\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\nH\u0086@¢\u0006\u0004\bQ\u0010+\u001a\u0013\u0010R\u001a\u00020\u0013*\u00020\u0000H\u0007¢\u0006\u0004\bR\u0010S\u001a\u0013\u0010R\u001a\u00020\u0013*\u00020\u0019H\u0007¢\u0006\u0004\bR\u0010T\u001a\u0013\u0010R\u001a\u00020\u0013*\u00020<H\u0007¢\u0006\u0004\bR\u0010U\u001a8\u0010Z\u001a\u00020\u000e*\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u00192\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010Y\u001a\u00020\u0001H\u0086@¢\u0006\u0004\bZ\u0010[\u001a\u001c\u0010]\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\\\u001a\u00020VH\u0086@¢\u0006\u0004\b]\u0010^\u001a\u001e\u0010_\u001a\u0004\u0018\u00010V*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\b_\u0010\u0015\"\u001b\u0010c\u001a\u00020\n*\u00020\u00198F¢\u0006\f\u0012\u0004\bb\u0010T\u001a\u0004\b`\u0010a\"\u0014\u0010d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010e\"\u0014\u0010f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010e\"\u001b\u0010j\u001a\u00020\n*\u00020\u00008F¢\u0006\f\u0012\u0004\bi\u0010S\u001a\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "exhausted", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toByteArray", "", "readByte", "", "readShort", "", "readInt", "", "readFloat", "", "readLong", "", "readDouble", "numberOfBytes", "", "awaitUntilReadable", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/Buffer;", "readBuffer", "max", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "copyAndClose", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "readUTF8Line", "copyTo", "limit", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "readByteArray", "Lkotlinx/io/Source;", "readRemaining", "(Lio/ktor/utils/io/ByteReadChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buffer", "offset", "length", "readAvailable", "(Lio/ktor/utils/io/ByteReadChannel;[BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "min", "Lkotlin/Function1;", "block", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/jvm/functions/Function1;)I", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "autoFlush", "Lkotlin/Function2;", "Lio/ktor/utils/io/ReaderScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lio/ktor/utils/io/ReaderJob;", "reader", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ZLkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/utils/io/ByteChannel;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteChannel;Lkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/ReaderJob;", "packet", "readPacket", "value", "discardExact", "discard", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "readUTF8LineTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/LineEndingMode;", "lineEnding", "readUTF8LineTo-RRvyBJ8", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", "read", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "readFully", "rethrowCloseCauseIfNeeded", "(Lio/ktor/utils/io/ByteReadChannel;)V", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "(Lio/ktor/utils/io/ByteChannel;)V", "Lkotlinx/io/bytestring/ByteString;", "matchString", "writeChannel", "ignoreMissing", "readUntil", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "byteString", "skipIfFound", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "peek", "getAvailableForWrite", "(Lio/ktor/utils/io/ByteWriteChannel;)I", "getAvailableForWrite$annotations", "availableForWrite", "CR", "B", "LF", "getAvailableForRead", "(Lio/ktor/utils/io/ByteReadChannel;)I", "getAvailableForRead$annotations", "availableForRead", "ktor-io"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ByteReadChannelOperationsKt {
    private static final byte CR = 13;
    private static final byte LF = 10;

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1, reason: invalid class name */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {92}, m = "awaitUntilReadable", n = {"$this$awaitUntilReadable", "numberOfBytes"}, s = {"L$0", "I$0"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.awaitUntilReadable(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {132, 133, 142, 142}, m = "copyAndClose", n = {"$this$copyAndClose", "channel", "result", "$this$copyAndClose", "channel", "result", "$this$copyAndClose", "channel", "result", "$this$copyAndClose", "channel", "result"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0"}, v = 1)
    static final class C01451 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C01451(Continuation<? super C01451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.copyAndClose(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {171, 172, 179, 179}, m = "copyTo", n = {"$this$copyTo", "channel", "result", "$this$copyTo", "channel", "result", "$this$copyTo", "channel", "result", "$this$copyTo", "channel", "result"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0"}, v = 1)
    static final class C01461 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C01461(Continuation<? super C01461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.copyTo(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {190, 194, 201, 201}, m = "copyTo", n = {"$this$copyTo", "channel", "limit", "remaining", "$this$copyTo", "channel", "limit", "remaining", "count", "$this$copyTo", "channel", "limit", "remaining", "$this$copyTo", "channel", "limit", "remaining"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "J$2", "L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1"}, v = 1)
    static final class AnonymousClass2 extends ContinuationImpl {
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.copyTo(null, null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {393}, m = "discard", n = {"$this$discard", "max", "remaining"}, s = {"L$0", "J$0", "J$1"}, v = 1)
    static final class C01471 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01471(Continuation<? super C01471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.discard(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {385}, m = "discardExact", n = {"$this$discardExact", "value"}, s = {"L$0", "J$0"}, v = 1)
    static final class C01481 extends ContinuationImpl {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01481(Continuation<? super C01481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.discardExact(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$exhausted$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {34}, m = "exhausted", n = {"$this$exhausted"}, s = {"L$0"}, v = 1)
    static final class C01491 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01491(Continuation<? super C01491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.exhausted(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {618}, m = "peek", n = {"$this$peek", "count"}, s = {"L$0", "I$0"}, v = 1)
    static final class C01501 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01501(Continuation<? super C01501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.peek(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$read$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {499, 504}, m = "read", n = {"$this$read", "block", "$i$f$read", "$this$read", "block", "result", "this_$iv", "buffer$iv", "head$iv", "array", "$i$f$read", "$i$f$readFromHead", "endExclusive", "start", "$i$a$-readFromHead-ByteReadChannelOperationsKt$read$2"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    static final class C01511 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C01511(Continuation<? super C01511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.read(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0}, l = {259}, m = "readAvailable", n = {"$this$readAvailable", "buffer", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 1)
    static final class C01521 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01521(Continuation<? super C01521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readAvailable(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY}, m = "readBuffer", n = {"$this$readBuffer", "result"}, s = {"L$0", "L$1"}, v = 1)
    static final class C01531 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01531(Continuation<? super C01531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readBuffer(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$3, reason: invalid class name */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0}, l = {116}, m = "readBuffer", n = {"$this$readBuffer", "result", "max", "remaining"}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 1)
    static final class AnonymousClass3 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readBuffer(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {45}, m = "readByte", n = {"$this$readByte", "currentBuffer"}, s = {"L$0", "L$1"}, v = 1)
    static final class C01541 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01541(Continuation<? super C01541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readByte(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 0, 0}, l = {209}, m = "readByteArray", n = {"$this$readByteArray", "builder$iv", "$this$readByteArray_u24lambda_u240", "count", "$i$f$buildPacket", "$i$a$-buildPacket-ByteReadChannelOperationsKt$readByteArray$2"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2"}, v = 1)
    static final class C01551 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C01551(Continuation<? super C01551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readByteArray(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readDouble$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {87}, m = "readDouble", n = {"$this$readDouble"}, s = {"L$0"}, v = 1)
    static final class C01561 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01561(Continuation<? super C01561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readDouble(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readFloat$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {70}, m = "readFloat", n = {"$this$readFloat"}, s = {"L$0"}, v = 1)
    static final class C01571 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01571(Continuation<? super C01571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readFloat(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 0}, l = {533}, m = "readFully", n = {"$this$readFully", "out", "start", "end", "offset"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2"}, v = 1)
    static final class C01581 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01581(Continuation<? super C01581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readFully(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {59}, m = "readInt", n = {"$this$readInt"}, s = {"L$0"}, v = 1)
    static final class C01591 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01591(Continuation<? super C01591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readInt(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {76}, m = "readLong", n = {"$this$readLong"}, s = {"L$0"}, v = 1)
    static final class C01601 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01601(Continuation<? super C01601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readLong(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {368}, m = "readPacket", n = {"$this$readPacket", "result", "packet"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    static final class C01611 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01611(Continuation<? super C01611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readPacket(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {219}, m = "readRemaining", n = {"$this$readRemaining", "result"}, s = {"L$0", "L$1"}, v = 1)
    static final class C01621 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01621(Continuation<? super C01621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readRemaining(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0}, l = {239}, m = "readRemaining", n = {"$this$readRemaining", "result", "max", "remaining"}, s = {"L$0", "L$1", "J$0", "J$1"}, v = 1)
    static final class C01632 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01632(Continuation<? super C01632> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readRemaining(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {53}, m = "readShort", n = {"$this$readShort"}, s = {"L$0"}, v = 1)
    static final class C01641 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01641(Continuation<? super C01641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readShort(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {161}, m = "readUTF8Line", n = {"$this$readUTF8Line", "result", "max"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    static final class C01651 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01651(Continuation<? super C01651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readUTF8Line(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8LineTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {446, 461, 485}, m = "readUTF8LineTo-RRvyBJ8", n = {"$this$readUTF8LineTo_u2dRRvyBJ8", "out", "max", "$v$c$io-ktor-utils-io-LineEndingMode$-lineEnding$0", "$this$readUTF8LineTo_u2dRRvyBJ8", "out", "lineBuffer", "max", "$v$c$io-ktor-utils-io-LineEndingMode$-lineEnding$0", "$i$a$-use-ByteReadChannelOperationsKt$readUTF8LineTo$3", "b", "$this$readUTF8LineTo_u2dRRvyBJ8", "out", "lineBuffer", "max", "$v$c$io-ktor-utils-io-LineEndingMode$-lineEnding$0", "$i$a$-use-ByteReadChannelOperationsKt$readUTF8LineTo$3"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$3", "I$0", "I$1", "I$2", "B$0", "L$0", "L$1", "L$3", "I$0", "I$1", "I$2"}, v = 1)
    static final class C01662 extends ContinuationImpl {
        byte B$0;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C01662(Continuation<? super C01662> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.m423readUTF8LineToRRvyBJ8(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 1, 1}, l = {598, 599}, m = "skipIfFound", n = {"$this$skipIfFound", "byteString", "$this$skipIfFound", "byteString"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    static final class C01681 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01681(Continuation<? super C01681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.skipIfFound(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {39}, m = "toByteArray", n = {"$this$toByteArray"}, s = {"L$0"}, v = 1)
    static final class C01691 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01691(Continuation<? super C01691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.toByteArray(null, this);
        }
    }

    public static /* synthetic */ void getAvailableForRead$annotations(ByteReadChannel byteReadChannel) {
    }

    public static /* synthetic */ void getAvailableForWrite$annotations(ByteWriteChannel byteWriteChannel) {
    }

    public static final int getAvailableForWrite(ByteWriteChannel byteWriteChannel) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        return 1048576 - BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object exhausted(ByteReadChannel byteReadChannel, Continuation<? super Boolean> continuation) throws Throwable {
        C01491 c01491;
        if (continuation instanceof C01491) {
            c01491 = (C01491) continuation;
            if ((c01491.label & Integer.MIN_VALUE) != 0) {
                c01491.label -= Integer.MIN_VALUE;
            } else {
                c01491 = new C01491(continuation);
            }
        } else {
            c01491 = new C01491(continuation);
        }
        Object obj = c01491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01491.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (byteReadChannel.getReadBuffer().exhausted()) {
                c01491.L$0 = byteReadChannel;
                c01491.label = 1;
                if (ByteReadChannel.awaitContent$default(byteReadChannel, 0, c01491, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c01491.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(byteReadChannel.getReadBuffer().exhausted());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object toByteArray(ByteReadChannel byteReadChannel, Continuation<? super byte[]> continuation) throws Throwable {
        C01691 c01691;
        if (continuation instanceof C01691) {
            c01691 = (C01691) continuation;
            if ((c01691.label & Integer.MIN_VALUE) != 0) {
                c01691.label -= Integer.MIN_VALUE;
            } else {
                c01691 = new C01691(continuation);
            }
        } else {
            c01691 = new C01691(continuation);
        }
        Object buffer = c01691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01691.label;
        if (i == 0) {
            ResultKt.throwOnFailure(buffer);
            c01691.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
            c01691.label = 1;
            buffer = readBuffer(byteReadChannel, c01691);
            if (buffer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(buffer);
        }
        return BuffersKt.readBytes$default((Buffer) buffer, 0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readByte(ByteReadChannel byteReadChannel, Continuation<? super Byte> continuation) throws Throwable {
        C01541 c01541;
        Source readBuffer;
        Source source;
        if (continuation instanceof C01541) {
            c01541 = (C01541) continuation;
            if ((c01541.label & Integer.MIN_VALUE) != 0) {
                c01541.label -= Integer.MIN_VALUE;
            } else {
                c01541 = new C01541(continuation);
            }
        } else {
            c01541 = new C01541(continuation);
        }
        Object obj = c01541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01541.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            readBuffer = byteReadChannel.getReadBuffer();
            if (readBuffer.exhausted()) {
                c01541.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
                c01541.L$1 = readBuffer;
                c01541.label = 1;
                Object objAwaitContent$default = ByteReadChannel.awaitContent$default(byteReadChannel, 0, c01541, 1, null);
                if (objAwaitContent$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objAwaitContent$default;
                source = readBuffer;
            }
            return Boxing.boxByte(readBuffer.readByte());
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        source = (Source) c01541.L$1;
        ResultKt.throwOnFailure(obj);
        if (!((Boolean) obj).booleanValue()) {
            throw new EOFException("Not enough data available");
        }
        readBuffer = source;
        return Boxing.boxByte(readBuffer.readByte());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readShort(ByteReadChannel byteReadChannel, Continuation<? super Short> continuation) throws Throwable {
        C01641 c01641;
        if (continuation instanceof C01641) {
            c01641 = (C01641) continuation;
            if ((c01641.label & Integer.MIN_VALUE) != 0) {
                c01641.label -= Integer.MIN_VALUE;
            } else {
                c01641 = new C01641(continuation);
            }
        } else {
            c01641 = new C01641(continuation);
        }
        Object obj = c01641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01641.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c01641.L$0 = byteReadChannel;
            c01641.label = 1;
            if (awaitUntilReadable(byteReadChannel, 2, c01641) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c01641.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxShort(byteReadChannel.getReadBuffer().readShort());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readInt(ByteReadChannel byteReadChannel, Continuation<? super Integer> continuation) throws Throwable {
        C01591 c01591;
        if (continuation instanceof C01591) {
            c01591 = (C01591) continuation;
            if ((c01591.label & Integer.MIN_VALUE) != 0) {
                c01591.label -= Integer.MIN_VALUE;
            } else {
                c01591 = new C01591(continuation);
            }
        } else {
            c01591 = new C01591(continuation);
        }
        Object obj = c01591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01591.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c01591.L$0 = byteReadChannel;
            c01591.label = 1;
            if (awaitUntilReadable(byteReadChannel, 4, c01591) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c01591.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxInt(byteReadChannel.getReadBuffer().readInt());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readFloat(ByteReadChannel byteReadChannel, Continuation<? super Float> continuation) throws Throwable {
        C01571 c01571;
        if (continuation instanceof C01571) {
            c01571 = (C01571) continuation;
            if ((c01571.label & Integer.MIN_VALUE) != 0) {
                c01571.label -= Integer.MIN_VALUE;
            } else {
                c01571 = new C01571(continuation);
            }
        } else {
            c01571 = new C01571(continuation);
        }
        Object obj = c01571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01571.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c01571.L$0 = byteReadChannel;
            c01571.label = 1;
            if (awaitUntilReadable(byteReadChannel, 4, c01571) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c01571.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxFloat(SourcesKt.readFloat(byteReadChannel.getReadBuffer()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readLong(ByteReadChannel byteReadChannel, Continuation<? super Long> continuation) throws Throwable {
        C01601 c01601;
        if (continuation instanceof C01601) {
            c01601 = (C01601) continuation;
            if ((c01601.label & Integer.MIN_VALUE) != 0) {
                c01601.label -= Integer.MIN_VALUE;
            } else {
                c01601 = new C01601(continuation);
            }
        } else {
            c01601 = new C01601(continuation);
        }
        Object obj = c01601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01601.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c01601.L$0 = byteReadChannel;
            c01601.label = 1;
            if (awaitUntilReadable(byteReadChannel, 8, c01601) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c01601.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxLong(byteReadChannel.getReadBuffer().readLong());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readDouble(ByteReadChannel byteReadChannel, Continuation<? super Double> continuation) throws Throwable {
        C01561 c01561;
        if (continuation instanceof C01561) {
            c01561 = (C01561) continuation;
            if ((c01561.label & Integer.MIN_VALUE) != 0) {
                c01561.label -= Integer.MIN_VALUE;
            } else {
                c01561 = new C01561(continuation);
            }
        } else {
            c01561 = new C01561(continuation);
        }
        Object obj = c01561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01561.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c01561.L$0 = byteReadChannel;
            c01561.label = 1;
            if (awaitUntilReadable(byteReadChannel, 8, c01561) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c01561.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxDouble(SourcesKt.readDouble(byteReadChannel.getReadBuffer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object awaitUntilReadable(ByteReadChannel byteReadChannel, int i, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objAwaitContent = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitContent);
            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
            anonymousClass1.I$0 = i;
            anonymousClass1.label = 1;
            objAwaitContent = byteReadChannel.awaitContent(i, anonymousClass1);
            if (objAwaitContent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = anonymousClass1.I$0;
            ResultKt.throwOnFailure(objAwaitContent);
        }
        if (!((Boolean) objAwaitContent).booleanValue()) {
            throw new EOFException("Not enough data available");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readBuffer(ByteReadChannel byteReadChannel, Continuation<? super Buffer> continuation) throws Throwable {
        C01531 c01531;
        Buffer buffer;
        if (continuation instanceof C01531) {
            c01531 = (C01531) continuation;
            if ((c01531.label & Integer.MIN_VALUE) != 0) {
                c01531.label -= Integer.MIN_VALUE;
            } else {
                c01531 = new C01531(continuation);
            }
        } else {
            c01531 = new C01531(continuation);
        }
        Object obj = c01531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01531.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            buffer = new Buffer();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Buffer buffer2 = (Buffer) c01531.L$1;
            ByteReadChannel byteReadChannel2 = (ByteReadChannel) c01531.L$0;
            ResultKt.throwOnFailure(obj);
            buffer = buffer2;
            byteReadChannel = byteReadChannel2;
        }
        while (!byteReadChannel.isClosedForRead()) {
            buffer.transferFrom(byteReadChannel.getReadBuffer());
            c01531.L$0 = byteReadChannel;
            c01531.L$1 = buffer;
            c01531.label = 1;
            if (ByteReadChannel.awaitContent$default(byteReadChannel, 0, c01531, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause == null) {
            return buffer;
        }
        throw closedCause;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:25:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:24:0x0070). Please report as a decompilation issue!!! */
    public static final Object readBuffer(ByteReadChannel byteReadChannel, int i, Continuation<? super Buffer> continuation) throws Throwable {
        AnonymousClass3 anonymousClass3;
        Buffer buffer;
        int i2;
        ByteReadChannel byteReadChannel2;
        int i3;
        int i4;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            if ((anonymousClass3.label & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(continuation);
        }
        Object obj = anonymousClass3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = anonymousClass3.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            buffer = new Buffer();
            i2 = i;
            if (i > 0 || byteReadChannel.isClosedForRead()) {
                return buffer;
            }
            if (byteReadChannel.getReadBuffer().exhausted()) {
                anonymousClass3.L$0 = byteReadChannel;
                anonymousClass3.L$1 = buffer;
                anonymousClass3.I$0 = i2;
                anonymousClass3.I$1 = i;
                anonymousClass3.label = 1;
                if (ByteReadChannel.awaitContent$default(byteReadChannel, 0, anonymousClass3, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteReadChannel2 = byteReadChannel;
                i3 = i;
                i4 = i2;
            }
            long jMin = Math.min(i, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
            byteReadChannel.getReadBuffer().readTo(buffer, jMin);
            i -= (int) jMin;
            if (i > 0) {
            }
            return buffer;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i3 = anonymousClass3.I$1;
        i4 = anonymousClass3.I$0;
        buffer = (Buffer) anonymousClass3.L$1;
        byteReadChannel2 = (ByteReadChannel) anonymousClass3.L$0;
        ResultKt.throwOnFailure(obj);
        i2 = i4;
        i = i3;
        byteReadChannel = byteReadChannel2;
        long jMin2 = Math.min(i, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
        byteReadChannel.getReadBuffer().readTo(buffer, jMin2);
        i -= (int) jMin2;
        if (i > 0) {
        }
        return buffer;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #2 {all -> 0x00de, blocks: (B:27:0x0081, B:29:0x0087, B:36:0x00ba, B:44:0x00dd), top: B:59:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba A[Catch: all -> 0x00de, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00de, blocks: (B:27:0x0081, B:29:0x0087, B:36:0x00ba, B:44:0x00dd), top: B:59:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd A[Catch: all -> 0x00de, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00de, blocks: (B:27:0x0081, B:29:0x0087, B:36:0x00ba, B:44:0x00dd), top: B:59:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r15 == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r13v0, types: [io.ktor.utils.io.ByteReadChannel] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [long] */
    /* JADX WARN: Type inference failed for: r13v2, types: [long] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v5, types: [long] */
    /* JADX WARN: Type inference failed for: r13v6, types: [io.ktor.utils.io.ByteReadChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v1, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [io.ktor.utils.io.ByteReadChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [io.ktor.utils.io.ByteReadChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [long] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b7 -> B:20:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyAndClose(io.ktor.utils.io.ByteReadChannel r13, io.ktor.utils.io.ByteWriteChannel r14, kotlin.coroutines.Continuation<? super java.lang.Long> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.copyAndClose(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readUTF8Line(ByteReadChannel byteReadChannel, int i, Continuation<? super String> continuation) throws Throwable {
        C01651 c01651;
        StringBuilder sb;
        if (continuation instanceof C01651) {
            c01651 = (C01651) continuation;
            if ((c01651.label & Integer.MIN_VALUE) != 0) {
                c01651.label -= Integer.MIN_VALUE;
            } else {
                c01651 = new C01651(continuation);
            }
        } else {
            c01651 = new C01651(continuation);
        }
        Object obj = c01651.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c01651.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            StringBuilder sb2 = new StringBuilder();
            c01651.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
            c01651.L$1 = sb2;
            c01651.I$0 = i;
            c01651.label = 1;
            Object uTF8LineTo = readUTF8LineTo(byteReadChannel, sb2, i, c01651);
            if (uTF8LineTo == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = uTF8LineTo;
            sb = sb2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = c01651.I$0;
            sb = (StringBuilder) c01651.L$1;
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return sb.toString();
        }
        return null;
    }

    public static /* synthetic */ Object readUTF8Line$default(ByteReadChannel byteReadChannel, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readUTF8Line(byteReadChannel, i, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0080, B:29:0x0086), top: B:54:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        if (r15 == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r13v0, types: [io.ktor.utils.io.ByteReadChannel] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [long] */
    /* JADX WARN: Type inference failed for: r13v2, types: [long] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v5, types: [long] */
    /* JADX WARN: Type inference failed for: r13v6, types: [io.ktor.utils.io.ByteReadChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v1, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [io.ktor.utils.io.ByteReadChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [io.ktor.utils.io.ByteReadChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [long] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [long] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b6 -> B:20:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel r13, io.ktor.utils.io.ByteWriteChannel r14, kotlin.coroutines.Continuation<? super java.lang.Long> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.awaitContent$default(r1, 0, r12, 1, null) == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ed, code lost:
    
        if (r0 == r2) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ed -> B:20:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel r17, io.ktor.utils.io.ByteWriteChannel r18, long r19, kotlin.coroutines.Continuation<? super java.lang.Long> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007b -> B:12:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object readByteArray(io.ktor.utils.io.ByteReadChannel r8, int r9, kotlin.coroutines.Continuation<? super byte[]> r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C01551
            if (r0 == 0) goto L14
            r0 = r10
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C01551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L4c
            if (r2 != r3) goto L44
            int r8 = r0.I$2
            int r9 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$2
            kotlinx.io.Sink r4 = (kotlinx.io.Sink) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.io.Buffer r5 = (kotlinx.io.Buffer) r5
            java.lang.Object r6 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r6 = (io.ktor.utils.io.ByteReadChannel) r6
            kotlin.ResultKt.throwOnFailure(r10)
            r7 = r5
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r0
            r0 = r9
            r9 = r2
        L42:
            r2 = r7
            goto L82
        L44:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4c:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.io.Buffer r10 = new kotlinx.io.Buffer
            r10.<init>()
            r2 = r10
            kotlinx.io.Sink r2 = (kotlinx.io.Sink) r2
            r4 = 0
            r5 = r10
            r10 = r4
        L5a:
            int r6 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(r2)
            if (r6 >= r9) goto L8d
            int r6 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(r2)
            int r6 = r9 - r6
            r0.L$0 = r8
            r0.L$1 = r5
            r0.L$2 = r2
            r0.I$0 = r9
            r0.I$1 = r10
            r0.I$2 = r4
            r0.label = r3
            java.lang.Object r6 = readPacket(r8, r6, r0)
            if (r6 != r1) goto L7b
            return r1
        L7b:
            r7 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            goto L42
        L82:
            kotlinx.io.Source r10 = (kotlinx.io.Source) r10
            io.ktor.utils.io.core.BytePacketBuilderKt.writePacket(r4, r10)
            r10 = r0
            r0 = r2
            r2 = r4
            r4 = r5
            r5 = r6
            goto L5a
        L8d:
            kotlinx.io.Source r5 = (kotlinx.io.Source) r5
            byte[] r8 = kotlinx.io.SourcesKt.readByteArray(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readByteArray(io.ktor.utils.io.ByteReadChannel, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readRemaining(ByteReadChannel byteReadChannel, Continuation<? super Source> continuation) throws Throwable {
        C01621 c01621;
        Sink sinkBytePacketBuilder;
        if (continuation instanceof C01621) {
            c01621 = (C01621) continuation;
            if ((c01621.label & Integer.MIN_VALUE) != 0) {
                c01621.label -= Integer.MIN_VALUE;
            } else {
                c01621 = new C01621(continuation);
            }
        } else {
            c01621 = new C01621(continuation);
        }
        Object obj = c01621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01621.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sinkBytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sink sink = (Sink) c01621.L$1;
            ByteReadChannel byteReadChannel2 = (ByteReadChannel) c01621.L$0;
            ResultKt.throwOnFailure(obj);
            sinkBytePacketBuilder = sink;
            byteReadChannel = byteReadChannel2;
        }
        while (!byteReadChannel.isClosedForRead()) {
            sinkBytePacketBuilder.transferFrom(byteReadChannel.getReadBuffer());
            c01621.L$0 = byteReadChannel;
            c01621.L$1 = sinkBytePacketBuilder;
            c01621.label = 1;
            if (ByteReadChannel.awaitContent$default(byteReadChannel, 0, c01621, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        rethrowCloseCauseIfNeeded(byteReadChannel);
        return sinkBytePacketBuilder.getBufferField();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readRemaining(ByteReadChannel byteReadChannel, long j, Continuation<? super Source> continuation) throws Throwable {
        C01632 c01632;
        Sink sinkBytePacketBuilder;
        long j2;
        if (continuation instanceof C01632) {
            c01632 = (C01632) continuation;
            if ((c01632.label & Integer.MIN_VALUE) != 0) {
                c01632.label -= Integer.MIN_VALUE;
            } else {
                c01632 = new C01632(continuation);
            }
        } else {
            c01632 = new C01632(continuation);
        }
        Object obj = c01632.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01632.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sinkBytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
            j2 = j;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = c01632.J$1;
            j2 = c01632.J$0;
            Sink sink = (Sink) c01632.L$1;
            ByteReadChannel byteReadChannel2 = (ByteReadChannel) c01632.L$0;
            ResultKt.throwOnFailure(obj);
            sinkBytePacketBuilder = sink;
            j = j3;
            byteReadChannel = byteReadChannel2;
        }
        while (!byteReadChannel.isClosedForRead()) {
            long remaining = 0;
            if (j <= 0) {
                break;
            }
            if (j >= ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer())) {
                remaining = j - ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer());
                Boxing.boxLong(byteReadChannel.getReadBuffer().transferTo(sinkBytePacketBuilder));
            } else {
                byteReadChannel.getReadBuffer().readTo(sinkBytePacketBuilder, j);
            }
            c01632.L$0 = byteReadChannel;
            c01632.L$1 = sinkBytePacketBuilder;
            c01632.J$0 = j2;
            c01632.J$1 = remaining;
            c01632.label = 1;
            if (ByteReadChannel.awaitContent$default(byteReadChannel, 0, c01632, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = remaining;
        }
        return sinkBytePacketBuilder.getBufferField();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readAvailable(ByteReadChannel byteReadChannel, byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        C01521 c01521;
        if (continuation instanceof C01521) {
            c01521 = (C01521) continuation;
            if ((c01521.label & Integer.MIN_VALUE) != 0) {
                c01521.label -= Integer.MIN_VALUE;
            } else {
                c01521 = new C01521(continuation);
            }
        } else {
            c01521 = new C01521(continuation);
        }
        Object obj = c01521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c01521.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (byteReadChannel.isClosedForRead()) {
                return Boxing.boxInt(-1);
            }
            if (byteReadChannel.getReadBuffer().exhausted()) {
                c01521.L$0 = byteReadChannel;
                c01521.L$1 = bArr;
                c01521.I$0 = i;
                c01521.I$1 = i2;
                c01521.label = 1;
                if (ByteReadChannel.awaitContent$default(byteReadChannel, 0, c01521, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c01521.I$1;
            int i5 = c01521.I$0;
            byte[] bArr2 = (byte[]) c01521.L$1;
            ByteReadChannel byteReadChannel2 = (ByteReadChannel) c01521.L$0;
            ResultKt.throwOnFailure(obj);
            i2 = i4;
            byteReadChannel = byteReadChannel2;
            i = i5;
            bArr = bArr2;
        }
        return byteReadChannel.isClosedForRead() ? Boxing.boxInt(-1) : Boxing.boxInt(InputKt.readAvailable(byteReadChannel.getReadBuffer(), bArr, i, i2));
    }

    public static /* synthetic */ Object readAvailable$default(ByteReadChannel byteReadChannel, byte[] bArr, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        return readAvailable(byteReadChannel, bArr, i, i2, continuation);
    }

    public static final int readAvailable(ByteReadChannel byteReadChannel, int i, Function1<? super Buffer, Integer> block) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (i <= 0) {
            throw new IllegalArgumentException("min should be positive".toString());
        }
        if (i > 1048576) {
            throw new IllegalArgumentException(("Min(" + i + ") shouldn't be greater than 1048576").toString());
        }
        if (getAvailableForRead(byteReadChannel) < i) {
            return -1;
        }
        return block.invoke(byteReadChannel.getReadBuffer().getBufferField()).intValue();
    }

    public static /* synthetic */ ReaderJob reader$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return reader(coroutineScope, coroutineContext, z, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    public static final ReaderJob reader(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z, Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return reader(coroutineScope, coroutineContext, new ByteChannel(false, 1, null), block);
    }

    public static final ReaderJob reader(CoroutineScope coroutineScope, CoroutineContext coroutineContext, final ByteChannel channel, Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new ByteReadChannelOperationsKt$reader$job$1(block, channel, null), 2, null);
        jobLaunch$default.invokeOnCompletion(new Function1() { // from class: io.ktor.utils.io.ByteReadChannelOperationsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ByteReadChannelOperationsKt.reader$lambda$0$0(channel, (Throwable) obj);
            }
        });
        return new ReaderJob(CloseHookByteWriteChannelKt.onClose(channel, new C01671(jobLaunch$default, null)), jobLaunch$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reader$lambda$0$0(ByteChannel byteChannel, Throwable th) {
        if (th != null && !byteChannel.isClosedForRead()) {
            byteChannel.cancel(th);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$reader$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ByteReadChannelOperations.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$1", f = "ByteReadChannelOperations.kt", i = {}, l = {353}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C01671 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Job $job;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01671(Job job, Continuation<? super C01671> continuation) {
            super(1, continuation);
            this.$job = job;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C01671(this.$job, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C01671) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$job.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f A[PHI: r11 r12 r13
      0x006f: PHI (r11v5 io.ktor.utils.io.ByteReadChannel) = (r11v3 io.ktor.utils.io.ByteReadChannel), (r11v7 io.ktor.utils.io.ByteReadChannel) binds: [B:18:0x0058, B:23:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r12v7 kotlinx.io.Buffer) = (r12v6 kotlinx.io.Buffer), (r12v8 kotlinx.io.Buffer) binds: [B:18:0x0058, B:23:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r13v9 int) = (r13v8 int), (r13v10 int) binds: [B:18:0x0058, B:23:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0058 -> B:24:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006b -> B:23:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object readPacket(io.ktor.utils.io.ByteReadChannel r11, int r12, kotlin.coroutines.Continuation<? super kotlinx.io.Source> r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readPacket(io.ktor.utils.io.ByteReadChannel, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object discardExact(ByteReadChannel byteReadChannel, long j, Continuation<? super Unit> continuation) throws Throwable {
        C01481 c01481;
        if (continuation instanceof C01481) {
            c01481 = (C01481) continuation;
            if ((c01481.label & Integer.MIN_VALUE) != 0) {
                c01481.label -= Integer.MIN_VALUE;
            } else {
                c01481 = new C01481(continuation);
            }
        } else {
            c01481 = new C01481(continuation);
        }
        Object objDiscard = c01481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01481.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objDiscard);
            c01481.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
            c01481.J$0 = j;
            c01481.label = 1;
            objDiscard = discard(byteReadChannel, j, c01481);
            if (objDiscard == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c01481.J$0;
            ResultKt.throwOnFailure(objDiscard);
        }
        if (((Number) objDiscard).longValue() < j) {
            throw new EOFException("Unable to discard " + j + " bytes");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004e -> B:26:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0061 -> B:25:0x0064). Please report as a decompilation issue!!! */
    public static final Object discard(ByteReadChannel byteReadChannel, long j, Continuation<? super Long> continuation) throws Throwable {
        C01471 c01471;
        long j2;
        ByteReadChannel byteReadChannel2;
        long j3;
        if (continuation instanceof C01471) {
            c01471 = (C01471) continuation;
            if ((c01471.label & Integer.MIN_VALUE) != 0) {
                c01471.label -= Integer.MIN_VALUE;
            } else {
                c01471 = new C01471(continuation);
            }
        } else {
            c01471 = new C01471(continuation);
        }
        Object obj = c01471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01471.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            j2 = j;
            if (j <= 0 && !byteReadChannel.isClosedForRead()) {
                if (getAvailableForRead(byteReadChannel) == 0) {
                    c01471.L$0 = byteReadChannel;
                    c01471.J$0 = j2;
                    c01471.J$1 = j;
                    c01471.label = 1;
                    if (ByteReadChannel.awaitContent$default(byteReadChannel, 0, c01471, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteReadChannel2 = byteReadChannel;
                    j3 = j;
                }
                long jMin = Math.min(j, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
                ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), jMin);
                j -= jMin;
                if (j <= 0) {
                }
                return Boxing.boxLong(j2 - j);
            }
            return Boxing.boxLong(j2 - j);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j3 = c01471.J$1;
        j2 = c01471.J$0;
        byteReadChannel2 = (ByteReadChannel) c01471.L$0;
        ResultKt.throwOnFailure(obj);
        long j4 = j3;
        byteReadChannel = byteReadChannel2;
        j = j4;
        long jMin2 = Math.min(j, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
        ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), jMin2);
        j -= jMin2;
        if (j <= 0) {
        }
        return Boxing.boxLong(j2 - j);
    }

    public static /* synthetic */ Object discard$default(ByteReadChannel byteReadChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return discard(byteReadChannel, j, continuation);
    }

    public static /* synthetic */ Object readUTF8LineTo$default(ByteReadChannel byteReadChannel, Appendable appendable, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readUTF8LineTo(byteReadChannel, appendable, i, continuation);
    }

    public static final Object readUTF8LineTo(ByteReadChannel byteReadChannel, Appendable appendable, int i, Continuation<? super Boolean> continuation) {
        return m423readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i, LineEndingMode.INSTANCE.m436getAnyf0jXZW8(), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00dc A[Catch: all -> 0x0077, LOOP:0: B:38:0x00dc->B:62:0x0182, LOOP_START, TryCatch #1 {all -> 0x0077, blocks: (B:14:0x0048, B:36:0x00d6, B:38:0x00dc, B:40:0x00e6, B:42:0x00f2, B:44:0x00fc, B:49:0x0120, B:51:0x0132, B:53:0x0152, B:52:0x0149, B:58:0x0167, B:62:0x0182, B:63:0x0187, B:65:0x0192, B:69:0x01ae, B:70:0x01cc, B:71:0x01cd, B:74:0x01d8, B:76:0x01e2, B:19:0x0072, B:35:0x00cc), top: B:85:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6 A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:14:0x0048, B:36:0x00d6, B:38:0x00dc, B:40:0x00e6, B:42:0x00f2, B:44:0x00fc, B:49:0x0120, B:51:0x0132, B:53:0x0152, B:52:0x0149, B:58:0x0167, B:62:0x0182, B:63:0x0187, B:65:0x0192, B:69:0x01ae, B:70:0x01cc, B:71:0x01cd, B:74:0x01d8, B:76:0x01e2, B:19:0x0072, B:35:0x00cc), top: B:85:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:14:0x0048, B:36:0x00d6, B:38:0x00dc, B:40:0x00e6, B:42:0x00f2, B:44:0x00fc, B:49:0x0120, B:51:0x0132, B:53:0x0152, B:52:0x0149, B:58:0x0167, B:62:0x0182, B:63:0x0187, B:65:0x0192, B:69:0x01ae, B:70:0x01cc, B:71:0x01cd, B:74:0x01d8, B:76:0x01e2, B:19:0x0072, B:35:0x00cc), top: B:85:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:47:0x0116  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132 A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:14:0x0048, B:36:0x00d6, B:38:0x00dc, B:40:0x00e6, B:42:0x00f2, B:44:0x00fc, B:49:0x0120, B:51:0x0132, B:53:0x0152, B:52:0x0149, B:58:0x0167, B:62:0x0182, B:63:0x0187, B:65:0x0192, B:69:0x01ae, B:70:0x01cc, B:71:0x01cd, B:74:0x01d8, B:76:0x01e2, B:19:0x0072, B:35:0x00cc), top: B:85:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0149 A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:14:0x0048, B:36:0x00d6, B:38:0x00dc, B:40:0x00e6, B:42:0x00f2, B:44:0x00fc, B:49:0x0120, B:51:0x0132, B:53:0x0152, B:52:0x0149, B:58:0x0167, B:62:0x0182, B:63:0x0187, B:65:0x0192, B:69:0x01ae, B:70:0x01cc, B:71:0x01cd, B:74:0x01d8, B:76:0x01e2, B:19:0x0072, B:35:0x00cc), top: B:85:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0163  */
    /* JADX WARN: Code duplicated, block: B:61:0x0181  */
    /* JADX WARN: Code duplicated, block: B:65:0x0192 A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:14:0x0048, B:36:0x00d6, B:38:0x00dc, B:40:0x00e6, B:42:0x00f2, B:44:0x00fc, B:49:0x0120, B:51:0x0132, B:53:0x0152, B:52:0x0149, B:58:0x0167, B:62:0x0182, B:63:0x0187, B:65:0x0192, B:69:0x01ae, B:70:0x01cc, B:71:0x01cd, B:74:0x01d8, B:76:0x01e2, B:19:0x0072, B:35:0x00cc), top: B:85:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:14:0x0048, B:36:0x00d6, B:38:0x00dc, B:40:0x00e6, B:42:0x00f2, B:44:0x00fc, B:49:0x0120, B:51:0x0132, B:53:0x0152, B:52:0x0149, B:58:0x0167, B:62:0x0182, B:63:0x0187, B:65:0x0192, B:69:0x01ae, B:70:0x01cc, B:71:0x01cd, B:74:0x01d8, B:76:0x01e2, B:19:0x0072, B:35:0x00cc), top: B:85:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01cd A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:14:0x0048, B:36:0x00d6, B:38:0x00dc, B:40:0x00e6, B:42:0x00f2, B:44:0x00fc, B:49:0x0120, B:51:0x0132, B:53:0x0152, B:52:0x0149, B:58:0x0167, B:62:0x0182, B:63:0x0187, B:65:0x0192, B:69:0x01ae, B:70:0x01cc, B:71:0x01cd, B:74:0x01d8, B:76:0x01e2, B:19:0x0072, B:35:0x00cc), top: B:85:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e2 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #1 {all -> 0x0077, blocks: (B:14:0x0048, B:36:0x00d6, B:38:0x00dc, B:40:0x00e6, B:42:0x00f2, B:44:0x00fc, B:49:0x0120, B:51:0x0132, B:53:0x0152, B:52:0x0149, B:58:0x0167, B:62:0x0182, B:63:0x0187, B:65:0x0192, B:69:0x01ae, B:70:0x01cc, B:71:0x01cd, B:74:0x01d8, B:76:0x01e2, B:19:0x0072, B:35:0x00cc), top: B:85:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code duplicated, block: B:86:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.awaitContent$default(r0, 0, r2, 1, null) == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a8, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.awaitContent$default(r5, 0, r2, 1, null) == r3) goto L67;
     */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x01f1: INVOKE (r15 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: kotlin.jdk7.AutoCloseableKt.closeFinally(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void throws java.lang.Exception (m)], block:B:81:0x01f1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01a8 -> B:68:0x01ab). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: readUTF8LineTo-RRvyBJ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m423readUTF8LineToRRvyBJ8(io.ktor.utils.io.ByteReadChannel r20, java.lang.Appendable r21, int r22, int r23, kotlin.coroutines.Continuation<? super java.lang.Boolean> r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.m423readUTF8LineToRRvyBJ8(io.ktor.utils.io.ByteReadChannel, java.lang.Appendable, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: readUTF8LineTo-RRvyBJ8$default, reason: not valid java name */
    public static /* synthetic */ Object m424readUTF8LineToRRvyBJ8$default(ByteReadChannel byteReadChannel, Appendable appendable, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 4) != 0) {
            i2 = LineEndingMode.INSTANCE.m436getAnyf0jXZW8();
        }
        return m423readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i, i2, continuation);
    }

    private static final void readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(int i, int i2) throws IOException {
        if (!LineEndingMode.m429containslTjpP64(i, i2)) {
            throw new IOException("Unexpected line ending " + ((Object) LineEndingMode.m434toStringimpl(i2)) + ", while expected " + ((Object) LineEndingMode.m434toStringimpl(i)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0123  */
    /* JADX WARN: Code duplicated, block: B:42:0x0129  */
    /* JADX WARN: Code duplicated, block: B:43:0x012e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0136  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.awaitContent$default(r0, 0, r2, 1, null) == r3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object read(io.ktor.utils.io.ByteReadChannel r16, kotlin.jvm.functions.Function4<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super java.lang.Integer>, ? extends java.lang.Object> r17, kotlin.coroutines.Continuation<? super java.lang.Integer> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.read(io.ktor.utils.io.ByteReadChannel, kotlin.jvm.functions.Function4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final Object read$$forInline(ByteReadChannel byteReadChannel, Function4<? super byte[], ? super Integer, ? super Integer, ? super Continuation<? super Integer>, ? extends Object> function4, Continuation<? super Integer> continuation) throws EOFException {
        if (byteReadChannel.isClosedForRead()) {
            return -1;
        }
        if (byteReadChannel.getReadBuffer().exhausted()) {
            ByteReadChannel.awaitContent$default(byteReadChannel, 0, continuation, 1, null);
        }
        if (byteReadChannel.isClosedForRead()) {
            return -1;
        }
        Ref.IntRef intRef = new Ref.IntRef();
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        Buffer bufferField = byteReadChannel.getReadBuffer().getBufferField();
        if (bufferField.exhausted()) {
            throw new IllegalArgumentException("Buffer is empty".toString());
        }
        Segment head = bufferField.getHead();
        Intrinsics.checkNotNull(head);
        intRef.element = ((Number) function4.invoke(head.dataAsByteArray(true), Integer.valueOf(Integer.valueOf(head.getPos()).intValue()), Integer.valueOf(Integer.valueOf(head.getLimit()).intValue()), null)).intValue();
        int iIntValue = Integer.valueOf(intRef.element).intValue();
        if (iIntValue != 0) {
            if (iIntValue < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (iIntValue > head.getSize()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            bufferField.skip(iIntValue);
        }
        return Integer.valueOf(intRef.element);
    }

    public static final int getAvailableForRead(ByteReadChannel byteReadChannel) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        return (int) byteReadChannel.getReadBuffer().getBufferField().getSizeMut();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0060 -> B:30:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0077 -> B:29:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object readFully(io.ktor.utils.io.ByteReadChannel r7, byte[] r8, int r9, int r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C01581
            if (r0 == 0) goto L14
            r0 = r11
            io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C01581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "Channel is already closed"
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            int r7 = r0.I$2
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$1
            byte[] r10 = (byte[]) r10
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L7c
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.ResultKt.throwOnFailure(r11)
            if (r10 <= r9) goto L54
            boolean r11 = r7.isClosedForRead()
            if (r11 != 0) goto L4e
            goto L54
        L4e:
            java.io.EOFException r7 = new java.io.EOFException
            r7.<init>(r3)
            throw r7
        L54:
            r11 = r10
            r10 = r9
        L56:
            if (r9 >= r11) goto La6
            kotlinx.io.Source r2 = r7.getReadBuffer()
            boolean r2 = r2.exhausted()
            if (r2 == 0) goto L81
            r0.L$0 = r7
            r0.L$1 = r8
            r0.I$0 = r10
            r0.I$1 = r11
            r0.I$2 = r9
            r0.label = r4
            r2 = 0
            r5 = 0
            java.lang.Object r2 = io.ktor.utils.io.ByteReadChannel.awaitContent$default(r7, r2, r0, r4, r5)
            if (r2 != r1) goto L77
            return r1
        L77:
            r2 = r7
            r7 = r9
            r9 = r10
            r10 = r8
            r8 = r11
        L7c:
            r11 = r8
            r8 = r10
            r10 = r9
            r9 = r7
            r7 = r2
        L81:
            boolean r2 = r7.isClosedForRead()
            if (r2 != 0) goto La0
            int r2 = r11 - r9
            kotlinx.io.Source r5 = r7.getReadBuffer()
            long r5 = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(r5)
            int r5 = (int) r5
            int r2 = java.lang.Math.min(r2, r5)
            kotlinx.io.Source r5 = r7.getReadBuffer()
            int r2 = r2 + r9
            kotlinx.io.SourcesKt.readTo(r5, r8, r9, r2)
            r9 = r2
            goto L56
        La0:
            java.io.EOFException r7 = new java.io.EOFException
            r7.<init>(r3)
            throw r7
        La6:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readFully(io.ktor.utils.io.ByteReadChannel, byte[], int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object readFully$default(ByteReadChannel byteReadChannel, byte[] bArr, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return readFully(byteReadChannel, bArr, i, i2, continuation);
    }

    public static final void rethrowCloseCauseIfNeeded(ByteReadChannel byteReadChannel) throws Throwable {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static final void rethrowCloseCauseIfNeeded(ByteWriteChannel byteWriteChannel) throws Throwable {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Throwable closedCause = byteWriteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static final void rethrowCloseCauseIfNeeded(ByteChannel byteChannel) {
        Intrinsics.checkNotNullParameter(byteChannel, "<this>");
        Throwable closedCause = byteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static /* synthetic */ Object readUntil$default(ByteReadChannel byteReadChannel, ByteString byteString, ByteWriteChannel byteWriteChannel, long j, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            j = Long.MAX_VALUE;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = false;
        }
        return readUntil(byteReadChannel, byteString, byteWriteChannel, j2, z, continuation);
    }

    public static final Object readUntil(ByteReadChannel byteReadChannel, ByteString byteString, ByteWriteChannel byteWriteChannel, long j, boolean z, Continuation<? super Long> continuation) {
        return new ByteChannelScanner(byteReadChannel, byteString, byteWriteChannel, j).findNext$ktor_io(z, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (discard(r7, r5, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object skipIfFound(io.ktor.utils.io.ByteReadChannel r7, kotlinx.io.bytestring.ByteString r8, kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C01681
            if (r0 == 0) goto L14
            r0 = r9
            io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C01681) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$1
            kotlinx.io.bytestring.ByteString r7 = (kotlinx.io.bytestring.ByteString) r7
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r7 = (io.ktor.utils.io.ByteReadChannel) r7
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7e
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            kotlinx.io.bytestring.ByteString r8 = (kotlinx.io.bytestring.ByteString) r8
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r7 = (io.ktor.utils.io.ByteReadChannel) r7
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5e
        L4a:
            kotlin.ResultKt.throwOnFailure(r9)
            int r9 = r8.getSize()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = peek(r7, r9, r0)
            if (r9 != r1) goto L5e
            goto L7d
        L5e:
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r8)
            if (r9 == 0) goto L83
            int r9 = r8.getSize()
            long r5 = (long) r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r9
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r7 = discard(r7, r5, r0)
            if (r7 != r1) goto L7e
        L7d:
            return r1
        L7e:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r7
        L83:
            r7 = 0
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(io.ktor.utils.io.ByteReadChannel, kotlinx.io.bytestring.ByteString, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object peek(ByteReadChannel byteReadChannel, int i, Continuation<? super ByteString> continuation) throws Throwable {
        C01501 c01501;
        if (continuation instanceof C01501) {
            c01501 = (C01501) continuation;
            if ((c01501.label & Integer.MIN_VALUE) != 0) {
                c01501.label -= Integer.MIN_VALUE;
            } else {
                c01501 = new C01501(continuation);
            }
        } else {
            c01501 = new C01501(continuation);
        }
        Object objAwaitContent = c01501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c01501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitContent);
            if (byteReadChannel.isClosedForRead()) {
                return null;
            }
            c01501.L$0 = byteReadChannel;
            c01501.I$0 = i;
            c01501.label = 1;
            objAwaitContent = byteReadChannel.awaitContent(i, c01501);
            if (objAwaitContent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c01501.I$0;
            byteReadChannel = (ByteReadChannel) c01501.L$0;
            ResultKt.throwOnFailure(objAwaitContent);
        }
        if (((Boolean) objAwaitContent).booleanValue()) {
            return ByteStringsKt.readByteString(byteReadChannel.getReadBuffer().peek(), i);
        }
        return null;
    }
}
