package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8gX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioProgressView;", "", "shouldAnimate", "", "getShouldAnimate", "()Z", "setShouldAnimate", "(Z)V", "defaultPaintColor", "", "getDefaultPaintColor", "()I", "setDefaultPaintColor", "(I)V", "audioProgressPaintColor", "getAudioProgressPaintColor", "setAudioProgressPaintColor", "setAudioProgress", "", "audioProgress", "", "finishAnimation", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AudioProgressView {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void setAudioProgress$default(AudioProgressView audioProgressView, float f2, boolean z5, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAudioProgress");
            }
            if ((i7 & 2) != 0) {
                z5 = false;
            }
            audioProgressView.setAudioProgress(f2, z5);
        }
    }

    int getAudioProgressPaintColor();

    int getDefaultPaintColor();

    boolean getShouldAnimate();

    void setAudioProgress(float audioProgress, boolean finishAnimation);

    void setAudioProgressPaintColor(int i7);

    void setDefaultPaintColor(int i7);

    void setShouldAnimate(boolean z5);
}
