package cs;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a10 = (String) obj;
        String b10 = (String) obj2;
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        int iMin = Math.min(a10.length(), b10.length());
        for (int i7 = 4; i7 < iMin; i7++) {
            char cCharAt = a10.charAt(i7);
            char cCharAt2 = b10.charAt(i7);
            if (cCharAt != cCharAt2) {
                return Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a10.length();
        int length2 = b10.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
