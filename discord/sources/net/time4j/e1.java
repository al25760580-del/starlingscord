package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends xr.q implements vr.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final xr.p f16628i;
    private static final long serialVersionUID = 7458380065762437714L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient x0 f16629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient b1 f16630e;

    static {
        e1 e1Var = new e1(x0.f16782v, b1.J);
        x0 x0Var = x0.f16783w;
        l1 l1Var = b1.L;
        e1 e1Var2 = new e1(x0Var, (b1) l1Var.a());
        HashMap map = new HashMap();
        u uVar = x0.J;
        map.put(uVar, l1Var);
        e0 e0Var = x0.K;
        e0 e0Var2 = x0.O;
        map.put(e0Var, e0Var2);
        x1 x1Var = x0.L;
        map.put(x1Var, v1.G.f16776w);
        d0 d0Var = x0.M;
        e0 e0Var3 = x0.S;
        map.put(d0Var, e0Var3);
        d0 d0Var2 = x0.N;
        e0 e0Var4 = x0.P;
        map.put(d0Var2, e0Var4);
        map.put(e0Var2, e0Var4);
        map.put(e0Var4, l1Var);
        d0 d0Var3 = x0.Q;
        map.put(d0Var3, l1Var);
        e0 e0Var5 = x0.R;
        map.put(e0Var5, l1Var);
        map.put(e0Var3, l1Var);
        q1 q1Var = x0.T;
        map.put(q1Var, l1Var);
        c cVar = b1.N;
        f0 f0Var = b1.Q;
        map.put(cVar, f0Var);
        f0 f0Var2 = b1.O;
        f0 f0Var3 = b1.T;
        map.put(f0Var2, f0Var3);
        f0 f0Var4 = b1.P;
        map.put(f0Var4, f0Var3);
        map.put(f0Var, f0Var3);
        f0 f0Var5 = b1.R;
        map.put(f0Var5, f0Var3);
        f0 f0Var6 = b1.S;
        map.put(f0Var6, f0Var3);
        f0 f0Var7 = b1.V;
        map.put(f0Var3, f0Var7);
        f0 f0Var8 = b1.U;
        map.put(f0Var8, f0Var7);
        f0 f0Var9 = b1.Z;
        map.put(f0Var7, f0Var9);
        f0 f0Var10 = b1.W;
        map.put(f0Var10, f0Var9);
        Collections.unmodifiableMap(map);
        xr.n nVar = new xr.n(i0.class, e1.class, new i8.c(13), e1Var, e1Var2, null);
        int i7 = 1;
        t1 t1Var = new t1(i7, uVar);
        k kVar = m.E;
        nVar.a(uVar, t1Var, kVar);
        nVar.a(e0Var, new t1(i7, e0Var), m.f16667v);
        nVar.a(x1Var, new t1(i7, x1Var), o1.f16685d);
        nVar.a(d0Var, new t1(i7, d0Var), m.f16668w);
        t1 t1Var2 = new t1(i7, d0Var2);
        i iVar = m.f16669x;
        nVar.a(d0Var2, t1Var2, iVar);
        nVar.a(e0Var2, new t1(i7, e0Var2), iVar);
        nVar.a(e0Var4, new t1(i7, e0Var4), kVar);
        nVar.a(d0Var3, new t1(i7, d0Var3), kVar);
        nVar.a(e0Var5, new t1(i7, e0Var5), kVar);
        nVar.a(e0Var3, new t1(i7, e0Var3), kVar);
        t1 t1Var3 = new t1(i7, q1Var);
        j jVar = m.f16670y;
        nVar.a(q1Var, t1Var3, jVar);
        nVar.b(l1Var, new t1(i7, l1Var));
        nVar.b(cVar, new t1(i7, cVar));
        t1 t1Var4 = new t1(i7, f0Var2);
        n nVar2 = t.f16710d;
        nVar.a(f0Var2, t1Var4, nVar2);
        nVar.a(f0Var4, new t1(i7, f0Var4), nVar2);
        nVar.a(f0Var, new t1(i7, f0Var), nVar2);
        nVar.a(f0Var5, new t1(i7, f0Var5), nVar2);
        nVar.a(f0Var6, new t1(i7, f0Var6), nVar2);
        t1 t1Var5 = new t1(i7, f0Var3);
        o oVar = t.f16711e;
        nVar.a(f0Var3, t1Var5, oVar);
        nVar.a(f0Var8, new t1(i7, f0Var8), oVar);
        t1 t1Var6 = new t1(i7, f0Var7);
        p pVar = t.f16712i;
        nVar.a(f0Var7, t1Var6, pVar);
        nVar.a(f0Var10, new t1(i7, f0Var10), pVar);
        f0 f0Var11 = b1.X;
        t1 t1Var7 = new t1(i7, f0Var11);
        q qVar = t.f16713v;
        nVar.a(f0Var11, t1Var7, qVar);
        f0 f0Var12 = b1.Y;
        t1 t1Var8 = new t1(i7, f0Var12);
        r rVar = t.f16714w;
        nVar.a(f0Var12, t1Var8, rVar);
        t1 t1Var9 = new t1(i7, f0Var9);
        s sVar = t.f16715x;
        nVar.a(f0Var9, t1Var9, sVar);
        f0 f0Var13 = b1.a0;
        nVar.a(f0Var13, new t1(i7, f0Var13), qVar);
        j0 j0Var = b1.f16598b0;
        nVar.a(j0Var, new t1(i7, j0Var), rVar);
        j0 j0Var2 = b1.f16599c0;
        nVar.a(j0Var2, new t1(i7, j0Var2), sVar);
        z zVar = b1.f16600d0;
        nVar.b(zVar, new d1(i7, zVar));
        z zVar2 = b1.f16601e0;
        nVar.b(zVar2, new d1(i7, zVar2));
        z zVar3 = b1.f16602f0;
        nVar.b(zVar3, new d1(i7, zVar3));
        f1 f1Var = b1.f16603g0;
        nVar.b(f1Var, new t1(i7, f1Var));
        EnumSet enumSetRange = EnumSet.range(m.f16664d, iVar);
        EnumSet enumSetRange2 = EnumSet.range(jVar, kVar);
        for (m mVar : m.values()) {
            xr.n nVar3 = nVar;
            nVar3.d(mVar, new c1(mVar), mVar.getLength(), mVar.compareTo(m.f16670y) < 0 ? enumSetRange : enumSetRange2);
            nVar = nVar3;
        }
        for (t tVar : t.values()) {
            nVar.d(tVar, new c1(tVar), tVar.getLength(), EnumSet.allOf(t.class));
        }
        Iterator it = x0.W.f23068i.iterator();
        while (it.hasNext()) {
            nVar.c((x) it.next());
        }
        Iterator it2 = b1.f16604i0.f23068i.iterator();
        while (it2.hasNext()) {
            nVar.c((x) it2.next());
        }
        f16628i = nVar.e();
        i0[] i0VarArr = {m.f16667v, m.f16669x, m.E, nVar2, oVar, pVar, sVar};
        char c8 = c0.f16614i;
        new b0(i0VarArr);
    }

    public e1(x0 x0Var, b1 b1Var) {
        if (b1Var.f16608d == 24) {
            this.f16629d = (x0) x0Var.l(1L, m.E);
            this.f16630e = b1.J;
        } else {
            if (x0Var == null) {
                throw new NullPointerException("Missing date.");
            }
            this.f16629d = x0Var;
            this.f16630e = b1Var;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(8, this);
    }

    @Override // vr.a
    public final int a() {
        return this.f16629d.f16786d;
    }

    @Override // vr.a
    public final int b() {
        return this.f16629d.f16787e;
    }

    @Override // vr.a
    public final int c() {
        return this.f16629d.f16788i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        x0 x0Var = e1Var.f16629d;
        x0 x0Var2 = this.f16629d;
        if (x0Var2.p(x0Var)) {
            return 1;
        }
        if (x0Var2.m(e1Var.f16629d) < 0) {
            return -1;
        }
        return this.f16630e.compareTo(e1Var.f16630e);
    }

    @Override // xr.e
    public final xr.p e() {
        return f16628i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            if (this.f16629d.equals(e1Var.f16629d) && this.f16630e.equals(e1Var.f16630e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16630e.hashCode() * 37) + (this.f16629d.hashCode() * 13);
    }

    @Override // xr.q
    public final int i(xr.q qVar) {
        e1 e1Var = (e1) qVar;
        x0 x0Var = e1Var.f16629d;
        x0 x0Var2 = this.f16629d;
        if (x0Var2.p(x0Var)) {
            return 1;
        }
        if (x0Var2.m(e1Var.f16629d) < 0) {
            return -1;
        }
        return this.f16630e.compareTo(e1Var.f16630e);
    }

    @Override // xr.q
    public final xr.p j() {
        return f16628i;
    }

    public final String toString() {
        return this.f16629d.toString() + this.f16630e.toString();
    }

    @Override // xr.e
    public final xr.e f() {
        return this;
    }
}
