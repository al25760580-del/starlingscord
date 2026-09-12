package com.discord.chat.presentation.message.utils;

import android.widget.TextView;
import com.discord.chat.bridge.displaynamestyles.DisplayNameStyles;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/message/utils/DisplayNameStylesUtils;", "", "<init>", "()V", "DISPLAY_NAME_FONT_CHERRY_BOMB", "", "DISPLAY_NAME_FONT_CHICLE", "DISPLAY_NAME_FONT_MUSEO_MODERNO", "DISPLAY_NAME_FONT_NEO_CASTEL", "DISPLAY_NAME_FONT_PIXELIFY", "DISPLAY_NAME_FONT_SINISTRE", "DISPLAY_NAME_FONT_ZILLA_SLAB", "DISPLAY_NAME_FONT_PLAYPEN_SANS", "DISPLAY_NAME_FONT_ORBITRON", "DISPLAY_NAME_FONT_NEW_ROCKER", "DISPLAY_NAME_FONT_KALAM", "getDisplayNameFont", "Lcom/discord/fonts/DiscordFont;", "fontId", "applyDisplayNameStyles", "", "Landroid/widget/TextView;", "displayNameStyles", "Lcom/discord/chat/bridge/displaynamestyles/DisplayNameStyles;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DisplayNameStylesUtils {
    private static final int DISPLAY_NAME_FONT_CHERRY_BOMB = 3;
    private static final int DISPLAY_NAME_FONT_CHICLE = 4;
    private static final int DISPLAY_NAME_FONT_KALAM = 16;
    private static final int DISPLAY_NAME_FONT_MUSEO_MODERNO = 6;
    private static final int DISPLAY_NAME_FONT_NEO_CASTEL = 7;
    private static final int DISPLAY_NAME_FONT_NEW_ROCKER = 15;
    private static final int DISPLAY_NAME_FONT_ORBITRON = 14;
    private static final int DISPLAY_NAME_FONT_PIXELIFY = 8;
    private static final int DISPLAY_NAME_FONT_PLAYPEN_SANS = 13;
    private static final int DISPLAY_NAME_FONT_SINISTRE = 10;
    private static final int DISPLAY_NAME_FONT_ZILLA_SLAB = 12;

    @NotNull
    public static final DisplayNameStylesUtils INSTANCE = new DisplayNameStylesUtils();

    private DisplayNameStylesUtils() {
    }

    public final void applyDisplayNameStyles(@NotNull TextView textView, DisplayNameStyles displayNameStyles) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (displayNameStyles == null) {
            DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        } else {
            DiscordFontUtilsKt.setDiscordFont(textView, getDisplayNameFont(displayNameStyles.getFontId()));
        }
    }

    @NotNull
    public final DiscordFont getDisplayNameFont(int fontId) {
        switch (fontId) {
            case 3:
                return DiscordFont.CherryBombOneNormal;
            case 4:
                return DiscordFont.ChicleNormal;
            case 5:
            case 9:
            case 11:
            default:
                return DiscordFont.PrimarySemibold;
            case 6:
                return DiscordFont.MuseoModernoMedium;
            case 7:
                return DiscordFont.NeoCastelNormal;
            case 8:
                return DiscordFont.PixelifySansNormal;
            case 10:
                return DiscordFont.SinistreNormal;
            case 12:
                return DiscordFont.ZillaSlabSemibold;
            case 13:
                return DiscordFont.PlaypenSansBold;
            case 14:
                return DiscordFont.OrbitronBold;
            case 15:
                return DiscordFont.NewRockerRegular;
            case 16:
                return DiscordFont.KalamBold;
        }
    }
}
