package com.discord.chat.presentation.list;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.avatar.decoration.DecorationView;
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"configureMessageRecyclerView", "", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", DecorationView.CACHE_DIRECTORY, "", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;[Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListUtils.kt\ncom/discord/chat/presentation/list/ChatListUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,34:1\n13472#2,2:35\n*S KotlinDebug\n*F\n+ 1 ChatListUtils.kt\ncom/discord/chat/presentation/list/ChatListUtilsKt\n*L\n18#1:35,2\n*E\n"})
public final class ChatListUtilsKt {
    public static final void configureMessageRecyclerView(@NotNull RecyclerView recyclerView, @NotNull Context context, @NotNull RecyclerView.ItemDecoration... decorations) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(decorations, "decorations");
        recyclerView.addItemDecoration(new BackgroundHighlightDecoration(context));
        recyclerView.setItemViewCacheSize(5);
        for (RecyclerView.ItemDecoration itemDecoration : decorations) {
            recyclerView.addItemDecoration(itemDecoration);
        }
        recyclerView.setItemAnimator(null);
    }
}
