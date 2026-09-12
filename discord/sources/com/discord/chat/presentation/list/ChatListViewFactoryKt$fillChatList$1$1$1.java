package com.discord.chat.presentation.list;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@xn.d(c = "com.discord.chat.presentation.list.ChatListViewFactoryKt$fillChatList$1$1$1", f = "ChatListViewFactory.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension({"SMAP\nChatListViewFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListViewFactory.kt\ncom/discord/chat/presentation/list/ChatListViewFactoryKt$fillChatList$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1869#2,2:105\n*S KotlinDebug\n*F\n+ 1 ChatListViewFactory.kt\ncom/discord/chat/presentation/list/ChatListViewFactoryKt$fillChatList$1$1$1\n*L\n59#1:105,2\n*E\n"})
public final class ChatListViewFactoryKt$fillChatList$1$1$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ RecyclerView.RecycledViewPool $chatListViewPool;
    final /* synthetic */ List<RecyclerView.ViewHolder> $items;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListViewFactoryKt$fillChatList$1$1$1(List<RecyclerView.ViewHolder> list, RecyclerView.RecycledViewPool recycledViewPool, Continuation continuation) {
        super(2, continuation);
        this.$items = list;
        this.$chatListViewPool = recycledViewPool;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatListViewFactoryKt$fillChatList$1$1$1(this.$items, this.$chatListViewPool, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ib.a.L(obj);
        List<RecyclerView.ViewHolder> list = this.$items;
        RecyclerView.RecycledViewPool recycledViewPool = this.$chatListViewPool;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            recycledViewPool.putRecycledView((RecyclerView.ViewHolder) it.next());
        }
        return Unit.f14616a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChatListViewFactoryKt$fillChatList$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
