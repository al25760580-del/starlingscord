package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.i;
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.v;
import com.discord.chat.presentation.message.view.botuikit.ComponentActionEventHandlers;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.GeneralEventHandlers;
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderEventHandlers;
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions;
import com.discord.chat.presentation.message.view.botuikit.MediaItemEventHandlers;
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsView;
import com.discord.chat.presentation.message.view.botuikit.WidthInfo;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0091\u0001\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2(\u0010\u0010\u001a$\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\n2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/MessageComponentsViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsView;", "messageComponentsView", "<init>", "(Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsView;)V", "Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;", "componentsComponentsAccessory", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentProvider", "Lkotlin/Function4;", "Landroid/view/View;", "", "", "", "", "onMediaItemClicked", "Lkotlin/Function2;", "onMediaItemLongClicked", "Lkotlin/Function0;", "onTapSpoiler", "Lkotlin/Function1;", "", "onTapObscureToggle", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "bind", "(Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageComponentsViewHolder extends MessagePartViewHolder {

    @NotNull
    private final MessageComponentsView messageComponentsView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageComponentsViewHolder(@NotNull MessageComponentsView messageComponentsView) {
        super(messageComponentsView, null);
        Intrinsics.checkNotNullParameter(messageComponentsView, "messageComponentsView");
        this.messageComponentsView = messageComponentsView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(ChatEventHandler chatEventHandler, String str, String url, String title) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        chatEventHandler.mo469onLinkClickedu7_MRrM(str, url, title);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(ChatEventHandler chatEventHandler, String str, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        chatEventHandler.mo468onLinkClickedntcYbpo(str, node);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(ChatEventHandler chatEventHandler, String str, String componentId) {
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        chatEventHandler.mo480onTapButtonActionComponentntcYbpo(str, componentId);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$3(ChatEventHandler chatEventHandler, String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        chatEventHandler.mo469onLinkClickedu7_MRrM(str, url, "");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$4(ChatEventHandler chatEventHandler, String str, String componentId) {
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        chatEventHandler.mo511onTapSelectActionComponentntcYbpo(str, componentId);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5(ChatEventHandler chatEventHandler, String str, UserId userId, String contentId, String tappedElement) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(tappedElement, "tappedElement");
        chatEventHandler.mo485onTapContentInventoryEntryEmbedtsfjtEQ(str, userId.m1217unboximpl(), contentId, tappedElement);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6(ChatEventHandler chatEventHandler, String str, UserId userId) {
        chatEventHandler.mo483onTapCheckpointCardx5gers8(str, userId.m1217unboximpl());
        return Unit.f14616a;
    }

    public final void bind(@NotNull MessageComponentsAccessory componentsComponentsAccessory, ComponentProvider componentProvider, @NotNull Function4 onMediaItemClicked, Function2<? super String, ? super Integer, Unit> onMediaItemLongClicked, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super Boolean, Unit> onTapObscureToggle, @NotNull ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(componentsComponentsAccessory, "componentsComponentsAccessory");
        Intrinsics.checkNotNullParameter(onMediaItemClicked, "onMediaItemClicked");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapObscureToggle, "onTapObscureToggle");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Message message = componentsComponentsAccessory.getMessage();
        String messageId = componentsComponentsAccessory.getMessageId();
        int width = MessageMargins.INSTANCE.getWidth(componentsComponentsAccessory.getMargins(), componentsComponentsAccessory.getConstrainedWidth(), message.getForwardInfo() != null);
        MessageMargins margins = componentsComponentsAccessory.getMargins();
        String strM1163toStringimpl = MessageId.m1163toStringimpl(messageId);
        GeneralEventHandlers generalEventHandlers = new GeneralEventHandlers(new i(1, eventHandler, messageId), onTapSpoiler);
        MarkdownTextRenderOptions markdownTextRenderOptions = new MarkdownTextRenderOptions(MessageId.m1163toStringimpl(message.m267getId3Eiw7ao()), MessageKt.shouldAnimateEmoji(message), MessageKt.shouldShowLinkDecorations(message), message.getShouldShowRoleDot(), message.getShouldShowRoleOnName());
        MarkdownTextRenderEventHandlers markdownTextRenderEventHandlers = new MarkdownTextRenderEventHandlers(new v(eventHandler, messageId, 1), new MessageComponentsViewHolder$bind$componentContext$2(eventHandler), new MessageComponentsViewHolder$bind$componentContext$3(eventHandler), new MessageComponentsViewHolder$bind$componentContext$4(eventHandler), new MessageComponentsViewHolder$bind$componentContext$5(eventHandler), new MessageComponentsViewHolder$bind$componentContext$6(eventHandler), new MessageComponentsViewHolder$bind$componentContext$7(eventHandler), new MessageComponentsViewHolder$bind$componentContext$8(eventHandler), new MessageComponentsViewHolder$bind$componentContext$9(eventHandler), new MessageComponentsViewHolder$bind$componentContext$10(eventHandler), onTapSpoiler, new MessageComponentsViewHolder$bind$componentContext$11(eventHandler), new MessageComponentsViewHolder$bind$componentContext$12(eventHandler), new MessageComponentsViewHolder$bind$componentContext$13(eventHandler), new MessageComponentsViewHolder$bind$componentContext$14(eventHandler));
        MediaItemEventHandlers mediaItemEventHandlers = new MediaItemEventHandlers(onMediaItemClicked, onMediaItemLongClicked, onTapSpoiler, new MessageComponentsViewHolder$bind$componentContext$16(eventHandler), onTapObscureToggle);
        ComponentActionEventHandlers componentActionEventHandlers = new ComponentActionEventHandlers(new v(eventHandler, messageId, 2), new v(eventHandler, messageId, 3), new v(eventHandler, messageId, 4), new f(0, eventHandler, messageId), new v(eventHandler, messageId, 5));
        WidthInfo widthInfo = new WidthInfo(width, SizeUtilsKt.getDpToPx(600), 0, 4, null);
        Boolean gifAutoPlay = message.getGifAutoPlay();
        this.messageComponentsView.setComponents(componentsComponentsAccessory.getMessageComponents(), componentProvider, new ComponentContext(margins, strM1163toStringimpl, generalEventHandlers, markdownTextRenderOptions, markdownTextRenderEventHandlers, mediaItemEventHandlers, componentActionEventHandlers, widthInfo, gifAutoPlay != null ? gifAutoPlay.booleanValue() : false, message.getForwardInfo() != null, false, false));
    }
}
