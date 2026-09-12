package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.media_player.MediaSource;
import com.discord.media_player.MediaType;
import com.discord.primitives.ChannelId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"EMIT_EVENT_FREQUENCY_MS", "", "ANIMATION_LENGTH_MS", "", "toAudioSource", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;", "Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "toMediaSource", "Lcom/discord/media_player/MediaSource;", "featureTag", "", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AudioPlayerUtilsKt {
    public static final int ANIMATION_LENGTH_MS = 500;
    public static final long EMIT_EVENT_FREQUENCY_MS = 50;

    @NotNull
    public static final AudioPlayerManager.AudioSource toAudioSource(@NotNull AudioAttachmentMessageAccessory audioAttachmentMessageAccessory) {
        Intrinsics.checkNotNullParameter(audioAttachmentMessageAccessory, "<this>");
        return new AudioPlayerManager.AudioSource(ChannelId.m1130boximpl(audioAttachmentMessageAccessory.m588getChannelIdo4g7jtM()), audioAttachmentMessageAccessory.getMessageId(), audioAttachmentMessageAccessory.getAttachment().getUrl(), Integer.valueOf(audioAttachmentMessageAccessory.getAttachmentIndex()), null);
    }

    @NotNull
    public static final MediaSource toMediaSource(@NotNull AudioPlayerManager.AudioSource audioSource, String str) {
        Intrinsics.checkNotNullParameter(audioSource, "<this>");
        return new MediaSource(audioSource.getUrl(), null, null, null, str == null ? a3.e.l("audio attachment: ", audioSource.getUrl()) : str, MediaType.AUDIO, false, audioSource.m763getChannelIdqMVnFVQ(), audioSource.m764getMessageId3Eiw7ao(), audioSource.getIndex(), null, null, 3150, null);
    }

    public static /* synthetic */ MediaSource toMediaSource$default(AudioPlayerManager.AudioSource audioSource, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        return toMediaSource(audioSource, str);
    }
}
