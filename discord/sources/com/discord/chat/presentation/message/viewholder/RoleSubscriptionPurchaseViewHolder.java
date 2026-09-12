package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.messagepart.RoleSubscriptionPurchaseAccessory;
import com.discord.chat.presentation.message.view.RoleSubscriptionPurchaseView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/RoleSubscriptionPurchaseViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "roleSubscriptionPurchaseView", "Lcom/discord/chat/presentation/message/view/RoleSubscriptionPurchaseView;", "<init>", "(Lcom/discord/chat/presentation/message/view/RoleSubscriptionPurchaseView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;", "widthPx", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoleSubscriptionPurchaseViewHolder extends MessagePartViewHolder {

    @NotNull
    private final RoleSubscriptionPurchaseView roleSubscriptionPurchaseView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoleSubscriptionPurchaseViewHolder(@NotNull RoleSubscriptionPurchaseView roleSubscriptionPurchaseView) {
        super(roleSubscriptionPurchaseView, null);
        Intrinsics.checkNotNullParameter(roleSubscriptionPurchaseView, "roleSubscriptionPurchaseView");
        this.roleSubscriptionPurchaseView = roleSubscriptionPurchaseView;
    }

    public final void bind(@NotNull RoleSubscriptionPurchaseAccessory accessory, int widthPx) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        this.roleSubscriptionPurchaseView.configure(accessory.getAuthorUsername(), accessory.getAuthorAvatar(), widthPx);
    }
}
