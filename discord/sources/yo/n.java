package yo;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f23457e;

    public /* synthetic */ n(o oVar, int i7) {
        this.f23456d = i7;
        this.f23457e = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23456d) {
            case 0:
                up.e eVar = (up.e) obj;
                if (eVar != null) {
                    o oVar = this.f23457e;
                    return oVar.j(eVar, oVar.i().c(eVar, dp.c.f7698x));
                }
                o.h(8);
                throw null;
            default:
                up.e eVar2 = (up.e) obj;
                if (eVar2 != null) {
                    o oVar2 = this.f23457e;
                    return oVar2.j(eVar2, oVar2.i().a(eVar2, dp.c.f7698x));
                }
                o.h(4);
                throw null;
        }
    }
}
