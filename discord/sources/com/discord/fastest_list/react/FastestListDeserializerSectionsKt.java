package com.discord.fastest_list.react;

import com.discord.fastest_list.android.FastestListSections;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\u0002\u001aO\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0013\u001aA\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0019\u001aA\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u001f¨\u0006 "}, d2 = {"invoke", "Lcom/discord/fastest_list/android/FastestListSections$Versioned;", "Lcom/discord/fastest_list/android/FastestListSections$Versioned$Companion;", "value", "Lcom/facebook/react/bridge/ReadableMap;", "createSectionItem", "Lcom/discord/fastest_list/android/FastestListSections$Entry$SectionItem;", "listId", "", "keysAreUniform", "", "sectionIndex", "", "sectionItemCount", "sectionItemIndex", "itemKeys", "Lcom/facebook/react/bridge/ReadableArray;", "itemSizeUniform", "itemSizes", "(Ljava/lang/String;ZIIILcom/facebook/react/bridge/ReadableArray;Ljava/lang/Integer;Lcom/facebook/react/bridge/ReadableArray;)Lcom/discord/fastest_list/android/FastestListSections$Entry$SectionItem;", "createSectionHeader", "Lcom/discord/fastest_list/android/FastestListSections$Entry$SectionHeader;", "sectionHeaderKeys", "sectionHeaderSizeUniform", "sectionHeaderSizes", "(Ljava/lang/String;ZILcom/facebook/react/bridge/ReadableArray;Ljava/lang/Integer;Lcom/facebook/react/bridge/ReadableArray;)Lcom/discord/fastest_list/android/FastestListSections$Entry$SectionHeader;", "createSectionFooter", "Lcom/discord/fastest_list/android/FastestListSections$Entry$SectionFooter;", "sectionFooterKeys", "sectionFooterSizeUniform", "sectionFooterSizes", "(Ljava/lang/String;ZILcom/facebook/react/bridge/ReadableArray;Ljava/lang/Integer;Lcom/facebook/react/bridge/ReadableArray;)Lcom/discord/fastest_list/android/FastestListSections$Entry$SectionFooter;", "fastest_list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FastestListDeserializerSectionsKt {
    private static final FastestListSections.Entry.SectionFooter createSectionFooter(String str, boolean z5, int i7, ReadableArray readableArray, Integer num, ReadableArray readableArray2) {
        int iIntValue = num != null ? num.intValue() : SizeUtilsKt.getDpToPx(readableArray2.getDouble(i7));
        if (iIntValue > 0) {
            return new FastestListSections.Entry.SectionFooter(FastestListSections.Entry.SectionFooter.INSTANCE.createKey(str, i7, !z5 ? readableArray.getString(i7) : null), FastestListSections.Section.m972constructorimpl(i7), iIntValue, null);
        }
        return null;
    }

    private static final FastestListSections.Entry.SectionHeader createSectionHeader(String str, boolean z5, int i7, ReadableArray readableArray, Integer num, ReadableArray readableArray2) {
        int iIntValue = num != null ? num.intValue() : SizeUtilsKt.getDpToPx(readableArray2.getDouble(i7));
        if (iIntValue > 0) {
            return new FastestListSections.Entry.SectionHeader(FastestListSections.Entry.SectionHeader.INSTANCE.createKey(str, i7, !z5 ? readableArray.getString(i7) : null), FastestListSections.Section.m972constructorimpl(i7), iIntValue, null);
        }
        return null;
    }

    private static final FastestListSections.Entry.SectionItem createSectionItem(String str, boolean z5, int i7, int i10, int i11, ReadableArray readableArray, Integer num, ReadableArray readableArray2) {
        int dpToPx;
        String string;
        if (num != null) {
            dpToPx = num.intValue();
        } else {
            ReadableMap map = readableArray2.getMap(i7);
            Intrinsics.checkNotNull(map);
            dpToPx = SizeUtilsKt.getDpToPx(NativeMapExtensionsKt.getNonNullArray(map, "sizes").getDouble(i11));
        }
        int i12 = dpToPx;
        if (z5) {
            string = null;
        } else {
            ReadableMap map2 = readableArray.getMap(i7);
            Intrinsics.checkNotNull(map2);
            string = NativeMapExtensionsKt.getNonNullArray(map2, "keys").getString(i11);
        }
        return new FastestListSections.Entry.SectionItem(FastestListSections.Entry.SectionItem.INSTANCE.createKey(str, i7, i11, string), FastestListSections.Section.m972constructorimpl(i7), FastestListSections.Item.m965constructorimpl(i11), i12, i11 == 0, i11 == i10 - 1, null);
    }

    @NotNull
    public static final FastestListSections.Versioned invoke(@NotNull FastestListSections.Versioned.Companion companion, @NotNull ReadableMap value) {
        Integer numValueOf;
        Integer num;
        ReadableArray readableArray;
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        String nonNullString = NativeMapExtensionsKt.getNonNullString(value, "listId");
        boolean z5 = value.getBoolean("keysAreUniform");
        ArrayList arrayList = new ArrayList();
        Ref.IntRef intRef = new Ref.IntRef();
        ArrayList arrayList2 = new ArrayList();
        List<Integer> intList = NativeArrayExtensionsKt.toIntList(NativeMapExtensionsKt.getNonNullArray(value, "sections"));
        String nonNullString2 = NativeMapExtensionsKt.getNonNullString(value, "sectionsId");
        ReadableArray nonNullArray = NativeMapExtensionsKt.getNonNullArray(value, "itemKeys");
        ReadableArray nonNullArray2 = NativeMapExtensionsKt.getNonNullArray(value, "itemSizes");
        if (value.getBoolean("itemSizeIsUniform")) {
            ReadableMap map = nonNullArray2.getMap(0);
            Intrinsics.checkNotNull(map);
            numValueOf = Integer.valueOf(SizeUtilsKt.getDpToPx(NativeMapExtensionsKt.getNonNullArray(map, "sizes").getDouble(0)));
        } else {
            numValueOf = null;
        }
        ReadableArray nonNullArray3 = NativeMapExtensionsKt.getNonNullArray(value, "sectionHeaderKeys");
        ReadableArray nonNullArray4 = NativeMapExtensionsKt.getNonNullArray(value, "sectionHeaderSizes");
        Integer numValueOf2 = value.getBoolean("sectionHeaderSizeIsUniform") ? Integer.valueOf(SizeUtilsKt.getDpToPx(nonNullArray4.getDouble(0))) : null;
        ReadableArray nonNullArray5 = NativeMapExtensionsKt.getNonNullArray(value, "sectionFooterKeys");
        ReadableArray nonNullArray6 = NativeMapExtensionsKt.getNonNullArray(value, "sectionFooterSizes");
        Integer numValueOf3 = value.getBoolean("sectionFooterSizeIsUniform") ? Integer.valueOf(SizeUtilsKt.getDpToPx(nonNullArray6.getDouble(0))) : null;
        boolean z6 = z5;
        String nonNullString3 = NativeMapExtensionsKt.getNonNullString(value, "listHeaderKey");
        ReadableArray readableArray2 = nonNullArray3;
        int dpToPx = SizeUtilsKt.getDpToPx(value.getDouble("listHeaderSize"));
        FastestListSections.Entry.ListHeader listHeader = dpToPx > 0 ? new FastestListSections.Entry.ListHeader(FastestListSections.Entry.ListHeader.INSTANCE.createKey(nonNullString, nonNullString3), FastestListSections.Section.m972constructorimpl(0), dpToPx, null) : null;
        String nonNullString4 = NativeMapExtensionsKt.getNonNullString(value, "listFooterKey");
        int dpToPx2 = SizeUtilsKt.getDpToPx(value.getDouble("listFooterSize"));
        FastestListSections.Entry.ListFooter listFooter = dpToPx2 > 0 ? new FastestListSections.Entry.ListFooter(FastestListSections.Entry.ListFooter.INSTANCE.createKey(nonNullString, nonNullString4), FastestListSections.Section.m972constructorimpl(Math.max(0, d0.f(intList))), dpToPx2, null) : null;
        int i7 = 0;
        while (i7 <= d0.f(intList)) {
            if (i7 == 0) {
                invoke$lambda$0(arrayList2, arrayList, intRef, listHeader);
            }
            int iIntValue = intList.get(i7).intValue();
            if (iIntValue == 0) {
                if (i7 == d0.f(intList)) {
                    invoke$lambda$0(arrayList2, arrayList, intRef, listFooter);
                }
                i7++;
            } else {
                FastestListSections.Entry.ListHeader listHeader2 = listHeader;
                Integer num2 = numValueOf;
                boolean z7 = z6;
                Integer num3 = numValueOf2;
                int i10 = iIntValue;
                ReadableArray readableArray3 = readableArray2;
                ReadableArray readableArray4 = nonNullArray2;
                invoke$lambda$0(arrayList2, arrayList, intRef, createSectionHeader(nonNullString, z7, i7, readableArray3, num3, nonNullArray4));
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i10;
                    ReadableArray readableArray5 = nonNullArray;
                    Integer num4 = num2;
                    invoke$lambda$0(arrayList2, arrayList, intRef, createSectionItem(nonNullString, z7, i7, i12, i11, readableArray5, num4, readableArray4));
                    i11++;
                    nonNullArray = readableArray5;
                    num2 = num4;
                    i10 = i12;
                }
                Integer num5 = num2;
                int i13 = i10;
                ReadableArray readableArray6 = nonNullArray;
                if (i11 == i13) {
                    num = numValueOf3;
                    readableArray = nonNullArray5;
                    invoke$lambda$0(arrayList2, arrayList, intRef, createSectionFooter(nonNullString, z7, i7, readableArray, num, nonNullArray6));
                    if (i7 == d0.f(intList)) {
                        invoke$lambda$0(arrayList2, arrayList, intRef, listFooter);
                    }
                } else {
                    num = numValueOf3;
                    readableArray = nonNullArray5;
                }
                i7++;
                z6 = z7;
                nonNullArray5 = readableArray;
                numValueOf3 = num;
                nonNullArray = readableArray6;
                numValueOf = num5;
                listHeader = listHeader2;
                nonNullArray2 = readableArray4;
                readableArray2 = readableArray3;
                numValueOf2 = num3;
            }
        }
        return new FastestListSections.Versioned(nonNullString2, arrayList2, intRef.element, arrayList);
    }

    private static final Unit invoke$lambda$0(List list, List list2, Ref.IntRef intRef, FastestListSections.Entry entry) {
        if (entry != null) {
            list.add(entry);
            list2.add(Integer.valueOf(intRef.element));
            intRef.element = entry.getSize() + intRef.element;
        }
        return Unit.f14616a;
    }
}
