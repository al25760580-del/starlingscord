package com.discord.sticker_picker.react;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.sticker_picker.StickerPickerRow;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kk.b;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"deserializeStickerPickerRowData", "Lcom/discord/sticker_picker/StickerPickerRow;", "data", "Lcom/facebook/react/bridge/ReadableMap;", "sticker_picker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStickerPickerRowDataSerializationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerPickerRowDataSerializationUtils.kt\ncom/discord/sticker_picker/react/StickerPickerRowDataSerializationUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1563#2:45\n1634#2,3:46\n*S KotlinDebug\n*F\n+ 1 StickerPickerRowDataSerializationUtils.kt\ncom/discord/sticker_picker/react/StickerPickerRowDataSerializationUtilsKt\n*L\n17#1:45\n17#1:46,3\n*E\n"})
public final class StickerPickerRowDataSerializationUtilsKt {
    @NotNull
    public static final StickerPickerRow deserializeStickerPickerRowData(@NotNull ReadableMap data) {
        StickerPickerRow.Sticker.Type type;
        Intrinsics.checkNotNullParameter(data, "data");
        double d6 = data.getDouble("rowContentWidth");
        int i7 = data.getInt("rowContentPaddingVertical");
        int i10 = data.getInt("itemSize");
        ReadableArray nonNullArray = NativeMapExtensionsKt.getNonNullArray(data, AlertFragment.ARG_ITEMS);
        IntRange intRangeSizeRange = NativeArrayExtensionsKt.sizeRange(nonNullArray);
        ArrayList arrayList = new ArrayList(e0.l(intRangeSizeRange, 10));
        Iterator it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            StickerPickerRow.Sticker sticker = null;
            if (!nonNullArray.isNull(iNextInt)) {
                ReadableMap map = nonNullArray.getMap(iNextInt);
                if ((map != null ? map.getString("stickerId") : null) != null) {
                    ReadableMap map2 = nonNullArray.getMap(iNextInt);
                    Intrinsics.checkNotNull(map2);
                    String nonNullString = NativeMapExtensionsKt.getNonNullString(map2, "stickerId");
                    String nonNullString2 = NativeMapExtensionsKt.getNonNullString(map2, "stickerName");
                    int i11 = map2.getInt("stickerType");
                    if (i11 == 1) {
                        type = StickerPickerRow.Sticker.Type.PNG;
                    } else if (i11 == 2) {
                        type = StickerPickerRow.Sticker.Type.APNG;
                    } else if (i11 == 3) {
                        type = StickerPickerRow.Sticker.Type.LOTTIE;
                    } else {
                        if (i11 != 4) {
                            throw new IllegalArgumentException(b.h(i11, "Unknown type "));
                        }
                        type = StickerPickerRow.Sticker.Type.GIF;
                    }
                    sticker = new StickerPickerRow.Sticker(nonNullString, nonNullString2, type, map2.getBoolean("stickerAnimated"), NativeMapExtensionsKt.getNonNullString(map2, "stickerUrl"), map2.getBoolean("stickerDisabled"), map2.getBoolean("stickerOpaque"));
                } else {
                    continue;
                }
            }
            arrayList.add(sticker);
        }
        return new StickerPickerRow(d6, i7, i10, arrayList);
    }
}
