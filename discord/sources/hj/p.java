package hj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f10894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f10895e;

    public p(r rVar) {
        this.f10894d = rVar;
        if (rVar.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f10895e = rVar.f();
    }

    public final r a() {
        if (!this.f10895e.e()) {
            return this.f10895e;
        }
        r rVar = this.f10895e;
        rVar.getClass();
        n0 n0Var = n0.f10886c;
        n0Var.getClass();
        n0Var.a(rVar.getClass()).a(rVar);
        rVar.f10901b &= Integer.MAX_VALUE;
        return this.f10895e;
    }

    public final Object clone() {
        p pVar = (p) this.f10894d.a(5);
        pVar.f10895e = a();
        return pVar;
    }
}
