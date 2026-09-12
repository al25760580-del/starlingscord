package s0;

/* JADX INFO: loaded from: classes.dex */
public class i extends h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19681m;

    public i(q qVar) {
        super(qVar);
        if (qVar instanceof m) {
            this.f19675e = 2;
        } else {
            this.f19675e = 3;
        }
    }

    @Override // s0.h
    public final void d(int i7) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f19677g = i7;
        for (e eVar : this.k) {
            eVar.a(eVar);
        }
    }
}
