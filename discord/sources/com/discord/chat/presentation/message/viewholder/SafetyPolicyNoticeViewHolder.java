package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory;
import com.discord.chat.presentation.message.view.SafetyPolicyNoticeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/SafetyPolicyNoticeViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/SafetyPolicyNoticeView;", "safetyPolicyNoticeView", "<init>", "(Lcom/discord/chat/presentation/message/view/SafetyPolicyNoticeView;)V", "Lcom/discord/chat/presentation/message/messagepart/SafetyPolicyNoticeMessageAccessory;", "accessory", "Lkotlin/Function1;", "", "", "onTapEmbed", "bind", "(Lcom/discord/chat/presentation/message/messagepart/SafetyPolicyNoticeMessageAccessory;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/presentation/message/view/SafetyPolicyNoticeView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafetyPolicyNoticeViewHolder extends MessagePartViewHolder {

    @NotNull
    private final SafetyPolicyNoticeView safetyPolicyNoticeView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyPolicyNoticeViewHolder(@NotNull SafetyPolicyNoticeView safetyPolicyNoticeView) {
        super(safetyPolicyNoticeView, null);
        Intrinsics.checkNotNullParameter(safetyPolicyNoticeView, "safetyPolicyNoticeView");
        this.safetyPolicyNoticeView = safetyPolicyNoticeView;
    }

    public final void bind(@NotNull SafetyPolicyNoticeMessageAccessory accessory, @NotNull Function1<? super String, Unit> onTapEmbed) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapEmbed, "onTapEmbed");
        this.safetyPolicyNoticeView.setContent(accessory.getSafetyPolicyNoticeEmbed().getTitleText(), accessory.getSafetyPolicyNoticeEmbed().getSubtitleText(), accessory.getSafetyPolicyNoticeEmbed().getDescriptionText(), accessory.getSafetyPolicyNoticeEmbed().getCtaText(), accessory.getSafetyPolicyNoticeEmbed().getClassificationId(), onTapEmbed);
    }
}
