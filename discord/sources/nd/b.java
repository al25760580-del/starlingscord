package nd;

import android.net.Uri;
import gc.g;
import java.util.Arrays;
import je.e0;
import mc.q;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements g {
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final q I;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f16555x = new b(new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f16556y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16558e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f16559i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f16560v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a[] f16561w;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.f16552w;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f16553x;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f16556y = new a(aVar.f16548d, 0, aVar.f16550i, iArrCopyOf, (Uri[]) Arrays.copyOf(aVar.f16551v, 0), jArrCopyOf, aVar.f16554y, aVar.E);
        int i7 = e0.f13788a;
        E = Integer.toString(1, 36);
        F = Integer.toString(2, 36);
        G = Integer.toString(3, 36);
        H = Integer.toString(4, 36);
        I = new q(11);
    }

    public b(a[] aVarArr, long j, long j5, int i7) {
        this.f16558e = j;
        this.f16559i = j5;
        this.f16557d = aVarArr.length + i7;
        this.f16561w = aVarArr;
        this.f16560v = i7;
    }

    public final a a(int i7) {
        int i10 = this.f16560v;
        return i7 < i10 ? f16556y : this.f16561w[i7 - i10];
    }

    public final boolean b(int i7) {
        if (i7 != this.f16557d - 1) {
            return false;
        }
        a aVarA = a(i7);
        return aVarA.E && aVarA.f16548d == Long.MIN_VALUE && aVarA.f16549e == -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i7 = e0.f13788a;
        return this.f16557d == bVar.f16557d && this.f16558e == bVar.f16558e && this.f16559i == bVar.f16559i && this.f16560v == bVar.f16560v && Arrays.equals(this.f16561w, bVar.f16561w);
    }

    public final int hashCode() {
        return (((((((this.f16557d * 961) + ((int) this.f16558e)) * 31) + ((int) this.f16559i)) * 31) + this.f16560v) * 31) + Arrays.hashCode(this.f16561w);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb2.append(this.f16558e);
        sb2.append(", adGroups=[");
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.f16561w;
            if (i7 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(aVarArr[i7].f16548d);
            sb2.append(", ads=[");
            for (int i10 = 0; i10 < aVarArr[i7].f16552w.length; i10++) {
                sb2.append("ad(state=");
                int i11 = aVarArr[i7].f16552w[i10];
                if (i11 == 0) {
                    sb2.append('_');
                } else if (i11 == 1) {
                    sb2.append('R');
                } else if (i11 == 2) {
                    sb2.append('S');
                } else if (i11 == 3) {
                    sb2.append('P');
                } else if (i11 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i7].f16553x[i10]);
                sb2.append(')');
                if (i10 < aVarArr[i7].f16552w.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i7 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i7++;
        }
    }
}
