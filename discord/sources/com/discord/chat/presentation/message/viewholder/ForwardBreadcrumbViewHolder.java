package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.messagepart.ForwardBreadcrumbMessageAccessory;
import com.discord.chat.presentation.message.view.ForwardBreadcrumbView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ForwardBreadcrumbViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/ForwardBreadcrumbView;", "breadcrumbView", "<init>", "(Lcom/discord/chat/presentation/message/view/ForwardBreadcrumbView;)V", "Lcom/discord/chat/presentation/message/messagepart/ForwardBreadcrumbMessageAccessory;", "accessory", "Lkotlin/Function3;", "", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/MessageId;", "", "onTapForwardFooter", "bind", "(Lcom/discord/chat/presentation/message/messagepart/ForwardBreadcrumbMessageAccessory;Lkotlin/jvm/functions/Function3;)V", "Lcom/discord/chat/presentation/message/view/ForwardBreadcrumbView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ForwardBreadcrumbViewHolder extends MessagePartViewHolder {

    @NotNull
    private final ForwardBreadcrumbView breadcrumbView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForwardBreadcrumbViewHolder(@NotNull ForwardBreadcrumbView breadcrumbView) {
        super(breadcrumbView, null);
        Intrinsics.checkNotNullParameter(breadcrumbView, "breadcrumbView");
        this.breadcrumbView = breadcrumbView;
    }

    public final void bind(@NotNull ForwardBreadcrumbMessageAccessory accessory, @NotNull Function3 onTapForwardFooter) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapForwardFooter, "onTapForwardFooter");
        this.breadcrumbView.m743configureJjTCmh4(accessory.m624getChannelIdo4g7jtM(), accessory.getMessageId(), accessory.getForwardInfo(), onTapForwardFooter);
    }
}
