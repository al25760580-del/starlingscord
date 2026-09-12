package qr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f19000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f19001b;

    static {
        String[] strArr = new String[93];
        for (int i7 = 0; i7 < 32; i7++) {
            strArr[i7] = "\\u" + b(i7 >> 12) + b(i7 >> 8) + b(i7 >> 4) + b(i7);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f19000a = strArr;
        byte[] bArr = new byte[93];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f19001b = bArr;
    }

    public static final void a(String value, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            String[] strArr = f19000a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) value, i7, i10);
                sb2.append(strArr[cCharAt]);
                i7 = i10 + 1;
            }
        }
        if (i7 != 0) {
            sb2.append((CharSequence) value, i7, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    public static final char b(int i7) {
        int i10 = i7 & 15;
        return (char) (i10 < 10 ? i10 + 48 : i10 + 87);
    }
}
