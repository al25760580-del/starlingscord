package com.discord.chat.presentation.list.delegate;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.ChatListChildView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;", "V", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "<init>", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "Landroid/view/View;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChatListItemViewHolder<V extends View> extends RecyclerView.ViewHolder {

    @NotNull
    private final V view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListItemViewHolder(@NotNull V view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        if (!(view instanceof ChatListChildView)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @NotNull
    public final V getView() {
        return this.view;
    }
}
