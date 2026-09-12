package com.discord.chat.presentation.message.viewholder;

import android.content.Context;
import com.discord.chat.bridge.Message;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"getContentlessPreviewText", "", "context", "Landroid/content/Context;", "message", "Lcom/discord/chat/bridge/Message;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ThreadEmbedViewHolderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getContentlessPreviewText(Context context, Message message) {
        if (message.hasStickers()) {
            return I18nUtilsKt.i18nFormat$default(context, I18nMessage.REPLY_QUOTE_STICKER_MOBILE, null, 2, null);
        }
        if (message.hasCommand()) {
            return I18nUtilsKt.i18nFormat$default(context, I18nMessage.REPLY_QUOTE_COMMAND_MOBILE, null, 2, null);
        }
        if (message.isVoiceMessage()) {
            return I18nUtilsKt.i18nFormat$default(context, I18nMessage.REPLY_QUOTE_VOICE_MESSAGE_MOBILE, null, 2, null);
        }
        if (message.isComponentsV2()) {
            return I18nUtilsKt.i18nFormat$default(context, I18nMessage.REPLY_QUOTE_COMPONENTS_V2_MOBILE, null, 2, null);
        }
        if (message.hasAttachmentsOrEmbeds()) {
            return I18nUtilsKt.i18nFormat$default(context, I18nMessage.REPLY_QUOTE_NO_TEXT_CONTENT_MOBILE, null, 2, null);
        }
        return null;
    }
}
