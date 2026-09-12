package com.discord.emoji_picker.react;

import com.discord.emoji_picker.EmojiPickerRow;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"deserializeEmojiPickerRowData", "Lcom/discord/emoji_picker/EmojiPickerRow;", "data", "Lcom/facebook/react/bridge/ReadableMap;", "emoji_picker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmojiPickerRowDataSerializationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerRowDataSerializationUtils.kt\ncom/discord/emoji_picker/react/EmojiPickerRowDataSerializationUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1563#2:36\n1634#2,3:37\n*S KotlinDebug\n*F\n+ 1 EmojiPickerRowDataSerializationUtils.kt\ncom/discord/emoji_picker/react/EmojiPickerRowDataSerializationUtilsKt\n*L\n17#1:36\n17#1:37,3\n*E\n"})
public final class EmojiPickerRowDataSerializationUtilsKt {
    @NotNull
    public static final EmojiPickerRow deserializeEmojiPickerRowData(@NotNull ReadableMap data) {
        Intrinsics.checkNotNullParameter(data, "data");
        double d6 = data.getDouble("rowContentWidth");
        int i7 = data.getInt("rowContentPaddingVertical");
        int i10 = data.getInt("itemSize");
        ReadableArray nonNullArray = NativeMapExtensionsKt.getNonNullArray(data, AlertFragment.ARG_ITEMS);
        IntRange intRangeSizeRange = NativeArrayExtensionsKt.sizeRange(nonNullArray);
        ArrayList arrayList = new ArrayList(e0.l(intRangeSizeRange, 10));
        Iterator it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            ReadableMap map = nonNullArray.getMap(((s0) it).nextInt());
            Intrinsics.checkNotNull(map);
            arrayList.add(!StringsKt.K(NativeMapExtensionsKt.getNonNullString(map, "url")) ? new EmojiPickerRow.Emoji(map.getString(StackTraceHelper.ID_KEY), NativeMapExtensionsKt.getNonNullString(map, StackTraceHelper.NAME_KEY), NativeMapExtensionsKt.getNonNullString(map, "url"), map.getBoolean("animated"), map.getBoolean("disabled")) : null);
        }
        return new EmojiPickerRow(d6, i7, i10, arrayList, data.getBoolean("isSectionNitroLocked"));
    }
}
