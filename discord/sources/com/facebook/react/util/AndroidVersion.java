package com.facebook.react.util;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/util/AndroidVersion;", "", "<init>", "()V", "VERSION_CODE_VANILLA_ICE_CREAM", "", "VERSION_CODE_BAKLAVA", "ATTR_WINDOW_OPT_OUT_EDGE_TO_EDGE_ENFORCEMENT", "isAtLeastTargetSdk35", "", "context", "Landroid/content/Context;", "isAtLeastTargetSdk35$ReactAndroid_release", "isAtLeastTargetSdk36", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidVersion {
    public static final int ATTR_WINDOW_OPT_OUT_EDGE_TO_EDGE_ENFORCEMENT = 16844442;

    @NotNull
    public static final AndroidVersion INSTANCE = new AndroidVersion();
    public static final int VERSION_CODE_BAKLAVA = 36;
    public static final int VERSION_CODE_VANILLA_ICE_CREAM = 35;

    private AndroidVersion() {
    }

    public static final boolean isAtLeastTargetSdk35$ReactAndroid_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Build.VERSION.SDK_INT >= 35 && context.getApplicationInfo().targetSdkVersion >= 35;
    }

    public static final boolean isAtLeastTargetSdk36(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Build.VERSION.SDK_INT >= 36 && context.getApplicationInfo().targetSdkVersion >= 36;
    }
}
