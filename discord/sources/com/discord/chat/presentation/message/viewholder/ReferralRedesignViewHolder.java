package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.message.messagepart.ReferralRedesignMessageAccessory;
import com.discord.chat.presentation.message.view.ReferralRedesignView;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ReferralRedesignViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/ReferralRedesignView;", "referralRedesignView", "<init>", "(Lcom/discord/chat/presentation/message/view/ReferralRedesignView;)V", "Lcom/discord/chat/presentation/message/messagepart/ReferralRedesignMessageAccessory;", "accessory", "Lkotlin/Function1;", "", "", "onTapAccept", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onTapLink", "bind", "(Lcom/discord/chat/presentation/message/messagepart/ReferralRedesignMessageAccessory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lcom/discord/chat/presentation/message/view/ReferralRedesignView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferralRedesignViewHolder extends MessagePartViewHolder {

    @NotNull
    private final ReferralRedesignView referralRedesignView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralRedesignViewHolder(@NotNull ReferralRedesignView referralRedesignView) {
        super(referralRedesignView, null);
        Intrinsics.checkNotNullParameter(referralRedesignView, "referralRedesignView");
        this.referralRedesignView = referralRedesignView;
    }

    public final void bind(@NotNull ReferralRedesignMessageAccessory accessory, @NotNull Function1<? super String, Unit> onTapAccept, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onTapLink) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapAccept, "onTapAccept");
        Intrinsics.checkNotNullParameter(onTapLink, "onTapLink");
        this.referralRedesignView.bind(accessory, onTapAccept, onTapLink);
    }
}
