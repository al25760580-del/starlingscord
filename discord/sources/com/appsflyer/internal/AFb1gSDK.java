package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1gSDK {

    @NotNull
    public final String getCurrencyIso4217Code;
    public final int getRevenue;

    public AFb1gSDK(int i7, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = i7;
        this.getCurrencyIso4217Code = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1gSDK)) {
            return false;
        }
        AFb1gSDK aFb1gSDK = (AFb1gSDK) obj;
        return this.getRevenue == aFb1gSDK.getRevenue && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFb1gSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode() + (Integer.hashCode(this.getRevenue) * 31);
    }

    @NotNull
    public final String toString() {
        return "AppSetIdModel(scope=" + this.getRevenue + ", id=" + this.getCurrencyIso4217Code + ")";
    }
}
