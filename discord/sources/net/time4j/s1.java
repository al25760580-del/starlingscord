package net.time4j;

import java.io.InvalidObjectException;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends a {
    private static final long serialVersionUID = -5936254509996557266L;
    private final int category;
    final /* synthetic */ v1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(v1 v1Var, String str, int i7) {
        super(str);
        this.this$0 = v1Var;
        this.category = i7;
    }

    private Object readResolve() throws InvalidObjectException {
        v1 v1Var = this.this$0;
        int i7 = this.category;
        if (i7 == 0) {
            return v1Var.f16776w;
        }
        if (i7 == 1) {
            return v1Var.f16777x;
        }
        if (i7 == 2) {
            return v1Var.f16778y;
        }
        if (i7 == 3) {
            return v1Var.E;
        }
        throw new InvalidObjectException("Unknown category: " + this.category);
    }

    @Override // xr.d
    public final Object a() {
        return Integer.valueOf(m() ? 52 : 5);
    }

    @Override // xr.a
    public final xr.j f(xr.p pVar) {
        if (pVar.e(x0.J)) {
            return this.category >= 2 ? new r1(this, 0) : new r1(this, 1);
        }
        return null;
    }

    @Override // xr.a
    public final boolean g(xr.a aVar) {
        return this.this$0.equals(((s1) aVar).this$0);
    }

    @Override // xr.d
    public final Class getType() {
        return Integer.class;
    }

    @Override // xr.d
    public final boolean i() {
        return true;
    }

    @Override // xr.a
    public final xr.d j() {
        return x0.T;
    }

    public final boolean m() {
        return this.category % 2 == 0;
    }

    @Override // xr.d
    public final /* bridge */ /* synthetic */ Object v() {
        return 1;
    }

    @Override // xr.d
    public final boolean w() {
        return false;
    }
}
