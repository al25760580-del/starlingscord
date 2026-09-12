package wp;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.e1;
import lq.t0;
import lq.z;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f22426e;

    public /* synthetic */ g(h hVar, int i7) {
        this.f22425d = i7;
        this.f22426e = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22425d) {
            case 0:
                t0 it = (t0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.c()) {
                    return "*";
                }
                z zVarB = it.b();
                Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
                String strX = this.f22426e.X(zVarB);
                if (it.a() == e1.INVARIANT) {
                    return strX;
                }
                return it.a() + ' ' + strX;
            default:
                z zVar = (z) obj;
                Intrinsics.checkNotNull(zVar);
                return this.f22426e.X(zVar);
        }
    }
}
