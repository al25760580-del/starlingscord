package ag;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Exception {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f502e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f503d;

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f503d) {
            case 7:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, String str, Throwable th2) {
        super(str, th2);
        this.f503d = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i7) {
        super(str);
        this.f503d = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Throwable th2) {
        super(th2);
        this.f503d = 5;
    }
}
