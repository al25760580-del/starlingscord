package com.discord.emoji_picker;

import com.discord.emoji.Surrogates;
import com.discord.emoji.UnicodeEmojis;
import com.discord.misc.utilities.ids.IdUtilsKt;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.dialog.AlertFragment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem;", "", "<init>", "()V", "itemType", "", "itemId", "", "Category", "Emoji", "EmojiPlaceholder", "Spacer", "FooterUpsell", "PremiumInlineRoadblockHeader", "PremiumInlineRoadblockFooter", "ItemType", "Lcom/discord/emoji_picker/EmojiPickerItem$Category;", "Lcom/discord/emoji_picker/EmojiPickerItem$Emoji;", "Lcom/discord/emoji_picker/EmojiPickerItem$EmojiPlaceholder;", "Lcom/discord/emoji_picker/EmojiPickerItem$FooterUpsell;", "Lcom/discord/emoji_picker/EmojiPickerItem$PremiumInlineRoadblockFooter;", "Lcom/discord/emoji_picker/EmojiPickerItem$PremiumInlineRoadblockHeader;", "Lcom/discord/emoji_picker/EmojiPickerItem$Spacer;", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class EmojiPickerItem {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem$EmojiPlaceholder;", "Lcom/discord/emoji_picker/EmojiPickerItem;", StackTraceHelper.ID_KEY, "", "<init>", "(J)V", "itemType", "", "itemId", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EmojiPlaceholder extends EmojiPickerItem {
        private final long id;

        public EmojiPlaceholder(long j) {
            super(null);
            this.id = j;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final long getId() {
            return this.id;
        }

        public static /* synthetic */ EmojiPlaceholder copy$default(EmojiPlaceholder emojiPlaceholder, long j, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = emojiPlaceholder.id;
            }
            return emojiPlaceholder.copy(j);
        }

        @NotNull
        public final EmojiPlaceholder copy(long id2) {
            return new EmojiPlaceholder(id2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EmojiPlaceholder) && this.id == ((EmojiPlaceholder) other).id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public long itemId() {
            return this.id;
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public int itemType() {
            return ItemType.PLACEHOLDER.ordinal();
        }

        @NotNull
        public String toString() {
            return a3.e.h(this.id, "EmojiPlaceholder(id=", ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem$FooterUpsell;", "Lcom/discord/emoji_picker/EmojiPickerItem;", StackTraceHelper.ID_KEY, "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "itemType", "", "itemId", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterUpsell extends EmojiPickerItem {

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FooterUpsell(@NotNull String id2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
        }

        public static /* synthetic */ FooterUpsell copy$default(FooterUpsell footerUpsell, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = footerUpsell.id;
            }
            return footerUpsell.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final FooterUpsell copy(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new FooterUpsell(id2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FooterUpsell) && Intrinsics.areEqual(this.id, ((FooterUpsell) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public long itemId() {
            return IdUtilsKt.convertToId(this.id);
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public int itemType() {
            return ItemType.FOOTER_UPSELL.ordinal();
        }

        @NotNull
        public String toString() {
            return s0.g.e("FooterUpsell(id=", this.id, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem$ItemType;", "", "<init>", "(Ljava/lang/String;I)V", "CATEGORY", "EMOJI", "PLACEHOLDER", "SPACER", "FOOTER_UPSELL", "PREMIUM_INLINE_ROADBLOCK_HEADER", "PREMIUM_INLINE_ROADBLOCK_FOOTER", "Companion", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum ItemType {
        CATEGORY,
        EMOJI,
        PLACEHOLDER,
        SPACER,
        FOOTER_UPSELL,
        PREMIUM_INLINE_ROADBLOCK_HEADER,
        PREMIUM_INLINE_ROADBLOCK_FOOTER;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final ItemType[] values = values();

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem$ItemType$Companion;", "", "<init>", "()V", "values", "", "Lcom/discord/emoji_picker/EmojiPickerItem$ItemType;", "getValues", "()[Lcom/discord/emoji_picker/EmojiPickerItem$ItemType;", "[Lcom/discord/emoji_picker/EmojiPickerItem$ItemType;", "create", "value", "", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ItemType create(int value) {
                ItemType[] values = getValues();
                if (value < 0 || value >= values.length) {
                    throw new IllegalArgumentException(kk.b.h(value, "Unknown item type: "));
                }
                return values[value];
            }

            @NotNull
            public final ItemType[] getValues() {
                return ItemType.values;
            }

            private Companion() {
            }
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem$PremiumInlineRoadblockFooter;", "Lcom/discord/emoji_picker/EmojiPickerItem;", StackTraceHelper.ID_KEY, "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "itemType", "", "itemId", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PremiumInlineRoadblockFooter extends EmojiPickerItem {

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PremiumInlineRoadblockFooter(@NotNull String id2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
        }

        public static /* synthetic */ PremiumInlineRoadblockFooter copy$default(PremiumInlineRoadblockFooter premiumInlineRoadblockFooter, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = premiumInlineRoadblockFooter.id;
            }
            return premiumInlineRoadblockFooter.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final PremiumInlineRoadblockFooter copy(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new PremiumInlineRoadblockFooter(id2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PremiumInlineRoadblockFooter) && Intrinsics.areEqual(this.id, ((PremiumInlineRoadblockFooter) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public long itemId() {
            return IdUtilsKt.convertToId(this.id);
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public int itemType() {
            return ItemType.PREMIUM_INLINE_ROADBLOCK_FOOTER.ordinal();
        }

        @NotNull
        public String toString() {
            return s0.g.e("PremiumInlineRoadblockFooter(id=", this.id, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem$PremiumInlineRoadblockHeader;", "Lcom/discord/emoji_picker/EmojiPickerItem;", StackTraceHelper.ID_KEY, "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "itemType", "", "itemId", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PremiumInlineRoadblockHeader extends EmojiPickerItem {

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PremiumInlineRoadblockHeader(@NotNull String id2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
        }

        public static /* synthetic */ PremiumInlineRoadblockHeader copy$default(PremiumInlineRoadblockHeader premiumInlineRoadblockHeader, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = premiumInlineRoadblockHeader.id;
            }
            return premiumInlineRoadblockHeader.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final PremiumInlineRoadblockHeader copy(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new PremiumInlineRoadblockHeader(id2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PremiumInlineRoadblockHeader) && Intrinsics.areEqual(this.id, ((PremiumInlineRoadblockHeader) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public long itemId() {
            return IdUtilsKt.convertToId(this.id);
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public int itemType() {
            return ItemType.PREMIUM_INLINE_ROADBLOCK_HEADER.ordinal();
        }

        @NotNull
        public String toString() {
            return s0.g.e("PremiumInlineRoadblockHeader(id=", this.id, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem$Spacer;", "Lcom/discord/emoji_picker/EmojiPickerItem;", StackTraceHelper.ID_KEY, "", "height", "", "<init>", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getHeight", "()I", "itemType", "itemId", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Spacer extends EmojiPickerItem {
        private final int height;

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Spacer(@NotNull String id2, int i7) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
            this.height = i7;
        }

        public static /* synthetic */ Spacer copy$default(Spacer spacer, String str, int i7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = spacer.id;
            }
            if ((i10 & 2) != 0) {
                i7 = spacer.height;
            }
            return spacer.copy(str, i7);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final Spacer copy(@NotNull String id2, int height) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new Spacer(id2, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacer)) {
                return false;
            }
            Spacer spacer = (Spacer) other;
            return Intrinsics.areEqual(this.id, spacer.id) && this.height == spacer.height;
        }

        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (this.id.hashCode() * 31);
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public long itemId() {
            return IdUtilsKt.convertToId(this.id);
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public int itemType() {
            return ItemType.SPACER.ordinal();
        }

        @NotNull
        public String toString() {
            return "Spacer(id=" + this.id + ", height=" + this.height + ")";
        }
    }

    public /* synthetic */ EmojiPickerItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long itemId();

    public abstract int itemType();

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem$Category;", "Lcom/discord/emoji_picker/EmojiPickerItem;", AlertFragment.ARG_TITLE, "", StackTraceHelper.ID_KEY, "", "isInsidePremiumRoadBlock", "", "<init>", "(Ljava/lang/String;JZ)V", "getTitle", "()Ljava/lang/String;", "getId", "()J", "()Z", "itemType", "", "itemId", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Category extends EmojiPickerItem {
        private final long id;
        private final boolean isInsidePremiumRoadBlock;

        @NotNull
        private final String title;

        public /* synthetic */ Category(String str, long j, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i7 & 2) != 0 ? IdUtilsKt.convertToId(str) : j, (i7 & 4) != 0 ? false : z5);
        }

        public static /* synthetic */ Category copy$default(Category category, String str, long j, boolean z5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = category.title;
            }
            if ((i7 & 2) != 0) {
                j = category.id;
            }
            if ((i7 & 4) != 0) {
                z5 = category.isInsidePremiumRoadBlock;
            }
            return category.copy(str, j, z5);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsInsidePremiumRoadBlock() {
            return this.isInsidePremiumRoadBlock;
        }

        @NotNull
        public final Category copy(@NotNull String title, long id2, boolean isInsidePremiumRoadBlock) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Category(title, id2, isInsidePremiumRoadBlock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Category)) {
                return false;
            }
            Category category = (Category) other;
            return Intrinsics.areEqual(this.title, category.title) && this.id == category.id && this.isInsidePremiumRoadBlock == category.isInsidePremiumRoadBlock;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInsidePremiumRoadBlock) + com.discord.chat.presentation.list.a.h(this.id, this.title.hashCode() * 31, 31);
        }

        public final boolean isInsidePremiumRoadBlock() {
            return this.isInsidePremiumRoadBlock;
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public long itemId() {
            return this.id;
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public int itemType() {
            return ItemType.CATEGORY.ordinal();
        }

        @NotNull
        public String toString() {
            return "Category(title=" + this.title + ", id=" + this.id + ", isInsidePremiumRoadBlock=" + this.isInsidePremiumRoadBlock + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Category(@NotNull String title, long j, boolean z5) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.id = j;
            this.isInsidePremiumRoadBlock = z5;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003JG\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0018HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012¨\u0006)"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem$Emoji;", "Lcom/discord/emoji_picker/EmojiPickerItem;", StackTraceHelper.ID_KEY, "", StackTraceHelper.NAME_KEY, "", "animated", "", "disabled", "Lcom/discord/emoji_picker/EmojiPickerItem$Emoji$DisabledType;", "unicode", "Lcom/discord/emoji/UnicodeEmojis$Emoji;", "isInsidePremiumRoadBlock", "<init>", "(JLjava/lang/String;ZLcom/discord/emoji_picker/EmojiPickerItem$Emoji$DisabledType;Lcom/discord/emoji/UnicodeEmojis$Emoji;Z)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getAnimated", "()Z", "getDisabled", "()Lcom/discord/emoji_picker/EmojiPickerItem$Emoji$DisabledType;", "itemType", "", "itemId", "unicodeUrl", "getUnicodeUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "DisabledType", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEmojiPickerItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerItem.kt\ncom/discord/emoji_picker/EmojiPickerItem$Emoji\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
    public static final /* data */ class Emoji extends EmojiPickerItem {
        private final boolean animated;

        @NotNull
        private final DisabledType disabled;
        private final long id;
        private final boolean isInsidePremiumRoadBlock;

        @NotNull
        private final String name;
        private final UnicodeEmojis.Emoji unicode;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem$Emoji$DisabledType;", "", "<init>", "(Ljava/lang/String;I)V", "ICON", "NONE", "Companion", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum DisabledType {
            ICON,
            NONE;

            private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItem$Emoji$DisabledType$Companion;", "", "<init>", "()V", "create", "Lcom/discord/emoji_picker/EmojiPickerItem$Emoji$DisabledType;", "emojiDisabled", "", "emojiSectionNitroLocked", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final DisabledType create(boolean emojiDisabled, boolean emojiSectionNitroLocked) {
                    return (!emojiDisabled || emojiSectionNitroLocked) ? DisabledType.NONE : DisabledType.ICON;
                }

                private Companion() {
                }
            }

            @NotNull
            public static EnumEntries getEntries() {
                return $ENTRIES;
            }
        }

        public /* synthetic */ Emoji(long j, String str, boolean z5, DisabledType disabledType, UnicodeEmojis.Emoji emoji, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, (i7 & 4) != 0 ? false : z5, (i7 & 8) != 0 ? DisabledType.NONE : disabledType, (i7 & 16) != 0 ? null : emoji, (i7 & 32) != 0 ? false : z6);
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        private final UnicodeEmojis.Emoji getUnicode() {
            return this.unicode;
        }

        public static /* synthetic */ Emoji copy$default(Emoji emoji, long j, String str, boolean z5, DisabledType disabledType, UnicodeEmojis.Emoji emoji2, boolean z6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = emoji.id;
            }
            long j5 = j;
            if ((i7 & 2) != 0) {
                str = emoji.name;
            }
            String str2 = str;
            if ((i7 & 4) != 0) {
                z5 = emoji.animated;
            }
            boolean z7 = z5;
            if ((i7 & 8) != 0) {
                disabledType = emoji.disabled;
            }
            DisabledType disabledType2 = disabledType;
            if ((i7 & 16) != 0) {
                emoji2 = emoji.unicode;
            }
            UnicodeEmojis.Emoji emoji3 = emoji2;
            if ((i7 & 32) != 0) {
                z6 = emoji.isInsidePremiumRoadBlock;
            }
            return emoji.copy(j5, str2, z7, disabledType2, emoji3, z6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getAnimated() {
            return this.animated;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final DisabledType getDisabled() {
            return this.disabled;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsInsidePremiumRoadBlock() {
            return this.isInsidePremiumRoadBlock;
        }

        @NotNull
        public final Emoji copy(long id2, @NotNull String name, boolean animated, @NotNull DisabledType disabled, UnicodeEmojis.Emoji unicode, boolean isInsidePremiumRoadBlock) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(disabled, "disabled");
            return new Emoji(id2, name, animated, disabled, unicode, isInsidePremiumRoadBlock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Emoji)) {
                return false;
            }
            Emoji emoji = (Emoji) other;
            return this.id == emoji.id && Intrinsics.areEqual(this.name, emoji.name) && this.animated == emoji.animated && this.disabled == emoji.disabled && Intrinsics.areEqual(this.unicode, emoji.unicode) && this.isInsidePremiumRoadBlock == emoji.isInsidePremiumRoadBlock;
        }

        public final boolean getAnimated() {
            return this.animated;
        }

        @NotNull
        public final DisabledType getDisabled() {
            return this.disabled;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final String getUnicodeUrl() {
            UnicodeEmojis.Emoji emoji = this.unicode;
            if (emoji != null) {
                return Surrogates.m938toAssetUrlimpl(Surrogates.m934constructorimpl(emoji.getSurrogates()));
            }
            return null;
        }

        public int hashCode() {
            int iHashCode = (this.disabled.hashCode() + com.discord.chat.presentation.list.a.g(a3.e.d(Long.hashCode(this.id) * 31, 31, this.name), 31, this.animated)) * 31;
            UnicodeEmojis.Emoji emoji = this.unicode;
            return Boolean.hashCode(this.isInsidePremiumRoadBlock) + ((iHashCode + (emoji == null ? 0 : emoji.hashCode())) * 31);
        }

        public final boolean isInsidePremiumRoadBlock() {
            return this.isInsidePremiumRoadBlock;
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public long itemId() {
            return this.id;
        }

        @Override // com.discord.emoji_picker.EmojiPickerItem
        public int itemType() {
            return ItemType.EMOJI.ordinal();
        }

        @NotNull
        public String toString() {
            return "Emoji(id=" + this.id + ", name=" + this.name + ", animated=" + this.animated + ", disabled=" + this.disabled + ", unicode=" + this.unicode + ", isInsidePremiumRoadBlock=" + this.isInsidePremiumRoadBlock + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Emoji(long j, @NotNull String name, boolean z5, @NotNull DisabledType disabled, UnicodeEmojis.Emoji emoji, boolean z6) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(disabled, "disabled");
            this.id = j;
            this.name = name;
            this.animated = z5;
            this.disabled = disabled;
            this.unicode = emoji;
            this.isInsidePremiumRoadBlock = z6;
        }
    }

    private EmojiPickerItem() {
    }
}
