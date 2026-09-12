package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbedImpl;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.GuildProfileInviteMessageAccessory;
import com.discord.chat.presentation.message.view.GuildProfileInviteView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/GuildProfileInviteViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "guildProfileInviteView", "Lcom/discord/chat/presentation/message/view/GuildProfileInviteView;", "<init>", "(Lcom/discord/chat/presentation/message/view/GuildProfileInviteView;)V", "bind", "", "inviteAccessory", "Lcom/discord/chat/presentation/message/messagepart/GuildProfileInviteMessageAccessory;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuildProfileInviteViewHolder extends MessagePartViewHolder {

    @NotNull
    private final GuildProfileInviteView guildProfileInviteView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildProfileInviteViewHolder(@NotNull GuildProfileInviteView guildProfileInviteView) {
        super(guildProfileInviteView, null);
        Intrinsics.checkNotNullParameter(guildProfileInviteView, "guildProfileInviteView");
        this.guildProfileInviteView = guildProfileInviteView;
    }

    public final void bind(@NotNull GuildProfileInviteMessageAccessory inviteAccessory, @NotNull ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(inviteAccessory, "inviteAccessory");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        GuildProfileInviteEmbedImpl invite = inviteAccessory.getInvite();
        String messageId = inviteAccessory.getMessageId();
        int codedLinkIndex = inviteAccessory.getCodedLinkIndex();
        GuildProfileInviteView guildProfileInviteView = this.guildProfileInviteView;
        guildProfileInviteView.setHeader(invite.getHeaderText());
        guildProfileInviteView.setBanner(invite.getInviteSplash(), invite.getBannerColor(), invite.getBannerColorSecondary(), invite.getHeaderText() == null);
        guildProfileInviteView.setAvatar(invite.getThumbnailUrl(), invite.getThumbnailText());
        guildProfileInviteView.setTitle(invite.getTitleText());
        guildProfileInviteView.setGuildBadge(invite.getBadgeIconUrl());
        guildProfileInviteView.setPresence(invite.getOnlineText(), invite.getMemberText());
        guildProfileInviteView.setEstablished(invite.getEstablishedText());
        guildProfileInviteView.setBody(invite.getBodyText(), invite.getHasProfileOverflow());
        guildProfileInviteView.setRoles(invite.getRoles(), invite.getRolesHeadingText());
        guildProfileInviteView.setAcceptButton(invite.getAcceptLabelText(), invite.getAcceptLabelBackgroundColor());
        guildProfileInviteView.setClickListeners(new e(eventHandler, messageId, codedLinkIndex, 0), new e(eventHandler, messageId, codedLinkIndex, 1));
    }
}
