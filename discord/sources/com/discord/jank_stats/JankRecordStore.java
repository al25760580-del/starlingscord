package com.discord.jank_stats;

import a3.e;
import com.facebook.react.animated.InterpolationAnimatedNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0003%&'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u001e\u001a\u00020\u001aJ \u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0012H\u0002J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!J\u0014\u0010\"\u001a\u00020\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/discord/jank_stats/JankRecordStore;", "", "store", "Lcom/discord/jank_stats/JankKeyValueStore;", "<init>", "(Lcom/discord/jank_stats/JankKeyValueStore;)V", "lock", "inherited", "Ljava/util/LinkedHashMap;", "", "Lcom/discord/jank_stats/JankRecordStore$PendingRecord;", "Lkotlin/collections/LinkedHashMap;", "totalFrames", "Ljava/util/concurrent/atomic/AtomicLong;", "jankFrames", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, "Lcom/discord/jank_stats/JankRecordStore$SessionIdentity;", "nextFlushAtMs", "", "load", "", "trimInherited", "changes", "", "recordFrame", "isJank", "", "takeFlushDeadline", "nowMs", "hydrate", "flush", "writeRecord", "pending", "", "ack", "sessionIds", "", "SessionIdentity", "PendingRecord", "Companion", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJankRecordStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JankRecordStore.kt\ncom/discord/jank_stats/JankRecordStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1869#2,2:234\n1056#2:236\n1869#2,2:237\n1869#2,2:239\n774#2:241\n865#2,2:242\n1193#2,2:244\n1267#2,4:246\n1869#2,2:250\n*S KotlinDebug\n*F\n+ 1 JankRecordStore.kt\ncom/discord/jank_stats/JankRecordStore\n*L\n51#1:234,2\n65#1:236\n65#1:237,2\n75#1:239,2\n158#1:241\n158#1:242,2\n160#1:244,2\n160#1:246,4\n161#1:250,2\n*E\n"})
public final class JankRecordStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long FIRST_FLUSH_DELAY_MS = 5000;
    public static final long FLUSH_INTERVAL_MS = 30000;

    @NotNull
    public static final String KEY_RECORD_PREFIX = "record_";

    @NotNull
    private static final String KEY_VERSION = "version";
    public static final int MAX_PENDING_RECORDS = 8;
    private static final int RECORD_VERSION = 1;
    private SessionIdentity identity;

    @NotNull
    private final LinkedHashMap<String, PendingRecord> inherited;

    @NotNull
    private final AtomicLong jankFrames;

    @NotNull
    private final Object lock;
    private volatile long nextFlushAtMs;

    @NotNull
    private final JankKeyValueStore store;

    @NotNull
    private final AtomicLong totalFrames;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/jank_stats/JankRecordStore$Companion;", "", "<init>", "()V", "open", "Lcom/discord/jank_stats/JankRecordStore;", "store", "Lcom/discord/jank_stats/JankKeyValueStore;", "nowMs", "", "open$jank_stats_release", "RECORD_VERSION", "", "MAX_PENDING_RECORDS", "FIRST_FLUSH_DELAY_MS", "FLUSH_INTERVAL_MS", "KEY_VERSION", "", "KEY_RECORD_PREFIX", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JankRecordStore open$jank_stats_release(@NotNull JankKeyValueStore store, long nowMs) {
            Intrinsics.checkNotNullParameter(store, "store");
            JankRecordStore jankRecordStore = new JankRecordStore(store, null);
            jankRecordStore.load();
            jankRecordStore.nextFlushAtMs = nowMs + JankRecordStore.FIRST_FLUSH_DELAY_MS;
            return jankRecordStore;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, d2 = {"Lcom/discord/jank_stats/JankRecordStore$PendingRecord;", "", "sessionId", "", "sessionStartWallMs", "", "appVersionCode", "", "releaseChannel", "totalFrames", "jankFrames", "<init>", "(Ljava/lang/String;JILjava/lang/String;JJ)V", "getSessionId", "()Ljava/lang/String;", "getSessionStartWallMs", "()J", "getAppVersionCode", "()I", "getReleaseChannel", "getTotalFrames", "getJankFrames", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PendingRecord {
        private final int appVersionCode;
        private final long jankFrames;

        @NotNull
        private final String releaseChannel;

        @NotNull
        private final String sessionId;
        private final long sessionStartWallMs;
        private final long totalFrames;

        public PendingRecord(@NotNull String sessionId, long j, int i7, @NotNull String releaseChannel, long j5, long j7) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(releaseChannel, "releaseChannel");
            this.sessionId = sessionId;
            this.sessionStartWallMs = j;
            this.appVersionCode = i7;
            this.releaseChannel = releaseChannel;
            this.totalFrames = j5;
            this.jankFrames = j7;
        }

        public static /* synthetic */ PendingRecord copy$default(PendingRecord pendingRecord, String str, long j, int i7, String str2, long j5, long j7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pendingRecord.sessionId;
            }
            if ((i10 & 2) != 0) {
                j = pendingRecord.sessionStartWallMs;
            }
            if ((i10 & 4) != 0) {
                i7 = pendingRecord.appVersionCode;
            }
            if ((i10 & 8) != 0) {
                str2 = pendingRecord.releaseChannel;
            }
            if ((i10 & 16) != 0) {
                j5 = pendingRecord.totalFrames;
            }
            if ((i10 & 32) != 0) {
                j7 = pendingRecord.jankFrames;
            }
            long j10 = j7;
            return pendingRecord.copy(str, j, i7, str2, j5, j10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getSessionStartWallMs() {
            return this.sessionStartWallMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getAppVersionCode() {
            return this.appVersionCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getReleaseChannel() {
            return this.releaseChannel;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getTotalFrames() {
            return this.totalFrames;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getJankFrames() {
            return this.jankFrames;
        }

        @NotNull
        public final PendingRecord copy(@NotNull String sessionId, long sessionStartWallMs, int appVersionCode, @NotNull String releaseChannel, long totalFrames, long jankFrames) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(releaseChannel, "releaseChannel");
            return new PendingRecord(sessionId, sessionStartWallMs, appVersionCode, releaseChannel, totalFrames, jankFrames);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingRecord)) {
                return false;
            }
            PendingRecord pendingRecord = (PendingRecord) other;
            return Intrinsics.areEqual(this.sessionId, pendingRecord.sessionId) && this.sessionStartWallMs == pendingRecord.sessionStartWallMs && this.appVersionCode == pendingRecord.appVersionCode && Intrinsics.areEqual(this.releaseChannel, pendingRecord.releaseChannel) && this.totalFrames == pendingRecord.totalFrames && this.jankFrames == pendingRecord.jankFrames;
        }

        public final int getAppVersionCode() {
            return this.appVersionCode;
        }

        public final long getJankFrames() {
            return this.jankFrames;
        }

        @NotNull
        public final String getReleaseChannel() {
            return this.releaseChannel;
        }

        @NotNull
        public final String getSessionId() {
            return this.sessionId;
        }

        public final long getSessionStartWallMs() {
            return this.sessionStartWallMs;
        }

        public final long getTotalFrames() {
            return this.totalFrames;
        }

        public int hashCode() {
            return Long.hashCode(this.jankFrames) + com.discord.chat.presentation.list.a.h(this.totalFrames, e.d(com.discord.chat.presentation.list.a.u(this.appVersionCode, com.discord.chat.presentation.list.a.h(this.sessionStartWallMs, this.sessionId.hashCode() * 31, 31), 31), 31, this.releaseChannel), 31);
        }

        @NotNull
        public String toString() {
            String str = this.sessionId;
            long j = this.sessionStartWallMs;
            int i7 = this.appVersionCode;
            String str2 = this.releaseChannel;
            long j5 = this.totalFrames;
            long j7 = this.jankFrames;
            StringBuilder sb2 = new StringBuilder("PendingRecord(sessionId=");
            sb2.append(str);
            sb2.append(", sessionStartWallMs=");
            sb2.append(j);
            sb2.append(", appVersionCode=");
            sb2.append(i7);
            sb2.append(", releaseChannel=");
            sb2.append(str2);
            sb2.append(", totalFrames=");
            sb2.append(j5);
            sb2.append(", jankFrames=");
            return e.n(sb2, j7, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/discord/jank_stats/JankRecordStore$SessionIdentity;", "", "sessionId", "", "sessionStartWallMs", "", "appVersionCode", "", "releaseChannel", "<init>", "(Ljava/lang/String;JILjava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "getSessionStartWallMs", "()J", "getAppVersionCode", "()I", "getReleaseChannel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SessionIdentity {
        private final int appVersionCode;

        @NotNull
        private final String releaseChannel;

        @NotNull
        private final String sessionId;
        private final long sessionStartWallMs;

        public SessionIdentity(@NotNull String sessionId, long j, int i7, @NotNull String releaseChannel) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(releaseChannel, "releaseChannel");
            this.sessionId = sessionId;
            this.sessionStartWallMs = j;
            this.appVersionCode = i7;
            this.releaseChannel = releaseChannel;
        }

        public static /* synthetic */ SessionIdentity copy$default(SessionIdentity sessionIdentity, String str, long j, int i7, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sessionIdentity.sessionId;
            }
            if ((i10 & 2) != 0) {
                j = sessionIdentity.sessionStartWallMs;
            }
            if ((i10 & 4) != 0) {
                i7 = sessionIdentity.appVersionCode;
            }
            if ((i10 & 8) != 0) {
                str2 = sessionIdentity.releaseChannel;
            }
            return sessionIdentity.copy(str, j, i7, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getSessionStartWallMs() {
            return this.sessionStartWallMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getAppVersionCode() {
            return this.appVersionCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getReleaseChannel() {
            return this.releaseChannel;
        }

        @NotNull
        public final SessionIdentity copy(@NotNull String sessionId, long sessionStartWallMs, int appVersionCode, @NotNull String releaseChannel) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(releaseChannel, "releaseChannel");
            return new SessionIdentity(sessionId, sessionStartWallMs, appVersionCode, releaseChannel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionIdentity)) {
                return false;
            }
            SessionIdentity sessionIdentity = (SessionIdentity) other;
            return Intrinsics.areEqual(this.sessionId, sessionIdentity.sessionId) && this.sessionStartWallMs == sessionIdentity.sessionStartWallMs && this.appVersionCode == sessionIdentity.appVersionCode && Intrinsics.areEqual(this.releaseChannel, sessionIdentity.releaseChannel);
        }

        public final int getAppVersionCode() {
            return this.appVersionCode;
        }

        @NotNull
        public final String getReleaseChannel() {
            return this.releaseChannel;
        }

        @NotNull
        public final String getSessionId() {
            return this.sessionId;
        }

        public final long getSessionStartWallMs() {
            return this.sessionStartWallMs;
        }

        public int hashCode() {
            return this.releaseChannel.hashCode() + com.discord.chat.presentation.list.a.u(this.appVersionCode, com.discord.chat.presentation.list.a.h(this.sessionStartWallMs, this.sessionId.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "SessionIdentity(sessionId=" + this.sessionId + ", sessionStartWallMs=" + this.sessionStartWallMs + ", appVersionCode=" + this.appVersionCode + ", releaseChannel=" + this.releaseChannel + ")";
        }
    }

    public /* synthetic */ JankRecordStore(JankKeyValueStore jankKeyValueStore, DefaultConstructorMarker defaultConstructorMarker) {
        this(jankKeyValueStore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void load() {
        Integer intOrNull;
        synchronized (this.lock) {
            try {
                Map<String, String> all = this.store.readAll();
                HashMap map = new HashMap();
                ArrayList arrayList = new ArrayList(9);
                String str = all.get(KEY_VERSION);
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null || intOrNull.intValue() != 1) {
                    Iterator<T> it = all.keySet().iterator();
                    while (it.hasNext()) {
                        map.put((String) it.next(), null);
                    }
                    map.put(KEY_VERSION, "1");
                } else {
                    for (Map.Entry<String, String> entry : all.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (x.o(key, KEY_RECORD_PREFIX, false)) {
                            PendingRecord pendingRecordDecodeRecord = RecordJson.INSTANCE.decodeRecord(value);
                            if (pendingRecordDecodeRecord != null) {
                                if (Intrinsics.areEqual(KEY_RECORD_PREFIX + pendingRecordDecodeRecord.getSessionId(), key)) {
                                    arrayList.add(pendingRecordDecodeRecord);
                                }
                            }
                            map.put(key, null);
                        }
                    }
                }
                for (PendingRecord pendingRecord : CollectionsKt.e0(arrayList, new Comparator() { // from class: com.discord.jank_stats.JankRecordStore$load$lambda$3$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t10) {
                        return tn.a.a(Long.valueOf(((JankRecordStore.PendingRecord) t5).getSessionStartWallMs()), Long.valueOf(((JankRecordStore.PendingRecord) t10).getSessionStartWallMs()));
                    }
                })) {
                    this.inherited.put(pendingRecord.getSessionId(), pendingRecord);
                }
                trimInherited(map);
                if (!map.isEmpty()) {
                    this.store.write(map);
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void trimInherited(Map<String, String> changes) {
        int size = this.inherited.size() - 8;
        if (size <= 0) {
            return;
        }
        Set<String> setKeySet = this.inherited.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        for (String str : CollectionsKt.f0(setKeySet, size)) {
            this.inherited.remove(str);
            changes.put(KEY_RECORD_PREFIX + str, null);
        }
    }

    private final void writeRecord(SessionIdentity identity, long totalFrames, long jankFrames) {
        this.store.write(v0.b(new Pair(e.l(KEY_RECORD_PREFIX, identity.getSessionId()), RecordJson.INSTANCE.encodeRecord(identity, totalFrames, jankFrames))));
    }

    public final void ack(@NotNull Set<String> sessionIds) {
        Intrinsics.checkNotNullParameter(sessionIds, "sessionIds");
        synchronized (this.lock) {
            try {
                Set<String> setKeySet = this.inherited.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    if (sessionIds.contains((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                JankKeyValueStore jankKeyValueStore = this.store;
                int iA = v0.a(e0.l(arrayList, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(KEY_RECORD_PREFIX + ((String) it.next()), null);
                }
                jankKeyValueStore.write(linkedHashMap);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.inherited.remove((String) it2.next());
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean flush() {
        synchronized (this.lock) {
            SessionIdentity sessionIdentity = this.identity;
            if (sessionIdentity == null) {
                return false;
            }
            writeRecord(sessionIdentity, this.totalFrames.get(), this.jankFrames.get());
            return true;
        }
    }

    public final boolean hydrate(@NotNull SessionIdentity identity) {
        Intrinsics.checkNotNullParameter(identity, "identity");
        synchronized (this.lock) {
            try {
                SessionIdentity sessionIdentity = this.identity;
                if (Intrinsics.areEqual(sessionIdentity != null ? sessionIdentity.getSessionId() : null, identity.getSessionId())) {
                    return false;
                }
                if (sessionIdentity != null) {
                    long andSet = this.jankFrames.getAndSet(0L);
                    long andSet2 = this.totalFrames.getAndSet(0L);
                    this.inherited.put(sessionIdentity.getSessionId(), new PendingRecord(sessionIdentity.getSessionId(), sessionIdentity.getSessionStartWallMs(), sessionIdentity.getAppVersionCode(), sessionIdentity.getReleaseChannel(), andSet2, andSet));
                    HashMap map = new HashMap();
                    trimInherited(map);
                    map.put(KEY_RECORD_PREFIX + sessionIdentity.getSessionId(), RecordJson.INSTANCE.encodeRecord(sessionIdentity, andSet2, andSet));
                    this.store.write(map);
                }
                this.identity = identity;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final List<PendingRecord> pending() {
        List<PendingRecord> listI0;
        synchronized (this.lock) {
            Collection<PendingRecord> collectionValues = this.inherited.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            listI0 = CollectionsKt.i0(collectionValues);
        }
        return listI0;
    }

    public final void recordFrame(boolean isJank) {
        this.totalFrames.incrementAndGet();
        if (isJank) {
            this.jankFrames.incrementAndGet();
        }
    }

    public final boolean takeFlushDeadline(long nowMs) {
        if (nowMs < this.nextFlushAtMs) {
            return false;
        }
        this.nextFlushAtMs = nowMs + FLUSH_INTERVAL_MS;
        return true;
    }

    private JankRecordStore(JankKeyValueStore jankKeyValueStore) {
        this.store = jankKeyValueStore;
        this.lock = new Object();
        this.inherited = new LinkedHashMap<>();
        this.totalFrames = new AtomicLong();
        this.jankFrames = new AtomicLong();
    }
}
