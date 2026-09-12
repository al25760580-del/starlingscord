package com.discord.emoji_picker.react.deserialization;

import com.discord.emoji.UnicodeEmojis;
import com.discord.emoji_picker.EmojiPickerItem;
import com.discord.emoji_picker.EmojiPickerItemData;
import com.discord.misc.utilities.ids.IdUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lo.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J4\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J&\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002¨\u0006\""}, d2 = {"Lcom/discord/emoji_picker/react/deserialization/EmojiPickerItemDataCoreDataDeserializer;", "", "<init>", "()V", "deserialize", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$Companion;", "data", "Lcom/facebook/react/bridge/ReadableMap;", "contentPaddingBottom", "", "contentPaddingTop", "deserializeRowSize", "", "deserializeTypeTitle", "", "section", "leading", "", "Lcom/discord/emoji_picker/EmojiPickerItem;", "deserializeTypeNativeSection", "emojiSection", "emojis", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$NativeSection$Guild;", "emojisUnicode", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData$NativeSection$Unicode;", "isSectionNitroLocked", "", "deserializeTypeFooterUpsell", "trailing", "deserializeTypeEmojiRowSlim", "emojisRow", "Lcom/facebook/react/bridge/ReadableArray;", "emojiItems", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmojiPickerItemDataCoreDataDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerItemDataCoreDataDeserializer.kt\ncom/discord/emoji_picker/react/deserialization/EmojiPickerItemDataCoreDataDeserializer\n+ 2 NativeArrayExtensions.kt\ncom/discord/react/utilities/NativeArrayExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n122#2:203\n119#2:204\n123#2,2:206\n114#2:209\n115#2:212\n116#2:214\n114#2:215\n115#2:218\n116#2:220\n119#2:222\n1869#3:205\n1870#3:208\n1634#3,2:210\n1636#3:213\n1634#3,2:216\n1636#3:219\n1869#3,2:223\n1#4:221\n*S KotlinDebug\n*F\n+ 1 EmojiPickerItemDataCoreDataDeserializer.kt\ncom/discord/emoji_picker/react/deserialization/EmojiPickerItemDataCoreDataDeserializer\n*L\n35#1:203\n35#1:204\n35#1:206,2\n124#1:209\n124#1:212\n124#1:214\n129#1:215\n129#1:218\n129#1:220\n170#1:222\n35#1:205\n35#1:208\n124#1:210,2\n124#1:213\n129#1:216,2\n129#1:219\n170#1:223,2\n*E\n"})
public final class EmojiPickerItemDataCoreDataDeserializer {

    @NotNull
    public static final EmojiPickerItemDataCoreDataDeserializer INSTANCE = new EmojiPickerItemDataCoreDataDeserializer();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmojiPickerItemTypes.values().length];
            try {
                iArr[EmojiPickerItemTypes.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmojiPickerItemTypes.EMOJI_ROW_SLIM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmojiPickerItemTypes.NATIVE_SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmojiPickerItemTypes.FOOTER_UPSELL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private EmojiPickerItemDataCoreDataDeserializer() {
    }

    public static /* synthetic */ EmojiPickerItemData.CoreData deserialize$default(EmojiPickerItemDataCoreDataDeserializer emojiPickerItemDataCoreDataDeserializer, EmojiPickerItemData.CoreData.Companion companion, ReadableMap readableMap, float f2, float f7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i7 & 4) != 0) {
            f7 = 0.0f;
        }
        return emojiPickerItemDataCoreDataDeserializer.deserialize(companion, readableMap, f2, f7);
    }

    private final int deserializeRowSize(ReadableMap data) {
        int i7 = data.getInt("rowSize");
        if (i7 > 0) {
            return i7;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private final void deserializeTypeEmojiRowSlim(ReadableArray emojisRow, List<EmojiPickerItem> emojiItems, boolean isSectionNitroLocked) {
        Iterator it = NativeArrayExtensionsKt.sizeRange(emojisRow).iterator();
        while (it.hasNext()) {
            ReadableMap map = emojisRow.getMap(((s0) it).nextInt());
            Intrinsics.checkNotNull(map);
            String string = map.getString(StackTraceHelper.ID_KEY);
            String nonNullString = NativeMapExtensionsKt.getNonNullString(map, StackTraceHelper.NAME_KEY);
            boolean z5 = NativeMapExtensionsKt.getBoolean(map, "animated", false);
            if (string == null) {
                emojiItems.add(new EmojiPickerItem.Emoji(IdUtilsKt.convertToId(nonNullString), nonNullString, z5, null, new UnicodeEmojis.Emoji(c0.c(nonNullString), NativeMapExtensionsKt.getNonNullString(map, "surrogates")), false, 40, null));
            } else {
                emojiItems.add(new EmojiPickerItem.Emoji(Long.parseLong(string), nonNullString, z5, EmojiPickerItem.Emoji.DisabledType.INSTANCE.create(NativeMapExtensionsKt.getBoolean(map, "disabled", false), isSectionNitroLocked), null, false, 48, null));
            }
        }
    }

    private final void deserializeTypeFooterUpsell(ReadableMap section, List<EmojiPickerItem> trailing) {
        Object next;
        Iterator<T> it = trailing.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((EmojiPickerItem) next) instanceof EmojiPickerItem.FooterUpsell));
        if (next != null) {
            throw new IllegalArgumentException("Only one footer upsell is supported.");
        }
        trailing.add(d0.f(trailing), new EmojiPickerItem.FooterUpsell(NativeMapExtensionsKt.getNonNullString(section, StackTraceHelper.ID_KEY)));
    }

    private final void deserializeTypeNativeSection(ReadableMap emojiSection, List<EmojiPickerItemData.CoreData.NativeSection.Guild> emojis, List<EmojiPickerItemData.CoreData.NativeSection.Unicode> emojisUnicode, boolean isSectionNitroLocked) {
        String string = emojiSection.getString("guildId");
        if (string == null) {
            emojisUnicode.add(new EmojiPickerItemData.CoreData.NativeSection.Unicode(NativeMapExtensionsKt.getNonNullString(emojiSection, AlertFragment.ARG_TITLE), emojiSection.getInt("emojiCount")));
            return;
        }
        String nonNullString = NativeMapExtensionsKt.getNonNullString(emojiSection, AlertFragment.ARG_TITLE);
        int i7 = emojiSection.getInt("emojiCount");
        ReadableArray nonNullArray = NativeMapExtensionsKt.getNonNullArray(emojiSection, "emojisDisabled");
        HashSet hashSet = new HashSet();
        Iterator it = NativeArrayExtensionsKt.sizeRange(nonNullArray).iterator();
        while (it.hasNext()) {
            String string2 = nonNullArray.getString(((s0) it).nextInt());
            Intrinsics.checkNotNull(string2);
            hashSet.add(Long.valueOf(Long.parseLong(string2)));
        }
        ReadableArray nonNullArray2 = NativeMapExtensionsKt.getNonNullArray(emojiSection, "emojisHidden");
        HashSet hashSet2 = new HashSet();
        Iterator it2 = NativeArrayExtensionsKt.sizeRange(nonNullArray2).iterator();
        while (it2.hasNext()) {
            String string3 = nonNullArray2.getString(((s0) it2).nextInt());
            Intrinsics.checkNotNull(string3);
            hashSet2.add(Long.valueOf(Long.parseLong(string3)));
        }
        emojis.add(new EmojiPickerItemData.CoreData.NativeSection.Guild(string, nonNullString, i7, hashSet, hashSet2, isSectionNitroLocked, emojiSection.getBoolean("hasPremiumInlineRoadblockHeader"), emojiSection.getBoolean("hasPremiumInlineRoadblockFooter")));
    }

    private final void deserializeTypeTitle(ReadableMap section, List<EmojiPickerItem> leading) {
        leading.add(new EmojiPickerItem.Category(NativeMapExtensionsKt.getNonNullString(section, AlertFragment.ARG_TITLE), 0L, false, 6, null));
    }

    @NotNull
    public final EmojiPickerItemData.CoreData deserialize(@NotNull EmojiPickerItemData.CoreData.Companion companion, @NotNull ReadableMap data, float f2, float f7) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        EmojiPickerItem.Spacer spacer = new EmojiPickerItem.Spacer(ViewProps.TOP, SizeUtilsKt.getDpToPx(f7));
        EmojiPickerItem.Spacer spacer2 = new EmojiPickerItem.Spacer(ViewProps.BOTTOM, SizeUtilsKt.getDpToPx(f2));
        ArrayList arrayListI = d0.i(spacer);
        ArrayList arrayListI2 = d0.i(spacer2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ReadableArray nonNullArray = NativeMapExtensionsKt.getNonNullArray(data, "data");
        Iterator it = NativeArrayExtensionsKt.sizeRange(nonNullArray).iterator();
        boolean z5 = false;
        while (((b) it).f15156i) {
            ReadableMap map = nonNullArray.getMap(((s0) it).nextInt());
            Intrinsics.checkNotNull(map);
            EmojiPickerItemTypes emojiPickerItemTypesCreate = EmojiPickerItemTypes.INSTANCE.create(map.getInt("type"));
            int i7 = WhenMappings.$EnumSwitchMapping$0[emojiPickerItemTypesCreate.ordinal()];
            if (i7 == 1) {
                INSTANCE.deserializeTypeTitle(map, arrayListI);
            } else if (i7 == 2) {
                EmojiPickerItemDataCoreDataDeserializer emojiPickerItemDataCoreDataDeserializer = INSTANCE;
                ReadableArray nonNullArray2 = NativeMapExtensionsKt.getNonNullArray(map, "emojis");
                boolean z6 = map.getBoolean("isSectionNitroLocked");
                z5 = z5 || z6;
                Unit unit = Unit.f14616a;
                emojiPickerItemDataCoreDataDeserializer.deserializeTypeEmojiRowSlim(nonNullArray2, arrayListI, z6);
            } else if (i7 == 3) {
                EmojiPickerItemDataCoreDataDeserializer emojiPickerItemDataCoreDataDeserializer2 = INSTANCE;
                boolean z7 = map.getBoolean("isSectionNitroLocked");
                z5 = z5 || z7;
                Unit unit2 = Unit.f14616a;
                emojiPickerItemDataCoreDataDeserializer2.deserializeTypeNativeSection(map, arrayList, arrayList2, z7);
            } else if (i7 == 4) {
                INSTANCE.deserializeTypeFooterUpsell(map, arrayListI2);
            } else if (!emojiPickerItemTypesCreate.getNoop()) {
                throw new IllegalArgumentException(emojiPickerItemTypesCreate.getUnsupported());
            }
        }
        return new EmojiPickerItemData.CoreData(deserializeRowSize(data), data.getBoolean("hasGuildData"), data.getBoolean("hasSearchData"), z5, arrayListI, arrayListI2, arrayList, arrayList2);
    }
}
