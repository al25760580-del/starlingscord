package com.discord.chat.bridge.codedlinks;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0012\u0010\u0017\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\tR\u0012\u0010\u0019\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0012\u0010\"\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/VoiceChannelListInviteEmbed;", "", "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "guildIcon", "", "getGuildIcon", "()Ljava/lang/String;", "guildName", "getGuildName", "voiceUsers", "", "Lcom/discord/chat/bridge/codedlinks/VoiceUser;", "getVoiceUsers", "()Ljava/util/List;", "voiceStartTimestamp", "", "getVoiceStartTimestamp", "()Ljava/lang/Long;", "emptyStateText", "getEmptyStateText", "streamingLabel", "getStreamingLabel", "voiceHeaderBackgroundColor", "", "getVoiceHeaderBackgroundColor", "()I", "reducedMotion", "", "getReducedMotion", "()Z", "isConnected", "privacyHintText", "getPrivacyHintText", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface VoiceChannelListInviteEmbed {
    @NotNull
    String getEmptyStateText();

    @NotNull
    CodedLinkExtendedType getExtendedType();

    String getGuildIcon();

    String getGuildName();

    @NotNull
    String getPrivacyHintText();

    boolean getReducedMotion();

    @NotNull
    String getStreamingLabel();

    int getVoiceHeaderBackgroundColor();

    Long getVoiceStartTimestamp();

    List<VoiceUser> getVoiceUsers();

    boolean isConnected();
}
