package com.discord.chat.bridge.rolecolors;

import b1.c;
import com.discord.react.utilities.ReactColorToAndroidColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"ROLE_COLORS_PATTERN_WIDTH", "", "toAndroidColors", "Lcom/discord/chat/bridge/rolecolors/RoleColors;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoleColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleColors.kt\ncom/discord/chat/bridge/rolecolors/RoleColorsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
public final class RoleColorsKt {
    public static final float ROLE_COLORS_PATTERN_WIDTH = 150.0f;

    public static final RoleColors toAndroidColors(RoleColors roleColors) {
        if (roleColors == null) {
            return null;
        }
        int iE = c.e(ReactColorToAndroidColorKt.reactColorToAndroidColor(roleColors.getPrimaryColor()), 255);
        Integer secondaryColor = roleColors.getSecondaryColor();
        Integer numValueOf = secondaryColor != null ? Integer.valueOf(c.e(ReactColorToAndroidColorKt.reactColorToAndroidColor(secondaryColor.intValue()), 255)) : null;
        Integer tertiaryColor = roleColors.getTertiaryColor();
        return new RoleColors(iE, numValueOf, tertiaryColor != null ? Integer.valueOf(c.e(ReactColorToAndroidColorKt.reactColorToAndroidColor(tertiaryColor.intValue()), 255)) : null);
    }
}
