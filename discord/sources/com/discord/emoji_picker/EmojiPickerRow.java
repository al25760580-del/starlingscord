package com.discord.emoji_picker;

import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001!B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015¨\u0006\""}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerRow;", "", "rowContentWidth", "", "rowContentPaddingVertical", "", "itemSize", AlertFragment.ARG_ITEMS, "", "Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;", "isSectionNitroLocked", "", "<init>", "(DIILjava/util/List;Z)V", "getRowContentWidth", "()D", "getRowContentPaddingVertical", "()I", "getItemSize", "getItems", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Emoji", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmojiPickerRow {
    private final boolean isSectionNitroLocked;
    private final int itemSize;

    @NotNull
    private final List<Emoji> items;
    private final int rowContentPaddingVertical;
    private final double rowContentWidth;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;", "", StackTraceHelper.ID_KEY, "", StackTraceHelper.NAME_KEY, "url", "animated", "", "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getId", "()Ljava/lang/String;", "getName", "getUrl", "getAnimated", "()Z", "getDisabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Emoji {
        private final boolean animated;
        private final boolean disabled;
        private final String id;

        @NotNull
        private final String name;

        @NotNull
        private final String url;

        public Emoji(String str, @NotNull String name, @NotNull String url, boolean z5, boolean z6) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(url, "url");
            this.id = str;
            this.name = name;
            this.url = url;
            this.animated = z5;
            this.disabled = z6;
        }

        public static /* synthetic */ Emoji copy$default(Emoji emoji, String str, String str2, String str3, boolean z5, boolean z6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = emoji.id;
            }
            if ((i7 & 2) != 0) {
                str2 = emoji.name;
            }
            if ((i7 & 4) != 0) {
                str3 = emoji.url;
            }
            if ((i7 & 8) != 0) {
                z5 = emoji.animated;
            }
            if ((i7 & 16) != 0) {
                z6 = emoji.disabled;
            }
            boolean z7 = z6;
            String str4 = str3;
            return emoji.copy(str, str2, str4, z5, z7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getAnimated() {
            return this.animated;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        @NotNull
        public final Emoji copy(String id2, @NotNull String name, @NotNull String url, boolean animated, boolean disabled) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(url, "url");
            return new Emoji(id2, name, url, animated, disabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Emoji)) {
                return false;
            }
            Emoji emoji = (Emoji) other;
            return Intrinsics.areEqual(this.id, emoji.id) && Intrinsics.areEqual(this.name, emoji.name) && Intrinsics.areEqual(this.url, emoji.url) && this.animated == emoji.animated && this.disabled == emoji.disabled;
        }

        public final boolean getAnimated() {
            return this.animated;
        }

        public final boolean getDisabled() {
            return this.disabled;
        }

        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.id;
            return Boolean.hashCode(this.disabled) + com.discord.chat.presentation.list.a.g(a3.e.d(a3.e.d((str == null ? 0 : str.hashCode()) * 31, 31, this.name), 31, this.url), 31, this.animated);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.name;
            String str3 = this.url;
            boolean z5 = this.animated;
            boolean z6 = this.disabled;
            StringBuilder sbU = a3.e.u("Emoji(id=", str, ", name=", str2, ", url=");
            sbU.append(str3);
            sbU.append(", animated=");
            sbU.append(z5);
            sbU.append(", disabled=");
            return com.discord.chat.presentation.list.a.m(sbU, z6, ")");
        }
    }

    public EmojiPickerRow(double d6, int i7, int i10, @NotNull List<Emoji> items, boolean z5) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.rowContentWidth = d6;
        this.rowContentPaddingVertical = i7;
        this.itemSize = i10;
        this.items = items;
        this.isSectionNitroLocked = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmojiPickerRow copy$default(EmojiPickerRow emojiPickerRow, double d6, int i7, int i10, List list, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d6 = emojiPickerRow.rowContentWidth;
        }
        double d7 = d6;
        if ((i11 & 2) != 0) {
            i7 = emojiPickerRow.rowContentPaddingVertical;
        }
        int i12 = i7;
        if ((i11 & 4) != 0) {
            i10 = emojiPickerRow.itemSize;
        }
        int i13 = i10;
        if ((i11 & 8) != 0) {
            list = emojiPickerRow.items;
        }
        List list2 = list;
        if ((i11 & 16) != 0) {
            z5 = emojiPickerRow.isSectionNitroLocked;
        }
        return emojiPickerRow.copy(d7, i12, i13, list2, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getRowContentWidth() {
        return this.rowContentWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRowContentPaddingVertical() {
        return this.rowContentPaddingVertical;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getItemSize() {
        return this.itemSize;
    }

    @NotNull
    public final List<Emoji> component4() {
        return this.items;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsSectionNitroLocked() {
        return this.isSectionNitroLocked;
    }

    @NotNull
    public final EmojiPickerRow copy(double rowContentWidth, int rowContentPaddingVertical, int itemSize, @NotNull List<Emoji> items, boolean isSectionNitroLocked) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new EmojiPickerRow(rowContentWidth, rowContentPaddingVertical, itemSize, items, isSectionNitroLocked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmojiPickerRow)) {
            return false;
        }
        EmojiPickerRow emojiPickerRow = (EmojiPickerRow) other;
        return Double.compare(this.rowContentWidth, emojiPickerRow.rowContentWidth) == 0 && this.rowContentPaddingVertical == emojiPickerRow.rowContentPaddingVertical && this.itemSize == emojiPickerRow.itemSize && Intrinsics.areEqual(this.items, emojiPickerRow.items) && this.isSectionNitroLocked == emojiPickerRow.isSectionNitroLocked;
    }

    public final int getItemSize() {
        return this.itemSize;
    }

    @NotNull
    public final List<Emoji> getItems() {
        return this.items;
    }

    public final int getRowContentPaddingVertical() {
        return this.rowContentPaddingVertical;
    }

    public final double getRowContentWidth() {
        return this.rowContentWidth;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSectionNitroLocked) + a3.e.f(this.items, com.discord.chat.presentation.list.a.u(this.itemSize, com.discord.chat.presentation.list.a.u(this.rowContentPaddingVertical, Double.hashCode(this.rowContentWidth) * 31, 31), 31), 31);
    }

    public final boolean isSectionNitroLocked() {
        return this.isSectionNitroLocked;
    }

    @NotNull
    public String toString() {
        return "EmojiPickerRow(rowContentWidth=" + this.rowContentWidth + ", rowContentPaddingVertical=" + this.rowContentPaddingVertical + ", itemSize=" + this.itemSize + ", items=" + this.items + ", isSectionNitroLocked=" + this.isSectionNitroLocked + ")";
    }
}
