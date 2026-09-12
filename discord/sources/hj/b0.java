package hj;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0[] f10804a;

    @Override // hj.h0
    public final p0 a(Class cls) {
        for (h0 h0Var : this.f10804a) {
            if (h0Var.b(cls)) {
                return h0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // hj.h0
    public final boolean b(Class cls) {
        for (h0 h0Var : this.f10804a) {
            if (h0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
