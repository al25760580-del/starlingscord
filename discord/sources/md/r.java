package md;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15693e;

    public r(Object obj) {
        this(-1L, obj);
    }

    public final boolean a() {
        return this.f15690b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f15689a.equals(rVar.f15689a) && this.f15690b == rVar.f15690b && this.f15691c == rVar.f15691c && this.f15692d == rVar.f15692d && this.f15693e == rVar.f15693e;
    }

    public final int hashCode() {
        return ((((((((this.f15689a.hashCode() + 527) * 31) + this.f15690b) * 31) + this.f15691c) * 31) + ((int) this.f15692d)) * 31) + this.f15693e;
    }

    public r(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public r(r rVar) {
        this.f15689a = rVar.f15689a;
        this.f15690b = rVar.f15690b;
        this.f15691c = rVar.f15691c;
        this.f15692d = rVar.f15692d;
        this.f15693e = rVar.f15693e;
    }

    public r(Object obj, int i7, int i10, long j, int i11) {
        this.f15689a = obj;
        this.f15690b = i7;
        this.f15691c = i10;
        this.f15692d = j;
        this.f15693e = i11;
    }
}
