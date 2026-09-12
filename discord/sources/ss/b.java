package ss;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import rs.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f20565a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 'W';
        }
        if ('A' <= c8 && c8 < 'G') {
            return c8 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c8);
    }

    public static final byte[] b(String str) {
        int i7;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt2 = str.charAt(i10);
            if (Intrinsics.compare((int) cCharAt2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) >= 0) {
                int length2 = str.length();
                int i11 = i10;
                while (i10 < length2) {
                    char cCharAt3 = str.charAt(i10);
                    if (Intrinsics.compare((int) cCharAt3, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) < 0) {
                        int i12 = i11 + 1;
                        bArr[i11] = (byte) cCharAt3;
                        i10++;
                        while (true) {
                            i11 = i12;
                            if (i10 >= length2 || Intrinsics.compare((int) str.charAt(i10), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) >= 0) {
                                break;
                            }
                            i12 = i11 + 1;
                            bArr[i11] = (byte) str.charAt(i10);
                            i10++;
                        }
                    } else {
                        if (Intrinsics.compare((int) cCharAt3, RecyclerView.ItemAnimator.FLAG_MOVED) < 0) {
                            bArr[i11] = (byte) ((cCharAt3 >> 6) | JfifUtil.MARKER_SOFn);
                            i11 += 2;
                            bArr[i11 + 1] = (byte) ((cCharAt3 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i11] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i11 + 1] = (byte) (((cCharAt3 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            i11 += 3;
                            bArr[i11 + 2] = (byte) ((cCharAt3 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        } else if (Intrinsics.compare((int) cCharAt3, 56319) > 0 || length2 <= (i7 = i10 + 1) || 56320 > (cCharAt = str.charAt(i7)) || cCharAt >= 57344) {
                            bArr[i11] = 63;
                            i10++;
                            i11++;
                        } else {
                            int iCharAt = (str.charAt(i7) + (cCharAt3 << '\n')) - 56613888;
                            bArr[i11] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i11 + 1] = (byte) (((iCharAt >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            bArr[i11 + 2] = (byte) (((iCharAt >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            i11 += 4;
                            bArr[i11 + 3] = (byte) ((iCharAt & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            i10 += 2;
                        }
                        i10++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                return bArrCopyOf;
            }
            bArr[i10] = (byte) cCharAt2;
            i10++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    public static final int c(s sVar, int i7) {
        int i10;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        int[] iArr = sVar.f19607x;
        int i11 = i7 + 1;
        int length = sVar.f19606w.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (i13 <= i12) {
            i10 = (i13 + i12) >>> 1;
            int i14 = iArr[i10];
            if (i14 < i11) {
                i13 = i10 + 1;
            } else {
                if (i14 <= i11) {
                    if (i10 >= 0) {
                        return i10;
                    }
                    return ~i10;
                }
                i12 = i10 - 1;
            }
        }
        i10 = (-i13) - 1;
        if (i10 >= 0) {
            return i10;
        }
        return ~i10;
    }
}
