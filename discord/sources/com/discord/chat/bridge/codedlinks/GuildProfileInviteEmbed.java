package com.discord.chat.bridge.codedlinks;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\t¨\u0006!"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildProfileInviteEmbed;", "", "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "memberText", "", "getMemberText", "()Ljava/lang/String;", "onlineText", "getOnlineText", "bannerColor", "", "getBannerColor", "()I", "bannerColorSecondary", "getBannerColorSecondary", "hasProfileOverflow", "", "getHasProfileOverflow", "()Z", "badgeIconUrl", "getBadgeIconUrl", "establishedText", "getEstablishedText", "roles", "", "Lcom/discord/chat/bridge/codedlinks/InviteRole;", "getRoles", "()Ljava/util/List;", "rolesHeadingText", "getRolesHeadingText", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GuildProfileInviteEmbed {
    String getBadgeIconUrl();

    int getBannerColor();

    int getBannerColorSecondary();

    String getEstablishedText();

    @NotNull
    CodedLinkExtendedType getExtendedType();

    boolean getHasProfileOverflow();

    String getMemberText();

    String getOnlineText();

    List<InviteRole> getRoles();

    String getRolesHeadingText();
}
