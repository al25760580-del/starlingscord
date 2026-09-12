package ip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f13383e;

    public /* synthetic */ q(r rVar, int i7) {
        this.f13382d = i7;
        this.f13383e = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13382d) {
            case 0:
                r rVar = this.f13383e;
                np.f fVar = ((hp.a) rVar.F.f7980e).f10966l;
                String packageFqName = rVar.f23420x.f21262a.f21265a;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
                n0 n0Var = n0.f14659d;
                ArrayList arrayList = new ArrayList();
                n0Var.getClass();
                m0.f14658d.getClass();
                return w0.l(arrayList);
            case 1:
                this.f13383e.E.getClass();
                n0 n0Var2 = n0.f14659d;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(n0Var2, 10));
                ((m0) n0Var2.iterator()).getClass();
                return arrayList2;
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) io.sentry.config.a.H(this.f13383e.G, r.K[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    ap.b bVar = (ap.b) entry.getValue();
                    cq.b bVarC = cq.b.c(str);
                    Intrinsics.checkNotNullExpressionValue(bVarC, "byInternalName(...)");
                    gs.o oVar = bVar.f2857b;
                    op.a aVar = (op.a) oVar.f10247c;
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 2) {
                        map.put(bVarC, bVarC);
                    } else if (iOrdinal == 5) {
                        String str2 = (String) oVar.f10252h;
                        if (aVar != op.a.MULTIFILE_CLASS_PART) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            map.put(bVarC, cq.b.c(str2));
                        }
                    }
                }
                return map;
        }
    }
}
