package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements xr.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f16766e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Enum f16767i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f16768v;

    public u0(String str, Class cls, Enum r5, Enum r6, int i7) {
        this.f16765d = str;
        this.f16766e = cls;
        this.f16767i = r6;
        this.f16768v = i7;
    }

    public static u0 a(d0 d0Var) {
        return new u0(d0Var.name(), d0Var.f16621d, d0Var.f16622e, d0Var.f16623i, d0Var.f16624v);
    }

    @Override // xr.j
    public final Object b(xr.e eVar, Object obj, boolean z5) {
        x0 x0Var = (x0) eVar;
        Enum r5 = (Enum) obj;
        if (r5 == null) {
            throw new IllegalArgumentException("Missing element value.");
        }
        switch (this.f16768v) {
            case 101:
                int iA = ((s0) s0.class.cast(r5)).a();
                int i7 = x0Var.f16786d;
                return x0Var.f16787e == iA ? x0Var : x0.z(i7, iA, Math.min(xr.m.t(i7, iA), (int) x0Var.f16788i), true);
            case 102:
                p1 p1Var = (p1) p1.class.cast(r5);
                x0 x0Var2 = x0.f16782v;
                p1 p1VarW = x0Var.w();
                if (p1VarW == p1Var) {
                    return x0Var;
                }
                ga.k kVar = x0.V;
                return (x0) kVar.y(yk.a.A(kVar.x(x0Var), p1Var.a() - p1VarW.a()));
            case 103:
                return (x0) x0Var.l((((h1) h1.class.cast(r5)).ordinal() + 1) - (((x0Var.f16787e - 1) / 3) + 1), m.f16668w);
            default:
                throw new UnsupportedOperationException(this.f16765d);
        }
    }

    @Override // xr.j
    public final Object c(xr.e eVar) {
        Object objB;
        x0 x0Var = (x0) eVar;
        switch (this.f16768v) {
            case 101:
                objB = s0.b(x0Var.f16787e);
                break;
            case 102:
                objB = x0Var.w();
                break;
            case 103:
                int i7 = (x0Var.f16787e - 1) / 3;
                int i10 = i7 + 1;
                h1 h1Var = h1.f16642d;
                if (i10 < 1 || i10 > 4) {
                    throw new IllegalArgumentException(kk.b.h(i10, "Out of range: "));
                }
                objB = h1.f16644i[i7];
                break;
            default:
                throw new UnsupportedOperationException(this.f16765d);
        }
        return (Enum) this.f16766e.cast(objB);
    }

    @Override // xr.j
    public final Object d(xr.e eVar) {
        x0 x0Var = (x0) eVar;
        return (this.f16768v == 102 && x0Var.f16786d == 999999999 && x0Var.f16787e == 12 && x0Var.f16788i >= 27) ? (Enum) this.f16766e.cast(p1.f16691w) : this.f16767i;
    }
}
