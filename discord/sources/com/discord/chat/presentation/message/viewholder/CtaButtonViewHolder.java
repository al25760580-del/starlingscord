package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.ctabutton.CtaButton;
import com.discord.chat.presentation.message.view.CtaButtonView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JQ\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/CtaButtonViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/CtaButtonView;", "ctaButtonView", "<init>", "(Lcom/discord/chat/presentation/message/view/CtaButtonView;)V", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/ctabutton/CtaButton;", "accessory", "secondaryAccessory", "Lkotlin/Function3;", "", "", "onTapCtaButton", "bind-uHwPWNE", "(JLjava/lang/String;Lcom/discord/chat/bridge/ctabutton/CtaButton;Lcom/discord/chat/bridge/ctabutton/CtaButton;Lkotlin/jvm/functions/Function3;)V", "bind", "Lcom/discord/chat/presentation/message/view/CtaButtonView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CtaButtonViewHolder extends MessagePartViewHolder {

    @NotNull
    private final CtaButtonView ctaButtonView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CtaButtonViewHolder(@NotNull CtaButtonView ctaButtonView) {
        super(ctaButtonView, null);
        Intrinsics.checkNotNullParameter(ctaButtonView, "ctaButtonView");
        this.ctaButtonView = ctaButtonView;
    }

    /* JADX INFO: renamed from: bind-uHwPWNE$default, reason: not valid java name */
    public static /* synthetic */ void m767binduHwPWNE$default(CtaButtonViewHolder ctaButtonViewHolder, long j, String str, CtaButton ctaButton, CtaButton ctaButton2, Function3 function3, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            ctaButton2 = null;
        }
        ctaButtonViewHolder.m768binduHwPWNE(j, str, ctaButton, ctaButton2, function3);
    }

    /* JADX INFO: renamed from: bind-uHwPWNE, reason: not valid java name */
    public final void m768binduHwPWNE(long channelId, @NotNull String messageId, @NotNull CtaButton accessory, CtaButton secondaryAccessory, @NotNull Function3 onTapCtaButton) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapCtaButton, "onTapCtaButton");
        this.ctaButtonView.m734setContentuHwPWNE(channelId, messageId, accessory, secondaryAccessory, onTapCtaButton);
    }
}
