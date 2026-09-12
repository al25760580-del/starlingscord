package com.discord.mobile_voice_overlay.views;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/VoiceUserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "overlayVoiceBubble", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "<init>", "(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;)V", "getOverlayVoiceBubble", "()Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "bind", "", "user", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class VoiceUserViewHolder extends RecyclerView.ViewHolder {

    @NotNull
    private final OverlayVoiceBubble overlayVoiceBubble;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceUserViewHolder(@NotNull OverlayVoiceBubble overlayVoiceBubble) {
        super(overlayVoiceBubble);
        Intrinsics.checkNotNullParameter(overlayVoiceBubble, "overlayVoiceBubble");
        this.overlayVoiceBubble = overlayVoiceBubble;
    }

    public final void bind(@NotNull MobileVoiceOverlayDataUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.overlayVoiceBubble.configureUI(user);
    }

    @NotNull
    public final OverlayVoiceBubble getOverlayVoiceBubble() {
        return this.overlayVoiceBubble;
    }
}
