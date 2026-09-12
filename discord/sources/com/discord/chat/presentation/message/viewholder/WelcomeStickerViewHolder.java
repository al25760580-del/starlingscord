package com.discord.chat.presentation.message.viewholder;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.message.messagepart.WelcomeStickerAccessory;
import com.discord.chat.presentation.stickers.WelcomeStickerView;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/WelcomeStickerViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/stickers/WelcomeStickerView;", "welcomeStickerView", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/sticker/Sticker;", "Lcom/discord/primitives/MessageId;", "", "onWelcomeReplyClicked", "<init>", "(Lcom/discord/chat/presentation/stickers/WelcomeStickerView;Lkotlin/jvm/functions/Function2;)V", "Lcom/discord/chat/presentation/message/messagepart/WelcomeStickerAccessory;", "welcomeStickerAccessory", "bind", "(Lcom/discord/chat/presentation/message/messagepart/WelcomeStickerAccessory;)V", "Lcom/discord/chat/presentation/stickers/WelcomeStickerView;", "Lkotlin/jvm/functions/Function2;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WelcomeStickerViewHolder extends MessagePartViewHolder {

    @NotNull
    private final Function2<Sticker, MessageId, Unit> onWelcomeReplyClicked;

    @NotNull
    private final WelcomeStickerView welcomeStickerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WelcomeStickerViewHolder(@NotNull WelcomeStickerView welcomeStickerView, @NotNull Function2<? super Sticker, ? super MessageId, Unit> onWelcomeReplyClicked) {
        super(welcomeStickerView, null);
        Intrinsics.checkNotNullParameter(welcomeStickerView, "welcomeStickerView");
        Intrinsics.checkNotNullParameter(onWelcomeReplyClicked, "onWelcomeReplyClicked");
        this.welcomeStickerView = welcomeStickerView;
        this.onWelcomeReplyClicked = onWelcomeReplyClicked;
        welcomeStickerView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
    }

    public final void bind(@NotNull WelcomeStickerAccessory welcomeStickerAccessory) {
        Intrinsics.checkNotNullParameter(welcomeStickerAccessory, "welcomeStickerAccessory");
        this.welcomeStickerView.setSticker(welcomeStickerAccessory.getSticker(), welcomeStickerAccessory.getMessage(), this.onWelcomeReplyClicked);
    }
}
