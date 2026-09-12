package com.discord.chat.presentation.list;

import ar.u;
import com.discord.chat.presentation.list.item.PortalViewChatListItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/list/PortalViewUpdate;", "Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;", "portalChatListItem", "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "updateId", "", "<init>", "(Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;I)V", "getPortalChatListItem", "()Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "getUpdateId", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PortalViewUpdate extends ChannelChatListAdapterUpdate {
    private final PortalViewChatListItem portalChatListItem;
    private final int updateId;

    public PortalViewUpdate(PortalViewChatListItem portalViewChatListItem, int i7) {
        super(i7, new u(28), new f(1), null);
        this.portalChatListItem = portalViewChatListItem;
        this.updateId = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(boolean z5) {
        return Unit.f14616a;
    }

    public static /* synthetic */ PortalViewUpdate copy$default(PortalViewUpdate portalViewUpdate, PortalViewChatListItem portalViewChatListItem, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            portalViewChatListItem = portalViewUpdate.portalChatListItem;
        }
        if ((i10 & 2) != 0) {
            i7 = portalViewUpdate.updateId;
        }
        return portalViewUpdate.copy(portalViewChatListItem, i7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PortalViewChatListItem getPortalChatListItem() {
        return this.portalChatListItem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUpdateId() {
        return this.updateId;
    }

    @NotNull
    public final PortalViewUpdate copy(PortalViewChatListItem portalChatListItem, int updateId) {
        return new PortalViewUpdate(portalChatListItem, updateId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortalViewUpdate)) {
            return false;
        }
        PortalViewUpdate portalViewUpdate = (PortalViewUpdate) other;
        return Intrinsics.areEqual(this.portalChatListItem, portalViewUpdate.portalChatListItem) && this.updateId == portalViewUpdate.updateId;
    }

    public final PortalViewChatListItem getPortalChatListItem() {
        return this.portalChatListItem;
    }

    @Override // com.discord.chat.presentation.list.ChannelChatListAdapterUpdate
    public int getUpdateId() {
        return this.updateId;
    }

    public int hashCode() {
        PortalViewChatListItem portalViewChatListItem = this.portalChatListItem;
        return Integer.hashCode(this.updateId) + ((portalViewChatListItem == null ? 0 : portalViewChatListItem.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "PortalViewUpdate(portalChatListItem=" + this.portalChatListItem + ", updateId=" + this.updateId + ")";
    }
}
