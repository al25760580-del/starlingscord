package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.messagepart.GiftIntentMessageAccessory;
import com.discord.chat.presentation.message.view.GiftIntentView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Ju\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\b2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\b2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/GiftIntentViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/GiftIntentView;", "giftIntentView", "<init>", "(Lcom/discord/chat/presentation/message/view/GiftIntentView;)V", "Lcom/discord/chat/presentation/message/messagepart/GiftIntentMessageAccessory;", "accessory", "Lkotlin/Function3;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/primitives/UserId;", "", "", "onViewed", "onPrimaryCtaTapped", "onSecondaryCtaTapped", "bind", "(Lcom/discord/chat/presentation/message/messagepart/GiftIntentMessageAccessory;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "Lcom/discord/chat/presentation/message/view/GiftIntentView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GiftIntentViewHolder extends MessagePartViewHolder {

    @NotNull
    private final GiftIntentView giftIntentView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftIntentViewHolder(@NotNull GiftIntentView giftIntentView) {
        super(giftIntentView, null);
        Intrinsics.checkNotNullParameter(giftIntentView, "giftIntentView");
        this.giftIntentView = giftIntentView;
    }

    public final void bind(@NotNull GiftIntentMessageAccessory accessory, @NotNull Function3 onViewed, @NotNull Function3 onPrimaryCtaTapped, @NotNull Function3 onSecondaryCtaTapped) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onViewed, "onViewed");
        Intrinsics.checkNotNullParameter(onPrimaryCtaTapped, "onPrimaryCtaTapped");
        Intrinsics.checkNotNullParameter(onSecondaryCtaTapped, "onSecondaryCtaTapped");
        this.giftIntentView.bind(accessory, onViewed, onPrimaryCtaTapped, onSecondaryCtaTapped);
    }
}
