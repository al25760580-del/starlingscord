package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f1926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f1927e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1928i = false;

    public q(s sVar) {
        this.f1926d = sVar;
        this.f1927e = (s) sVar.d(4);
    }

    public static void d(s sVar, s sVar2) {
        s0 s0Var = s0.f1930c;
        s0Var.getClass();
        s0Var.a(sVar.getClass()).f(sVar, sVar2);
    }

    public final s a() {
        s sVarB = b();
        if (sVarB.g()) {
            return sVarB;
        }
        throw new d1();
    }

    public final s b() {
        if (this.f1928i) {
            return this.f1927e;
        }
        s sVar = this.f1927e;
        sVar.getClass();
        s0 s0Var = s0.f1930c;
        s0Var.getClass();
        s0Var.a(sVar.getClass()).a(sVar);
        this.f1928i = true;
        return this.f1927e;
    }

    public final void c() {
        if (this.f1928i) {
            s sVar = (s) this.f1927e.d(4);
            d(sVar, this.f1927e);
            this.f1927e = sVar;
            this.f1928i = false;
        }
    }

    public final Object clone() {
        q qVar = (q) this.f1926d.d(5);
        s sVarB = b();
        qVar.c();
        d(qVar.f1927e, sVarB);
        return qVar;
    }
}
