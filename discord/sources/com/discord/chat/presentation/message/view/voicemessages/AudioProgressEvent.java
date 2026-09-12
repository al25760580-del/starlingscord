package com.discord.chat.presentation.message.view.voicemessages;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioProgressEvent;", "", ReactProgressBarViewManager.PROP_PROGRESS, "", "eventAction", "", "<init>", "(FI)V", "getProgress", "()F", "getEventAction", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AudioProgressEvent {
    private final int eventAction;
    private final float progress;

    public AudioProgressEvent(float f2, int i7) {
        this.progress = f2;
        this.eventAction = i7;
    }

    public static /* synthetic */ AudioProgressEvent copy$default(AudioProgressEvent audioProgressEvent, float f2, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f2 = audioProgressEvent.progress;
        }
        if ((i10 & 2) != 0) {
            i7 = audioProgressEvent.eventAction;
        }
        return audioProgressEvent.copy(f2, i7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEventAction() {
        return this.eventAction;
    }

    @NotNull
    public final AudioProgressEvent copy(float progress, int eventAction) {
        return new AudioProgressEvent(progress, eventAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioProgressEvent)) {
            return false;
        }
        AudioProgressEvent audioProgressEvent = (AudioProgressEvent) other;
        return Float.compare(this.progress, audioProgressEvent.progress) == 0 && this.eventAction == audioProgressEvent.eventAction;
    }

    public final int getEventAction() {
        return this.eventAction;
    }

    public final float getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Integer.hashCode(this.eventAction) + (Float.hashCode(this.progress) * 31);
    }

    @NotNull
    public String toString() {
        return "AudioProgressEvent(progress=" + this.progress + ", eventAction=" + this.eventAction + ")";
    }
}
