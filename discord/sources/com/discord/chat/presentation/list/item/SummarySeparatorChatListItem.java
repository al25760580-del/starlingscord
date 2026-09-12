package com.discord.chat.presentation.list.item;

import a3.e;
import com.discord.chat.bridge.summaries.Summary;
import com.discord.chat.presentation.list.a;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012¨\u0006!"}, d2 = {"Lcom/discord/chat/presentation/list/item/SummarySeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.COLOR, "", "summary", "Lcom/discord/chat/bridge/summaries/Summary;", "isBeforeContent", "", "<init>", "(ILcom/discord/chat/bridge/summaries/Summary;Z)V", "getColor", "()I", "getSummary", "()Lcom/discord/chat/bridge/summaries/Summary;", "()Z", "text", "", "getText", "()Ljava/lang/String;", "currentMsgId", "Lcom/discord/primitives/MessageId;", "getCurrentMsgId-3Eiw7ao", "jumpToMsgId", "getJumpToMsgId-3Eiw7ao", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SummarySeparatorChatListItem extends ChatListItem {
    private final int color;
    private final boolean isBeforeContent;

    @NotNull
    private final Summary summary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySeparatorChatListItem(int i7, @NotNull Summary summary, boolean z5) {
        super(e.m("separator: ", summary.getId(), "-", z5 ? ViewProps.START : ViewProps.END), null);
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.color = i7;
        this.summary = summary;
        this.isBeforeContent = z5;
    }

    public static /* synthetic */ SummarySeparatorChatListItem copy$default(SummarySeparatorChatListItem summarySeparatorChatListItem, int i7, Summary summary, boolean z5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = summarySeparatorChatListItem.color;
        }
        if ((i10 & 2) != 0) {
            summary = summarySeparatorChatListItem.summary;
        }
        if ((i10 & 4) != 0) {
            z5 = summarySeparatorChatListItem.isBeforeContent;
        }
        return summarySeparatorChatListItem.copy(i7, summary, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Summary getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsBeforeContent() {
        return this.isBeforeContent;
    }

    @NotNull
    public final SummarySeparatorChatListItem copy(int color, @NotNull Summary summary, boolean isBeforeContent) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new SummarySeparatorChatListItem(color, summary, isBeforeContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummarySeparatorChatListItem)) {
            return false;
        }
        SummarySeparatorChatListItem summarySeparatorChatListItem = (SummarySeparatorChatListItem) other;
        return this.color == summarySeparatorChatListItem.color && Intrinsics.areEqual(this.summary, summarySeparatorChatListItem.summary) && this.isBeforeContent == summarySeparatorChatListItem.isBeforeContent;
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: getCurrentMsgId-3Eiw7ao, reason: not valid java name */
    public final String m532getCurrentMsgId3Eiw7ao() {
        return this.isBeforeContent ? this.summary.m461getStartId3Eiw7ao() : this.summary.m460getEndId3Eiw7ao();
    }

    @NotNull
    /* JADX INFO: renamed from: getJumpToMsgId-3Eiw7ao, reason: not valid java name */
    public final String m533getJumpToMsgId3Eiw7ao() {
        return this.isBeforeContent ? this.summary.m460getEndId3Eiw7ao() : this.summary.m461getStartId3Eiw7ao();
    }

    @NotNull
    public final Summary getSummary() {
        return this.summary;
    }

    @NotNull
    public final String getText() {
        return this.summary.getTopic();
    }

    public int hashCode() {
        return Boolean.hashCode(this.isBeforeContent) + ((this.summary.hashCode() + (Integer.hashCode(this.color) * 31)) * 31);
    }

    public final boolean isBeforeContent() {
        return this.isBeforeContent;
    }

    @NotNull
    public String toString() {
        int i7 = this.color;
        Summary summary = this.summary;
        boolean z5 = this.isBeforeContent;
        StringBuilder sb2 = new StringBuilder("SummarySeparatorChatListItem(color=");
        sb2.append(i7);
        sb2.append(", summary=");
        sb2.append(summary);
        sb2.append(", isBeforeContent=");
        return a.m(sb2, z5, ")");
    }
}
