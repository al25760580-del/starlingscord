package com.discord.chat.presentation.textutils;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/textutils/LinkBackgroundStyle;", "", ViewProps.COLOR, "", "borderRadius", "spaceAround", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBorderRadius", "getSpaceAround", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/discord/chat/presentation/textutils/LinkBackgroundStyle;", "equals", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LinkBackgroundStyle {
    private final Integer borderRadius;
    private final Integer color;
    private final Boolean spaceAround;

    public LinkBackgroundStyle() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ LinkBackgroundStyle copy$default(LinkBackgroundStyle linkBackgroundStyle, Integer num, Integer num2, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = linkBackgroundStyle.color;
        }
        if ((i7 & 2) != 0) {
            num2 = linkBackgroundStyle.borderRadius;
        }
        if ((i7 & 4) != 0) {
            bool = linkBackgroundStyle.spaceAround;
        }
        return linkBackgroundStyle.copy(num, num2, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBorderRadius() {
        return this.borderRadius;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getSpaceAround() {
        return this.spaceAround;
    }

    @NotNull
    public final LinkBackgroundStyle copy(Integer color, Integer borderRadius, Boolean spaceAround) {
        return new LinkBackgroundStyle(color, borderRadius, spaceAround);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkBackgroundStyle)) {
            return false;
        }
        LinkBackgroundStyle linkBackgroundStyle = (LinkBackgroundStyle) other;
        return Intrinsics.areEqual(this.color, linkBackgroundStyle.color) && Intrinsics.areEqual(this.borderRadius, linkBackgroundStyle.borderRadius) && Intrinsics.areEqual(this.spaceAround, linkBackgroundStyle.spaceAround);
    }

    public final Integer getBorderRadius() {
        return this.borderRadius;
    }

    public final Integer getColor() {
        return this.color;
    }

    public final Boolean getSpaceAround() {
        return this.spaceAround;
    }

    public int hashCode() {
        Integer num = this.color;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.borderRadius;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.spaceAround;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LinkBackgroundStyle(color=" + this.color + ", borderRadius=" + this.borderRadius + ", spaceAround=" + this.spaceAround + ")";
    }

    public LinkBackgroundStyle(Integer num, Integer num2, Boolean bool) {
        this.color = num;
        this.borderRadius = num2;
        this.spaceAround = bool;
    }

    public /* synthetic */ LinkBackgroundStyle(Integer num, Integer num2, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : num2, (i7 & 4) != 0 ? Boolean.FALSE : bool);
    }
}
