package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nExceptionManageCacheImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n11653#2,9:131\n13579#2:140\n11653#2,9:141\n13579#2:150\n13580#2:152\n11662#2:153\n13580#2:155\n11662#2:156\n4117#2:158\n4217#2,2:159\n4117#2:165\n4217#2,2:166\n1#3:151\n1#3:154\n1#3:157\n1549#4:161\n1620#4,3:162\n1549#4:168\n1620#4,3:169\n*S KotlinDebug\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n*L\n69#1:131,9\n69#1:140\n71#1:141,9\n71#1:150\n71#1:152\n71#1:153\n69#1:155\n69#1:156\n101#1:158\n101#1:159,2\n119#1:165\n119#1:166,2\n71#1:151\n69#1:154\n101#1:161\n101#1:162,3\n120#1:168\n120#1:169,3\n*E\n"})
public final class AFd1uSDK implements AFd1zSDK {

    @NotNull
    private final AFc1gSDK getCurrencyIso4217Code;

    public AFd1uSDK(@NotNull AFc1gSDK aFc1gSDK) {
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        this.getCurrencyIso4217Code = aFc1gSDK;
    }

    private final File getMonetizationNetwork() {
        Context context = this.getCurrencyIso4217Code.getRevenue;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final int AFAdRevenueData() {
        Iterator<T> it = getMediationNetwork().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((AFc1cSDK) it.next()).getMonetizationNetwork;
        }
        return i7;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final boolean getCurrencyIso4217Code() {
        return getCurrencyIso4217Code(new String[0]);
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NotNull
    public final List<AFc1cSDK> getMediationNetwork() {
        List<AFc1cSDK> listM;
        File[] fileArrListFiles;
        ArrayList arrayList;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                listM = null;
                if (monetizationNetwork != null && (fileArrListFiles = monetizationNetwork.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            File[] fileArrListFiles2 = file.listFiles();
                            if (fileArrListFiles2 != null) {
                                Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "");
                                arrayList = new ArrayList();
                                for (File file2 : fileArrListFiles2) {
                                    AFc1cSDK.Companion companion = AFc1cSDK.INSTANCE;
                                    Intrinsics.checkNotNullExpressionValue(file2, "");
                                    AFc1cSDK currencyIso4217Code = AFc1cSDK.Companion.getCurrencyIso4217Code(co.m.c(file2));
                                    if (currencyIso4217Code != null) {
                                        arrayList.add(currencyIso4217Code);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                        } catch (Throwable th2) {
                            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th2.getMessage(), false, 4, null);
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listM = e0.m(arrayList2);
                }
                if (listM == null) {
                    listM = n0.f14659d;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return listM;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final String getRevenue(@NotNull Throwable th2, @NotNull String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File monetizationNetwork = getMonetizationNetwork();
            str2 = null;
            if (monetizationNetwork != null) {
                file = new File(monetizationNetwork, "6.17.3");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1cSDK aFc1cSDKAFAdRevenueData = AFd1pSDK.AFAdRevenueData(th2, str);
                    String str3 = aFc1cSDKAFAdRevenueData.getCurrencyIso4217Code;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1cSDK.Companion companion = AFc1cSDK.INSTANCE;
                        AFc1cSDK currencyIso4217Code = AFc1cSDK.Companion.getCurrencyIso4217Code(co.m.c(file2));
                        if (currencyIso4217Code != null) {
                            currencyIso4217Code.getMonetizationNetwork++;
                            aFc1cSDKAFAdRevenueData = currencyIso4217Code;
                        }
                    }
                    co.m.d(file2, aFc1cSDKAFAdRevenueData.getMediationNetwork());
                    str2 = str3;
                } catch (Exception e10) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e10.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final boolean getCurrencyIso4217Code(@NotNull String... strArr) {
        boolean zG;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                zG = true;
                if (monetizationNetwork != null) {
                    if (strArr.length == 0) {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zG = co.o.g(monetizationNetwork);
                    } else {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + y.A(strArr, ", ", null, null, null, 62), false, 4, null);
                        File[] fileArrListFiles = monetizationNetwork.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!y.p(file.getName(), strArr)) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(co.o.g(file2)));
                            }
                            Set setL0 = CollectionsKt.l0(arrayList2);
                            if (setL0.isEmpty()) {
                                setL0 = d1.b(Boolean.TRUE);
                            }
                            Set set = setL0;
                            if (set.size() != 1 || !((Boolean) CollectionsKt.J(set)).booleanValue()) {
                                zG = false;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zG;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final void getMediationNetwork(int i7, int i10) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                if (monetizationNetwork != null && (fileArrListFiles = monetizationNetwork.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int mediationNetwork = AFk1zSDK.getMediationNetwork(name);
                        if (i7 > mediationNetwork || mediationNetwork > i10) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(co.o.g(file2)));
                    }
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
