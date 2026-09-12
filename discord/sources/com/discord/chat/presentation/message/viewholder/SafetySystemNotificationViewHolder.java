package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed;
import com.discord.chat.presentation.message.view.SafetySystemNotificationView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/SafetySystemNotificationViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/SafetySystemNotificationView;", "safetySystemNotificationView", "<init>", "(Lcom/discord/chat/presentation/message/view/SafetySystemNotificationView;)V", "Lcom/discord/chat/bridge/safetysystemnotification/SafetySystemNotificationEmbed;", "safetySystemNotificationEmbed", "Lkotlin/Function2;", "", "", "onTapCta", "bind", "(Lcom/discord/chat/bridge/safetysystemnotification/SafetySystemNotificationEmbed;Lkotlin/jvm/functions/Function2;)V", "Lcom/discord/chat/presentation/message/view/SafetySystemNotificationView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafetySystemNotificationViewHolder extends MessagePartViewHolder {

    @NotNull
    private final SafetySystemNotificationView safetySystemNotificationView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetySystemNotificationViewHolder(@NotNull SafetySystemNotificationView safetySystemNotificationView) {
        super(safetySystemNotificationView, null);
        Intrinsics.checkNotNullParameter(safetySystemNotificationView, "safetySystemNotificationView");
        this.safetySystemNotificationView = safetySystemNotificationView;
    }

    public final void bind(@NotNull SafetySystemNotificationEmbed safetySystemNotificationEmbed, @NotNull Function2<? super String, ? super String, Unit> onTapCta) {
        Intrinsics.checkNotNullParameter(safetySystemNotificationEmbed, "safetySystemNotificationEmbed");
        Intrinsics.checkNotNullParameter(onTapCta, "onTapCta");
        SafetySystemNotificationView safetySystemNotificationView = this.safetySystemNotificationView;
        String titleText = safetySystemNotificationEmbed.getTitleText();
        String titleIcon = safetySystemNotificationEmbed.getTitleIcon();
        String subtitleText = safetySystemNotificationEmbed.getSubtitleText();
        String descriptionText = safetySystemNotificationEmbed.getDescriptionText();
        String primaryCtaText = safetySystemNotificationEmbed.getPrimaryCtaText();
        if (primaryCtaText == null) {
            primaryCtaText = "";
        }
        String primaryCtaKey = safetySystemNotificationEmbed.getPrimaryCtaKey();
        if (primaryCtaKey == null) {
            primaryCtaKey = "";
        }
        String primaryCtaType = safetySystemNotificationEmbed.getPrimaryCtaType();
        if (primaryCtaType == null) {
            primaryCtaType = "";
        }
        String secondaryCtaText = safetySystemNotificationEmbed.getSecondaryCtaText();
        if (secondaryCtaText == null) {
            secondaryCtaText = "";
        }
        String secondaryCtaType = safetySystemNotificationEmbed.getSecondaryCtaType();
        if (secondaryCtaType == null) {
            secondaryCtaType = "";
        }
        String secondaryCtaKey = safetySystemNotificationEmbed.getSecondaryCtaKey();
        if (secondaryCtaKey == null) {
            secondaryCtaKey = "";
        }
        safetySystemNotificationView.setContent(titleText, titleIcon, subtitleText, descriptionText, primaryCtaText, primaryCtaKey, primaryCtaType, secondaryCtaText, secondaryCtaType, secondaryCtaKey, safetySystemNotificationEmbed.getFooterTheme(), onTapCta);
    }
}
