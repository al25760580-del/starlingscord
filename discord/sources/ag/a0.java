package ag;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends b0 implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f499e = new a0(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a0 f500i = new a0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f501d;

    public /* synthetic */ a0(int i7) {
        this.f501d = i7;
    }

    @Override // ag.b0
    public final b0 b() {
        switch (this.f501d) {
            case 0:
                return f500i;
            default:
                return f499e;
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f501d) {
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
        switch (this.f501d) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
