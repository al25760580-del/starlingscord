package net.time4j;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends xr.b implements g0, Serializable {
    private static final long serialVersionUID = 1988843503875912054L;
    private final int policy;
    private final m unit;

    public t0(m mVar, int i7) {
        this.unit = mVar;
        this.policy = i7;
    }

    @Override // net.time4j.i0
    public final char a() {
        return (char) 0;
    }

    @Override // xr.h
    public final boolean b() {
        return true;
    }

    @Override // xr.b
    public final xr.s c(xr.p pVar) {
        if (pVar.e(x0.J)) {
            return new l(this.unit, this.policy);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (this.unit == t0Var.unit && this.policy == t0Var.policy) {
                return true;
            }
        }
        return false;
    }

    @Override // xr.h
    public final double getLength() {
        return this.unit.getLength();
    }

    public final int hashCode() {
        return (this.policy * 37) + (this.unit.hashCode() * 23);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.unit.a());
        sb2.append('-');
        switch (this.policy) {
            case 1:
                sb2.append("NEXT_VALID_DATE");
                break;
            case 2:
                sb2.append("END_OF_MONTH");
                break;
            case 3:
                sb2.append("CARRY_OVER");
                break;
            case 4:
                sb2.append("UNLESS_INVALID");
                break;
            case 5:
                sb2.append("KEEPING_LAST_DATE");
                break;
            case 6:
                sb2.append("JODA_METRIC");
                break;
            default:
                sb2.append("PREVIOUS_VALID_DATE");
                break;
        }
        return sb2.toString();
    }
}
