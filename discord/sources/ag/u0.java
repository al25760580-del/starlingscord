package ag;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f583a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(u0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = t0.f580d;
        }
        f583a = comparator;
    }
}
