package com.discord.chat.presentation.list.item;

import com.discord.misc.utilities.ids.IdUtilsKt;
import com.facebook.react.devsupport.StackTraceHelper;
import i6.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/presentation/list/item/ChatListItem;", "", StackTraceHelper.ID_KEY, "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "recyclerItemId", "", "getRecyclerItemId", "()J", "recyclerItemId$delegate", "Lkotlin/Lazy;", "Lcom/discord/chat/presentation/list/item/AutomodSystemMessageItem;", "Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;", "Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;", "Lcom/discord/chat/presentation/list/item/DeserializationErrorChatListItem;", "Lcom/discord/chat/presentation/list/item/DeserializationErrorMessageItem;", "Lcom/discord/chat/presentation/list/item/LoadingChatListItem;", "Lcom/discord/chat/presentation/list/item/MessageItem;", "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "Lcom/discord/chat/presentation/list/item/SeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/SummarySeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/SystemMessageItem;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ChatListItem {

    @NotNull
    private final String id;

    /* JADX INFO: renamed from: recyclerItemId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recyclerItemId;

    public /* synthetic */ ChatListItem(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long recyclerItemId_delegate$lambda$0(ChatListItem chatListItem) {
        return IdUtilsKt.convertToId(chatListItem.getId());
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    public final long getRecyclerItemId() {
        return ((Number) this.recyclerItemId.getValue()).longValue();
    }

    private ChatListItem(String str) {
        this.id = str;
        this.recyclerItemId = l.a(m.f19487i, new a(15, this));
    }
}
