package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class p implements k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f1922b = new p(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1923a;

    public /* synthetic */ p(int i7) {
        this.f1923a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final u0 a(Class cls) {
        switch (this.f1923a) {
            case 0:
                if (!s.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (u0) s.e(cls.asSubclass(s.class)).d(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final boolean b(Class cls) {
        switch (this.f1923a) {
            case 0:
                return s.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
