package com.discord.chat.presentation.message.viewholder;

import android.content.Context;
import android.text.TextPaint;
import co.s;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.chat.presentation.textutils.LinkStyle;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react.FontManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J±\u0003\u0010&\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\r2\"\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000b0\u000f2*\u0010\u0013\u001a&\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000b0\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\r2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\b2:\u0010\u0017\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000b0\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\r2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\r2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\r2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\r2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b0\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b0\r2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\r2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "messageContentView", "<init>", "(Lcom/discord/chat/presentation/message/view/MessageContentView;)V", "Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;", "messageContentItem", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onLinkClicked", "Lkotlin/Function1;", "onLinkLongClicked", "Lkotlin/Function3;", "", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapAttachmentLink", "onLongPressAttachmentLink", "Lkotlin/Function6;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;", "onTapGameMention", "onTapSpoiler", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapInlineCode", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "onTapSeeMore", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapSoundmoji", "bind", "(Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "getMessageContentView", "()Lcom/discord/chat/presentation/message/view/MessageContentView;", "Lcom/discord/chat/presentation/message/viewholder/MessageContentBindData;", "lastMessageContent", "Lcom/discord/chat/presentation/message/viewholder/MessageContentBindData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageContentViewHolder extends MessagePartViewHolder {
    private MessageContentBindData lastMessageContent;

    @NotNull
    private final MessageContentView messageContentView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageContentViewHolder(@NotNull MessageContentView messageContentView) {
        super(messageContentView, null);
        Intrinsics.checkNotNullParameter(messageContentView, "messageContentView");
        this.messageContentView = messageContentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(Function2 function2, MessageContentAccessory messageContentAccessory, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        function2.invoke(MessageId.m1156boximpl(messageContentAccessory.getMessageId()), node);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(MessageContentViewHolder messageContentViewHolder, Function1 function1) {
        messageContentViewHolder.lastMessageContent = null;
        function1.invoke(messageContentViewHolder);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkStyle bind$lambda$2(MessageContentAccessory messageContentAccessory, LinkContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new LinkStyle(messageContentAccessory.getBoldLinkText() ? DiscordFont.PrimarySemibold : DiscordFont.PrimaryNormal, messageContentAccessory.getLinkColor(), null, null, 12, null);
    }

    public final void bind(@NotNull MessageContentAccessory messageContentItem, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked, @NotNull Function1<? super LinkContentNode, Unit> onLinkLongClicked, @NotNull Function3 onTapChannel, @NotNull Function4 onLongPressChannel, @NotNull Function1<? super String, Unit> onTapAttachmentLink, @NotNull Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, @NotNull Function1<? super GameMentionContentNode, Unit> onTapGameMention, @NotNull Function1<? super MessagePartViewHolder, Unit> onTapSpoiler, @NotNull Function1<? super String, Unit> onTapTimestamp, @NotNull Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function1<? super MessageId, Unit> onTapSeeMore, @NotNull Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji) {
        Intrinsics.checkNotNullParameter(messageContentItem, "messageContentItem");
        Intrinsics.checkNotNullParameter(onLinkClicked, "onLinkClicked");
        Intrinsics.checkNotNullParameter(onLinkLongClicked, "onLinkLongClicked");
        Intrinsics.checkNotNullParameter(onTapChannel, "onTapChannel");
        Intrinsics.checkNotNullParameter(onLongPressChannel, "onLongPressChannel");
        Intrinsics.checkNotNullParameter(onTapAttachmentLink, "onTapAttachmentLink");
        Intrinsics.checkNotNullParameter(onLongPressAttachmentLink, "onLongPressAttachmentLink");
        Intrinsics.checkNotNullParameter(onTapMention, "onTapMention");
        Intrinsics.checkNotNullParameter(onTapCommand, "onTapCommand");
        Intrinsics.checkNotNullParameter(onLongPressCommand, "onLongPressCommand");
        Intrinsics.checkNotNullParameter(onTapGameMention, "onTapGameMention");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapTimestamp, "onTapTimestamp");
        Intrinsics.checkNotNullParameter(onTapInlineCode, "onTapInlineCode");
        Intrinsics.checkNotNullParameter(onTapEmoji, "onTapEmoji");
        Intrinsics.checkNotNullParameter(onTapSeeMore, "onTapSeeMore");
        Intrinsics.checkNotNullParameter(onTapSoundmoji, "onTapSoundmoji");
        MessageContentBindData messageContentBindData = new MessageContentBindData(messageContentItem, onLinkClicked, onLinkLongClicked, onTapChannel, onLongPressChannel, onTapAttachmentLink, onLongPressAttachmentLink, onTapMention, onTapCommand, onLongPressCommand, onTapGameMention, onTapSpoiler, onTapTimestamp, onTapInlineCode, onTapEmoji, onTapSeeMore, onTapSoundmoji);
        if (Intrinsics.areEqual(this.lastMessageContent, messageContentBindData)) {
            return;
        }
        this.lastMessageContent = messageContentBindData;
        this.messageContentView.setTextColor(messageContentItem.getMessageTextColor());
        DiscordFontUtilsKt.setDiscordFont(this.messageContentView, messageContentItem.getMessageFont());
        SetTextSizeSpKt.setTextSizeSp(this.messageContentView, messageContentItem.getTextSizeSp());
        TextPaint paint = this.messageContentView.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        FontManager fontManager = FontManager.INSTANCE;
        Context context = this.messageContentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float baselineHeightForFontSizePx = TextUtilsKt.getBaselineHeightForFontSizePx(paint, fontManager.getScaledSpToPx(16, context));
        MessageContentView messageContentView = this.messageContentView;
        MessageMargins margins = messageContentItem.getMargins();
        StructurableText messageContent = messageContentItem.getMessageContent();
        String strMo575getMessageId3Eiw7ao = messageContentItem.getMessageId();
        boolean shouldAnimateEmoji = messageContentItem.getShouldAnimateEmoji();
        boolean shouldShowLinkDecorations = messageContentItem.getShouldShowLinkDecorations();
        boolean shouldShowRoleDot = messageContentItem.getShouldShowRoleDot();
        boolean shouldShowRoleOnName = messageContentItem.getShouldShowRoleOnName();
        int bottomSpacingPx = messageContentItem.getBottomSpacingPx();
        String editedLabel = messageContentItem.getEditedLabel();
        String editedTimestamp = messageContentItem.getEditedTimestamp();
        Integer editedLabelTextColor = messageContentItem.getEditedLabelTextColor();
        Truncation truncation = messageContentItem.getTruncation();
        MessageContentView.m747setMessageContenthYrISQc$default(messageContentView, margins, messageContent, strMo575getMessageId3Eiw7ao, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, new b7.a(19, onLinkClicked, messageContentItem), onLinkLongClicked, onTapChannel, onLongPressChannel, onTapAttachmentLink, onLongPressAttachmentLink, onTapMention, onTapCommand, onLongPressCommand, onTapGameMention, new c6.a(11, this, onTapSpoiler), onTapTimestamp, onTapInlineCode, onTapEmoji, onTapSeeMore, onTapSoundmoji, new s(7, messageContentItem), bottomSpacingPx, messageContentItem.getConstrainedWidth(), messageContentItem.isForwardedContent(), editedLabel, editedTimestamp, editedLabelTextColor, truncation, messageContentItem.getTheme(), Float.valueOf(baselineHeightForFontSizePx), false, 0, 2, null);
    }

    @NotNull
    public final MessageContentView getMessageContentView() {
        return this.messageContentView;
    }
}
