package com.discord.media_player.reactevents;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.a;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002CDBk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013B\u007f\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0085\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0006HÖ\u0001J\t\u0010:\u001a\u00020\nHÖ\u0001J%\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0001¢\u0006\u0002\bBR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019¨\u0006E"}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;", "Lcom/discord/reactevents/ReactEvent;", "playWallTimeMs", "", "stallMs", "stallCount", "", "seekCount", "firstPlayWaitingMs", "mediaSource", "", "fileDurationSec", "", "mimeType", "fatalErrorCount", "nonFatalErrorCount", "totalDroppedFrames", "totalBandwidthBytes", "<init>", "(JJIIJLjava/lang/String;FLjava/lang/String;IIJJ)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJJIIJLjava/lang/String;FLjava/lang/String;IIJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPlayWallTimeMs", "()J", "getStallMs", "getStallCount", "()I", "getSeekCount", "getFirstPlayWaitingMs", "getMediaSource", "()Ljava/lang/String;", "getFileDurationSec", "()F", "getMimeType", "getFatalErrorCount", "getNonFatalErrorCount", "getTotalDroppedFrames", "getTotalBandwidthBytes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$media_player_release", "$serializer", "Companion", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MediaPlayFinishedAnalytics implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int fatalErrorCount;
    private final float fileDurationSec;
    private final long firstPlayWaitingMs;
    private final String mediaSource;
    private final String mimeType;
    private final int nonFatalErrorCount;
    private final long playWallTimeMs;
    private final int seekCount;
    private final int stallCount;
    private final long stallMs;
    private final long totalBandwidthBytes;
    private final long totalDroppedFrames;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MediaPlayFinishedAnalytics$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MediaPlayFinishedAnalytics(int i7, long j, long j5, int i10, int i11, long j7, String str, float f2, String str2, int i12, int i13, long j10, long j11, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i7 & 4095)) {
            e1.l(i7, 4095, MediaPlayFinishedAnalytics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.playWallTimeMs = j;
        this.stallMs = j5;
        this.stallCount = i10;
        this.seekCount = i11;
        this.firstPlayWaitingMs = j7;
        this.mediaSource = str;
        this.fileDurationSec = f2;
        this.mimeType = str2;
        this.fatalErrorCount = i12;
        this.nonFatalErrorCount = i13;
        this.totalDroppedFrames = j10;
        this.totalBandwidthBytes = j11;
    }

    public static /* synthetic */ MediaPlayFinishedAnalytics copy$default(MediaPlayFinishedAnalytics mediaPlayFinishedAnalytics, long j, long j5, int i7, int i10, long j7, String str, float f2, String str2, int i11, int i12, long j10, long j11, int i13, Object obj) {
        long j12;
        long j13;
        long j14 = (i13 & 1) != 0 ? mediaPlayFinishedAnalytics.playWallTimeMs : j;
        long j15 = (i13 & 2) != 0 ? mediaPlayFinishedAnalytics.stallMs : j5;
        int i14 = (i13 & 4) != 0 ? mediaPlayFinishedAnalytics.stallCount : i7;
        int i15 = (i13 & 8) != 0 ? mediaPlayFinishedAnalytics.seekCount : i10;
        long j16 = (i13 & 16) != 0 ? mediaPlayFinishedAnalytics.firstPlayWaitingMs : j7;
        String str3 = (i13 & 32) != 0 ? mediaPlayFinishedAnalytics.mediaSource : str;
        float f7 = (i13 & 64) != 0 ? mediaPlayFinishedAnalytics.fileDurationSec : f2;
        String str4 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? mediaPlayFinishedAnalytics.mimeType : str2;
        int i16 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? mediaPlayFinishedAnalytics.fatalErrorCount : i11;
        int i17 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? mediaPlayFinishedAnalytics.nonFatalErrorCount : i12;
        long j17 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? mediaPlayFinishedAnalytics.totalDroppedFrames : j10;
        if ((i13 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
            j13 = j17;
            j12 = mediaPlayFinishedAnalytics.totalBandwidthBytes;
        } else {
            j12 = j11;
            j13 = j17;
        }
        return mediaPlayFinishedAnalytics.copy(j14, j15, i14, i15, j16, str3, f7, str4, i16, i17, j13, j12);
    }

    public static final /* synthetic */ void write$Self$media_player_release(MediaPlayFinishedAnalytics self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.C(serialDesc, 0, self.playWallTimeMs);
        output.C(serialDesc, 1, self.stallMs);
        output.l(2, self.stallCount, serialDesc);
        output.l(3, self.seekCount, serialDesc);
        output.C(serialDesc, 4, self.firstPlayWaitingMs);
        s1 s1Var = s1.f17602a;
        output.r(serialDesc, 5, s1Var, self.mediaSource);
        output.j(serialDesc, 6, self.fileDurationSec);
        output.r(serialDesc, 7, s1Var, self.mimeType);
        output.l(8, self.fatalErrorCount, serialDesc);
        output.l(9, self.nonFatalErrorCount, serialDesc);
        output.C(serialDesc, 10, self.totalDroppedFrames);
        output.C(serialDesc, 11, self.totalBandwidthBytes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPlayWallTimeMs() {
        return this.playWallTimeMs;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getNonFatalErrorCount() {
        return this.nonFatalErrorCount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getTotalDroppedFrames() {
        return this.totalDroppedFrames;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getTotalBandwidthBytes() {
        return this.totalBandwidthBytes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStallMs() {
        return this.stallMs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStallCount() {
        return this.stallCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSeekCount() {
        return this.seekCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getFirstPlayWaitingMs() {
        return this.firstPlayWaitingMs;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMediaSource() {
        return this.mediaSource;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getFileDurationSec() {
        return this.fileDurationSec;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFatalErrorCount() {
        return this.fatalErrorCount;
    }

    @NotNull
    public final MediaPlayFinishedAnalytics copy(long playWallTimeMs, long stallMs, int stallCount, int seekCount, long firstPlayWaitingMs, String mediaSource, float fileDurationSec, String mimeType, int fatalErrorCount, int nonFatalErrorCount, long totalDroppedFrames, long totalBandwidthBytes) {
        return new MediaPlayFinishedAnalytics(playWallTimeMs, stallMs, stallCount, seekCount, firstPlayWaitingMs, mediaSource, fileDurationSec, mimeType, fatalErrorCount, nonFatalErrorCount, totalDroppedFrames, totalBandwidthBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaPlayFinishedAnalytics)) {
            return false;
        }
        MediaPlayFinishedAnalytics mediaPlayFinishedAnalytics = (MediaPlayFinishedAnalytics) other;
        return this.playWallTimeMs == mediaPlayFinishedAnalytics.playWallTimeMs && this.stallMs == mediaPlayFinishedAnalytics.stallMs && this.stallCount == mediaPlayFinishedAnalytics.stallCount && this.seekCount == mediaPlayFinishedAnalytics.seekCount && this.firstPlayWaitingMs == mediaPlayFinishedAnalytics.firstPlayWaitingMs && Intrinsics.areEqual(this.mediaSource, mediaPlayFinishedAnalytics.mediaSource) && Float.compare(this.fileDurationSec, mediaPlayFinishedAnalytics.fileDurationSec) == 0 && Intrinsics.areEqual(this.mimeType, mediaPlayFinishedAnalytics.mimeType) && this.fatalErrorCount == mediaPlayFinishedAnalytics.fatalErrorCount && this.nonFatalErrorCount == mediaPlayFinishedAnalytics.nonFatalErrorCount && this.totalDroppedFrames == mediaPlayFinishedAnalytics.totalDroppedFrames && this.totalBandwidthBytes == mediaPlayFinishedAnalytics.totalBandwidthBytes;
    }

    public final int getFatalErrorCount() {
        return this.fatalErrorCount;
    }

    public final float getFileDurationSec() {
        return this.fileDurationSec;
    }

    public final long getFirstPlayWaitingMs() {
        return this.firstPlayWaitingMs;
    }

    public final String getMediaSource() {
        return this.mediaSource;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getNonFatalErrorCount() {
        return this.nonFatalErrorCount;
    }

    public final long getPlayWallTimeMs() {
        return this.playWallTimeMs;
    }

    public final int getSeekCount() {
        return this.seekCount;
    }

    public final int getStallCount() {
        return this.stallCount;
    }

    public final long getStallMs() {
        return this.stallMs;
    }

    public final long getTotalBandwidthBytes() {
        return this.totalBandwidthBytes;
    }

    public final long getTotalDroppedFrames() {
        return this.totalDroppedFrames;
    }

    public int hashCode() {
        int iH = a.h(this.firstPlayWaitingMs, a.u(this.seekCount, a.u(this.stallCount, a.h(this.stallMs, Long.hashCode(this.playWallTimeMs) * 31, 31), 31), 31), 31);
        String str = this.mediaSource;
        int iA = e.a((iH + (str == null ? 0 : str.hashCode())) * 31, 31, this.fileDurationSec);
        String str2 = this.mimeType;
        return Long.hashCode(this.totalBandwidthBytes) + a.h(this.totalDroppedFrames, a.u(this.nonFatalErrorCount, a.u(this.fatalErrorCount, (iA + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        long j = this.playWallTimeMs;
        long j5 = this.stallMs;
        int i7 = this.stallCount;
        int i10 = this.seekCount;
        long j7 = this.firstPlayWaitingMs;
        String str = this.mediaSource;
        float f2 = this.fileDurationSec;
        String str2 = this.mimeType;
        int i11 = this.fatalErrorCount;
        int i12 = this.nonFatalErrorCount;
        long j10 = this.totalDroppedFrames;
        long j11 = this.totalBandwidthBytes;
        StringBuilder sbM = b.m(j, "MediaPlayFinishedAnalytics(playWallTimeMs=", ", stallMs=");
        sbM.append(j5);
        sbM.append(", stallCount=");
        sbM.append(i7);
        sbM.append(", seekCount=");
        sbM.append(i10);
        sbM.append(", firstPlayWaitingMs=");
        sbM.append(j7);
        sbM.append(", mediaSource=");
        sbM.append(str);
        sbM.append(", fileDurationSec=");
        sbM.append(f2);
        sbM.append(", mimeType=");
        sbM.append(str2);
        sbM.append(", fatalErrorCount=");
        sbM.append(i11);
        sbM.append(", nonFatalErrorCount=");
        sbM.append(i12);
        sbM.append(", totalDroppedFrames=");
        sbM.append(j10);
        sbM.append(", totalBandwidthBytes=");
        return e.n(sbM, j11, ")");
    }

    public MediaPlayFinishedAnalytics(long j, long j5, int i7, int i10, long j7, String str, float f2, String str2, int i11, int i12, long j10, long j11) {
        this.playWallTimeMs = j;
        this.stallMs = j5;
        this.stallCount = i7;
        this.seekCount = i10;
        this.firstPlayWaitingMs = j7;
        this.mediaSource = str;
        this.fileDurationSec = f2;
        this.mimeType = str2;
        this.fatalErrorCount = i11;
        this.nonFatalErrorCount = i12;
        this.totalDroppedFrames = j10;
        this.totalBandwidthBytes = j11;
    }
}
