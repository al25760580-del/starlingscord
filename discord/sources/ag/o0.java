package ag;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f560h;

    /* JADX WARN: Illegal instructions before constructor call */
    public o0(String str, char[] cArr) {
        byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < cArr.length; i7++) {
            char c8 = cArr[i7];
            if (!(c8 < 128)) {
                throw new IllegalArgumentException(c.d("Non-ASCII character: %s", Character.valueOf(c8)));
            }
            if (!(bArr[c8] == -1)) {
                throw new IllegalArgumentException(c.d("Duplicate character: %s", Character.valueOf(c8)));
            }
            bArr[c8] = (byte) i7;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f560h == o0Var.f560h && Arrays.equals(this.f554b, o0Var.f554b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f554b) + (true != this.f560h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f553a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[LOOP:0: B:16:0x005d->B:18:0x0061, LOOP_END] */
    public o0(String str, char[] cArr, byte[] bArr, boolean z5) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        int i7;
        this.f553a = str;
        cArr.getClass();
        this.f554b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (s0.f576a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f556d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i10 = 1 << (3 - iNumberOfTrailingZeros);
                        this.f557e = i10;
                        this.f558f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.f555c = length - 1;
                        this.f559g = bArr;
                        zArr = new boolean[i10];
                        for (i7 = 0; i7 < this.f558f; i7++) {
                            int i11 = this.f556d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[c.a(i7 * 8, i11)] = true;
                        }
                        this.f560h = z5;
                        return;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f556d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i12 = 1 << (3 - iNumberOfTrailingZeros2);
                        this.f557e = i12;
                        this.f558f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                        this.f555c = length - 1;
                        this.f559g = bArr;
                        zArr = new boolean[i12];
                        while (i7 < this.f558f) {
                            int i13 = this.f556d;
                            RoundingMode roundingMode3 = RoundingMode.CEILING;
                            zArr[c.a(i7 * 8, i13)] = true;
                        }
                        this.f560h = z5;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                        this.f556d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i14 = 1 << (3 - iNumberOfTrailingZeros3);
                        this.f557e = i14;
                        this.f558f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                        this.f555c = length - 1;
                        this.f559g = bArr;
                        zArr = new boolean[i14];
                        while (i7 < this.f558f) {
                            int i15 = this.f556d;
                            RoundingMode roundingMode4 = RoundingMode.CEILING;
                            zArr[c.a(i7 * 8, i15)] = true;
                        }
                        this.f560h = z5;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(kk.b.h(cArr.length, "Illegal alphabet length "), e10);
        }
    }
}
