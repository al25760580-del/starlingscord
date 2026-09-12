package com.discord.chat.presentation.textutils;

import com.discord.chat.presentation.list.a;
import com.discord.fonts.DiscordFont;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/discord/chat/presentation/textutils/LinkStyle;", "", "font", "Lcom/discord/fonts/DiscordFont;", "linkColor", "", "backgroundStyle", "Lcom/discord/chat/presentation/textutils/LinkBackgroundStyle;", "icon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "<init>", "(Lcom/discord/fonts/DiscordFont;ILcom/discord/chat/presentation/textutils/LinkBackgroundStyle;Lcom/discord/react_asset_fetcher/ReactAsset;)V", "getFont", "()Lcom/discord/fonts/DiscordFont;", "getLinkColor", "()I", "getBackgroundStyle", "()Lcom/discord/chat/presentation/textutils/LinkBackgroundStyle;", "getIcon", "()Lcom/discord/react_asset_fetcher/ReactAsset;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LinkStyle {
    private final LinkBackgroundStyle backgroundStyle;

    @NotNull
    private final DiscordFont font;
    private final ReactAsset icon;
    private final int linkColor;

    public LinkStyle() {
        this(null, 0, null, null, 15, null);
    }

    public static /* synthetic */ LinkStyle copy$default(LinkStyle linkStyle, DiscordFont discordFont, int i7, LinkBackgroundStyle linkBackgroundStyle, ReactAsset reactAsset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            discordFont = linkStyle.font;
        }
        if ((i10 & 2) != 0) {
            i7 = linkStyle.linkColor;
        }
        if ((i10 & 4) != 0) {
            linkBackgroundStyle = linkStyle.backgroundStyle;
        }
        if ((i10 & 8) != 0) {
            reactAsset = linkStyle.icon;
        }
        return linkStyle.copy(discordFont, i7, linkBackgroundStyle, reactAsset);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DiscordFont getFont() {
        return this.font;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLinkColor() {
        return this.linkColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LinkBackgroundStyle getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ReactAsset getIcon() {
        return this.icon;
    }

    @NotNull
    public final LinkStyle copy(@NotNull DiscordFont font, int linkColor, LinkBackgroundStyle backgroundStyle, ReactAsset icon) {
        Intrinsics.checkNotNullParameter(font, "font");
        return new LinkStyle(font, linkColor, backgroundStyle, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkStyle)) {
            return false;
        }
        LinkStyle linkStyle = (LinkStyle) other;
        return this.font == linkStyle.font && this.linkColor == linkStyle.linkColor && Intrinsics.areEqual(this.backgroundStyle, linkStyle.backgroundStyle) && this.icon == linkStyle.icon;
    }

    public final LinkBackgroundStyle getBackgroundStyle() {
        return this.backgroundStyle;
    }

    @NotNull
    public final DiscordFont getFont() {
        return this.font;
    }

    public final ReactAsset getIcon() {
        return this.icon;
    }

    public final int getLinkColor() {
        return this.linkColor;
    }

    public int hashCode() {
        int iU = a.u(this.linkColor, this.font.hashCode() * 31, 31);
        LinkBackgroundStyle linkBackgroundStyle = this.backgroundStyle;
        int iHashCode = (iU + (linkBackgroundStyle == null ? 0 : linkBackgroundStyle.hashCode())) * 31;
        ReactAsset reactAsset = this.icon;
        return iHashCode + (reactAsset != null ? reactAsset.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LinkStyle(font=" + this.font + ", linkColor=" + this.linkColor + ", backgroundStyle=" + this.backgroundStyle + ", icon=" + this.icon + ")";
    }

    public LinkStyle(@NotNull DiscordFont font, int i7, LinkBackgroundStyle linkBackgroundStyle, ReactAsset reactAsset) {
        Intrinsics.checkNotNullParameter(font, "font");
        this.font = font;
        this.linkColor = i7;
        this.backgroundStyle = linkBackgroundStyle;
        this.icon = reactAsset;
    }

    public /* synthetic */ LinkStyle(DiscordFont discordFont, int i7, LinkBackgroundStyle linkBackgroundStyle, ReactAsset reactAsset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? DiscordFont.PrimaryNormal : discordFont, (i10 & 2) != 0 ? ThemeManagerKt.getTheme().getTextLink() : i7, (i10 & 4) != 0 ? null : linkBackgroundStyle, (i10 & 8) != 0 ? null : reactAsset);
    }
}
