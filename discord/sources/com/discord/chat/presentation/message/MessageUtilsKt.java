package com.discord.chat.presentation.message;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.TextView;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.rolecolors.RoleColorsKt;
import com.discord.react.FontManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"getChatTextSizeSp", "", "Landroid/content/Context;", "clearOrSetRoleColors", "", "Landroid/widget/TextView;", "message", "Lcom/discord/chat/bridge/Message;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MessageUtilsKt {
    public static final void clearOrSetRoleColors(@NotNull TextView textView, @NotNull Message message) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        RoleColors androidColors = RoleColorsKt.toAndroidColors(message.getRoleColors());
        if (!message.getShouldShowRoleDot() && message.getShouldShowRoleOnName()) {
            if ((androidColors != null ? androidColors.getSecondaryColor() : null) != null) {
                Integer[] elements = {Integer.valueOf(androidColors.getPrimaryColor()), androidColors.getSecondaryColor(), androidColors.getTertiaryColor()};
                Intrinsics.checkNotNullParameter(elements, "elements");
                textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 150.0f, 0.0f, CollectionsKt.h0(y.r(elements)), (float[]) null, Shader.TileMode.MIRROR));
                return;
            }
        }
        textView.getPaint().setShader(null);
    }

    public static final int getChatTextSizeSp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(context) ? 14 : 16;
    }
}
