package xr;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends a implements j {
    private static final long serialVersionUID = 4777240530511579802L;
    private final q max;
    private final q min;
    private final Class<q> type;

    public o(Class cls, q qVar, q qVar2) {
        super(cls.getName().concat("-AXIS"));
        this.type = cls;
        this.min = qVar;
        this.max = qVar2;
    }

    @Override // xr.d
    public final Object a() {
        return this.max;
    }

    @Override // xr.j
    public final Object b(e eVar, Object obj, boolean z5) {
        q qVar = (q) obj;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalArgumentException("Missing value.");
    }

    @Override // xr.j
    public final Object c(e eVar) {
        return (q) eVar;
    }

    @Override // xr.j
    public final Object d(e eVar) {
        return this.max;
    }

    @Override // xr.a
    public final j f(p pVar) {
        if (pVar.f23066d.equals(this.type)) {
            return this;
        }
        return null;
    }

    @Override // xr.d
    public final Class getType() {
        return this.type;
    }

    @Override // xr.d
    public final boolean i() {
        return false;
    }

    @Override // xr.a
    public final String k(p pVar) {
        return null;
    }

    @Override // xr.a
    public final boolean l() {
        return true;
    }

    @Override // xr.d
    public final Object v() {
        return this.min;
    }

    @Override // xr.d
    public final boolean w() {
        return false;
    }
}
