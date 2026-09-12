package e2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.r f7870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e4.i f7871e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f7872i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.fragment.app.r rVar, e4.i iVar, Function2 function2) {
        super(1);
        this.f7870d = rVar;
        this.f7871e = iVar;
        this.f7872i = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        Throwable th2 = (Throwable) obj;
        this.f7870d.invoke(th2);
        cr.h hVar = (cr.h) this.f7871e.f7982v;
        hVar.l(th2, false);
        do {
            Object objA = cr.n.a(hVar.j());
            if (objA == null) {
                unit = null;
            } else {
                this.f7872i.invoke(objA, th2);
                unit = Unit.f14616a;
            }
        } while (unit != null);
        return Unit.f14616a;
    }
}
