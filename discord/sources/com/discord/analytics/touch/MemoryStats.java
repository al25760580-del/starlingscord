package com.discord.analytics.touch;

import a3.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jm\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006,"}, d2 = {"Lcom/discord/analytics/touch/MemoryStats;", "", "javaPss", "", "nativePss", "graphicsPss", "totalPss", "privateClean", "privateDirty", "swapPss", "nativeHeap", "nativeHeapFree", "dalvikPss", "<init>", "(JJJJJJJJJJ)V", "getJavaPss", "()J", "getNativePss", "getGraphicsPss", "getTotalPss", "getPrivateClean", "getPrivateDirty", "getSwapPss", "getNativeHeap", "getNativeHeapFree", "getDalvikPss", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MemoryStats {
    private final long dalvikPss;
    private final long graphicsPss;
    private final long javaPss;
    private final long nativeHeap;
    private final long nativeHeapFree;
    private final long nativePss;
    private final long privateClean;
    private final long privateDirty;
    private final long swapPss;
    private final long totalPss;

    public MemoryStats(long j, long j5, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.javaPss = j;
        this.nativePss = j5;
        this.graphicsPss = j7;
        this.totalPss = j10;
        this.privateClean = j11;
        this.privateDirty = j12;
        this.swapPss = j13;
        this.nativeHeap = j14;
        this.nativeHeapFree = j15;
        this.dalvikPss = j16;
    }

    public static /* synthetic */ MemoryStats copy$default(MemoryStats memoryStats, long j, long j5, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i7, Object obj) {
        long j17;
        long j18;
        long j19 = (i7 & 1) != 0 ? memoryStats.javaPss : j;
        long j20 = (i7 & 2) != 0 ? memoryStats.nativePss : j5;
        long j21 = (i7 & 4) != 0 ? memoryStats.graphicsPss : j7;
        long j22 = (i7 & 8) != 0 ? memoryStats.totalPss : j10;
        long j23 = (i7 & 16) != 0 ? memoryStats.privateClean : j11;
        long j24 = (i7 & 32) != 0 ? memoryStats.privateDirty : j12;
        long j25 = (i7 & 64) != 0 ? memoryStats.swapPss : j13;
        long j26 = j19;
        long j27 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? memoryStats.nativeHeap : j14;
        long j28 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? memoryStats.nativeHeapFree : j15;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            j18 = j28;
            j17 = memoryStats.dalvikPss;
        } else {
            j17 = j16;
            j18 = j28;
        }
        return memoryStats.copy(j26, j20, j21, j22, j23, j24, j25, j27, j18, j17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getJavaPss() {
        return this.javaPss;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getDalvikPss() {
        return this.dalvikPss;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getNativePss() {
        return this.nativePss;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getGraphicsPss() {
        return this.graphicsPss;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalPss() {
        return this.totalPss;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPrivateClean() {
        return this.privateClean;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getPrivateDirty() {
        return this.privateDirty;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getSwapPss() {
        return this.swapPss;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getNativeHeap() {
        return this.nativeHeap;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getNativeHeapFree() {
        return this.nativeHeapFree;
    }

    @NotNull
    public final MemoryStats copy(long javaPss, long nativePss, long graphicsPss, long totalPss, long privateClean, long privateDirty, long swapPss, long nativeHeap, long nativeHeapFree, long dalvikPss) {
        return new MemoryStats(javaPss, nativePss, graphicsPss, totalPss, privateClean, privateDirty, swapPss, nativeHeap, nativeHeapFree, dalvikPss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemoryStats)) {
            return false;
        }
        MemoryStats memoryStats = (MemoryStats) other;
        return this.javaPss == memoryStats.javaPss && this.nativePss == memoryStats.nativePss && this.graphicsPss == memoryStats.graphicsPss && this.totalPss == memoryStats.totalPss && this.privateClean == memoryStats.privateClean && this.privateDirty == memoryStats.privateDirty && this.swapPss == memoryStats.swapPss && this.nativeHeap == memoryStats.nativeHeap && this.nativeHeapFree == memoryStats.nativeHeapFree && this.dalvikPss == memoryStats.dalvikPss;
    }

    public final long getDalvikPss() {
        return this.dalvikPss;
    }

    public final long getGraphicsPss() {
        return this.graphicsPss;
    }

    public final long getJavaPss() {
        return this.javaPss;
    }

    public final long getNativeHeap() {
        return this.nativeHeap;
    }

    public final long getNativeHeapFree() {
        return this.nativeHeapFree;
    }

    public final long getNativePss() {
        return this.nativePss;
    }

    public final long getPrivateClean() {
        return this.privateClean;
    }

    public final long getPrivateDirty() {
        return this.privateDirty;
    }

    public final long getSwapPss() {
        return this.swapPss;
    }

    public final long getTotalPss() {
        return this.totalPss;
    }

    public int hashCode() {
        return Long.hashCode(this.dalvikPss) + com.discord.chat.presentation.list.a.h(this.nativeHeapFree, com.discord.chat.presentation.list.a.h(this.nativeHeap, com.discord.chat.presentation.list.a.h(this.swapPss, com.discord.chat.presentation.list.a.h(this.privateDirty, com.discord.chat.presentation.list.a.h(this.privateClean, com.discord.chat.presentation.list.a.h(this.totalPss, com.discord.chat.presentation.list.a.h(this.graphicsPss, com.discord.chat.presentation.list.a.h(this.nativePss, Long.hashCode(this.javaPss) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j = this.javaPss;
        long j5 = this.nativePss;
        long j7 = this.graphicsPss;
        long j10 = this.totalPss;
        long j11 = this.privateClean;
        long j12 = this.privateDirty;
        long j13 = this.swapPss;
        long j14 = this.nativeHeap;
        long j15 = this.nativeHeapFree;
        long j16 = this.dalvikPss;
        StringBuilder sbM = kk.b.m(j, "MemoryStats(javaPss=", ", nativePss=");
        sbM.append(j5);
        sbM.append(", graphicsPss=");
        sbM.append(j7);
        sbM.append(", totalPss=");
        sbM.append(j10);
        sbM.append(", privateClean=");
        sbM.append(j11);
        sbM.append(", privateDirty=");
        sbM.append(j12);
        sbM.append(", swapPss=");
        sbM.append(j13);
        sbM.append(", nativeHeap=");
        sbM.append(j14);
        sbM.append(", nativeHeapFree=");
        sbM.append(j15);
        sbM.append(", dalvikPss=");
        return e.n(sbM, j16, ")");
    }
}
