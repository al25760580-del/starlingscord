package com.discord.chat.presentation.root;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.SwipeActionsType;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.theme.DiscordTheme;
import com.discord.theme.DiscordThemeObject;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getMessageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "Lcom/discord/chat/bridge/row/MessageRow;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageContext.kt\ncom/discord/chat/presentation/root/MessageContextKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public final class MessageContextKt {
    @NotNull
    public static final MessageContext getMessageContext(@NotNull MessageRow messageRow) {
        DiscordThemeObject theme;
        DiscordTheme discordThemeFromThemeName;
        Intrinsics.checkNotNullParameter(messageRow, "<this>");
        Boolean canAddNewReactions = messageRow.getCanAddNewReactions();
        Boolean bool = Boolean.TRUE;
        boolean zAreEqual = Intrinsics.areEqual(canAddNewReactions, bool);
        String addNewReactionAccessibilityLabel = messageRow.getAddNewReactionAccessibilityLabel();
        if (addNewReactionAccessibilityLabel == null) {
            addNewReactionAccessibilityLabel = "";
        }
        String str = addNewReactionAccessibilityLabel;
        ReactionsTheme reactionsTheme = messageRow.getReactionsTheme();
        boolean z5 = (messageRow.getMessage() instanceof Message) && Intrinsics.areEqual(((Message) messageRow.getMessage()).getUsingGradientTheme(), bool);
        Truncation truncation = messageRow.getTruncation();
        boolean z6 = (messageRow.getMessage() instanceof Message) && Intrinsics.areEqual(((Message) messageRow.getMessage()).getUseAttachmentGridLayout(), bool);
        boolean z7 = (messageRow.getMessage() instanceof Message) && Intrinsics.areEqual(((Message) messageRow.getMessage()).getUseAttachmentUploadPreview(), bool);
        boolean z10 = messageRow.getSwipeActions() == SwipeActionsType.REPLY || messageRow.getSwipeActions() == SwipeActionsType.REPLY_EDIT;
        boolean z11 = messageRow.getSwipeActions() == SwipeActionsType.REPLY_EDIT;
        MessageContextType contextType = messageRow.getContextType();
        if (contextType == null) {
            contextType = MessageContextType.DEFAULT;
        }
        MessageContextType messageContextType = contextType;
        String forcedTheme = messageRow.getForcedTheme();
        if (forcedTheme == null || (discordThemeFromThemeName = DiscordTheme.INSTANCE.fromThemeName(forcedTheme)) == null || (theme = ThemeManager.INSTANCE.getTheme(discordThemeFromThemeName)) == null) {
            theme = ThemeManagerKt.getTheme();
        }
        return new MessageContext(false, zAreEqual, str, reactionsTheme, z5, truncation, z6, z7, z10, z11, null, messageContextType, theme, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, null);
    }
}
