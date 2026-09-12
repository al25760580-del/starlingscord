package com.discord.chat.presentation.message.view.botuikit.react;

import android.view.View;
import ar.s;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.presentation.message.view.b;
import com.discord.chat.presentation.message.view.botuikit.ComponentActionEventHandlers;
import com.discord.chat.presentation.message.view.botuikit.GeneralEventHandlers;
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderEventHandlers;
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions;
import com.discord.chat.presentation.message.view.botuikit.MediaItemEventHandlers;
import com.discord.chat.presentation.message.view.d;
import com.discord.primitives.UserId;
import com.discord.sticker.sticker_types.c;
import com.discord.user_search_worker.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/react/ComponentContextDefaults;", "", "<init>", "()V", "GENERAL_HANDLERS", "Lcom/discord/chat/presentation/message/view/botuikit/GeneralEventHandlers;", "getGENERAL_HANDLERS", "()Lcom/discord/chat/presentation/message/view/botuikit/GeneralEventHandlers;", "MARKDOWN_OPTIONS", "Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;", "getMARKDOWN_OPTIONS", "()Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;", "MARKDOWN_HANDLERS", "Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderEventHandlers;", "getMARKDOWN_HANDLERS", "()Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderEventHandlers;", "MEDIA_HANDLERS", "Lcom/discord/chat/presentation/message/view/botuikit/MediaItemEventHandlers;", "getMEDIA_HANDLERS", "()Lcom/discord/chat/presentation/message/view/botuikit/MediaItemEventHandlers;", "COMPONENT_HANDLERS", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionEventHandlers;", "getCOMPONENT_HANDLERS", "()Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionEventHandlers;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComponentContextDefaults {

    @NotNull
    public static final ComponentContextDefaults INSTANCE = new ComponentContextDefaults();

    @NotNull
    private static final GeneralEventHandlers GENERAL_HANDLERS = new GeneralEventHandlers(new s(19), new c(14));

    @NotNull
    private static final MarkdownTextRenderOptions MARKDOWN_OPTIONS = new MarkdownTextRenderOptions("", false, false, false, false);

    @NotNull
    private static final MarkdownTextRenderEventHandlers MARKDOWN_HANDLERS = new MarkdownTextRenderEventHandlers(new a(25), new a(26), new b(3), new com.discord.chat.presentation.message.view.c(2), new a(28), new s(20), new d(3), new a(29), new a(27), null, new c(15), new f6.a(0), new f6.a(1), new f6.a(2), new f6.a(3), IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, null);

    @NotNull
    private static final MediaItemEventHandlers MEDIA_HANDLERS = new MediaItemEventHandlers(new com.discord.chat.presentation.message.view.c(3), new s(21), new c(16), new a(19), new a(20));

    @NotNull
    private static final ComponentActionEventHandlers COMPONENT_HANDLERS = new ComponentActionEventHandlers(new a(21), new a(22), new a(23), new b(2), new a(24));

    private ComponentContextDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit COMPONENT_HANDLERS$lambda$21(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onTapButtonActionComponent not implemented", "message");
        throw new o("onTapButtonActionComponent not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit COMPONENT_HANDLERS$lambda$22(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onTapButtonLinkComponent not implemented", "message");
        throw new o("onTapButtonLinkComponent not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit COMPONENT_HANDLERS$lambda$23(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onTapSelectActionComponent not implemented", "message");
        throw new o("onTapSelectActionComponent not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit COMPONENT_HANDLERS$lambda$24(UserId userId, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        Intrinsics.checkNotNullParameter("onTapContentInventoryEntry not implemented", "message");
        throw new o("onTapContentInventoryEntry not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit COMPONENT_HANDLERS$lambda$25(UserId userId) {
        Intrinsics.checkNotNullParameter("onTapCheckpointCard not implemented", "message");
        throw new o("onTapCheckpointCard not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GENERAL_HANDLERS$lambda$0(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        Intrinsics.checkNotNullParameter("onLinkClicked not implemented", "message");
        throw new o("onLinkClicked not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GENERAL_HANDLERS$lambda$1() {
        Intrinsics.checkNotNullParameter("onTapSpoiler not implemented", "message");
        throw new o("onTapSpoiler not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$10(CommandMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onLongPressCommand not implemented", "message");
        throw new o("onLongPressCommand not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$11() {
        Intrinsics.checkNotNullParameter("onTapSpoiler not implemented", "message");
        throw new o("onTapSpoiler not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$12(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onTapTimestamp not implemented", "message");
        throw new o("onTapTimestamp not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$13(InlineCodeContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onTapInlineCode not implemented", "message");
        throw new o("onTapInlineCode not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$14(EmojiContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onTapEmoji not implemented", "message");
        throw new o("onTapEmoji not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$15(SoundmojiContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onTapSoundmoji not implemented", "message");
        throw new o("onTapSoundmoji not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$2(LinkContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onLinkClicked not implemented", "message");
        throw new o("onLinkClicked not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$3(LinkContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onLinkLongClicked not implemented", "message");
        throw new o("onLinkLongClicked not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$4(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter("onTapChannel not implemented", "message");
        throw new o("onTapChannel not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$5(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter("onLongPressChannel not implemented", "message");
        throw new o("onLongPressChannel not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$6(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onTapAttachmentLink not implemented", "message");
        throw new o("onTapAttachmentLink not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$7(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        Intrinsics.checkNotNullParameter("onLongPressAttachmentLink not implemented", "message");
        throw new o("onLongPressAttachmentLink not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$8(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        Intrinsics.checkNotNullParameter("onTapMention not implemented", "message");
        throw new o("onTapMention not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MARKDOWN_HANDLERS$lambda$9(CommandMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("onTapCommand not implemented", "message");
        throw new o("onTapCommand not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MEDIA_HANDLERS$lambda$16(View view, String str, int i7, Double d6) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter("onMediaItemClicked not implemented", "message");
        throw new o("onMediaItemClicked not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MEDIA_HANDLERS$lambda$17(String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter("onMediaItemLongClicked not implemented", "message");
        throw new o("onMediaItemLongClicked not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MEDIA_HANDLERS$lambda$18() {
        Intrinsics.checkNotNullParameter("onMediaItemSpoilerClicked not implemented", "message");
        throw new o("onMediaItemSpoilerClicked not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MEDIA_HANDLERS$lambda$19(String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter("onMediaItemAltTextButtonClicked not implemented", "message");
        throw new o("onMediaItemAltTextButtonClicked not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MEDIA_HANDLERS$lambda$20(boolean z5) {
        Intrinsics.checkNotNullParameter("onMediaItemObscureToggle not implemented", "message");
        throw new o("onMediaItemObscureToggle not implemented");
    }

    @NotNull
    public final ComponentActionEventHandlers getCOMPONENT_HANDLERS() {
        return COMPONENT_HANDLERS;
    }

    @NotNull
    public final GeneralEventHandlers getGENERAL_HANDLERS() {
        return GENERAL_HANDLERS;
    }

    @NotNull
    public final MarkdownTextRenderEventHandlers getMARKDOWN_HANDLERS() {
        return MARKDOWN_HANDLERS;
    }

    @NotNull
    public final MarkdownTextRenderOptions getMARKDOWN_OPTIONS() {
        return MARKDOWN_OPTIONS;
    }

    @NotNull
    public final MediaItemEventHandlers getMEDIA_HANDLERS() {
        return MEDIA_HANDLERS;
    }
}
