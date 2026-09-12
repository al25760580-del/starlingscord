package com.discord.client_info;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"getFirstInstallTimeMillis", "", "Landroid/content/Context;", "client_info_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GetFirstInstallTimeMillisKt {
    public static final long getFirstInstallTimeMillis(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0)).firstInstallTime;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }
}
