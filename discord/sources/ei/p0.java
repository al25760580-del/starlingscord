package ei;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends q0 implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p0 f8341e = new p0(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p0 f8342i = new p0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8343d;

    public /* synthetic */ p0(int i7) {
        this.f8343d = i7;
    }

    @Override // ei.q0
    public final q0 b() {
        switch (this.f8343d) {
            case 0:
                return f8342i;
            default:
                return f8341e;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8343d) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f8343d) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
