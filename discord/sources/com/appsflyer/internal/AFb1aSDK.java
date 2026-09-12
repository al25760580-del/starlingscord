package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0003\u0010\nJ\u000f\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFb1aSDK;", "", "", "getCurrencyIso4217Code", "()Z", "Landroid/content/Context;", "p0", "Lcom/appsflyer/internal/AFb1aSDK$AFa1ySDK;", "p1", "", "(Landroid/content/Context;Lcom/appsflyer/internal/AFb1aSDK$AFa1ySDK;)V", "getMonetizationNetwork", "()V", "AFa1uSDK", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AFb1aSDK {

    /* JADX INFO: renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.getCurrencyIso4217Code;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1aSDK$AFa1uSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion getCurrencyIso4217Code = new Companion();
        private static long AFAdRevenueData = 500;

        private Companion() {
        }

        public static long getRevenue() {
            return AFAdRevenueData;
        }
    }

    public interface AFa1ySDK {
        void getMediationNetwork();

        void getMonetizationNetwork(@NotNull AFh1rSDK aFh1rSDK);
    }

    void getCurrencyIso4217Code(@NotNull Context p3, @NotNull AFa1ySDK p5);

    boolean getCurrencyIso4217Code();

    void getMonetizationNetwork();
}
