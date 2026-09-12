package hr;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f11105v;

    static {
        int i7 = k.f11113c;
        int i10 = k.f11114d;
        long j = k.f11115e;
        String str = k.f11111a;
        e eVar = new e();
        eVar.f11107i = new c(j, str, i7, i10);
        f11105v = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Default";
    }
}
