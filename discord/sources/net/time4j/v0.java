package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements xr.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xr.d f16769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16770e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16771i;

    public v0(e0 e0Var) {
        this(e0Var.f16625d, e0Var);
    }

    public static int e(x0 x0Var) {
        int i7 = ((x0Var.f16787e - 1) / 3) + 1;
        if (i7 == 1) {
            return xr.m.A(x0Var.f16786d) ? 91 : 90;
        }
        return i7 == 2 ? 91 : 92;
    }

    public static int f(x0 x0Var) {
        int iT = xr.m.t(x0Var.f16786d, x0Var.f16787e);
        byte b10 = x0Var.f16788i;
        int i7 = 0;
        while (true) {
            int i10 = i7 + 1;
            if ((i10 * 7) + b10 > iT) {
                return ((((i7 * 7) + b10) - 1) / 7) + 1;
            }
            i7 = i10;
        }
    }

    public final int a(x0 x0Var) {
        switch (this.f16771i) {
            case 14:
                return x0Var.f16786d;
            case 15:
                return x0Var.f16787e;
            case 16:
                return x0Var.f16788i;
            case 17:
                return x0Var.x();
            case 18:
                return x0.q(x0Var);
            case 19:
                return ((x0Var.f16788i - 1) / 7) + 1;
            default:
                throw new UnsupportedOperationException(this.f16770e);
        }
    }

    @Override // xr.j
    public final Object b(xr.e eVar, Object obj, boolean z5) {
        x0 x0Var = (x0) eVar;
        Integer num = (Integer) obj;
        if (num == null) {
            throw new IllegalArgumentException("Missing element value.");
        }
        int iIntValue = num.intValue();
        if (z5) {
            return (x0) x0Var.l(yk.a.D(iIntValue, a(x0Var)), (g0) x0.W.b(this.f16769d));
        }
        switch (this.f16771i) {
            case 14:
                byte b10 = x0Var.f16787e;
                return x0Var.f16786d == iIntValue ? x0Var : x0.z(iIntValue, b10, Math.min(xr.m.t(iIntValue, b10), (int) x0Var.f16788i), true);
            case 15:
                int i7 = x0Var.f16786d;
                return x0Var.f16787e == iIntValue ? x0Var : x0.z(i7, iIntValue, Math.min(xr.m.t(i7, iIntValue), (int) x0Var.f16788i), true);
            case 16:
                return x0Var.f16788i == iIntValue ? x0Var : x0.z(x0Var.f16786d, x0Var.f16787e, iIntValue, true);
            case 17:
                return x0Var.x() == iIntValue ? x0Var : x0.y(x0Var.f16786d, iIntValue);
            case 18:
                if (iIntValue < 1 || iIntValue > e(x0Var)) {
                    throw new IllegalArgumentException(kk.b.h(iIntValue, "Out of range: "));
                }
                return (x0) x0Var.l(iIntValue - x0.q(x0Var), m.E);
            case 19:
                if (z5 || (iIntValue >= 1 && iIntValue <= f(x0Var))) {
                    return (x0) x0Var.l(iIntValue - (((x0Var.f16788i - 1) / 7) + 1), m.f16670y);
                }
                throw new IllegalArgumentException(kk.b.h(iIntValue, "Out of range: "));
            default:
                throw new UnsupportedOperationException(this.f16770e);
        }
    }

    @Override // xr.j
    public final Object c(xr.e eVar) {
        return Integer.valueOf(a((x0) eVar));
    }

    @Override // xr.j
    public final Object d(xr.e eVar) {
        x0 x0Var = (x0) eVar;
        switch (this.f16771i) {
            case 14:
                return x0.f16785y;
            case 15:
                return x0.E;
            case 16:
                return Integer.valueOf(xr.m.t(x0Var.f16786d, x0Var.f16787e));
            case 17:
                return xr.m.A(x0Var.f16786d) ? x0.G : x0.F;
            case 18:
                return Integer.valueOf(e(x0Var));
            case 19:
                return Integer.valueOf(f(x0Var));
            default:
                throw new UnsupportedOperationException(this.f16770e);
        }
    }

    public v0(int i7, xr.d dVar) {
        this.f16769d = dVar;
        this.f16770e = dVar.name();
        this.f16771i = i7;
    }
}
