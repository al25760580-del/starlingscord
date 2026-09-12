package com.discord.chat.presentation.list.item;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\fHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006,"}, d2 = {"Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "text", "", StackTraceHelper.ID_KEY, "textColor", "", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "isRevealed", "", "content", "", "canUncollapse", "actionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIZLjava/util/List;ZLjava/lang/String;)V", "getText", "()Ljava/lang/String;", "getId", "getTextColor", "()I", "getBackgroundColor", "getBorderColor", "()Z", "getContent", "()Ljava/util/List;", "getCanUncollapse", "getActionType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BlockedGroupChatListItem extends ChatListItem {

    @NotNull
    private final String actionType;
    private final int backgroundColor;
    private final int borderColor;
    private final boolean canUncollapse;

    @NotNull
    private final List<ChatListItem> content;

    @NotNull
    private final String id;
    private final boolean isRevealed;

    @NotNull
    private final String text;
    private final int textColor;

    public /* synthetic */ BlockedGroupChatListItem(String str, String str2, int i7, int i10, int i11, boolean z5, List list, boolean z6, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i7, i10, i11, z5, list, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? true : z6, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? "toggle" : str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlockedGroupChatListItem copy$default(BlockedGroupChatListItem blockedGroupChatListItem, String str, String str2, int i7, int i10, int i11, boolean z5, List list, boolean z6, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = blockedGroupChatListItem.text;
        }
        if ((i12 & 2) != 0) {
            str2 = blockedGroupChatListItem.id;
        }
        if ((i12 & 4) != 0) {
            i7 = blockedGroupChatListItem.textColor;
        }
        if ((i12 & 8) != 0) {
            i10 = blockedGroupChatListItem.backgroundColor;
        }
        if ((i12 & 16) != 0) {
            i11 = blockedGroupChatListItem.borderColor;
        }
        if ((i12 & 32) != 0) {
            z5 = blockedGroupChatListItem.isRevealed;
        }
        if ((i12 & 64) != 0) {
            list = blockedGroupChatListItem.content;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            z6 = blockedGroupChatListItem.canUncollapse;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str3 = blockedGroupChatListItem.actionType;
        }
        boolean z7 = z6;
        String str4 = str3;
        boolean z10 = z5;
        List list2 = list;
        int i13 = i11;
        int i14 = i7;
        return blockedGroupChatListItem.copy(str, str2, i14, i10, i13, z10, list2, z7, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsRevealed() {
        return this.isRevealed;
    }

    @NotNull
    public final List<ChatListItem> component7() {
        return this.content;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getCanUncollapse() {
        return this.canUncollapse;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    @NotNull
    public final BlockedGroupChatListItem copy(@NotNull String text, @NotNull String id2, int textColor, int backgroundColor, int borderColor, boolean isRevealed, @NotNull List<? extends ChatListItem> content, boolean canUncollapse, @NotNull String actionType) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return new BlockedGroupChatListItem(text, id2, textColor, backgroundColor, borderColor, isRevealed, content, canUncollapse, actionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockedGroupChatListItem)) {
            return false;
        }
        BlockedGroupChatListItem blockedGroupChatListItem = (BlockedGroupChatListItem) other;
        return Intrinsics.areEqual(this.text, blockedGroupChatListItem.text) && Intrinsics.areEqual(this.id, blockedGroupChatListItem.id) && this.textColor == blockedGroupChatListItem.textColor && this.backgroundColor == blockedGroupChatListItem.backgroundColor && this.borderColor == blockedGroupChatListItem.borderColor && this.isRevealed == blockedGroupChatListItem.isRevealed && Intrinsics.areEqual(this.content, blockedGroupChatListItem.content) && this.canUncollapse == blockedGroupChatListItem.canUncollapse && Intrinsics.areEqual(this.actionType, blockedGroupChatListItem.actionType);
    }

    @NotNull
    public final String getActionType() {
        return this.actionType;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final boolean getCanUncollapse() {
        return this.canUncollapse;
    }

    @NotNull
    public final List<ChatListItem> getContent() {
        return this.content;
    }

    @Override // com.discord.chat.presentation.list.item.ChatListItem
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return this.actionType.hashCode() + a.g(e.f(this.content, a.g(a.u(this.borderColor, a.u(this.backgroundColor, a.u(this.textColor, e.d(this.text.hashCode() * 31, 31, this.id), 31), 31), 31), 31, this.isRevealed), 31), 31, this.canUncollapse);
    }

    public final boolean isRevealed() {
        return this.isRevealed;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.id;
        int i7 = this.textColor;
        int i10 = this.backgroundColor;
        int i11 = this.borderColor;
        boolean z5 = this.isRevealed;
        List<ChatListItem> list = this.content;
        boolean z6 = this.canUncollapse;
        String str3 = this.actionType;
        StringBuilder sbU = e.u("BlockedGroupChatListItem(text=", str, ", id=", str2, ", textColor=");
        e.z(sbU, i7, ", backgroundColor=", i10, ", borderColor=");
        sbU.append(i11);
        sbU.append(", isRevealed=");
        sbU.append(z5);
        sbU.append(", content=");
        sbU.append(list);
        sbU.append(", canUncollapse=");
        sbU.append(z6);
        sbU.append(", actionType=");
        return a.k(sbU, str3, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BlockedGroupChatListItem(@NotNull String text, @NotNull String id2, int i7, int i10, int i11, boolean z5, @NotNull List<? extends ChatListItem> content, boolean z6, @NotNull String actionType) {
        super(id2, null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.text = text;
        this.id = id2;
        this.textColor = i7;
        this.backgroundColor = i10;
        this.borderColor = i11;
        this.isRevealed = z5;
        this.content = content;
        this.canUncollapse = z6;
        this.actionType = actionType;
    }
}
