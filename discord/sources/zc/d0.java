package zc;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23692e;

    public d0(int i7, int i10) {
        this(Integer.MIN_VALUE, i7, i10);
    }

    public final void a() {
        int i7 = this.f23691d;
        this.f23691d = i7 == Integer.MIN_VALUE ? this.f23689b : i7 + this.f23690c;
        this.f23692e = this.f23688a + this.f23691d;
    }

    public final void b() {
        if (this.f23691d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public d0(int i7, int i10, int i11) {
        String str;
        if (i7 != Integer.MIN_VALUE) {
            str = i7 + "/";
        } else {
            str = "";
        }
        this.f23688a = str;
        this.f23689b = i10;
        this.f23690c = i11;
        this.f23691d = Integer.MIN_VALUE;
        this.f23692e = "";
    }
}
