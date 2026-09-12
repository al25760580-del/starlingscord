package com.facebook.react.devsupport.inspector;

import a3.e;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;", "", StackTraceHelper.ID_KEY, "", "threadId", "beginTimestamp", "", "endTimestamp", "screenshot", "", "<init>", "(IIJJ[B)V", "getId", "()I", "getThreadId", "getBeginTimestamp", "()J", "getEndTimestamp", "getScreenshot", "()[B", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FrameTimingSequence {
    private final long beginTimestamp;
    private final long endTimestamp;
    private final int id;
    private final byte[] screenshot;
    private final int threadId;

    public FrameTimingSequence(int i7, int i10, long j, long j5, byte[] bArr) {
        this.id = i7;
        this.threadId = i10;
        this.beginTimestamp = j;
        this.endTimestamp = j5;
        this.screenshot = bArr;
    }

    public static /* synthetic */ FrameTimingSequence copy$default(FrameTimingSequence frameTimingSequence, int i7, int i10, long j, long j5, byte[] bArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = frameTimingSequence.id;
        }
        if ((i11 & 2) != 0) {
            i10 = frameTimingSequence.threadId;
        }
        if ((i11 & 4) != 0) {
            j = frameTimingSequence.beginTimestamp;
        }
        if ((i11 & 8) != 0) {
            j5 = frameTimingSequence.endTimestamp;
        }
        if ((i11 & 16) != 0) {
            bArr = frameTimingSequence.screenshot;
        }
        byte[] bArr2 = bArr;
        long j7 = j5;
        return frameTimingSequence.copy(i7, i10, j, j7, bArr2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getThreadId() {
        return this.threadId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getBeginTimestamp() {
        return this.beginTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final byte[] getScreenshot() {
        return this.screenshot;
    }

    @NotNull
    public final FrameTimingSequence copy(int id2, int threadId, long beginTimestamp, long endTimestamp, byte[] screenshot) {
        return new FrameTimingSequence(id2, threadId, beginTimestamp, endTimestamp, screenshot);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameTimingSequence)) {
            return false;
        }
        FrameTimingSequence frameTimingSequence = (FrameTimingSequence) other;
        return this.id == frameTimingSequence.id && this.threadId == frameTimingSequence.threadId && this.beginTimestamp == frameTimingSequence.beginTimestamp && this.endTimestamp == frameTimingSequence.endTimestamp && Intrinsics.areEqual(this.screenshot, frameTimingSequence.screenshot);
    }

    public final long getBeginTimestamp() {
        return this.beginTimestamp;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getId() {
        return this.id;
    }

    public final byte[] getScreenshot() {
        return this.screenshot;
    }

    public final int getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        int iH = com.discord.chat.presentation.list.a.h(this.endTimestamp, com.discord.chat.presentation.list.a.h(this.beginTimestamp, com.discord.chat.presentation.list.a.u(this.threadId, Integer.hashCode(this.id) * 31, 31), 31), 31);
        byte[] bArr = this.screenshot;
        return iH + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @NotNull
    public String toString() {
        int i7 = this.id;
        int i10 = this.threadId;
        long j = this.beginTimestamp;
        long j5 = this.endTimestamp;
        String string = Arrays.toString(this.screenshot);
        StringBuilder sbR = e.r(i7, "FrameTimingSequence(id=", i10, ", threadId=", ", beginTimestamp=");
        sbR.append(j);
        sbR.append(", endTimestamp=");
        sbR.append(j5);
        sbR.append(", screenshot=");
        return com.discord.chat.presentation.list.a.k(sbR, string, ")");
    }

    public /* synthetic */ FrameTimingSequence(int i7, int i10, long j, long j5, byte[] bArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i10, j, j5, (i11 & 16) != 0 ? null : bArr);
    }
}
