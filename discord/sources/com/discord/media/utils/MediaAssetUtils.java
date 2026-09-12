package com.discord.media.utils;

import android.webkit.URLUtil;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¨\u0006\b"}, d2 = {"Lcom/discord/media/utils/MediaAssetUtils;", "", "<init>", "()V", "guessFileName", "", "uri", "contentType", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaAssetUtils {

    @NotNull
    public static final MediaAssetUtils INSTANCE = new MediaAssetUtils();

    private MediaAssetUtils() {
    }

    @NotNull
    public final String guessFileName(@NotNull String uri, String contentType) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String strGuessFileName = URLUtil.guessFileName("https://fake-website.com/" + ((String) CollectionsKt.Q(StringsKt__StringsKt.split$default(uri, new String[]{"/"}, false, 0, 6, null))), null, contentType);
        Intrinsics.checkNotNullExpressionValue(strGuessFileName, "guessFileName(...)");
        return strGuessFileName;
    }
}
