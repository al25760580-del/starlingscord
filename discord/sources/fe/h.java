package fe;

import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements gc.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f9091v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f9092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f9093x;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f9095e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9096i;

    static {
        int i7 = e0.f13788a;
        f9091v = Integer.toString(0, 36);
        f9092w = Integer.toString(1, 36);
        f9093x = Integer.toString(2, 36);
    }

    public h(int i7, int i10, int[] iArr) {
        this.f9094d = i7;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.f9095e = iArrCopyOf;
        this.f9096i = i10;
        Arrays.sort(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f9094d == hVar.f9094d && Arrays.equals(this.f9095e, hVar.f9095e) && this.f9096i == hVar.f9096i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f9095e) + (this.f9094d * 31)) * 31) + this.f9096i;
    }
}
