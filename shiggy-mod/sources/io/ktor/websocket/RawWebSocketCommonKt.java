package io.ktor.websocket;

import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.MemoryKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Source;

/* JADX INFO: compiled from: RawWebSocketCommon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a$\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0087@¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u0011\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0087@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/io/Source;", "", "maskKey", "mask", "(Lkotlinx/io/Source;I)Lkotlinx/io/Source;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lio/ktor/websocket/Frame;", "frame", "", "masking", "", "writeFrame", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/websocket/Frame;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "", "maxFrameSize", "lastOpcode", "readFrame", "(Lio/ktor/utils/io/ByteReadChannel;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-websockets"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RawWebSocketCommonKt {

    /* JADX INFO: renamed from: io.ktor.websocket.RawWebSocketCommonKt$readFrame$1, reason: invalid class name */
    /* JADX INFO: compiled from: RawWebSocketCommon.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, l = {226, 227, 246, 247, 255, Optimizer.OPTIMIZATION_STANDARD}, m = "readFrame", n = {"$this$readFrame", "maxFrameSize", "lastOpcode", "$this$readFrame", "maxFrameSize", "lastOpcode", "flagsAndOpcode", "$this$readFrame", "frameType", "maxFrameSize", "lastOpcode", "flagsAndOpcode", "maskAndLength", "rawOpcode", "opcode", "fin", "length", "$this$readFrame", "frameType", "maxFrameSize", "lastOpcode", "flagsAndOpcode", "maskAndLength", "rawOpcode", "opcode", "fin", "length", "$this$readFrame", "frameType", "maxFrameSize", "lastOpcode", "flagsAndOpcode", "maskAndLength", "rawOpcode", "opcode", "fin", "length", "$this$readFrame", "frameType", "maxFrameSize", "lastOpcode", "flagsAndOpcode", "maskAndLength", "rawOpcode", "opcode", "fin", "length", "maskKey"}, s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "B$0", "L$0", "L$1", "J$0", "I$0", "B$0", "B$1", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "J$0", "I$0", "B$0", "B$1", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "J$0", "I$0", "B$0", "B$1", "I$1", "I$2", "I$3", "J$1", "L$0", "L$1", "J$0", "I$0", "B$0", "B$1", "I$1", "I$2", "I$3", "J$1", "I$4"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        byte B$0;
        byte B$1;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawWebSocketCommonKt.readFrame(null, 0L, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: RawWebSocketCommon.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5}, l = {183, 193, 196, 197, 205, 211}, m = "writeFrame", n = {"$this$writeFrame", "frame", "masking", "length", "flagsAndOpcode", "$this$writeFrame", "frame", "masking", "length", "flagsAndOpcode", "formattedLength", "maskAndLength", "$this$writeFrame", "frame", "masking", "length", "flagsAndOpcode", "formattedLength", "maskAndLength", "$this$writeFrame", "frame", "masking", "length", "flagsAndOpcode", "formattedLength", "maskAndLength", "$this$writeFrame", "frame", "data", "masking", "length", "flagsAndOpcode", "formattedLength", "maskAndLength", "maskKey", "$this$writeFrame", "frame", "data", "maskedData", "masking", "length", "flagsAndOpcode", "formattedLength", "maskAndLength"}, s = {"L$0", "L$1", "Z$0", "I$0", "I$1", "L$0", "L$1", "Z$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "Z$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "Z$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "Z$0", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "Z$0", "I$0", "I$1", "I$2", "I$3"}, v = 1)
    static final class C01831 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C01831(Continuation<? super C01831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawWebSocketCommonKt.writeFrame(null, null, false, this);
        }
    }

    private static final Source mask(final Source source, final int i) {
        return (Source) MemoryKt.withMemory(4, new Function1() { // from class: io.ktor.websocket.RawWebSocketCommonKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RawWebSocketCommonKt.mask$lambda$0(i, source, (byte[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Source mask$lambda$0(int i, Source source, byte[] maskMemory) {
        Intrinsics.checkNotNullParameter(maskMemory, "maskMemory");
        MemoryKt.storeIntAt(maskMemory, 0, i);
        Buffer buffer = new Buffer();
        Buffer buffer2 = buffer;
        int remaining = (int) ByteReadPacketKt.getRemaining(source);
        for (int i2 = 0; i2 < remaining; i2++) {
            buffer2.writeByte((byte) (source.readByte() ^ maskMemory[i2 % 4]));
        }
        return buffer;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    /* JADX WARN: Code duplicated, block: B:42:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x011a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0136  */
    /* JADX WARN: Code duplicated, block: B:51:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0142  */
    /* JADX WARN: Code duplicated, block: B:54:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:64:0x0192  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0160, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeLong(r14, r11, r2) == r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017a, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeShort(r14, (short) r11, r2) == r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017e, code lost:
    
        r7 = r8;
        r8 = r11;
        r9 = r12;
        r11 = r13;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b5, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r12, r0, r2) == r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ee, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writePacket(r12, r10, r2) == r3) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writeFrame(io.ktor.utils.io.ByteWriteChannel r17, io.ktor.websocket.Frame r18, boolean r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommonKt.writeFrame(io.ktor.utils.io.ByteWriteChannel, io.ktor.websocket.Frame, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0262  */
    /* JADX WARN: Code duplicated, block: B:103:0x0264  */
    /* JADX WARN: Code duplicated, block: B:106:0x0269  */
    /* JADX WARN: Code duplicated, block: B:107:0x026b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0270  */
    /* JADX WARN: Code duplicated, block: B:111:0x0272  */
    /* JADX WARN: Code duplicated, block: B:116:0x027e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0284  */
    /* JADX WARN: Code duplicated, block: B:24:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:27:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0118  */
    /* JADX WARN: Code duplicated, block: B:33:0x011a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0123  */
    /* JADX WARN: Code duplicated, block: B:37:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code duplicated, block: B:46:0x013c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x0154  */
    /* JADX WARN: Code duplicated, block: B:57:0x0158  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code duplicated, block: B:82:0x0207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0209  */
    /* JADX WARN: Code duplicated, block: B:86:0x0219  */
    /* JADX WARN: Code duplicated, block: B:95:0x024f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0257  */
    /* JADX WARN: Code duplicated, block: B:99:0x0259  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0175, code lost:
    
        if (r1 == r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019b, code lost:
    
        if (r1 == r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ef, code lost:
    
        if (r1 == r3) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readFrame(io.ktor.utils.io.ByteReadChannel r20, long r21, int r23, kotlin.coroutines.Continuation<? super io.ktor.websocket.Frame> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommonKt.readFrame(io.ktor.utils.io.ByteReadChannel, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
