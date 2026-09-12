package com.discord.chat.presentation.message.decorations;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.view.ForumPostActionBarView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "isForwardedMessage", "", "<init>", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Z)V", "getMargins", "()Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "getIsForwardedMessage", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageAccessoriesHorizontalSpacingDecoration extends RecyclerView.ItemDecoration {
    private final boolean isForwardedMessage;

    @NotNull
    private final MessageMargins margins;

    public MessageAccessoriesHorizontalSpacingDecoration(@NotNull MessageMargins margins, boolean z5) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        this.margins = margins;
        this.isForwardedMessage = z5;
    }

    public final boolean getIsForwardedMessage() {
        return this.isForwardedMessage;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (view instanceof ForumPostActionBarView) {
            return;
        }
        outRect.left = this.margins.getLeftMarginPx(view, this.isForwardedMessage);
        outRect.right = this.margins.getRightMarginPx();
    }

    @NotNull
    public final MessageMargins getMargins() {
        return this.margins;
    }
}
