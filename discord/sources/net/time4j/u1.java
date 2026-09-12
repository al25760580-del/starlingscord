package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends a {
    private static final long serialVersionUID = 1945670789283677398L;
    final /* synthetic */ v1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v1 v1Var) {
        super("LOCAL_DAY_OF_WEEK");
        this.this$0 = v1Var;
    }

    private Object readResolve() {
        return this.this$0.F;
    }

    @Override // xr.d
    public final Object a() {
        return this.this$0.f16772d.c();
    }

    @Override // xr.a, java.util.Comparator
    /* JADX INFO: renamed from: e */
    public final int compare(xr.e eVar, xr.e eVar2) {
        int iB = ((p1) eVar.d(this)).b(this.this$0);
        int iB2 = ((p1) eVar2.d(this)).b(this.this$0);
        if (iB < iB2) {
            return -1;
        }
        return iB == iB2 ? 0 : 1;
    }

    @Override // xr.a
    public final xr.j f(xr.p pVar) {
        if (pVar.e(x0.J)) {
            return new t1(0, this);
        }
        return null;
    }

    @Override // xr.a
    public final boolean g(xr.a aVar) {
        return this.this$0.equals(((u1) aVar).this$0);
    }

    @Override // xr.d
    public final Class getType() {
        return p1.class;
    }

    @Override // xr.d
    public final boolean i() {
        return true;
    }

    @Override // xr.a
    public final xr.d j() {
        return x0.Q;
    }

    @Override // xr.d
    public final Object v() {
        return this.this$0.f16772d;
    }

    @Override // xr.d
    public final boolean w() {
        return false;
    }
}
