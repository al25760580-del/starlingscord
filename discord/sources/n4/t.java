package n4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t implements c, o4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16488b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o4.i f16490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o4.i f16491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o4.i f16492f;

    public t(t4.b bVar, s4.p pVar) {
        this.f16487a = pVar.f19793e;
        this.f16489c = pVar.f19789a;
        o4.i iVarL0 = pVar.f19790b.l0();
        this.f16490d = iVarL0;
        o4.i iVarL1 = pVar.f19791c.l0();
        this.f16491e = iVarL1;
        o4.i iVarL2 = pVar.f19792d.l0();
        this.f16492f = iVarL2;
        bVar.e(iVarL0);
        bVar.e(iVarL1);
        bVar.e(iVarL2);
        iVarL0.a(this);
        iVarL1.a(this);
        iVarL2.a(this);
    }

    @Override // o4.a
    public final void a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16488b;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((o4.a) arrayList.get(i7)).a();
            i7++;
        }
    }

    public final void c(o4.a aVar) {
        this.f16488b.add(aVar);
    }

    @Override // n4.c
    public final void b(List list, List list2) {
    }
}
