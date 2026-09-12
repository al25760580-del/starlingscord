package kotlin.text;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f14716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f14717b;

    static {
        int[] iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        int i7 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = "0123456789abcdef".charAt(i10 & 15) | ("0123456789abcdef".charAt(i10 >> 4) << '\b');
        }
        f14716a = iArr;
        int[] iArr2 = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr2[i11] = "0123456789ABCDEF".charAt(i11 & 15) | ("0123456789ABCDEF".charAt(i11 >> 4) << '\b');
        }
        int[] iArr3 = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr3[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        long[] jArr = new long[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i17 = 0; i17 < 256; i17++) {
            jArr[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i20 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i7)] = i20;
            i7++;
            i20++;
        }
        f14717b = jArr;
    }

    public static final void a(int i7, int i10, String str) {
        int i11 = i10 - i7;
        if (i11 < 1) {
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = str.substring(i7, i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            StringBuilder sbO = com.discord.chat.presentation.list.a.o("Expected at least 1 hexadecimal digits at index ", ", but was \"", strSubstring, i7, "\" of length ");
            sbO.append(i11);
            throw new NumberFormatException(sbO.toString());
        }
        if (i11 > 16) {
            int i12 = (i11 + i7) - 16;
            while (i7 < i12) {
                if (str.charAt(i7) != '0') {
                    StringBuilder sbS = a3.e.s(i7, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbS.append(str.charAt(i7));
                    sbS.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbS.toString());
                }
                i7++;
            }
        }
    }

    public static long b(int i7, int i10, String str) {
        j.f14723d.getClass();
        j format = j.f14724e;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int length = str.length();
        dVar.getClass();
        kotlin.collections.d.a(i7, i10, length);
        if (format.f14727c.f14722a) {
            a(i7, i10, str);
            return c(i7, i10, str);
        }
        if (i10 - i7 > 0) {
            a(i7, i10, str);
            return c(i7, i10, str);
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i7, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException(a3.e.l("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ", strSubstring));
    }

    public static final long c(int i7, int i10, String str) {
        long j = 0;
        while (i7 < i10) {
            long j5 = j << 4;
            char cCharAt = str.charAt(i7);
            if ((cCharAt >>> '\b') == 0) {
                long j7 = f14717b[cCharAt];
                if (j7 >= 0) {
                    j = j5 | j7;
                    i7++;
                }
            }
            StringBuilder sbS = a3.e.s(i7, "Expected a hexadecimal digit at index ", ", but was ");
            sbS.append(str.charAt(i7));
            throw new NumberFormatException(sbS.toString());
        }
        return j;
    }
}
