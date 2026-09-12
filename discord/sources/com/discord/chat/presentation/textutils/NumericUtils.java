package com.discord.chat.presentation.textutils;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/textutils/NumericUtils;", "", "<init>", "()V", "letters", "", "", "romanNumeralMap", "Ljava/util/TreeMap;", "", "toRomanNumeral", "number", "toLetter", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNumericUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumericUtils.kt\ncom/discord/chat/presentation/textutils/NumericUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1#2:66\n827#3:67\n855#3,2:68\n*S KotlinDebug\n*F\n+ 1 NumericUtils.kt\ncom/discord/chat/presentation/textutils/NumericUtils\n*L\n6#1:67\n6#1:68,2\n*E\n"})
public final class NumericUtils {

    @NotNull
    public static final NumericUtils INSTANCE = new NumericUtils();

    @NotNull
    private static final List<String> letters;

    @NotNull
    private static final TreeMap<Long, String> romanNumeralMap;

    static {
        List listSplit$default = StringsKt__StringsKt.split$default("abcdefghijklmnopqrstuvwxyz", new String[]{""}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() != 0) {
                arrayList.add(obj);
            }
        }
        letters = arrayList;
        TreeMap<Long, String> treeMap = new TreeMap<>();
        romanNumeralMap = treeMap;
        treeMap.put(1000L, "m");
        treeMap.put(900L, "cm");
        treeMap.put(500L, "d");
        treeMap.put(400L, "cm");
        treeMap.put(100L, "c");
        treeMap.put(90L, "xc");
        treeMap.put(50L, "l");
        treeMap.put(40L, "xl");
        treeMap.put(10L, "x");
        treeMap.put(9L, "ix");
        treeMap.put(5L, "v");
        treeMap.put(4L, "iv");
        treeMap.put(1L, "i");
    }

    private NumericUtils() {
    }

    @NotNull
    public final String toLetter(long number) {
        if (number < 1) {
            throw new IllegalArgumentException(b.i(number, "Number must be at least 1. Provided: ").toString());
        }
        if (number <= 26) {
            return letters.get(((int) number) - 1);
        }
        long j = 26;
        long j5 = number / j;
        long j7 = number % j;
        return b.j(toLetter(j5), toLetter(j7 >= 1 ? j7 : 1L));
    }

    @NotNull
    public final String toRomanNumeral(long number) {
        if (number < 1) {
            throw new IllegalArgumentException(b.i(number, "Number must be at least 1. Provided: ").toString());
        }
        TreeMap<Long, String> treeMap = romanNumeralMap;
        Long lFloorKey = treeMap.floorKey(Long.valueOf(number));
        Intrinsics.checkNotNull(lFloorKey);
        long jLongValue = lFloorKey.longValue();
        if (number == jLongValue) {
            String str = treeMap.get(Long.valueOf(number));
            Intrinsics.checkNotNull(str);
            return str;
        }
        String str2 = treeMap.get(Long.valueOf(jLongValue));
        return ((Object) str2) + toRomanNumeral(number - jLongValue);
    }
}
