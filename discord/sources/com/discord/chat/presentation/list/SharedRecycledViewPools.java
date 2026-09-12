package com.discord.chat.presentation.list;

import android.view.View;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.delegate.RegularMessageDelegate;
import com.discord.chat.presentation.list.delegate.SeparatorDelegate;
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0010\u001a\u00020\u00112.\u0010\u0012\u001a*\u0012\u001c\u0012\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\b\u0012\u0006\b\u0001\u0012\u00020\u00130\u00070\u0006\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\u0014R0\u0010\u0004\u001a$\u0012\u001a\b\u0001\u0012\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\b\u0012\u0002\b\u00030\u00070\u0006\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/list/SharedRecycledViewPools;", "", "<init>", "()V", "recycledViewPoolSizes", "", "Ljava/lang/Class;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "", "chatListViewPool", "Lcom/discord/chat/presentation/list/NoneClearingRecycledViewPool;", "getChatListViewPool", "()Lcom/discord/chat/presentation/list/NoneClearingRecycledViewPool;", "chatListViewPool$delegate", "Lkotlin/Lazy;", "configureChatListViewPoolSizes", "", "delegateViewTypes", "Landroid/view/View;", "Lcom/discord/chat/presentation/list/DelegateViewTypes;", "accessoriesViewPool", "Lcom/discord/chat/presentation/list/AccessoriesViewPool;", "getAccessoriesViewPool", "()Lcom/discord/chat/presentation/list/AccessoriesViewPool;", "accessoriesViewPool$delegate", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharedRecycledViewPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedRecycledViewPools.kt\ncom/discord/chat/presentation/list/SharedRecycledViewPools\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,34:1\n216#2,2:35\n*S KotlinDebug\n*F\n+ 1 SharedRecycledViewPools.kt\ncom/discord/chat/presentation/list/SharedRecycledViewPools\n*L\n24#1:35,2\n*E\n"})
public final class SharedRecycledViewPools {

    @NotNull
    public static final SharedRecycledViewPools INSTANCE = new SharedRecycledViewPools();

    @NotNull
    private static final Map<? extends Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ?>>, Integer> recycledViewPoolSizes = w0.g(new Pair(RegularMessageDelegate.class, 50), new Pair(SystemMessageDelegate.class, 25), new Pair(SeparatorDelegate.class, 25));

    /* JADX INFO: renamed from: chatListViewPool$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy chatListViewPool = l.b(new f(2));

    /* JADX INFO: renamed from: accessoriesViewPool$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy accessoriesViewPool = l.b(new f(3));

    private SharedRecycledViewPools() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccessoriesViewPool accessoriesViewPool_delegate$lambda$2() {
        return new AccessoriesViewPool();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NoneClearingRecycledViewPool chatListViewPool_delegate$lambda$0() {
        return new NoneClearingRecycledViewPool();
    }

    public final void configureChatListViewPoolSizes(@NotNull Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> delegateViewTypes) {
        Intrinsics.checkNotNullParameter(delegateViewTypes, "delegateViewTypes");
        for (Map.Entry<? extends Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ?>>, Integer> entry : recycledViewPoolSizes.entrySet()) {
            Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ?>> key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            Integer num = delegateViewTypes.get(key);
            Intrinsics.checkNotNull(num);
            INSTANCE.getChatListViewPool().setMaxRecycledViews(num.intValue(), iIntValue);
        }
    }

    @NotNull
    public final AccessoriesViewPool getAccessoriesViewPool() {
        return (AccessoriesViewPool) accessoriesViewPool.getValue();
    }

    @NotNull
    public final NoneClearingRecycledViewPool getChatListViewPool() {
        return (NoneClearingRecycledViewPool) chatListViewPool.getValue();
    }
}
