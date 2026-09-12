package ei;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends x {
    public static x f(int i7) {
        if (i7 < 0) {
            return x.f8384b;
        }
        return i7 > 0 ? x.f8385c : x.f8383a;
    }

    @Override // ei.x
    public final x a(int i7, int i10) {
        int i11;
        if (i7 < i10) {
            i11 = -1;
        } else {
            i11 = i7 > i10 ? 1 : 0;
        }
        return f(i11);
    }

    @Override // ei.x
    public final x b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // ei.x
    public final x c(boolean z5, boolean z6) {
        int i7;
        if (z5 == z6) {
            i7 = 0;
        } else {
            i7 = z5 ? 1 : -1;
        }
        return f(i7);
    }

    @Override // ei.x
    public final x d(boolean z5, boolean z6) {
        int i7;
        if (z6 == z5) {
            i7 = 0;
        } else {
            i7 = z6 ? 1 : -1;
        }
        return f(i7);
    }

    @Override // ei.x
    public final int e() {
        return 0;
    }
}
