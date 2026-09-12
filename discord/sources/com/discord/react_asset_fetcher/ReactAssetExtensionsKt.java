package com.discord.react_asset_fetcher;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"getUri", "", "Lcom/discord/react_asset_fetcher/ReactAsset;", "context", "Landroid/content/Context;", "react_asset_fetcher_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReactAssetExtensionsKt {
    @NotNull
    public static final String getUri(@NotNull ReactAsset reactAsset, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(reactAsset, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return ReactAssetCache.INSTANCE.get(context, reactAsset, ReactAssetOldNamesKt.getReactAssetOldNames().get(reactAsset));
    }
}
