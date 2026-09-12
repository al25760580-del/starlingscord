package com.discord.chrome_custom_tabs;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\t\u001a\u0004\u0018\u00010\u0005*\u00020\nJ\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f*\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/chrome_custom_tabs/CustomTabsPackages;", "", "<init>", "()V", "CHROME_PROD_PACKAGE", "", "CHROME_BETA_PACKAGE", "CHROME_DEV_PACKAGE", "CHROME_LOCAL_PACKAGE", "getCustomTabsDefaultPackage", "Landroid/content/Context;", "getCustomTabsPackages", "", "getDefaultViewIntentHandler", "Landroid/content/Intent;", "chrome_custom_tabs_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCustomTabsPackages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomTabsPackages.kt\ncom/discord/chrome_custom_tabs/CustomTabsPackages\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n295#2,2:75\n295#2,2:77\n295#2,2:79\n295#2,2:81\n1617#2,9:83\n1869#2:92\n1870#2:94\n1626#2:95\n1#3:93\n*S KotlinDebug\n*F\n+ 1 CustomTabsPackages.kt\ncom/discord/chrome_custom_tabs/CustomTabsPackages\n*L\n22#1:75,2\n23#1:77,2\n24#1:79,2\n25#1:81,2\n44#1:83,9\n44#1:92\n44#1:94\n44#1:95\n44#1:93\n*E\n"})
public final class CustomTabsPackages {

    @NotNull
    private static final String CHROME_BETA_PACKAGE = "com.chrome.beta";

    @NotNull
    private static final String CHROME_DEV_PACKAGE = "com.chrome.dev";

    @NotNull
    private static final String CHROME_LOCAL_PACKAGE = "com.google.android.apps.chrome";

    @NotNull
    private static final String CHROME_PROD_PACKAGE = "com.android.chrome";

    @NotNull
    public static final CustomTabsPackages INSTANCE = new CustomTabsPackages();

    private CustomTabsPackages() {
    }

    private final List<String> getCustomTabsPackages(Context context) {
        ServiceInfo serviceInfo;
        Intent defaultViewIntentHandler = getDefaultViewIntentHandler();
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentActivities(defaultViewIntentHandler, PackageManager.ResolveInfoFlags.of(0)) : context.getPackageManager().queryIntentActivities(defaultViewIntentHandler, 0);
        Intrinsics.checkNotNull(listQueryIntentActivities);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            Intent intent = new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(((ResolveInfo) it.next()).activityInfo.packageName);
            Intrinsics.checkNotNullExpressionValue(intent, "setPackage(...)");
            ResolveInfo resolveInfoResolveService = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().resolveService(intent, PackageManager.ResolveInfoFlags.of(0)) : context.getPackageManager().resolveService(intent, 0);
            String str = (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) ? null : serviceInfo.packageName;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private final Intent getDefaultViewIntentHandler() {
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        return data;
    }

    public final String getCustomTabsDefaultPackage(@NotNull Context context) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Intrinsics.checkNotNullParameter(context, "<this>");
        List<String> customTabsPackages = getCustomTabsPackages(context);
        Iterator<T> it = customTabsPackages.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual((String) next, CHROME_PROD_PACKAGE));
        String str = (String) next;
        if (str == null) {
            Iterator<T> it2 = customTabsPackages.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!Intrinsics.areEqual((String) next2, CHROME_BETA_PACKAGE));
            str = (String) next2;
            if (str == null) {
                Iterator<T> it3 = customTabsPackages.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!Intrinsics.areEqual((String) next3, CHROME_DEV_PACKAGE));
                str = (String) next3;
                if (str == null) {
                    for (Object obj2 : customTabsPackages) {
                        if (Intrinsics.areEqual((String) obj2, CHROME_LOCAL_PACKAGE)) {
                            obj = obj2;
                            break;
                        }
                    }
                    String str2 = (String) obj;
                    return str2 == null ? (String) CollectionsKt.firstOrNull(customTabsPackages) : str2;
                }
            }
        }
        return str;
    }
}
