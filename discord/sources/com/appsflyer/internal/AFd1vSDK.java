package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1vSDK implements AFd1wSDK {

    @NotNull
    private final AFd1zSDK getRevenue;

    public AFd1vSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getRevenue = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void getRevenue(@NotNull byte[] bArr, Map<String, String> map, int i7) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1qSDK(bArr, map, 2000).getRevenue()) {
            this.getRevenue.getCurrencyIso4217Code();
        }
    }
}
