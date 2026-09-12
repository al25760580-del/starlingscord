package com.discord.theme;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Theme", "Lcom/discord/theme/DiscordThemeObject;", "getTheme", "()Lcom/discord/theme/DiscordThemeObject;", "EffectiveTheme", "getEffectiveTheme", "theme_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ThemeManagerKt {
    @NotNull
    public static final DiscordThemeObject getEffectiveTheme() {
        return ThemeManager.INSTANCE.getEffectiveTheme();
    }

    @NotNull
    public static final DiscordThemeObject getTheme() {
        return ThemeManager.INSTANCE.getTheme();
    }
}
