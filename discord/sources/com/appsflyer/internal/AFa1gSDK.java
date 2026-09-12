package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFa1gSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFa1hSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1hSDK;)V", "", "getCurrencyIso4217Code", "(Ljava/lang/String;)Z", "", "(Ljava/lang/String;Ljava/lang/Object;)V", "AFAdRevenueData", "Ljava/util/Map;", "getMediationNetwork", "Lcom/appsflyer/internal/AFa1hSDK;", "getMonetizationNetwork", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFa1gSDK {

    /* JADX INFO: renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    final Map<String, Object> getMediationNetwork;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    final AFa1hSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1gSDK$AFa1vSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFa1gSDK$AFa1vSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1jSDK;", "p0", "Lcom/appsflyer/internal/AFa1gSDK;", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1jSDK;)Lcom/appsflyer/internal/AFa1gSDK;", "Lcom/appsflyer/internal/AFa1hSDK;", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFa1hSDK;)Lcom/appsflyer/internal/AFa1gSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public static AFa1gSDK AFAdRevenueData(@NotNull AFa1hSDK p3) {
            Intrinsics.checkNotNullParameter(p3, "");
            return new AFa1gSDK(new LinkedHashMap(), p3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static AFa1gSDK getMediationNetwork(@NotNull AFh1jSDK p3) {
            Intrinsics.checkNotNullParameter(p3, "");
            Map<String, Object> map = p3.getCurrencyIso4217Code;
            Intrinsics.checkNotNullExpressionValue(map, "");
            return new AFa1gSDK(map, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFa1gSDK(Map<String, Object> map, AFa1hSDK aFa1hSDK) {
        this.getMediationNetwork = map;
        this.getMonetizationNetwork = aFa1hSDK;
    }

    @NotNull
    public static final AFa1gSDK AFAdRevenueData(@NotNull AFh1jSDK aFh1jSDK) {
        return Companion.getMediationNetwork(aFh1jSDK);
    }

    @NotNull
    public static final AFa1gSDK getMonetizationNetwork(@NotNull AFa1hSDK aFa1hSDK) {
        return Companion.AFAdRevenueData(aFa1hSDK);
    }

    public final void getCurrencyIso4217Code(@NotNull String p3, Object p5) {
        Intrinsics.checkNotNullParameter(p3, "");
        this.getMediationNetwork.put(p3, p5);
        AFa1hSDK aFa1hSDK = this.getMonetizationNetwork;
        if (aFa1hSDK != null) {
            aFa1hSDK.getMonetizationNetwork(this.getMediationNetwork);
        }
    }

    public final boolean getCurrencyIso4217Code(@NotNull String p3) {
        Intrinsics.checkNotNullParameter(p3, "");
        return this.getMediationNetwork.containsKey(p3);
    }

    public /* synthetic */ AFa1gSDK(Map map, AFa1hSDK aFa1hSDK, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i7 & 2) != 0 ? null : aFa1hSDK);
    }

    public /* synthetic */ AFa1gSDK(Map map, AFa1hSDK aFa1hSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1hSDK);
    }
}
