package nd;

import android.net.Uri;
import gc.g;
import java.util.Arrays;
import je.e0;
import mc.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final q N;
    public final boolean E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16549e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16550i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Uri[] f16551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f16552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long[] f16553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f16554y;

    static {
        int i7 = e0.f13788a;
        F = Integer.toString(0, 36);
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = new q(12);
    }

    public a(long j, int i7, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j5, boolean z5) {
        je.b.g(iArr.length == uriArr.length);
        this.f16548d = j;
        this.f16549e = i7;
        this.f16550i = i10;
        this.f16552w = iArr;
        this.f16551v = uriArr;
        this.f16553x = jArr;
        this.f16554y = j5;
        this.E = z5;
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.f16552w;
            if (i11 >= iArr.length || this.E || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f16548d == aVar.f16548d && this.f16549e == aVar.f16549e && this.f16550i == aVar.f16550i && Arrays.equals(this.f16551v, aVar.f16551v) && Arrays.equals(this.f16552w, aVar.f16552w) && Arrays.equals(this.f16553x, aVar.f16553x) && this.f16554y == aVar.f16554y && this.E == aVar.E) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = ((this.f16549e * 31) + this.f16550i) * 31;
        long j = this.f16548d;
        int iHashCode = (Arrays.hashCode(this.f16553x) + ((Arrays.hashCode(this.f16552w) + ((((i7 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f16551v)) * 31)) * 31)) * 31;
        long j5 = this.f16554y;
        return ((iHashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.E ? 1 : 0);
    }
}
