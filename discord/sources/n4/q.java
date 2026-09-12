package n4;

import java.util.List;
import l4.v;

/* JADX INFO: loaded from: classes.dex */
public final class q implements o4.a, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o4.e f16473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s4.k f16474c;

    public q(v vVar, t4.b bVar, s4.j jVar) {
        this.f16472a = vVar;
        o4.e eVarL0 = jVar.f19763a.l0();
        this.f16473b = eVarL0;
        bVar.e(eVarL0);
        eVarL0.a(this);
    }

    public static int c(int i7, int i10) {
        int i11 = i7 / i10;
        if ((i7 ^ i10) < 0 && i11 * i10 != i7) {
            i11--;
        }
        return i7 - (i11 * i10);
    }

    @Override // o4.a
    public final void a() {
        this.f16472a.invalidateSelf();
    }

    @Override // n4.c
    public final void b(List list, List list2) {
    }
}
