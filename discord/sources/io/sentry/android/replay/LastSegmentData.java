package io.sentry.android.replay;

import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import io.sentry.rrweb.b;
import io.sentry.x5;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$Jh\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010\"R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010$¨\u0006="}, d2 = {"Lio/sentry/android/replay/LastSegmentData;", "", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "Lio/sentry/android/replay/ReplayCache;", "cache", "Ljava/util/Date;", "timestamp", "", StackTraceHelper.ID_KEY, "", "duration", "Lio/sentry/x5;", "replayType", "", "screenAtStart", "", "Lio/sentry/rrweb/b;", "events", "<init>", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;Lio/sentry/android/replay/ReplayCache;Ljava/util/Date;IJLio/sentry/x5;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "component2", "()Lio/sentry/android/replay/ReplayCache;", "component3", "()Ljava/util/Date;", "component4", "()I", "component5", "()J", "component6", "()Lio/sentry/x5;", "component7", "()Ljava/lang/String;", "component8", "()Ljava/util/List;", "copy", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;Lio/sentry/android/replay/ReplayCache;Ljava/util/Date;IJLio/sentry/x5;Ljava/lang/String;Ljava/util/List;)Lio/sentry/android/replay/LastSegmentData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "getRecorderConfig", "Lio/sentry/android/replay/ReplayCache;", "getCache", "Ljava/util/Date;", "getTimestamp", "I", "getId", "J", "getDuration", "Lio/sentry/x5;", "getReplayType", "Ljava/lang/String;", "getScreenAtStart", "Ljava/util/List;", "getEvents", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LastSegmentData {
    public static final int $stable = 8;

    @NotNull
    private final ReplayCache cache;
    private final long duration;

    @NotNull
    private final List<b> events;
    private final int id;

    @NotNull
    private final ScreenshotRecorderConfig recorderConfig;

    @NotNull
    private final x5 replayType;
    private final String screenAtStart;

    @NotNull
    private final Date timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public LastSegmentData(@NotNull ScreenshotRecorderConfig recorderConfig, @NotNull ReplayCache cache, @NotNull Date timestamp, int i7, long j, @NotNull x5 replayType, String str, @NotNull List<? extends b> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        this.recorderConfig = recorderConfig;
        this.cache = cache;
        this.timestamp = timestamp;
        this.id = i7;
        this.duration = j;
        this.replayType = replayType;
        this.screenAtStart = str;
        this.events = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LastSegmentData copy$default(LastSegmentData lastSegmentData, ScreenshotRecorderConfig screenshotRecorderConfig, ReplayCache replayCache, Date date, int i7, long j, x5 x5Var, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            screenshotRecorderConfig = lastSegmentData.recorderConfig;
        }
        if ((i10 & 2) != 0) {
            replayCache = lastSegmentData.cache;
        }
        if ((i10 & 4) != 0) {
            date = lastSegmentData.timestamp;
        }
        if ((i10 & 8) != 0) {
            i7 = lastSegmentData.id;
        }
        if ((i10 & 16) != 0) {
            j = lastSegmentData.duration;
        }
        if ((i10 & 32) != 0) {
            x5Var = lastSegmentData.replayType;
        }
        if ((i10 & 64) != 0) {
            str = lastSegmentData.screenAtStart;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            list = lastSegmentData.events;
        }
        List list2 = list;
        x5 x5Var2 = x5Var;
        long j5 = j;
        Date date2 = date;
        int i11 = i7;
        return lastSegmentData.copy(screenshotRecorderConfig, replayCache, date2, i11, j5, x5Var2, str, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScreenshotRecorderConfig getRecorderConfig() {
        return this.recorderConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReplayCache getCache() {
        return this.cache;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final x5 getReplayType() {
        return this.replayType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getScreenAtStart() {
        return this.screenAtStart;
    }

    @NotNull
    public final List<b> component8() {
        return this.events;
    }

    @NotNull
    public final LastSegmentData copy(@NotNull ScreenshotRecorderConfig recorderConfig, @NotNull ReplayCache cache, @NotNull Date timestamp, int id2, long duration, @NotNull x5 replayType, String screenAtStart, @NotNull List<? extends b> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return new LastSegmentData(recorderConfig, cache, timestamp, id2, duration, replayType, screenAtStart, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastSegmentData)) {
            return false;
        }
        LastSegmentData lastSegmentData = (LastSegmentData) other;
        return Intrinsics.areEqual(this.recorderConfig, lastSegmentData.recorderConfig) && Intrinsics.areEqual(this.cache, lastSegmentData.cache) && Intrinsics.areEqual(this.timestamp, lastSegmentData.timestamp) && this.id == lastSegmentData.id && this.duration == lastSegmentData.duration && this.replayType == lastSegmentData.replayType && Intrinsics.areEqual(this.screenAtStart, lastSegmentData.screenAtStart) && Intrinsics.areEqual(this.events, lastSegmentData.events);
    }

    @NotNull
    public final ReplayCache getCache() {
        return this.cache;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final List<b> getEvents() {
        return this.events;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final ScreenshotRecorderConfig getRecorderConfig() {
        return this.recorderConfig;
    }

    @NotNull
    public final x5 getReplayType() {
        return this.replayType;
    }

    public final String getScreenAtStart() {
        return this.screenAtStart;
    }

    @NotNull
    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = (this.replayType.hashCode() + com.discord.chat.presentation.list.a.h(this.duration, com.discord.chat.presentation.list.a.u(this.id, (this.timestamp.hashCode() + ((this.cache.hashCode() + (this.recorderConfig.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31;
        String str = this.screenAtStart;
        return this.events.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "LastSegmentData(recorderConfig=" + this.recorderConfig + ", cache=" + this.cache + ", timestamp=" + this.timestamp + ", id=" + this.id + ", duration=" + this.duration + ", replayType=" + this.replayType + ", screenAtStart=" + this.screenAtStart + ", events=" + this.events + ')';
    }
}
