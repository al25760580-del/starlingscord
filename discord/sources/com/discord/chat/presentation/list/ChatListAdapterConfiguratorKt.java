package com.discord.chat.presentation.list;

import android.view.View;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.AutomodSystemMessageDelegate;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.delegate.BlockedGroupDelegate;
import com.discord.chat.presentation.list.delegate.CallSystemMessageDelegate;
import com.discord.chat.presentation.list.delegate.DeserializationErrorDelegate;
import com.discord.chat.presentation.list.delegate.DeserializationErrorMessageDelegate;
import com.discord.chat.presentation.list.delegate.LoadingDelegate;
import com.discord.chat.presentation.list.delegate.PortalViewDelegate;
import com.discord.chat.presentation.list.delegate.RegularMessageDelegate;
import com.discord.chat.presentation.list.delegate.SeparatorDelegate;
import com.discord.chat.presentation.list.delegate.SummarySeparatorDelegate;
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aj\u0010\u0000\u001a&\u0012\u001c\u0012\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0006\b\u0001\u0012\u00020\u00050\u00030\u0002\u0012\u0004\u0012\u00020\u00060\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\b2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r2\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, d2 = {"chatListAdapterConfigurator", "", "Ljava/lang/Class;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "Landroid/view/View;", "", "delegatesManager", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;", "", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "messageComponentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "messageAccessoriesRecycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatListAdapterConfigurator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListAdapterConfigurator.kt\ncom/discord/chat/presentation/list/ChatListAdapterConfiguratorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1869#2,2:67\n*S KotlinDebug\n*F\n+ 1 ChatListAdapterConfigurator.kt\ncom/discord/chat/presentation/list/ChatListAdapterConfiguratorKt\n*L\n59#1:67,2\n*E\n"})
public final class ChatListAdapterConfiguratorKt {
    @NotNull
    public static final Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> chatListAdapterConfigurator(@NotNull AdapterDelegatesManager delegatesManager, @NotNull Function0<? extends ChatEventHandler> eventHandlerProvider, @NotNull Function0<ComponentProvider> messageComponentProvider, @NotNull RecyclerView.RecycledViewPool messageAccessoriesRecycledViewPool) {
        int iD;
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        Intrinsics.checkNotNullParameter(eventHandlerProvider, "eventHandlerProvider");
        Intrinsics.checkNotNullParameter(messageComponentProvider, "messageComponentProvider");
        Intrinsics.checkNotNullParameter(messageAccessoriesRecycledViewPool, "messageAccessoriesRecycledViewPool");
        HashMap map = new HashMap();
        for (BaseChatListItemDelegate baseChatListItemDelegate : d0.g(new RegularMessageDelegate(eventHandlerProvider, messageComponentProvider, messageAccessoriesRecycledViewPool), new SystemMessageDelegate(eventHandlerProvider, messageAccessoriesRecycledViewPool), new AutomodSystemMessageDelegate(eventHandlerProvider, messageComponentProvider, messageAccessoriesRecycledViewPool), new CallSystemMessageDelegate(eventHandlerProvider), new SeparatorDelegate(eventHandlerProvider), new SummarySeparatorDelegate(eventHandlerProvider), new LoadingDelegate(eventHandlerProvider), new BlockedGroupDelegate(eventHandlerProvider, messageComponentProvider), new PortalViewDelegate(eventHandlerProvider), new DeserializationErrorMessageDelegate(eventHandlerProvider), new DeserializationErrorDelegate(eventHandlerProvider))) {
            SparseArrayCompat sparseArrayCompat = delegatesManager.f6654a;
            int iG = sparseArrayCompat.g();
            while (sparseArrayCompat.c(iG) != null) {
                iG++;
                if (iG == 2147483646) {
                    throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
                }
            }
            if (baseChatListItemDelegate == null) {
                throw new NullPointerException("AdapterDelegate is null!");
            }
            if (iG == 2147483646) {
                throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
            }
            if (sparseArrayCompat.c(iG) != null) {
                StringBuilder sbS = a3.e.s(iG, "An AdapterDelegate is already registered for the viewType = ", ". Already registered AdapterDelegate is ");
                sbS.append(sparseArrayCompat.c(iG));
                throw new IllegalArgumentException(sbS.toString());
            }
            sparseArrayCompat.e(iG, baseChatListItemDelegate);
            Class<?> cls = baseChatListItemDelegate.getClass();
            SparseArrayCompat sparseArrayCompat2 = delegatesManager.f6654a;
            if (sparseArrayCompat2.f1223d) {
                l.a(sparseArrayCompat2);
            }
            int i7 = sparseArrayCompat2.f1226v;
            int i10 = 0;
            while (true) {
                iD = -1;
                if (i10 >= i7) {
                    i10 = -1;
                    break;
                }
                if (sparseArrayCompat2.f1225i[i10] == baseChatListItemDelegate) {
                    break;
                }
                i10++;
            }
            if (i10 != -1) {
                iD = sparseArrayCompat2.d(i10);
            }
            map.put(cls, Integer.valueOf(iD));
        }
        return map;
    }
}
