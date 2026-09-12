package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1qSDK implements AFc1oSDK {

    @NotNull
    private final Lazy getCurrencyIso4217Code;

    @NotNull
    private final AFc1hSDK<SharedPreferences> getRevenue;

    public AFc1qSDK(@NotNull AFc1hSDK<SharedPreferences> aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getRevenue = aFc1hSDK;
        this.getCurrencyIso4217Code = rn.l.b(new Function0<SharedPreferences>() { // from class: com.appsflyer.internal.AFc1qSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: m_, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                return (SharedPreferences) AFc1qSDK.this.getRevenue.getRevenue.invoke();
            }
        });
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void AFAdRevenueData(String str, String str2) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getCurrencyIso4217Code(String str, boolean z5) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putBoolean(str, z5).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final String getMonetizationNetwork(String str, String str2) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getString(str, str2);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, a3.e.l("Unexpected data type found for key ", str), e10, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getRevenue(String str, long j) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final boolean getMediationNetwork(String str, boolean z5) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getBoolean(str, z5);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, a3.e.l("Unexpected data type found for key ", str), e10, false, false, false, false, 120, null);
            return z5;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final long getCurrencyIso4217Code(String str, long j) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getLong(str, j);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, a3.e.l("Unexpected data type found for key ", str), e10, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getRevenue(String str, int i7) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putInt(str, i7).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final boolean getRevenue(String str) {
        return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final int getMediationNetwork(String str, int i7) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getInt(str, i7);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, a3.e.l("Unexpected data type found for key ", str), e10, false, false, false, false, 120, null);
            return i7;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getCurrencyIso4217Code(String str) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().remove(str).apply();
    }
}
