package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.view.mosaic.AttachmentMediaMosaicContainerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u009b\u0001\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u001e\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/AttachmentMediaMosaicViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/mosaic/AttachmentMediaMosaicContainerView;", "view", "<init>", "(Lcom/discord/chat/presentation/message/view/mosaic/AttachmentMediaMosaicContainerView;)V", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "margins", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "attachments", "Lkotlin/Function3;", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "", "onAttachmentClicked", "Lkotlin/Function1;", "onAttachmentLongClicked", "Lkotlin/Function0;", "onAttachmentSpoilerClicked", "", "onAttachmentObscureToggle", "isForwardedContent", "shouldAutoPlayGif", "constrainedWidth", "bind", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZZI)V", "Lcom/discord/chat/presentation/message/view/mosaic/AttachmentMediaMosaicContainerView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AttachmentMediaMosaicViewHolder extends MessagePartViewHolder {

    @NotNull
    private final AttachmentMediaMosaicContainerView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentMediaMosaicViewHolder(@NotNull AttachmentMediaMosaicContainerView view) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull MessageMargins margins, @NotNull ChatEventHandler eventHandler, @NotNull List<? extends MessageAttachmentAccessory> attachments, @NotNull Function3 onAttachmentClicked, Function1<? super Integer, Unit> onAttachmentLongClicked, @NotNull Function0<Unit> onAttachmentSpoilerClicked, @NotNull Function1<? super Boolean, Unit> onAttachmentObscureToggle, boolean isForwardedContent, boolean shouldAutoPlayGif, int constrainedWidth) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(onAttachmentClicked, "onAttachmentClicked");
        Intrinsics.checkNotNullParameter(onAttachmentSpoilerClicked, "onAttachmentSpoilerClicked");
        Intrinsics.checkNotNullParameter(onAttachmentObscureToggle, "onAttachmentObscureToggle");
        this.view.setAttachments(margins, attachments, eventHandler, onAttachmentClicked, onAttachmentLongClicked, onAttachmentSpoilerClicked, onAttachmentObscureToggle, isForwardedContent, constrainedWidth, shouldAutoPlayGif);
    }
}
