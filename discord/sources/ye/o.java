package ye;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends UnsupportedOperationException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xe.d f23311d;

    public o(xe.d dVar) {
        this.f23311d = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f23311d));
    }
}
