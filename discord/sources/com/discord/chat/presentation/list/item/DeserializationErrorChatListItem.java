package com.discord.chat.presentation.list.item;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/presentation/list/item/DeserializationErrorChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", StackTraceHelper.ID_KEY, "", "json", "causeMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getJson", "getCauseMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DeserializationErrorChatListItem extends ChatListItem {

    @NotNull
    private final String causeMessage;

    @NotNull
    private final String id;

    @NotNull
    private final String json;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializationErrorChatListItem(@NotNull String id2, @NotNull String json, @NotNull String causeMessage) {
        super(id2, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(causeMessage, "causeMessage");
        this.id = id2;
        this.json = json;
        this.causeMessage = causeMessage;
    }

    public static /* synthetic */ DeserializationErrorChatListItem copy$default(DeserializationErrorChatListItem deserializationErrorChatListItem, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = deserializationErrorChatListItem.id;
        }
        if ((i7 & 2) != 0) {
            str2 = deserializationErrorChatListItem.json;
        }
        if ((i7 & 4) != 0) {
            str3 = deserializationErrorChatListItem.causeMessage;
        }
        return deserializationErrorChatListItem.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJson() {
        return this.json;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCauseMessage() {
        return this.causeMessage;
    }

    @NotNull
    public final DeserializationErrorChatListItem copy(@NotNull String id2, @NotNull String json, @NotNull String causeMessage) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(causeMessage, "causeMessage");
        return new DeserializationErrorChatListItem(id2, json, causeMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeserializationErrorChatListItem)) {
            return false;
        }
        DeserializationErrorChatListItem deserializationErrorChatListItem = (DeserializationErrorChatListItem) other;
        return Intrinsics.areEqual(this.id, deserializationErrorChatListItem.id) && Intrinsics.areEqual(this.json, deserializationErrorChatListItem.json) && Intrinsics.areEqual(this.causeMessage, deserializationErrorChatListItem.causeMessage);
    }

    @NotNull
    public final String getCauseMessage() {
        return this.causeMessage;
    }

    @Override // com.discord.chat.presentation.list.item.ChatListItem
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    public int hashCode() {
        return this.causeMessage.hashCode() + e.d(this.id.hashCode() * 31, 31, this.json);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.json;
        return a.k(e.u("DeserializationErrorChatListItem(id=", str, ", json=", str2, ", causeMessage="), this.causeMessage, ")");
    }
}
