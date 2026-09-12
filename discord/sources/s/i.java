package s;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f19633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19634b;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            int i7 = iVar.f19634b;
            int i10 = this.f19634b;
            if (i7 == i10) {
                long[] jArr = this.f19633a;
                long[] jArr2 = iVar.f19633a;
                IntRange intRangeI = lo.j.i(0, i10);
                int i11 = intRangeI.f14688d;
                int i12 = intRangeI.f14689e;
                if (i11 > i12) {
                    return true;
                }
                while (jArr[i11] == jArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f19633a;
        int i7 = this.f19634b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            iHashCode += Long.hashCode(jArr[i10]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f19633a;
        int i7 = this.f19634b;
        for (int i10 = 0; i10 < i7; i10++) {
            long j = jArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j);
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
