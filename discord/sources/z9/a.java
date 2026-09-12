package z9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f23601b = {-1, -40, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f23602c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f23603d = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23604e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f23605f = ib.a.d("GIF87a");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f23606g = ib.a.d("GIF89a");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f23607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f23608i;
    public static final byte[] j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f23609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte[][] f23610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f23611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f23612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f23613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f23614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f23615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f23616s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23617a;

    static {
        byte[] bArrD = ib.a.d("BM");
        f23607h = bArrD;
        f23608i = bArrD.length;
        j = new byte[]{0, 0, 1, 0};
        k = 4;
        f23609l = ib.a.d("ftyp");
        f23610m = new byte[][]{ib.a.d("heic"), ib.a.d("heix"), ib.a.d("hevc"), ib.a.d("hevx"), ib.a.d("mif1"), ib.a.d("msf1")};
        f23611n = new byte[]{73, 73, 42, 0};
        f23612o = new byte[]{77, 77, 0, 42};
        f23613p = 4;
        f23614q = new byte[]{3, 0, 8, 0};
        f23615r = ib.a.d("ftyp");
        f23616s = ib.a.d("avif");
    }

    public a() {
        Integer num;
        Integer[] numArr = {21, 20, Integer.valueOf(f23602c), Integer.valueOf(f23604e), 6, Integer.valueOf(f23608i), Integer.valueOf(k), 12, 4, 12};
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        if (numArr.length == 0) {
            num = null;
        } else {
            Integer num2 = numArr[0];
            Intrinsics.checkNotNullParameter(numArr, "<this>");
            int i7 = 1;
            int length = numArr.length - 1;
            if (1 <= length) {
                while (true) {
                    Integer num3 = numArr[i7];
                    num2 = num2.compareTo(num3) < 0 ? num3 : num2;
                    if (i7 == length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            num = num2;
        }
        if (num == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f23617a = num.intValue();
    }
}
