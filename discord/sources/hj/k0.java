package hj;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f10870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f10871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f10872c;

    public k0(u0 u0Var, m mVar, b bVar) {
        this.f10871b = u0Var;
        mVar.getClass();
        this.f10872c = mVar;
        this.f10870a = bVar;
    }

    @Override // hj.q0
    public final void a(Object obj) {
        this.f10871b.getClass();
        t0 t0Var = ((r) obj).f10902c;
        if (t0Var.f10912d) {
            t0Var.f10912d = false;
        }
        this.f10872c.getClass();
        a3.e.x(obj);
        throw null;
    }

    @Override // hj.q0
    public final boolean b(Object obj) {
        this.f10872c.getClass();
        a3.e.x(obj);
        throw null;
    }

    @Override // hj.q0
    public final r c() {
        b bVar = this.f10870a;
        return bVar instanceof r ? ((r) bVar).f() : ((p) ((r) bVar).a(5)).a();
    }

    @Override // hj.q0
    public final void d(Object obj, Object obj2) {
        r0.a(this.f10871b, obj, obj2);
    }

    @Override // hj.q0
    public final int e(r rVar) {
        this.f10871b.getClass();
        return rVar.f10902c.hashCode();
    }

    @Override // hj.q0
    public final boolean f(r rVar, r rVar2) {
        this.f10871b.getClass();
        return rVar.f10902c.equals(rVar2.f10902c);
    }

    @Override // hj.q0
    public final void g(Object obj, androidx.datastore.preferences.protobuf.g gVar, l lVar) {
        this.f10871b.getClass();
        u0.a(obj);
        this.f10872c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
