package com.discord.analytics.touch;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010@\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010'J¼\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0007HÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010(\u001a\u0004\b/\u0010'R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010(\u001a\u0004\b0\u0010'¨\u0006H"}, d2 = {"Lcom/discord/analytics/touch/TouchEventDetails;", "", "eventType", "", "timestamp", "", "screenX", "", "screenY", "viewX", "viewY", "totalMemoryMB", "memoryBreakdown", "viewHierarchy", "gesture", "windowName", "hitTestDurationUs", "", "distance", "durationMs", "velocity", "scaleFactor", "<init>", "(Ljava/lang/String;JIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;)V", "getEventType", "()Ljava/lang/String;", "getTimestamp", "()J", "getScreenX", "()I", "getScreenY", "getViewX", "getViewY", "getTotalMemoryMB", "getMemoryBreakdown", "getViewHierarchy", "getGesture", "getWindowName", "getHitTestDurationUs", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDistance", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDurationMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVelocity", "getScaleFactor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;JIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;)Lcom/discord/analytics/touch/TouchEventDetails;", "equals", "", "other", "hashCode", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TouchEventDetails {
    private final Integer distance;
    private final Long durationMs;

    @NotNull
    private final String eventType;
    private final String gesture;
    private final Double hitTestDurationUs;

    @NotNull
    private final String memoryBreakdown;
    private final Double scaleFactor;
    private final int screenX;
    private final int screenY;
    private final long timestamp;
    private final int totalMemoryMB;
    private final Double velocity;

    @NotNull
    private final String viewHierarchy;
    private final int viewX;
    private final int viewY;
    private final String windowName;

    public TouchEventDetails(@NotNull String eventType, long j, int i7, int i10, int i11, int i12, int i13, @NotNull String memoryBreakdown, @NotNull String viewHierarchy, String str, String str2, Double d6, Integer num, Long l6, Double d7, Double d8) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(memoryBreakdown, "memoryBreakdown");
        Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
        this.eventType = eventType;
        this.timestamp = j;
        this.screenX = i7;
        this.screenY = i10;
        this.viewX = i11;
        this.viewY = i12;
        this.totalMemoryMB = i13;
        this.memoryBreakdown = memoryBreakdown;
        this.viewHierarchy = viewHierarchy;
        this.gesture = str;
        this.windowName = str2;
        this.hitTestDurationUs = d6;
        this.distance = num;
        this.durationMs = l6;
        this.velocity = d7;
        this.scaleFactor = d8;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getGesture() {
        return this.gesture;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getWindowName() {
        return this.windowName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getHitTestDurationUs() {
        return this.hitTestDurationUs;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getDurationMs() {
        return this.durationMs;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Double getVelocity() {
        return this.velocity;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Double getScaleFactor() {
        return this.scaleFactor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getScreenX() {
        return this.screenX;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getScreenY() {
        return this.screenY;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getViewX() {
        return this.viewX;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getViewY() {
        return this.viewY;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTotalMemoryMB() {
        return this.totalMemoryMB;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMemoryBreakdown() {
        return this.memoryBreakdown;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getViewHierarchy() {
        return this.viewHierarchy;
    }

    @NotNull
    public final TouchEventDetails copy(@NotNull String eventType, long timestamp, int screenX, int screenY, int viewX, int viewY, int totalMemoryMB, @NotNull String memoryBreakdown, @NotNull String viewHierarchy, String gesture, String windowName, Double hitTestDurationUs, Integer distance, Long durationMs, Double velocity, Double scaleFactor) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(memoryBreakdown, "memoryBreakdown");
        Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
        return new TouchEventDetails(eventType, timestamp, screenX, screenY, viewX, viewY, totalMemoryMB, memoryBreakdown, viewHierarchy, gesture, windowName, hitTestDurationUs, distance, durationMs, velocity, scaleFactor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouchEventDetails)) {
            return false;
        }
        TouchEventDetails touchEventDetails = (TouchEventDetails) other;
        return Intrinsics.areEqual(this.eventType, touchEventDetails.eventType) && this.timestamp == touchEventDetails.timestamp && this.screenX == touchEventDetails.screenX && this.screenY == touchEventDetails.screenY && this.viewX == touchEventDetails.viewX && this.viewY == touchEventDetails.viewY && this.totalMemoryMB == touchEventDetails.totalMemoryMB && Intrinsics.areEqual(this.memoryBreakdown, touchEventDetails.memoryBreakdown) && Intrinsics.areEqual(this.viewHierarchy, touchEventDetails.viewHierarchy) && Intrinsics.areEqual(this.gesture, touchEventDetails.gesture) && Intrinsics.areEqual(this.windowName, touchEventDetails.windowName) && Intrinsics.areEqual((Object) this.hitTestDurationUs, (Object) touchEventDetails.hitTestDurationUs) && Intrinsics.areEqual(this.distance, touchEventDetails.distance) && Intrinsics.areEqual(this.durationMs, touchEventDetails.durationMs) && Intrinsics.areEqual((Object) this.velocity, (Object) touchEventDetails.velocity) && Intrinsics.areEqual((Object) this.scaleFactor, (Object) touchEventDetails.scaleFactor);
    }

    public final Integer getDistance() {
        return this.distance;
    }

    public final Long getDurationMs() {
        return this.durationMs;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    public final String getGesture() {
        return this.gesture;
    }

    public final Double getHitTestDurationUs() {
        return this.hitTestDurationUs;
    }

    @NotNull
    public final String getMemoryBreakdown() {
        return this.memoryBreakdown;
    }

    public final Double getScaleFactor() {
        return this.scaleFactor;
    }

    public final int getScreenX() {
        return this.screenX;
    }

    public final int getScreenY() {
        return this.screenY;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getTotalMemoryMB() {
        return this.totalMemoryMB;
    }

    public final Double getVelocity() {
        return this.velocity;
    }

    @NotNull
    public final String getViewHierarchy() {
        return this.viewHierarchy;
    }

    public final int getViewX() {
        return this.viewX;
    }

    public final int getViewY() {
        return this.viewY;
    }

    public final String getWindowName() {
        return this.windowName;
    }

    public int hashCode() {
        int iD = e.d(e.d(com.discord.chat.presentation.list.a.u(this.totalMemoryMB, com.discord.chat.presentation.list.a.u(this.viewY, com.discord.chat.presentation.list.a.u(this.viewX, com.discord.chat.presentation.list.a.u(this.screenY, com.discord.chat.presentation.list.a.u(this.screenX, com.discord.chat.presentation.list.a.h(this.timestamp, this.eventType.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.memoryBreakdown), 31, this.viewHierarchy);
        String str = this.gesture;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.windowName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d6 = this.hitTestDurationUs;
        int iHashCode3 = (iHashCode2 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num = this.distance;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l6 = this.durationMs;
        int iHashCode5 = (iHashCode4 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Double d7 = this.velocity;
        int iHashCode6 = (iHashCode5 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.scaleFactor;
        return iHashCode6 + (d8 != null ? d8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.eventType;
        long j = this.timestamp;
        int i7 = this.screenX;
        int i10 = this.screenY;
        int i11 = this.viewX;
        int i12 = this.viewY;
        int i13 = this.totalMemoryMB;
        String str2 = this.memoryBreakdown;
        String str3 = this.viewHierarchy;
        String str4 = this.gesture;
        String str5 = this.windowName;
        Double d6 = this.hitTestDurationUs;
        Integer num = this.distance;
        Long l6 = this.durationMs;
        Double d7 = this.velocity;
        Double d8 = this.scaleFactor;
        StringBuilder sb2 = new StringBuilder("TouchEventDetails(eventType=");
        sb2.append(str);
        sb2.append(", timestamp=");
        sb2.append(j);
        sb2.append(", screenX=");
        sb2.append(i7);
        sb2.append(", screenY=");
        sb2.append(i10);
        sb2.append(", viewX=");
        sb2.append(i11);
        sb2.append(", viewY=");
        sb2.append(i12);
        sb2.append(", totalMemoryMB=");
        sb2.append(i13);
        sb2.append(", memoryBreakdown=");
        sb2.append(str2);
        e.A(sb2, ", viewHierarchy=", str3, ", gesture=", str4);
        sb2.append(", windowName=");
        sb2.append(str5);
        sb2.append(", hitTestDurationUs=");
        sb2.append(d6);
        sb2.append(", distance=");
        sb2.append(num);
        sb2.append(", durationMs=");
        sb2.append(l6);
        sb2.append(", velocity=");
        sb2.append(d7);
        sb2.append(", scaleFactor=");
        sb2.append(d8);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ TouchEventDetails(String str, long j, int i7, int i10, int i11, int i12, int i13, String str2, String str3, String str4, String str5, Double d6, Integer num, Long l6, Double d7, Double d8, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i7, i10, i11, i12, i13, str2, str3, str4, (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str5, (i14 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : d6, (i14 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num, (i14 & 8192) != 0 ? null : l6, (i14 & 16384) != 0 ? null : d7, (i14 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? null : d8);
    }
}
