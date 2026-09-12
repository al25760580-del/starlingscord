package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.discord.intents.BuildConfig;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMetaReferrer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetaReferrer.kt\ncom/appsflyer/internal/referrer/MetaReferrer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
public final class AFj1wSDK extends AFi1aSDK {

    @NotNull
    private final AFj1xSDK component2;

    @NotNull
    private final Runnable component3;

    @NotNull
    private final AFc1pSDK getMediationNetwork;

    @NotNull
    private final ExecutorService getRevenue;
    private String toString;

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFj1xSDK.values().length];
            try {
                iArr[AFj1xSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1xSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1xSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1wSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull ExecutorService executorService, @NotNull AFj1xSDK aFj1xSDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        String str;
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1xSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i7 = AFj1tSDK.AFa1zSDK.AFAdRevenueData[aFj1xSDK.ordinal()];
        if (i7 == 1) {
            str = "facebook";
        } else if (i7 == 2) {
            str = "instagram";
        } else {
            if (i7 != 3) {
                throw new rn.n();
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1pSDK, runnable);
        this.getMediationNetwork = aFc1pSDK;
        this.getRevenue = executorService;
        this.component2 = aFj1xSDK;
        this.component3 = runnable2;
    }

    private final boolean AFAdRevenueData(Context context) {
        int i7 = AFa1vSDK.getRevenue[this.component2.ordinal()];
        if (i7 == 1) {
            return getRevenue(context);
        }
        if (i7 == 2) {
            return getMediationNetwork(context);
        }
        if (i7 == 3) {
            return component2(context);
        }
        throw new rn.n();
    }

    private static boolean component2(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d A[PHI: r0
      0x008d: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:14:0x003c, B:23:0x0063, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean getMonetizationNetwork(Context context) {
        String str;
        if (!getMediationNetwork()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String monetizationNetwork = this.getMediationNetwork.getMonetizationNetwork("com.facebook.sdk.ApplicationId");
        String strN = monetizationNetwork != null ? StringsKt.N(monetizationNetwork, "fb") : null;
        if (strN == null || strN.length() == 0) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            strN = null;
        }
        if (strN == null) {
            String mediationNetwork = this.getMediationNetwork.getMediationNetwork("facebook_application_id");
            strN = mediationNetwork != null ? StringsKt.N(mediationNetwork, "fb") : null;
            if (strN == null || strN.length() == 0) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                strN = null;
            }
            if (strN == null) {
                String monetizationNetwork2 = this.getMediationNetwork.getMonetizationNetwork("com.appsflyer.FacebookApplicationId");
                strN = monetizationNetwork2 != null ? StringsKt.N(monetizationNetwork2, "fb") : null;
                if (strN == null || strN.length() == 0) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    strN = null;
                }
                str = strN != null ? strN : null;
            }
        }
        this.toString = str;
        if (str == null) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (AFAdRevenueData(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    @SuppressLint({"NewApi"})
    public final void getCurrencyIso4217Code(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getMonetizationNetwork(context)) {
            this.getRevenue.execute(new h(4, this, context));
        } else {
            this.component3.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:72:0x0228 A[PHI: r25
      0x0228: PHI (r25v2 android.content.ContentProviderClient) = 
      (r25v1 android.content.ContentProviderClient)
      (r25v3 android.content.ContentProviderClient)
      (r25v3 android.content.ContentProviderClient)
     binds: [B:83:0x026f, B:71:0x0226, B:76:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x023a  */
    /* JADX WARN: Code duplicated, block: B:82:0x026c  */
    public static final void getCurrencyIso4217Code(AFj1wSDK aFj1wSDK, Context context) {
        String str;
        Throwable th2;
        Cursor cursor;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Uri uri;
        String string;
        String str2;
        Intrinsics.checkNotNullParameter(aFj1wSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1wSDK.component1 = System.currentTimeMillis();
        aFj1wSDK.areAllFieldsValid = AFj1qSDK.AFa1vSDK.STARTED;
        aFj1wSDK.addObserver(new AFj1qSDK.AnonymousClass1());
        String str3 = aFj1wSDK.toString;
        Intrinsics.checkNotNull(str3);
        try {
            AFj1xSDK aFj1xSDK = aFj1wSDK.component2;
            int[] iArr = AFa1vSDK.getRevenue;
            int i7 = iArr[aFj1xSDK.ordinal()];
            str = "Error while collecting Meta Install Referrer for ";
            try {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (component2(context)) {
                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                                uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str3);
                            } else {
                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                                uri = null;
                            }
                        } else {
                            throw new rn.n();
                        }
                    } else if (getMediationNetwork(context)) {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                        uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str3);
                    } else {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                        uri = null;
                    }
                } else if (getRevenue(context)) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                    uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str3);
                } else {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                    uri = null;
                }
                if (uri != null) {
                    contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                                    if (columnIndex != -1) {
                                        string = cursorQuery.getString(columnIndex);
                                    } else {
                                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1wSDK.component2 + " provider", false, 4, null);
                                        string = null;
                                    }
                                    if (string != null) {
                                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1wSDK.component2 + " attribution data.", false, 4, null);
                                        Map<String, Object> map = aFj1wSDK.AFAdRevenueData;
                                        Intrinsics.checkNotNullExpressionValue(map, "");
                                        map.put("response", "OK");
                                        Map<String, Object> map2 = aFj1wSDK.AFAdRevenueData;
                                        Intrinsics.checkNotNullExpressionValue(map2, "");
                                        map2.put("referrer", string);
                                        int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                        Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                        if (lValueOf != null) {
                                            aFj1wSDK.AFAdRevenueData.put("click_ts", Long.valueOf(lValueOf.longValue()));
                                        }
                                        int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                                        Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                        if (numValueOf != null) {
                                            aFj1wSDK.AFAdRevenueData.put("meta_custom", w0.h(new Pair("is_ct", Integer.valueOf(numValueOf.intValue()))));
                                        }
                                        int i10 = iArr[aFj1wSDK.component2.ordinal()];
                                        if (i10 == 1) {
                                            str2 = "com.facebook.katana";
                                        } else if (i10 == 2) {
                                            str2 = BuildConfig.PACKAGE_INSTAGRAM;
                                        } else if (i10 == 3) {
                                            str2 = "com.facebook.lite";
                                        } else {
                                            throw new rn.n();
                                        }
                                        Map<String, Object> map3 = aFj1wSDK.AFAdRevenueData;
                                        Intrinsics.checkNotNullExpressionValue(map3, "");
                                        map3.put("api_ver", Long.valueOf(AFj1iSDK.getCurrencyIso4217Code(context, str2)));
                                        Map<String, Object> map4 = aFj1wSDK.AFAdRevenueData;
                                        Intrinsics.checkNotNullExpressionValue(map4, "");
                                        map4.put("api_ver_name", AFj1iSDK.getRevenue(context, str2));
                                    }
                                    cursorQuery.close();
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                } else {
                                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                cursor = cursorQuery;
                                try {
                                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1wSDK.component2.name() + " provider", th2, false, false, false, false, 120, null);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                } catch (Throwable th4) {
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                    throw th4;
                                }
                            }
                        } else {
                            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                contentProviderClientAcquireUnstableContentProviderClient.close();
                            }
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        cursor = null;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                th2 = th;
                cursor = null;
                contentProviderClientAcquireUnstableContentProviderClient = null;
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1wSDK.component2.name() + " provider", th2, false, false, false, false, 120, null);
                if (cursor != null) {
                    cursor.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                aFj1wSDK.getMonetizationNetwork();
                aFj1wSDK.component3.run();
            }
        } catch (Throwable th7) {
            th = th7;
            str = "Error while collecting Meta Install Referrer for ";
        }
        aFj1wSDK.getMonetizationNetwork();
        aFj1wSDK.component3.run();
    }
}
