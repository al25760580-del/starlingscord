package com.facebook.react.fabric;

import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/fabric/LongStreamingStats;", "", "<init>", "()V", "minHeap", "Ljava/util/Queue;", "", "maxHeap", "value", "", "average", "getAverage", "()D", "len", "", "max", "getMax", "()J", "add", "", "n", "median", "getMedian", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LongStreamingStats {
    private double average;
    private int len;
    private long max;

    @NotNull
    private final Queue<Long> maxHeap;

    @NotNull
    private final Queue<Long> minHeap = new PriorityQueue(11);

    public LongStreamingStats() {
        tn.c cVar = tn.c.f20851d;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        this.maxHeap = new PriorityQueue(11, cVar);
    }

    public final void add(long n10) {
        double d6;
        if (n10 != 0) {
            if (this.minHeap.size() == this.maxHeap.size()) {
                this.maxHeap.offer(Long.valueOf(n10));
                this.minHeap.offer(this.maxHeap.poll());
            } else {
                this.minHeap.offer(Long.valueOf(n10));
                this.maxHeap.offer(this.minHeap.poll());
            }
        }
        int i7 = this.len;
        int i10 = i7 + 1;
        this.len = i10;
        if (i10 == 1) {
            d6 = n10;
        } else {
            d6 = (n10 / ((long) i10)) + (this.average / ((double) (i10 / i7)));
        }
        this.average = d6;
        long j = this.max;
        if (n10 <= j) {
            n10 = j;
        }
        this.max = n10;
    }

    public final double getAverage() {
        return this.average;
    }

    public final long getMax() {
        return this.max;
    }

    public final double getMedian() {
        Long lValueOf;
        if (this.minHeap.isEmpty() && this.maxHeap.isEmpty()) {
            return 0.0d;
        }
        if (this.minHeap.size() > this.maxHeap.size()) {
            lValueOf = this.minHeap.peek();
        } else {
            Long lPeek = this.minHeap.peek();
            long jLongValue = lPeek != null ? lPeek.longValue() : 0L;
            Long lPeek2 = this.maxHeap.peek();
            lValueOf = Long.valueOf((jLongValue + (lPeek2 != null ? lPeek2.longValue() : 0L)) / ((long) 2));
        }
        return lValueOf.longValue();
    }
}
