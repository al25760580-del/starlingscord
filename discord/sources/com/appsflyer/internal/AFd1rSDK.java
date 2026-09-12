package com.appsflyer.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/StringExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,102:1\n13004#2,3:103\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/StringExtensionsKt\n*L\n44#1:103,3\n*E\n"})
public final class AFd1rSDK {
    public static final String AFAdRevenueData(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strJ = "";
        for (byte b10 : bArrDigest) {
            String str3 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            strJ = kk.b.j(strJ, str3);
        }
        return strJ;
    }

    public static final Pair<Integer, Integer> getCurrencyIso4217Code(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.m mVarC = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").c(str);
        if (mVarC != null) {
            kotlin.collections.k kVar = mVarC.f14736c;
            MatchGroup matchGroupB = kVar.b(1);
            Integer intOrNull = (matchGroupB == null || (str7 = matchGroupB.f14703a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup matchGroupB2 = kVar.b(2);
            Integer intOrNull2 = (matchGroupB2 == null || (str6 = matchGroupB2.f14703a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup matchGroupB3 = kVar.b(3);
            Integer intOrNull3 = (matchGroupB3 == null || (str5 = matchGroupB3.f14703a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup matchGroupB4 = kVar.b(4);
            Integer intOrNull4 = (matchGroupB4 == null || (str4 = matchGroupB4.f14703a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupB5 = kVar.b(5);
            Integer intOrNull5 = (matchGroupB5 == null || (str3 = matchGroupB5.f14703a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroupB6 = kVar.b(6);
            Integer intOrNull6 = (matchGroupB6 == null || (str2 = matchGroupB6.f14703a) == null) ? null : StringsKt.toIntOrNull(str2);
            Integer num = intOrNull6;
            if (getMonetizationNetwork(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.checkNotNull(intOrNull);
                int iIntValue = intOrNull.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull2);
                int iIntValue2 = (intOrNull2.intValue() * 1000) + iIntValue;
                Intrinsics.checkNotNull(intOrNull3);
                Integer numValueOf = Integer.valueOf(intOrNull3.intValue() + iIntValue2);
                Intrinsics.checkNotNull(intOrNull4);
                int iIntValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull5);
                int iIntValue4 = (intOrNull5.intValue() * 1000) + iIntValue3;
                Intrinsics.checkNotNull(num);
                return new Pair<>(numValueOf, Integer.valueOf(num.intValue() + iIntValue4));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> getMonetizationNetwork(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.m mVarC = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").c(str);
        if (mVarC != null) {
            kotlin.collections.k kVar = mVarC.f14736c;
            MatchGroup matchGroupB = kVar.b(1);
            Integer intOrNull = (matchGroupB == null || (str4 = matchGroupB.f14703a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupB2 = kVar.b(3);
            Integer intOrNull2 = (matchGroupB2 == null || (str3 = matchGroupB2.f14703a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroupB3 = kVar.b(4);
            Integer intOrNull3 = (matchGroupB3 == null || (str2 = matchGroupB3.f14703a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    @NotNull
    public static final String getRevenue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }

    private static boolean getMonetizationNetwork(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !y.p(null, objArr);
    }
}
