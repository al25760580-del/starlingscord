package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory;
import com.discord.chat.presentation.message.view.GuildInviteView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "guildInviteView", "Lcom/discord/chat/presentation/message/view/GuildInviteView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "<init>", "(Lcom/discord/chat/presentation/message/view/GuildInviteView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "getEventHandler", "()Lcom/discord/chat/presentation/events/ChatEventHandler;", "bind", "", "inviteAccessory", "Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuildInviteViewHolder extends MessagePartViewHolder {

    @NotNull
    private final ChatEventHandler eventHandler;

    @NotNull
    private final GuildInviteView guildInviteView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteViewHolder(@NotNull GuildInviteView guildInviteView, @NotNull ChatEventHandler eventHandler) {
        super(guildInviteView, null);
        Intrinsics.checkNotNullParameter(guildInviteView, "guildInviteView");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.guildInviteView = guildInviteView;
        this.eventHandler = eventHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$0(GuildInviteViewHolder guildInviteViewHolder, GuildInviteMessageAccessory guildInviteMessageAccessory, View view) {
        guildInviteViewHolder.eventHandler.mo495onTapInviteEmbedAFFcxXc(guildInviteMessageAccessory.getMessageId(), guildInviteMessageAccessory.getCodedLinkIndex(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(GuildInviteViewHolder guildInviteViewHolder, GuildInviteMessageAccessory guildInviteMessageAccessory, View view) {
        guildInviteViewHolder.eventHandler.mo496onTapInviteEmbedAcceptntcYbpo(guildInviteMessageAccessory.getMessageId(), guildInviteMessageAccessory.getCodedLinkIndex());
    }

    public final void bind(@NotNull final GuildInviteMessageAccessory inviteAccessory) {
        String channelName;
        Intrinsics.checkNotNullParameter(inviteAccessory, "inviteAccessory");
        GuildInviteEmbedImpl invite = inviteAccessory.getInvite();
        GuildInviteView guildInviteView = this.guildInviteView;
        String subtitle = invite.getSubtitle();
        if (subtitle == null || StringsKt.K(subtitle)) {
            String channelIcon = invite.getChannelIcon();
            channelName = (channelIcon == null || StringsKt.K(channelIcon)) ? null : invite.getChannelName();
        } else {
            channelName = invite.getSubtitle();
        }
        guildInviteView.setInviteSplash(invite.getInviteSplash());
        guildInviteView.setHeaderText(invite.getHeaderText());
        guildInviteView.setHeaderColor(Integer.valueOf(invite.getHeaderColor()));
        guildInviteView.setTitleText(invite.getTitleText());
        guildInviteView.setGuildBadge(invite.getBadgeIconUrl());
        guildInviteView.setTitleColor(invite.getTitleColor());
        guildInviteView.setPresence(invite.getOnlineText(), invite.getMemberText());
        guildInviteView.setGuildImage(invite.getThumbnailUrl(), invite.getThumbnailText(), invite.getThumbnailBackgroundColor(), invite.getThumbnailCornerRadius());
        guildInviteView.setSubtitle(channelName);
        guildInviteView.setSubtitleColor(invite.getSubtitleColor());
        guildInviteView.setSubtitleIcon(invite.getChannelIcon());
        final int i7 = 0;
        final int i10 = 1;
        guildInviteView.setClickListeners(invite.getCanBeAccepted(), new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.viewholder.d

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ GuildInviteViewHolder f4305e;

            {
                this.f4305e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        GuildInviteViewHolder.bind$lambda$2$lambda$0(this.f4305e, inviteAccessory, view);
                        break;
                    default:
                        GuildInviteViewHolder.bind$lambda$2$lambda$1(this.f4305e, inviteAccessory, view);
                        break;
                }
            }
        }, new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.viewholder.d

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ GuildInviteViewHolder f4305e;

            {
                this.f4305e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        GuildInviteViewHolder.bind$lambda$2$lambda$0(this.f4305e, inviteAccessory, view);
                        break;
                    default:
                        GuildInviteViewHolder.bind$lambda$2$lambda$1(this.f4305e, inviteAccessory, view);
                        break;
                }
            }
        }, invite.getAcceptLabelText());
        guildInviteView.setButtonText(invite.getAcceptLabelText());
        guildInviteView.setButtonTextColor(invite.getAcceptLabelColor());
        guildInviteView.setButtonBackgroundColor(invite.getAcceptLabelBackgroundColor());
        guildInviteView.setBackgroundRectangleColor(Integer.valueOf(invite.getBackgroundColor()));
    }

    @NotNull
    public final ChatEventHandler getEventHandler() {
        return this.eventHandler;
    }
}
