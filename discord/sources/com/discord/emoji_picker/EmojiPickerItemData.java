package com.discord.emoji_picker;

import androidx.lifecycle.r0;
import com.discord.misc.utilities.ids.IdUtilsKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0001\u0018\u0000 (2\u00020\u0001:\u0002)(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eJ7\u0010\u0016\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0004\b\u001d\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItemData;", "", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;", "coreData", "<init>", "(Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;)V", "", ViewProps.POSITION, "Lcom/discord/emoji_picker/EmojiPickerItem;", "getItem", "(I)Lcom/discord/emoji_picker/EmojiPickerItem;", "getItemIndex", "(I)Ljava/lang/Integer;", "getItemCount", "()I", "getRowSize", "", "emojis", "emojisUnicode", "Lkotlin/Function0;", "", "onChanged", "setEmojis", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "spacerTopHeight", "Lkotlin/Function1;", "setSpacerTopHeight", "(ILkotlin/jvm/functions/Function1;)V", "spacerBottomHeight", "setSpacerBottomHeight", "setCoreData", "(Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;Lkotlin/jvm/functions/Function0;)V", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;", "", "emojisUnset", "Z", "Ljava/util/List;", "", "dataSets", "[Ljava/util/List;", "Companion", "CoreData", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmojiPickerItemData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerItemData.kt\ncom/discord/emoji_picker/EmojiPickerItemData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
public final class EmojiPickerItemData {
    private static final int INDEX_EMOJIS = 1;
    private static final int INDEX_EMOJIS_UNICODE = 2;
    private static final int INDEX_LEADING = 0;
    private static final int INDEX_TRAILING = 3;

    @NotNull
    private CoreData coreData;

    @NotNull
    private final List<EmojiPickerItem>[] dataSets;

    @NotNull
    private List<? extends EmojiPickerItem> emojis;

    @NotNull
    private List<? extends EmojiPickerItem> emojisUnicode;
    private boolean emojisUnset;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 82\u00020\u0001:\u000278B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003Jq\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0001J\u0013\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR'\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001a¨\u00069"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;", "", "rowSize", "", "hasGuildData", "", "hasSearchData", "hasPremiumInlineRoadblock", "leading", "", "Lcom/discord/emoji_picker/EmojiPickerItem;", "trailing", "nativeSectionsEmojis", "", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$NativeSection$Guild;", "nativeSectionsEmojisUnicode", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$NativeSection$Unicode;", "<init>", "(IZZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getRowSize", "()I", "getHasGuildData", "()Z", "getHasSearchData", "getHasPremiumInlineRoadblock", "getLeading", "()Ljava/util/List;", "getTrailing", "getNativeSectionsEmojis", "getNativeSectionsEmojisUnicode", "categoryIndices", "", "", "getCategoryIndices", "()Ljava/util/Map;", "categoryIndices$delegate", "Lkotlin/Lazy;", "emojisPlaceholderList", "getEmojisPlaceholderList", "emojisUnicodePlaceholderList", "getEmojisUnicodePlaceholderList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "NativeSection", "Companion", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CoreData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: categoryIndices$delegate, reason: from kotlin metadata */
        @NotNull
        private final Lazy categoryIndices;
        private final boolean hasGuildData;
        private final boolean hasPremiumInlineRoadblock;
        private final boolean hasSearchData;

        @NotNull
        private final List<EmojiPickerItem> leading;

        @NotNull
        private final List<NativeSection.Guild> nativeSectionsEmojis;

        @NotNull
        private final List<NativeSection.Unicode> nativeSectionsEmojisUnicode;
        private final int rowSize;

        @NotNull
        private final List<EmojiPickerItem> trailing;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$Companion;", "", "<init>", "()V", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$NativeSection;", "", "<init>", "()V", "getCount", "", "Guild", "Unicode", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$NativeSection$Guild;", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$NativeSection$Unicode;", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class NativeSection {

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0019R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$NativeSection$Guild;", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$NativeSection;", "guildId", "", "guildName", "emojiCount", "", "emojisDisabled", "", "", "emojisHidden", "isNitroLocked", "", "hasPremiumInlineRoadblockHeader", "hasPremiumInlineRoadblockFooter", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;Ljava/util/Set;ZZZ)V", "getGuildId", "()Ljava/lang/String;", "getGuildName", "getEmojiCount", "()I", "getEmojisDisabled", "()Ljava/util/Set;", "getEmojisHidden", "()Z", "getHasPremiumInlineRoadblockHeader", "getHasPremiumInlineRoadblockFooter", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Guild extends NativeSection {
                private final int emojiCount;

                @NotNull
                private final Set<Long> emojisDisabled;

                @NotNull
                private final Set<Long> emojisHidden;

                @NotNull
                private final String guildId;

                @NotNull
                private final String guildName;
                private final boolean hasPremiumInlineRoadblockFooter;
                private final boolean hasPremiumInlineRoadblockHeader;
                private final boolean isNitroLocked;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Guild(@NotNull String guildId, @NotNull String guildName, int i7, @NotNull Set<Long> emojisDisabled, @NotNull Set<Long> emojisHidden, boolean z5, boolean z6, boolean z7) {
                    super(null);
                    Intrinsics.checkNotNullParameter(guildId, "guildId");
                    Intrinsics.checkNotNullParameter(guildName, "guildName");
                    Intrinsics.checkNotNullParameter(emojisDisabled, "emojisDisabled");
                    Intrinsics.checkNotNullParameter(emojisHidden, "emojisHidden");
                    this.guildId = guildId;
                    this.guildName = guildName;
                    this.emojiCount = i7;
                    this.emojisDisabled = emojisDisabled;
                    this.emojisHidden = emojisHidden;
                    this.isNitroLocked = z5;
                    this.hasPremiumInlineRoadblockHeader = z6;
                    this.hasPremiumInlineRoadblockFooter = z7;
                }

                public final int getEmojiCount() {
                    return this.emojiCount;
                }

                @NotNull
                public final Set<Long> getEmojisDisabled() {
                    return this.emojisDisabled;
                }

                @NotNull
                public final Set<Long> getEmojisHidden() {
                    return this.emojisHidden;
                }

                @NotNull
                public final String getGuildId() {
                    return this.guildId;
                }

                @NotNull
                public final String getGuildName() {
                    return this.guildName;
                }

                public final boolean getHasPremiumInlineRoadblockFooter() {
                    return this.hasPremiumInlineRoadblockFooter;
                }

                public final boolean getHasPremiumInlineRoadblockHeader() {
                    return this.hasPremiumInlineRoadblockHeader;
                }

                /* JADX INFO: renamed from: isNitroLocked, reason: from getter */
                public final boolean getIsNitroLocked() {
                    return this.isNitroLocked;
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$NativeSection$Unicode;", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$NativeSection;", AlertFragment.ARG_TITLE, "", "emojiCount", "", "<init>", "(Ljava/lang/String;I)V", "getTitle", "()Ljava/lang/String;", "getEmojiCount", "()I", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Unicode extends NativeSection {
                private final int emojiCount;

                @NotNull
                private final String title;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Unicode(@NotNull String title, int i7) {
                    super(null);
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.title = title;
                    this.emojiCount = i7;
                }

                public final int getEmojiCount() {
                    return this.emojiCount;
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }
            }

            public /* synthetic */ NativeSection(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int getCount() {
                if (this instanceof Guild) {
                    return ((Guild) this).getEmojiCount();
                }
                if (this instanceof Unicode) {
                    return ((Unicode) this).getEmojiCount();
                }
                throw new n();
            }

            private NativeSection() {
            }
        }

        public CoreData(int i7, boolean z5, boolean z6, boolean z7, @NotNull List<EmojiPickerItem> leading, @NotNull List<EmojiPickerItem> trailing, @NotNull List<NativeSection.Guild> nativeSectionsEmojis, @NotNull List<NativeSection.Unicode> nativeSectionsEmojisUnicode) {
            Intrinsics.checkNotNullParameter(leading, "leading");
            Intrinsics.checkNotNullParameter(trailing, "trailing");
            Intrinsics.checkNotNullParameter(nativeSectionsEmojis, "nativeSectionsEmojis");
            Intrinsics.checkNotNullParameter(nativeSectionsEmojisUnicode, "nativeSectionsEmojisUnicode");
            this.rowSize = i7;
            this.hasGuildData = z5;
            this.hasSearchData = z6;
            this.hasPremiumInlineRoadblock = z7;
            this.leading = leading;
            this.trailing = trailing;
            this.nativeSectionsEmojis = nativeSectionsEmojis;
            this.nativeSectionsEmojisUnicode = nativeSectionsEmojisUnicode;
            this.categoryIndices = l.b(new r0(20, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map categoryIndices_delegate$lambda$1(CoreData coreData) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i7 = 0;
            for (EmojiPickerItem emojiPickerItem : coreData.leading) {
                if (emojiPickerItem instanceof EmojiPickerItem.Category) {
                    linkedHashMap.put(Long.valueOf(IdUtilsKt.convertToId(((EmojiPickerItem.Category) emojiPickerItem).getTitle())), Integer.valueOf(i7));
                    i7++;
                }
            }
            Iterator<NativeSection.Guild> it = coreData.nativeSectionsEmojis.iterator();
            while (it.hasNext()) {
                linkedHashMap.put(Long.valueOf(Long.parseLong(it.next().getGuildId())), Integer.valueOf(i7));
                i7++;
            }
            Iterator<NativeSection.Unicode> it2 = coreData.nativeSectionsEmojisUnicode.iterator();
            while (it2.hasNext()) {
                linkedHashMap.put(Long.valueOf(IdUtilsKt.convertToId(it2.next().getTitle())), Integer.valueOf(i7));
                i7++;
            }
            for (EmojiPickerItem emojiPickerItem2 : coreData.trailing) {
                if (emojiPickerItem2 instanceof EmojiPickerItem.Category) {
                    linkedHashMap.put(Long.valueOf(IdUtilsKt.convertToId(((EmojiPickerItem.Category) emojiPickerItem2).getTitle())), Integer.valueOf(i7));
                    i7++;
                }
            }
            return linkedHashMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CoreData copy$default(CoreData coreData, int i7, boolean z5, boolean z6, boolean z7, List list, List list2, List list3, List list4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = coreData.rowSize;
            }
            if ((i10 & 2) != 0) {
                z5 = coreData.hasGuildData;
            }
            if ((i10 & 4) != 0) {
                z6 = coreData.hasSearchData;
            }
            if ((i10 & 8) != 0) {
                z7 = coreData.hasPremiumInlineRoadblock;
            }
            if ((i10 & 16) != 0) {
                list = coreData.leading;
            }
            if ((i10 & 32) != 0) {
                list2 = coreData.trailing;
            }
            if ((i10 & 64) != 0) {
                list3 = coreData.nativeSectionsEmojis;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                list4 = coreData.nativeSectionsEmojisUnicode;
            }
            List list5 = list3;
            List list6 = list4;
            List list7 = list;
            List list8 = list2;
            return coreData.copy(i7, z5, z6, z7, list7, list8, list5, list6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRowSize() {
            return this.rowSize;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getHasGuildData() {
            return this.hasGuildData;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getHasSearchData() {
            return this.hasSearchData;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getHasPremiumInlineRoadblock() {
            return this.hasPremiumInlineRoadblock;
        }

        @NotNull
        public final List<EmojiPickerItem> component5() {
            return this.leading;
        }

        @NotNull
        public final List<EmojiPickerItem> component6() {
            return this.trailing;
        }

        @NotNull
        public final List<NativeSection.Guild> component7() {
            return this.nativeSectionsEmojis;
        }

        @NotNull
        public final List<NativeSection.Unicode> component8() {
            return this.nativeSectionsEmojisUnicode;
        }

        @NotNull
        public final CoreData copy(int rowSize, boolean hasGuildData, boolean hasSearchData, boolean hasPremiumInlineRoadblock, @NotNull List<EmojiPickerItem> leading, @NotNull List<EmojiPickerItem> trailing, @NotNull List<NativeSection.Guild> nativeSectionsEmojis, @NotNull List<NativeSection.Unicode> nativeSectionsEmojisUnicode) {
            Intrinsics.checkNotNullParameter(leading, "leading");
            Intrinsics.checkNotNullParameter(trailing, "trailing");
            Intrinsics.checkNotNullParameter(nativeSectionsEmojis, "nativeSectionsEmojis");
            Intrinsics.checkNotNullParameter(nativeSectionsEmojisUnicode, "nativeSectionsEmojisUnicode");
            return new CoreData(rowSize, hasGuildData, hasSearchData, hasPremiumInlineRoadblock, leading, trailing, nativeSectionsEmojis, nativeSectionsEmojisUnicode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CoreData)) {
                return false;
            }
            CoreData coreData = (CoreData) other;
            return this.rowSize == coreData.rowSize && this.hasGuildData == coreData.hasGuildData && this.hasSearchData == coreData.hasSearchData && this.hasPremiumInlineRoadblock == coreData.hasPremiumInlineRoadblock && Intrinsics.areEqual(this.leading, coreData.leading) && Intrinsics.areEqual(this.trailing, coreData.trailing) && Intrinsics.areEqual(this.nativeSectionsEmojis, coreData.nativeSectionsEmojis) && Intrinsics.areEqual(this.nativeSectionsEmojisUnicode, coreData.nativeSectionsEmojisUnicode);
        }

        @NotNull
        public final Map<Long, Integer> getCategoryIndices() {
            return (Map) this.categoryIndices.getValue();
        }

        @NotNull
        public final List<EmojiPickerItem> getEmojisPlaceholderList() {
            return new EmojiPickerPlaceholderList(this.nativeSectionsEmojis, 0L);
        }

        @NotNull
        public final List<EmojiPickerItem> getEmojisUnicodePlaceholderList() {
            return new EmojiPickerPlaceholderList(this.nativeSectionsEmojisUnicode, 50000L);
        }

        public final boolean getHasGuildData() {
            return this.hasGuildData;
        }

        public final boolean getHasPremiumInlineRoadblock() {
            return this.hasPremiumInlineRoadblock;
        }

        public final boolean getHasSearchData() {
            return this.hasSearchData;
        }

        @NotNull
        public final List<EmojiPickerItem> getLeading() {
            return this.leading;
        }

        @NotNull
        public final List<NativeSection.Guild> getNativeSectionsEmojis() {
            return this.nativeSectionsEmojis;
        }

        @NotNull
        public final List<NativeSection.Unicode> getNativeSectionsEmojisUnicode() {
            return this.nativeSectionsEmojisUnicode;
        }

        public final int getRowSize() {
            return this.rowSize;
        }

        @NotNull
        public final List<EmojiPickerItem> getTrailing() {
            return this.trailing;
        }

        public int hashCode() {
            return this.nativeSectionsEmojisUnicode.hashCode() + a3.e.f(this.nativeSectionsEmojis, a3.e.f(this.trailing, a3.e.f(this.leading, com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(Integer.hashCode(this.rowSize) * 31, 31, this.hasGuildData), 31, this.hasSearchData), 31, this.hasPremiumInlineRoadblock), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i7 = this.rowSize;
            boolean z5 = this.hasGuildData;
            boolean z6 = this.hasSearchData;
            boolean z7 = this.hasPremiumInlineRoadblock;
            List<EmojiPickerItem> list = this.leading;
            List<EmojiPickerItem> list2 = this.trailing;
            List<NativeSection.Guild> list3 = this.nativeSectionsEmojis;
            List<NativeSection.Unicode> list4 = this.nativeSectionsEmojisUnicode;
            StringBuilder sb2 = new StringBuilder("CoreData(rowSize=");
            sb2.append(i7);
            sb2.append(", hasGuildData=");
            sb2.append(z5);
            sb2.append(", hasSearchData=");
            a3.e.B(sb2, z6, ", hasPremiumInlineRoadblock=", z7, ", leading=");
            sb2.append(list);
            sb2.append(", trailing=");
            sb2.append(list2);
            sb2.append(", nativeSectionsEmojis=");
            sb2.append(list3);
            sb2.append(", nativeSectionsEmojisUnicode=");
            sb2.append(list4);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public EmojiPickerItemData(@NotNull CoreData coreData) {
        Intrinsics.checkNotNullParameter(coreData, "coreData");
        this.coreData = coreData;
        this.emojisUnset = true;
        n0 n0Var = n0.f14659d;
        this.emojis = n0Var;
        this.emojisUnicode = n0Var;
        this.dataSets = new List[]{coreData.getLeading(), this.coreData.getEmojisPlaceholderList(), this.coreData.getEmojisUnicodePlaceholderList(), this.coreData.getTrailing()};
    }

    @NotNull
    public final EmojiPickerItem getItem(int position) {
        int size = 0;
        for (List<EmojiPickerItem> list : this.dataSets) {
            if (position < list.size() + size) {
                return list.get(position - size);
            }
            size += list.size();
        }
        throw new IndexOutOfBoundsException(kk.b.h(position, "No item at position "));
    }

    public final int getItemCount() {
        int size = 0;
        for (List<EmojiPickerItem> list : this.dataSets) {
            size += list.size();
        }
        return size;
    }

    public final Integer getItemIndex(int position) {
        EmojiPickerItem item = getItem(position);
        if (item instanceof EmojiPickerItem.Category) {
            return this.coreData.getCategoryIndices().get(Long.valueOf(((EmojiPickerItem.Category) item).itemId()));
        }
        throw new IllegalArgumentException(kk.b.h(item.itemType(), "Unsupported item type "));
    }

    public final int getRowSize() {
        return this.coreData.getRowSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCoreData(@NotNull CoreData coreData, @NotNull Function0<Unit> onChanged) {
        Intrinsics.checkNotNullParameter(coreData, "coreData");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        List<EmojiPickerItem>[] listArr = this.dataSets;
        List<EmojiPickerItem> leading = coreData.getLeading();
        leading.set(0, this.coreData.getLeading().get(0));
        Unit unit = Unit.f14616a;
        listArr[0] = leading;
        List<EmojiPickerItem>[] listArr2 = this.dataSets;
        List<EmojiPickerItem> trailing = coreData.getTrailing();
        trailing.set(d0.f(trailing), CollectionsKt.Q(this.coreData.getTrailing()));
        listArr2[3] = trailing;
        if (coreData.getHasSearchData()) {
            List<EmojiPickerItem>[] listArr3 = this.dataSets;
            n0 n0Var = n0.f14659d;
            listArr3[1] = n0Var;
            listArr3[2] = n0Var;
        } else if (this.emojisUnset) {
            this.dataSets[1] = coreData.getEmojisPlaceholderList();
            this.dataSets[2] = coreData.getEmojisUnicodePlaceholderList();
        } else {
            List<EmojiPickerItem>[] listArr4 = this.dataSets;
            listArr4[1] = this.emojis;
            listArr4[2] = this.emojisUnicode;
        }
        this.coreData = coreData;
        onChanged.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setEmojis(@NotNull List<? extends EmojiPickerItem> emojis, @NotNull List<? extends EmojiPickerItem> emojisUnicode, @NotNull Function0<Unit> onChanged) {
        Intrinsics.checkNotNullParameter(emojis, "emojis");
        Intrinsics.checkNotNullParameter(emojisUnicode, "emojisUnicode");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        this.emojisUnset = false;
        this.emojis = emojis;
        this.emojisUnicode = emojisUnicode;
        List<EmojiPickerItem>[] listArr = this.dataSets;
        listArr[1] = emojis;
        listArr[2] = emojisUnicode;
        onChanged.invoke();
    }

    public final void setSpacerBottomHeight(int spacerBottomHeight, @NotNull Function1<? super Integer, Unit> onChanged) {
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Object objQ = CollectionsKt.Q(this.coreData.getTrailing());
        Intrinsics.checkNotNull(objQ, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Spacer");
        if (((EmojiPickerItem.Spacer) objQ).getHeight() != spacerBottomHeight) {
            this.coreData.getTrailing().set(d0.f(this.coreData.getTrailing()), new EmojiPickerItem.Spacer(ViewProps.BOTTOM, spacerBottomHeight));
            onChanged.invoke(Integer.valueOf(getItemCount() - 1));
        }
    }

    public final void setSpacerTopHeight(int spacerTopHeight, @NotNull Function1<? super Integer, Unit> onChanged) {
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Object objK = CollectionsKt.K(this.coreData.getLeading());
        Intrinsics.checkNotNull(objK, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Spacer");
        if (((EmojiPickerItem.Spacer) objK).getHeight() != spacerTopHeight) {
            this.coreData.getLeading().set(0, new EmojiPickerItem.Spacer(ViewProps.TOP, spacerTopHeight));
            onChanged.invoke(0);
        }
    }
}
