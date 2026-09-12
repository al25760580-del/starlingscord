package com.discord.chat.presentation.list;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B3\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;", "", "", "updateId", "Lkotlin/Function1;", "", "", "preCommit", "Lkotlin/Function0;", "postCommit", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "I", "getUpdateId", "()I", "Lkotlin/jvm/functions/Function1;", "getPreCommit", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "getPostCommit", "()Lkotlin/jvm/functions/Function0;", "Lcom/discord/chat/presentation/list/ChatListItemUpdate;", "Lcom/discord/chat/presentation/list/PortalViewUpdate;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ChannelChatListAdapterUpdate {

    @NotNull
    private final Function0<Unit> postCommit;

    @NotNull
    private final Function1<Boolean, Unit> preCommit;
    private final int updateId;

    public /* synthetic */ ChannelChatListAdapterUpdate(int i7, Function1 function1, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, function1, function0);
    }

    @NotNull
    public Function0<Unit> getPostCommit() {
        return this.postCommit;
    }

    @NotNull
    public Function1<Boolean, Unit> getPreCommit() {
        return this.preCommit;
    }

    public int getUpdateId() {
        return this.updateId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ChannelChatListAdapterUpdate(int i7, Function1<? super Boolean, Unit> function1, Function0<Unit> function0) {
        this.updateId = i7;
        this.preCommit = function1;
        this.postCommit = function0;
    }
}
