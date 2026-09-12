package com.facebook.react.views.scroll;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0000J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/scroll/Interval;", "", ViewProps.START, "", ViewProps.END, StackTraceHelper.ID_KEY, "", "<init>", "(IILjava/lang/String;)V", "getStart", "()I", "getEnd", "getId", "()Ljava/lang/String;", "intersects", "", "other", "component1", "component2", "component3", "copy", "equals", "hashCode", "toString", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVirtualViewContainerStateExperimental.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/Interval\n+ 2 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/VirtualViewContainerStateExperimentalKt\n*L\n1#1,513:1\n509#2,4:514\n*S KotlinDebug\n*F\n+ 1 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/Interval\n*L\n156#1:514,4\n*E\n"})
final /* data */ class Interval {
    private final int end;

    @NotNull
    private final String id;
    private final int start;

    public Interval(int i7, int i10, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.start = i7;
        this.end = i10;
        this.id = id2;
    }

    public static /* synthetic */ Interval copy$default(Interval interval, int i7, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = interval.start;
        }
        if ((i11 & 2) != 0) {
            i10 = interval.end;
        }
        if ((i11 & 4) != 0) {
            str = interval.id;
        }
        return interval.copy(i7, i10, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Interval copy(int start, int end, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new Interval(start, end, id2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Interval)) {
            return false;
        }
        Interval interval = (Interval) other;
        return this.start == interval.start && this.end == interval.end && Intrinsics.areEqual(this.id, interval.id);
    }

    public final int getEnd() {
        return this.end;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return this.id.hashCode() + a.u(this.end, Integer.hashCode(this.start) * 31, 31);
    }

    public final boolean intersects(@NotNull Interval other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            o8.a.b("VirtualViewContainerStateExperimental:Interval: intersect", this.id + ":(" + this.start + ", " + this.end + ") vs " + other.id + ":(" + other.start + ", " + other.end + ")");
        }
        return this.start < other.end && other.start < this.end;
    }

    @NotNull
    public String toString() {
        int i7 = this.start;
        int i10 = this.end;
        return a.k(e.r(i7, "Interval(start=", i10, ", end=", ", id="), this.id, ")");
    }
}
