package d0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f7558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i7) {
        super(1);
        this.f7557d = i7;
        this.f7558e = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7557d) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                p pVar = this.f7558e;
                return Double.valueOf(pVar.f7567m.invoke(lo.j.b(dDoubleValue, pVar.f7561e, pVar.f7562f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                p pVar2 = this.f7558e;
                return Double.valueOf(lo.j.b(pVar2.k.invoke(dDoubleValue2), pVar2.f7561e, pVar2.f7562f));
        }
    }
}
