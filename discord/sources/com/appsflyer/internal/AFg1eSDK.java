package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fJ1\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\fJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fR\u0014\u0010\u001a\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/appsflyer/internal/AFg1eSDK;", "Lcom/appsflyer/internal/AFh1ySDK;", "<init>", "()V", "Lcom/appsflyer/internal/AFg1cSDK;", "p0", "", "p1", "", "p2", "", "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "", "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "i", "Lcom/appsflyer/AFLogger$LogLevel;", "getMonetizationNetwork", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;)V", "getMediationNetwork", "(Lcom/appsflyer/AFLogger$LogLevel;)Z", "v", "w", "getShouldExtendMsg", "()Z", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFg1eSDK extends AFh1ySDK {

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            AFAdRevenueData = iArr;
        }
    }

    private static boolean getMediationNetwork(AFLogger.LogLevel p3) {
        return p3.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    private final void getMonetizationNetwork(AFLogger.LogLevel p3, AFg1cSDK p5, String p6, Throwable p10) {
        if (getMediationNetwork(p3)) {
            String revenue = getRevenue(p6, p5);
            int i7 = AFa1ySDK.AFAdRevenueData[p3.ordinal()];
            if (i7 == 1) {
                Log.d("AppsFlyer_6.17.3", revenue);
                return;
            }
            if (i7 == 2) {
                Log.i("AppsFlyer_6.17.3", revenue);
                return;
            }
            if (i7 == 3) {
                Log.w("AppsFlyer_6.17.3", revenue);
            } else if (i7 == 4) {
                Log.v("AppsFlyer_6.17.3", revenue);
            } else {
                if (i7 != 5) {
                    return;
                }
                Log.e("AppsFlyer_6.17.3", revenue, p10);
            }
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(@NotNull AFg1cSDK p3, @NotNull String p5, boolean p6) {
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p5, "");
        getMonetizationNetwork(AFLogger.LogLevel.DEBUG, p3, p5, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(@NotNull AFg1cSDK p3, @NotNull String p5, @NotNull Throwable p6, boolean p10, boolean p11, boolean p12, boolean p13) {
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        if (p11) {
            getMonetizationNetwork(AFLogger.LogLevel.ERROR, p3, p5, p6);
        } else if (p10) {
            getMonetizationNetwork(AFLogger.LogLevel.DEBUG, p3, p5, null);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(@NotNull AFg1cSDK p3, @NotNull String p5) {
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p5, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.17.3", withTag$SDK_prodRelease(p5, p3));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(@NotNull AFg1cSDK p3, @NotNull String p5, boolean p6) {
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p5, "");
        getMonetizationNetwork(AFLogger.LogLevel.INFO, p3, p5, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(@NotNull AFg1cSDK p3, @NotNull String p5, boolean p6) {
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p5, "");
        getMonetizationNetwork(AFLogger.LogLevel.VERBOSE, p3, p5, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(@NotNull AFg1cSDK p3, @NotNull String p5, boolean p6) {
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p5, "");
        getMonetizationNetwork(AFLogger.LogLevel.WARNING, p3, p5, null);
    }
}
