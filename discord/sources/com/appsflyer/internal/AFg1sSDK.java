package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFg1sSDK {

    public static final class AFa1uSDK {
        final String AFAdRevenueData;
        final float getRevenue;

        public AFa1uSDK(float f2, String str) {
            this.getRevenue = f2;
            this.AFAdRevenueData = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Float.compare(this.getRevenue, aFa1uSDK.getRevenue) == 0 && Intrinsics.areEqual(this.AFAdRevenueData, aFa1uSDK.AFAdRevenueData);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.getRevenue) * 31;
            String str = this.AFAdRevenueData;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BatteryData(level=" + this.getRevenue + ", charging=" + this.AFAdRevenueData + ")";
        }
    }

    @NotNull
    AFa1uSDK AFAdRevenueData(@NotNull Context context);
}
