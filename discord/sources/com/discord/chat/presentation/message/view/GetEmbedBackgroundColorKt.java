package com.discord.chat.presentation.message.view;

import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"getEmbedBackgroundColor", "", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GetEmbedBackgroundColorKt {
    public static final int getEmbedBackgroundColor() {
        return ThemeManagerKt.getTheme().getColorRes(R.color.primary_130, R.color.primary_630);
    }
}
