package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends xr.a implements xr.j {
    private static final long serialVersionUID = 5589976208326940032L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient boolean f16779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient y f16780e;

    public w(boolean z5, y yVar) {
        super(z5 ? "FIXED_DAY_PERIOD" : "APPROXIMATE_DAY_PERIOD");
        this.f16779d = z5;
        this.f16780e = yVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(7, this);
    }

    @Override // xr.d
    public final Object a() {
        if (this.f16779d) {
            return "pm";
        }
        y yVar = this.f16780e;
        return (String) yVar.f16794c.get((b1) yVar.f16794c.lastKey());
    }

    @Override // xr.j
    public final Object b(xr.e eVar, Object obj, boolean z5) {
        throw new IllegalArgumentException("Day period element cannot be set.");
    }

    @Override // xr.j
    public final Object c(xr.e eVar) {
        b1 b1Var = (b1) eVar.d(b1.M);
        if (this.f16779d) {
            return y.a(b1Var);
        }
        y yVar = y.f16791d;
        y yVar2 = this.f16780e;
        if (yVar2.c()) {
            Map mapD = y.d(yVar2.f16793b, yVar2.f16792a);
            String str = (b1Var.v() && b1Var.f16608d % 24 == 0) ? "midnight" : b1Var.compareTo(b1.x(12)) == 0 ? "noon" : null;
            if (str != null && mapD.containsKey(y.b(mapD, yr.i0.f23543e, yr.y.f23564d, str))) {
                return str;
            }
        }
        SortedMap sortedMap = yVar2.f16794c;
        if (b1Var.f16608d == 24) {
            b1Var = b1.J;
        }
        b1 b1Var2 = (b1) sortedMap.lastKey();
        for (b1 b1Var3 : sortedMap.keySet()) {
            if (b1Var.compareTo(b1Var3) == 0) {
                b1Var2 = b1Var3;
                break;
            }
            if (b1Var.compareTo(b1Var3) < 0) {
                break;
            }
            b1Var2 = b1Var3;
        }
        return (String) yVar2.f16794c.get(b1Var2);
    }

    @Override // xr.j
    public final Object d(xr.e eVar) {
        if (this.f16779d) {
            return "pm";
        }
        y yVar = this.f16780e;
        return (String) yVar.f16794c.get((b1) yVar.f16794c.lastKey());
    }

    @Override // xr.a
    public final xr.j f(xr.p pVar) {
        if (pVar.e(b1.M)) {
            return this;
        }
        return null;
    }

    @Override // xr.a
    public final boolean g(xr.a aVar) {
        return this.f16780e.equals(((w) aVar).f16780e);
    }

    @Override // xr.d
    public final Class getType() {
        return String.class;
    }

    @Override // xr.d
    public final boolean i() {
        return false;
    }

    @Override // xr.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(name());
        sb2.append('@');
        sb2.append(this.f16780e);
        return sb2.toString();
    }

    @Override // xr.d
    public final Object v() {
        if (this.f16779d) {
            return "am";
        }
        y yVar = this.f16780e;
        return (String) yVar.f16794c.get((b1) yVar.f16794c.firstKey());
    }

    @Override // xr.d
    public final boolean w() {
        return true;
    }
}
