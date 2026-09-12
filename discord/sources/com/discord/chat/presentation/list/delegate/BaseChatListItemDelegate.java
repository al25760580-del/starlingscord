package com.discord.chat.presentation.list.delegate;

import a3.e;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ar.u;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u0005:\u0001/B/\u0012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b#\u0010$J;\u0010(\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0006H\u0004¢\u0006\u0004\b(\u0010)R\u001e\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010.\u001a\u00020\b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "T", "Landroid/view/View;", "V", "Lcom/hannesdorfmann/adapterdelegates4/b;", "", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "eventHandlerProvider", "Lkotlin/Function1;", "", "initBlock", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "item", "", ViewProps.POSITION, "", "isForItem", "(Lcom/discord/chat/presentation/list/item/ChatListItem;I)Z", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "view", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "metadata", "bindView", "(Landroid/view/View;Lcom/discord/chat/presentation/list/item/ChatListItem;Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;)V", AlertFragment.ARG_ITEMS, "isForViewType", "(Ljava/util/List;I)Z", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "", "payloads", "onBindViewHolder", "(Ljava/util/List;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/util/List;)V", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "getEventHandler", "()Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Metadata", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseChatListItemDelegate<T extends ChatListItem, V extends View> extends com.hannesdorfmann.adapterdelegates4.b {

    @NotNull
    private final Function0<ChatEventHandler> eventHandlerProvider;

    @NotNull
    private final Function1<V, Unit> initBlock;

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0003B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J?\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "V", "Landroid/view/View;", "", "holder", "Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;", AlertFragment.ARG_ITEMS, "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "payloads", "<init>", "(Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;Ljava/util/List;Ljava/util/List;)V", "getHolder", "()Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;", "getItems", "()Ljava/util/List;", "getPayloads", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Metadata<V extends View> {

        @NotNull
        private final ChatListItemViewHolder<V> holder;

        @NotNull
        private final List<ChatListItem> items;

        @NotNull
        private final List<Object> payloads;

        /* JADX WARN: Multi-variable type inference failed */
        public Metadata(@NotNull ChatListItemViewHolder<V> holder, @NotNull List<? extends ChatListItem> items, @NotNull List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            this.holder = holder;
            this.items = items;
            this.payloads = payloads;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Metadata copy$default(Metadata metadata, ChatListItemViewHolder chatListItemViewHolder, List list, List list2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                chatListItemViewHolder = metadata.holder;
            }
            if ((i7 & 2) != 0) {
                list = metadata.items;
            }
            if ((i7 & 4) != 0) {
                list2 = metadata.payloads;
            }
            return metadata.copy(chatListItemViewHolder, list, list2);
        }

        @NotNull
        public final ChatListItemViewHolder<V> component1() {
            return this.holder;
        }

        @NotNull
        public final List<ChatListItem> component2() {
            return this.items;
        }

        @NotNull
        public final List<Object> component3() {
            return this.payloads;
        }

        @NotNull
        public final Metadata<V> copy(@NotNull ChatListItemViewHolder<V> holder, @NotNull List<? extends ChatListItem> items, @NotNull List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            return new Metadata<>(holder, items, payloads);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return Intrinsics.areEqual(this.holder, metadata.holder) && Intrinsics.areEqual(this.items, metadata.items) && Intrinsics.areEqual(this.payloads, metadata.payloads);
        }

        @NotNull
        public final ChatListItemViewHolder<V> getHolder() {
            return this.holder;
        }

        @NotNull
        public final List<ChatListItem> getItems() {
            return this.items;
        }

        @NotNull
        public final List<Object> getPayloads() {
            return this.payloads;
        }

        public int hashCode() {
            return this.payloads.hashCode() + e.f(this.items, this.holder.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            return "Metadata(holder=" + this.holder + ", items=" + this.items + ", payloads=" + this.payloads + ")";
        }
    }

    public /* synthetic */ BaseChatListItemDelegate(Function0 function0, Function1 function1, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i7 & 2) != 0 ? new u(29) : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return Unit.f14616a;
    }

    public abstract void bindView(@NotNull V view, @NotNull T item, @NotNull Metadata<V> metadata);

    @NotNull
    public abstract V createView(@NotNull ViewGroup parent);

    @NotNull
    public final ChatEventHandler getEventHandler() {
        return (ChatEventHandler) this.eventHandlerProvider.invoke();
    }

    public abstract boolean isForItem(@NotNull ChatListItem item, int position);

    @Override // com.hannesdorfmann.adapterdelegates4.b
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, int i7, RecyclerView.ViewHolder viewHolder, List list) {
        onBindViewHolder((List<? extends ChatListItem>) obj, i7, viewHolder, (List<? extends Object>) list);
    }

    @Override // com.hannesdorfmann.adapterdelegates4.b
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewCreateView = createView(parent);
        this.initBlock.invoke(viewCreateView);
        return new ChatListItemViewHolder(viewCreateView);
    }

    @Override // com.hannesdorfmann.adapterdelegates4.b
    public final boolean isForViewType(@NotNull List<? extends ChatListItem> items, int position) {
        Intrinsics.checkNotNullParameter(items, "items");
        return isForItem(items.get(position), position);
    }

    public final void onBindViewHolder(@NotNull List<? extends ChatListItem> items, int position, @NotNull RecyclerView.ViewHolder holder, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        ChatListItemViewHolder chatListItemViewHolder = (ChatListItemViewHolder) holder;
        ChatListItem chatListItem = items.get(position);
        Intrinsics.checkNotNull(chatListItem, "null cannot be cast to non-null type T of com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate");
        Metadata<V> metadata = new Metadata<>(chatListItemViewHolder, items, payloads);
        bindView(chatListItemViewHolder.getView(), chatListItem, metadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseChatListItemDelegate(@NotNull Function0<? extends ChatEventHandler> eventHandlerProvider, @NotNull Function1<? super V, Unit> initBlock) {
        Intrinsics.checkNotNullParameter(eventHandlerProvider, "eventHandlerProvider");
        Intrinsics.checkNotNullParameter(initBlock, "initBlock");
        this.eventHandlerProvider = eventHandlerProvider;
        this.initBlock = initBlock;
    }
}
