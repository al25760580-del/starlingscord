package com.discord.device.utils;

import android.content.Context;
import android.os.Build;
import ib.a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.q;
import rn.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"PROPERTY_COMPAT_ALLOW_RESTRICTED_RESIZABILITY", "", "allowsRestrictedResizability", "", "Landroid/content/Context;", "device_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RestrictedResizabilityKt {

    @NotNull
    private static final String PROPERTY_COMPAT_ALLOW_RESTRICTED_RESIZABILITY = "android.window.PROPERTY_COMPAT_ALLOW_RESTRICTED_RESIZABILITY";

    public static final boolean allowsRestrictedResizability(@NotNull Context context) {
        Object objO;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        try {
            q qVar = Result.f14614e;
            objO = Boolean.valueOf(context.getPackageManager().getProperty(PROPERTY_COMPAT_ALLOW_RESTRICTED_RESIZABILITY, context.getPackageName()).getBoolean());
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = a.o(th2);
        }
        Object obj = Boolean.FALSE;
        if (objO instanceof r) {
            objO = obj;
        }
        return ((Boolean) objO).booleanValue();
    }
}
