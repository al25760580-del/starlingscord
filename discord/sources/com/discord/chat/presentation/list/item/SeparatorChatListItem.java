package com.discord.chat.presentation.list.item;

import com.discord.chat.presentation.list.a;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/list/item/SeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.COLOR, "", ViewProps.BORDER_COLOR, "text", "", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;)V", "getColor", "()I", "getBorderColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/String;)Lcom/discord/chat/presentation/list/item/SeparatorChatListItem;", "equals", "", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SeparatorChatListItem extends ChatListItem {
    private final Integer borderColor;
    private final int color;

    @NotNull
    private final String text;

    public /* synthetic */ SeparatorChatListItem(int i7, Integer num, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, (i10 & 2) != 0 ? null : num, str);
    }

    public static /* synthetic */ SeparatorChatListItem copy$default(SeparatorChatListItem separatorChatListItem, int i7, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = separatorChatListItem.color;
        }
        if ((i10 & 2) != 0) {
            num = separatorChatListItem.borderColor;
        }
        if ((i10 & 4) != 0) {
            str = separatorChatListItem.text;
        }
        return separatorChatListItem.copy(i7, num, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final SeparatorChatListItem copy(int color, Integer borderColor, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new SeparatorChatListItem(color, borderColor, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorChatListItem)) {
            return false;
        }
        SeparatorChatListItem separatorChatListItem = (SeparatorChatListItem) other;
        return this.color == separatorChatListItem.color && Intrinsics.areEqual(this.borderColor, separatorChatListItem.borderColor) && Intrinsics.areEqual(this.text, separatorChatListItem.text);
    }

    public final Integer getBorderColor() {
        return this.borderColor;
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.color) * 31;
        Integer num = this.borderColor;
        return this.text.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i7 = this.color;
        Integer num = this.borderColor;
        String str = this.text;
        StringBuilder sb2 = new StringBuilder("SeparatorChatListItem(color=");
        sb2.append(i7);
        sb2.append(", borderColor=");
        sb2.append(num);
        sb2.append(", text=");
        return a.k(sb2, str, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorChatListItem(int i7, Integer num, @NotNull String text) {
        super("separator: " + text, null);
        Intrinsics.checkNotNullParameter(text, "text");
        this.color = i7;
        this.borderColor = num;
        this.text = text;
    }
}
