package com.discord.chat.bridge.codedlinks;

import com.discord.chat.bridge.structurabletext.StructurableText;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbed;", "", "channelIcon", "", "getChannelIcon", "()Ljava/lang/String;", "participantAvatarUris", "", "getParticipantAvatarUris", "()Ljava/util/List;", "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "structurableSubtitleText", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getStructurableSubtitleText", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "noParticipantsText", "getNoParticipantsText", "ctaEnabled", "", "getCtaEnabled", "()Z", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface EmbeddedActivityInviteEmbed {
    String getChannelIcon();

    boolean getCtaEnabled();

    @NotNull
    CodedLinkExtendedType getExtendedType();

    @NotNull
    String getNoParticipantsText();

    @NotNull
    List<String> getParticipantAvatarUris();

    StructurableText getStructurableSubtitleText();
}
