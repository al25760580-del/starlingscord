package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements xr.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f16591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16592e;

    public a1(j0 j0Var, long j) {
        this.f16591d = j0Var;
        this.f16592e = j;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    @Override // xr.j
    public final Object b(xr.e eVar, Object obj, boolean z5) {
        boolean z6;
        b1 b1Var = (b1) eVar;
        Long l6 = (Long) obj;
        if (l6 == null) {
            throw new IllegalArgumentException("Missing element value.");
        }
        j0 j0Var = this.f16591d;
        if (z5) {
            long jLongValue = l6.longValue();
            if (j0Var != b1.f16598b0) {
                long jP = b1.p(jLongValue, 86400000000000L);
                return (jP != 0 || jLongValue <= 0) ? b1.o(jP) : b1.K;
            }
            long jP2 = b1.p(jLongValue, 86400000000L);
            int i7 = b1Var.f16611v % 1000;
            return (jP2 == 0 && i7 == 0 && jLongValue > 0) ? b1.K : b1.n(i7, jP2);
        }
        if (l6 == null) {
            z6 = false;
        } else {
            j0 j0Var2 = this.f16591d;
            j0 j0Var3 = b1.f16598b0;
            long j = this.f16592e;
            if (!(j0Var2 == j0Var3 && l6.longValue() == j) ? !(0 > l6.longValue() || l6.longValue() > j) : b1Var.f16611v % 1000 == 0) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        if (z6) {
            long jLongValue2 = l6.longValue();
            return j0Var == b1.f16598b0 ? b1.n(b1Var.f16611v % 1000, jLongValue2) : b1.o(jLongValue2);
        }
        throw new IllegalArgumentException("Value out of range: " + l6);
    }

    @Override // xr.j
    public final Object c(xr.e eVar) {
        b1 b1Var = (b1) eVar;
        return Long.valueOf(this.f16591d == b1.f16598b0 ? b1.q(b1Var) / 1000 : b1.q(b1Var));
    }

    @Override // xr.j
    public final Object d(xr.e eVar) {
        b1 b1Var = (b1) eVar;
        j0 j0Var = this.f16591d;
        j0 j0Var2 = b1.f16598b0;
        long j = this.f16592e;
        return (j0Var != j0Var2 || b1Var.f16611v % 1000 == 0) ? Long.valueOf(j) : Long.valueOf(j - 1);
    }
}
