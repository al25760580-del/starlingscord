package com.discord.chat.presentation.message.view.botuikit.components;

import com.discord.misc.utilities.size.SizeUtilsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"THUMBNAIL_NORMAL_SIZE", "", "getTHUMBNAIL_NORMAL_SIZE", "()I", "THUMBNAIL_BIG_MODE_SIZE", "getTHUMBNAIL_BIG_MODE_SIZE", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ThumbnailDisplayComponentViewKt {
    private static final int THUMBNAIL_NORMAL_SIZE = SizeUtilsKt.getDpToPx(60);
    private static final int THUMBNAIL_BIG_MODE_SIZE = SizeUtilsKt.getDpToPx(85);

    public static final int getTHUMBNAIL_BIG_MODE_SIZE() {
        return THUMBNAIL_BIG_MODE_SIZE;
    }

    public static final int getTHUMBNAIL_NORMAL_SIZE() {
        return THUMBNAIL_NORMAL_SIZE;
    }
}
