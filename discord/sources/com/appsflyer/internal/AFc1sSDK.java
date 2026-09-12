package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1sSDK {

    @NotNull
    final List<AFc1vSDK> getCurrencyIso4217Code;

    public AFc1sSDK(@NotNull List<AFc1vSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.getCurrencyIso4217Code = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1sSDK) && Intrinsics.areEqual(this.getCurrencyIso4217Code, ((AFc1sSDK) obj).getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode();
    }

    @NotNull
    public final String toString() {
        return "StorageConfig(typeEntries=" + this.getCurrencyIso4217Code + ")";
    }
}
