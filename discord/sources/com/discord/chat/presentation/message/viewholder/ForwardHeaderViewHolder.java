package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.view.ForwardHeaderView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ForwardHeaderViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "headerView", "Lcom/discord/chat/presentation/message/view/ForwardHeaderView;", "<init>", "(Lcom/discord/chat/presentation/message/view/ForwardHeaderView;)V", "bind", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ForwardHeaderViewHolder extends MessagePartViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForwardHeaderViewHolder(@NotNull ForwardHeaderView headerView) {
        super(headerView, null);
        Intrinsics.checkNotNullParameter(headerView, "headerView");
    }

    public final void bind() {
    }
}
