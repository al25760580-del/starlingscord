package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.media_player.MediaPlayer;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\b\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0002\b\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0002\b\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0000¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0005H\u0000¢\u0006\u0002\b&J\u0015\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0000¢\u0006\u0002\b)J\r\u0010*\u001a\u00020\u001eH\u0000¢\u0006\u0002\b+J\r\u0010,\u001a\u00020\u001eH\u0000¢\u0006\u0002\b-J\r\u0010.\u001a\u00020\u001eH\u0000¢\u0006\u0002\b/J\r\u00100\u001a\u00020\u001eH\u0000¢\u0006\u0002\b1J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u001f\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u00105\u001a\u00020\u00052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006:"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "attached", "", "<init>", "(Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;Z)V", "getAccessory", "()Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "getAttached", "()Z", "audioSource", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;", "getAudioSource", "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;", "sourceUrl", "", "getSourceUrl", "()Ljava/lang/String;", "getPlayer", "Lcom/discord/media_player/MediaPlayer;", "getPlayer$chat_release", "getMediaState", "Lcom/discord/media_player/MediaPlayer$Event;", "getMediaState$chat_release", "getCurrentProgress", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;", "getCurrentProgress$chat_release", "setCurrentProgress", "", ReactProgressBarViewManager.PROP_PROGRESS, "", "durationMs", "", "setCurrentProgress$chat_release", "(FJ)Lkotlin/Unit;", "shouldEmitDuration", "shouldEmitDuration$chat_release", "isPlaying", "wasPlayingBeforeBeingPaused", "isPlaying$chat_release", "play", "play$chat_release", "pause", "pause$chat_release", "releasePlayer", "releasePlayer$chat_release", "storeDuration", "storeDuration$chat_release", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AudioPlayerViewState {
    private final AudioAttachmentMessageAccessory accessory;
    private final boolean attached;
    private final AudioPlayerManager.AudioSource audioSource;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioPlayerViewState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AudioPlayerViewState copy$default(AudioPlayerViewState audioPlayerViewState, AudioAttachmentMessageAccessory audioAttachmentMessageAccessory, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            audioAttachmentMessageAccessory = audioPlayerViewState.accessory;
        }
        if ((i7 & 2) != 0) {
            z5 = audioPlayerViewState.attached;
        }
        return audioPlayerViewState.copy(audioAttachmentMessageAccessory, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AudioAttachmentMessageAccessory getAccessory() {
        return this.accessory;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAttached() {
        return this.attached;
    }

    @NotNull
    public final AudioPlayerViewState copy(AudioAttachmentMessageAccessory accessory, boolean attached) {
        return new AudioPlayerViewState(accessory, attached);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioPlayerViewState)) {
            return false;
        }
        AudioPlayerViewState audioPlayerViewState = (AudioPlayerViewState) other;
        return Intrinsics.areEqual(this.accessory, audioPlayerViewState.accessory) && this.attached == audioPlayerViewState.attached;
    }

    public final AudioAttachmentMessageAccessory getAccessory() {
        return this.accessory;
    }

    public final boolean getAttached() {
        return this.attached;
    }

    public final AudioPlayerManager.AudioSource getAudioSource() {
        return this.audioSource;
    }

    public final AudioPlayerManager.CurrentProgress getCurrentProgress$chat_release() {
        return AudioPlayerManager.INSTANCE.getCurrentProgress(this.audioSource);
    }

    public final MediaPlayer.Event getMediaState$chat_release() {
        return AudioPlayerManager.INSTANCE.getState(this.audioSource);
    }

    public final MediaPlayer getPlayer$chat_release() {
        return AudioPlayerManager.INSTANCE.getPlayer(this.audioSource);
    }

    public final String getSourceUrl() {
        Attachment attachment;
        AudioAttachmentMessageAccessory audioAttachmentMessageAccessory = this.accessory;
        if (audioAttachmentMessageAccessory == null || (attachment = audioAttachmentMessageAccessory.getAttachment()) == null) {
            return null;
        }
        return attachment.getUrl();
    }

    public int hashCode() {
        AudioAttachmentMessageAccessory audioAttachmentMessageAccessory = this.accessory;
        return Boolean.hashCode(this.attached) + ((audioAttachmentMessageAccessory == null ? 0 : audioAttachmentMessageAccessory.hashCode()) * 31);
    }

    public final boolean isPlaying$chat_release(boolean wasPlayingBeforeBeingPaused) {
        if (wasPlayingBeforeBeingPaused) {
            return true;
        }
        MediaPlayer player$chat_release = getPlayer$chat_release();
        if (player$chat_release != null) {
            return (player$chat_release.shouldPlay() || player$chat_release.isPlaying()) && !player$chat_release.hasError();
        }
        return false;
    }

    public final void pause$chat_release() {
        AudioPlayerManager.INSTANCE.pause(this.audioSource);
    }

    public final void play$chat_release() {
        AudioPlayerManager.INSTANCE.playOrReset(this.audioSource);
    }

    public final void releasePlayer$chat_release() {
        AudioPlayerManager.INSTANCE.releasePlayer(this.audioSource);
    }

    public final Unit setCurrentProgress$chat_release(float progress, long durationMs) {
        AudioPlayerManager.AudioSource audioSource = this.audioSource;
        if (audioSource == null) {
            return null;
        }
        AudioPlayerManager.INSTANCE.setCurrentProgress(audioSource, progress, durationMs);
        return Unit.f14616a;
    }

    public final boolean shouldEmitDuration$chat_release() {
        MediaPlayer player$chat_release = getPlayer$chat_release();
        return player$chat_release != null && player$chat_release.shouldPlay();
    }

    public final void storeDuration$chat_release() {
        AudioPlayerManager.INSTANCE.storeDuration(this.audioSource);
    }

    @NotNull
    public String toString() {
        return "AudioPlayerViewState(accessory=" + this.accessory + ", attached=" + this.attached + ")";
    }

    public AudioPlayerViewState(AudioAttachmentMessageAccessory audioAttachmentMessageAccessory, boolean z5) {
        this.accessory = audioAttachmentMessageAccessory;
        this.attached = z5;
        this.audioSource = audioAttachmentMessageAccessory != null ? AudioPlayerUtilsKt.toAudioSource(audioAttachmentMessageAccessory) : null;
    }

    public /* synthetic */ AudioPlayerViewState(AudioAttachmentMessageAccessory audioAttachmentMessageAccessory, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : audioAttachmentMessageAccessory, (i7 & 2) != 0 ? false : z5);
    }
}
