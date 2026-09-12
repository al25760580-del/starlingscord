package ke;

import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements gc.g {
    public static final String E;
    public static final String F;
    public static final String G;
    public static final io.sentry.react.b H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f14325x = new b(1, 2, 3, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f14326y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14328e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14329i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f14330v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14331w;

    static {
        int i7 = e0.f13788a;
        f14326y = Integer.toString(0, 36);
        E = Integer.toString(1, 36);
        F = Integer.toString(2, 36);
        G = Integer.toString(3, 36);
        H = new io.sentry.react.b(9);
    }

    public b(int i7, int i10, int i11, byte[] bArr) {
        this.f14327d = i7;
        this.f14328e = i10;
        this.f14329i = i11;
        this.f14330v = bArr;
    }

    public static String a(int i7) {
        if (i7 == -1) {
            return "Unset color transfer";
        }
        if (i7 == 10) {
            return "Gamma 2.2";
        }
        if (i7 == 1) {
            return "Linear";
        }
        if (i7 == 2) {
            return "sRGB";
        }
        if (i7 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i7 != 6) {
            return i7 != 7 ? "Undefined color transfer" : "HLG";
        }
        return "ST2084 PQ";
    }

    public static int b(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 4) {
            return 10;
        }
        if (i7 == 13) {
            return 2;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f14327d == bVar.f14327d && this.f14328e == bVar.f14328e && this.f14329i == bVar.f14329i && Arrays.equals(this.f14330v, bVar.f14330v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f14331w == 0) {
            this.f14331w = Arrays.hashCode(this.f14330v) + ((((((527 + this.f14327d) * 31) + this.f14328e) * 31) + this.f14329i) * 31);
        }
        return this.f14331w;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        int i7 = this.f14327d;
        if (i7 == -1) {
            str = "Unset color space";
        } else if (i7 == 6) {
            str = "BT2020";
        } else if (i7 != 1) {
            str = i7 != 2 ? "Undefined color space" : "BT601";
        } else {
            str = "BT709";
        }
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.f14328e;
        if (i10 == -1) {
            str2 = "Unset color range";
        } else if (i10 != 1) {
            str2 = i10 != 2 ? "Undefined color range" : "Limited range";
        } else {
            str2 = "Full range";
        }
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(a(this.f14329i));
        sb2.append(", ");
        return com.discord.chat.presentation.list.a.m(sb2, this.f14330v != null, ")");
    }
}
