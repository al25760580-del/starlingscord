package kotlin.text;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import rn.d0;
import rn.e0;
import rn.i0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {
    public static final boolean a(String str) {
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (Intrinsics.compare((int) cCharAt, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    public static final byte b(String str) {
        rn.y yVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        rn.b0 b0VarD = d(str);
        if (b0VarD != null) {
            int i7 = b0VarD.f19462d;
            if (Integer.compare(Integer.MIN_VALUE ^ i7, -2147483393) > 0) {
                yVar = null;
            } else {
                yVar = new rn.y((byte) i7);
            }
        } else {
            yVar = null;
        }
        if (yVar != null) {
            return yVar.f19501d;
        }
        StringsKt__StringNumberConversionsKt.e(str);
        throw null;
    }

    public static final int c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        rn.b0 b0VarD = d(str);
        if (b0VarD != null) {
            return b0VarD.f19462d;
        }
        StringsKt__StringNumberConversionsKt.e(str);
        throw null;
    }

    public static final rn.b0 d(String str) {
        int i7;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i7 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i7 = 0;
        }
        rn.a0 a0Var = rn.b0.f19461e;
        int i11 = 119304647;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            int i12 = i10 ^ Integer.MIN_VALUE;
            if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                if (i11 != 119304647) {
                    return null;
                }
                i11 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i13 = i10 * 10;
            int i14 = iDigit + i13;
            if (Integer.compare(i14 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i7++;
            i10 = i14;
        }
        return new rn.b0(i10);
    }

    public static final long e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        e0 e0VarF = f(str);
        if (e0VarF != null) {
            return e0VarF.f19471d;
        }
        StringsKt__StringNumberConversionsKt.e(str);
        throw null;
    }

    public static final e0 f(String str) {
        int i7;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i10 = 10;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i11 = 1;
        if (Intrinsics.compare((int) cCharAt, 48) >= 0) {
            i7 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i7 = 1;
        }
        long j = 10;
        d0 d0Var = e0.f19470e;
        long j5 = 0;
        long j7 = 512409557603043100L;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), i10);
            if (iDigit < 0) {
                return null;
            }
            int i12 = length;
            long j10 = j5 ^ Long.MIN_VALUE;
            int i13 = i7;
            if (Long.compare(j10, j7 ^ Long.MIN_VALUE) <= 0) {
                j = j;
            } else {
                if (j7 != 512409557603043100L) {
                    return null;
                }
                if (j < 0) {
                    j7 = LongCompanionObject.MAX_VALUE < (j ^ Long.MIN_VALUE) ? 0L : 1L;
                } else {
                    long j11 = (LongCompanionObject.MAX_VALUE / j) << i11;
                    j7 = j11 + ((long) ((((-1) - (j11 * j)) ^ Long.MIN_VALUE) >= (j ^ Long.MIN_VALUE) ? i11 : 0));
                }
                if (Long.compare(j10, j7 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j12 = j5 * j;
            rn.a0 a0Var = rn.b0.f19461e;
            long j13 = (((long) iDigit) & 4294967295L) + j12;
            if (Long.compare(j13 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i7 = i13 + 1;
            j5 = j13;
            length = i12;
            j = j;
            i10 = 10;
            i11 = 1;
        }
        return new e0(j5);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    public static final short g(String str) {
        i0 i0Var;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        rn.b0 b0VarD = d(str);
        if (b0VarD != null) {
            int i7 = b0VarD.f19462d;
            if (Integer.compare(Integer.MIN_VALUE ^ i7, -2147418113) > 0) {
                i0Var = null;
            } else {
                i0Var = new i0((short) i7);
            }
        } else {
            i0Var = null;
        }
        if (i0Var != null) {
            return i0Var.f19475d;
        }
        StringsKt__StringNumberConversionsKt.e(str);
        throw null;
    }
}
