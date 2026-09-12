package com.discord.chat.presentation.message.decorations;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.ChatListAdapter;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.logging.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "drawer", "Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;", "<init>", "(Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHighlightedMessageDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HighlightedMessageDecoration.kt\ncom/discord/chat/presentation/message/decorations/HighlightedMessageDecoration\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,39:1\n27#2,7:40\n*S KotlinDebug\n*F\n+ 1 HighlightedMessageDecoration.kt\ncom/discord/chat/presentation/message/decorations/HighlightedMessageDecoration\n*L\n15#1:40,7\n*E\n"})
public abstract class HighlightedMessageDecoration extends RecyclerView.ItemDecoration {

    @NotNull
    private final HighlightedMessageDrawer drawer;

    public HighlightedMessageDecoration(@NotNull HighlightedMessageDrawer drawer) {
        Intrinsics.checkNotNullParameter(drawer, "drawer");
        this.drawer = drawer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        int iSave = canvas.save();
        try {
            Object adapter = parent.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChatListAdapter");
            ChatListAdapter chatListAdapter = (ChatListAdapter) adapter;
            int childCount = parent.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = parent.getChildAt(i7);
                int childAdapterPosition = parent.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0 && childAdapterPosition < chatListAdapter.getChatListItems().size()) {
                    ChatListItem chatListItem = chatListAdapter.getChatListItem(childAdapterPosition);
                    if (chatListItem == null) {
                        Log log = Log.INSTANCE;
                        String simpleName = canvas.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                        Log.e$default(log, simpleName, "Missing item in position " + childAdapterPosition, (Throwable) null, 4, (Object) null);
                        return;
                    }
                    if (((Boolean) this.drawer.getShouldRenderHighlight().invoke(chatListItem)).booleanValue()) {
                        this.drawer.setPaintStyles(chatListItem);
                        HighlightedMessageDrawer highlightedMessageDrawer = this.drawer;
                        Intrinsics.checkNotNull(childAt);
                        highlightedMessageDrawer.drawHighlight(canvas, childAt, 0, 0);
                    }
                }
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
