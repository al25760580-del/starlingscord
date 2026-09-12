package com.discord.resource_usage;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import hs.f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageRecorder;", "", "<init>", "()V", "RequestStats", "Companion", "resource_usage_monitor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceResourceUsageRecorder {
    private static final long initialAppReceiveBytes;
    private static final long initialAppSendBytes;
    private static long initialCellularReceiveBytes;
    private static long initialCellularSendBytes;
    private static long initialTotalReceiveBytes;
    private static long initialTotalSendBytes;
    private static long mediaPlayerBytesReceived;
    private static long socketBytesReceived;
    private static final int uid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RequestStats ota = new RequestStats(0, 0, 3, null);

    @NotNull
    private static final RequestStats xhr = new RequestStats(0, 0, 3, null);

    @NotNull
    private static final RequestStats fresco = new RequestStats(0, 0, 3, null);

    @NotNull
    private static final RequestStats downloads = new RequestStats(0, 0, 3, null);

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0018\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u000eH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageRecorder$Companion;", "", "<init>", "()V", "socketBytesReceived", "", "getSocketBytesReceived", "()J", "setSocketBytesReceived", "(J)V", "mediaPlayerBytesReceived", "getMediaPlayerBytesReceived", "setMediaPlayerBytesReceived", "ota", "Lcom/discord/resource_usage/DeviceResourceUsageRecorder$RequestStats;", "xhr", "fresco", "downloads", "uid", "", "initialCellularReceiveBytes", "initialCellularSendBytes", "initialTotalReceiveBytes", "initialTotalSendBytes", "initialAppReceiveBytes", "initialAppSendBytes", "bundleUpdaterInterceptor", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "clientXHRInterceptor", "frescoInterceptor", "downloadInterceptor", "getNetworkUsage", "Lcom/facebook/react/bridge/WritableNativeMap;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "requestStatsInterceptor", "stats", "resource_usage_monitor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Response requestStatsInterceptor(Interceptor.Chain chain, RequestStats stats) {
            Response responseA = chain.a(chain.i());
            ResponseBody responseBody = responseA.f17385y;
            stats.setNumRequests(stats.getNumRequests() + 1);
            if (f.a(responseA) && responseBody != null) {
                BufferedSource bufferedSourceSource = responseBody.source();
                bufferedSourceSource.N(LongCompanionObject.MAX_VALUE);
                stats.setBytesReceived(stats.getBytesReceived() + bufferedSourceSource.h().f17413e);
            }
            return responseA;
        }

        @NotNull
        public final Response bundleUpdaterInterceptor(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.ota);
        }

        @NotNull
        public final Response clientXHRInterceptor(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.xhr);
        }

        @NotNull
        public final Response downloadInterceptor(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.downloads);
        }

        @NotNull
        public final Response frescoInterceptor(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.fresco);
        }

        public final long getMediaPlayerBytesReceived() {
            return DeviceResourceUsageRecorder.mediaPlayerBytesReceived;
        }

        @NotNull
        public final WritableNativeMap getNetworkUsage(@NotNull ReactApplicationContext reactApplicationContext) {
            Pair pair;
            Integer numValueOf;
            Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
            try {
                Object systemService = reactApplicationContext.getSystemService("phone");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                if (Build.VERSION.SDK_INT >= 28) {
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    numValueOf = Integer.valueOf(signalStrength != null ? signalStrength.getLevel() : 0);
                } else {
                    numValueOf = null;
                }
                pair = new Pair(numValueOf, Boolean.valueOf(telephonyManager.isNetworkRoaming()));
            } catch (Exception unused) {
                pair = new Pair(null, null);
            }
            return NativeMapExtensionsKt.nativeMapOf(new Pair("signalStrengthLevel", (Integer) pair.f14612d), new Pair("isNetworkRoaming", (Boolean) pair.f14613e), new Pair("cellularReceiveBytes", Long.valueOf(TrafficStats.getMobileRxBytes() - DeviceResourceUsageRecorder.initialCellularReceiveBytes)), new Pair("cellularSendBytes", Long.valueOf(TrafficStats.getMobileTxBytes() - DeviceResourceUsageRecorder.initialCellularSendBytes)), new Pair("totalReceiveBytes", Long.valueOf(TrafficStats.getTotalRxBytes() - DeviceResourceUsageRecorder.initialTotalReceiveBytes)), new Pair("totalSendBytes", Long.valueOf(TrafficStats.getTotalTxBytes() - DeviceResourceUsageRecorder.initialTotalSendBytes)), new Pair("uidReceiveBytes", Long.valueOf(TrafficStats.getUidRxBytes(DeviceResourceUsageRecorder.uid) - DeviceResourceUsageRecorder.initialAppReceiveBytes)), new Pair("uidSendBytes", Long.valueOf(TrafficStats.getUidTxBytes(DeviceResourceUsageRecorder.uid) - DeviceResourceUsageRecorder.initialAppSendBytes)), new Pair("socketBytesReceived", Long.valueOf(getSocketBytesReceived())), new Pair("otaBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.ota.getBytesReceived())), new Pair("otaNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.ota.getNumRequests())), new Pair("xhrBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.xhr.getBytesReceived())), new Pair("xhrNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.xhr.getNumRequests())), new Pair("frescoBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.fresco.getBytesReceived())), new Pair("frescoNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.fresco.getNumRequests())), new Pair("downloadBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.downloads.getBytesReceived())), new Pair("downloadNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.downloads.getNumRequests())), new Pair("mediaPlayerBytesReceived", Long.valueOf(getMediaPlayerBytesReceived())));
        }

        public final long getSocketBytesReceived() {
            return DeviceResourceUsageRecorder.socketBytesReceived;
        }

        public final void setMediaPlayerBytesReceived(long j) {
            DeviceResourceUsageRecorder.mediaPlayerBytesReceived = j;
        }

        public final void setSocketBytesReceived(long j) {
            DeviceResourceUsageRecorder.socketBytesReceived = j;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageRecorder$RequestStats;", "", "numRequests", "", "bytesReceived", "", "<init>", "(IJ)V", "getNumRequests", "()I", "setNumRequests", "(I)V", "getBytesReceived", "()J", "setBytesReceived", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "resource_usage_monitor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequestStats {
        private long bytesReceived;
        private int numRequests;

        public RequestStats() {
            this(0, 0L, 3, null);
        }

        public static /* synthetic */ RequestStats copy$default(RequestStats requestStats, int i7, long j, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = requestStats.numRequests;
            }
            if ((i10 & 2) != 0) {
                j = requestStats.bytesReceived;
            }
            return requestStats.copy(i7, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getNumRequests() {
            return this.numRequests;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getBytesReceived() {
            return this.bytesReceived;
        }

        @NotNull
        public final RequestStats copy(int numRequests, long bytesReceived) {
            return new RequestStats(numRequests, bytesReceived);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestStats)) {
                return false;
            }
            RequestStats requestStats = (RequestStats) other;
            return this.numRequests == requestStats.numRequests && this.bytesReceived == requestStats.bytesReceived;
        }

        public final long getBytesReceived() {
            return this.bytesReceived;
        }

        public final int getNumRequests() {
            return this.numRequests;
        }

        public int hashCode() {
            return Long.hashCode(this.bytesReceived) + (Integer.hashCode(this.numRequests) * 31);
        }

        public final void setBytesReceived(long j) {
            this.bytesReceived = j;
        }

        public final void setNumRequests(int i7) {
            this.numRequests = i7;
        }

        @NotNull
        public String toString() {
            return "RequestStats(numRequests=" + this.numRequests + ", bytesReceived=" + this.bytesReceived + ")";
        }

        public RequestStats(int i7, long j) {
            this.numRequests = i7;
            this.bytesReceived = j;
        }

        public /* synthetic */ RequestStats(int i7, long j, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0 : i7, (i10 & 2) != 0 ? 0L : j);
        }
    }

    static {
        int iMyUid = Process.myUid();
        uid = iMyUid;
        initialCellularReceiveBytes = TrafficStats.getMobileRxBytes();
        initialCellularSendBytes = TrafficStats.getMobileTxBytes();
        initialTotalReceiveBytes = TrafficStats.getTotalRxBytes();
        initialTotalSendBytes = TrafficStats.getTotalTxBytes();
        initialAppReceiveBytes = TrafficStats.getUidRxBytes(iMyUid);
        initialAppSendBytes = TrafficStats.getUidTxBytes(iMyUid);
    }
}
