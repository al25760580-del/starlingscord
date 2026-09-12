package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.message.messagepart.PremiumGroupInviteMessageAccessory;
import com.discord.chat.presentation.message.view.PremiumGroupInviteView;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/PremiumGroupInviteViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/PremiumGroupInviteView;", "premiumGroupInviteView", "<init>", "(Lcom/discord/chat/presentation/message/view/PremiumGroupInviteView;)V", "Lcom/discord/chat/presentation/message/messagepart/PremiumGroupInviteMessageAccessory;", "accessory", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onTapLink", "bind", "(Lcom/discord/chat/presentation/message/messagepart/PremiumGroupInviteMessageAccessory;Lkotlin/jvm/functions/Function2;)V", "Lcom/discord/chat/presentation/message/view/PremiumGroupInviteView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PremiumGroupInviteViewHolder extends MessagePartViewHolder {

    @NotNull
    private final PremiumGroupInviteView premiumGroupInviteView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumGroupInviteViewHolder(@NotNull PremiumGroupInviteView premiumGroupInviteView) {
        super(premiumGroupInviteView, null);
        Intrinsics.checkNotNullParameter(premiumGroupInviteView, "premiumGroupInviteView");
        this.premiumGroupInviteView = premiumGroupInviteView;
    }

    public final void bind(@NotNull PremiumGroupInviteMessageAccessory accessory, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onTapLink) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapLink, "onTapLink");
        this.premiumGroupInviteView.bind(accessory, onTapLink);
    }
}
