package vo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements fq.e, n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0 f21821e = new o0(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o0 f21822i = new o0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21823d;

    public /* synthetic */ o0(int i7) {
        this.f21823d = i7;
    }

    @Override // fq.e
    public lq.z getType() {
        switch (this.f21823d) {
            case 2:
                throw new IllegalStateException("This method should not be called");
            case 3:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.f21823d) {
            case 7:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }

    @Override // vo.n0
    public void a() {
    }
}
