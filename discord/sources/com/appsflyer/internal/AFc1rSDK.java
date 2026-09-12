package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.i0;
import kotlin.collections.w0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFileCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n1855#2,2:329\n1855#2,2:332\n1855#2:334\n1856#2:337\n1855#2,2:339\n1855#2:341\n1856#2:344\n6442#3:331\n13579#3,2:342\n18#4:335\n26#5:336\n1#6:338\n*S KotlinDebug\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n*L\n105#1:329,2\n182#1:332,2\n200#1:334\n200#1:337\n256#1:339,2\n289#1:341\n289#1:344\n180#1:331\n292#1:342,2\n206#1:335\n206#1:336\n*E\n"})
public final class AFc1rSDK implements AFc1uSDK {

    @NotNull
    private final AFc1sSDK AFAdRevenueData;

    @NotNull
    private final AFc1oSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1gSDK getMediationNetwork;

    @NotNull
    private final Map<String, Integer> getRevenue;

    public AFc1rSDK(@NotNull AFc1gSDK aFc1gSDK, @NotNull AFc1oSDK aFc1oSDK) {
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        this.getMediationNetwork = aFc1gSDK;
        this.getCurrencyIso4217Code = aFc1oSDK;
        this.AFAdRevenueData = new AFc1sSDK(d0.g(new AFc1vSDK("ConversionsCache", c0.c(AFe1mSDK.CONVERSION), 1), new AFc1vSDK("AttrCache", c0.c(AFe1mSDK.ATTR), 1), new AFc1vSDK("OtherCache", d0.g(AFe1mSDK.LAUNCH, AFe1mSDK.INAPP, AFe1mSDK.ADREVENUE, AFe1mSDK.ARS_VALIDATE, AFe1mSDK.PURCHASE_VALIDATE, AFe1mSDK.MANUAL_PURCHASE_VALIDATION, AFe1mSDK.SDK_SERVICES), 40)));
        this.getRevenue = w0.h(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
    }

    private final void AFAdRevenueData() {
        for (AFc1vSDK aFc1vSDK : this.AFAdRevenueData.getCurrencyIso4217Code) {
            String str = aFc1vSDK.getCurrencyIso4217Code;
            Context context = this.getMediationNetwork.getRevenue;
            Intrinsics.checkNotNull(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getRevenue;
                String str2 = aFc1vSDK.getCurrencyIso4217Code;
                File[] fileArrListFiles = file.listFiles();
                map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            } else {
                file.mkdirs();
                this.getRevenue.put(aFc1vSDK.getCurrencyIso4217Code, 0);
            }
        }
    }

    private final boolean getMonetizationNetwork(File file) {
        try {
            file.delete();
            AFAdRevenueData();
            return true;
        } catch (Exception e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, s0.g.e("Could not delete ", file.getName(), " from cache"), e10, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void getCurrencyIso4217Code() {
        try {
            if (this.getCurrencyIso4217Code.getMediationNetwork("AF_CACHE_VERSION", -1) == 1) {
                Context context = this.getMediationNetwork.getRevenue;
                Intrinsics.checkNotNull(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.getMediationNetwork.getRevenue;
                    Intrinsics.checkNotNull(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.getCurrencyIso4217Code.getRevenue("AF_CACHE_VERSION", 1);
                Context context3 = this.getMediationNetwork.getRevenue;
                Intrinsics.checkNotNull(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.getMediationNetwork.getRevenue;
                    Intrinsics.checkNotNull(context4);
                    co.o.g(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.getMediationNetwork.getRevenue;
                    Intrinsics.checkNotNull(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            AFAdRevenueData();
        } catch (Exception e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e10, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    @NotNull
    public final List<AFc1tSDK> getMediationNetwork() {
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            Context context = this.getMediationNetwork.getRevenue;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.getMediationNetwork.getRevenue;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.AFAdRevenueData.getCurrencyIso4217Code.iterator();
            while (it.hasNext()) {
                String str = ((AFc1vSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.getMediationNetwork.getRevenue;
                Intrinsics.checkNotNull(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                i0.q(arrayList2, fileArrListFiles);
            }
            for (File file2 : arrayList2) {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1tSDK aFc1tSDKAFAdRevenueData = AFAdRevenueData(file2);
                if (aFc1tSDKAFAdRevenueData != null) {
                    arrayList.add(aFc1tSDKAFAdRevenueData);
                }
            }
        } catch (Exception e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e10, false, false, false, false, 120, null);
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, s0.g.d(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void getMonetizationNetwork() {
        try {
            Context context = this.getMediationNetwork.getRevenue;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.getMediationNetwork.getRevenue;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.AFAdRevenueData.getCurrencyIso4217Code.iterator();
            while (it.hasNext()) {
                String str = ((AFc1vSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.getMediationNetwork.getRevenue;
                Intrinsics.checkNotNull(context3);
                File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (fileArrListFiles != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.getMediationNetwork.getRevenue;
            Intrinsics.checkNotNull(context4);
            co.o.g(new File(context4.getFilesDir(), "AFRequestCache"));
            AFAdRevenueData();
        } catch (Exception e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e10, false, false, false, false, 120, null);
        }
    }

    private static AFc1tSDK AFAdRevenueData(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1tSDK aFc1tSDK = new AFc1tSDK(cArr);
                aFc1tSDK.getMediationNetwork = file.getName();
                inputStreamReader.close();
                return aFc1tSDK;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ls.d.k(inputStreamReader, th2);
                    throw th3;
                }
            }
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e10, false, false, true, false);
            return null;
        }
    }

    private final String getCurrencyIso4217Code(AFe1mSDK aFe1mSDK) {
        String str;
        AFc1vSDK monetizationNetwork = getMonetizationNetwork(aFe1mSDK);
        if (monetizationNetwork == null || (str = monetizationNetwork.getCurrencyIso4217Code) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final boolean getCurrencyIso4217Code(String str) {
        if (str == null) {
            return false;
        }
        Context context = this.getMediationNetwork.getRevenue;
        Intrinsics.checkNotNull(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.getMediationNetwork.getRevenue;
            Intrinsics.checkNotNull(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, s0.g.e("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.AFAdRevenueData.getCurrencyIso4217Code.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1vSDK) it.next()).getCurrencyIso4217Code;
            Context context3 = this.getMediationNetwork.getRevenue;
            Intrinsics.checkNotNull(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return getMonetizationNetwork(file);
            }
        }
        return true;
    }

    private final AFc1vSDK getMonetizationNetwork(AFe1mSDK aFe1mSDK) {
        Object next;
        Iterator<T> it = this.AFAdRevenueData.getCurrencyIso4217Code.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AFc1vSDK) next).AFAdRevenueData.contains(aFe1mSDK)) {
                return (AFc1vSDK) next;
            }
        }
        next = null;
        return (AFc1vSDK) next;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final String getMonetizationNetwork(@NotNull AFc1tSDK aFc1tSDK) {
        Exception exc;
        File file;
        String str;
        List listE;
        List<File> listF0;
        Intrinsics.checkNotNullParameter(aFc1tSDK, "");
        try {
            AFe1mSDK aFe1mSDK = aFc1tSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(aFe1mSDK, "");
            Context context = this.getMediationNetwork.getRevenue;
            Intrinsics.checkNotNull(context);
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), getCurrencyIso4217Code(aFe1mSDK));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Caching request with URL: " + aFc1tSDK.getCurrencyIso4217Code, false, 4, null);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, strValueOf);
            try {
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFc1tSDK.getRevenue);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFc1tSDK.getCurrencyIso4217Code);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFc1tSDK.getMonetizationNetwork(), 2));
                    outputStreamWriter.write(10);
                    AFe1mSDK aFe1mSDK2 = aFc1tSDK.AFAdRevenueData;
                    outputStreamWriter.write("type=");
                    outputStreamWriter.write(aFe1mSDK2.name());
                    outputStreamWriter.write(10);
                    outputStreamWriter.flush();
                    Unit unit = Unit.f14616a;
                    outputStreamWriter.close();
                    AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache request: done, cacheKey: " + strValueOf, false, 4, null);
                    AFe1mSDK aFe1mSDK3 = aFc1tSDK.AFAdRevenueData;
                    Intrinsics.checkNotNullExpressionValue(aFe1mSDK3, "");
                    AFc1vSDK monetizationNetwork = getMonetizationNetwork(aFe1mSDK3);
                    Integer numValueOf = monetizationNetwork != null ? Integer.valueOf(monetizationNetwork.getMediationNetwork) : null;
                    if (numValueOf == null) {
                        return strValueOf;
                    }
                    int iIntValue = numValueOf.intValue();
                    Map<String, Integer> map = this.getRevenue;
                    AFc1vSDK monetizationNetwork2 = getMonetizationNetwork(aFe1mSDK3);
                    if (monetizationNetwork2 != null && (str = monetizationNetwork2.getCurrencyIso4217Code) != null) {
                        Integer num = map.get(str);
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        if (iIntValue2 >= iIntValue) {
                            int i7 = (iIntValue2 + 1) - iIntValue;
                            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache overflown for type " + aFe1mSDK3 + ", removing " + i7 + " item(s)", false, 4, null);
                            Context context2 = this.getMediationNetwork.getRevenue;
                            Intrinsics.checkNotNull(context2);
                            File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), getCurrencyIso4217Code(aFe1mSDK3));
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                            File[] fileArrListFiles = file3.listFiles();
                            if (fileArrListFiles != null && (listE = y.E(fileArrListFiles, new Comparator() { // from class: com.appsflyer.internal.AFc1rSDK.1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t5, T t10) {
                                    return tn.a.a(((File) t5).getName(), ((File) t10).getName());
                                }
                            })) != null && (listF0 = CollectionsKt.f0(listE, i7)) != null) {
                                for (File file4 : listF0) {
                                    file4.delete();
                                    AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                                }
                            }
                        }
                        AFAdRevenueData();
                        return strValueOf;
                    }
                    throw new UnsupportedOperationException("Cache do not support this type of events");
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(outputStreamWriter, th2);
                        throw th3;
                    }
                }
            } catch (Exception e10) {
                exc = e10;
                if (file != null) {
                    file.delete();
                }
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                return null;
            }
        } catch (Exception e11) {
            exc = e11;
            file = null;
        }
    }
}
