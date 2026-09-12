package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0005H\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000b\u001a\u00020\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFd1qSDK;", "Lcom/appsflyer/internal/AFc1aSDK;", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "getCurrencyIso4217Code", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1gSDK;", "getRevenue", "Lcom/appsflyer/internal/AFd1gSDK;", "()Lcom/appsflyer/internal/AFd1gSDK;", "getMediationNetwork", "()Ljava/lang/String;", "getMonetizationNetwork", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFd1qSDK extends AFc1aSDK {

    @NotNull
    public static String getMonetizationNetwork = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private final AFd1gSDK getCurrencyIso4217Code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1qSDK(@NotNull byte[] bArr, Map<String, String> map, int i7) {
        super(bArr, map, i7);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getCurrencyIso4217Code = AFd1gSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NotNull
    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from getter */
    public final AFd1gSDK getGetCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NotNull
    public final String getMediationNetwork() {
        String str = String.format(getMonetizationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFa1uSDK.getMonetizationNetwork().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NotNull
    public final String getCurrencyIso4217Code(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AFd1rSDK.getRevenue(str);
    }
}
