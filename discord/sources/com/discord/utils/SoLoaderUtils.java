package com.discord.utils;

import android.content.Context;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/utils/SoLoaderUtils;", "", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SoLoaderUtils {

    @NotNull
    public static final SoLoaderUtils INSTANCE = new SoLoaderUtils();

    private SoLoaderUtils() {
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OpenSourceMergedSoMapping openSourceMergedSoMapping = OpenSourceMergedSoMapping.INSTANCE;
        boolean z5 = SoLoader.f5363a;
        synchronized (SoLoader.class) {
            SoLoader.f5375o = openSourceMergedSoMapping;
        }
        SoLoader.init(context, 0);
    }
}
