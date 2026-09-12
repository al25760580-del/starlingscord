package hj;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f10889b = new o(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10890a;

    public /* synthetic */ o(int i7) {
        this.f10890a = i7;
    }

    @Override // hj.h0
    public final p0 a(Class cls) {
        switch (this.f10890a) {
            case 0:
                if (!r.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (p0) r.b(cls.asSubclass(r.class)).a(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // hj.h0
    public final boolean b(Class cls) {
        switch (this.f10890a) {
            case 0:
                return r.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
