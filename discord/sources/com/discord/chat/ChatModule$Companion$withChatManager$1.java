package com.discord.chat;

import com.discord.chat.listmanager.ChatListManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@d(c = "com.discord.chat.ChatModule$Companion$withChatManager$1", f = "ChatModule.kt", l = {168}, m = "invokeSuspend")
public final class ChatModule$Companion$withChatManager$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Function2<ChatListManager, Continuation, Object> $block;
    final /* synthetic */ ChatListManager $manager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatModule$Companion$withChatManager$1(Function2<? super ChatListManager, ? super Continuation, ? extends Object> function2, ChatListManager chatListManager, Continuation continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$manager = chatListManager;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatModule$Companion$withChatManager$1(this.$block, this.$manager, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f22354d;
        int i7 = this.label;
        if (i7 == 0) {
            ib.a.L(obj);
            Function2<ChatListManager, Continuation, Object> function2 = this.$block;
            ChatListManager chatListManager = this.$manager;
            this.label = 1;
            if (function2.invoke(chatListManager, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        return Unit.f14616a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChatModule$Companion$withChatManager$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
