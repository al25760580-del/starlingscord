package com.discord.chat.presentation.list;

import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ar.b0;
import ar.k0;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.delegate.RegularMessageDelegate;
import com.discord.chat.presentation.list.delegate.SeparatorDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.message.MessageAccessoriesAdapter;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import fr.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2*\u0010\r\u001a&\u0012\u001c\u0012\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0006\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00050\u0004\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"0\u0010\u0003\u001a$\u0012\u001a\b\u0001\u0012\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0006\u0012\u0002\b\u00030\u00050\u0004\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"accessoriesToCreate", "", "", "recycledViewPoolSizes", "Ljava/lang/Class;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "fillChatList", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "chatListAdapter", "Lcom/discord/chat/presentation/list/BaseChatListAdapter;", "delegateViewTypes", "Landroid/view/View;", "chatListViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "fillAccessories", "accessoriesAdapter", "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;", "accessoriesViewPool", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ChatListViewFactoryKt {

    @NotNull
    private static final Map<Integer, Integer> accessoriesToCreate = w0.g(new Pair(0, 25), new Pair(4, 15), new Pair(1, 6), new Pair(12, 10), new Pair(26, 5), new Pair(50, 5), new Pair(49, 20));

    @NotNull
    private static final Map<? extends Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ?>>, Integer> recycledViewPoolSizes = w0.g(new Pair(RegularMessageDelegate.class, 40), new Pair(SeparatorDelegate.class, 10));

    /* JADX INFO: renamed from: com.discord.chat.presentation.list.ChatListViewFactoryKt$fillAccessories$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.presentation.list.ChatListViewFactoryKt$fillAccessories$1", f = "ChatListViewFactory.kt", l = {90}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nChatListViewFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListViewFactory.kt\ncom/discord/chat/presentation/list/ChatListViewFactoryKt$fillAccessories$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,104:1\n216#2,2:105\n*S KotlinDebug\n*F\n+ 1 ChatListViewFactory.kt\ncom/discord/chat/presentation/list/ChatListViewFactoryKt$fillAccessories$1\n*L\n79#1:105,2\n*E\n"})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ MessageAccessoriesAdapter $accessoriesAdapter;
        final /* synthetic */ RecyclerView.RecycledViewPool $accessoriesViewPool;
        final /* synthetic */ RecyclerView $recycler;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MessageAccessoriesAdapter messageAccessoriesAdapter, RecyclerView recyclerView, RecyclerView.RecycledViewPool recycledViewPool, Continuation continuation) {
            super(2, continuation);
            this.$accessoriesAdapter = messageAccessoriesAdapter;
            this.$recycler = recyclerView;
            this.$accessoriesViewPool = recycledViewPool;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$accessoriesAdapter, this.$recycler, this.$accessoriesViewPool, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            RecyclerView recyclerView;
            RecyclerView.RecycledViewPool recycledViewPool;
            MessageAccessoriesAdapter messageAccessoriesAdapter;
            Iterator it;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                Map map = ChatListViewFactoryKt.accessoriesToCreate;
                MessageAccessoriesAdapter messageAccessoriesAdapter2 = this.$accessoriesAdapter;
                RecyclerView recyclerView2 = this.$recycler;
                recyclerView = recyclerView2;
                recycledViewPool = this.$accessoriesViewPool;
                messageAccessoriesAdapter = messageAccessoriesAdapter2;
                it = map.entrySet().iterator();
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$3;
                recycledViewPool = (RecyclerView.RecycledViewPool) this.L$2;
                recyclerView = (RecyclerView) this.L$1;
                messageAccessoriesAdapter = (MessageAccessoriesAdapter) this.L$0;
                ib.a.L(obj);
            }
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                int iIntValue2 = ((Number) entry.getValue()).intValue();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < iIntValue2; i10++) {
                    RecyclerView.ViewHolder viewHolderCreateViewHolder = messageAccessoriesAdapter.createViewHolder(recyclerView, iIntValue);
                    Intrinsics.checkNotNullExpressionValue(viewHolderCreateViewHolder, "createViewHolder(...)");
                    MessagePartViewHolder messagePartViewHolder = (MessagePartViewHolder) viewHolderCreateViewHolder;
                    KeyEvent.Callback itemView = messagePartViewHolder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    if (itemView instanceof FactoryCreatable) {
                        ((FactoryCreatable) itemView).onFactoryCreate();
                    }
                    arrayList.add(messagePartViewHolder);
                }
                hr.e eVar = k0.f2938a;
                br.d dVar = q.f9394a;
                ChatListViewFactoryKt$fillAccessories$1$1$1 chatListViewFactoryKt$fillAccessories$1$1$1 = new ChatListViewFactoryKt$fillAccessories$1$1$1(arrayList, recycledViewPool, null);
                this.L$0 = messageAccessoriesAdapter;
                this.L$1 = recyclerView;
                this.L$2 = recycledViewPool;
                this.L$3 = it;
                this.label = 1;
                if (b0.A(dVar, chatListViewFactoryKt$fillAccessories$1$1$1, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.list.ChatListViewFactoryKt$fillChatList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.presentation.list.ChatListViewFactoryKt$fillChatList$1", f = "ChatListViewFactory.kt", l = {ChatViewRecyclerTypes.REFERRAL_REDESIGN}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nChatListViewFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListViewFactory.kt\ncom/discord/chat/presentation/list/ChatListViewFactoryKt$fillChatList$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,104:1\n216#2,2:105\n*S KotlinDebug\n*F\n+ 1 ChatListViewFactory.kt\ncom/discord/chat/presentation/list/ChatListViewFactoryKt$fillChatList$1\n*L\n46#1:105,2\n*E\n"})
    public static final class C01151 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ BaseChatListAdapter $chatListAdapter;
        final /* synthetic */ RecyclerView.RecycledViewPool $chatListViewPool;
        final /* synthetic */ Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> $delegateViewTypes;
        final /* synthetic */ RecyclerView $recycler;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01151(Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> map, BaseChatListAdapter baseChatListAdapter, RecyclerView recyclerView, RecyclerView.RecycledViewPool recycledViewPool, Continuation continuation) {
            super(2, continuation);
            this.$delegateViewTypes = map;
            this.$chatListAdapter = baseChatListAdapter;
            this.$recycler = recyclerView;
            this.$chatListViewPool = recycledViewPool;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01151(this.$delegateViewTypes, this.$chatListAdapter, this.$recycler, this.$chatListViewPool, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            RecyclerView recyclerView;
            BaseChatListAdapter baseChatListAdapter;
            RecyclerView.RecycledViewPool recycledViewPool;
            Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> map;
            Iterator it;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                Map map2 = ChatListViewFactoryKt.recycledViewPoolSizes;
                Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> map3 = this.$delegateViewTypes;
                BaseChatListAdapter baseChatListAdapter2 = this.$chatListAdapter;
                recyclerView = this.$recycler;
                baseChatListAdapter = baseChatListAdapter2;
                recycledViewPool = this.$chatListViewPool;
                map = map3;
                it = map2.entrySet().iterator();
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$4;
                recycledViewPool = (RecyclerView.RecycledViewPool) this.L$3;
                recyclerView = (RecyclerView) this.L$2;
                baseChatListAdapter = (BaseChatListAdapter) this.L$1;
                map = (Map) this.L$0;
                ib.a.L(obj);
            }
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Class cls = (Class) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                Integer num = map.get(cls);
                Intrinsics.checkNotNull(num);
                int iIntValue2 = num.intValue();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < iIntValue; i10++) {
                    RecyclerView.ViewHolder viewHolderCreateViewHolder = baseChatListAdapter.createViewHolder(recyclerView, iIntValue2);
                    KeyEvent.Callback itemView = viewHolderCreateViewHolder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    if (itemView instanceof FactoryCreatable) {
                        ((FactoryCreatable) itemView).onFactoryCreate();
                    }
                    arrayList.add(viewHolderCreateViewHolder);
                }
                hr.e eVar = k0.f2938a;
                br.d dVar = q.f9394a;
                ChatListViewFactoryKt$fillChatList$1$1$1 chatListViewFactoryKt$fillChatList$1$1$1 = new ChatListViewFactoryKt$fillChatList$1$1$1(arrayList, recycledViewPool, null);
                this.L$0 = map;
                this.L$1 = baseChatListAdapter;
                this.L$2 = recyclerView;
                this.L$3 = recycledViewPool;
                this.L$4 = it;
                this.label = 1;
                if (b0.A(dVar, chatListViewFactoryKt$fillChatList$1$1$1, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01151) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    public static final void fillAccessories(@NotNull RecyclerView recycler, @NotNull MessageAccessoriesAdapter accessoriesAdapter, @NotNull RecyclerView.RecycledViewPool accessoriesViewPool) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(accessoriesAdapter, "accessoriesAdapter");
        Intrinsics.checkNotNullParameter(accessoriesViewPool, "accessoriesViewPool");
        b0.t(CoroutineViewUtilsKt.attachedScope(recycler, false), k0.f2938a, new AnonymousClass1(accessoriesAdapter, recycler, accessoriesViewPool, null), 2);
    }

    public static final void fillChatList(@NotNull RecyclerView recycler, @NotNull BaseChatListAdapter chatListAdapter, @NotNull Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> delegateViewTypes, @NotNull RecyclerView.RecycledViewPool chatListViewPool) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(chatListAdapter, "chatListAdapter");
        Intrinsics.checkNotNullParameter(delegateViewTypes, "delegateViewTypes");
        Intrinsics.checkNotNullParameter(chatListViewPool, "chatListViewPool");
        b0.t(CoroutineViewUtilsKt.attachedScope(recycler, false), k0.f2938a, new C01151(delegateViewTypes, chatListAdapter, recycler, chatListViewPool, null), 2);
    }
}
