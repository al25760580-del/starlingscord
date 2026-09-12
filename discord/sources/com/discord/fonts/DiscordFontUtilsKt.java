package com.discord.fonts;

import android.content.Context;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"setDiscordFont", "", "Landroid/widget/TextView;", "font", "Lcom/discord/fonts/DiscordFont;", "fonts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DiscordFontUtilsKt {
    public static final void setDiscordFont(@NotNull TextView textView, @NotNull DiscordFont font) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(font, "font");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTypeface(font.typeface(context));
    }
}
