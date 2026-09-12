package com.discord.misc.utilities.collections;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.ViewProps;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 +2\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0003H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0007H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0012H\u0002J\u0018\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0002J\u0006\u0010)\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/discord/misc/utilities/collections/CircularByteBuffer;", "", "maxByteCount", "", "<init>", "(I)V", "buffer", "", "head", "tail", "size", "isEmpty", "", "lines", "Lkotlin/collections/ArrayDeque;", "Lkotlin/Pair;", BaseJavaModule.METHOD_TYPE_SYNC, "newlineByte", "", "appendString", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "addLine", "line", "", "getStats", "Lcom/discord/misc/utilities/collections/CircularByteBuffer$BufferStats;", "addLineBytes", "lineBytes", "makeSpace", "needed", "removeFrontLine", "writeBytes", "bytes", "writeByte", "byte", "readLine", ViewProps.START, "length", "clear", "BufferStats", "Companion", "misc_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CircularByteBuffer {

    @NotNull
    private final byte[] buffer;
    private int head;
    private final int maxByteCount;
    private int size;
    private int tail;

    @NotNull
    private static final Charset CHARSET = Charsets.UTF_8;
    private boolean isEmpty = true;

    @NotNull
    private final ArrayDeque lines = new ArrayDeque();

    @NotNull
    private final Object sync = new Object();
    private final byte newlineByte = 10;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/discord/misc/utilities/collections/CircularByteBuffer$BufferStats;", "", "linesCount", "", "bytesUsed", "bytesCapacity", "memoryEfficiency", "", "headPosition", "tailPosition", "<init>", "(IIIFII)V", "getLinesCount", "()I", "getBytesUsed", "getBytesCapacity", "getMemoryEfficiency", "()F", "getHeadPosition", "getTailPosition", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "misc_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BufferStats {
        private final int bytesCapacity;
        private final int bytesUsed;
        private final int headPosition;
        private final int linesCount;
        private final float memoryEfficiency;
        private final int tailPosition;

        public BufferStats(int i7, int i10, int i11, float f2, int i12, int i13) {
            this.linesCount = i7;
            this.bytesUsed = i10;
            this.bytesCapacity = i11;
            this.memoryEfficiency = f2;
            this.headPosition = i12;
            this.tailPosition = i13;
        }

        public static /* synthetic */ BufferStats copy$default(BufferStats bufferStats, int i7, int i10, int i11, float f2, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i7 = bufferStats.linesCount;
            }
            if ((i14 & 2) != 0) {
                i10 = bufferStats.bytesUsed;
            }
            if ((i14 & 4) != 0) {
                i11 = bufferStats.bytesCapacity;
            }
            if ((i14 & 8) != 0) {
                f2 = bufferStats.memoryEfficiency;
            }
            if ((i14 & 16) != 0) {
                i12 = bufferStats.headPosition;
            }
            if ((i14 & 32) != 0) {
                i13 = bufferStats.tailPosition;
            }
            int i15 = i12;
            int i16 = i13;
            return bufferStats.copy(i7, i10, i11, f2, i15, i16);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getLinesCount() {
            return this.linesCount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getBytesUsed() {
            return this.bytesUsed;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBytesCapacity() {
            return this.bytesCapacity;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getMemoryEfficiency() {
            return this.memoryEfficiency;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getHeadPosition() {
            return this.headPosition;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getTailPosition() {
            return this.tailPosition;
        }

        @NotNull
        public final BufferStats copy(int linesCount, int bytesUsed, int bytesCapacity, float memoryEfficiency, int headPosition, int tailPosition) {
            return new BufferStats(linesCount, bytesUsed, bytesCapacity, memoryEfficiency, headPosition, tailPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BufferStats)) {
                return false;
            }
            BufferStats bufferStats = (BufferStats) other;
            return this.linesCount == bufferStats.linesCount && this.bytesUsed == bufferStats.bytesUsed && this.bytesCapacity == bufferStats.bytesCapacity && Float.compare(this.memoryEfficiency, bufferStats.memoryEfficiency) == 0 && this.headPosition == bufferStats.headPosition && this.tailPosition == bufferStats.tailPosition;
        }

        public final int getBytesCapacity() {
            return this.bytesCapacity;
        }

        public final int getBytesUsed() {
            return this.bytesUsed;
        }

        public final int getHeadPosition() {
            return this.headPosition;
        }

        public final int getLinesCount() {
            return this.linesCount;
        }

        public final float getMemoryEfficiency() {
            return this.memoryEfficiency;
        }

        public final int getTailPosition() {
            return this.tailPosition;
        }

        public int hashCode() {
            return Integer.hashCode(this.tailPosition) + a.u(this.headPosition, e.a(a.u(this.bytesCapacity, a.u(this.bytesUsed, Integer.hashCode(this.linesCount) * 31, 31), 31), 31, this.memoryEfficiency), 31);
        }

        @NotNull
        public String toString() {
            int i7 = this.linesCount;
            int i10 = this.bytesUsed;
            int i11 = this.bytesCapacity;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strQ = e.q(new Object[]{Float.valueOf(this.memoryEfficiency * 100)}, 1, Locale.US, "%.1f", "format(...)");
            int i12 = this.headPosition;
            int i13 = this.tailPosition;
            StringBuilder sbR = e.r(i7, "BufferStats(lines=", i10, ", used=", "B/");
            sbR.append(i11);
            sbR.append("B (");
            sbR.append(strQ);
            sbR.append("%), head=");
            sbR.append(i12);
            sbR.append(", tail=");
            sbR.append(i13);
            sbR.append(")");
            return sbR.toString();
        }
    }

    public CircularByteBuffer(int i7) {
        this.maxByteCount = i7;
        this.buffer = new byte[i7];
    }

    private final void addLineBytes(byte[] lineBytes) {
        int length = lineBytes.length + 1;
        makeSpace(length);
        int i7 = this.tail;
        writeBytes(lineBytes);
        writeByte(this.newlineByte);
        this.lines.addLast(new Pair(Integer.valueOf(i7), Integer.valueOf(lineBytes.length)));
        this.size += length;
        this.isEmpty = false;
    }

    private final void makeSpace(int needed) {
        while (this.size + needed > this.maxByteCount && !this.lines.isEmpty()) {
            removeFrontLine();
        }
    }

    private final String readLine(int start, int length) {
        int i7 = start + length;
        byte[] bArr = this.buffer;
        if (i7 <= bArr.length) {
            return new String(bArr, start, length, CHARSET);
        }
        int length2 = bArr.length - start;
        int i10 = length - length2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, start, bArr2, 0, length2);
        System.arraycopy(this.buffer, 0, bArr2, length2, i10);
        return new String(bArr2, CHARSET);
    }

    private final void removeFrontLine() {
        if (this.lines.isEmpty()) {
            return;
        }
        int iIntValue = ((Number) ((Pair) this.lines.removeFirst()).f14613e).intValue() + 1;
        this.head = (this.head + iIntValue) % this.buffer.length;
        int i7 = this.size - iIntValue;
        this.size = i7;
        if (i7 == 0) {
            this.isEmpty = true;
            this.head = 0;
            this.tail = 0;
        }
    }

    private final void writeByte(byte b10) {
        byte[] bArr = this.buffer;
        int i7 = this.tail;
        bArr[i7] = b10;
        this.tail = (i7 + 1) % bArr.length;
    }

    private final void writeBytes(byte[] bytes) {
        for (byte b10 : bytes) {
            writeByte(b10);
        }
    }

    public final void addLine(@NotNull String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        synchronized (this.sync) {
            byte[] bytes = line.getBytes(CHARSET);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            addLineBytes(bytes);
            Unit unit = Unit.f14616a;
        }
    }

    public final void appendString(@NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        synchronized (this.sync) {
            try {
                for (Pair pair : this.lines) {
                    sb2.append(readLine(((Number) pair.f14612d).intValue(), ((Number) pair.f14613e).intValue()));
                    sb2.append('\n');
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.sync) {
            this.head = 0;
            this.tail = 0;
            this.size = 0;
            this.isEmpty = true;
            this.lines.clear();
            Unit unit = Unit.f14616a;
        }
    }

    @NotNull
    public final BufferStats getStats() {
        BufferStats bufferStats;
        synchronized (this.sync) {
            int iA = this.lines.a();
            int i7 = this.size;
            int i10 = this.maxByteCount;
            bufferStats = new BufferStats(iA, i7, i10, i10 > 0 ? i7 / i10 : 0.0f, this.head, this.tail);
        }
        return bufferStats;
    }
}
