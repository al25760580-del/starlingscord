package net.time4j;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 extends xr.b implements g0, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o1 f16685d = new o1();
    private static final long serialVersionUID = -4981215347844372171L;

    private Object readResolve() {
        return f16685d;
    }

    @Override // net.time4j.i0
    public final char a() {
        return 'Y';
    }

    @Override // xr.h
    public final boolean b() {
        return true;
    }

    @Override // xr.b
    public final xr.s c(xr.p pVar) {
        if (pVar.e(x0.J)) {
            return x1.f16789d;
        }
        return null;
    }

    @Override // xr.h
    public final double getLength() {
        m.f16667v.getClass();
        return 3.1556952E7d;
    }

    public final String toString() {
        return "WEEK_BASED_YEARS";
    }
}
