package com.discord.chat.presentation.message.view.voicemessages;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0019R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveAnimationManager;", "", "<init>", "()V", "audioChunkAnimationStarts", "", "", "[Ljava/lang/Long;", "value", "", "data", "getData", "()[B", "setData", "([B)V", "getCurrentValue", "", "index", "", "percentage", "animateAdditionalHeight", ReactProgressBarViewManager.PROP_PROGRESS, "getAnimationValues", "originalHeight", "resetIndex", "", "reset", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioWaveAnimationManager {
    private static final int FIXED_ANIMATED_HEIGHT = 4;

    @NotNull
    private Long[] audioChunkAnimationStarts = new Long[0];

    @NotNull
    private byte[] data = new byte[0];

    private final float animateAdditionalHeight(float progress) {
        float f2 = 1.0f - progress;
        float f7 = 1.5f * f2 * f2;
        if (progress <= 0.5f) {
            return (f7 + 1.0f) * progress * 2.0f * 4;
        }
        return ((f7 + 1.0f) * (progress - 0.5f) * 2.0f * (-4)) + 4;
    }

    private final float getCurrentValue(int index, float percentage) {
        if (index >= this.data.length) {
            return 0.0f;
        }
        Long[] lArr = this.audioChunkAnimationStarts;
        if (lArr[index] == null) {
            lArr[index] = Long.valueOf(System.currentTimeMillis() - ((long) (percentage * 500)));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l6 = this.audioChunkAnimationStarts[index];
        Intrinsics.checkNotNull(l6);
        long jLongValue = jCurrentTimeMillis - l6.longValue();
        if (jLongValue > 500) {
            return 1.0f;
        }
        return jLongValue / 500.0f;
    }

    public final float getAnimationValues(int index, float percentage, float originalHeight) {
        if (percentage < 0.0f) {
            return 0.0f;
        }
        return originalHeight + animateAdditionalHeight(getCurrentValue(index, percentage));
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public final void reset() {
        this.audioChunkAnimationStarts = new Long[this.data.length];
    }

    public final void resetIndex(int index) {
        this.audioChunkAnimationStarts[index] = null;
    }

    public final void setData(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.audioChunkAnimationStarts = new Long[value.length];
        this.data = value;
    }
}
