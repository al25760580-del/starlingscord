package com.discord.chat.presentation.message.view.botuikit.components;

import android.widget.Button;
import com.discord.chat.bridge.botuikit.ButtonComponent;
import com.discord.chat.bridge.botuikit.ButtonStyle;
import com.discord.misc.utilities.view.ButtonBackgroundUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\f\u0010\n\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\f\u0010\f\u001a\u00020\u0005*\u00020\u0006H\u0002¨\u0006\r"}, d2 = {"hasEmoji", "", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "hasIcon", "setThemedBackgroundColor", "", "Landroid/widget/Button;", ViewProps.COLOR, "", "setBrandColor", "setDangerColor", "setSuccessColor", "setSecondaryColor", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ButtonComponentViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasEmoji(ButtonComponent buttonComponent) {
        return buttonComponent.getEmoji() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasIcon(ButtonComponent buttonComponent) {
        return buttonComponent.getStyle() == ButtonStyle.LINK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBrandColor(Button button) {
        setThemedBackgroundColor(button, ThemeManagerKt.getTheme().getControlPrimaryBackgroundDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDangerColor(Button button) {
        setThemedBackgroundColor(button, ThemeManagerKt.getTheme().getControlCriticalPrimaryBackgroundDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSecondaryColor(Button button) {
        setThemedBackgroundColor(button, ThemeManagerKt.getTheme().getBackgroundModStrong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSuccessColor(Button button) {
        setThemedBackgroundColor(button, ThemeManagerKt.getTheme().getControlConnectedBackgroundDefault());
    }

    private static final void setThemedBackgroundColor(Button button, int i7) {
        ButtonBackgroundUtilsKt.setBackgroundColors(button, i7, Integer.valueOf(ColorUtilsKt.argbWithAdjustedAlpha(i7, 0.5f)));
    }
}
