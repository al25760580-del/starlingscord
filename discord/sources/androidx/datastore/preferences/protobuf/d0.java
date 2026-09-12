package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k0[] f1834a;

    @Override // androidx.datastore.preferences.protobuf.k0
    public final u0 a(Class cls) {
        for (k0 k0Var : this.f1834a) {
            if (k0Var.b(cls)) {
                return k0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final boolean b(Class cls) {
        for (k0 k0Var : this.f1834a) {
            if (k0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
