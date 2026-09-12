package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.codedlinks.VoiceUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/view/VoiceUserItem;", "", "user", "Lcom/discord/chat/bridge/codedlinks/VoiceUser;", "streamingLabel", "", "<init>", "(Lcom/discord/chat/bridge/codedlinks/VoiceUser;Ljava/lang/String;)V", "getUser", "()Lcom/discord/chat/bridge/codedlinks/VoiceUser;", "getStreamingLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VoiceUserItem {

    @NotNull
    private final String streamingLabel;

    @NotNull
    private final VoiceUser user;

    public VoiceUserItem(@NotNull VoiceUser user, @NotNull String streamingLabel) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(streamingLabel, "streamingLabel");
        this.user = user;
        this.streamingLabel = streamingLabel;
    }

    public static /* synthetic */ VoiceUserItem copy$default(VoiceUserItem voiceUserItem, VoiceUser voiceUser, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            voiceUser = voiceUserItem.user;
        }
        if ((i7 & 2) != 0) {
            str = voiceUserItem.streamingLabel;
        }
        return voiceUserItem.copy(voiceUser, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VoiceUser getUser() {
        return this.user;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStreamingLabel() {
        return this.streamingLabel;
    }

    @NotNull
    public final VoiceUserItem copy(@NotNull VoiceUser user, @NotNull String streamingLabel) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(streamingLabel, "streamingLabel");
        return new VoiceUserItem(user, streamingLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceUserItem)) {
            return false;
        }
        VoiceUserItem voiceUserItem = (VoiceUserItem) other;
        return Intrinsics.areEqual(this.user, voiceUserItem.user) && Intrinsics.areEqual(this.streamingLabel, voiceUserItem.streamingLabel);
    }

    @NotNull
    public final String getStreamingLabel() {
        return this.streamingLabel;
    }

    @NotNull
    public final VoiceUser getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.streamingLabel.hashCode() + (this.user.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VoiceUserItem(user=" + this.user + ", streamingLabel=" + this.streamingLabel + ")";
    }
}
