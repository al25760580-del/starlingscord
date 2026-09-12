package md;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements gc.g {
    public static final mc.q E;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f15725x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f15726y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15728e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15729i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Format[] f15730v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15731w;

    static {
        int i7 = je.e0.f13788a;
        f15725x = Integer.toString(0, 36);
        f15726y = Integer.toString(1, 36);
        E = new mc.q(3);
    }

    public x0(String str, Format... formatArr) {
        je.b.g(formatArr.length > 0);
        this.f15728e = str;
        this.f15730v = formatArr;
        this.f15727d = formatArr.length;
        int iH = je.o.h(formatArr[0].I);
        this.f15729i = iH == -1 ? je.o.h(formatArr[0].H) : iH;
        String str2 = formatArr[0].f5528i;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i7 = formatArr[0].f5530w | 16384;
        for (int i10 = 1; i10 < formatArr.length; i10++) {
            String str3 = formatArr[i10].f5528i;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", formatArr[0].f5528i, formatArr[i10].f5528i, i10);
                return;
            } else {
                if (i7 != (formatArr[i10].f5530w | 16384)) {
                    b("role flags", Integer.toBinaryString(formatArr[0].f5530w), Integer.toBinaryString(formatArr[i10].f5530w), i10);
                    return;
                }
            }
        }
    }

    public static void b(String str, String str2, String str3, int i7) {
        StringBuilder sbU = a3.e.u("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbU.append(str3);
        sbU.append("' (track ");
        sbU.append(i7);
        sbU.append(")");
        je.b.s("TrackGroup", "", new IllegalStateException(sbU.toString()));
    }

    public final int a(Format format) {
        int i7 = 0;
        while (true) {
            Format[] formatArr = this.f15730v;
            if (i7 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i7]) {
                return i7;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f15728e.equals(x0Var.f15728e) && Arrays.equals(this.f15730v, x0Var.f15730v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f15731w == 0) {
            this.f15731w = a3.e.d(527, 31, this.f15728e) + Arrays.hashCode(this.f15730v);
        }
        return this.f15731w;
    }
}
