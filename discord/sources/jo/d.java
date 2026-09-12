package jo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final c f13988d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f13989e;

    static {
        Integer num = bo.a.f3330b;
        f13989e = (num == null || num.intValue() >= 34) ? new ko.a() : new b();
    }

    public abstract int a(int i7);

    public int b() {
        return a(32);
    }

    public int c(int i7, int i10) {
        int iB;
        int i11;
        int iA;
        if (i10 <= i7) {
            Integer from = Integer.valueOf(i7);
            Integer until = Integer.valueOf(i10);
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(until, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + from + ", " + until + ").").toString());
        }
        int i12 = i10 - i7;
        if (i12 > 0 || i12 == Integer.MIN_VALUE) {
            if (((-i12) & i12) == i12) {
                iA = a(31 - Integer.numberOfLeadingZeros(i12));
            } else {
                do {
                    iB = b() >>> 1;
                    i11 = iB % i12;
                } while ((i12 - 1) + (iB - i11) < 0);
                iA = i11;
            }
            return i7 + iA;
        }
        while (true) {
            int iB2 = b();
            if (i7 <= iB2 && iB2 < i10) {
                return iB2;
            }
        }
    }
}
