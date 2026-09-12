package com.discord.chat.presentation.message.viewholder;

import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory;
import com.discord.fonts.DiscordFontUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/TimestampViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "timestampView", "Landroid/widget/TextView;", "<init>", "(Landroid/widget/TextView;)V", "bind", "", "timestampItem", "Lcom/discord/chat/presentation/message/messagepart/TimestampMessageAccessory;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimestampViewHolder extends MessagePartViewHolder {

    @NotNull
    private final TextView timestampView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimestampViewHolder(@NotNull TextView timestampView) {
        super(timestampView, null);
        Intrinsics.checkNotNullParameter(timestampView, "timestampView");
        this.timestampView = timestampView;
    }

    public final void bind(@NotNull TimestampMessageAccessory timestampItem) {
        Intrinsics.checkNotNullParameter(timestampItem, "timestampItem");
        this.timestampView.setText(timestampItem.getTimestamp());
        SetTextSizeSpKt.setTextSizeSp(this.timestampView, 12.0f);
        this.timestampView.setTextColor(timestampItem.getTextColor());
        DiscordFontUtilsKt.setDiscordFont(this.timestampView, timestampItem.getDiscordFont());
    }
}
