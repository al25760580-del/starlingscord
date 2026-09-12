package com.discord.sticker_picker;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/discord/sticker_picker/StickerPickerRow;", "", "rowContentWidth", "", "rowContentPaddingVertical", "", "itemSize", AlertFragment.ARG_ITEMS, "", "Lcom/discord/sticker_picker/StickerPickerRow$Sticker;", "<init>", "(DIILjava/util/List;)V", "getRowContentWidth", "()D", "getRowContentPaddingVertical", "()I", "getItemSize", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Sticker", "sticker_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class StickerPickerRow {
    private final int itemSize;

    @NotNull
    private final List<Sticker> items;
    private final int rowContentPaddingVertical;
    private final double rowContentWidth;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006&"}, d2 = {"Lcom/discord/sticker_picker/StickerPickerRow$Sticker;", "", StackTraceHelper.ID_KEY, "", StackTraceHelper.NAME_KEY, "type", "Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;", "animated", "", "url", "disabled", "opaque", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;ZLjava/lang/String;ZZ)V", "getId", "()Ljava/lang/String;", "getName", "getType", "()Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;", "getAnimated", "()Z", "getUrl", "getDisabled", "getOpaque", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Type", "sticker_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Sticker {
        private final boolean animated;
        private final boolean disabled;

        @NotNull
        private final String id;

        @NotNull
        private final String name;
        private final boolean opaque;

        @NotNull
        private final Type type;

        @NotNull
        private final String url;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;", "", "<init>", "(Ljava/lang/String;I)V", "PNG", "APNG", "LOTTIE", "GIF", "sticker_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum Type {
            PNG,
            APNG,
            LOTTIE,
            GIF;

            private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

            @NotNull
            public static EnumEntries getEntries() {
                return $ENTRIES;
            }
        }

        public Sticker(@NotNull String id2, @NotNull String name, @NotNull Type type, boolean z5, @NotNull String url, boolean z6, boolean z7) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(url, "url");
            this.id = id2;
            this.name = name;
            this.type = type;
            this.animated = z5;
            this.url = url;
            this.disabled = z6;
            this.opaque = z7;
        }

        public static /* synthetic */ Sticker copy$default(Sticker sticker, String str, String str2, Type type, boolean z5, String str3, boolean z6, boolean z7, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = sticker.id;
            }
            if ((i7 & 2) != 0) {
                str2 = sticker.name;
            }
            if ((i7 & 4) != 0) {
                type = sticker.type;
            }
            if ((i7 & 8) != 0) {
                z5 = sticker.animated;
            }
            if ((i7 & 16) != 0) {
                str3 = sticker.url;
            }
            if ((i7 & 32) != 0) {
                z6 = sticker.disabled;
            }
            if ((i7 & 64) != 0) {
                z7 = sticker.opaque;
            }
            boolean z10 = z6;
            boolean z11 = z7;
            String str4 = str3;
            Type type2 = type;
            return sticker.copy(str, str2, type2, z5, str4, z10, z11);
        }

        @NotNull
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
        public final Type getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getAnimated() {
            return this.animated;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getOpaque() {
            return this.opaque;
        }

        @NotNull
        public final Sticker copy(@NotNull String id2, @NotNull String name, @NotNull Type type, boolean animated, @NotNull String url, boolean disabled, boolean opaque) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(url, "url");
            return new Sticker(id2, name, type, animated, url, disabled, opaque);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sticker)) {
                return false;
            }
            Sticker sticker = (Sticker) other;
            return Intrinsics.areEqual(this.id, sticker.id) && Intrinsics.areEqual(this.name, sticker.name) && this.type == sticker.type && this.animated == sticker.animated && Intrinsics.areEqual(this.url, sticker.url) && this.disabled == sticker.disabled && this.opaque == sticker.opaque;
        }

        public final boolean getAnimated() {
            return this.animated;
        }

        public final boolean getDisabled() {
            return this.disabled;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final boolean getOpaque() {
            return this.opaque;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return Boolean.hashCode(this.opaque) + a.g(e.d(a.g((this.type.hashCode() + e.d(this.id.hashCode() * 31, 31, this.name)) * 31, 31, this.animated), 31, this.url), 31, this.disabled);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.name;
            Type type = this.type;
            boolean z5 = this.animated;
            String str3 = this.url;
            boolean z6 = this.disabled;
            boolean z7 = this.opaque;
            StringBuilder sbU = e.u("Sticker(id=", str, ", name=", str2, ", type=");
            sbU.append(type);
            sbU.append(", animated=");
            sbU.append(z5);
            sbU.append(", url=");
            sbU.append(str3);
            sbU.append(", disabled=");
            sbU.append(z6);
            sbU.append(", opaque=");
            return a.m(sbU, z7, ")");
        }
    }

    public StickerPickerRow(double d6, int i7, int i10, @NotNull List<Sticker> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.rowContentWidth = d6;
        this.rowContentPaddingVertical = i7;
        this.itemSize = i10;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerPickerRow copy$default(StickerPickerRow stickerPickerRow, double d6, int i7, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d6 = stickerPickerRow.rowContentWidth;
        }
        double d7 = d6;
        if ((i11 & 2) != 0) {
            i7 = stickerPickerRow.rowContentPaddingVertical;
        }
        int i12 = i7;
        if ((i11 & 4) != 0) {
            i10 = stickerPickerRow.itemSize;
        }
        int i13 = i10;
        if ((i11 & 8) != 0) {
            list = stickerPickerRow.items;
        }
        return stickerPickerRow.copy(d7, i12, i13, list);
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
    public final List<Sticker> component4() {
        return this.items;
    }

    @NotNull
    public final StickerPickerRow copy(double rowContentWidth, int rowContentPaddingVertical, int itemSize, @NotNull List<Sticker> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new StickerPickerRow(rowContentWidth, rowContentPaddingVertical, itemSize, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickerPickerRow)) {
            return false;
        }
        StickerPickerRow stickerPickerRow = (StickerPickerRow) other;
        return Double.compare(this.rowContentWidth, stickerPickerRow.rowContentWidth) == 0 && this.rowContentPaddingVertical == stickerPickerRow.rowContentPaddingVertical && this.itemSize == stickerPickerRow.itemSize && Intrinsics.areEqual(this.items, stickerPickerRow.items);
    }

    public final int getItemSize() {
        return this.itemSize;
    }

    @NotNull
    public final List<Sticker> getItems() {
        return this.items;
    }

    public final int getRowContentPaddingVertical() {
        return this.rowContentPaddingVertical;
    }

    public final double getRowContentWidth() {
        return this.rowContentWidth;
    }

    public int hashCode() {
        return this.items.hashCode() + a.u(this.itemSize, a.u(this.rowContentPaddingVertical, Double.hashCode(this.rowContentWidth) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "StickerPickerRow(rowContentWidth=" + this.rowContentWidth + ", rowContentPaddingVertical=" + this.rowContentPaddingVertical + ", itemSize=" + this.itemSize + ", items=" + this.items + ")";
    }
}
